package android.support.v4.p016e;

import java.util.Locale;

/* renamed from: android.support.v4.e.c */
public final class C0414c {
    /* renamed from: a */
    public static final C0412b f1400a = new C4433e(null, false);
    /* renamed from: b */
    public static final C0412b f1401b = new C4433e(null, true);
    /* renamed from: c */
    public static final C0412b f1402c = new C4433e(C3128b.f13230a, false);
    /* renamed from: d */
    public static final C0412b f1403d = new C4433e(C3128b.f13230a, true);
    /* renamed from: e */
    public static final C0412b f1404e = new C4433e(C3127a.f13227a, false);
    /* renamed from: f */
    public static final C0412b f1405f = C4434f.f18417a;

    /* renamed from: android.support.v4.e.c$c */
    private interface C0413c {
        /* renamed from: a */
        int mo327a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: android.support.v4.e.c$a */
    private static class C3127a implements C0413c {
        /* renamed from: a */
        static final C3127a f13227a = new C3127a(true);
        /* renamed from: b */
        static final C3127a f13228b = new C3127a(false);
        /* renamed from: c */
        private final boolean f13229c;

        /* renamed from: a */
        public int mo327a(CharSequence charSequence, int i, int i2) {
            i2 += i;
            Object obj = null;
            while (i < i2) {
                switch (C0414c.m1514a(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (this.f13229c) {
                            return 0;
                        }
                        break;
                    case 1:
                        if (!this.f13229c) {
                            return 1;
                        }
                        break;
                    default:
                        continue;
                }
                obj = 1;
                i++;
            }
            return obj != null ? this.f13229c : 2;
        }

        private C3127a(boolean z) {
            this.f13229c = z;
        }
    }

    /* renamed from: android.support.v4.e.c$b */
    private static class C3128b implements C0413c {
        /* renamed from: a */
        static final C3128b f13230a = new C3128b();

        /* renamed from: a */
        public int mo327a(CharSequence charSequence, int i, int i2) {
            i2 += i;
            int i3 = 2;
            while (i < i2 && i3 == 2) {
                i3 = C0414c.m1515b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i3;
        }

        private C3128b() {
        }
    }

    /* renamed from: android.support.v4.e.c$d */
    private static abstract class C3129d implements C0412b {
        /* renamed from: a */
        private final C0413c f13231a;

        /* renamed from: a */
        protected abstract boolean mo3764a();

        C3129d(C0413c c0413c) {
            this.f13231a = c0413c;
        }

        /* renamed from: a */
        public boolean mo328a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f13231a == null) {
                return mo3764a();
            } else {
                return m15596b(charSequence, i, i2);
            }
        }

        /* renamed from: b */
        private boolean m15596b(CharSequence charSequence, int i, int i2) {
            switch (this.f13231a.mo327a(charSequence, i, i2)) {
                case null:
                    return true;
                case 1:
                    return null;
                default:
                    return mo3764a();
            }
        }
    }

    /* renamed from: android.support.v4.e.c$e */
    private static class C4433e extends C3129d {
        /* renamed from: a */
        private final boolean f18416a;

        C4433e(C0413c c0413c, boolean z) {
            super(c0413c);
            this.f18416a = z;
        }

        /* renamed from: a */
        protected boolean mo3764a() {
            return this.f18416a;
        }
    }

    /* renamed from: android.support.v4.e.c$f */
    private static class C4434f extends C3129d {
        /* renamed from: a */
        static final C4434f f18417a = new C4434f();

        C4434f() {
            super(null);
        }

        /* renamed from: a */
        protected boolean mo3764a() {
            return C0415d.m1516a(Locale.getDefault()) == 1;
        }
    }

    /* renamed from: a */
    static int m1514a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    static int m1515b(int r0) {
        /*
        switch(r0) {
            case 0: goto L_0x000a;
            case 1: goto L_0x0008;
            case 2: goto L_0x0008;
            default: goto L_0x0003;
        };
    L_0x0003:
        switch(r0) {
            case 14: goto L_0x000a;
            case 15: goto L_0x000a;
            case 16: goto L_0x0008;
            case 17: goto L_0x0008;
            default: goto L_0x0006;
        };
    L_0x0006:
        r0 = 2;
        return r0;
    L_0x0008:
        r0 = 0;
        return r0;
    L_0x000a:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.c.b(int):int");
    }
}
