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
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.cuvora.carinfo.C1491f.C1488b;
import com.cuvora.carinfo.R;
import java.util.ArrayList;
import java.util.List;

public class ProgressRelativeLayout extends RelativeLayout {
    /* renamed from: A */
    private int f4613A;
    /* renamed from: B */
    private int f4614B;
    /* renamed from: C */
    private int f4615C;
    /* renamed from: D */
    private int f4616D;
    /* renamed from: E */
    private int f4617E;
    /* renamed from: F */
    private int f4618F;
    /* renamed from: G */
    private int f4619G;
    /* renamed from: H */
    private int f4620H;
    /* renamed from: I */
    private int f4621I;
    /* renamed from: J */
    private int f4622J;
    /* renamed from: K */
    private int f4623K;
    /* renamed from: L */
    private int f4624L;
    /* renamed from: M */
    private int f4625M;
    /* renamed from: N */
    private int f4626N;
    /* renamed from: O */
    private String f4627O = "type_content";
    /* renamed from: a */
    private final String f4628a = "type_content";
    /* renamed from: b */
    private final String f4629b = "type_loading";
    /* renamed from: c */
    private final String f4630c = "type_empty";
    /* renamed from: d */
    private final String f4631d = "type_error";
    /* renamed from: e */
    private LayoutInflater f4632e;
    /* renamed from: f */
    private View f4633f;
    /* renamed from: g */
    private LayoutParams f4634g;
    /* renamed from: h */
    private Drawable f4635h;
    /* renamed from: i */
    private List<View> f4636i = new ArrayList();
    /* renamed from: j */
    private RelativeLayout f4637j;
    /* renamed from: k */
    private ProgressBar f4638k;
    /* renamed from: l */
    private RelativeLayout f4639l;
    /* renamed from: m */
    private ImageView f4640m;
    /* renamed from: n */
    private TextView f4641n;
    /* renamed from: o */
    private TextView f4642o;
    /* renamed from: p */
    private RelativeLayout f4643p;
    /* renamed from: q */
    private ImageView f4644q;
    /* renamed from: r */
    private TextView f4645r;
    /* renamed from: s */
    private TextView f4646s;
    /* renamed from: t */
    private Button f4647t;
    /* renamed from: u */
    private int f4648u;
    /* renamed from: v */
    private int f4649v;
    /* renamed from: w */
    private int f4650w;
    /* renamed from: x */
    private int f4651x;
    /* renamed from: y */
    private int f4652y;
    /* renamed from: z */
    private int f4653z;

    public ProgressRelativeLayout(Context context) {
        super(context);
    }

    public ProgressRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5773a(attributeSet);
    }

    public ProgressRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5773a(attributeSet);
    }

    /* renamed from: a */
    private void m5773a(AttributeSet attributeSet) {
        this.f4632e = (LayoutInflater) getContext().getSystemService("layout_inflater");
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C1488b.ProgressActivity);
        this.f4648u = attributeSet.getDimensionPixelSize(19, 108);
        this.f4649v = attributeSet.getDimensionPixelSize(18, 108);
        this.f4650w = attributeSet.getColor(17, -65536);
        this.f4651x = attributeSet.getColor(16, 0);
        this.f4652y = attributeSet.getDimensionPixelSize(4, 308);
        this.f4653z = attributeSet.getDimensionPixelSize(3, 308);
        this.f4613A = attributeSet.getDimensionPixelSize(6, 15);
        this.f4614B = attributeSet.getDimensionPixelSize(2, 14);
        this.f4615C = attributeSet.getColor(5, -16777216);
        this.f4616D = attributeSet.getColor(1, -16777216);
        this.f4617E = attributeSet.getColor(0, 0);
        this.f4618F = attributeSet.getDimensionPixelSize(13, 308);
        this.f4619G = attributeSet.getDimensionPixelSize(12, 308);
        this.f4620H = attributeSet.getDimensionPixelSize(15, 15);
        this.f4621I = attributeSet.getDimensionPixelSize(11, 14);
        this.f4622J = attributeSet.getColor(14, -16777216);
        this.f4623K = attributeSet.getColor(10, -16777216);
        this.f4624L = attributeSet.getColor(9, -16777216);
        this.f4625M = attributeSet.getColor(8, -1);
        this.f4626N = attributeSet.getColor(7, 0);
        attributeSet.recycle();
        this.f4635h = getBackground();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getTag() == 0 || (view.getTag().equals("ProgressActivity.TAG_LOADING") == 0 && view.getTag().equals("ProgressActivity.TAG_EMPTY") == 0 && view.getTag().equals("ProgressActivity.TAG_ERROR") == 0)) {
            this.f4636i.add(view);
        }
    }

    public String getState() {
        return this.f4627O;
    }

    /* renamed from: a */
    private void m5772a() {
        if (this.f4637j == null) {
            this.f4633f = this.f4632e.inflate(R.layout.progress_relative_layout_loading_view, null);
            this.f4637j = (RelativeLayout) this.f4633f.findViewById(R.id.relative_layout_progress);
            this.f4637j.setTag("ProgressActivity.TAG_LOADING");
            this.f4638k = (ProgressBar) this.f4633f.findViewById(R.id.progress_bar_loading);
            this.f4638k.getLayoutParams().width = this.f4648u;
            this.f4638k.getLayoutParams().height = this.f4649v;
            this.f4638k.getIndeterminateDrawable().setColorFilter(this.f4650w, Mode.SRC_IN);
            this.f4638k.requestLayout();
            if (this.f4651x != 0) {
                setBackgroundColor(this.f4651x);
            }
            this.f4634g = new LayoutParams(-1, -1);
            this.f4634g.addRule(13);
            addView(this.f4637j, this.f4634g);
            return;
        }
        this.f4637j.setVisibility(0);
    }

    /* renamed from: b */
    private void m5775b() {
        if (this.f4639l == null) {
            this.f4633f = this.f4632e.inflate(R.layout.progress_relative_layout_empty_view, null);
            this.f4639l = (RelativeLayout) this.f4633f.findViewById(R.id.relative_layout_empty);
            this.f4639l.setTag("ProgressActivity.TAG_EMPTY");
            this.f4640m = (ImageView) this.f4633f.findViewById(R.id.image_icon);
            this.f4641n = (TextView) this.f4633f.findViewById(R.id.text_title);
            this.f4642o = (TextView) this.f4633f.findViewById(R.id.text_content);
            this.f4640m.getLayoutParams().width = this.f4652y;
            this.f4640m.getLayoutParams().height = this.f4653z;
            this.f4640m.requestLayout();
            this.f4641n.setTextSize((float) this.f4613A);
            this.f4642o.setTextSize((float) this.f4614B);
            this.f4641n.setTextColor(this.f4615C);
            this.f4642o.setTextColor(this.f4616D);
            if (this.f4617E != 0) {
                setBackgroundColor(this.f4617E);
            }
            this.f4634g = new LayoutParams(-1, -1);
            this.f4634g.addRule(13);
            addView(this.f4639l, this.f4634g);
            return;
        }
        this.f4639l.setVisibility(0);
    }

    /* renamed from: c */
    private void m5776c() {
        if (this.f4643p == null) {
            this.f4633f = this.f4632e.inflate(R.layout.progress_relative_layout_error_view, null);
            this.f4643p = (RelativeLayout) this.f4633f.findViewById(R.id.relative_layout_error);
            this.f4643p.setTag("ProgressActivity.TAG_ERROR");
            this.f4644q = (ImageView) this.f4633f.findViewById(R.id.image_icon);
            this.f4645r = (TextView) this.f4633f.findViewById(R.id.text_title);
            this.f4646s = (TextView) this.f4633f.findViewById(R.id.text_content);
            this.f4647t = (Button) this.f4633f.findViewById(R.id.button_retry);
            this.f4644q.getLayoutParams().width = this.f4618F;
            this.f4644q.getLayoutParams().height = this.f4619G;
            this.f4644q.requestLayout();
            this.f4645r.setTextSize((float) this.f4620H);
            this.f4646s.setTextSize((float) this.f4621I);
            this.f4645r.setTextColor(this.f4622J);
            this.f4646s.setTextColor(this.f4623K);
            this.f4647t.setTextColor(this.f4624L);
            this.f4647t.getBackground().setColorFilter(new LightingColorFilter(1, this.f4625M));
            if (this.f4626N != 0) {
                setBackgroundColor(this.f4626N);
            }
            this.f4634g = new LayoutParams(-1, -1);
            this.f4634g.addRule(13);
            addView(this.f4643p, this.f4634g);
            return;
        }
        this.f4643p.setVisibility(0);
    }

    private void setContentState(List<Integer> list) {
        m5777d();
        m5778e();
        m5779f();
        m5774a(true, list);
    }

    private void setLoadingState(List<Integer> list) {
        m5778e();
        m5779f();
        m5772a();
        m5774a(false, list);
    }

    private void setEmptyState(List<Integer> list) {
        m5777d();
        m5779f();
        m5775b();
        m5774a(false, list);
    }

    private void setErrorState(List<Integer> list) {
        m5777d();
        m5778e();
        m5776c();
        m5774a(false, list);
    }

    /* renamed from: a */
    private void m5774a(boolean z, List<Integer> list) {
        for (View view : this.f4636i) {
            if (!list.contains(Integer.valueOf(view.getId()))) {
                view.setVisibility(z ? 0 : 8);
            }
        }
    }

    /* renamed from: d */
    private void m5777d() {
        if (this.f4637j != null) {
            this.f4637j.setVisibility(8);
            if (this.f4651x != 0) {
                setBackgroundDrawable(this.f4635h);
            }
        }
    }

    /* renamed from: e */
    private void m5778e() {
        if (this.f4639l != null) {
            this.f4639l.setVisibility(8);
            if (this.f4617E != 0) {
                setBackgroundDrawable(this.f4635h);
            }
        }
    }

    /* renamed from: f */
    private void m5779f() {
        if (this.f4643p != null) {
            this.f4643p.setVisibility(8);
            if (this.f4626N != 0) {
                setBackgroundDrawable(this.f4635h);
            }
        }
    }
}
