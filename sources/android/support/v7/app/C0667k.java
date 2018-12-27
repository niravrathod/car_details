package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.k */
class C0667k {
    /* renamed from: a */
    private static Field f2159a;
    /* renamed from: b */
    private static boolean f2160b;
    /* renamed from: c */
    private static Class f2161c;
    /* renamed from: d */
    private static boolean f2162d;
    /* renamed from: e */
    private static Field f2163e;
    /* renamed from: f */
    private static boolean f2164f;
    /* renamed from: g */
    private static Field f2165g;
    /* renamed from: h */
    private static boolean f2166h;

    /* renamed from: a */
    static boolean m2682a(Resources resources) {
        if (VERSION.SDK_INT >= 24) {
            return C0667k.m2686d(resources);
        }
        if (VERSION.SDK_INT >= 23) {
            return C0667k.m2685c(resources);
        }
        return VERSION.SDK_INT >= 21 ? C0667k.m2684b(resources) : null;
    }

    /* renamed from: b */
    private static boolean m2684b(Resources resources) {
        if (!f2160b) {
            try {
                f2159a = Resources.class.getDeclaredField("mDrawableCache");
                f2159a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2160b = true;
        }
        if (f2159a != null) {
            try {
                resources = (Map) f2159a.get(resources);
            } catch (Resources resources2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", resources2);
                resources2 = null;
            }
            if (resources2 != null) {
                resources2.clear();
                return true;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m2685c(Resources resources) {
        Object obj;
        boolean z;
        if (!f2160b) {
            try {
                f2159a = Resources.class.getDeclaredField("mDrawableCache");
                f2159a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2160b = true;
        }
        if (f2159a != null) {
            try {
                obj = f2159a.get(resources);
            } catch (Resources resources2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", resources2);
            }
            z = false;
            if (obj == null) {
                return false;
            }
            if (!(obj == null || C0667k.m2683a(obj) == null)) {
                z = true;
            }
            return z;
        }
        obj = null;
        z = false;
        if (obj == null) {
            return false;
        }
        z = true;
        return z;
    }

    /* renamed from: d */
    private static boolean m2686d(Resources resources) {
        boolean z = true;
        if (!f2166h) {
            try {
                f2165g = Resources.class.getDeclaredField("mResourcesImpl");
                f2165g.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2166h = true;
        }
        if (f2165g == null) {
            return false;
        }
        try {
            resources = f2165g.get(resources);
        } catch (Resources resources2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", resources2);
            resources2 = null;
        }
        if (resources2 == null) {
            return false;
        }
        Object obj;
        if (!f2160b) {
            try {
                f2159a = resources2.getClass().getDeclaredField("mDrawableCache");
                f2159a.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e2);
            }
            f2160b = true;
        }
        if (f2159a != null) {
            try {
                obj = f2159a.get(resources2);
            } catch (Resources resources22) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", resources22);
            }
            if (obj != null || C0667k.m2683a(obj) == null) {
                z = false;
            }
            return z;
        }
        obj = null;
        if (obj != null) {
        }
        z = false;
        return z;
    }

    /* renamed from: a */
    private static boolean m2683a(Object obj) {
        if (!f2162d) {
            try {
                f2161c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2162d = true;
        }
        if (f2161c == null) {
            return false;
        }
        if (!f2164f) {
            try {
                f2163e = f2161c.getDeclaredField("mUnthemedEntries");
                f2163e.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2164f = true;
        }
        if (f2163e == null) {
            return false;
        }
        try {
            obj = (LongSparseArray) f2163e.get(obj);
        } catch (Object obj2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", obj2);
            obj2 = null;
        }
        if (obj2 == null) {
            return false;
        }
        obj2.clear();
        return true;
    }
}
