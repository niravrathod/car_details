package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.transition.C3082b.C0274a;
import android.support.transition.Transition.C0262c;
import android.support.v4.content.p014a.C0388c;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public abstract class Visibility extends Transition {
    /* renamed from: g */
    private static final String[] f13065g = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    /* renamed from: h */
    private int f13066h = 3;

    /* renamed from: android.support.transition.Visibility$b */
    private static class C0264b {
        /* renamed from: a */
        boolean f966a;
        /* renamed from: b */
        boolean f967b;
        /* renamed from: c */
        int f968c;
        /* renamed from: d */
        int f969d;
        /* renamed from: e */
        ViewGroup f970e;
        /* renamed from: f */
        ViewGroup f971f;

        private C0264b() {
        }
    }

    /* renamed from: android.support.transition.Visibility$a */
    private static class C3081a extends AnimatorListenerAdapter implements C0262c, C0274a {
        /* renamed from: a */
        boolean f13059a = false;
        /* renamed from: b */
        private final View f13060b;
        /* renamed from: c */
        private final int f13061c;
        /* renamed from: d */
        private final ViewGroup f13062d;
        /* renamed from: e */
        private final boolean f13063e;
        /* renamed from: f */
        private boolean f13064f;

        /* renamed from: d */
        public void mo178d(Transition transition) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        C3081a(View view, int i, boolean z) {
            this.f13060b = view;
            this.f13061c = i;
            this.f13062d = (ViewGroup) view.getParent();
            this.f13063e = z;
            m15209a(true);
        }

        public void onAnimationPause(Animator animator) {
            if (this.f13059a == null) {
                au.m1004a(this.f13060b, this.f13061c);
            }
        }

        public void onAnimationResume(Animator animator) {
            if (this.f13059a == null) {
                au.m1004a(this.f13060b, 0);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f13059a = true;
        }

        public void onAnimationEnd(Animator animator) {
            m15208a();
        }

        /* renamed from: a */
        public void mo175a(Transition transition) {
            m15208a();
            transition.mo206b((C0262c) this);
        }

        /* renamed from: b */
        public void mo176b(Transition transition) {
            m15209a((boolean) null);
        }

        /* renamed from: c */
        public void mo177c(Transition transition) {
            m15209a(true);
        }

        /* renamed from: a */
        private void m15208a() {
            if (!this.f13059a) {
                au.m1004a(this.f13060b, this.f13061c);
                if (this.f13062d != null) {
                    this.f13062d.invalidate();
                }
            }
            m15209a(false);
        }

        /* renamed from: a */
        private void m15209a(boolean z) {
            if (this.f13063e && this.f13064f != z && this.f13062d != null) {
                this.f13064f = z;
                an.m986a(this.f13062d, z);
            }
        }
    }

    /* renamed from: a */
    public Animator mo3734a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        return null;
    }

    /* renamed from: b */
    public Animator mo3735b(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        return null;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f979e);
        int a = C0388c.m1421a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (a != null) {
            m15224b(a);
        }
    }

    /* renamed from: b */
    public void m15224b(int i) {
        if ((i & -4) == 0) {
            this.f13066h = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: p */
    public int mo215p() {
        return this.f13066h;
    }

    /* renamed from: a */
    public String[] mo173a() {
        return f13065g;
    }

    /* renamed from: d */
    private void m15215d(ah ahVar) {
        ahVar.f994a.put("android:visibility:visibility", Integer.valueOf(ahVar.f995b.getVisibility()));
        ahVar.f994a.put("android:visibility:parent", ahVar.f995b.getParent());
        Object obj = new int[2];
        ahVar.f995b.getLocationOnScreen(obj);
        ahVar.f994a.put("android:visibility:screenLocation", obj);
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        m15215d(ahVar);
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        m15215d(ahVar);
    }

    /* renamed from: b */
    private C0264b m15214b(ah ahVar, ah ahVar2) {
        C0264b c0264b = new C0264b();
        c0264b.f966a = false;
        c0264b.f967b = false;
        if (ahVar == null || !ahVar.f994a.containsKey("android:visibility:visibility")) {
            c0264b.f968c = -1;
            c0264b.f970e = null;
        } else {
            c0264b.f968c = ((Integer) ahVar.f994a.get("android:visibility:visibility")).intValue();
            c0264b.f970e = (ViewGroup) ahVar.f994a.get("android:visibility:parent");
        }
        if (ahVar2 == null || !ahVar2.f994a.containsKey("android:visibility:visibility")) {
            c0264b.f969d = -1;
            c0264b.f971f = null;
        } else {
            c0264b.f969d = ((Integer) ahVar2.f994a.get("android:visibility:visibility")).intValue();
            c0264b.f971f = (ViewGroup) ahVar2.f994a.get("android:visibility:parent");
        }
        if (ahVar == null || ahVar2 == null) {
            if (ahVar == null && c0264b.f969d == null) {
                c0264b.f967b = true;
                c0264b.f966a = true;
            } else if (ahVar2 == null && c0264b.f968c == null) {
                c0264b.f967b = false;
                c0264b.f966a = true;
            }
        } else if (c0264b.f968c == c0264b.f969d && c0264b.f970e == c0264b.f971f) {
            return c0264b;
        } else {
            if (c0264b.f968c != c0264b.f969d) {
                if (c0264b.f968c == null) {
                    c0264b.f967b = false;
                    c0264b.f966a = true;
                } else if (c0264b.f969d == null) {
                    c0264b.f967b = true;
                    c0264b.f966a = true;
                }
            } else if (c0264b.f971f == null) {
                c0264b.f967b = false;
                c0264b.f966a = true;
            } else if (c0264b.f970e == null) {
                c0264b.f967b = true;
                c0264b.f966a = true;
            }
        }
        return c0264b;
    }

    /* renamed from: a */
    public Animator mo97a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        C0264b b = m15214b(ahVar, ahVar2);
        if (!b.f966a || (b.f970e == null && b.f971f == null)) {
            return null;
        }
        if (b.f967b) {
            return m15216a(viewGroup, ahVar, b.f968c, ahVar2, b.f969d);
        }
        return m15222b(viewGroup, ahVar, b.f968c, ahVar2, b.f969d);
    }

    /* renamed from: a */
    public Animator m15216a(ViewGroup viewGroup, ah ahVar, int i, ah ahVar2, int i2) {
        if ((this.f13066h & 1) == 1) {
            if (ahVar2 != null) {
                if (ahVar == null) {
                    View view = (View) ahVar2.f995b.getParent();
                    if (m15214b(m943b(view, false), m928a(view, false)).f966a != 0) {
                        return null;
                    }
                }
                return mo3734a(viewGroup, ahVar2.f995b, ahVar, ahVar2);
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public android.animation.Animator m15222b(android.view.ViewGroup r7, android.support.transition.ah r8, int r9, android.support.transition.ah r10, int r11) {
        /*
        r6 = this;
        r9 = r6.f13066h;
        r0 = 2;
        r9 = r9 & r0;
        r1 = 0;
        if (r9 == r0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        if (r8 == 0) goto L_0x000d;
    L_0x000a:
        r9 = r8.f995b;
        goto L_0x000e;
    L_0x000d:
        r9 = r1;
    L_0x000e:
        if (r10 == 0) goto L_0x0013;
    L_0x0010:
        r2 = r10.f995b;
        goto L_0x0014;
    L_0x0013:
        r2 = r1;
    L_0x0014:
        r3 = 1;
        if (r2 == 0) goto L_0x0026;
    L_0x0017:
        r4 = r2.getParent();
        if (r4 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0026;
    L_0x001e:
        r4 = 4;
        if (r11 != r4) goto L_0x0022;
    L_0x0021:
        goto L_0x0024;
    L_0x0022:
        if (r9 != r2) goto L_0x0029;
    L_0x0024:
        r9 = r1;
        goto L_0x0073;
    L_0x0026:
        if (r2 == 0) goto L_0x002b;
    L_0x0028:
        r9 = r2;
    L_0x0029:
        r2 = r1;
        goto L_0x0073;
    L_0x002b:
        if (r9 == 0) goto L_0x0071;
    L_0x002d:
        r2 = r9.getParent();
        if (r2 != 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0029;
    L_0x0034:
        r2 = r9.getParent();
        r2 = r2 instanceof android.view.View;
        if (r2 == 0) goto L_0x0071;
    L_0x003c:
        r2 = r9.getParent();
        r2 = (android.view.View) r2;
        r4 = r6.m928a(r2, r3);
        r5 = r6.m943b(r2, r3);
        r4 = r6.m15214b(r4, r5);
        r4 = r4.f966a;
        if (r4 != 0) goto L_0x0057;
    L_0x0052:
        r9 = android.support.transition.ag.m983a(r7, r9, r2);
        goto L_0x0029;
    L_0x0057:
        r4 = r2.getParent();
        if (r4 != 0) goto L_0x006f;
    L_0x005d:
        r2 = r2.getId();
        r4 = -1;
        if (r2 == r4) goto L_0x006f;
    L_0x0064:
        r2 = r7.findViewById(r2);
        if (r2 == 0) goto L_0x006f;
    L_0x006a:
        r2 = r6.e;
        if (r2 == 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0029;
    L_0x006f:
        r9 = r1;
        goto L_0x0029;
    L_0x0071:
        r9 = r1;
        r2 = r9;
    L_0x0073:
        r4 = 0;
        if (r9 == 0) goto L_0x00bb;
    L_0x0076:
        if (r8 == 0) goto L_0x00bb;
    L_0x0078:
        r11 = r8.f994a;
        r1 = "android:visibility:screenLocation";
        r11 = r11.get(r1);
        r11 = (int[]) r11;
        r1 = r11[r4];
        r11 = r11[r3];
        r0 = new int[r0];
        r7.getLocationOnScreen(r0);
        r2 = r0[r4];
        r1 = r1 - r2;
        r2 = r9.getLeft();
        r1 = r1 - r2;
        r9.offsetLeftAndRight(r1);
        r0 = r0[r3];
        r11 = r11 - r0;
        r0 = r9.getTop();
        r11 = r11 - r0;
        r9.offsetTopAndBottom(r11);
        r11 = android.support.transition.an.m985a(r7);
        r11.mo3737a(r9);
        r7 = r6.mo3735b(r7, r9, r8, r10);
        if (r7 != 0) goto L_0x00b2;
    L_0x00ae:
        r11.mo3738b(r9);
        goto L_0x00ba;
    L_0x00b2:
        r8 = new android.support.transition.Visibility$1;
        r8.<init>(r6, r11, r9);
        r7.addListener(r8);
    L_0x00ba:
        return r7;
    L_0x00bb:
        if (r2 == 0) goto L_0x00dd;
    L_0x00bd:
        r9 = r2.getVisibility();
        android.support.transition.au.m1004a(r2, r4);
        r7 = r6.mo3735b(r7, r2, r8, r10);
        if (r7 == 0) goto L_0x00d9;
    L_0x00ca:
        r8 = new android.support.transition.Visibility$a;
        r8.<init>(r2, r11, r3);
        r7.addListener(r8);
        android.support.transition.C0265a.m966a(r7, r8);
        r6.mo199a(r8);
        goto L_0x00dc;
    L_0x00d9:
        android.support.transition.au.m1004a(r2, r9);
    L_0x00dc:
        return r7;
    L_0x00dd:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Visibility.b(android.view.ViewGroup, android.support.transition.ah, int, android.support.transition.ah, int):android.animation.Animator");
    }

    /* renamed from: a */
    public boolean mo218a(ah ahVar, ah ahVar2) {
        boolean z = false;
        if (ahVar == null && ahVar2 == null) {
            return false;
        }
        if (ahVar != null && ahVar2 != null && ahVar2.f994a.containsKey("android:visibility:visibility") != ahVar.f994a.containsKey("android:visibility:visibility")) {
            return false;
        }
        ahVar = m15214b(ahVar, ahVar2);
        if (ahVar.f966a != null && (ahVar.f968c == null || ahVar.f969d == null)) {
            z = true;
        }
        return z;
    }
}
