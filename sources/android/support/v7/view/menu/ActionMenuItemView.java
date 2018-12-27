package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.menu.C0730p.C0729a;
import android.support.v7.view.menu.C3224h.C0724b;
import android.support.v7.widget.ActionMenuView.C0742a;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ac;
import android.support.v7.widget.ba;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

public class ActionMenuItemView extends AppCompatTextView implements C0729a, C0742a, OnClickListener {
    /* renamed from: b */
    C3227j f18492b;
    /* renamed from: c */
    C0724b f18493c;
    /* renamed from: d */
    C0715b f18494d;
    /* renamed from: e */
    private CharSequence f18495e;
    /* renamed from: f */
    private Drawable f18496f;
    /* renamed from: g */
    private ac f18497g;
    /* renamed from: h */
    private boolean f18498h;
    /* renamed from: i */
    private boolean f18499i;
    /* renamed from: j */
    private int f18500j;
    /* renamed from: k */
    private int f18501k;
    /* renamed from: l */
    private int f18502l;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0715b {
        /* renamed from: a */
        public abstract C0732s mo636a();
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C3218a extends ac {
        /* renamed from: a */
        final /* synthetic */ ActionMenuItemView f13508a;

        public C3218a(ActionMenuItemView actionMenuItemView) {
            this.f13508a = actionMenuItemView;
            super(actionMenuItemView);
        }

        /* renamed from: a */
        public C0732s mo581a() {
            return this.f13508a.f18494d != null ? this.f13508a.f18494d.mo636a() : null;
        }

        /* renamed from: b */
        protected boolean mo582b() {
            boolean z = false;
            if (this.f13508a.f18493c == null || !this.f13508a.f18493c.mo583a(this.f13508a.f18492b)) {
                return false;
            }
            C0732s a = mo581a();
            if (a != null && a.mo696f()) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public boolean mo72a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setShortcut(boolean z, char c) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f18498h = m24420e();
        context = context.obtainStyledAttributes(attributeSet, C0636j.ActionMenuItemView, i, 0);
        this.f18500j = context.getDimensionPixelSize(C0636j.ActionMenuItemView_android_minWidth, 0);
        context.recycle();
        this.f18502l = (int) ((resources.getDisplayMetrics().density * 1107296256) + 1056964608);
        setOnClickListener(this);
        this.f18501k = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18498h = m24420e();
        m24421f();
    }

    /* renamed from: e */
    private boolean m24420e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480 && (i < 640 || i2 < 480)) {
            if (configuration.orientation != 2) {
                return false;
            }
        }
        return true;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f18501k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public C3227j getItemData() {
        return this.f18492b;
    }

    /* renamed from: a */
    public void mo71a(C3227j c3227j, int i) {
        this.f18492b = c3227j;
        setIcon(c3227j.getIcon());
        setTitle(c3227j.m16198a((C0729a) this));
        setId(c3227j.getItemId());
        setVisibility(c3227j.isVisible() != 0 ? 0 : 8);
        setEnabled(c3227j.isEnabled());
        if (c3227j.hasSubMenu() != null && this.f18497g == null) {
            this.f18497g = new C3218a(this);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f18492b.hasSubMenu() && this.f18497g != null && this.f18497g.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onClick(View view) {
        if (this.f18493c != null) {
            this.f18493c.mo583a(this.f18492b);
        }
    }

    public void setItemInvoker(C0724b c0724b) {
        this.f18493c = c0724b;
    }

    public void setPopupCallback(C0715b c0715b) {
        this.f18494d = c0715b;
    }

    public void setExpandedFormat(boolean z) {
        if (this.f18499i != z) {
            this.f18499i = z;
            if (this.f18492b) {
                this.f18492b.m16214h();
            }
        }
    }

    /* renamed from: f */
    private void m24421f() {
        int i = 1;
        int isEmpty = TextUtils.isEmpty(this.f18495e) ^ 1;
        if (this.f18496f != null) {
            if (this.f18492b.m16219m()) {
                if (!this.f18498h) {
                    if (this.f18499i) {
                    }
                }
            }
            i = 0;
        }
        isEmpty &= i;
        CharSequence charSequence = null;
        setText(isEmpty != 0 ? this.f18495e : null);
        CharSequence contentDescription = this.f18492b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (isEmpty != 0) {
                contentDescription = null;
            } else {
                contentDescription = this.f18492b.getTitle();
            }
            setContentDescription(contentDescription);
        } else {
            setContentDescription(contentDescription);
        }
        contentDescription = this.f18492b.getTooltipText();
        if (TextUtils.isEmpty(contentDescription)) {
            if (isEmpty == 0) {
                charSequence = this.f18492b.getTitle();
            }
            ba.m3562a(this, charSequence);
            return;
        }
        ba.m3562a(this, contentDescription);
    }

    public void setIcon(Drawable drawable) {
        this.f18496f = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f18502l) {
                f = ((float) this.f18502l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f18502l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f18502l) {
                f = ((float) this.f18502l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f18502l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m24421f();
    }

    /* renamed from: b */
    public boolean m24424b() {
        return TextUtils.isEmpty(getText()) ^ 1;
    }

    public void setTitle(CharSequence charSequence) {
        this.f18495e = charSequence;
        m24421f();
    }

    /* renamed from: c */
    public boolean mo3819c() {
        return m24424b() && this.f18492b.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo3820d() {
        return m24424b();
    }

    protected void onMeasure(int i, int i2) {
        boolean b = m24424b();
        if (b && this.f18501k >= 0) {
            super.setPadding(this.f18501k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        i = mode == Integer.MIN_VALUE ? Math.min(i, this.f18500j) : this.f18500j;
        if (mode != 1073741824 && this.f18500j > 0 && measuredWidth < i) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), i2);
        }
        if (!b && this.f18496f != 0) {
            super.setPadding((getMeasuredWidth() - this.f18496f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
