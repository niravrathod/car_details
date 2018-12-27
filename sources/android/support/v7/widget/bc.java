package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.p020a.C0637a.C0630d;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.p020a.C0637a.C0635i;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

class bc {
    /* renamed from: a */
    private final Context f2867a;
    /* renamed from: b */
    private final View f2868b;
    /* renamed from: c */
    private final TextView f2869c;
    /* renamed from: d */
    private final LayoutParams f2870d = new LayoutParams();
    /* renamed from: e */
    private final Rect f2871e = new Rect();
    /* renamed from: f */
    private final int[] f2872f = new int[2];
    /* renamed from: g */
    private final int[] f2873g = new int[2];

    bc(Context context) {
        this.f2867a = context;
        this.f2868b = LayoutInflater.from(this.f2867a).inflate(C0633g.abc_tooltip, null);
        this.f2869c = (TextView) this.f2868b.findViewById(C0632f.message);
        this.f2870d.setTitle(getClass().getSimpleName());
        this.f2870d.packageName = this.f2867a.getPackageName();
        this.f2870d.type = 1002;
        this.f2870d.width = -2;
        this.f2870d.height = -2;
        this.f2870d.format = -3;
        this.f2870d.windowAnimations = C0635i.Animation_AppCompat_Tooltip;
        this.f2870d.flags = 24;
    }

    /* renamed from: a */
    void m3574a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m3575b()) {
            m3573a();
        }
        this.f2869c.setText(charSequence);
        m3572a(view, i, i2, z, this.f2870d);
        ((WindowManager) this.f2867a.getSystemService("window")).addView(this.f2868b, this.f2870d);
    }

    /* renamed from: a */
    void m3573a() {
        if (m3575b()) {
            ((WindowManager) this.f2867a.getSystemService("window")).removeView(this.f2868b);
        }
    }

    /* renamed from: b */
    boolean m3575b() {
        return this.f2868b.getParent() != null;
    }

    /* renamed from: a */
    private void m3572a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2867a.getResources().getDimensionPixelOffset(C0630d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            dimensionPixelOffset = this.f2867a.getResources().getDimensionPixelOffset(C0630d.tooltip_precise_anchor_extra_offset);
            i3 = i2 + dimensionPixelOffset;
            i2 -= dimensionPixelOffset;
        } else {
            i3 = view.getHeight();
            i2 = 0;
        }
        layoutParams.gravity = 49;
        dimensionPixelOffset = this.f2867a.getResources().getDimensionPixelOffset(z ? C0630d.tooltip_y_offset_touch : C0630d.tooltip_y_offset_non_touch);
        View a = m3571a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f2871e);
        if (this.f2871e.left < 0 && this.f2871e.top < 0) {
            Resources resources = this.f2867a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            identifier = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2871e.set(0, identifier, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f2873g);
        view.getLocationOnScreen(this.f2872f);
        view = this.f2872f;
        view[0] = view[0] - this.f2873g[0];
        view = this.f2872f;
        view[1] = view[1] - this.f2873g[1];
        layoutParams.x = (this.f2872f[0] + i) - (a.getWidth() / 2);
        view = MeasureSpec.makeMeasureSpec(0, 0);
        this.f2868b.measure(view, view);
        view = this.f2868b.getMeasuredHeight();
        i = ((this.f2872f[1] + i2) - dimensionPixelOffset) - view;
        i2 = (this.f2872f[1] + i3) + dimensionPixelOffset;
        if (z) {
            if (i >= 0) {
                layoutParams.y = i;
            } else {
                layoutParams.y = i2;
            }
        } else if (view + i2 <= this.f2871e.height()) {
            layoutParams.y = i2;
        } else {
            layoutParams.y = i;
        }
    }

    /* renamed from: a */
    private static View m3571a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (view = view.getContext(); view instanceof ContextWrapper; view = ((ContextWrapper) view).getBaseContext()) {
            if (view instanceof Activity) {
                return ((Activity) view).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
