package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0557q;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p022c.p023a.C0680b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class AppCompatSpinner extends Spinner implements C0557q {
    /* renamed from: a */
    private static final int[] f13730a = new int[]{16843505};
    /* renamed from: b */
    private final C0859f f13731b;
    /* renamed from: c */
    private final Context f13732c;
    /* renamed from: d */
    private ac f13733d;
    /* renamed from: e */
    private SpinnerAdapter f13734e;
    /* renamed from: f */
    private final boolean f13735f;
    /* renamed from: g */
    private C4467b f13736g;
    /* renamed from: h */
    private int f13737h;
    /* renamed from: i */
    private final Rect f13738i;

    /* renamed from: android.support.v7.widget.AppCompatSpinner$a */
    private static class C0750a implements ListAdapter, SpinnerAdapter {
        /* renamed from: a */
        private SpinnerAdapter f2389a;
        /* renamed from: b */
        private ListAdapter f2390b;

        public int getItemViewType(int i) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public C0750a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f2389a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2390b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof au) {
                au auVar = (au) spinnerAdapter;
                if (auVar.m3536a() == null) {
                    auVar.m3537a(theme);
                }
            }
        }

        public int getCount() {
            return this.f2389a == null ? 0 : this.f2389a.getCount();
        }

        public Object getItem(int i) {
            return this.f2389a == null ? 0 : this.f2389a.getItem(i);
        }

        public long getItemId(int i) {
            return this.f2389a == null ? -1 : this.f2389a.getItemId(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f2389a == null) {
                return 0;
            }
            return this.f2389a.getDropDownView(i, view, viewGroup);
        }

        public boolean hasStableIds() {
            return this.f2389a != null && this.f2389a.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f2389a != null) {
                this.f2389a.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f2389a != null) {
                this.f2389a.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2390b;
            return listAdapter != null ? listAdapter.areAllItemsEnabled() : true;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2390b;
            return listAdapter != null ? listAdapter.isEnabled(i) : true;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* renamed from: android.support.v7.widget.AppCompatSpinner$b */
    private class C4467b extends ListPopupWindow {
        /* renamed from: a */
        ListAdapter f18577a;
        /* renamed from: b */
        final /* synthetic */ AppCompatSpinner f18578b;
        /* renamed from: h */
        private CharSequence f18579h;
        /* renamed from: i */
        private final Rect f18580i = new Rect();

        /* renamed from: android.support.v7.widget.AppCompatSpinner$b$2 */
        class C07522 implements OnGlobalLayoutListener {
            /* renamed from: a */
            final /* synthetic */ C4467b f2393a;

            C07522(C4467b c4467b) {
                this.f2393a = c4467b;
            }

            public void onGlobalLayout() {
                if (this.f2393a.m24533a(this.f2393a.f18578b)) {
                    this.f2393a.mo3851b();
                    super.mo694d();
                    return;
                }
                this.f2393a.mo695e();
            }
        }

        public C4467b(final AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
            this.f18578b = appCompatSpinner;
            super(context, attributeSet, i);
            m16423b((View) appCompatSpinner);
            m16421a(true);
            m16415a((int) null);
            m16418a((OnItemClickListener) new OnItemClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ C4467b f2392b;

                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    this.f2392b.f18578b.setSelection(i);
                    if (this.f2392b.f18578b.getOnItemClickListener() != null) {
                        this.f2392b.f18578b.performItemClick(view, i, this.f2392b.f18577a.getItemId(i));
                    }
                    this.f2392b.mo695e();
                }
            });
        }

        /* renamed from: a */
        public void mo3850a(ListAdapter listAdapter) {
            super.mo3850a(listAdapter);
            this.f18577a = listAdapter;
        }

        /* renamed from: a */
        public CharSequence mo3849a() {
            return this.f18579h;
        }

        /* renamed from: a */
        public void m24532a(CharSequence charSequence) {
            this.f18579h = charSequence;
        }

        /* renamed from: b */
        void mo3851b() {
            int i;
            Drawable h = m16435h();
            int i2 = 0;
            if (h != null) {
                h.getPadding(this.f18578b.f13738i);
                if (bg.m3615a(this.f18578b)) {
                    i = this.f18578b.f13738i.right;
                } else {
                    i = -this.f18578b.f13738i.left;
                }
                i2 = i;
            } else {
                Rect b = this.f18578b.f13738i;
                this.f18578b.f13738i.right = 0;
                b.left = 0;
            }
            i = this.f18578b.getPaddingLeft();
            int paddingRight = this.f18578b.getPaddingRight();
            int width = this.f18578b.getWidth();
            if (this.f18578b.f13737h == -2) {
                int a = this.f18578b.m16316a((SpinnerAdapter) this.f18577a, m16435h());
                int i3 = (this.f18578b.getContext().getResources().getDisplayMetrics().widthPixels - this.f18578b.f13738i.left) - this.f18578b.f13738i.right;
                if (a > i3) {
                    a = i3;
                }
                m16434g(Math.max(a, (width - i) - paddingRight));
            } else if (this.f18578b.f13737h == -1) {
                m16434g((width - i) - paddingRight);
            } else {
                m16434g(this.f18578b.f13737h);
            }
            m16425c(bg.m3615a(this.f18578b) ? i2 + ((width - paddingRight) - m16441l()) : i2 + i);
        }

        /* renamed from: d */
        public void mo694d() {
            boolean f = mo696f();
            mo3851b();
            m16436h(2);
            super.mo694d();
            mo697g().setChoiceMode(1);
            m16438i(this.f18578b.getSelectedItemPosition());
            if (!f) {
                ViewTreeObserver viewTreeObserver = this.f18578b.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final OnGlobalLayoutListener c07522 = new C07522(this);
                    viewTreeObserver.addOnGlobalLayoutListener(c07522);
                    m16420a(new OnDismissListener(this) {
                        /* renamed from: b */
                        final /* synthetic */ C4467b f2395b;

                        public void onDismiss() {
                            ViewTreeObserver viewTreeObserver = this.f2395b.f18578b.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(c07522);
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        boolean m24533a(View view) {
            return (!C0560r.m2162A(view) || view.getGlobalVisibleRect(this.f18580i) == null) ? null : true;
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
        r7 = this;
        r7.<init>(r8, r9, r10);
        r0 = new android.graphics.Rect;
        r0.<init>();
        r7.f13738i = r0;
        r0 = android.support.v7.p020a.C0637a.C0636j.Spinner;
        r1 = 0;
        r0 = android.support.v7.widget.ay.m3543a(r8, r9, r0, r10, r1);
        r2 = new android.support.v7.widget.f;
        r2.<init>(r7);
        r7.f13731b = r2;
        r2 = 0;
        if (r12 == 0) goto L_0x0023;
    L_0x001b:
        r3 = new android.support.v7.view.d;
        r3.<init>(r8, r12);
        r7.f13732c = r3;
        goto L_0x003e;
    L_0x0023:
        r12 = android.support.v7.p020a.C0637a.C0636j.Spinner_popupTheme;
        r12 = r0.m3560g(r12, r1);
        if (r12 == 0) goto L_0x0033;
    L_0x002b:
        r3 = new android.support.v7.view.d;
        r3.<init>(r8, r12);
        r7.f13732c = r3;
        goto L_0x003e;
    L_0x0033:
        r12 = android.os.Build.VERSION.SDK_INT;
        r3 = 23;
        if (r12 >= r3) goto L_0x003b;
    L_0x0039:
        r12 = r8;
        goto L_0x003c;
    L_0x003b:
        r12 = r2;
    L_0x003c:
        r7.f13732c = r12;
    L_0x003e:
        r12 = r7.f13732c;
        r3 = 1;
        if (r12 == 0) goto L_0x00ad;
    L_0x0043:
        r12 = -1;
        if (r11 != r12) goto L_0x0075;
    L_0x0046:
        r12 = f13730a;	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r12 = r8.obtainStyledAttributes(r9, r12, r10, r1);	 Catch:{ Exception -> 0x0062, all -> 0x005f }
        r4 = r12.hasValue(r1);	 Catch:{ Exception -> 0x005d }
        if (r4 == 0) goto L_0x0057;
    L_0x0052:
        r4 = r12.getInt(r1, r1);	 Catch:{ Exception -> 0x005d }
        r11 = r4;
    L_0x0057:
        if (r12 == 0) goto L_0x0075;
    L_0x0059:
        r12.recycle();
        goto L_0x0075;
    L_0x005d:
        r4 = move-exception;
        goto L_0x0064;
    L_0x005f:
        r8 = move-exception;
        r12 = r2;
        goto L_0x006f;
    L_0x0062:
        r4 = move-exception;
        r12 = r2;
    L_0x0064:
        r5 = "AppCompatSpinner";
        r6 = "Could not read android:spinnerMode";
        android.util.Log.i(r5, r6, r4);	 Catch:{ all -> 0x006e }
        if (r12 == 0) goto L_0x0075;
    L_0x006d:
        goto L_0x0059;
    L_0x006e:
        r8 = move-exception;
    L_0x006f:
        if (r12 == 0) goto L_0x0074;
    L_0x0071:
        r12.recycle();
    L_0x0074:
        throw r8;
    L_0x0075:
        if (r11 != r3) goto L_0x00ad;
    L_0x0077:
        r11 = new android.support.v7.widget.AppCompatSpinner$b;
        r12 = r7.f13732c;
        r11.<init>(r7, r12, r9, r10);
        r12 = r7.f13732c;
        r4 = android.support.v7.p020a.C0637a.C0636j.Spinner;
        r12 = android.support.v7.widget.ay.m3543a(r12, r9, r4, r10, r1);
        r1 = android.support.v7.p020a.C0637a.C0636j.Spinner_android_dropDownWidth;
        r4 = -2;
        r1 = r12.m3558f(r1, r4);
        r7.f13737h = r1;
        r1 = android.support.v7.p020a.C0637a.C0636j.Spinner_android_popupBackground;
        r1 = r12.m3547a(r1);
        r11.m16417a(r1);
        r1 = android.support.v7.p020a.C0637a.C0636j.Spinner_android_prompt;
        r1 = r0.m3555d(r1);
        r11.m24532a(r1);
        r12.m3548a();
        r7.f13736g = r11;
        r12 = new android.support.v7.widget.AppCompatSpinner$1;
        r12.<init>(r7, r7, r11);
        r7.f13733d = r12;
    L_0x00ad:
        r11 = android.support.v7.p020a.C0637a.C0636j.Spinner_android_entries;
        r11 = r0.m3559f(r11);
        if (r11 == 0) goto L_0x00c5;
    L_0x00b5:
        r12 = new android.widget.ArrayAdapter;
        r1 = 17367048; // 0x1090008 float:2.5162948E-38 double:8.580462E-317;
        r12.<init>(r8, r1, r11);
        r8 = android.support.v7.p020a.C0637a.C0633g.support_simple_spinner_dropdown_item;
        r12.setDropDownViewResource(r8);
        r7.setAdapter(r12);
    L_0x00c5:
        r0.m3548a();
        r7.f13735f = r3;
        r8 = r7.f13734e;
        if (r8 == 0) goto L_0x00d5;
    L_0x00ce:
        r8 = r7.f13734e;
        r7.setAdapter(r8);
        r7.f13734e = r2;
    L_0x00d5:
        r8 = r7.f13731b;
        r8.m3652a(r9, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public Context getPopupContext() {
        if (this.f13736g != null) {
            return this.f13732c;
        }
        return VERSION.SDK_INT >= 23 ? super.getPopupContext() : null;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f13736g != null) {
            this.f13736g.m16417a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0680b.m2703b(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        if (this.f13736g != null) {
            return this.f13736g.m16435h();
        }
        return VERSION.SDK_INT >= 16 ? super.getPopupBackground() : null;
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f13736g != null) {
            this.f13736g.m16428d(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        if (this.f13736g != null) {
            return this.f13736g.m16440k();
        }
        return VERSION.SDK_INT >= 16 ? super.getDropDownVerticalOffset() : 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f13736g != null) {
            this.f13736g.m16425c(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.f13736g != null) {
            return this.f13736g.m16439j();
        }
        return VERSION.SDK_INT >= 16 ? super.getDropDownHorizontalOffset() : 0;
    }

    public void setDropDownWidth(int i) {
        if (this.f13736g != null) {
            this.f13737h = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.f13736g != null) {
            return this.f13737h;
        }
        return VERSION.SDK_INT >= 16 ? super.getDropDownWidth() : 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f13735f) {
            super.setAdapter(spinnerAdapter);
            if (this.f13736g != null) {
                this.f13736g.mo3850a(new C0750a(spinnerAdapter, (this.f13732c == null ? getContext() : this.f13732c).getTheme()));
            }
            return;
        }
        this.f13734e = spinnerAdapter;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f13736g != null && this.f13736g.mo696f()) {
            this.f13736g.mo695e();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f13733d == null || !this.f13733d.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f13736g != 0 && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m16316a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        if (this.f13736g == null) {
            return super.performClick();
        }
        if (!this.f13736g.mo696f()) {
            this.f13736g.mo694d();
        }
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f13736g != null) {
            this.f13736g.m24532a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        return this.f13736g != null ? this.f13736g.mo3849a() : super.getPrompt();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f13731b != null) {
            this.f13731b.m3648a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f13731b != null) {
            this.f13731b.m3651a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f13731b != null) {
            this.f13731b.m3649a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f13731b != null ? this.f13731b.m3647a() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f13731b != null) {
            this.f13731b.m3650a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f13731b != null ? this.f13731b.m3653b() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f13731b != null) {
            this.f13731b.m3655c();
        }
    }

    /* renamed from: a */
    int m16316a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (max = Math.max(0, max - (15 - (min - max))); max < min; max++) {
            int itemViewType = spinnerAdapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f13738i);
            i2 += this.f13738i.left + this.f13738i.right;
        }
        return i2;
    }
}
