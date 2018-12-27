package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.constraint.C0093b.C0092b;
import android.support.constraint.solver.C0098f;
import android.support.constraint.solver.widgets.C0103a;
import android.support.constraint.solver.widgets.C3023g;
import android.support.constraint.solver.widgets.C3025k;
import android.support.constraint.solver.widgets.C4403e;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    /* renamed from: a */
    SparseArray<View> f208a = new SparseArray();
    /* renamed from: b */
    C4403e f209b = new C4403e();
    /* renamed from: c */
    int f210c = -1;
    /* renamed from: d */
    int f211d = -1;
    /* renamed from: e */
    int f212e = 0;
    /* renamed from: f */
    int f213f = 0;
    /* renamed from: g */
    private ArrayList<ConstraintHelper> f214g = new ArrayList(4);
    /* renamed from: h */
    private final ArrayList<ConstraintWidget> f215h = new ArrayList(100);
    /* renamed from: i */
    private int f216i = 0;
    /* renamed from: j */
    private int f217j = 0;
    /* renamed from: k */
    private int f218k = BaseClientBuilder.API_PRIORITY_OTHER;
    /* renamed from: l */
    private int f219l = BaseClientBuilder.API_PRIORITY_OTHER;
    /* renamed from: m */
    private boolean f220m = true;
    /* renamed from: n */
    private int f221n = 7;
    /* renamed from: o */
    private C0090a f222o = null;
    /* renamed from: p */
    private int f223p = -1;
    /* renamed from: q */
    private HashMap<String, Integer> f224q = new HashMap();
    /* renamed from: r */
    private int f225r = -1;
    /* renamed from: s */
    private int f226s = -1;
    /* renamed from: t */
    private C0098f f227t;

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: A */
        public float f156A = 0.5f;
        /* renamed from: B */
        public String f157B = null;
        /* renamed from: C */
        float f158C = 0.0f;
        /* renamed from: D */
        int f159D = 1;
        /* renamed from: E */
        public float f160E = -1.0f;
        /* renamed from: F */
        public float f161F = -1.0f;
        /* renamed from: G */
        public int f162G = 0;
        /* renamed from: H */
        public int f163H = 0;
        /* renamed from: I */
        public int f164I = 0;
        /* renamed from: J */
        public int f165J = 0;
        /* renamed from: K */
        public int f166K = 0;
        /* renamed from: L */
        public int f167L = 0;
        /* renamed from: M */
        public int f168M = 0;
        /* renamed from: N */
        public int f169N = 0;
        /* renamed from: O */
        public float f170O = 1.0f;
        /* renamed from: P */
        public float f171P = 1.0f;
        /* renamed from: Q */
        public int f172Q = -1;
        /* renamed from: R */
        public int f173R = -1;
        /* renamed from: S */
        public int f174S = -1;
        /* renamed from: T */
        public boolean f175T = false;
        /* renamed from: U */
        public boolean f176U = false;
        /* renamed from: V */
        boolean f177V = true;
        /* renamed from: W */
        boolean f178W = true;
        /* renamed from: X */
        boolean f179X = false;
        /* renamed from: Y */
        boolean f180Y = false;
        /* renamed from: Z */
        boolean f181Z = false;
        /* renamed from: a */
        public int f182a = -1;
        boolean aa = false;
        int ab = -1;
        int ac = -1;
        int ad = -1;
        int ae = -1;
        int af = -1;
        int ag = -1;
        float ah = 0.5f;
        int ai;
        int aj;
        float ak;
        ConstraintWidget al = new ConstraintWidget();
        public boolean am = false;
        /* renamed from: b */
        public int f183b = -1;
        /* renamed from: c */
        public float f184c = -1.0f;
        /* renamed from: d */
        public int f185d = -1;
        /* renamed from: e */
        public int f186e = -1;
        /* renamed from: f */
        public int f187f = -1;
        /* renamed from: g */
        public int f188g = -1;
        /* renamed from: h */
        public int f189h = -1;
        /* renamed from: i */
        public int f190i = -1;
        /* renamed from: j */
        public int f191j = -1;
        /* renamed from: k */
        public int f192k = -1;
        /* renamed from: l */
        public int f193l = -1;
        /* renamed from: m */
        public int f194m = -1;
        /* renamed from: n */
        public int f195n = 0;
        /* renamed from: o */
        public float f196o = 0.0f;
        /* renamed from: p */
        public int f197p = -1;
        /* renamed from: q */
        public int f198q = -1;
        /* renamed from: r */
        public int f199r = -1;
        /* renamed from: s */
        public int f200s = -1;
        /* renamed from: t */
        public int f201t = -1;
        /* renamed from: u */
        public int f202u = -1;
        /* renamed from: v */
        public int f203v = -1;
        /* renamed from: w */
        public int f204w = -1;
        /* renamed from: x */
        public int f205x = -1;
        /* renamed from: y */
        public int f206y = -1;
        /* renamed from: z */
        public float f207z = 0.5f;

        /* renamed from: android.support.constraint.ConstraintLayout$LayoutParams$a */
        private static class C0087a {
            /* renamed from: a */
            public static final SparseIntArray f155a = new SparseIntArray();

            static {
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f155a.append(C0092b.ConstraintLayout_Layout_android_orientation, 1);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f155a.append(C0092b.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public LayoutParams(android.content.Context r10, android.util.AttributeSet r11) {
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
            r9 = this;
            r9.<init>(r10, r11);
            r0 = -1;
            r9.f182a = r0;
            r9.f183b = r0;
            r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r9.f184c = r1;
            r9.f185d = r0;
            r9.f186e = r0;
            r9.f187f = r0;
            r9.f188g = r0;
            r9.f189h = r0;
            r9.f190i = r0;
            r9.f191j = r0;
            r9.f192k = r0;
            r9.f193l = r0;
            r9.f194m = r0;
            r2 = 0;
            r9.f195n = r2;
            r3 = 0;
            r9.f196o = r3;
            r9.f197p = r0;
            r9.f198q = r0;
            r9.f199r = r0;
            r9.f200s = r0;
            r9.f201t = r0;
            r9.f202u = r0;
            r9.f203v = r0;
            r9.f204w = r0;
            r9.f205x = r0;
            r9.f206y = r0;
            r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
            r9.f207z = r4;
            r9.f156A = r4;
            r5 = 0;
            r9.f157B = r5;
            r9.f158C = r3;
            r5 = 1;
            r9.f159D = r5;
            r9.f160E = r1;
            r9.f161F = r1;
            r9.f162G = r2;
            r9.f163H = r2;
            r9.f164I = r2;
            r9.f165J = r2;
            r9.f166K = r2;
            r9.f167L = r2;
            r9.f168M = r2;
            r9.f169N = r2;
            r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r9.f170O = r1;
            r9.f171P = r1;
            r9.f172Q = r0;
            r9.f173R = r0;
            r9.f174S = r0;
            r9.f175T = r2;
            r9.f176U = r2;
            r9.f177V = r5;
            r9.f178W = r5;
            r9.f179X = r2;
            r9.f180Y = r2;
            r9.f181Z = r2;
            r9.aa = r2;
            r9.ab = r0;
            r9.ac = r0;
            r9.ad = r0;
            r9.ae = r0;
            r9.af = r0;
            r9.ag = r0;
            r9.ah = r4;
            r1 = new android.support.constraint.solver.widgets.ConstraintWidget;
            r1.<init>();
            r9.al = r1;
            r9.am = r2;
            r1 = android.support.constraint.C0093b.C0092b.ConstraintLayout_Layout;
            r10 = r10.obtainStyledAttributes(r11, r1);
            r11 = r10.getIndexCount();
            r1 = 0;
        L_0x009a:
            if (r1 >= r11) goto L_0x03e9;
        L_0x009c:
            r4 = r10.getIndex(r1);
            r6 = android.support.constraint.ConstraintLayout.LayoutParams.C0087a.f155a;
            r6 = r6.get(r4);
            r7 = -2;
            switch(r6) {
                case 0: goto L_0x03e5;
                case 1: goto L_0x03dd;
                case 2: goto L_0x03ca;
                case 3: goto L_0x03c1;
                case 4: goto L_0x03a8;
                case 5: goto L_0x039f;
                case 6: goto L_0x0396;
                case 7: goto L_0x038d;
                case 8: goto L_0x037a;
                case 9: goto L_0x0367;
                case 10: goto L_0x0353;
                case 11: goto L_0x033f;
                case 12: goto L_0x032b;
                case 13: goto L_0x0317;
                case 14: goto L_0x0303;
                case 15: goto L_0x02ef;
                case 16: goto L_0x02db;
                case 17: goto L_0x02c7;
                case 18: goto L_0x02b3;
                case 19: goto L_0x029f;
                case 20: goto L_0x028b;
                case 21: goto L_0x0281;
                case 22: goto L_0x0277;
                case 23: goto L_0x026d;
                case 24: goto L_0x0263;
                case 25: goto L_0x0259;
                case 26: goto L_0x024f;
                case 27: goto L_0x0245;
                case 28: goto L_0x023b;
                case 29: goto L_0x0231;
                case 30: goto L_0x0227;
                case 31: goto L_0x0214;
                case 32: goto L_0x0201;
                case 33: goto L_0x01ea;
                case 34: goto L_0x01d3;
                case 35: goto L_0x01c5;
                case 36: goto L_0x01ae;
                case 37: goto L_0x0197;
                case 38: goto L_0x0189;
                case 39: goto L_0x03e5;
                case 40: goto L_0x03e5;
                case 41: goto L_0x03e5;
                case 42: goto L_0x03e5;
                case 43: goto L_0x00aa;
                case 44: goto L_0x00e4;
                case 45: goto L_0x00da;
                case 46: goto L_0x00d0;
                case 47: goto L_0x00c8;
                case 48: goto L_0x00c0;
                case 49: goto L_0x00b6;
                case 50: goto L_0x00ac;
                default: goto L_0x00aa;
            };
        L_0x00aa:
            goto L_0x03e5;
        L_0x00ac:
            r6 = r9.f173R;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f173R = r4;
            goto L_0x03e5;
        L_0x00b6:
            r6 = r9.f172Q;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f172Q = r4;
            goto L_0x03e5;
        L_0x00c0:
            r4 = r10.getInt(r4, r2);
            r9.f163H = r4;
            goto L_0x03e5;
        L_0x00c8:
            r4 = r10.getInt(r4, r2);
            r9.f162G = r4;
            goto L_0x03e5;
        L_0x00d0:
            r6 = r9.f161F;
            r4 = r10.getFloat(r4, r6);
            r9.f161F = r4;
            goto L_0x03e5;
        L_0x00da:
            r6 = r9.f160E;
            r4 = r10.getFloat(r4, r6);
            r9.f160E = r4;
            goto L_0x03e5;
        L_0x00e4:
            r4 = r10.getString(r4);
            r9.f157B = r4;
            r4 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
            r9.f158C = r4;
            r9.f159D = r0;
            r4 = r9.f157B;
            if (r4 == 0) goto L_0x03e5;
        L_0x00f4:
            r4 = r9.f157B;
            r4 = r4.length();
            r6 = r9.f157B;
            r7 = 44;
            r6 = r6.indexOf(r7);
            if (r6 <= 0) goto L_0x0126;
        L_0x0104:
            r7 = r4 + -1;
            if (r6 >= r7) goto L_0x0126;
        L_0x0108:
            r7 = r9.f157B;
            r7 = r7.substring(r2, r6);
            r8 = "W";
            r8 = r7.equalsIgnoreCase(r8);
            if (r8 == 0) goto L_0x0119;
        L_0x0116:
            r9.f159D = r2;
            goto L_0x0123;
        L_0x0119:
            r8 = "H";
            r7 = r7.equalsIgnoreCase(r8);
            if (r7 == 0) goto L_0x0123;
        L_0x0121:
            r9.f159D = r5;
        L_0x0123:
            r6 = r6 + 1;
            goto L_0x0127;
        L_0x0126:
            r6 = 0;
        L_0x0127:
            r7 = r9.f157B;
            r8 = 58;
            r7 = r7.indexOf(r8);
            if (r7 < 0) goto L_0x0175;
        L_0x0131:
            r4 = r4 + -1;
            if (r7 >= r4) goto L_0x0175;
        L_0x0135:
            r4 = r9.f157B;
            r4 = r4.substring(r6, r7);
            r6 = r9.f157B;
            r7 = r7 + 1;
            r6 = r6.substring(r7);
            r7 = r4.length();
            if (r7 <= 0) goto L_0x03e5;
        L_0x0149:
            r7 = r6.length();
            if (r7 <= 0) goto L_0x03e5;
        L_0x014f:
            r4 = java.lang.Float.parseFloat(r4);	 Catch:{ NumberFormatException -> 0x03e5 }
            r6 = java.lang.Float.parseFloat(r6);	 Catch:{ NumberFormatException -> 0x03e5 }
            r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x03e5 }
            if (r7 <= 0) goto L_0x03e5;	 Catch:{ NumberFormatException -> 0x03e5 }
        L_0x015b:
            r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x03e5 }
            if (r7 <= 0) goto L_0x03e5;	 Catch:{ NumberFormatException -> 0x03e5 }
        L_0x015f:
            r7 = r9.f159D;	 Catch:{ NumberFormatException -> 0x03e5 }
            if (r7 != r5) goto L_0x016c;	 Catch:{ NumberFormatException -> 0x03e5 }
        L_0x0163:
            r6 = r6 / r4;	 Catch:{ NumberFormatException -> 0x03e5 }
            r4 = java.lang.Math.abs(r6);	 Catch:{ NumberFormatException -> 0x03e5 }
            r9.f158C = r4;	 Catch:{ NumberFormatException -> 0x03e5 }
            goto L_0x03e5;	 Catch:{ NumberFormatException -> 0x03e5 }
        L_0x016c:
            r4 = r4 / r6;	 Catch:{ NumberFormatException -> 0x03e5 }
            r4 = java.lang.Math.abs(r4);	 Catch:{ NumberFormatException -> 0x03e5 }
            r9.f158C = r4;	 Catch:{ NumberFormatException -> 0x03e5 }
            goto L_0x03e5;
        L_0x0175:
            r4 = r9.f157B;
            r4 = r4.substring(r6);
            r6 = r4.length();
            if (r6 <= 0) goto L_0x03e5;
        L_0x0181:
            r4 = java.lang.Float.parseFloat(r4);	 Catch:{ NumberFormatException -> 0x03e5 }
            r9.f158C = r4;	 Catch:{ NumberFormatException -> 0x03e5 }
            goto L_0x03e5;
        L_0x0189:
            r6 = r9.f171P;
            r4 = r10.getFloat(r4, r6);
            r4 = java.lang.Math.max(r3, r4);
            r9.f171P = r4;
            goto L_0x03e5;
        L_0x0197:
            r6 = r9.f169N;	 Catch:{ Exception -> 0x01a1 }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01a1 }
            r9.f169N = r6;	 Catch:{ Exception -> 0x01a1 }
            goto L_0x03e5;
            r6 = r9.f169N;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03e5;
        L_0x01aa:
            r9.f169N = r7;
            goto L_0x03e5;
        L_0x01ae:
            r6 = r9.f167L;	 Catch:{ Exception -> 0x01b8 }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01b8 }
            r9.f167L = r6;	 Catch:{ Exception -> 0x01b8 }
            goto L_0x03e5;
            r6 = r9.f167L;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03e5;
        L_0x01c1:
            r9.f167L = r7;
            goto L_0x03e5;
        L_0x01c5:
            r6 = r9.f170O;
            r4 = r10.getFloat(r4, r6);
            r4 = java.lang.Math.max(r3, r4);
            r9.f170O = r4;
            goto L_0x03e5;
        L_0x01d3:
            r6 = r9.f168M;	 Catch:{ Exception -> 0x01dd }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01dd }
            r9.f168M = r6;	 Catch:{ Exception -> 0x01dd }
            goto L_0x03e5;
            r6 = r9.f168M;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03e5;
        L_0x01e6:
            r9.f168M = r7;
            goto L_0x03e5;
        L_0x01ea:
            r6 = r9.f166K;	 Catch:{ Exception -> 0x01f4 }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01f4 }
            r9.f166K = r6;	 Catch:{ Exception -> 0x01f4 }
            goto L_0x03e5;
            r6 = r9.f166K;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03e5;
        L_0x01fd:
            r9.f166K = r7;
            goto L_0x03e5;
        L_0x0201:
            r4 = r10.getInt(r4, r2);
            r9.f165J = r4;
            r4 = r9.f165J;
            if (r4 != r5) goto L_0x03e5;
        L_0x020b:
            r4 = "ConstraintLayout";
            r6 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
            android.util.Log.e(r4, r6);
            goto L_0x03e5;
        L_0x0214:
            r4 = r10.getInt(r4, r2);
            r9.f164I = r4;
            r4 = r9.f164I;
            if (r4 != r5) goto L_0x03e5;
        L_0x021e:
            r4 = "ConstraintLayout";
            r6 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
            android.util.Log.e(r4, r6);
            goto L_0x03e5;
        L_0x0227:
            r6 = r9.f156A;
            r4 = r10.getFloat(r4, r6);
            r9.f156A = r4;
            goto L_0x03e5;
        L_0x0231:
            r6 = r9.f207z;
            r4 = r10.getFloat(r4, r6);
            r9.f207z = r4;
            goto L_0x03e5;
        L_0x023b:
            r6 = r9.f176U;
            r4 = r10.getBoolean(r4, r6);
            r9.f176U = r4;
            goto L_0x03e5;
        L_0x0245:
            r6 = r9.f175T;
            r4 = r10.getBoolean(r4, r6);
            r9.f175T = r4;
            goto L_0x03e5;
        L_0x024f:
            r6 = r9.f206y;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f206y = r4;
            goto L_0x03e5;
        L_0x0259:
            r6 = r9.f205x;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f205x = r4;
            goto L_0x03e5;
        L_0x0263:
            r6 = r9.f204w;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f204w = r4;
            goto L_0x03e5;
        L_0x026d:
            r6 = r9.f203v;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f203v = r4;
            goto L_0x03e5;
        L_0x0277:
            r6 = r9.f202u;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f202u = r4;
            goto L_0x03e5;
        L_0x0281:
            r6 = r9.f201t;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f201t = r4;
            goto L_0x03e5;
        L_0x028b:
            r6 = r9.f200s;
            r6 = r10.getResourceId(r4, r6);
            r9.f200s = r6;
            r6 = r9.f200s;
            if (r6 != r0) goto L_0x03e5;
        L_0x0297:
            r4 = r10.getInt(r4, r0);
            r9.f200s = r4;
            goto L_0x03e5;
        L_0x029f:
            r6 = r9.f199r;
            r6 = r10.getResourceId(r4, r6);
            r9.f199r = r6;
            r6 = r9.f199r;
            if (r6 != r0) goto L_0x03e5;
        L_0x02ab:
            r4 = r10.getInt(r4, r0);
            r9.f199r = r4;
            goto L_0x03e5;
        L_0x02b3:
            r6 = r9.f198q;
            r6 = r10.getResourceId(r4, r6);
            r9.f198q = r6;
            r6 = r9.f198q;
            if (r6 != r0) goto L_0x03e5;
        L_0x02bf:
            r4 = r10.getInt(r4, r0);
            r9.f198q = r4;
            goto L_0x03e5;
        L_0x02c7:
            r6 = r9.f197p;
            r6 = r10.getResourceId(r4, r6);
            r9.f197p = r6;
            r6 = r9.f197p;
            if (r6 != r0) goto L_0x03e5;
        L_0x02d3:
            r4 = r10.getInt(r4, r0);
            r9.f197p = r4;
            goto L_0x03e5;
        L_0x02db:
            r6 = r9.f193l;
            r6 = r10.getResourceId(r4, r6);
            r9.f193l = r6;
            r6 = r9.f193l;
            if (r6 != r0) goto L_0x03e5;
        L_0x02e7:
            r4 = r10.getInt(r4, r0);
            r9.f193l = r4;
            goto L_0x03e5;
        L_0x02ef:
            r6 = r9.f192k;
            r6 = r10.getResourceId(r4, r6);
            r9.f192k = r6;
            r6 = r9.f192k;
            if (r6 != r0) goto L_0x03e5;
        L_0x02fb:
            r4 = r10.getInt(r4, r0);
            r9.f192k = r4;
            goto L_0x03e5;
        L_0x0303:
            r6 = r9.f191j;
            r6 = r10.getResourceId(r4, r6);
            r9.f191j = r6;
            r6 = r9.f191j;
            if (r6 != r0) goto L_0x03e5;
        L_0x030f:
            r4 = r10.getInt(r4, r0);
            r9.f191j = r4;
            goto L_0x03e5;
        L_0x0317:
            r6 = r9.f190i;
            r6 = r10.getResourceId(r4, r6);
            r9.f190i = r6;
            r6 = r9.f190i;
            if (r6 != r0) goto L_0x03e5;
        L_0x0323:
            r4 = r10.getInt(r4, r0);
            r9.f190i = r4;
            goto L_0x03e5;
        L_0x032b:
            r6 = r9.f189h;
            r6 = r10.getResourceId(r4, r6);
            r9.f189h = r6;
            r6 = r9.f189h;
            if (r6 != r0) goto L_0x03e5;
        L_0x0337:
            r4 = r10.getInt(r4, r0);
            r9.f189h = r4;
            goto L_0x03e5;
        L_0x033f:
            r6 = r9.f188g;
            r6 = r10.getResourceId(r4, r6);
            r9.f188g = r6;
            r6 = r9.f188g;
            if (r6 != r0) goto L_0x03e5;
        L_0x034b:
            r4 = r10.getInt(r4, r0);
            r9.f188g = r4;
            goto L_0x03e5;
        L_0x0353:
            r6 = r9.f187f;
            r6 = r10.getResourceId(r4, r6);
            r9.f187f = r6;
            r6 = r9.f187f;
            if (r6 != r0) goto L_0x03e5;
        L_0x035f:
            r4 = r10.getInt(r4, r0);
            r9.f187f = r4;
            goto L_0x03e5;
        L_0x0367:
            r6 = r9.f186e;
            r6 = r10.getResourceId(r4, r6);
            r9.f186e = r6;
            r6 = r9.f186e;
            if (r6 != r0) goto L_0x03e5;
        L_0x0373:
            r4 = r10.getInt(r4, r0);
            r9.f186e = r4;
            goto L_0x03e5;
        L_0x037a:
            r6 = r9.f185d;
            r6 = r10.getResourceId(r4, r6);
            r9.f185d = r6;
            r6 = r9.f185d;
            if (r6 != r0) goto L_0x03e5;
        L_0x0386:
            r4 = r10.getInt(r4, r0);
            r9.f185d = r4;
            goto L_0x03e5;
        L_0x038d:
            r6 = r9.f184c;
            r4 = r10.getFloat(r4, r6);
            r9.f184c = r4;
            goto L_0x03e5;
        L_0x0396:
            r6 = r9.f183b;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f183b = r4;
            goto L_0x03e5;
        L_0x039f:
            r6 = r9.f182a;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f182a = r4;
            goto L_0x03e5;
        L_0x03a8:
            r6 = r9.f196o;
            r4 = r10.getFloat(r4, r6);
            r6 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
            r4 = r4 % r6;
            r9.f196o = r4;
            r4 = r9.f196o;
            r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
            if (r4 >= 0) goto L_0x03e5;
        L_0x03b9:
            r4 = r9.f196o;
            r4 = r6 - r4;
            r4 = r4 % r6;
            r9.f196o = r4;
            goto L_0x03e5;
        L_0x03c1:
            r6 = r9.f195n;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f195n = r4;
            goto L_0x03e5;
        L_0x03ca:
            r6 = r9.f194m;
            r6 = r10.getResourceId(r4, r6);
            r9.f194m = r6;
            r6 = r9.f194m;
            if (r6 != r0) goto L_0x03e5;
        L_0x03d6:
            r4 = r10.getInt(r4, r0);
            r9.f194m = r4;
            goto L_0x03e5;
        L_0x03dd:
            r6 = r9.f174S;
            r4 = r10.getInt(r4, r6);
            r9.f174S = r4;
        L_0x03e5:
            r1 = r1 + 1;
            goto L_0x009a;
        L_0x03e9:
            r10.recycle();
            r9.m200a();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.LayoutParams.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        /* renamed from: a */
        public void m200a() {
            this.f180Y = false;
            this.f177V = true;
            this.f178W = true;
            if (this.width == -2 && this.f175T) {
                this.f177V = false;
                this.f164I = 1;
            }
            if (this.height == -2 && this.f176U) {
                this.f178W = false;
                this.f165J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f177V = false;
                if (this.width == 0 && this.f164I == 1) {
                    this.width = -2;
                    this.f175T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f178W = false;
                if (this.height == 0 && this.f165J == 1) {
                    this.height = -2;
                    this.f176U = true;
                }
            }
            if (this.f184c != -1.0f || this.f182a != -1 || this.f183b != -1) {
                this.f180Y = true;
                this.f177V = true;
                this.f178W = true;
                if (!(this.al instanceof C3023g)) {
                    this.al = new C3023g();
                }
                ((C3023g) this.al).mo42a(this.f174S);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            int i2 = this.leftMargin;
            int i3 = this.rightMargin;
            super.resolveLayoutDirection(i);
            this.ad = -1;
            this.ae = -1;
            this.ab = -1;
            this.ac = -1;
            this.af = -1;
            this.ag = -1;
            this.af = this.f201t;
            this.ag = this.f203v;
            this.ah = this.f207z;
            this.ai = this.f182a;
            this.aj = this.f183b;
            this.ak = this.f184c;
            Object obj = null;
            if ((1 == getLayoutDirection() ? 1 : null) != null) {
                if (this.f197p != -1) {
                    this.ad = this.f197p;
                } else {
                    if (this.f198q != -1) {
                        this.ae = this.f198q;
                    }
                    if (this.f199r != -1) {
                        this.ac = this.f199r;
                        obj = 1;
                    }
                    if (this.f200s != -1) {
                        this.ab = this.f200s;
                        obj = 1;
                    }
                    if (this.f205x != -1) {
                        this.ag = this.f205x;
                    }
                    if (this.f206y != -1) {
                        this.af = this.f206y;
                    }
                    if (obj != null) {
                        this.ah = 1.0f - this.f207z;
                    }
                    if (this.f180Y && this.f174S == 1) {
                        if (this.f184c != -1.0f) {
                            this.ak = 1.0f - this.f184c;
                            this.ai = -1;
                            this.aj = -1;
                        } else if (this.f182a != -1) {
                            this.aj = this.f182a;
                            this.ai = -1;
                            this.ak = -1.0f;
                        } else if (this.f183b != -1) {
                            this.ai = this.f183b;
                            this.aj = -1;
                            this.ak = -1.0f;
                        }
                    }
                }
                obj = 1;
                if (this.f199r != -1) {
                    this.ac = this.f199r;
                    obj = 1;
                }
                if (this.f200s != -1) {
                    this.ab = this.f200s;
                    obj = 1;
                }
                if (this.f205x != -1) {
                    this.ag = this.f205x;
                }
                if (this.f206y != -1) {
                    this.af = this.f206y;
                }
                if (obj != null) {
                    this.ah = 1.0f - this.f207z;
                }
                if (this.f184c != -1.0f) {
                    this.ak = 1.0f - this.f184c;
                    this.ai = -1;
                    this.aj = -1;
                } else if (this.f182a != -1) {
                    this.aj = this.f182a;
                    this.ai = -1;
                    this.ak = -1.0f;
                } else if (this.f183b != -1) {
                    this.ai = this.f183b;
                    this.aj = -1;
                    this.ak = -1.0f;
                }
            } else {
                if (this.f197p != -1) {
                    this.ac = this.f197p;
                }
                if (this.f198q != -1) {
                    this.ab = this.f198q;
                }
                if (this.f199r != -1) {
                    this.ad = this.f199r;
                }
                if (this.f200s != -1) {
                    this.ae = this.f200s;
                }
                if (this.f205x != -1) {
                    this.af = this.f205x;
                }
                if (this.f206y != -1) {
                    this.ag = this.f206y;
                }
            }
            if (this.f199r == -1 && this.f200s == -1 && this.f198q == -1 && this.f197p == -1) {
                if (this.f187f != -1) {
                    this.ad = this.f187f;
                    if (this.rightMargin <= 0 && i3 > 0) {
                        this.rightMargin = i3;
                    }
                } else if (this.f188g != -1) {
                    this.ae = this.f188g;
                    if (this.rightMargin <= 0 && i3 > 0) {
                        this.rightMargin = i3;
                    }
                }
                if (this.f185d != -1) {
                    this.ab = this.f185d;
                    if (this.leftMargin <= 0 && i2 > 0) {
                        this.leftMargin = i2;
                    }
                } else if (this.f186e != -1) {
                    this.ac = this.f186e;
                    if (this.leftMargin <= 0 && i2 > 0) {
                        this.leftMargin = i2;
                    }
                }
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m209a();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m210a(attributeSet);
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) != 0 && (obj2 instanceof Integer) != 0) {
            if (this.f224q == 0) {
                this.f224q = new HashMap();
            }
            obj = (String) obj;
            i = obj.indexOf("/");
            if (i != -1) {
                obj = obj.substring(i + 1);
            }
            this.f224q.put(obj, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: a */
    public Object m213a(int i, Object obj) {
        if (i == 0 && (obj instanceof String) != 0) {
            String str = (String) obj;
            if (!(this.f224q == 0 || this.f224q.containsKey(str) == 0)) {
                return this.f224q.get(str);
            }
        }
        return 0;
    }

    public ConstraintLayout(Context context) {
        super(context);
        m205b(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m205b(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m205b(attributeSet);
    }

    public void setId(int i) {
        this.f208a.remove(getId());
        super.setId(i);
        this.f208a.put(getId(), this);
    }

    /* renamed from: b */
    private void m205b(android.util.AttributeSet r8) {
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
        r7 = this;
        r0 = r7.f209b;
        r0.m334a(r7);
        r0 = r7.f208a;
        r1 = r7.getId();
        r0.put(r1, r7);
        r0 = 0;
        r7.f222o = r0;
        if (r8 == 0) goto L_0x008d;
    L_0x0013:
        r1 = r7.getContext();
        r2 = android.support.constraint.C0093b.C0092b.ConstraintLayout_Layout;
        r8 = r1.obtainStyledAttributes(r8, r2);
        r1 = r8.getIndexCount();
        r2 = 0;
        r3 = 0;
    L_0x0023:
        if (r3 >= r1) goto L_0x008a;
    L_0x0025:
        r4 = r8.getIndex(r3);
        r5 = android.support.constraint.C0093b.C0092b.ConstraintLayout_Layout_android_minWidth;
        if (r4 != r5) goto L_0x0036;
    L_0x002d:
        r5 = r7.f216i;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.f216i = r4;
        goto L_0x0087;
    L_0x0036:
        r5 = android.support.constraint.C0093b.C0092b.ConstraintLayout_Layout_android_minHeight;
        if (r4 != r5) goto L_0x0043;
    L_0x003a:
        r5 = r7.f217j;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.f217j = r4;
        goto L_0x0087;
    L_0x0043:
        r5 = android.support.constraint.C0093b.C0092b.ConstraintLayout_Layout_android_maxWidth;
        if (r4 != r5) goto L_0x0050;
    L_0x0047:
        r5 = r7.f218k;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.f218k = r4;
        goto L_0x0087;
    L_0x0050:
        r5 = android.support.constraint.C0093b.C0092b.ConstraintLayout_Layout_android_maxHeight;
        if (r4 != r5) goto L_0x005d;
    L_0x0054:
        r5 = r7.f219l;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.f219l = r4;
        goto L_0x0087;
    L_0x005d:
        r5 = android.support.constraint.C0093b.C0092b.ConstraintLayout_Layout_layout_optimizationLevel;
        if (r4 != r5) goto L_0x006a;
    L_0x0061:
        r5 = r7.f221n;
        r4 = r8.getInt(r4, r5);
        r7.f221n = r4;
        goto L_0x0087;
    L_0x006a:
        r5 = android.support.constraint.C0093b.C0092b.ConstraintLayout_Layout_constraintSet;
        if (r4 != r5) goto L_0x0087;
    L_0x006e:
        r4 = r8.getResourceId(r4, r2);
        r5 = new android.support.constraint.a;	 Catch:{ NotFoundException -> 0x0083 }
        r5.<init>();	 Catch:{ NotFoundException -> 0x0083 }
        r7.f222o = r5;	 Catch:{ NotFoundException -> 0x0083 }
        r5 = r7.f222o;	 Catch:{ NotFoundException -> 0x0083 }
        r6 = r7.getContext();	 Catch:{ NotFoundException -> 0x0083 }
        r5.m232a(r6, r4);	 Catch:{ NotFoundException -> 0x0083 }
        goto L_0x0085;
    L_0x0083:
        r7.f222o = r0;
    L_0x0085:
        r7.f223p = r4;
    L_0x0087:
        r3 = r3 + 1;
        goto L_0x0023;
    L_0x008a:
        r8.recycle();
    L_0x008d:
        r8 = r7.f209b;
        r0 = r7.f221n;
        r8.mo42a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.b(android.util.AttributeSet):void");
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget a = m211a(view);
        if ((view instanceof Guideline) && !(a instanceof C3023g)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.al = new C3023g();
            layoutParams.f180Y = true;
            ((C3023g) layoutParams.al).mo42a(layoutParams.f174S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m195a();
            ((LayoutParams) view.getLayoutParams()).f181Z = true;
            if (!this.f214g.contains(constraintHelper)) {
                this.f214g.add(constraintHelper);
            }
        }
        this.f208a.put(view.getId(), view);
        this.f220m = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f208a.remove(view.getId());
        ConstraintWidget a = m211a(view);
        this.f209b.m14824c(a);
        this.f214g.remove(view);
        this.f215h.remove(a);
        this.f220m = true;
    }

    public void setMinWidth(int i) {
        if (i != this.f216i) {
            this.f216i = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f217j) {
            this.f217j = i;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.f216i;
    }

    public int getMinHeight() {
        return this.f217j;
    }

    public void setMaxWidth(int i) {
        if (i != this.f218k) {
            this.f218k = i;
            requestLayout();
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.f219l) {
            this.f219l = i;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.f218k;
    }

    public int getMaxHeight() {
        return this.f219l;
    }

    /* renamed from: b */
    private void m203b() {
        int childCount = getChildCount();
        Object obj = null;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            this.f215h.clear();
            m206c();
        }
    }

    /* renamed from: c */
    private void m206c() {
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
        r26 = this;
        r0 = r26;
        r1 = r26.isInEditMode();
        r2 = r26.getChildCount();
        r3 = 0;
        r4 = -1;
        if (r1 == 0) goto L_0x0048;
    L_0x000e:
        r5 = 0;
    L_0x000f:
        if (r5 >= r2) goto L_0x0048;
    L_0x0011:
        r6 = r0.getChildAt(r5);
        r7 = r26.getResources();	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r7 = r7.getResourceName(r8);	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NotFoundException -> 0x0045 }
        r0.setDesignInformation(r3, r7, r8);	 Catch:{ NotFoundException -> 0x0045 }
        r8 = 47;	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r7.indexOf(r8);	 Catch:{ NotFoundException -> 0x0045 }
        if (r8 == r4) goto L_0x003a;	 Catch:{ NotFoundException -> 0x0045 }
    L_0x0034:
        r8 = r8 + 1;	 Catch:{ NotFoundException -> 0x0045 }
        r7 = r7.substring(r8);	 Catch:{ NotFoundException -> 0x0045 }
    L_0x003a:
        r6 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r6 = r0.m202b(r6);	 Catch:{ NotFoundException -> 0x0045 }
        r6.m335a(r7);	 Catch:{ NotFoundException -> 0x0045 }
    L_0x0045:
        r5 = r5 + 1;
        goto L_0x000f;
    L_0x0048:
        r5 = 0;
    L_0x0049:
        if (r5 >= r2) goto L_0x005c;
    L_0x004b:
        r6 = r0.getChildAt(r5);
        r6 = r0.m211a(r6);
        if (r6 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0059;
    L_0x0056:
        r6.mo52f();
    L_0x0059:
        r5 = r5 + 1;
        goto L_0x0049;
    L_0x005c:
        r5 = r0.f223p;
        if (r5 == r4) goto L_0x007e;
    L_0x0060:
        r5 = 0;
    L_0x0061:
        if (r5 >= r2) goto L_0x007e;
    L_0x0063:
        r6 = r0.getChildAt(r5);
        r7 = r6.getId();
        r8 = r0.f223p;
        if (r7 != r8) goto L_0x007b;
    L_0x006f:
        r7 = r6 instanceof android.support.constraint.Constraints;
        if (r7 == 0) goto L_0x007b;
    L_0x0073:
        r6 = (android.support.constraint.Constraints) r6;
        r6 = r6.getConstraintSet();
        r0.f222o = r6;
    L_0x007b:
        r5 = r5 + 1;
        goto L_0x0061;
    L_0x007e:
        r5 = r0.f222o;
        if (r5 == 0) goto L_0x0087;
    L_0x0082:
        r5 = r0.f222o;
        r5.m233a(r0);
    L_0x0087:
        r5 = r0.f209b;
        r5.m14820U();
        r5 = r0.f214g;
        r5 = r5.size();
        if (r5 <= 0) goto L_0x00a5;
    L_0x0094:
        r6 = 0;
    L_0x0095:
        if (r6 >= r5) goto L_0x00a5;
    L_0x0097:
        r7 = r0.f214g;
        r7 = r7.get(r6);
        r7 = (android.support.constraint.ConstraintHelper) r7;
        r7.mo29a(r0);
        r6 = r6 + 1;
        goto L_0x0095;
    L_0x00a5:
        r5 = 0;
    L_0x00a6:
        if (r5 >= r2) goto L_0x00b8;
    L_0x00a8:
        r6 = r0.getChildAt(r5);
        r7 = r6 instanceof android.support.constraint.Placeholder;
        if (r7 == 0) goto L_0x00b5;
    L_0x00b0:
        r6 = (android.support.constraint.Placeholder) r6;
        r6.m219a(r0);
    L_0x00b5:
        r5 = r5 + 1;
        goto L_0x00a6;
    L_0x00b8:
        r5 = 0;
    L_0x00b9:
        if (r5 >= r2) goto L_0x03f9;
    L_0x00bb:
        r6 = r0.getChildAt(r5);
        r13 = r0.m211a(r6);
        if (r13 != 0) goto L_0x00c7;
    L_0x00c5:
        goto L_0x03f5;
    L_0x00c7:
        r7 = r6.getLayoutParams();
        r14 = r7;
        r14 = (android.support.constraint.ConstraintLayout.LayoutParams) r14;
        r14.m200a();
        r7 = r14.am;
        if (r7 == 0) goto L_0x00d8;
    L_0x00d5:
        r14.am = r3;
        goto L_0x010a;
    L_0x00d8:
        if (r1 == 0) goto L_0x010a;
    L_0x00da:
        r7 = r26.getResources();	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0109 }
        r7 = r7.getResourceName(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0109 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r0.setDesignInformation(r3, r7, r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8 = "id/";	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r7.indexOf(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r8 + 3;	 Catch:{ NotFoundException -> 0x0109 }
        r7 = r7.substring(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r0.m202b(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8.m335a(r7);	 Catch:{ NotFoundException -> 0x0109 }
        goto L_0x010a;
    L_0x010a:
        r7 = r6.getVisibility();
        r13.m357e(r7);
        r7 = r14.aa;
        if (r7 == 0) goto L_0x011a;
    L_0x0115:
        r7 = 8;
        r13.m357e(r7);
    L_0x011a:
        r13.m334a(r6);
        r6 = r0.f209b;
        r6.m14823b(r13);
        r6 = r14.f178W;
        if (r6 == 0) goto L_0x012a;
    L_0x0126:
        r6 = r14.f177V;
        if (r6 != 0) goto L_0x012f;
    L_0x012a:
        r6 = r0.f215h;
        r6.add(r13);
    L_0x012f:
        r6 = r14.f180Y;
        r7 = 17;
        if (r6 == 0) goto L_0x0160;
    L_0x0135:
        r13 = (android.support.constraint.solver.widgets.C3023g) r13;
        r6 = r14.ai;
        r8 = r14.aj;
        r9 = r14.ak;
        r10 = android.os.Build.VERSION.SDK_INT;
        if (r10 >= r7) goto L_0x0147;
    L_0x0141:
        r6 = r14.f182a;
        r8 = r14.f183b;
        r9 = r14.f184c;
    L_0x0147:
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r7 == 0) goto L_0x0152;
    L_0x014d:
        r13.m14796e(r9);
        goto L_0x03f5;
    L_0x0152:
        if (r6 == r4) goto L_0x0159;
    L_0x0154:
        r13.m14797u(r6);
        goto L_0x03f5;
    L_0x0159:
        if (r8 == r4) goto L_0x03f5;
    L_0x015b:
        r13.m14798v(r8);
        goto L_0x03f5;
    L_0x0160:
        r6 = r14.f185d;
        if (r6 != r4) goto L_0x01a8;
    L_0x0164:
        r6 = r14.f186e;
        if (r6 != r4) goto L_0x01a8;
    L_0x0168:
        r6 = r14.f187f;
        if (r6 != r4) goto L_0x01a8;
    L_0x016c:
        r6 = r14.f188g;
        if (r6 != r4) goto L_0x01a8;
    L_0x0170:
        r6 = r14.f198q;
        if (r6 != r4) goto L_0x01a8;
    L_0x0174:
        r6 = r14.f197p;
        if (r6 != r4) goto L_0x01a8;
    L_0x0178:
        r6 = r14.f199r;
        if (r6 != r4) goto L_0x01a8;
    L_0x017c:
        r6 = r14.f200s;
        if (r6 != r4) goto L_0x01a8;
    L_0x0180:
        r6 = r14.f189h;
        if (r6 != r4) goto L_0x01a8;
    L_0x0184:
        r6 = r14.f190i;
        if (r6 != r4) goto L_0x01a8;
    L_0x0188:
        r6 = r14.f191j;
        if (r6 != r4) goto L_0x01a8;
    L_0x018c:
        r6 = r14.f192k;
        if (r6 != r4) goto L_0x01a8;
    L_0x0190:
        r6 = r14.f193l;
        if (r6 != r4) goto L_0x01a8;
    L_0x0194:
        r6 = r14.f172Q;
        if (r6 != r4) goto L_0x01a8;
    L_0x0198:
        r6 = r14.f173R;
        if (r6 != r4) goto L_0x01a8;
    L_0x019c:
        r6 = r14.f194m;
        if (r6 != r4) goto L_0x01a8;
    L_0x01a0:
        r6 = r14.width;
        if (r6 == r4) goto L_0x01a8;
    L_0x01a4:
        r6 = r14.height;
        if (r6 != r4) goto L_0x03f5;
    L_0x01a8:
        r6 = r14.ab;
        r8 = r14.ac;
        r9 = r14.ad;
        r10 = r14.ae;
        r11 = r14.af;
        r12 = r14.ag;
        r15 = r14.ah;
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 >= r7) goto L_0x01f3;
    L_0x01ba:
        r3 = r14.f185d;
        r6 = r14.f186e;
        r9 = r14.f187f;
        r10 = r14.f188g;
        r7 = r14.f201t;
        r8 = r14.f203v;
        r15 = r14.f207z;
        if (r3 != r4) goto L_0x01d9;
    L_0x01ca:
        if (r6 != r4) goto L_0x01d9;
    L_0x01cc:
        r11 = r14.f198q;
        if (r11 == r4) goto L_0x01d3;
    L_0x01d0:
        r3 = r14.f198q;
        goto L_0x01d9;
    L_0x01d3:
        r11 = r14.f197p;
        if (r11 == r4) goto L_0x01d9;
    L_0x01d7:
        r6 = r14.f197p;
    L_0x01d9:
        r25 = r6;
        r6 = r3;
        r3 = r25;
        if (r9 != r4) goto L_0x01ef;
    L_0x01e0:
        if (r10 != r4) goto L_0x01ef;
    L_0x01e2:
        r11 = r14.f199r;
        if (r11 == r4) goto L_0x01e9;
    L_0x01e6:
        r9 = r14.f199r;
        goto L_0x01ef;
    L_0x01e9:
        r11 = r14.f200s;
        if (r11 == r4) goto L_0x01ef;
    L_0x01ed:
        r10 = r14.f200s;
    L_0x01ef:
        r12 = r7;
        r16 = r8;
        goto L_0x01f7;
    L_0x01f3:
        r3 = r8;
        r16 = r12;
        r12 = r11;
    L_0x01f7:
        r11 = r10;
        r10 = r15;
        r15 = r9;
        r7 = r14.f194m;
        if (r7 == r4) goto L_0x020f;
    L_0x01fe:
        r3 = r14.f194m;
        r3 = r0.m202b(r3);
        if (r3 == 0) goto L_0x0343;
    L_0x0206:
        r6 = r14.f196o;
        r7 = r14.f195n;
        r13.m333a(r3, r6, r7);
        goto L_0x0343;
    L_0x020f:
        if (r6 == r4) goto L_0x022c;
    L_0x0211:
        r9 = r0.m202b(r6);
        if (r9 == 0) goto L_0x0227;
    L_0x0217:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r6 = r14.leftMargin;
        r7 = r13;
        r17 = r10;
        r10 = r3;
        r3 = r11;
        r11 = r6;
        r7.m330a(r8, r9, r10, r11, r12);
        goto L_0x022a;
    L_0x0227:
        r17 = r10;
        r3 = r11;
    L_0x022a:
        r6 = r3;
        goto L_0x0241;
    L_0x022c:
        r17 = r10;
        r6 = r11;
        if (r3 == r4) goto L_0x0241;
    L_0x0231:
        r9 = r0.m202b(r3);
        if (r9 == 0) goto L_0x0241;
    L_0x0237:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r11 = r14.leftMargin;
        r7 = r13;
        r7.m330a(r8, r9, r10, r11, r12);
    L_0x0241:
        if (r15 == r4) goto L_0x0256;
    L_0x0243:
        r9 = r0.m202b(r15);
        if (r9 == 0) goto L_0x026a;
    L_0x0249:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r11 = r14.rightMargin;
        r7 = r13;
        r12 = r16;
        r7.m330a(r8, r9, r10, r11, r12);
        goto L_0x026a;
    L_0x0256:
        if (r6 == r4) goto L_0x026a;
    L_0x0258:
        r9 = r0.m202b(r6);
        if (r9 == 0) goto L_0x026a;
    L_0x025e:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r11 = r14.rightMargin;
        r7 = r13;
        r12 = r16;
        r7.m330a(r8, r9, r10, r11, r12);
    L_0x026a:
        r3 = r14.f189h;
        if (r3 == r4) goto L_0x0283;
    L_0x026e:
        r3 = r14.f189h;
        r9 = r0.m202b(r3);
        if (r9 == 0) goto L_0x029b;
    L_0x0276:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r11 = r14.topMargin;
        r12 = r14.f202u;
        r7 = r13;
        r7.m330a(r8, r9, r10, r11, r12);
        goto L_0x029b;
    L_0x0283:
        r3 = r14.f190i;
        if (r3 == r4) goto L_0x029b;
    L_0x0287:
        r3 = r14.f190i;
        r9 = r0.m202b(r3);
        if (r9 == 0) goto L_0x029b;
    L_0x028f:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r11 = r14.topMargin;
        r12 = r14.f202u;
        r7 = r13;
        r7.m330a(r8, r9, r10, r11, r12);
    L_0x029b:
        r3 = r14.f191j;
        if (r3 == r4) goto L_0x02b4;
    L_0x029f:
        r3 = r14.f191j;
        r9 = r0.m202b(r3);
        if (r9 == 0) goto L_0x02cc;
    L_0x02a7:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r11 = r14.bottomMargin;
        r12 = r14.f204w;
        r7 = r13;
        r7.m330a(r8, r9, r10, r11, r12);
        goto L_0x02cc;
    L_0x02b4:
        r3 = r14.f192k;
        if (r3 == r4) goto L_0x02cc;
    L_0x02b8:
        r3 = r14.f192k;
        r9 = r0.m202b(r3);
        if (r9 == 0) goto L_0x02cc;
    L_0x02c0:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r11 = r14.bottomMargin;
        r12 = r14.f204w;
        r7 = r13;
        r7.m330a(r8, r9, r10, r11, r12);
    L_0x02cc:
        r3 = r14.f193l;
        if (r3 == r4) goto L_0x0322;
    L_0x02d0:
        r3 = r0.f208a;
        r6 = r14.f193l;
        r3 = r3.get(r6);
        r3 = (android.view.View) r3;
        r6 = r14.f193l;
        r6 = r0.m202b(r6);
        if (r6 == 0) goto L_0x0322;
    L_0x02e2:
        if (r3 == 0) goto L_0x0322;
    L_0x02e4:
        r7 = r3.getLayoutParams();
        r7 = r7 instanceof android.support.constraint.ConstraintLayout.LayoutParams;
        if (r7 == 0) goto L_0x0322;
    L_0x02ec:
        r3 = r3.getLayoutParams();
        r3 = (android.support.constraint.ConstraintLayout.LayoutParams) r3;
        r7 = 1;
        r14.f179X = r7;
        r3.f179X = r7;
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BASELINE;
        r18 = r13.mo41a(r3);
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BASELINE;
        r19 = r6.mo41a(r3);
        r20 = 0;
        r21 = -1;
        r22 = android.support.constraint.solver.widgets.ConstraintAnchor.Strength.STRONG;
        r23 = 0;
        r24 = 1;
        r18.m299a(r19, r20, r21, r22, r23, r24);
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r3 = r13.mo41a(r3);
        r3.m308i();
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r3 = r13.mo41a(r3);
        r3.m308i();
    L_0x0322:
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = 0;
        r15 = r17;
        r7 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1));
        if (r7 < 0) goto L_0x0332;
    L_0x032b:
        r7 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1));
        if (r7 == 0) goto L_0x0332;
    L_0x032f:
        r13.m323a(r15);
    L_0x0332:
        r7 = r14.f156A;
        r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x0343;
    L_0x0338:
        r6 = r14.f156A;
        r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r3 == 0) goto L_0x0343;
    L_0x033e:
        r3 = r14.f156A;
        r13.m339b(r3);
    L_0x0343:
        if (r1 == 0) goto L_0x0354;
    L_0x0345:
        r3 = r14.f172Q;
        if (r3 != r4) goto L_0x034d;
    L_0x0349:
        r3 = r14.f173R;
        if (r3 == r4) goto L_0x0354;
    L_0x034d:
        r3 = r14.f172Q;
        r6 = r14.f173R;
        r13.m324a(r3, r6);
    L_0x0354:
        r3 = r14.f177V;
        if (r3 != 0) goto L_0x0380;
    L_0x0358:
        r3 = r14.width;
        if (r3 != r4) goto L_0x0376;
    L_0x035c:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        r13.m331a(r3);
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r3 = r13.mo41a(r3);
        r6 = r14.leftMargin;
        r3.f391d = r6;
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r3 = r13.mo41a(r3);
        r6 = r14.rightMargin;
        r3.f391d = r6;
        goto L_0x038a;
    L_0x0376:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        r13.m331a(r3);
        r3 = 0;
        r13.m369j(r3);
        goto L_0x038a;
    L_0x0380:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        r13.m331a(r3);
        r3 = r14.width;
        r13.m369j(r3);
    L_0x038a:
        r3 = r14.f178W;
        if (r3 != 0) goto L_0x03b7;
    L_0x038e:
        r3 = r14.height;
        if (r3 != r4) goto L_0x03ad;
    L_0x0392:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        r13.m344b(r3);
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r3 = r13.mo41a(r3);
        r6 = r14.topMargin;
        r3.f391d = r6;
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r3 = r13.mo41a(r3);
        r6 = r14.bottomMargin;
        r3.f391d = r6;
        r3 = 0;
        goto L_0x03c2;
    L_0x03ad:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        r13.m344b(r3);
        r3 = 0;
        r13.m371k(r3);
        goto L_0x03c2;
    L_0x03b7:
        r3 = 0;
        r6 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        r13.m344b(r6);
        r6 = r14.height;
        r13.m371k(r6);
    L_0x03c2:
        r6 = r14.f157B;
        if (r6 == 0) goto L_0x03cb;
    L_0x03c6:
        r6 = r14.f157B;
        r13.m345b(r6);
    L_0x03cb:
        r6 = r14.f160E;
        r13.m348c(r6);
        r6 = r14.f161F;
        r13.m353d(r6);
        r6 = r14.f162G;
        r13.m385r(r6);
        r6 = r14.f163H;
        r13.m387s(r6);
        r6 = r14.f164I;
        r7 = r14.f166K;
        r8 = r14.f168M;
        r9 = r14.f170O;
        r13.m326a(r6, r7, r8, r9);
        r6 = r14.f165J;
        r7 = r14.f167L;
        r8 = r14.f169N;
        r9 = r14.f171P;
        r13.m342b(r6, r7, r8, r9);
    L_0x03f5:
        r5 = r5 + 1;
        goto L_0x00b9;
    L_0x03f9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.c():void");
    }

    /* renamed from: b */
    private final ConstraintWidget m202b(int i) {
        if (i == 0) {
            return this.f209b;
        }
        View view = (View) this.f208a.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f209b;
        }
        if (view == null) {
            i = 0;
        } else {
            i = ((LayoutParams) view.getLayoutParams()).al;
        }
        return i;
    }

    /* renamed from: a */
    public final ConstraintWidget m211a(View view) {
        if (view == this) {
            return this.f209b;
        }
        if (view == null) {
            view = null;
        } else {
            view = ((LayoutParams) view.getLayoutParams()).al;
        }
        return view;
    }

    /* renamed from: a */
    private void m201a(int i, int i2) {
        ConstraintLayout constraintLayout = this;
        int i3 = i;
        int i4 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.al;
                if (!layoutParams.f180Y) {
                    if (!layoutParams.f181Z) {
                        Object obj;
                        int childMeasureSpec;
                        Object obj2;
                        int childMeasureSpec2;
                        Object obj3;
                        C0098f c0098f;
                        constraintWidget.m357e(childAt.getVisibility());
                        int i6 = layoutParams.width;
                        int i7 = layoutParams.height;
                        if (!(layoutParams.f177V || layoutParams.f178W || ((!layoutParams.f177V && layoutParams.f164I == 1) || layoutParams.width == -1))) {
                            if (!layoutParams.f178W) {
                                if (layoutParams.f165J != 1) {
                                    if (layoutParams.height == -1) {
                                    }
                                }
                            }
                            obj = null;
                            if (obj == null) {
                                if (i6 == 0) {
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -2);
                                    obj2 = 1;
                                } else if (i6 != -1) {
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -1);
                                    obj2 = null;
                                } else {
                                    obj2 = i6 != -2 ? 1 : null;
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, i6);
                                }
                                if (i7 == 0) {
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -2);
                                    obj3 = 1;
                                } else if (i7 != -1) {
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -1);
                                    obj3 = null;
                                } else {
                                    obj3 = i7 != -2 ? 1 : null;
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, i7);
                                }
                                childAt.measure(childMeasureSpec, childMeasureSpec2);
                                if (constraintLayout.f227t != null) {
                                    c0098f = constraintLayout.f227t;
                                    c0098f.f344a++;
                                }
                                constraintWidget.m346b(i6 != -2);
                                constraintWidget.m352c(i7 != -2);
                                i6 = childAt.getMeasuredWidth();
                                i7 = childAt.getMeasuredHeight();
                            } else {
                                obj2 = null;
                                obj3 = null;
                            }
                            constraintWidget.m369j(i6);
                            constraintWidget.m371k(i7);
                            if (obj2 != null) {
                                constraintWidget.m377n(i6);
                            }
                            if (obj3 != null) {
                                constraintWidget.m379o(i7);
                            }
                            if (layoutParams.f179X) {
                                childMeasureSpec = childAt.getBaseline();
                                if (childMeasureSpec != -1) {
                                    constraintWidget.m383q(childMeasureSpec);
                                }
                            }
                        }
                        obj = 1;
                        if (obj == null) {
                            obj2 = null;
                            obj3 = null;
                        } else {
                            if (i6 == 0) {
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -2);
                                obj2 = 1;
                            } else if (i6 != -1) {
                                if (i6 != -2) {
                                }
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, i6);
                            } else {
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -1);
                                obj2 = null;
                            }
                            if (i7 == 0) {
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -2);
                                obj3 = 1;
                            } else if (i7 != -1) {
                                if (i7 != -2) {
                                }
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, i7);
                            } else {
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -1);
                                obj3 = null;
                            }
                            childAt.measure(childMeasureSpec, childMeasureSpec2);
                            if (constraintLayout.f227t != null) {
                                c0098f = constraintLayout.f227t;
                                c0098f.f344a++;
                            }
                            if (i6 != -2) {
                            }
                            constraintWidget.m346b(i6 != -2);
                            if (i7 != -2) {
                            }
                            constraintWidget.m352c(i7 != -2);
                            i6 = childAt.getMeasuredWidth();
                            i7 = childAt.getMeasuredHeight();
                        }
                        constraintWidget.m369j(i6);
                        constraintWidget.m371k(i7);
                        if (obj2 != null) {
                            constraintWidget.m377n(i6);
                        }
                        if (obj3 != null) {
                            constraintWidget.m379o(i7);
                        }
                        if (layoutParams.f179X) {
                            childMeasureSpec = childAt.getBaseline();
                            if (childMeasureSpec != -1) {
                                constraintWidget.m383q(childMeasureSpec);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m208d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Placeholder) {
                ((Placeholder) childAt).m220b(this);
            }
        }
        childCount = this.f214g.size();
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                ((ConstraintHelper) this.f214g.get(i2)).m199c(this);
            }
        }
    }

    /* renamed from: b */
    private void m204b(int i, int i2) {
        int i3;
        int i4;
        ConstraintLayout constraintLayout = this;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            long j = 1;
            int i8 = 8;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.al;
                if (!layoutParams.f180Y) {
                    if (!layoutParams.f181Z) {
                        constraintWidget.m357e(childAt.getVisibility());
                        int i9 = layoutParams.width;
                        i3 = layoutParams.height;
                        if (i9 != 0) {
                            if (i3 != 0) {
                                Object obj = i9 == -2 ? 1 : null;
                                int childMeasureSpec = getChildMeasureSpec(i5, paddingLeft, i9);
                                Object obj2 = i3 == -2 ? 1 : null;
                                childAt.measure(childMeasureSpec, getChildMeasureSpec(i6, paddingTop, i3));
                                if (constraintLayout.f227t != null) {
                                    C0098f c0098f = constraintLayout.f227t;
                                    i4 = paddingTop;
                                    c0098f.f344a++;
                                } else {
                                    i4 = paddingTop;
                                }
                                constraintWidget.m346b(i9 == -2);
                                constraintWidget.m352c(i3 == -2);
                                i6 = childAt.getMeasuredWidth();
                                paddingTop = childAt.getMeasuredHeight();
                                constraintWidget.m369j(i6);
                                constraintWidget.m371k(paddingTop);
                                if (obj != null) {
                                    constraintWidget.m377n(i6);
                                }
                                if (obj2 != null) {
                                    constraintWidget.m379o(paddingTop);
                                }
                                if (layoutParams.f179X) {
                                    i9 = childAt.getBaseline();
                                    if (i9 != -1) {
                                        constraintWidget.m383q(i9);
                                    }
                                }
                                if (layoutParams.f177V && layoutParams.f178W) {
                                    constraintWidget.m366i().m14814a(i6);
                                    constraintWidget.m368j().m14814a(paddingTop);
                                }
                                i7++;
                                paddingTop = i4;
                                i6 = i2;
                            }
                        }
                        i4 = paddingTop;
                        constraintWidget.m366i().m428e();
                        constraintWidget.m368j().m428e();
                        i7++;
                        paddingTop = i4;
                        i6 = i2;
                    }
                }
            }
            i4 = paddingTop;
            i7++;
            paddingTop = i4;
            i6 = i2;
        }
        i4 = paddingTop;
        constraintLayout.f209b.m24058P();
        i6 = 0;
        while (i6 < childCount) {
            int i10;
            int i11;
            int i12;
            int i13;
            long j2;
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != i8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                ConstraintWidget constraintWidget2 = layoutParams2.al;
                if (!layoutParams2.f180Y) {
                    if (!layoutParams2.f181Z) {
                        constraintWidget2.m357e(childAt2.getVisibility());
                        childMeasureSpec = layoutParams2.width;
                        int i14 = layoutParams2.height;
                        if (childMeasureSpec == 0 || i14 == 0) {
                            C3025k a = constraintWidget2.mo41a(Type.LEFT).m296a();
                            C3025k a2 = constraintWidget2.mo41a(Type.RIGHT).m296a();
                            Object obj3 = (constraintWidget2.mo41a(Type.LEFT).m306g() == null || constraintWidget2.mo41a(Type.RIGHT).m306g() == null) ? null : 1;
                            C3025k a3 = constraintWidget2.mo41a(Type.TOP).m296a();
                            C3025k a4 = constraintWidget2.mo41a(Type.BOTTOM).m296a();
                            Object obj4 = (constraintWidget2.mo41a(Type.TOP).m306g() == null || constraintWidget2.mo41a(Type.BOTTOM).m306g() == null) ? null : 1;
                            if (childMeasureSpec != 0 || i14 != 0 || obj3 == null || obj4 == null) {
                                Object obj5;
                                int childMeasureSpec2;
                                Object obj6;
                                C0098f c0098f2;
                                i10 = childCount;
                                i11 = i6;
                                Object obj7 = constraintLayout.f209b.m318F() != DimensionBehaviour.WRAP_CONTENT ? 1 : null;
                                LayoutParams layoutParams3 = layoutParams2;
                                Object obj8 = constraintLayout.f209b.m319G() != DimensionBehaviour.WRAP_CONTENT ? 1 : null;
                                if (obj7 == null) {
                                    constraintWidget2.m366i().m428e();
                                }
                                if (obj8 == null) {
                                    constraintWidget2.m368j().m428e();
                                }
                                if (childMeasureSpec == 0) {
                                    if (obj7 != null && constraintWidget2.m356d() && obj3 != null && a.m430g() && a2.m430g()) {
                                        childMeasureSpec = (int) (a2.m14813d() - a.m14813d());
                                        constraintWidget2.m366i().m14814a(childMeasureSpec);
                                        i3 = getChildMeasureSpec(i5, paddingLeft, childMeasureSpec);
                                    } else {
                                        i3 = getChildMeasureSpec(i5, paddingLeft, -2);
                                        obj7 = null;
                                        obj5 = 1;
                                        if (i14 != 0) {
                                            i12 = i4;
                                            i13 = i2;
                                            if (i14 == -1) {
                                                childMeasureSpec2 = getChildMeasureSpec(i13, i12, -1);
                                            } else {
                                                obj6 = i14 == -2 ? 1 : null;
                                                childMeasureSpec2 = getChildMeasureSpec(i13, i12, i14);
                                                childAt2.measure(i3, childMeasureSpec2);
                                                if (constraintLayout.f227t != null) {
                                                    j2 = 1;
                                                } else {
                                                    c0098f2 = constraintLayout.f227t;
                                                    j2 = 1;
                                                    c0098f2.f344a++;
                                                }
                                                if (childMeasureSpec == -2) {
                                                }
                                                constraintWidget2.m346b(childMeasureSpec == -2);
                                                if (i14 == -2) {
                                                }
                                                constraintWidget2.m352c(i14 == -2);
                                                childMeasureSpec = childAt2.getMeasuredWidth();
                                                i14 = childAt2.getMeasuredHeight();
                                                constraintWidget2.m369j(childMeasureSpec);
                                                constraintWidget2.m371k(i14);
                                                if (obj5 != null) {
                                                    constraintWidget2.m377n(childMeasureSpec);
                                                }
                                                if (obj6 != null) {
                                                    constraintWidget2.m379o(i14);
                                                }
                                                if (obj7 != null) {
                                                    constraintWidget2.m366i().m14816c();
                                                } else {
                                                    constraintWidget2.m366i().m14814a(childMeasureSpec);
                                                }
                                                if (obj8 != null) {
                                                    constraintWidget2.m368j().m14816c();
                                                } else {
                                                    constraintWidget2.m368j().m14814a(i14);
                                                }
                                                if (layoutParams3.f179X) {
                                                    i6 = childAt2.getBaseline();
                                                    if (i6 != -1) {
                                                        constraintWidget2.m383q(i6);
                                                    }
                                                }
                                                i6 = i11 + 1;
                                                i4 = i12;
                                                j = j2;
                                                childCount = i10;
                                                i8 = 8;
                                            }
                                        } else if (obj8 == null && constraintWidget2.m359e() && obj4 != null && a3.m430g() && a4.m430g()) {
                                            i14 = (int) (a4.m14813d() - a3.m14813d());
                                            constraintWidget2.m368j().m14814a(i14);
                                            i12 = i4;
                                            childMeasureSpec2 = getChildMeasureSpec(i2, i12, i14);
                                        } else {
                                            i12 = i4;
                                            childMeasureSpec2 = getChildMeasureSpec(i2, i12, -2);
                                            obj8 = null;
                                            obj6 = 1;
                                            childAt2.measure(i3, childMeasureSpec2);
                                            if (constraintLayout.f227t != null) {
                                                c0098f2 = constraintLayout.f227t;
                                                j2 = 1;
                                                c0098f2.f344a++;
                                            } else {
                                                j2 = 1;
                                            }
                                            constraintWidget2.m346b(childMeasureSpec == -2);
                                            constraintWidget2.m352c(i14 == -2);
                                            childMeasureSpec = childAt2.getMeasuredWidth();
                                            i14 = childAt2.getMeasuredHeight();
                                            constraintWidget2.m369j(childMeasureSpec);
                                            constraintWidget2.m371k(i14);
                                            if (obj5 != null) {
                                                constraintWidget2.m377n(childMeasureSpec);
                                            }
                                            if (obj6 != null) {
                                                constraintWidget2.m379o(i14);
                                            }
                                            if (obj7 != null) {
                                                constraintWidget2.m366i().m14814a(childMeasureSpec);
                                            } else {
                                                constraintWidget2.m366i().m14816c();
                                            }
                                            if (obj8 != null) {
                                                constraintWidget2.m368j().m14814a(i14);
                                            } else {
                                                constraintWidget2.m368j().m14816c();
                                            }
                                            if (layoutParams3.f179X) {
                                                i6 = childAt2.getBaseline();
                                                if (i6 != -1) {
                                                    constraintWidget2.m383q(i6);
                                                }
                                            }
                                            i6 = i11 + 1;
                                            i4 = i12;
                                            j = j2;
                                            childCount = i10;
                                            i8 = 8;
                                        }
                                        obj6 = null;
                                        childAt2.measure(i3, childMeasureSpec2);
                                        if (constraintLayout.f227t != null) {
                                            c0098f2 = constraintLayout.f227t;
                                            j2 = 1;
                                            c0098f2.f344a++;
                                        } else {
                                            j2 = 1;
                                        }
                                        if (childMeasureSpec == -2) {
                                        }
                                        constraintWidget2.m346b(childMeasureSpec == -2);
                                        if (i14 == -2) {
                                        }
                                        constraintWidget2.m352c(i14 == -2);
                                        childMeasureSpec = childAt2.getMeasuredWidth();
                                        i14 = childAt2.getMeasuredHeight();
                                        constraintWidget2.m369j(childMeasureSpec);
                                        constraintWidget2.m371k(i14);
                                        if (obj5 != null) {
                                            constraintWidget2.m377n(childMeasureSpec);
                                        }
                                        if (obj6 != null) {
                                            constraintWidget2.m379o(i14);
                                        }
                                        if (obj7 != null) {
                                            constraintWidget2.m366i().m14814a(childMeasureSpec);
                                        } else {
                                            constraintWidget2.m366i().m14816c();
                                        }
                                        if (obj8 != null) {
                                            constraintWidget2.m368j().m14814a(i14);
                                        } else {
                                            constraintWidget2.m368j().m14816c();
                                        }
                                        if (layoutParams3.f179X) {
                                            i6 = childAt2.getBaseline();
                                            if (i6 != -1) {
                                                constraintWidget2.m383q(i6);
                                            }
                                        }
                                        i6 = i11 + 1;
                                        i4 = i12;
                                        j = j2;
                                        childCount = i10;
                                        i8 = 8;
                                    }
                                } else if (childMeasureSpec == -1) {
                                    i3 = getChildMeasureSpec(i5, paddingLeft, -1);
                                } else {
                                    obj5 = childMeasureSpec == -2 ? 1 : null;
                                    i3 = getChildMeasureSpec(i5, paddingLeft, childMeasureSpec);
                                    if (i14 != 0) {
                                        i12 = i4;
                                        i13 = i2;
                                        if (i14 == -1) {
                                            if (i14 == -2) {
                                            }
                                            childMeasureSpec2 = getChildMeasureSpec(i13, i12, i14);
                                            childAt2.measure(i3, childMeasureSpec2);
                                            if (constraintLayout.f227t != null) {
                                                j2 = 1;
                                            } else {
                                                c0098f2 = constraintLayout.f227t;
                                                j2 = 1;
                                                c0098f2.f344a++;
                                            }
                                            if (childMeasureSpec == -2) {
                                            }
                                            constraintWidget2.m346b(childMeasureSpec == -2);
                                            if (i14 == -2) {
                                            }
                                            constraintWidget2.m352c(i14 == -2);
                                            childMeasureSpec = childAt2.getMeasuredWidth();
                                            i14 = childAt2.getMeasuredHeight();
                                            constraintWidget2.m369j(childMeasureSpec);
                                            constraintWidget2.m371k(i14);
                                            if (obj5 != null) {
                                                constraintWidget2.m377n(childMeasureSpec);
                                            }
                                            if (obj6 != null) {
                                                constraintWidget2.m379o(i14);
                                            }
                                            if (obj7 != null) {
                                                constraintWidget2.m366i().m14816c();
                                            } else {
                                                constraintWidget2.m366i().m14814a(childMeasureSpec);
                                            }
                                            if (obj8 != null) {
                                                constraintWidget2.m368j().m14816c();
                                            } else {
                                                constraintWidget2.m368j().m14814a(i14);
                                            }
                                            if (layoutParams3.f179X) {
                                                i6 = childAt2.getBaseline();
                                                if (i6 != -1) {
                                                    constraintWidget2.m383q(i6);
                                                }
                                            }
                                            i6 = i11 + 1;
                                            i4 = i12;
                                            j = j2;
                                            childCount = i10;
                                            i8 = 8;
                                        } else {
                                            childMeasureSpec2 = getChildMeasureSpec(i13, i12, -1);
                                        }
                                    } else {
                                        if (obj8 == null) {
                                        }
                                        i12 = i4;
                                        childMeasureSpec2 = getChildMeasureSpec(i2, i12, -2);
                                        obj8 = null;
                                        obj6 = 1;
                                        childAt2.measure(i3, childMeasureSpec2);
                                        if (constraintLayout.f227t != null) {
                                            c0098f2 = constraintLayout.f227t;
                                            j2 = 1;
                                            c0098f2.f344a++;
                                        } else {
                                            j2 = 1;
                                        }
                                        if (childMeasureSpec == -2) {
                                        }
                                        constraintWidget2.m346b(childMeasureSpec == -2);
                                        if (i14 == -2) {
                                        }
                                        constraintWidget2.m352c(i14 == -2);
                                        childMeasureSpec = childAt2.getMeasuredWidth();
                                        i14 = childAt2.getMeasuredHeight();
                                        constraintWidget2.m369j(childMeasureSpec);
                                        constraintWidget2.m371k(i14);
                                        if (obj5 != null) {
                                            constraintWidget2.m377n(childMeasureSpec);
                                        }
                                        if (obj6 != null) {
                                            constraintWidget2.m379o(i14);
                                        }
                                        if (obj7 != null) {
                                            constraintWidget2.m366i().m14814a(childMeasureSpec);
                                        } else {
                                            constraintWidget2.m366i().m14816c();
                                        }
                                        if (obj8 != null) {
                                            constraintWidget2.m368j().m14814a(i14);
                                        } else {
                                            constraintWidget2.m368j().m14816c();
                                        }
                                        if (layoutParams3.f179X) {
                                            i6 = childAt2.getBaseline();
                                            if (i6 != -1) {
                                                constraintWidget2.m383q(i6);
                                            }
                                        }
                                        i6 = i11 + 1;
                                        i4 = i12;
                                        j = j2;
                                        childCount = i10;
                                        i8 = 8;
                                    }
                                    obj6 = null;
                                    childAt2.measure(i3, childMeasureSpec2);
                                    if (constraintLayout.f227t != null) {
                                        j2 = 1;
                                    } else {
                                        c0098f2 = constraintLayout.f227t;
                                        j2 = 1;
                                        c0098f2.f344a++;
                                    }
                                    if (childMeasureSpec == -2) {
                                    }
                                    constraintWidget2.m346b(childMeasureSpec == -2);
                                    if (i14 == -2) {
                                    }
                                    constraintWidget2.m352c(i14 == -2);
                                    childMeasureSpec = childAt2.getMeasuredWidth();
                                    i14 = childAt2.getMeasuredHeight();
                                    constraintWidget2.m369j(childMeasureSpec);
                                    constraintWidget2.m371k(i14);
                                    if (obj5 != null) {
                                        constraintWidget2.m377n(childMeasureSpec);
                                    }
                                    if (obj6 != null) {
                                        constraintWidget2.m379o(i14);
                                    }
                                    if (obj7 != null) {
                                        constraintWidget2.m366i().m14816c();
                                    } else {
                                        constraintWidget2.m366i().m14814a(childMeasureSpec);
                                    }
                                    if (obj8 != null) {
                                        constraintWidget2.m368j().m14816c();
                                    } else {
                                        constraintWidget2.m368j().m14814a(i14);
                                    }
                                    if (layoutParams3.f179X) {
                                        i6 = childAt2.getBaseline();
                                        if (i6 != -1) {
                                            constraintWidget2.m383q(i6);
                                        }
                                    }
                                    i6 = i11 + 1;
                                    i4 = i12;
                                    j = j2;
                                    childCount = i10;
                                    i8 = 8;
                                }
                                obj5 = null;
                                if (i14 != 0) {
                                    if (obj8 == null) {
                                    }
                                    i12 = i4;
                                    childMeasureSpec2 = getChildMeasureSpec(i2, i12, -2);
                                    obj8 = null;
                                    obj6 = 1;
                                    childAt2.measure(i3, childMeasureSpec2);
                                    if (constraintLayout.f227t != null) {
                                        c0098f2 = constraintLayout.f227t;
                                        j2 = 1;
                                        c0098f2.f344a++;
                                    } else {
                                        j2 = 1;
                                    }
                                    if (childMeasureSpec == -2) {
                                    }
                                    constraintWidget2.m346b(childMeasureSpec == -2);
                                    if (i14 == -2) {
                                    }
                                    constraintWidget2.m352c(i14 == -2);
                                    childMeasureSpec = childAt2.getMeasuredWidth();
                                    i14 = childAt2.getMeasuredHeight();
                                    constraintWidget2.m369j(childMeasureSpec);
                                    constraintWidget2.m371k(i14);
                                    if (obj5 != null) {
                                        constraintWidget2.m377n(childMeasureSpec);
                                    }
                                    if (obj6 != null) {
                                        constraintWidget2.m379o(i14);
                                    }
                                    if (obj7 != null) {
                                        constraintWidget2.m366i().m14814a(childMeasureSpec);
                                    } else {
                                        constraintWidget2.m366i().m14816c();
                                    }
                                    if (obj8 != null) {
                                        constraintWidget2.m368j().m14814a(i14);
                                    } else {
                                        constraintWidget2.m368j().m14816c();
                                    }
                                    if (layoutParams3.f179X) {
                                        i6 = childAt2.getBaseline();
                                        if (i6 != -1) {
                                            constraintWidget2.m383q(i6);
                                        }
                                    }
                                    i6 = i11 + 1;
                                    i4 = i12;
                                    j = j2;
                                    childCount = i10;
                                    i8 = 8;
                                } else {
                                    i12 = i4;
                                    i13 = i2;
                                    if (i14 == -1) {
                                        childMeasureSpec2 = getChildMeasureSpec(i13, i12, -1);
                                    } else {
                                        if (i14 == -2) {
                                        }
                                        childMeasureSpec2 = getChildMeasureSpec(i13, i12, i14);
                                        childAt2.measure(i3, childMeasureSpec2);
                                        if (constraintLayout.f227t != null) {
                                            j2 = 1;
                                        } else {
                                            c0098f2 = constraintLayout.f227t;
                                            j2 = 1;
                                            c0098f2.f344a++;
                                        }
                                        if (childMeasureSpec == -2) {
                                        }
                                        constraintWidget2.m346b(childMeasureSpec == -2);
                                        if (i14 == -2) {
                                        }
                                        constraintWidget2.m352c(i14 == -2);
                                        childMeasureSpec = childAt2.getMeasuredWidth();
                                        i14 = childAt2.getMeasuredHeight();
                                        constraintWidget2.m369j(childMeasureSpec);
                                        constraintWidget2.m371k(i14);
                                        if (obj5 != null) {
                                            constraintWidget2.m377n(childMeasureSpec);
                                        }
                                        if (obj6 != null) {
                                            constraintWidget2.m379o(i14);
                                        }
                                        if (obj7 != null) {
                                            constraintWidget2.m366i().m14816c();
                                        } else {
                                            constraintWidget2.m366i().m14814a(childMeasureSpec);
                                        }
                                        if (obj8 != null) {
                                            constraintWidget2.m368j().m14816c();
                                        } else {
                                            constraintWidget2.m368j().m14814a(i14);
                                        }
                                        if (layoutParams3.f179X) {
                                            i6 = childAt2.getBaseline();
                                            if (i6 != -1) {
                                                constraintWidget2.m383q(i6);
                                            }
                                        }
                                        i6 = i11 + 1;
                                        i4 = i12;
                                        j = j2;
                                        childCount = i10;
                                        i8 = 8;
                                    }
                                }
                                obj6 = null;
                                childAt2.measure(i3, childMeasureSpec2);
                                if (constraintLayout.f227t != null) {
                                    c0098f2 = constraintLayout.f227t;
                                    j2 = 1;
                                    c0098f2.f344a++;
                                } else {
                                    j2 = 1;
                                }
                                if (childMeasureSpec == -2) {
                                }
                                constraintWidget2.m346b(childMeasureSpec == -2);
                                if (i14 == -2) {
                                }
                                constraintWidget2.m352c(i14 == -2);
                                childMeasureSpec = childAt2.getMeasuredWidth();
                                i14 = childAt2.getMeasuredHeight();
                                constraintWidget2.m369j(childMeasureSpec);
                                constraintWidget2.m371k(i14);
                                if (obj5 != null) {
                                    constraintWidget2.m377n(childMeasureSpec);
                                }
                                if (obj6 != null) {
                                    constraintWidget2.m379o(i14);
                                }
                                if (obj7 != null) {
                                    constraintWidget2.m366i().m14814a(childMeasureSpec);
                                } else {
                                    constraintWidget2.m366i().m14816c();
                                }
                                if (obj8 != null) {
                                    constraintWidget2.m368j().m14814a(i14);
                                } else {
                                    constraintWidget2.m368j().m14816c();
                                }
                                if (layoutParams3.f179X) {
                                    i6 = childAt2.getBaseline();
                                    if (i6 != -1) {
                                        constraintWidget2.m383q(i6);
                                    }
                                }
                                i6 = i11 + 1;
                                i4 = i12;
                                j = j2;
                                childCount = i10;
                                i8 = 8;
                            } else {
                                i11 = i6;
                                i10 = childCount;
                                i12 = i4;
                                i13 = i2;
                                j2 = 1;
                                i6 = i11 + 1;
                                i4 = i12;
                                j = j2;
                                childCount = i10;
                                i8 = 8;
                            }
                        }
                    }
                }
            }
            i11 = i6;
            i10 = childCount;
            j2 = j;
            i12 = i4;
            i13 = i2;
            i6 = i11 + 1;
            i4 = i12;
            j = j2;
            childCount = i10;
            i8 = 8;
        }
    }

    protected void onMeasure(int i, int i2) {
        int r;
        Object obj;
        Object obj2;
        int i3;
        ConstraintWidget constraintWidget;
        int i4;
        View view;
        int i5;
        Object obj3;
        int i6;
        LayoutParams layoutParams;
        Object obj4;
        ConstraintWidget constraintWidget2;
        View view2;
        int i7 = i;
        int i8 = i2;
        System.currentTimeMillis();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f209b.m364h(paddingLeft);
        this.f209b.m367i(paddingTop);
        this.f209b.m349c(this.f218k);
        this.f209b.m354d(this.f219l);
        if (VERSION.SDK_INT >= 17) {
            r0.f209b.m24065a(getLayoutDirection() == 1);
        }
        m207c(i, i2);
        int p = r0.f209b.m380p();
        int r2 = r0.f209b.m384r();
        Object obj5;
        if (r0.f220m) {
            r0.f220m = false;
            m203b();
            obj5 = 1;
        } else {
            obj5 = null;
        }
        Object obj6 = (r0.f221n & 8) == 8 ? 1 : null;
        if (obj6 != null) {
            r0.f209b.m24057O();
            r0.f209b.m24069f(p, r2);
            m204b(i, i2);
        } else {
            m201a(i, i2);
        }
        m208d();
        if (getChildCount() > 0 && r13 != null) {
            C0103a.m402a(r0.f209b);
        }
        if (r0.f209b.as) {
            if (r0.f209b.at && mode == Integer.MIN_VALUE) {
                if (r0.f209b.av < size) {
                    r0.f209b.m369j(r0.f209b.av);
                }
                r0.f209b.m331a(DimensionBehaviour.FIXED);
            }
            if (r0.f209b.au && mode2 == Integer.MIN_VALUE) {
                if (r0.f209b.aw < size2) {
                    r0.f209b.m371k(r0.f209b.aw);
                }
                r0.f209b.m344b(DimensionBehaviour.FIXED);
            }
        }
        if ((r0.f221n & 32) == 32) {
            int p2 = r0.f209b.m380p();
            r = r0.f209b.m384r();
            if (r0.f225r != p2 && mode == 1073741824) {
                C0103a.m404a(r0.f209b.ar, 0, p2);
            }
            if (r0.f226s != r && mode2 == 1073741824) {
                C0103a.m404a(r0.f209b.ar, 1, r);
            }
            if (r0.f209b.at && r0.f209b.av > size) {
                C0103a.m404a(r0.f209b.ar, 0, size);
            }
            if (r0.f209b.au && r0.f209b.aw > size2) {
                C0103a.m404a(r0.f209b.ar, 1, size2);
                if (getChildCount() > 0) {
                    m214a("First pass");
                }
                mode = r0.f215h.size();
                paddingTop += getPaddingBottom();
                paddingLeft += getPaddingRight();
                if (mode <= 0) {
                    Object obj7 = r0.f209b.m318F() != DimensionBehaviour.WRAP_CONTENT ? 1 : null;
                    obj = r0.f209b.m319G() != DimensionBehaviour.WRAP_CONTENT ? 1 : null;
                    r = Math.max(r0.f209b.m380p(), r0.f216i);
                    mode2 = Math.max(r0.f209b.m384r(), r0.f217j);
                    size = 0;
                    obj2 = null;
                    i3 = 0;
                    while (size < mode) {
                        constraintWidget = (ConstraintWidget) r0.f215h.get(size);
                        i4 = mode;
                        view = (View) constraintWidget.m314B();
                        if (view != null) {
                            i5 = p;
                            obj3 = obj2;
                            i6 = r2;
                        } else {
                            i6 = r2;
                            layoutParams = (LayoutParams) view.getLayoutParams();
                            i5 = p;
                            if (!layoutParams.f181Z) {
                                if (layoutParams.f180Y) {
                                    obj3 = obj2;
                                    if (view.getVisibility() != 8) {
                                        if (obj6 != null || !constraintWidget.m366i().m430g() || !constraintWidget.m368j().m430g()) {
                                            if (layoutParams.width == -2 || !layoutParams.f177V) {
                                                p = MeasureSpec.makeMeasureSpec(constraintWidget.m380p(), 1073741824);
                                            } else {
                                                p = getChildMeasureSpec(i7, paddingLeft, layoutParams.width);
                                            }
                                            if (layoutParams.height == -2 || !layoutParams.f178W) {
                                                i7 = MeasureSpec.makeMeasureSpec(constraintWidget.m384r(), 1073741824);
                                            } else {
                                                i7 = getChildMeasureSpec(i8, paddingTop, layoutParams.height);
                                            }
                                            view.measure(p, i7);
                                            if (r0.f227t != null) {
                                                C0098f c0098f = r0.f227t;
                                                c0098f.f345b++;
                                            }
                                            i7 = view.getMeasuredWidth();
                                            p = view.getMeasuredHeight();
                                            if (i7 != constraintWidget.m380p()) {
                                                constraintWidget.m369j(i7);
                                                if (obj6 != null) {
                                                    constraintWidget.m366i().m14814a(i7);
                                                }
                                                if (obj7 != null && constraintWidget.m393x() > r) {
                                                    r = Math.max(r, constraintWidget.m393x() + constraintWidget.mo41a(Type.RIGHT).m304e());
                                                }
                                                obj3 = 1;
                                            }
                                            if (p != constraintWidget.m384r()) {
                                                constraintWidget.m371k(p);
                                                if (obj6 != null) {
                                                    constraintWidget.m368j().m14814a(p);
                                                }
                                                if (obj != null && constraintWidget.m394y() > mode2) {
                                                    mode2 = Math.max(mode2, constraintWidget.m394y() + constraintWidget.mo41a(Type.BOTTOM).m304e());
                                                }
                                                obj3 = 1;
                                            }
                                            if (layoutParams.f179X) {
                                                i7 = view.getBaseline();
                                                if (!(i7 == -1 || i7 == constraintWidget.m313A())) {
                                                    constraintWidget.m383q(i7);
                                                    obj3 = 1;
                                                }
                                            }
                                            if (VERSION.SDK_INT < 11) {
                                                i3 = combineMeasuredStates(i3, view.getMeasuredState());
                                            } else {
                                                mode = i3;
                                            }
                                            obj2 = obj3;
                                            size++;
                                            mode = i4;
                                            r2 = i6;
                                            p = i5;
                                            i7 = i;
                                        }
                                    }
                                }
                            }
                            obj3 = obj2;
                        }
                        i3 = i3;
                        obj2 = obj3;
                        size++;
                        mode = i4;
                        r2 = i6;
                        p = i5;
                        i7 = i;
                    }
                    i4 = mode;
                    i5 = p;
                    i6 = r2;
                    mode = i3;
                    if (obj2 != null) {
                        r0.f209b.m369j(i5);
                        r0.f209b.m371k(i6);
                        if (obj6 != null) {
                            r0.f209b.m24058P();
                        }
                        m214a("2nd pass");
                        if (r0.f209b.m380p() >= r) {
                            r0.f209b.m369j(r);
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (r0.f209b.m384r() >= mode2) {
                            r0.f209b.m371k(mode2);
                            obj4 = 1;
                        } else {
                            obj4 = obj;
                        }
                        if (obj4 != null) {
                            m214a("3rd pass");
                        }
                    }
                    i7 = i4;
                    for (size = 0; size < i7; size++) {
                        constraintWidget2 = (ConstraintWidget) r0.f215h.get(size);
                        view2 = (View) constraintWidget2.m314B();
                        if (view2 != null && (view2.getMeasuredWidth() != constraintWidget2.m380p() || view2.getMeasuredHeight() != constraintWidget2.m384r())) {
                            if (constraintWidget2.m372l() != 8) {
                                view2.measure(MeasureSpec.makeMeasureSpec(constraintWidget2.m380p(), 1073741824), MeasureSpec.makeMeasureSpec(constraintWidget2.m384r(), 1073741824));
                                if (r0.f227t != null) {
                                    C0098f c0098f2 = r0.f227t;
                                    c0098f2.f345b++;
                                }
                            }
                        }
                    }
                } else {
                    mode = 0;
                }
                i7 = r0.f209b.m380p() + paddingLeft;
                size = r0.f209b.m384r() + paddingTop;
                if (VERSION.SDK_INT < 11) {
                    i8 = resolveSizeAndState(size, i8, mode << 16) & 16777215;
                    i7 = Math.min(r0.f218k, resolveSizeAndState(i7, i, mode) & 16777215);
                    i8 = Math.min(r0.f219l, i8);
                    if (r0.f209b.m24053K()) {
                        i7 |= 16777216;
                    }
                    if (r0.f209b.m24054L()) {
                        i8 |= 16777216;
                    }
                    setMeasuredDimension(i7, i8);
                    r0.f225r = i7;
                    r0.f226s = i8;
                }
                setMeasuredDimension(i7, size);
                r0.f225r = i7;
                r0.f226s = size;
                return;
            }
        }
        if (getChildCount() > 0) {
            m214a("First pass");
        }
        mode = r0.f215h.size();
        paddingTop += getPaddingBottom();
        paddingLeft += getPaddingRight();
        if (mode <= 0) {
            mode = 0;
        } else {
            if (r0.f209b.m318F() != DimensionBehaviour.WRAP_CONTENT) {
            }
            if (r0.f209b.m319G() != DimensionBehaviour.WRAP_CONTENT) {
            }
            r = Math.max(r0.f209b.m380p(), r0.f216i);
            mode2 = Math.max(r0.f209b.m384r(), r0.f217j);
            size = 0;
            obj2 = null;
            i3 = 0;
            while (size < mode) {
                constraintWidget = (ConstraintWidget) r0.f215h.get(size);
                i4 = mode;
                view = (View) constraintWidget.m314B();
                if (view != null) {
                    i6 = r2;
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    i5 = p;
                    if (layoutParams.f181Z) {
                        if (layoutParams.f180Y) {
                            obj3 = obj2;
                            if (view.getVisibility() != 8) {
                                if (obj6 != null) {
                                }
                                if (layoutParams.width == -2) {
                                }
                                p = MeasureSpec.makeMeasureSpec(constraintWidget.m380p(), 1073741824);
                                if (layoutParams.height == -2) {
                                }
                                i7 = MeasureSpec.makeMeasureSpec(constraintWidget.m384r(), 1073741824);
                                view.measure(p, i7);
                                if (r0.f227t != null) {
                                    C0098f c0098f3 = r0.f227t;
                                    c0098f3.f345b++;
                                }
                                i7 = view.getMeasuredWidth();
                                p = view.getMeasuredHeight();
                                if (i7 != constraintWidget.m380p()) {
                                    constraintWidget.m369j(i7);
                                    if (obj6 != null) {
                                        constraintWidget.m366i().m14814a(i7);
                                    }
                                    r = Math.max(r, constraintWidget.m393x() + constraintWidget.mo41a(Type.RIGHT).m304e());
                                    obj3 = 1;
                                }
                                if (p != constraintWidget.m384r()) {
                                    constraintWidget.m371k(p);
                                    if (obj6 != null) {
                                        constraintWidget.m368j().m14814a(p);
                                    }
                                    mode2 = Math.max(mode2, constraintWidget.m394y() + constraintWidget.mo41a(Type.BOTTOM).m304e());
                                    obj3 = 1;
                                }
                                if (layoutParams.f179X) {
                                    i7 = view.getBaseline();
                                    constraintWidget.m383q(i7);
                                    obj3 = 1;
                                }
                                if (VERSION.SDK_INT < 11) {
                                    mode = i3;
                                } else {
                                    i3 = combineMeasuredStates(i3, view.getMeasuredState());
                                }
                                obj2 = obj3;
                                size++;
                                mode = i4;
                                r2 = i6;
                                p = i5;
                                i7 = i;
                            }
                        }
                    }
                    obj3 = obj2;
                } else {
                    i5 = p;
                    obj3 = obj2;
                    i6 = r2;
                }
                i3 = i3;
                obj2 = obj3;
                size++;
                mode = i4;
                r2 = i6;
                p = i5;
                i7 = i;
            }
            i4 = mode;
            i5 = p;
            i6 = r2;
            mode = i3;
            if (obj2 != null) {
                r0.f209b.m369j(i5);
                r0.f209b.m371k(i6);
                if (obj6 != null) {
                    r0.f209b.m24058P();
                }
                m214a("2nd pass");
                if (r0.f209b.m380p() >= r) {
                    obj = null;
                } else {
                    r0.f209b.m369j(r);
                    obj = 1;
                }
                if (r0.f209b.m384r() >= mode2) {
                    obj4 = obj;
                } else {
                    r0.f209b.m371k(mode2);
                    obj4 = 1;
                }
                if (obj4 != null) {
                    m214a("3rd pass");
                }
            }
            i7 = i4;
            for (size = 0; size < i7; size++) {
                constraintWidget2 = (ConstraintWidget) r0.f215h.get(size);
                view2 = (View) constraintWidget2.m314B();
                if (view2 != null) {
                    if (constraintWidget2.m372l() != 8) {
                        view2.measure(MeasureSpec.makeMeasureSpec(constraintWidget2.m380p(), 1073741824), MeasureSpec.makeMeasureSpec(constraintWidget2.m384r(), 1073741824));
                        if (r0.f227t != null) {
                            C0098f c0098f22 = r0.f227t;
                            c0098f22.f345b++;
                        }
                    }
                }
            }
        }
        i7 = r0.f209b.m380p() + paddingLeft;
        size = r0.f209b.m384r() + paddingTop;
        if (VERSION.SDK_INT < 11) {
            setMeasuredDimension(i7, size);
            r0.f225r = i7;
            r0.f226s = size;
            return;
        }
        i8 = resolveSizeAndState(size, i8, mode << 16) & 16777215;
        i7 = Math.min(r0.f218k, resolveSizeAndState(i7, i, mode) & 16777215);
        i8 = Math.min(r0.f219l, i8);
        if (r0.f209b.m24053K()) {
            i7 |= 16777216;
        }
        if (r0.f209b.m24054L()) {
            i8 |= 16777216;
        }
        setMeasuredDimension(i7, i8);
        r0.f225r = i7;
        r0.f226s = i8;
    }

    /* renamed from: c */
    private void m207c(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                i = Math.min(this.f218k, i) - paddingLeft;
            }
            i = 0;
        } else {
            dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                i2 = Math.min(this.f219l, i2) - paddingTop;
            }
            i2 = 0;
        } else {
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        }
        this.f209b.m373l(0);
        this.f209b.m375m(0);
        this.f209b.m331a(dimensionBehaviour);
        this.f209b.m369j(i);
        this.f209b.m344b(dimensionBehaviour2);
        this.f209b.m371k(i2);
        this.f209b.m373l((this.f216i - getPaddingLeft()) - getPaddingRight());
        this.f209b.m375m((this.f217j - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: a */
    protected void m214a(String str) {
        this.f209b.mo3720N();
        if (this.f227t != null) {
            str = this.f227t;
            str.f346c++;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getChildCount();
        i = isInEditMode();
        boolean z2 = false;
        for (boolean z3 = false; z3 < z; z3++) {
            i4 = getChildAt(z3);
            LayoutParams layoutParams = (LayoutParams) i4.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.al;
            if (i4.getVisibility() != 8 || layoutParams.f180Y || layoutParams.f181Z || i != 0) {
                if (!layoutParams.aa) {
                    int t = constraintWidget.m388t();
                    int u = constraintWidget.m390u();
                    int p = constraintWidget.m380p() + t;
                    int r = constraintWidget.m384r() + u;
                    i4.layout(t, u, p, r);
                    if (i4 instanceof Placeholder) {
                        i4 = ((Placeholder) i4).getContent();
                        if (i4 != 0) {
                            i4.setVisibility(0);
                            i4.layout(t, u, p, r);
                        }
                    }
                }
            }
        }
        z = this.f214g.size();
        if (z <= false) {
            while (z2 < z) {
                ((ConstraintHelper) this.f214g.get(z2)).mo30b(this);
                z2++;
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.f209b.mo42a(i);
    }

    public int getOptimizationLevel() {
        return this.f209b.mo40J();
    }

    /* renamed from: a */
    public LayoutParams m210a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected LayoutParams m209a() {
        return new LayoutParams(-2, -2);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(C0090a c0090a) {
        this.f222o = c0090a;
    }

    /* renamed from: a */
    public View m212a(int i) {
        return (View) this.f208a.get(i);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            parseInt = (int) ((((float) parseInt) / 1080.0f) * width);
                            parseInt2 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) parseInt;
                            float f2 = (float) (parseInt + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) parseInt2;
                            float f4 = f;
                            float f5 = f;
                            f = f3;
                            Paint paint2 = paint;
                            float f6 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f, f6, f3, paint3);
                            float f7 = (float) (parseInt2 + parseInt4);
                            f4 = f2;
                            float f8 = f7;
                            canvas2.drawLine(f4, f, f6, f8, paint3);
                            f = f7;
                            f6 = f5;
                            canvas2.drawLine(f4, f, f6, f8, paint3);
                            f4 = f5;
                            canvas2.drawLine(f4, f, f6, f3, paint3);
                            paint = paint2;
                            paint.setColor(-16711936);
                            Paint paint4 = paint;
                            f6 = f2;
                            paint3 = paint4;
                            canvas2.drawLine(f4, f3, f6, f7, paint3);
                            canvas2.drawLine(f4, f7, f6, f3, paint3);
                        }
                    }
                }
            }
        }
        ConstraintLayout constraintLayout = this;
    }

    public void requestLayout() {
        super.requestLayout();
        this.f220m = true;
        this.f225r = -1;
        this.f226s = -1;
        this.f210c = -1;
        this.f211d = -1;
        this.f212e = 0;
        this.f213f = 0;
    }
}
