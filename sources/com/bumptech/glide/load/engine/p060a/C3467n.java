package com.bumptech.glide.load.engine.p060a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.bumptech.glide.p055g.C1180j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.a.n */
public class C3467n implements C1236l {
    /* renamed from: a */
    private static final Config[] f14419a;
    /* renamed from: b */
    private static final Config[] f14420b = f14419a;
    /* renamed from: c */
    private static final Config[] f14421c = new Config[]{Config.RGB_565};
    /* renamed from: d */
    private static final Config[] f14422d = new Config[]{Config.ARGB_4444};
    /* renamed from: e */
    private static final Config[] f14423e = new Config[]{Config.ALPHA_8};
    /* renamed from: f */
    private final C3466b f14424f = new C3466b();
    /* renamed from: g */
    private final C1234h<C3465a, Bitmap> f14425g = new C1234h();
    /* renamed from: h */
    private final Map<Config, NavigableMap<Integer, Integer>> f14426h = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.a.n$1 */
    static /* synthetic */ class C12381 {
        /* renamed from: a */
        static final /* synthetic */ int[] f3939a = new int[Config.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            f3939a = r0;
            r0 = f3939a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f3939a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f3939a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f3939a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.a.n.1.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a.n$a */
    static final class C3465a implements C1237m {
        /* renamed from: a */
        int f14416a;
        /* renamed from: b */
        private final C3466b f14417b;
        /* renamed from: c */
        private Config f14418c;

        public C3465a(C3466b c3466b) {
            this.f14417b = c3466b;
        }

        /* renamed from: a */
        public void m17626a(int i, Config config) {
            this.f14416a = i;
            this.f14418c = config;
        }

        /* renamed from: a */
        public void mo994a() {
            this.f14417b.m5029a(this);
        }

        public String toString() {
            return C3467n.m17630a(this.f14416a, this.f14418c);
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C3465a)) {
                return false;
            }
            C3465a c3465a = (C3465a) obj;
            if (this.f14416a == c3465a.f14416a && C1180j.m4898a(this.f14418c, c3465a.f14418c) != null) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (this.f14416a * 31) + (this.f14418c != null ? this.f14418c.hashCode() : 0);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a.n$b */
    static class C3466b extends C1231d<C3465a> {
        /* renamed from: b */
        protected /* synthetic */ C1237m mo995b() {
            return m17627a();
        }

        C3466b() {
        }

        /* renamed from: a */
        public C3465a m17628a(int i, Config config) {
            C3465a c3465a = (C3465a) m5031c();
            c3465a.m17626a(i, config);
            return c3465a;
        }

        /* renamed from: a */
        protected C3465a m17627a() {
            return new C3465a(this);
        }
    }

    static {
        Config[] configArr = new Config[]{Config.ARGB_8888, null};
        if (VERSION.SDK_INT >= 26) {
            configArr = (Config[]) Arrays.copyOf(configArr, configArr.length + 1);
            configArr[configArr.length - 1] = Config.RGBA_F16;
        }
        f14419a = configArr;
    }

    /* renamed from: a */
    public void mo998a(Bitmap bitmap) {
        C3465a a = this.f14424f.m17628a(C1180j.m4889a(bitmap), bitmap.getConfig());
        this.f14425g.m5046a(a, bitmap);
        bitmap = m17631a(bitmap.getConfig());
        Integer num = (Integer) bitmap.get(Integer.valueOf(a.f14416a));
        Integer valueOf = Integer.valueOf(a.f14416a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        bitmap.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: a */
    public Bitmap mo997a(int i, int i2, Config config) {
        C1237m b = m17633b(C1180j.m4887a(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f14425g.m5045a(b);
        if (bitmap != null) {
            m17632a(Integer.valueOf(b.f14416a), bitmap);
            bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        }
        return bitmap;
    }

    /* renamed from: b */
    private C3465a m17633b(int i, Config config) {
        C3465a a = this.f14424f.m17628a(i, config);
        Config[] b = C3467n.m17634b(config);
        int length = b.length;
        int i2 = 0;
        while (i2 < length) {
            Config config2 = b[i2];
            Integer num = (Integer) m17631a(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i2++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return a;
                        }
                    } else if (config2.equals(config) != 0) {
                        return a;
                    }
                }
                this.f14424f.m5029a(a);
                return this.f14424f.m17628a(num.intValue(), config2);
            }
        }
        return a;
    }

    /* renamed from: a */
    public Bitmap mo996a() {
        Bitmap bitmap = (Bitmap) this.f14425g.m5044a();
        if (bitmap != null) {
            m17632a(Integer.valueOf(C1180j.m4889a(bitmap)), bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    private void m17632a(Integer num, Bitmap bitmap) {
        NavigableMap a = m17631a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tried to decrement empty size, size: ");
            stringBuilder.append(num);
            stringBuilder.append(", removed: ");
            stringBuilder.append(mo1000b(bitmap));
            stringBuilder.append(", this: ");
            stringBuilder.append(this);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m17631a(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f14426h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.f14426h.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: b */
    public String mo1000b(Bitmap bitmap) {
        return C3467n.m17630a(C1180j.m4889a(bitmap), bitmap.getConfig());
    }

    /* renamed from: b */
    public String mo999b(int i, int i2, Config config) {
        return C3467n.m17630a(C1180j.m4887a(i, i2, config), config);
    }

    /* renamed from: c */
    public int mo1001c(Bitmap bitmap) {
        return C1180j.m4889a(bitmap);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.f14425g);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.f14426h.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.f14426h.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static String m17630a(int i, Config config) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("](");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static Config[] m17634b(Config config) {
        if (VERSION.SDK_INT >= 26 && Config.RGBA_F16.equals(config)) {
            return f14420b;
        }
        switch (C12381.f3939a[config.ordinal()]) {
            case 1:
                return f14419a;
            case 2:
                return f14421c;
            case 3:
                return f14422d;
            case 4:
                return f14423e;
            default:
                return new Config[]{config};
        }
    }
}
