package com.bumptech.glide.load.engine.p061b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.engine.b.i */
public final class C1251i {
    /* renamed from: a */
    private final int f3962a;
    /* renamed from: b */
    private final int f3963b;
    /* renamed from: c */
    private final Context f3964c;
    /* renamed from: d */
    private final int f3965d;

    /* renamed from: com.bumptech.glide.load.engine.b.i$a */
    public static final class C1249a {
        /* renamed from: a */
        static final int f3953a = (VERSION.SDK_INT < 26 ? 4 : 1);
        /* renamed from: b */
        final Context f3954b;
        /* renamed from: c */
        ActivityManager f3955c;
        /* renamed from: d */
        C1250c f3956d;
        /* renamed from: e */
        float f3957e = 2.0f;
        /* renamed from: f */
        float f3958f = ((float) f3953a);
        /* renamed from: g */
        float f3959g = 0.4f;
        /* renamed from: h */
        float f3960h = 0.33f;
        /* renamed from: i */
        int f3961i = 4194304;

        public C1249a(Context context) {
            this.f3954b = context;
            this.f3955c = (ActivityManager) context.getSystemService("activity");
            this.f3956d = new C3473b(context.getResources().getDisplayMetrics());
            if (VERSION.SDK_INT >= 26 && C1251i.m5083a(this.f3955c) != null) {
                this.f3958f = null;
            }
        }

        /* renamed from: a */
        public C1251i m5078a() {
            return new C1251i(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b.i$c */
    interface C1250c {
        /* renamed from: a */
        int mo1027a();

        /* renamed from: b */
        int mo1028b();
    }

    /* renamed from: com.bumptech.glide.load.engine.b.i$b */
    private static final class C3473b implements C1250c {
        /* renamed from: a */
        private final DisplayMetrics f14437a;

        C3473b(DisplayMetrics displayMetrics) {
            this.f14437a = displayMetrics;
        }

        /* renamed from: a */
        public int mo1027a() {
            return this.f14437a.widthPixels;
        }

        /* renamed from: b */
        public int mo1028b() {
            return this.f14437a.heightPixels;
        }
    }

    C1251i(C1249a c1249a) {
        int i;
        this.f3964c = c1249a.f3954b;
        if (C1251i.m5083a(c1249a.f3955c)) {
            i = c1249a.f3961i / 2;
        } else {
            i = c1249a.f3961i;
        }
        this.f3965d = i;
        i = C1251i.m5081a(c1249a.f3955c, c1249a.f3959g, c1249a.f3960h);
        float a = (float) ((c1249a.f3956d.mo1027a() * c1249a.f3956d.mo1028b()) * 4);
        int round = Math.round(c1249a.f3958f * a);
        int round2 = Math.round(a * c1249a.f3957e);
        int i2 = i - this.f3965d;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f3963b = round2;
            this.f3962a = round;
        } else {
            a = ((float) i2) / (c1249a.f3958f + c1249a.f3957e);
            this.f3963b = Math.round(c1249a.f3957e * a);
            this.f3962a = Math.round(a * c1249a.f3958f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String str = "MemorySizeCalculator";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Calculation complete, Calculated memory cache size: ");
            stringBuilder.append(m5082a(this.f3963b));
            stringBuilder.append(", pool size: ");
            stringBuilder.append(m5082a(this.f3962a));
            stringBuilder.append(", byte array size: ");
            stringBuilder.append(m5082a(this.f3965d));
            stringBuilder.append(", memory class limited? ");
            stringBuilder.append(i3 > i);
            stringBuilder.append(", max size: ");
            stringBuilder.append(m5082a(i));
            stringBuilder.append(", memoryClass: ");
            stringBuilder.append(c1249a.f3955c.getMemoryClass());
            stringBuilder.append(", isLowMemoryDevice: ");
            stringBuilder.append(C1251i.m5083a(c1249a.f3955c));
            Log.d(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public int m5084a() {
        return this.f3963b;
    }

    /* renamed from: b */
    public int m5085b() {
        return this.f3962a;
    }

    /* renamed from: c */
    public int m5086c() {
        return this.f3965d;
    }

    /* renamed from: a */
    private static int m5081a(ActivityManager activityManager, float f, float f2) {
        float memoryClass = (float) ((activityManager.getMemoryClass() * 1024) * 1024);
        if (C1251i.m5083a(activityManager) != null) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: a */
    private String m5082a(int i) {
        return Formatter.formatFileSize(this.f3964c, (long) i);
    }

    @TargetApi(19)
    /* renamed from: a */
    static boolean m5083a(ActivityManager activityManager) {
        return VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : true;
    }
}
