package com.j256.ormlite.android.apptools;

import android.content.Context;
import android.content.res.Resources;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OpenHelperManager {
    private static final String HELPER_CLASS_RESOURCE_NAME = "open_helper_classname";
    private static volatile OrmLiteSqliteOpenHelper helper = null;
    private static Class<? extends OrmLiteSqliteOpenHelper> helperClass = null;
    private static int instanceCount = 0;
    private static Logger logger = LoggerFactory.getLogger(OpenHelperManager.class);
    private static boolean wasClosed = false;

    public static synchronized void setOpenHelperClass(Class<? extends OrmLiteSqliteOpenHelper> cls) {
        synchronized (OpenHelperManager.class) {
            if (cls == null) {
                helperClass = null;
            } else {
                innerSetHelperClass(cls);
            }
        }
    }

    public static synchronized void setHelper(OrmLiteSqliteOpenHelper ormLiteSqliteOpenHelper) {
        synchronized (OpenHelperManager.class) {
            helper = ormLiteSqliteOpenHelper;
        }
    }

    public static synchronized <T extends OrmLiteSqliteOpenHelper> T getHelper(Context context, Class<T> cls) {
        synchronized (OpenHelperManager.class) {
            if (cls != null) {
                innerSetHelperClass(cls);
                context = loadHelper(context, cls);
            } else {
                throw new IllegalArgumentException("openHelperClass argument is null");
            }
        }
        return context;
    }

    @Deprecated
    public static synchronized OrmLiteSqliteOpenHelper getHelper(Context context) {
        synchronized (OpenHelperManager.class) {
            if (helperClass == null) {
                if (context != null) {
                    innerSetHelperClass(lookupHelperClass(context.getApplicationContext(), context.getClass()));
                } else {
                    throw new IllegalArgumentException("context argument is null");
                }
            }
            context = loadHelper(context, helperClass);
        }
        return context;
    }

    @Deprecated
    public static void release() {
        releaseHelper();
    }

    public static synchronized void releaseHelper() {
        synchronized (OpenHelperManager.class) {
            instanceCount--;
            logger.trace("releasing helper {}, instance count = {}", helper, Integer.valueOf(instanceCount));
            if (instanceCount <= 0) {
                if (helper != null) {
                    logger.trace("zero instances, closing helper {}", helper);
                    helper.close();
                    helper = null;
                    wasClosed = true;
                }
                if (instanceCount < 0) {
                    logger.error("too many calls to release helper, instance count = {}", Integer.valueOf(instanceCount));
                }
            }
        }
    }

    private static void innerSetHelperClass(Class<? extends OrmLiteSqliteOpenHelper> cls) {
        if (cls == null) {
            throw new IllegalStateException("Helper class was trying to be reset to null");
        } else if (helperClass == null) {
            helperClass = cls;
        } else if (helperClass != cls) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Helper class was ");
            stringBuilder.append(helperClass);
            stringBuilder.append(" but is trying to be reset to ");
            stringBuilder.append(cls);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static <T extends OrmLiteSqliteOpenHelper> T loadHelper(Context context, Class<T> cls) {
        if (helper == null) {
            if (wasClosed) {
                logger.info("helper was already closed and is being re-opened");
            }
            if (context != null) {
                helper = constructHelper(context.getApplicationContext(), cls);
                logger.trace("zero instances, created helper {}", helper);
                BaseDaoImpl.clearAllInternalObjectCaches();
                DaoManager.clearDaoCache();
                instanceCount = null;
            } else {
                throw new IllegalArgumentException("context argument is null");
            }
        }
        instanceCount++;
        logger.trace("returning helper {}, instance count = {} ", helper, Integer.valueOf(instanceCount));
        return helper;
    }

    private static OrmLiteSqliteOpenHelper constructHelper(Context context, Class<? extends OrmLiteSqliteOpenHelper> cls) {
        StringBuilder stringBuilder;
        try {
            try {
                return (OrmLiteSqliteOpenHelper) cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            } catch (Context context2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Could not construct instance of helper class ");
                stringBuilder.append(cls);
                throw new IllegalStateException(stringBuilder.toString(), context2);
            }
        } catch (Context context22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not find public constructor that has a single (Context) argument for helper class ");
            stringBuilder.append(cls);
            throw new IllegalStateException(stringBuilder.toString(), context22);
        }
    }

    private static Class<? extends OrmLiteSqliteOpenHelper> lookupHelperClass(Context context, Class<?> cls) {
        Resources resources = context.getResources();
        context = resources.getIdentifier(HELPER_CLASS_RESOURCE_NAME, "string", context.getPackageName());
        if (context != null) {
            context = resources.getString(context);
            try {
                return Class.forName(context);
            } catch (Class<?> cls2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not create helper instance for class ");
                stringBuilder.append(context);
                throw new IllegalStateException(stringBuilder.toString(), cls2);
            }
        }
        for (context = cls2; context != null; context = context.getSuperclass()) {
            Type genericSuperclass = context.getGenericSuperclass();
            if (genericSuperclass != null) {
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    if (actualTypeArguments == null) {
                        continue;
                    } else if (actualTypeArguments.length != 0) {
                        for (Type type : actualTypeArguments) {
                            if (type instanceof Class) {
                                Class<? extends OrmLiteSqliteOpenHelper> cls3 = (Class) type;
                                if (OrmLiteSqliteOpenHelper.class.isAssignableFrom(cls3)) {
                                    return cls3;
                                }
                            }
                        }
                        continue;
                    }
                }
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Could not find OpenHelperClass because none of the generic parameters of class ");
        stringBuilder2.append(cls2);
        stringBuilder2.append(" extends OrmLiteSqliteOpenHelper.  You should use getHelper(Context, Class) instead.");
        throw new IllegalStateException(stringBuilder2.toString());
    }
}
