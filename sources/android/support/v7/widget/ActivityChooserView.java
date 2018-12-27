package android.support.v7.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0542b;
import android.support.v4.view.p018a.C0532b;
import android.support.v7.p020a.C0637a.C0630d;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.p020a.C0637a.C0634h;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.menu.C0732s;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class ActivityChooserView extends ViewGroup {
    /* renamed from: a */
    final C0748a f2365a;
    /* renamed from: b */
    final FrameLayout f2366b;
    /* renamed from: c */
    final FrameLayout f2367c;
    /* renamed from: d */
    C0542b f2368d;
    /* renamed from: e */
    final DataSetObserver f2369e;
    /* renamed from: f */
    OnDismissListener f2370f;
    /* renamed from: g */
    boolean f2371g;
    /* renamed from: h */
    int f2372h;
    /* renamed from: i */
    private final C0749b f2373i;
    /* renamed from: j */
    private final View f2374j;
    /* renamed from: k */
    private final Drawable f2375k;
    /* renamed from: l */
    private final ImageView f2376l;
    /* renamed from: m */
    private final ImageView f2377m;
    /* renamed from: n */
    private final int f2378n;
    /* renamed from: o */
    private final OnGlobalLayoutListener f2379o;
    /* renamed from: p */
    private ListPopupWindow f2380p;
    /* renamed from: q */
    private boolean f2381q;
    /* renamed from: r */
    private int f2382r;

    /* renamed from: android.support.v7.widget.ActivityChooserView$1 */
    class C07441 extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2353a;

        C07441(ActivityChooserView activityChooserView) {
            this.f2353a = activityChooserView;
        }

        public void onChanged() {
            super.onChanged();
            this.f2353a.f2365a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            this.f2353a.f2365a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$2 */
    class C07452 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2354a;

        C07452(ActivityChooserView activityChooserView) {
            this.f2354a = activityChooserView;
        }

        public void onGlobalLayout() {
            if (!this.f2354a.m2884c()) {
                return;
            }
            if (this.f2354a.isShown()) {
                this.f2354a.getListPopupWindow().mo694d();
                if (this.f2354a.f2368d != null) {
                    this.f2354a.f2368d.m2031a(true);
                    return;
                }
                return;
            }
            this.f2354a.getListPopupWindow().mo695e();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$3 */
    class C07463 extends AccessibilityDelegate {
        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2355a;

        C07463(ActivityChooserView activityChooserView) {
            this.f2355a = activityChooserView;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C0532b.m1951a(accessibilityNodeInfo).m1995m(true);
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$5 */
    class C07475 extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2356a;

        C07475(ActivityChooserView activityChooserView) {
            this.f2356a = activityChooserView;
        }

        public void onChanged() {
            super.onChanged();
            this.f2356a.m2885d();
        }
    }

    public static class InnerLayout extends LinearLayout {
        /* renamed from: a */
        private static final int[] f2357a = new int[]{16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = ay.m3542a(context, attributeSet, f2357a);
            setBackgroundDrawable(context.m3547a(null));
            context.m3548a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C0748a extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2358a;
        /* renamed from: b */
        private C0856d f2359b;
        /* renamed from: c */
        private int f2360c = 4;
        /* renamed from: d */
        private boolean f2361d;
        /* renamed from: e */
        private boolean f2362e;
        /* renamed from: f */
        private boolean f2363f;

        public long getItemId(int i) {
            return (long) i;
        }

        public int getViewTypeCount() {
            return 3;
        }

        C0748a(ActivityChooserView activityChooserView) {
            this.f2358a = activityChooserView;
        }

        /* renamed from: a */
        public void m2872a(C0856d c0856d) {
            C0856d e = this.f2358a.f2365a.m2878e();
            if (e != null && this.f2358a.isShown()) {
                e.unregisterObserver(this.f2358a.f2369e);
            }
            this.f2359b = c0856d;
            if (c0856d != null && this.f2358a.isShown()) {
                c0856d.registerObserver(this.f2358a.f2369e);
            }
            notifyDataSetChanged();
        }

        public int getItemViewType(int i) {
            return (this.f2363f && i == getCount() - 1) ? 1 : 0;
        }

        public int getCount() {
            int a = this.f2359b.m3629a();
            if (!(this.f2361d || this.f2359b.m3633b() == null)) {
                a--;
            }
            a = Math.min(a, this.f2360c);
            return this.f2363f ? a + 1 : a;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!(this.f2361d || this.f2359b.m3633b() == null)) {
                        i++;
                    }
                    return this.f2359b.m3631a(i);
                case 1:
                    return 0;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0632f.list_item) {
                        view = LayoutInflater.from(this.f2358a.getContext()).inflate(C0633g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    viewGroup = this.f2358a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0632f.icon)).setImageDrawable(resolveInfo.loadIcon(viewGroup));
                    ((TextView) view.findViewById(C0632f.title)).setText(resolveInfo.loadLabel(viewGroup));
                    if (this.f2361d == null || i != 0 || this.f2362e == 0) {
                        view.setActivated(false);
                    } else {
                        view.setActivated(true);
                    }
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        view = LayoutInflater.from(this.f2358a.getContext()).inflate(C0633g.abc_activity_chooser_view_list_item, viewGroup, false);
                        view.setId(1);
                        ((TextView) view.findViewById(C0632f.title)).setText(this.f2358a.getContext().getString(C0634h.abc_activity_chooser_view_see_all));
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public int m2870a() {
            int i = this.f2360c;
            this.f2360c = BaseClientBuilder.API_PRIORITY_OTHER;
            int i2 = 0;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i3 = 0;
            while (i2 < count) {
                view = getView(i2, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, view.getMeasuredWidth());
                i2++;
            }
            this.f2360c = i;
            return i3;
        }

        /* renamed from: a */
        public void m2871a(int i) {
            if (this.f2360c != i) {
                this.f2360c = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo m2875b() {
            return this.f2359b.m3633b();
        }

        /* renamed from: a */
        public void m2873a(boolean z) {
            if (this.f2363f != z) {
                this.f2363f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: c */
        public int m2876c() {
            return this.f2359b.m3629a();
        }

        /* renamed from: d */
        public int m2877d() {
            return this.f2359b.m3634c();
        }

        /* renamed from: e */
        public C0856d m2878e() {
            return this.f2359b;
        }

        /* renamed from: a */
        public void m2874a(boolean z, boolean z2) {
            if (this.f2361d != z || this.f2362e != z2) {
                this.f2361d = z;
                this.f2362e = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: f */
        public boolean m2879f() {
            return this.f2361d;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class C0749b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2364a;

        C0749b(ActivityChooserView activityChooserView) {
            this.f2364a = activityChooserView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0748a) adapterView.getAdapter()).getItemViewType(i)) {
                case null:
                    this.f2364a.m2883b();
                    if (this.f2364a.f2371g == null) {
                        if (this.f2364a.f2365a.m2879f() == null) {
                            i++;
                        }
                        adapterView = this.f2364a.f2365a.m2878e().m3632b(i);
                        if (adapterView != null) {
                            adapterView.addFlags(524288);
                            this.f2364a.getContext().startActivity(adapterView);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        this.f2364a.f2365a.m2878e().m3635c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    this.f2364a.m2881a(BaseClientBuilder.API_PRIORITY_OTHER);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public void onClick(View view) {
            if (view == this.f2364a.f2367c) {
                this.f2364a.m2883b();
                view = this.f2364a.f2365a.m2878e().m3632b(this.f2364a.f2365a.m2878e().m3630a(this.f2364a.f2365a.m2875b()));
                if (view != null) {
                    view.addFlags(524288);
                    this.f2364a.getContext().startActivity(view);
                }
            } else if (view == this.f2364a.f2366b) {
                this.f2364a.f2371g = false;
                this.f2364a.m2881a(this.f2364a.f2372h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == this.f2364a.f2367c) {
                if (this.f2364a.f2365a.getCount() > null) {
                    this.f2364a.f2371g = true;
                    this.f2364a.m2881a(this.f2364a.f2372h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public void onDismiss() {
            m2880a();
            if (this.f2364a.f2368d != null) {
                this.f2364a.f2368d.m2031a(false);
            }
        }

        /* renamed from: a */
        private void m2880a() {
            if (this.f2364a.f2370f != null) {
                this.f2364a.f2370f.onDismiss();
            }
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2369e = new C07441(this);
        this.f2379o = new C07452(this);
        this.f2372h = 4;
        attributeSet = context.obtainStyledAttributes(attributeSet, C0636j.ActivityChooserView, i, 0);
        this.f2372h = attributeSet.getInt(C0636j.ActivityChooserView_initialActivityCount, 4);
        i = attributeSet.getDrawable(C0636j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        attributeSet.recycle();
        LayoutInflater.from(getContext()).inflate(C0633g.abc_activity_chooser_view, this, true);
        this.f2373i = new C0749b(this);
        this.f2374j = findViewById(C0632f.activity_chooser_view_content);
        this.f2375k = this.f2374j.getBackground();
        this.f2367c = (FrameLayout) findViewById(C0632f.default_activity_button);
        this.f2367c.setOnClickListener(this.f2373i);
        this.f2367c.setOnLongClickListener(this.f2373i);
        this.f2377m = (ImageView) this.f2367c.findViewById(C0632f.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0632f.expand_activities_button);
        frameLayout.setOnClickListener(this.f2373i);
        frameLayout.setAccessibilityDelegate(new C07463(this));
        frameLayout.setOnTouchListener(new ac(this, frameLayout) {
            /* renamed from: a */
            final /* synthetic */ ActivityChooserView f13710a;

            /* renamed from: a */
            public C0732s mo581a() {
                return this.f13710a.getListPopupWindow();
            }

            /* renamed from: b */
            protected boolean mo582b() {
                this.f13710a.m2882a();
                return true;
            }

            /* renamed from: c */
            protected boolean mo637c() {
                this.f13710a.m2883b();
                return true;
            }
        });
        this.f2366b = frameLayout;
        this.f2376l = (ImageView) frameLayout.findViewById(C0632f.image);
        this.f2376l.setImageDrawable(i);
        this.f2365a = new C0748a(this);
        this.f2365a.registerDataSetObserver(new C07475(this));
        context = context.getResources();
        this.f2378n = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(C0630d.abc_config_prefDialogWidth));
    }

    public void setActivityChooserModel(C0856d c0856d) {
        this.f2365a.m2872a(c0856d);
        if (m2884c() != null) {
            m2883b();
            m2882a();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2376l.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f2376l.setContentDescription(getContext().getString(i));
    }

    public void setProvider(C0542b c0542b) {
        this.f2368d = c0542b;
    }

    /* renamed from: a */
    public boolean m2882a() {
        if (!m2884c()) {
            if (this.f2381q) {
                this.f2371g = false;
                m2881a(this.f2372h);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    void m2881a(int i) {
        if (this.f2365a.m2878e() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f2379o);
            boolean z = this.f2367c.getVisibility() == 0;
            int c = this.f2365a.m2876c();
            if (i == BaseClientBuilder.API_PRIORITY_OTHER || c <= i + z) {
                this.f2365a.m2873a(false);
                this.f2365a.m2871a(i);
            } else {
                this.f2365a.m2873a(true);
                this.f2365a.m2871a(i - 1);
            }
            i = getListPopupWindow();
            if (!i.mo696f()) {
                if (!this.f2371g) {
                    if (z) {
                        this.f2365a.m2874a(false, false);
                        i.m16434g(Math.min(this.f2365a.m2870a(), this.f2378n));
                        i.mo694d();
                        if (this.f2368d != null) {
                            this.f2368d.m2031a(true);
                        }
                        i.mo697g().setContentDescription(getContext().getString(C0634h.abc_activitychooserview_choose_application));
                        i.mo697g().setSelector(new ColorDrawable(0));
                        return;
                    }
                }
                this.f2365a.m2874a(true, z);
                i.m16434g(Math.min(this.f2365a.m2870a(), this.f2378n));
                i.mo694d();
                if (this.f2368d != null) {
                    this.f2368d.m2031a(true);
                }
                i.mo697g().setContentDescription(getContext().getString(C0634h.abc_activitychooserview_choose_application));
                i.mo697g().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: b */
    public boolean m2883b() {
        if (m2884c()) {
            getListPopupWindow().mo695e();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f2379o);
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean m2884c() {
        return getListPopupWindow().mo696f();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0856d e = this.f2365a.m2878e();
        if (e != null) {
            e.registerObserver(this.f2369e);
        }
        this.f2381q = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0856d e = this.f2365a.m2878e();
        if (e != null) {
            e.unregisterObserver(this.f2369e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2379o);
        }
        if (m2884c()) {
            m2883b();
        }
        this.f2381q = false;
    }

    protected void onMeasure(int i, int i2) {
        View view = this.f2374j;
        if (this.f2367c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2374j.layout(0, 0, i3 - i, i4 - i2);
        if (!m2884c()) {
            m2883b();
        }
    }

    public C0856d getDataModel() {
        return this.f2365a.m2878e();
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f2370f = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.f2372h = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f2382r = i;
    }

    ListPopupWindow getListPopupWindow() {
        if (this.f2380p == null) {
            this.f2380p = new ListPopupWindow(getContext());
            this.f2380p.mo3850a(this.f2365a);
            this.f2380p.m16423b((View) this);
            this.f2380p.m16421a(true);
            this.f2380p.m16418a(this.f2373i);
            this.f2380p.m16420a(this.f2373i);
        }
        return this.f2380p;
    }

    /* renamed from: d */
    void m2885d() {
        if (this.f2365a.getCount() > 0) {
            this.f2366b.setEnabled(true);
        } else {
            this.f2366b.setEnabled(false);
        }
        int c = this.f2365a.m2876c();
        int d = this.f2365a.m2877d();
        if (c != 1) {
            if (c <= 1 || d <= 0) {
                this.f2367c.setVisibility(8);
                if (this.f2367c.getVisibility() != 0) {
                    this.f2374j.setBackgroundDrawable(this.f2375k);
                } else {
                    this.f2374j.setBackgroundDrawable(null);
                }
            }
        }
        this.f2367c.setVisibility(0);
        ResolveInfo b = this.f2365a.m2875b();
        PackageManager packageManager = getContext().getPackageManager();
        this.f2377m.setImageDrawable(b.loadIcon(packageManager));
        if (this.f2382r != 0) {
            CharSequence loadLabel = b.loadLabel(packageManager);
            this.f2367c.setContentDescription(getContext().getString(this.f2382r, new Object[]{loadLabel}));
        }
        if (this.f2367c.getVisibility() != 0) {
            this.f2374j.setBackgroundDrawable(null);
        } else {
            this.f2374j.setBackgroundDrawable(this.f2375k);
        }
    }
}
