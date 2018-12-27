package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.C0560r;
import android.support.v4.widget.C0617m;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.menu.C0732s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.lang.reflect.Method;

public class ListPopupWindow implements C0732s {
    /* renamed from: a */
    private static Method f13762a;
    /* renamed from: b */
    private static Method f13763b;
    /* renamed from: h */
    private static Method f13764h;
    /* renamed from: A */
    private Drawable f13765A;
    /* renamed from: B */
    private OnItemClickListener f13766B;
    /* renamed from: C */
    private OnItemSelectedListener f13767C;
    /* renamed from: D */
    private final C0765d f13768D;
    /* renamed from: E */
    private final C0764c f13769E;
    /* renamed from: F */
    private final C0762a f13770F;
    /* renamed from: G */
    private Runnable f13771G;
    /* renamed from: H */
    private final Rect f13772H;
    /* renamed from: I */
    private Rect f13773I;
    /* renamed from: J */
    private boolean f13774J;
    /* renamed from: c */
    C0888z f13775c;
    /* renamed from: d */
    int f13776d;
    /* renamed from: e */
    final C0766e f13777e;
    /* renamed from: f */
    final Handler f13778f;
    /* renamed from: g */
    PopupWindow f13779g;
    /* renamed from: i */
    private Context f13780i;
    /* renamed from: j */
    private ListAdapter f13781j;
    /* renamed from: k */
    private int f13782k;
    /* renamed from: l */
    private int f13783l;
    /* renamed from: m */
    private int f13784m;
    /* renamed from: n */
    private int f13785n;
    /* renamed from: o */
    private int f13786o;
    /* renamed from: p */
    private boolean f13787p;
    /* renamed from: q */
    private boolean f13788q;
    /* renamed from: r */
    private boolean f13789r;
    /* renamed from: s */
    private boolean f13790s;
    /* renamed from: t */
    private int f13791t;
    /* renamed from: u */
    private boolean f13792u;
    /* renamed from: v */
    private boolean f13793v;
    /* renamed from: w */
    private View f13794w;
    /* renamed from: x */
    private int f13795x;
    /* renamed from: y */
    private DataSetObserver f13796y;
    /* renamed from: z */
    private View f13797z;

    /* renamed from: android.support.v7.widget.ListPopupWindow$1 */
    class C07601 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ListPopupWindow f2459a;

        C07601(ListPopupWindow listPopupWindow) {
            this.f2459a = listPopupWindow;
        }

        public void run() {
            View i = this.f2459a.m16437i();
            if (i != null && i.getWindowToken() != null) {
                this.f2459a.mo694d();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$2 */
    class C07612 implements OnItemSelectedListener {
        /* renamed from: a */
        final /* synthetic */ ListPopupWindow f2460a;

        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        C07612(ListPopupWindow listPopupWindow) {
            this.f2460a = listPopupWindow;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                adapterView = this.f2460a.f13775c;
                if (adapterView != null) {
                    adapterView.setListSelectionHidden(null);
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$a */
    private class C0762a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ListPopupWindow f2461a;

        C0762a(ListPopupWindow listPopupWindow) {
            this.f2461a = listPopupWindow;
        }

        public void run() {
            this.f2461a.m16442m();
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$b */
    private class C0763b extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ ListPopupWindow f2462a;

        C0763b(ListPopupWindow listPopupWindow) {
            this.f2462a = listPopupWindow;
        }

        public void onChanged() {
            if (this.f2462a.mo696f()) {
                this.f2462a.mo694d();
            }
        }

        public void onInvalidated() {
            this.f2462a.mo695e();
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$c */
    private class C0764c implements OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ ListPopupWindow f2463a;

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        C0764c(ListPopupWindow listPopupWindow) {
            this.f2463a = listPopupWindow;
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && this.f2463a.m16443n() == null && this.f2463a.f13779g.getContentView() != null) {
                this.f2463a.f13778f.removeCallbacks(this.f2463a.f13777e);
                this.f2463a.f13777e.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$d */
    private class C0765d implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ ListPopupWindow f2464a;

        C0765d(ListPopupWindow listPopupWindow) {
            this.f2464a = listPopupWindow;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            view = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            motionEvent = (int) motionEvent.getY();
            if (view == null && this.f2464a.f13779g != null && this.f2464a.f13779g.isShowing() && x >= 0 && x < this.f2464a.f13779g.getWidth() && motionEvent >= null && motionEvent < this.f2464a.f13779g.getHeight()) {
                this.f2464a.f13778f.postDelayed(this.f2464a.f13777e, 250);
            } else if (view == 1) {
                this.f2464a.f13778f.removeCallbacks(this.f2464a.f13777e);
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$e */
    private class C0766e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ListPopupWindow f2465a;

        C0766e(ListPopupWindow listPopupWindow) {
            this.f2465a = listPopupWindow;
        }

        public void run() {
            if (this.f2465a.f13775c != null && C0560r.m2162A(this.f2465a.f13775c) && this.f2465a.f13775c.getCount() > this.f2465a.f13775c.getChildCount() && this.f2465a.f13775c.getChildCount() <= this.f2465a.f13776d) {
                this.f2465a.f13779g.setInputMethodMode(2);
                this.f2465a.mo694d();
            }
        }
    }

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
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = 1;
        r2 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r3 = "setClipToScreenEnabled";	 Catch:{ NoSuchMethodException -> 0x0013 }
        r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0013 }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0013 }
        f13762a = r2;	 Catch:{ NoSuchMethodException -> 0x0013 }
        goto L_0x001a;
    L_0x0013:
        r2 = "ListPopupWindow";
        r3 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.";
        android.util.Log.i(r2, r3);
    L_0x001a:
        r2 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r3 = "getMaxAvailableHeight";	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4 = 3;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x0035 }
        r5 = android.view.View.class;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r5 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4[r1] = r5;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r5 = 2;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4[r5] = r6;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0035 }
        f13763b = r2;	 Catch:{ NoSuchMethodException -> 0x0035 }
        goto L_0x003c;
    L_0x0035:
        r2 = "ListPopupWindow";
        r3 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.";
        android.util.Log.i(r2, r3);
    L_0x003c:
        r2 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x004d }
        r3 = "setEpicenterBounds";	 Catch:{ NoSuchMethodException -> 0x004d }
        r1 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x004d }
        r4 = android.graphics.Rect.class;	 Catch:{ NoSuchMethodException -> 0x004d }
        r1[r0] = r4;	 Catch:{ NoSuchMethodException -> 0x004d }
        r0 = r2.getDeclaredMethod(r3, r1);	 Catch:{ NoSuchMethodException -> 0x004d }
        f13764h = r0;	 Catch:{ NoSuchMethodException -> 0x004d }
        goto L_0x0054;
    L_0x004d:
        r0 = "ListPopupWindow";
        r1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.";
        android.util.Log.i(r0, r1);
    L_0x0054:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.<clinit>():void");
    }

    public ListPopupWindow(Context context) {
        this(context, null, C0627a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f13782k = -2;
        this.f13783l = -2;
        this.f13786o = 1002;
        this.f13788q = true;
        this.f13791t = 0;
        this.f13792u = false;
        this.f13793v = false;
        this.f13776d = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f13795x = 0;
        this.f13777e = new C0766e(this);
        this.f13768D = new C0765d(this);
        this.f13769E = new C0764c(this);
        this.f13770F = new C0762a(this);
        this.f13772H = new Rect();
        this.f13780i = context;
        this.f13778f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0636j.ListPopupWindow, i, i2);
        this.f13784m = obtainStyledAttributes.getDimensionPixelOffset(C0636j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f13785n = obtainStyledAttributes.getDimensionPixelOffset(C0636j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f13785n != 0) {
            this.f13787p = true;
        }
        obtainStyledAttributes.recycle();
        this.f13779g = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f13779g.setInputMethodMode(1);
    }

    /* renamed from: a */
    public void mo3850a(ListAdapter listAdapter) {
        if (this.f13796y == null) {
            this.f13796y = new C0763b(this);
        } else if (this.f13781j != null) {
            this.f13781j.unregisterDataSetObserver(this.f13796y);
        }
        this.f13781j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13796y);
        }
        if (this.f13775c != null) {
            this.f13775c.setAdapter(this.f13781j);
        }
    }

    /* renamed from: a */
    public void m16415a(int i) {
        this.f13795x = i;
    }

    /* renamed from: a */
    public void m16421a(boolean z) {
        this.f13774J = z;
        this.f13779g.setFocusable(z);
    }

    /* renamed from: c */
    public boolean m16426c() {
        return this.f13774J;
    }

    /* renamed from: h */
    public Drawable m16435h() {
        return this.f13779g.getBackground();
    }

    /* renamed from: a */
    public void m16417a(Drawable drawable) {
        this.f13779g.setBackgroundDrawable(drawable);
    }

    /* renamed from: b */
    public void m16422b(int i) {
        this.f13779g.setAnimationStyle(i);
    }

    /* renamed from: i */
    public View m16437i() {
        return this.f13797z;
    }

    /* renamed from: b */
    public void m16423b(View view) {
        this.f13797z = view;
    }

    /* renamed from: j */
    public int m16439j() {
        return this.f13784m;
    }

    /* renamed from: c */
    public void m16425c(int i) {
        this.f13784m = i;
    }

    /* renamed from: k */
    public int m16440k() {
        if (this.f13787p) {
            return this.f13785n;
        }
        return 0;
    }

    /* renamed from: d */
    public void m16428d(int i) {
        this.f13785n = i;
        this.f13787p = true;
    }

    /* renamed from: a */
    public void m16416a(Rect rect) {
        this.f13773I = rect;
    }

    /* renamed from: e */
    public void m16430e(int i) {
        this.f13791t = i;
    }

    /* renamed from: l */
    public int m16441l() {
        return this.f13783l;
    }

    /* renamed from: f */
    public void m16431f(int i) {
        this.f13783l = i;
    }

    /* renamed from: g */
    public void m16434g(int i) {
        Drawable background = this.f13779g.getBackground();
        if (background != null) {
            background.getPadding(this.f13772H);
            this.f13783l = (this.f13772H.left + this.f13772H.right) + i;
            return;
        }
        m16431f(i);
    }

    /* renamed from: a */
    public void m16418a(OnItemClickListener onItemClickListener) {
        this.f13766B = onItemClickListener;
    }

    /* renamed from: d */
    public void mo694d() {
        int b = mo3851b();
        boolean n = m16443n();
        C0617m.m2464a(this.f13779g, this.f13786o);
        boolean z = true;
        if (!this.f13779g.isShowing()) {
            int i;
            if (this.f13783l == -1) {
                i = -1;
            } else if (this.f13783l == -2) {
                i = m16437i().getWidth();
            } else {
                i = this.f13783l;
            }
            if (this.f13782k == -1) {
                b = -1;
            } else if (this.f13782k != -2) {
                b = this.f13782k;
            }
            this.f13779g.setWidth(i);
            this.f13779g.setHeight(b);
            mo3859c(true);
            PopupWindow popupWindow = this.f13779g;
            n = (this.f13793v || this.f13792u) ? false : true;
            popupWindow.setOutsideTouchable(n);
            this.f13779g.setTouchInterceptor(this.f13768D);
            if (this.f13790s) {
                C0617m.m2466a(this.f13779g, this.f13789r);
            }
            if (f13764h != null) {
                try {
                    f13764h.invoke(this.f13779g, new Object[]{this.f13773I});
                } catch (Throwable e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0617m.m2465a(this.f13779g, m16437i(), this.f13784m, this.f13785n, this.f13791t);
            this.f13775c.setSelection(-1);
            if (!this.f13774J || this.f13775c.isInTouchMode()) {
                m16442m();
            }
            if (!this.f13774J) {
                this.f13778f.post(this.f13770F);
            }
        } else if (C0560r.m2162A(m16437i())) {
            int i2;
            if (this.f13783l == -1) {
                i2 = -1;
            } else if (this.f13783l == -2) {
                i2 = m16437i().getWidth();
            } else {
                i2 = this.f13783l;
            }
            if (this.f13782k == -1) {
                if (!n) {
                    b = -1;
                }
                if (n) {
                    this.f13779g.setWidth(this.f13783l == -1 ? -1 : 0);
                    this.f13779g.setHeight(0);
                } else {
                    this.f13779g.setWidth(this.f13783l == -1 ? -1 : 0);
                    this.f13779g.setHeight(-1);
                }
            } else if (this.f13782k != -2) {
                b = this.f13782k;
            }
            PopupWindow popupWindow2 = this.f13779g;
            if (this.f13793v || this.f13792u) {
                z = false;
            }
            popupWindow2.setOutsideTouchable(z);
            this.f13779g.update(m16437i(), this.f13784m, this.f13785n, i2 < 0 ? -1 : i2, b < 0 ? -1 : b);
        }
    }

    /* renamed from: e */
    public void mo695e() {
        this.f13779g.dismiss();
        mo3849a();
        this.f13779g.setContentView(null);
        this.f13775c = null;
        this.f13778f.removeCallbacks(this.f13777e);
    }

    /* renamed from: a */
    public void m16420a(OnDismissListener onDismissListener) {
        this.f13779g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    private void mo3849a() {
        if (this.f13794w != null) {
            ViewParent parent = this.f13794w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f13794w);
            }
        }
    }

    /* renamed from: h */
    public void m16436h(int i) {
        this.f13779g.setInputMethodMode(i);
    }

    /* renamed from: i */
    public void m16438i(int i) {
        C0888z c0888z = this.f13775c;
        if (mo696f() && c0888z != null) {
            c0888z.setListSelectionHidden(false);
            c0888z.setSelection(i);
            if (c0888z.getChoiceMode() != 0) {
                c0888z.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: m */
    public void m16442m() {
        C0888z c0888z = this.f13775c;
        if (c0888z != null) {
            c0888z.setListSelectionHidden(true);
            c0888z.requestLayout();
        }
    }

    /* renamed from: f */
    public boolean mo696f() {
        return this.f13779g.isShowing();
    }

    /* renamed from: n */
    public boolean m16443n() {
        return this.f13779g.getInputMethodMode() == 2;
    }

    /* renamed from: g */
    public ListView mo697g() {
        return this.f13775c;
    }

    /* renamed from: a */
    C0888z mo3858a(Context context, boolean z) {
        return new C0888z(context, z);
    }

    /* renamed from: b */
    private int mo3851b() {
        int i;
        int i2;
        boolean z = true;
        if (this.f13775c == null) {
            Context context = this.f13780i;
            this.f13771G = new C07601(this);
            this.f13775c = mo3858a(context, this.f13774J ^ true);
            if (this.f13765A != null) {
                this.f13775c.setSelector(this.f13765A);
            }
            this.f13775c.setAdapter(this.f13781j);
            this.f13775c.setOnItemClickListener(this.f13766B);
            this.f13775c.setFocusable(true);
            this.f13775c.setFocusableInTouchMode(true);
            this.f13775c.setOnItemSelectedListener(new C07612(this));
            this.f13775c.setOnScrollListener(this.f13769E);
            if (this.f13767C != null) {
                this.f13775c.setOnItemSelectedListener(this.f13767C);
            }
            View view = this.f13775c;
            View view2 = this.f13794w;
            if (view2 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.f13795x) {
                    case 0:
                        linearLayout.addView(view2);
                        linearLayout.addView(view, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid hint position ");
                        stringBuilder.append(this.f13795x);
                        Log.e("ListPopupWindow", stringBuilder.toString());
                        break;
                }
                if (this.f13783l >= 0) {
                    i = this.f13783l;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i = 0;
                    i2 = 0;
                }
                view2.measure(MeasureSpec.makeMeasureSpec(i, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = (view2.getMeasuredHeight() + layoutParams2.topMargin) + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
            }
            this.f13779g.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f13779g.getContentView();
            View view3 = this.f13794w;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i = (view3.getMeasuredHeight() + layoutParams3.topMargin) + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f13779g.getBackground();
        if (background != null) {
            background.getPadding(this.f13772H);
            i2 = this.f13772H.top + this.f13772H.bottom;
            if (!this.f13787p) {
                this.f13785n = -this.f13772H.top;
            }
        } else {
            this.f13772H.setEmpty();
            i2 = 0;
        }
        if (this.f13779g.getInputMethodMode() != 2) {
            z = false;
        }
        int a = m16410a(m16437i(), this.f13785n, z);
        if (!this.f13792u) {
            if (this.f13782k != -1) {
                int makeMeasureSpec;
                switch (this.f13783l) {
                    case -2:
                        makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f13780i.getResources().getDisplayMetrics().widthPixels - (this.f13772H.left + this.f13772H.right), Integer.MIN_VALUE);
                        break;
                    case -1:
                        makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f13780i.getResources().getDisplayMetrics().widthPixels - (this.f13772H.left + this.f13772H.right), 1073741824);
                        break;
                    default:
                        makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f13783l, 1073741824);
                        break;
                }
                makeMeasureSpec = this.f13775c.mo698a(makeMeasureSpec, 0, -1, a - i, -1);
                if (makeMeasureSpec > 0) {
                    i += i2 + (this.f13775c.getPaddingTop() + this.f13775c.getPaddingBottom());
                }
                return makeMeasureSpec + i;
            }
        }
        return a + i2;
    }

    /* renamed from: b */
    public void m16424b(boolean z) {
        this.f13790s = true;
        this.f13789r = z;
    }

    /* renamed from: c */
    private void mo3859c(boolean r5) {
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
        r4 = this;
        r0 = f13762a;
        if (r0 == 0) goto L_0x001d;
    L_0x0004:
        r0 = f13762a;	 Catch:{ Exception -> 0x0016 }
        r1 = r4.f13779g;	 Catch:{ Exception -> 0x0016 }
        r2 = 1;	 Catch:{ Exception -> 0x0016 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0016 }
        r3 = 0;	 Catch:{ Exception -> 0x0016 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x0016 }
        r2[r3] = r5;	 Catch:{ Exception -> 0x0016 }
        r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0016 }
        goto L_0x001d;
    L_0x0016:
        r5 = "ListPopupWindow";
        r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.";
        android.util.Log.i(r5, r0);
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.c(boolean):void");
    }

    /* renamed from: a */
    private int m16410a(android.view.View r6, int r7, boolean r8) {
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
        r5 = this;
        r0 = f13763b;
        if (r0 == 0) goto L_0x002e;
    L_0x0004:
        r0 = f13763b;	 Catch:{ Exception -> 0x0027 }
        r1 = r5.f13779g;	 Catch:{ Exception -> 0x0027 }
        r2 = 3;	 Catch:{ Exception -> 0x0027 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0027 }
        r3 = 0;	 Catch:{ Exception -> 0x0027 }
        r2[r3] = r6;	 Catch:{ Exception -> 0x0027 }
        r3 = 1;	 Catch:{ Exception -> 0x0027 }
        r4 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x0027 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0027 }
        r3 = 2;	 Catch:{ Exception -> 0x0027 }
        r8 = java.lang.Boolean.valueOf(r8);	 Catch:{ Exception -> 0x0027 }
        r2[r3] = r8;	 Catch:{ Exception -> 0x0027 }
        r8 = r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0027 }
        r8 = (java.lang.Integer) r8;	 Catch:{ Exception -> 0x0027 }
        r8 = r8.intValue();	 Catch:{ Exception -> 0x0027 }
        return r8;
    L_0x0027:
        r8 = "ListPopupWindow";
        r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.";
        android.util.Log.i(r8, r0);
    L_0x002e:
        r8 = r5.f13779g;
        r6 = r8.getMaxAvailableHeight(r6, r7);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.a(android.view.View, int, boolean):int");
    }
}
