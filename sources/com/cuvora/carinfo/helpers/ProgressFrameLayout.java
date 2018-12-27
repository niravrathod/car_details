package com.cuvora.carinfo.helpers;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cuvora.carinfo.C1491f.C1488b;
import com.cuvora.carinfo.R;
import java.util.ArrayList;
import java.util.List;

public class ProgressFrameLayout extends FrameLayout {
    /* renamed from: A */
    private int f4531A;
    /* renamed from: B */
    private int f4532B;
    /* renamed from: C */
    private int f4533C;
    /* renamed from: D */
    private int f4534D;
    /* renamed from: E */
    private int f4535E;
    /* renamed from: F */
    private int f4536F;
    /* renamed from: G */
    private int f4537G;
    /* renamed from: H */
    private int f4538H;
    /* renamed from: I */
    private int f4539I;
    /* renamed from: J */
    private int f4540J;
    /* renamed from: K */
    private int f4541K;
    /* renamed from: L */
    private int f4542L;
    /* renamed from: M */
    private int f4543M;
    /* renamed from: N */
    private int f4544N;
    /* renamed from: O */
    private String f4545O = "type_content";
    /* renamed from: a */
    private final String f4546a = "type_content";
    /* renamed from: b */
    private final String f4547b = "type_loading";
    /* renamed from: c */
    private final String f4548c = "type_empty";
    /* renamed from: d */
    private final String f4549d = "type_error";
    /* renamed from: e */
    private LayoutInflater f4550e;
    /* renamed from: f */
    private View f4551f;
    /* renamed from: g */
    private LayoutParams f4552g;
    /* renamed from: h */
    private Drawable f4553h;
    /* renamed from: i */
    private List<View> f4554i = new ArrayList();
    /* renamed from: j */
    private FrameLayout f4555j;
    /* renamed from: k */
    private ProgressBar f4556k;
    /* renamed from: l */
    private FrameLayout f4557l;
    /* renamed from: m */
    private ImageView f4558m;
    /* renamed from: n */
    private TextView f4559n;
    /* renamed from: o */
    private TextView f4560o;
    /* renamed from: p */
    private FrameLayout f4561p;
    /* renamed from: q */
    private ImageView f4562q;
    /* renamed from: r */
    private TextView f4563r;
    /* renamed from: s */
    private TextView f4564s;
    /* renamed from: t */
    private Button f4565t;
    /* renamed from: u */
    private int f4566u;
    /* renamed from: v */
    private int f4567v;
    /* renamed from: w */
    private int f4568w;
    /* renamed from: x */
    private int f4569x;
    /* renamed from: y */
    private int f4570y;
    /* renamed from: z */
    private int f4571z;

    public ProgressFrameLayout(Context context) {
        super(context);
    }

    public ProgressFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5752a(attributeSet);
    }

    public ProgressFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5752a(attributeSet);
    }

    /* renamed from: a */
    private void m5752a(AttributeSet attributeSet) {
        this.f4550e = (LayoutInflater) getContext().getSystemService("layout_inflater");
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C1488b.ProgressActivity);
        this.f4566u = attributeSet.getDimensionPixelSize(19, 108);
        this.f4567v = attributeSet.getDimensionPixelSize(18, 108);
        this.f4568w = attributeSet.getColor(17, -65536);
        this.f4569x = attributeSet.getColor(16, 0);
        this.f4570y = attributeSet.getDimensionPixelSize(4, 308);
        this.f4571z = attributeSet.getDimensionPixelSize(3, 308);
        this.f4531A = attributeSet.getDimensionPixelSize(6, 15);
        this.f4532B = attributeSet.getDimensionPixelSize(2, 14);
        this.f4533C = attributeSet.getColor(5, -16777216);
        this.f4534D = attributeSet.getColor(1, -16777216);
        this.f4535E = attributeSet.getColor(0, 0);
        this.f4536F = attributeSet.getDimensionPixelSize(13, 308);
        this.f4537G = attributeSet.getDimensionPixelSize(12, 308);
        this.f4538H = attributeSet.getDimensionPixelSize(15, 15);
        this.f4539I = attributeSet.getDimensionPixelSize(11, 14);
        this.f4540J = attributeSet.getColor(14, -16777216);
        this.f4541K = attributeSet.getColor(10, -16777216);
        this.f4542L = attributeSet.getColor(9, -16777216);
        this.f4543M = attributeSet.getColor(8, -1);
        this.f4544N = attributeSet.getColor(7, 0);
        attributeSet.recycle();
        this.f4553h = getBackground();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getTag() == 0 || (view.getTag().equals("ProgressActivity.TAG_LOADING") == 0 && view.getTag().equals("ProgressActivity.TAG_EMPTY") == 0 && view.getTag().equals("ProgressActivity.TAG_ERROR") == 0)) {
            this.f4554i.add(view);
        }
    }

    public String getState() {
        return this.f4545O;
    }

    /* renamed from: a */
    private void m5751a() {
        if (this.f4555j == null) {
            this.f4551f = this.f4550e.inflate(R.layout.progress_frame_layout_loading_view, null);
            this.f4555j = (FrameLayout) this.f4551f.findViewById(R.id.frame_layout_progress);
            this.f4555j.setTag("ProgressActivity.TAG_LOADING");
            this.f4556k = (ProgressBar) this.f4551f.findViewById(R.id.progress_bar_loading);
            this.f4556k.getLayoutParams().width = this.f4566u;
            this.f4556k.getLayoutParams().height = this.f4567v;
            this.f4556k.getIndeterminateDrawable().setColorFilter(this.f4568w, Mode.SRC_IN);
            this.f4556k.requestLayout();
            if (this.f4569x != 0) {
                setBackgroundColor(this.f4569x);
            }
            this.f4552g = new LayoutParams(-1, -1);
            this.f4552g.gravity = 13;
            addView(this.f4555j, this.f4552g);
            return;
        }
        this.f4555j.setVisibility(0);
    }

    /* renamed from: b */
    private void m5754b() {
        if (this.f4557l == null) {
            this.f4551f = this.f4550e.inflate(R.layout.progress_frame_layout_empty_view, null);
            this.f4557l = (FrameLayout) this.f4551f.findViewById(R.id.frame_layout_empty);
            this.f4557l.setTag("ProgressActivity.TAG_EMPTY");
            this.f4558m = (ImageView) this.f4551f.findViewById(R.id.image_icon);
            this.f4559n = (TextView) this.f4551f.findViewById(R.id.text_title);
            this.f4560o = (TextView) this.f4551f.findViewById(R.id.text_content);
            this.f4558m.getLayoutParams().width = this.f4570y;
            this.f4558m.getLayoutParams().height = this.f4571z;
            this.f4558m.requestLayout();
            this.f4559n.setTextSize((float) this.f4531A);
            this.f4560o.setTextSize((float) this.f4532B);
            this.f4559n.setTextColor(this.f4533C);
            this.f4560o.setTextColor(this.f4534D);
            if (this.f4535E != 0) {
                setBackgroundColor(this.f4535E);
            }
            this.f4552g = new LayoutParams(-1, -1);
            this.f4552g.gravity = 13;
            addView(this.f4557l, this.f4552g);
            return;
        }
        this.f4557l.setVisibility(0);
    }

    /* renamed from: c */
    private void m5755c() {
        if (this.f4561p == null) {
            this.f4551f = this.f4550e.inflate(R.layout.progress_frame_layout_error_view, null);
            this.f4561p = (FrameLayout) this.f4551f.findViewById(R.id.frame_layout_error);
            this.f4561p.setTag("ProgressActivity.TAG_ERROR");
            this.f4562q = (ImageView) this.f4551f.findViewById(R.id.image_icon);
            this.f4563r = (TextView) this.f4551f.findViewById(R.id.text_title);
            this.f4564s = (TextView) this.f4551f.findViewById(R.id.text_content);
            this.f4565t = (Button) this.f4551f.findViewById(R.id.button_retry);
            this.f4562q.getLayoutParams().width = this.f4536F;
            this.f4562q.getLayoutParams().height = this.f4537G;
            this.f4562q.requestLayout();
            this.f4563r.setTextSize((float) this.f4538H);
            this.f4564s.setTextSize((float) this.f4539I);
            this.f4563r.setTextColor(this.f4540J);
            this.f4564s.setTextColor(this.f4541K);
            this.f4565t.setTextColor(this.f4542L);
            this.f4565t.getBackground().setColorFilter(new LightingColorFilter(1, this.f4543M));
            if (this.f4544N != 0) {
                setBackgroundColor(this.f4544N);
            }
            this.f4552g = new LayoutParams(-1, -1);
            this.f4552g.gravity = 13;
            addView(this.f4561p, this.f4552g);
            return;
        }
        this.f4561p.setVisibility(0);
    }

    private void setContentState(List<Integer> list) {
        m5756d();
        m5757e();
        m5758f();
        m5753a(true, list);
    }

    private void setLoadingState(List<Integer> list) {
        m5757e();
        m5758f();
        m5751a();
        m5753a(false, list);
    }

    private void setEmptyState(List<Integer> list) {
        m5756d();
        m5758f();
        m5754b();
        m5753a(false, list);
    }

    private void setErrorState(List<Integer> list) {
        m5756d();
        m5757e();
        m5755c();
        m5753a(false, list);
    }

    /* renamed from: a */
    private void m5753a(boolean z, List<Integer> list) {
        for (View view : this.f4554i) {
            if (!list.contains(Integer.valueOf(view.getId()))) {
                view.setVisibility(z ? 0 : 8);
            }
        }
    }

    /* renamed from: d */
    private void m5756d() {
        if (this.f4555j != null) {
            this.f4555j.setVisibility(8);
            if (this.f4569x != 0) {
                setBackgroundDrawable(this.f4553h);
            }
        }
    }

    /* renamed from: e */
    private void m5757e() {
        if (this.f4557l != null) {
            this.f4557l.setVisibility(8);
            if (this.f4535E != 0) {
                setBackgroundDrawable(this.f4553h);
            }
        }
    }

    /* renamed from: f */
    private void m5758f() {
        if (this.f4561p != null) {
            this.f4561p.setVisibility(8);
            if (this.f4544N != 0) {
                setBackgroundDrawable(this.f4553h);
            }
        }
    }
}
