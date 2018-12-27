package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import com.airbnb.lottie.model.C0991g;
import com.airbnb.lottie.network.C1000b;
import com.airbnb.lottie.p035c.C0944t;
import com.airbnb.lottie.p036d.C0954f;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.e */
public class C0963e {
    /* renamed from: a */
    private static final Map<String, C0973k<C0955d>> f3186a = new HashMap();

    /* renamed from: a */
    public static C0973k<C0955d> m4143a(Context context, String str) {
        return C1000b.m4311a(context, str);
    }

    /* renamed from: b */
    public static C0973k<C0955d> m4151b(Context context, final String str) {
        context = context.getApplicationContext();
        return C0963e.m4145a(str, new Callable<C0970j<C0955d>>() {
            public /* synthetic */ Object call() {
                return m4125a();
            }

            /* renamed from: a */
            public C0970j<C0955d> m4125a() {
                return C0963e.m4152c(context, str);
            }
        });
    }

    /* renamed from: c */
    public static C0970j<C0955d> m4152c(Context context, String str) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("asset_");
            stringBuilder.append(str);
            String stringBuilder2 = stringBuilder.toString();
            if (str.endsWith(".zip")) {
                return C0963e.m4141a(new ZipInputStream(context.getAssets().open(str)), stringBuilder2);
            }
            return C0963e.m4139a(context.getAssets().open(str), stringBuilder2);
        } catch (Throwable e) {
            return new C0970j(e);
        }
    }

    /* renamed from: a */
    public static C0973k<C0955d> m4142a(Context context, final int i) {
        context = context.getApplicationContext();
        return C0963e.m4145a(C0963e.m4146a(i), new Callable<C0970j<C0955d>>() {
            public /* synthetic */ Object call() {
                return m4126a();
            }

            /* renamed from: a */
            public C0970j<C0955d> m4126a() {
                return C0963e.m4148b(context, i);
            }
        });
    }

    /* renamed from: b */
    public static C0970j<C0955d> m4148b(Context context, int i) {
        try {
            return C0963e.m4139a(context.getResources().openRawResource(i), C0963e.m4146a(i));
        } catch (Throwable e) {
            return new C0970j(e);
        }
    }

    /* renamed from: a */
    private static String m4146a(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rawRes_");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static C0970j<C0955d> m4139a(InputStream inputStream, String str) {
        return C0963e.m4140a(inputStream, str, true);
    }

    /* renamed from: a */
    private static C0970j<C0955d> m4140a(InputStream inputStream, String str, boolean z) {
        try {
            str = C0963e.m4149b(new JsonReader(new InputStreamReader(inputStream)), str);
            return str;
        } finally {
            if (z) {
                C0954f.m4107a((Closeable) inputStream);
            }
        }
    }

    /* renamed from: a */
    public static C0973k<C0955d> m4144a(final JsonReader jsonReader, final String str) {
        return C0963e.m4145a(str, new Callable<C0970j<C0955d>>() {
            public /* synthetic */ Object call() {
                return m4127a();
            }

            /* renamed from: a */
            public C0970j<C0955d> m4127a() {
                return C0963e.m4149b(jsonReader, str);
            }
        });
    }

    /* renamed from: b */
    public static C0970j<C0955d> m4149b(JsonReader jsonReader, String str) {
        try {
            Object a = C0944t.m4067a(jsonReader);
            C0991g.m4275a().m4279a(str, (C0955d) a);
            return new C0970j(a);
        } catch (Throwable e) {
            return new C0970j(e);
        }
    }

    /* renamed from: a */
    public static C0970j<C0955d> m4141a(ZipInputStream zipInputStream, String str) {
        try {
            str = C0963e.m4150b(zipInputStream, str);
            return str;
        } finally {
            C0954f.m4107a((Closeable) zipInputStream);
        }
    }

    /* renamed from: b */
    private static C0970j<C0955d> m4150b(ZipInputStream zipInputStream, String str) {
        Map hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            Object obj = null;
            while (nextEntry != null) {
                if (nextEntry.getName().contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    obj = (C0955d) C0963e.m4140a(zipInputStream, str, false).m4210a();
                } else if (nextEntry.getName().contains(".png")) {
                    String[] split = nextEntry.getName().split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (obj == null) {
                return new C0970j(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Entry entry : hashMap.entrySet()) {
                C0967g a = C0963e.m4138a((C0955d) obj, (String) entry.getKey());
                if (a != null) {
                    a.m4206a((Bitmap) entry.getValue());
                }
            }
            for (Entry entry2 : obj.m4123j().entrySet()) {
                if (((C0967g) entry2.getValue()).m4208c() == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("There is no image for ");
                    stringBuilder.append(((C0967g) entry2.getValue()).m4207b());
                    return new C0970j(new IllegalStateException(stringBuilder.toString()));
                }
            }
            C0991g.m4275a().m4279a(str, (C0955d) obj);
            return new C0970j(obj);
        } catch (Throwable e) {
            return new C0970j(e);
        }
    }

    /* renamed from: a */
    private static C0967g m4138a(C0955d c0955d, String str) {
        for (C0967g c0967g : c0955d.m4123j().values()) {
            if (c0967g.m4207b().equals(str)) {
                return c0967g;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C0973k<C0955d> m4145a(final String str, Callable<C0970j<C0955d>> callable) {
        if (f3186a.containsKey(str)) {
            return (C0973k) f3186a.get(str);
        }
        C0973k<C0955d> c0973k = new C0973k(callable);
        c0973k.m4225a(new C0968h<C0955d>() {
            /* renamed from: a */
            public void m17011a(C0955d c0955d) {
                C0963e.f3186a.remove(str);
            }
        });
        c0973k.m4227c(new C0968h<Throwable>() {
            /* renamed from: a */
            public void m17014a(Throwable th) {
                C0963e.f3186a.remove(str);
            }
        });
        f3186a.put(str, c0973k);
        return c0973k;
    }
}
