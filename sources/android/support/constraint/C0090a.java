package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.C0093b.C0092b;
import android.support.constraint.Constraints.LayoutParams;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.a */
public class C0090a {
    /* renamed from: a */
    private static final int[] f284a = new int[]{0, 4, 8};
    /* renamed from: c */
    private static SparseIntArray f285c = new SparseIntArray();
    /* renamed from: b */
    private HashMap<Integer, C0089a> f286b = new HashMap();

    /* renamed from: android.support.constraint.a$a */
    private static class C0089a {
        /* renamed from: A */
        public int f232A;
        /* renamed from: B */
        public int f233B;
        /* renamed from: C */
        public int f234C;
        /* renamed from: D */
        public int f235D;
        /* renamed from: E */
        public int f236E;
        /* renamed from: F */
        public int f237F;
        /* renamed from: G */
        public int f238G;
        /* renamed from: H */
        public int f239H;
        /* renamed from: I */
        public int f240I;
        /* renamed from: J */
        public int f241J;
        /* renamed from: K */
        public int f242K;
        /* renamed from: L */
        public int f243L;
        /* renamed from: M */
        public int f244M;
        /* renamed from: N */
        public int f245N;
        /* renamed from: O */
        public int f246O;
        /* renamed from: P */
        public int f247P;
        /* renamed from: Q */
        public float f248Q;
        /* renamed from: R */
        public float f249R;
        /* renamed from: S */
        public int f250S;
        /* renamed from: T */
        public int f251T;
        /* renamed from: U */
        public float f252U;
        /* renamed from: V */
        public boolean f253V;
        /* renamed from: W */
        public float f254W;
        /* renamed from: X */
        public float f255X;
        /* renamed from: Y */
        public float f256Y;
        /* renamed from: Z */
        public float f257Z;
        /* renamed from: a */
        boolean f258a;
        public float aa;
        public float ab;
        public float ac;
        public float ad;
        public float ae;
        public float af;
        public float ag;
        public boolean ah;
        public boolean ai;
        public int aj;
        public int ak;
        public int al;
        public int am;
        public int an;
        public int ao;
        public float ap;
        public float aq;
        public boolean ar;
        public int as;
        public int at;
        public int[] au;
        public String av;
        /* renamed from: b */
        public int f259b;
        /* renamed from: c */
        public int f260c;
        /* renamed from: d */
        int f261d;
        /* renamed from: e */
        public int f262e;
        /* renamed from: f */
        public int f263f;
        /* renamed from: g */
        public float f264g;
        /* renamed from: h */
        public int f265h;
        /* renamed from: i */
        public int f266i;
        /* renamed from: j */
        public int f267j;
        /* renamed from: k */
        public int f268k;
        /* renamed from: l */
        public int f269l;
        /* renamed from: m */
        public int f270m;
        /* renamed from: n */
        public int f271n;
        /* renamed from: o */
        public int f272o;
        /* renamed from: p */
        public int f273p;
        /* renamed from: q */
        public int f274q;
        /* renamed from: r */
        public int f275r;
        /* renamed from: s */
        public int f276s;
        /* renamed from: t */
        public int f277t;
        /* renamed from: u */
        public float f278u;
        /* renamed from: v */
        public float f279v;
        /* renamed from: w */
        public String f280w;
        /* renamed from: x */
        public int f281x;
        /* renamed from: y */
        public int f282y;
        /* renamed from: z */
        public float f283z;

        private C0089a() {
            this.f258a = false;
            this.f262e = -1;
            this.f263f = -1;
            this.f264g = -1.0f;
            this.f265h = -1;
            this.f266i = -1;
            this.f267j = -1;
            this.f268k = -1;
            this.f269l = -1;
            this.f270m = -1;
            this.f271n = -1;
            this.f272o = -1;
            this.f273p = -1;
            this.f274q = -1;
            this.f275r = -1;
            this.f276s = -1;
            this.f277t = -1;
            this.f278u = 0.5f;
            this.f279v = 0.5f;
            this.f280w = null;
            this.f281x = -1;
            this.f282y = 0;
            this.f283z = 0.0f;
            this.f232A = -1;
            this.f233B = -1;
            this.f234C = -1;
            this.f235D = -1;
            this.f236E = -1;
            this.f237F = -1;
            this.f238G = -1;
            this.f239H = -1;
            this.f240I = -1;
            this.f241J = 0;
            this.f242K = -1;
            this.f243L = -1;
            this.f244M = -1;
            this.f245N = -1;
            this.f246O = -1;
            this.f247P = -1;
            this.f248Q = 0.0f;
            this.f249R = 0.0f;
            this.f250S = 0;
            this.f251T = 0;
            this.f252U = 1.0f;
            this.f253V = false;
            this.f254W = 0.0f;
            this.f255X = 0.0f;
            this.f256Y = 0.0f;
            this.f257Z = 0.0f;
            this.aa = 1.0f;
            this.ab = 1.0f;
            this.ac = Float.NaN;
            this.ad = Float.NaN;
            this.ae = 0.0f;
            this.af = 0.0f;
            this.ag = 0.0f;
            this.ah = false;
            this.ai = false;
            this.aj = 0;
            this.ak = 0;
            this.al = -1;
            this.am = -1;
            this.an = -1;
            this.ao = -1;
            this.ap = 1.0f;
            this.aq = 1.0f;
            this.ar = false;
            this.as = -1;
            this.at = -1;
        }

        public /* synthetic */ Object clone() {
            return m226a();
        }

        /* renamed from: a */
        public C0089a m226a() {
            C0089a c0089a = new C0089a();
            c0089a.f258a = this.f258a;
            c0089a.f259b = this.f259b;
            c0089a.f260c = this.f260c;
            c0089a.f262e = this.f262e;
            c0089a.f263f = this.f263f;
            c0089a.f264g = this.f264g;
            c0089a.f265h = this.f265h;
            c0089a.f266i = this.f266i;
            c0089a.f267j = this.f267j;
            c0089a.f268k = this.f268k;
            c0089a.f269l = this.f269l;
            c0089a.f270m = this.f270m;
            c0089a.f271n = this.f271n;
            c0089a.f272o = this.f272o;
            c0089a.f273p = this.f273p;
            c0089a.f274q = this.f274q;
            c0089a.f275r = this.f275r;
            c0089a.f276s = this.f276s;
            c0089a.f277t = this.f277t;
            c0089a.f278u = this.f278u;
            c0089a.f279v = this.f279v;
            c0089a.f280w = this.f280w;
            c0089a.f232A = this.f232A;
            c0089a.f233B = this.f233B;
            c0089a.f278u = this.f278u;
            c0089a.f278u = this.f278u;
            c0089a.f278u = this.f278u;
            c0089a.f278u = this.f278u;
            c0089a.f278u = this.f278u;
            c0089a.f234C = this.f234C;
            c0089a.f235D = this.f235D;
            c0089a.f236E = this.f236E;
            c0089a.f237F = this.f237F;
            c0089a.f238G = this.f238G;
            c0089a.f239H = this.f239H;
            c0089a.f240I = this.f240I;
            c0089a.f241J = this.f241J;
            c0089a.f242K = this.f242K;
            c0089a.f243L = this.f243L;
            c0089a.f244M = this.f244M;
            c0089a.f245N = this.f245N;
            c0089a.f246O = this.f246O;
            c0089a.f247P = this.f247P;
            c0089a.f248Q = this.f248Q;
            c0089a.f249R = this.f249R;
            c0089a.f250S = this.f250S;
            c0089a.f251T = this.f251T;
            c0089a.f252U = this.f252U;
            c0089a.f253V = this.f253V;
            c0089a.f254W = this.f254W;
            c0089a.f255X = this.f255X;
            c0089a.f256Y = this.f256Y;
            c0089a.f257Z = this.f257Z;
            c0089a.aa = this.aa;
            c0089a.ab = this.ab;
            c0089a.ac = this.ac;
            c0089a.ad = this.ad;
            c0089a.ae = this.ae;
            c0089a.af = this.af;
            c0089a.ag = this.ag;
            c0089a.ah = this.ah;
            c0089a.ai = this.ai;
            c0089a.aj = this.aj;
            c0089a.ak = this.ak;
            c0089a.al = this.al;
            c0089a.am = this.am;
            c0089a.an = this.an;
            c0089a.ao = this.ao;
            c0089a.ap = this.ap;
            c0089a.aq = this.aq;
            c0089a.as = this.as;
            c0089a.at = this.at;
            if (this.au != null) {
                c0089a.au = Arrays.copyOf(this.au, this.au.length);
            }
            c0089a.f281x = this.f281x;
            c0089a.f282y = this.f282y;
            c0089a.f283z = this.f283z;
            c0089a.ar = this.ar;
            return c0089a;
        }

        /* renamed from: a */
        private void m223a(ConstraintHelper constraintHelper, int i, LayoutParams layoutParams) {
            m222a(i, layoutParams);
            if ((constraintHelper instanceof Barrier) != 0) {
                this.at = 1;
                Barrier barrier = (Barrier) constraintHelper;
                this.as = barrier.getType();
                this.au = barrier.getReferencedIds();
            }
        }

        /* renamed from: a */
        private void m222a(int i, LayoutParams layoutParams) {
            m221a(i, (ConstraintLayout.LayoutParams) layoutParams);
            this.f252U = layoutParams.an;
            this.f255X = layoutParams.aq;
            this.f256Y = layoutParams.ar;
            this.f257Z = layoutParams.as;
            this.aa = layoutParams.at;
            this.ab = layoutParams.au;
            this.ac = layoutParams.av;
            this.ad = layoutParams.aw;
            this.ae = layoutParams.ax;
            this.af = layoutParams.ay;
            this.ag = layoutParams.az;
            this.f254W = layoutParams.ap;
            this.f253V = layoutParams.ao;
        }

        /* renamed from: a */
        private void m221a(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f261d = i;
            this.f265h = layoutParams.f185d;
            this.f266i = layoutParams.f186e;
            this.f267j = layoutParams.f187f;
            this.f268k = layoutParams.f188g;
            this.f269l = layoutParams.f189h;
            this.f270m = layoutParams.f190i;
            this.f271n = layoutParams.f191j;
            this.f272o = layoutParams.f192k;
            this.f273p = layoutParams.f193l;
            this.f274q = layoutParams.f197p;
            this.f275r = layoutParams.f198q;
            this.f276s = layoutParams.f199r;
            this.f277t = layoutParams.f200s;
            this.f278u = layoutParams.f207z;
            this.f279v = layoutParams.f156A;
            this.f280w = layoutParams.f157B;
            this.f281x = layoutParams.f194m;
            this.f282y = layoutParams.f195n;
            this.f283z = layoutParams.f196o;
            this.f232A = layoutParams.f172Q;
            this.f233B = layoutParams.f173R;
            this.f234C = layoutParams.f174S;
            this.f264g = layoutParams.f184c;
            this.f262e = layoutParams.f182a;
            this.f263f = layoutParams.f183b;
            this.f259b = layoutParams.width;
            this.f260c = layoutParams.height;
            this.f235D = layoutParams.leftMargin;
            this.f236E = layoutParams.rightMargin;
            this.f237F = layoutParams.topMargin;
            this.f238G = layoutParams.bottomMargin;
            this.f248Q = layoutParams.f161F;
            this.f249R = layoutParams.f160E;
            this.f251T = layoutParams.f163H;
            this.f250S = layoutParams.f162G;
            this.ah = layoutParams.f175T;
            this.ai = layoutParams.f176U;
            this.aj = layoutParams.f164I;
            this.ak = layoutParams.f165J;
            this.ah = layoutParams.f175T;
            this.al = layoutParams.f168M;
            this.am = layoutParams.f169N;
            this.an = layoutParams.f166K;
            this.ao = layoutParams.f167L;
            this.ap = layoutParams.f170O;
            this.aq = layoutParams.f171P;
            if (VERSION.SDK_INT >= 17) {
                this.f239H = layoutParams.getMarginEnd();
                this.f240I = layoutParams.getMarginStart();
            }
        }

        /* renamed from: a */
        public void m227a(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.f185d = this.f265h;
            layoutParams.f186e = this.f266i;
            layoutParams.f187f = this.f267j;
            layoutParams.f188g = this.f268k;
            layoutParams.f189h = this.f269l;
            layoutParams.f190i = this.f270m;
            layoutParams.f191j = this.f271n;
            layoutParams.f192k = this.f272o;
            layoutParams.f193l = this.f273p;
            layoutParams.f197p = this.f274q;
            layoutParams.f198q = this.f275r;
            layoutParams.f199r = this.f276s;
            layoutParams.f200s = this.f277t;
            layoutParams.leftMargin = this.f235D;
            layoutParams.rightMargin = this.f236E;
            layoutParams.topMargin = this.f237F;
            layoutParams.bottomMargin = this.f238G;
            layoutParams.f205x = this.f247P;
            layoutParams.f206y = this.f246O;
            layoutParams.f207z = this.f278u;
            layoutParams.f156A = this.f279v;
            layoutParams.f194m = this.f281x;
            layoutParams.f195n = this.f282y;
            layoutParams.f196o = this.f283z;
            layoutParams.f157B = this.f280w;
            layoutParams.f172Q = this.f232A;
            layoutParams.f173R = this.f233B;
            layoutParams.f161F = this.f248Q;
            layoutParams.f160E = this.f249R;
            layoutParams.f163H = this.f251T;
            layoutParams.f162G = this.f250S;
            layoutParams.f175T = this.ah;
            layoutParams.f176U = this.ai;
            layoutParams.f164I = this.aj;
            layoutParams.f165J = this.ak;
            layoutParams.f168M = this.al;
            layoutParams.f169N = this.am;
            layoutParams.f166K = this.an;
            layoutParams.f167L = this.ao;
            layoutParams.f170O = this.ap;
            layoutParams.f171P = this.aq;
            layoutParams.f174S = this.f234C;
            layoutParams.f184c = this.f264g;
            layoutParams.f182a = this.f262e;
            layoutParams.f183b = this.f263f;
            layoutParams.width = this.f259b;
            layoutParams.height = this.f260c;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.f240I);
                layoutParams.setMarginEnd(this.f239H);
            }
            layoutParams.m200a();
        }
    }

    static {
        f285c.append(C0092b.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f285c.append(C0092b.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f285c.append(C0092b.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f285c.append(C0092b.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f285c.append(C0092b.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f285c.append(C0092b.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f285c.append(C0092b.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f285c.append(C0092b.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f285c.append(C0092b.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f285c.append(C0092b.ConstraintSet_layout_editor_absoluteX, 6);
        f285c.append(C0092b.ConstraintSet_layout_editor_absoluteY, 7);
        f285c.append(C0092b.ConstraintSet_layout_constraintGuide_begin, 17);
        f285c.append(C0092b.ConstraintSet_layout_constraintGuide_end, 18);
        f285c.append(C0092b.ConstraintSet_layout_constraintGuide_percent, 19);
        f285c.append(C0092b.ConstraintSet_android_orientation, 27);
        f285c.append(C0092b.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f285c.append(C0092b.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f285c.append(C0092b.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f285c.append(C0092b.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f285c.append(C0092b.ConstraintSet_layout_goneMarginLeft, 13);
        f285c.append(C0092b.ConstraintSet_layout_goneMarginTop, 16);
        f285c.append(C0092b.ConstraintSet_layout_goneMarginRight, 14);
        f285c.append(C0092b.ConstraintSet_layout_goneMarginBottom, 11);
        f285c.append(C0092b.ConstraintSet_layout_goneMarginStart, 15);
        f285c.append(C0092b.ConstraintSet_layout_goneMarginEnd, 12);
        f285c.append(C0092b.ConstraintSet_layout_constraintVertical_weight, 40);
        f285c.append(C0092b.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f285c.append(C0092b.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f285c.append(C0092b.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f285c.append(C0092b.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f285c.append(C0092b.ConstraintSet_layout_constraintVertical_bias, 37);
        f285c.append(C0092b.ConstraintSet_layout_constraintDimensionRatio, 5);
        f285c.append(C0092b.ConstraintSet_layout_constraintLeft_creator, 75);
        f285c.append(C0092b.ConstraintSet_layout_constraintTop_creator, 75);
        f285c.append(C0092b.ConstraintSet_layout_constraintRight_creator, 75);
        f285c.append(C0092b.ConstraintSet_layout_constraintBottom_creator, 75);
        f285c.append(C0092b.ConstraintSet_layout_constraintBaseline_creator, 75);
        f285c.append(C0092b.ConstraintSet_android_layout_marginLeft, 24);
        f285c.append(C0092b.ConstraintSet_android_layout_marginRight, 28);
        f285c.append(C0092b.ConstraintSet_android_layout_marginStart, 31);
        f285c.append(C0092b.ConstraintSet_android_layout_marginEnd, 8);
        f285c.append(C0092b.ConstraintSet_android_layout_marginTop, 34);
        f285c.append(C0092b.ConstraintSet_android_layout_marginBottom, 2);
        f285c.append(C0092b.ConstraintSet_android_layout_width, 23);
        f285c.append(C0092b.ConstraintSet_android_layout_height, 21);
        f285c.append(C0092b.ConstraintSet_android_visibility, 22);
        f285c.append(C0092b.ConstraintSet_android_alpha, 43);
        f285c.append(C0092b.ConstraintSet_android_elevation, 44);
        f285c.append(C0092b.ConstraintSet_android_rotationX, 45);
        f285c.append(C0092b.ConstraintSet_android_rotationY, 46);
        f285c.append(C0092b.ConstraintSet_android_rotation, 60);
        f285c.append(C0092b.ConstraintSet_android_scaleX, 47);
        f285c.append(C0092b.ConstraintSet_android_scaleY, 48);
        f285c.append(C0092b.ConstraintSet_android_transformPivotX, 49);
        f285c.append(C0092b.ConstraintSet_android_transformPivotY, 50);
        f285c.append(C0092b.ConstraintSet_android_translationX, 51);
        f285c.append(C0092b.ConstraintSet_android_translationY, 52);
        f285c.append(C0092b.ConstraintSet_android_translationZ, 53);
        f285c.append(C0092b.ConstraintSet_layout_constraintWidth_default, 54);
        f285c.append(C0092b.ConstraintSet_layout_constraintHeight_default, 55);
        f285c.append(C0092b.ConstraintSet_layout_constraintWidth_max, 56);
        f285c.append(C0092b.ConstraintSet_layout_constraintHeight_max, 57);
        f285c.append(C0092b.ConstraintSet_layout_constraintWidth_min, 58);
        f285c.append(C0092b.ConstraintSet_layout_constraintHeight_min, 59);
        f285c.append(C0092b.ConstraintSet_layout_constraintCircle, 61);
        f285c.append(C0092b.ConstraintSet_layout_constraintCircleRadius, 62);
        f285c.append(C0092b.ConstraintSet_layout_constraintCircleAngle, 63);
        f285c.append(C0092b.ConstraintSet_android_id, 38);
        f285c.append(C0092b.ConstraintSet_layout_constraintWidth_percent, 69);
        f285c.append(C0092b.ConstraintSet_layout_constraintHeight_percent, 70);
        f285c.append(C0092b.ConstraintSet_chainUseRtl, 71);
        f285c.append(C0092b.ConstraintSet_barrierDirection, 72);
        f285c.append(C0092b.ConstraintSet_constraint_referenced_ids, 73);
        f285c.append(C0092b.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: a */
    public void m234a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f286b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f286b.containsKey(Integer.valueOf(id))) {
                    this.f286b.put(Integer.valueOf(id), new C0089a());
                }
                C0089a c0089a = (C0089a) this.f286b.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    c0089a.m223a((ConstraintHelper) childAt, id, layoutParams);
                }
                c0089a.m222a(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    void m233a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f286b.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f286b.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0089a c0089a = (C0089a) this.f286b.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        c0089a.at = 1;
                    }
                    if (c0089a.at != -1) {
                        if (c0089a.at == 1) {
                            View view = (Barrier) childAt;
                            view.setId(id);
                            view.setType(c0089a.as);
                            view.setAllowsGoneWidget(c0089a.ar);
                            if (c0089a.au != null) {
                                view.setReferencedIds(c0089a.au);
                            } else if (c0089a.av != null) {
                                c0089a.au = m231a(view, c0089a.av);
                                view.setReferencedIds(c0089a.au);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    c0089a.m227a(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    childAt.setVisibility(c0089a.f241J);
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(c0089a.f252U);
                        childAt.setRotation(c0089a.f255X);
                        childAt.setRotationX(c0089a.f256Y);
                        childAt.setRotationY(c0089a.f257Z);
                        childAt.setScaleX(c0089a.aa);
                        childAt.setScaleY(c0089a.ab);
                        if (!Float.isNaN(c0089a.ac)) {
                            childAt.setPivotX(c0089a.ac);
                        }
                        if (!Float.isNaN(c0089a.ad)) {
                            childAt.setPivotY(c0089a.ad);
                        }
                        childAt.setTranslationX(c0089a.ae);
                        childAt.setTranslationY(c0089a.af);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(c0089a.ag);
                            if (c0089a.f253V) {
                                childAt.setElevation(c0089a.f254W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0089a c0089a2 = (C0089a) this.f286b.get(num);
            if (c0089a2.at != -1) {
                if (c0089a2.at == 1) {
                    childAt = new Barrier(constraintLayout.getContext());
                    childAt.setId(num.intValue());
                    if (c0089a2.au != null) {
                        childAt.setReferencedIds(c0089a2.au);
                    } else if (c0089a2.av != null) {
                        c0089a2.au = m231a(childAt, c0089a2.av);
                        childAt.setReferencedIds(c0089a2.au);
                    }
                    childAt.setType(c0089a2.as);
                    ViewGroup.LayoutParams a = constraintLayout.m209a();
                    childAt.m195a();
                    c0089a2.m227a(a);
                    constraintLayout.addView(childAt, a);
                }
            }
            if (c0089a2.f258a) {
                childAt = new Guideline(constraintLayout.getContext());
                childAt.setId(num.intValue());
                ViewGroup.LayoutParams a2 = constraintLayout.m209a();
                c0089a2.m227a(a2);
                constraintLayout.addView(childAt, a2);
            }
        }
    }

    /* renamed from: a */
    public void m232a(Context context, int i) {
        i = context.getResources().getXml(i);
        try {
            for (int eventType = i.getEventType(); eventType != 1; eventType = i.next()) {
                if (eventType != 0) {
                    switch (eventType) {
                        case 2:
                            String name = i.getName();
                            C0089a a = m229a(context, Xml.asAttributeSet(i));
                            if (name.equalsIgnoreCase("Guideline")) {
                                a.f258a = true;
                            }
                            this.f286b.put(Integer.valueOf(a.f261d), a);
                            break;
                        case 3:
                            break;
                        default:
                            break;
                    }
                }
                i.getName();
            }
        } catch (Context context2) {
            context2.printStackTrace();
        } catch (Context context22) {
            context22.printStackTrace();
        }
    }

    /* renamed from: a */
    private static int m228a(TypedArray typedArray, int i, int i2) {
        i2 = typedArray.getResourceId(i, i2);
        return i2 == -1 ? typedArray.getInt(i, -1) : i2;
    }

    /* renamed from: a */
    private C0089a m229a(Context context, AttributeSet attributeSet) {
        C0089a c0089a = new C0089a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0092b.ConstraintSet);
        m230a(c0089a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0089a;
    }

    /* renamed from: a */
    private void m230a(C0089a c0089a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f285c.get(index);
            switch (i2) {
                case 1:
                    c0089a.f273p = C0090a.m228a(typedArray, index, c0089a.f273p);
                    break;
                case 2:
                    c0089a.f238G = typedArray.getDimensionPixelSize(index, c0089a.f238G);
                    break;
                case 3:
                    c0089a.f272o = C0090a.m228a(typedArray, index, c0089a.f272o);
                    break;
                case 4:
                    c0089a.f271n = C0090a.m228a(typedArray, index, c0089a.f271n);
                    break;
                case 5:
                    c0089a.f280w = typedArray.getString(index);
                    break;
                case 6:
                    c0089a.f232A = typedArray.getDimensionPixelOffset(index, c0089a.f232A);
                    break;
                case 7:
                    c0089a.f233B = typedArray.getDimensionPixelOffset(index, c0089a.f233B);
                    break;
                case 8:
                    c0089a.f239H = typedArray.getDimensionPixelSize(index, c0089a.f239H);
                    break;
                case 9:
                    c0089a.f277t = C0090a.m228a(typedArray, index, c0089a.f277t);
                    break;
                case 10:
                    c0089a.f276s = C0090a.m228a(typedArray, index, c0089a.f276s);
                    break;
                case 11:
                    c0089a.f245N = typedArray.getDimensionPixelSize(index, c0089a.f245N);
                    break;
                case 12:
                    c0089a.f246O = typedArray.getDimensionPixelSize(index, c0089a.f246O);
                    break;
                case 13:
                    c0089a.f242K = typedArray.getDimensionPixelSize(index, c0089a.f242K);
                    break;
                case 14:
                    c0089a.f244M = typedArray.getDimensionPixelSize(index, c0089a.f244M);
                    break;
                case 15:
                    c0089a.f247P = typedArray.getDimensionPixelSize(index, c0089a.f247P);
                    break;
                case 16:
                    c0089a.f243L = typedArray.getDimensionPixelSize(index, c0089a.f243L);
                    break;
                case 17:
                    c0089a.f262e = typedArray.getDimensionPixelOffset(index, c0089a.f262e);
                    break;
                case 18:
                    c0089a.f263f = typedArray.getDimensionPixelOffset(index, c0089a.f263f);
                    break;
                case 19:
                    c0089a.f264g = typedArray.getFloat(index, c0089a.f264g);
                    break;
                case 20:
                    c0089a.f278u = typedArray.getFloat(index, c0089a.f278u);
                    break;
                case 21:
                    c0089a.f260c = typedArray.getLayoutDimension(index, c0089a.f260c);
                    break;
                case 22:
                    c0089a.f241J = typedArray.getInt(index, c0089a.f241J);
                    c0089a.f241J = f284a[c0089a.f241J];
                    break;
                case 23:
                    c0089a.f259b = typedArray.getLayoutDimension(index, c0089a.f259b);
                    break;
                case 24:
                    c0089a.f235D = typedArray.getDimensionPixelSize(index, c0089a.f235D);
                    break;
                case 25:
                    c0089a.f265h = C0090a.m228a(typedArray, index, c0089a.f265h);
                    break;
                case 26:
                    c0089a.f266i = C0090a.m228a(typedArray, index, c0089a.f266i);
                    break;
                case 27:
                    c0089a.f234C = typedArray.getInt(index, c0089a.f234C);
                    break;
                case 28:
                    c0089a.f236E = typedArray.getDimensionPixelSize(index, c0089a.f236E);
                    break;
                case 29:
                    c0089a.f267j = C0090a.m228a(typedArray, index, c0089a.f267j);
                    break;
                case 30:
                    c0089a.f268k = C0090a.m228a(typedArray, index, c0089a.f268k);
                    break;
                case 31:
                    c0089a.f240I = typedArray.getDimensionPixelSize(index, c0089a.f240I);
                    break;
                case 32:
                    c0089a.f274q = C0090a.m228a(typedArray, index, c0089a.f274q);
                    break;
                case 33:
                    c0089a.f275r = C0090a.m228a(typedArray, index, c0089a.f275r);
                    break;
                case 34:
                    c0089a.f237F = typedArray.getDimensionPixelSize(index, c0089a.f237F);
                    break;
                case 35:
                    c0089a.f270m = C0090a.m228a(typedArray, index, c0089a.f270m);
                    break;
                case 36:
                    c0089a.f269l = C0090a.m228a(typedArray, index, c0089a.f269l);
                    break;
                case 37:
                    c0089a.f279v = typedArray.getFloat(index, c0089a.f279v);
                    break;
                case 38:
                    c0089a.f261d = typedArray.getResourceId(index, c0089a.f261d);
                    break;
                case 39:
                    c0089a.f249R = typedArray.getFloat(index, c0089a.f249R);
                    break;
                case 40:
                    c0089a.f248Q = typedArray.getFloat(index, c0089a.f248Q);
                    break;
                case 41:
                    c0089a.f250S = typedArray.getInt(index, c0089a.f250S);
                    break;
                case 42:
                    c0089a.f251T = typedArray.getInt(index, c0089a.f251T);
                    break;
                case 43:
                    c0089a.f252U = typedArray.getFloat(index, c0089a.f252U);
                    break;
                case 44:
                    c0089a.f253V = true;
                    c0089a.f254W = typedArray.getDimension(index, c0089a.f254W);
                    break;
                case 45:
                    c0089a.f256Y = typedArray.getFloat(index, c0089a.f256Y);
                    break;
                case 46:
                    c0089a.f257Z = typedArray.getFloat(index, c0089a.f257Z);
                    break;
                case 47:
                    c0089a.aa = typedArray.getFloat(index, c0089a.aa);
                    break;
                case 48:
                    c0089a.ab = typedArray.getFloat(index, c0089a.ab);
                    break;
                case 49:
                    c0089a.ac = typedArray.getFloat(index, c0089a.ac);
                    break;
                case 50:
                    c0089a.ad = typedArray.getFloat(index, c0089a.ad);
                    break;
                case 51:
                    c0089a.ae = typedArray.getDimension(index, c0089a.ae);
                    break;
                case 52:
                    c0089a.af = typedArray.getDimension(index, c0089a.af);
                    break;
                case 53:
                    c0089a.ag = typedArray.getDimension(index, c0089a.ag);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            c0089a.f255X = typedArray.getFloat(index, c0089a.f255X);
                            break;
                        case 61:
                            c0089a.f281x = C0090a.m228a(typedArray, index, c0089a.f281x);
                            break;
                        case 62:
                            c0089a.f282y = typedArray.getDimensionPixelSize(index, c0089a.f282y);
                            break;
                        case 63:
                            c0089a.f283z = typedArray.getFloat(index, c0089a.f283z);
                            break;
                        default:
                            StringBuilder stringBuilder;
                            switch (i2) {
                                case 69:
                                    c0089a.ap = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    c0089a.aq = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    c0089a.as = typedArray.getInt(index, c0089a.as);
                                    break;
                                case 73:
                                    c0089a.av = typedArray.getString(index);
                                    break;
                                case 74:
                                    c0089a.ar = typedArray.getBoolean(index, c0089a.ar);
                                    break;
                                case 75:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("unused attribute 0x");
                                    stringBuilder.append(Integer.toHexString(index));
                                    stringBuilder.append("   ");
                                    stringBuilder.append(f285c.get(index));
                                    Log.w("ConstraintSet", stringBuilder.toString());
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown attribute 0x");
                                    stringBuilder.append(Integer.toHexString(index));
                                    stringBuilder.append("   ");
                                    stringBuilder.append(f285c.get(index));
                                    Log.w("ConstraintSet", stringBuilder.toString());
                                    break;
                            }
                    }
            }
        }
    }

    /* renamed from: a */
    private int[] m231a(android.view.View r10, java.lang.String r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = ",";
        r11 = r11.split(r0);
        r0 = r10.getContext();
        r1 = r11.length;
        r1 = new int[r1];
        r2 = 0;
        r3 = 0;
        r4 = 0;
    L_0x0010:
        r5 = r11.length;
        if (r3 >= r5) goto L_0x0064;
    L_0x0013:
        r5 = r11[r3];
        r5 = r5.trim();
        r6 = android.support.constraint.C0093b.C0091a.class;	 Catch:{ Exception -> 0x0025 }
        r6 = r6.getField(r5);	 Catch:{ Exception -> 0x0025 }
        r7 = 0;	 Catch:{ Exception -> 0x0025 }
        r6 = r6.getInt(r7);	 Catch:{ Exception -> 0x0025 }
        goto L_0x0026;
    L_0x0025:
        r6 = 0;
    L_0x0026:
        if (r6 != 0) goto L_0x0036;
    L_0x0028:
        r6 = r0.getResources();
        r7 = "id";
        r8 = r0.getPackageName();
        r6 = r6.getIdentifier(r5, r7, r8);
    L_0x0036:
        if (r6 != 0) goto L_0x005c;
    L_0x0038:
        r7 = r10.isInEditMode();
        if (r7 == 0) goto L_0x005c;
    L_0x003e:
        r7 = r10.getParent();
        r7 = r7 instanceof android.support.constraint.ConstraintLayout;
        if (r7 == 0) goto L_0x005c;
    L_0x0046:
        r7 = r10.getParent();
        r7 = (android.support.constraint.ConstraintLayout) r7;
        r5 = r7.m213a(r2, r5);
        if (r5 == 0) goto L_0x005c;
    L_0x0052:
        r7 = r5 instanceof java.lang.Integer;
        if (r7 == 0) goto L_0x005c;
    L_0x0056:
        r5 = (java.lang.Integer) r5;
        r6 = r5.intValue();
    L_0x005c:
        r5 = r4 + 1;
        r1[r4] = r6;
        r3 = r3 + 1;
        r4 = r5;
        goto L_0x0010;
    L_0x0064:
        r10 = r11.length;
        if (r4 == r10) goto L_0x006b;
    L_0x0067:
        r1 = java.util.Arrays.copyOf(r1, r4);
    L_0x006b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a(android.view.View, java.lang.String):int[]");
    }
}
