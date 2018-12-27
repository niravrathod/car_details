package com.google.android.exoplayer2.text.p135f;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.google.android.exoplayer2.text.C2333a;

/* renamed from: com.google.android.exoplayer2.text.f.e */
final class C4049e extends C2333a {
    /* renamed from: m */
    public final long f16277m;
    /* renamed from: n */
    public final long f16278n;

    /* renamed from: com.google.android.exoplayer2.text.f.e$1 */
    static /* synthetic */ class C23511 {
        /* renamed from: a */
        static final /* synthetic */ int[] f7473a = new int[Alignment.values().length];

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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = android.text.Layout.Alignment.values();
            r0 = r0.length;
            r0 = new int[r0];
            f7473a = r0;
            r0 = f7473a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.text.Layout.Alignment.ALIGN_NORMAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f7473a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.text.Layout.Alignment.ALIGN_CENTER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f7473a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.f.e.1.<clinit>():void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.f.e$a */
    public static final class C2352a {
        /* renamed from: a */
        private long f7474a;
        /* renamed from: b */
        private long f7475b;
        /* renamed from: c */
        private SpannableStringBuilder f7476c;
        /* renamed from: d */
        private Alignment f7477d;
        /* renamed from: e */
        private float f7478e;
        /* renamed from: f */
        private int f7479f;
        /* renamed from: g */
        private int f7480g;
        /* renamed from: h */
        private float f7481h;
        /* renamed from: i */
        private int f7482i;
        /* renamed from: j */
        private float f7483j;

        public C2352a() {
            m8636a();
        }

        /* renamed from: a */
        public void m8636a() {
            this.f7474a = 0;
            this.f7475b = 0;
            this.f7476c = null;
            this.f7477d = null;
            this.f7478e = Float.MIN_VALUE;
            this.f7479f = Integer.MIN_VALUE;
            this.f7480g = Integer.MIN_VALUE;
            this.f7481h = Float.MIN_VALUE;
            this.f7482i = Integer.MIN_VALUE;
            this.f7483j = Float.MIN_VALUE;
        }

        /* renamed from: b */
        public C4049e m8640b() {
            if (this.f7481h != Float.MIN_VALUE && this.f7482i == Integer.MIN_VALUE) {
                m8630c();
            }
            return new C4049e(this.f7474a, this.f7475b, this.f7476c, this.f7477d, this.f7478e, this.f7479f, this.f7480g, this.f7481h, this.f7482i, this.f7483j);
        }

        /* renamed from: a */
        public C2352a m8633a(long j) {
            this.f7474a = j;
            return this;
        }

        /* renamed from: b */
        public C2352a m8639b(long j) {
            this.f7475b = j;
            return this;
        }

        /* renamed from: a */
        public C2352a m8635a(SpannableStringBuilder spannableStringBuilder) {
            this.f7476c = spannableStringBuilder;
            return this;
        }

        /* renamed from: a */
        public C2352a m8634a(Alignment alignment) {
            this.f7477d = alignment;
            return this;
        }

        /* renamed from: a */
        public C2352a m8631a(float f) {
            this.f7478e = f;
            return this;
        }

        /* renamed from: a */
        public C2352a m8632a(int i) {
            this.f7479f = i;
            return this;
        }

        /* renamed from: b */
        public C2352a m8638b(int i) {
            this.f7480g = i;
            return this;
        }

        /* renamed from: b */
        public C2352a m8637b(float f) {
            this.f7481h = f;
            return this;
        }

        /* renamed from: c */
        public C2352a m8642c(int i) {
            this.f7482i = i;
            return this;
        }

        /* renamed from: c */
        public C2352a m8641c(float f) {
            this.f7483j = f;
            return this;
        }

        /* renamed from: c */
        private C2352a m8630c() {
            if (this.f7477d != null) {
                switch (C23511.f7473a[this.f7477d.ordinal()]) {
                    case 1:
                        this.f7482i = 0;
                        break;
                    case 2:
                        this.f7482i = 1;
                        break;
                    case 3:
                        this.f7482i = 2;
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unrecognized alignment: ");
                        stringBuilder.append(this.f7477d);
                        Log.w("WebvttCueBuilder", stringBuilder.toString());
                        this.f7482i = 0;
                        break;
                }
            }
            this.f7482i = Integer.MIN_VALUE;
            return this;
        }
    }

    public C4049e(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    public C4049e(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C4049e(long j, long j2, CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f16277m = j;
        this.f16278n = j2;
    }

    /* renamed from: a */
    public boolean m20314a() {
        return this.d == Float.MIN_VALUE && this.g == Float.MIN_VALUE;
    }
}
