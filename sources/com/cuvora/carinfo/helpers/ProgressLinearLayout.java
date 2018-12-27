package com.cuvora.carinfo.helpers;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cuvora.carinfo.C1491f.C1488b;
import com.cuvora.carinfo.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgressLinearLayout extends LinearLayout {
    /* renamed from: A */
    private int f4572A;
    /* renamed from: B */
    private int f4573B;
    /* renamed from: C */
    private int f4574C;
    /* renamed from: D */
    private int f4575D;
    /* renamed from: E */
    private int f4576E;
    /* renamed from: F */
    private int f4577F;
    /* renamed from: G */
    private int f4578G;
    /* renamed from: H */
    private int f4579H;
    /* renamed from: I */
    private int f4580I;
    /* renamed from: J */
    private int f4581J;
    /* renamed from: K */
    private int f4582K;
    /* renamed from: L */
    private int f4583L;
    /* renamed from: M */
    private int f4584M;
    /* renamed from: N */
    private int f4585N;
    /* renamed from: O */
    private String f4586O = "type_content";
    /* renamed from: a */
    private final String f4587a = "type_content";
    /* renamed from: b */
    private final String f4588b = "type_loading";
    /* renamed from: c */
    private final String f4589c = "type_empty";
    /* renamed from: d */
    private final String f4590d = "type_error";
    /* renamed from: e */
    private LayoutInflater f4591e;
    /* renamed from: f */
    private View f4592f;
    /* renamed from: g */
    private LayoutParams f4593g;
    /* renamed from: h */
    private Drawable f4594h;
    /* renamed from: i */
    private List<View> f4595i = new ArrayList();
    /* renamed from: j */
    private LinearLayout f4596j;
    /* renamed from: k */
    private ProgressBar f4597k;
    /* renamed from: l */
    private LinearLayout f4598l;
    /* renamed from: m */
    private ImageView f4599m;
    /* renamed from: n */
    private TextView f4600n;
    /* renamed from: o */
    private TextView f4601o;
    /* renamed from: p */
    private LinearLayout f4602p;
    /* renamed from: q */
    private ImageView f4603q;
    /* renamed from: r */
    private TextView f4604r;
    /* renamed from: s */
    private TextView f4605s;
    /* renamed from: t */
    private Button f4606t;
    /* renamed from: u */
    private int f4607u;
    /* renamed from: v */
    private int f4608v;
    /* renamed from: w */
    private int f4609w;
    /* renamed from: x */
    private int f4610x;
    /* renamed from: y */
    private int f4611y;
    /* renamed from: z */
    private int f4612z;

    public ProgressLinearLayout(Context context) {
        super(context);
    }

    public ProgressLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5759a(attributeSet);
    }

    public ProgressLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5759a(attributeSet);
    }

    /* renamed from: a */
    private void m5759a(AttributeSet attributeSet) {
        this.f4591e = (LayoutInflater) getContext().getSystemService("layout_inflater");
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C1488b.ProgressActivity);
        this.f4607u = attributeSet.getDimensionPixelSize(19, 108);
        this.f4608v = attributeSet.getDimensionPixelSize(18, 108);
        this.f4609w = attributeSet.getColor(17, -65536);
        this.f4610x = attributeSet.getColor(16, 0);
        this.f4611y = attributeSet.getDimensionPixelSize(4, 308);
        this.f4612z = attributeSet.getDimensionPixelSize(3, 308);
        this.f4572A = attributeSet.getDimensionPixelSize(6, 15);
        this.f4573B = attributeSet.getDimensionPixelSize(2, 14);
        this.f4574C = attributeSet.getColor(5, -16777216);
        this.f4575D = attributeSet.getColor(1, -16777216);
        this.f4576E = attributeSet.getColor(0, 0);
        this.f4577F = attributeSet.getDimensionPixelSize(13, 308);
        this.f4578G = attributeSet.getDimensionPixelSize(12, 308);
        this.f4579H = attributeSet.getDimensionPixelSize(15, 15);
        this.f4580I = attributeSet.getDimensionPixelSize(11, 14);
        this.f4581J = attributeSet.getColor(14, -16777216);
        this.f4582K = attributeSet.getColor(10, -16777216);
        this.f4583L = attributeSet.getColor(9, -16777216);
        this.f4584M = attributeSet.getColor(8, -1);
        this.f4585N = attributeSet.getColor(7, 0);
        attributeSet.recycle();
        this.f4594h = getBackground();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getTag() == 0 || (view.getTag().equals("ProgressActivity.TAG_LOADING") == 0 && view.getTag().equals("ProgressActivity.TAG_EMPTY") == 0 && view.getTag().equals("ProgressActivity.TAG_ERROR") == 0)) {
            this.f4595i.add(view);
        }
    }

    /* renamed from: a */
    public void m5769a() {
        m5760a("type_content", 0, null, null, null, null, Collections.emptyList());
    }

    /* renamed from: a */
    public void m5771a(List<Integer> list) {
        m5760a("type_loading", 0, null, null, null, null, (List) list);
    }

    /* renamed from: a */
    public void m5770a(Drawable drawable, String str, String str2, String str3, OnClickListener onClickListener, List<Integer> list) {
        m5761a("type_error", drawable, str, str2, str3, onClickListener, (List) list);
    }

    public String getState() {
        return this.f4586O;
    }

    /* renamed from: a */
    private void m5761a(String str, Drawable drawable, String str2, String str3, String str4, OnClickListener onClickListener, List<Integer> list) {
        this.f4586O = str;
        int hashCode = str.hashCode();
        if (hashCode != -1093164024) {
            if (hashCode != -1093013309) {
                if (hashCode != -598131401) {
                    if (hashCode == 16748660) {
                        if (str.equals("type_content") != null) {
                            str = null;
                            switch (str) {
                                case null:
                                    setContentState(list);
                                    return;
                                case 1:
                                    setLoadingState(list);
                                    return;
                                case 2:
                                    setEmptyState(list);
                                    this.f4599m.setImageDrawable(drawable);
                                    this.f4600n.setText(str2);
                                    this.f4601o.setText(str3);
                                    return;
                                case 3:
                                    setErrorState(list);
                                    this.f4603q.setImageDrawable(drawable);
                                    this.f4604r.setText(str2);
                                    this.f4605s.setText(str3);
                                    this.f4606t.setText(str4);
                                    this.f4606t.setOnClickListener(onClickListener);
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                } else if (str.equals("type_loading") != null) {
                    str = true;
                    switch (str) {
                        case null:
                            setContentState(list);
                            return;
                        case 1:
                            setLoadingState(list);
                            return;
                        case 2:
                            setEmptyState(list);
                            this.f4599m.setImageDrawable(drawable);
                            this.f4600n.setText(str2);
                            this.f4601o.setText(str3);
                            return;
                        case 3:
                            setErrorState(list);
                            this.f4603q.setImageDrawable(drawable);
                            this.f4604r.setText(str2);
                            this.f4605s.setText(str3);
                            this.f4606t.setText(str4);
                            this.f4606t.setOnClickListener(onClickListener);
                            return;
                        default:
                            return;
                    }
                }
            } else if (str.equals("type_error") != null) {
                str = 3;
                switch (str) {
                    case null:
                        setContentState(list);
                        return;
                    case 1:
                        setLoadingState(list);
                        return;
                    case 2:
                        setEmptyState(list);
                        this.f4599m.setImageDrawable(drawable);
                        this.f4600n.setText(str2);
                        this.f4601o.setText(str3);
                        return;
                    case 3:
                        setErrorState(list);
                        this.f4603q.setImageDrawable(drawable);
                        this.f4604r.setText(str2);
                        this.f4605s.setText(str3);
                        this.f4606t.setText(str4);
                        this.f4606t.setOnClickListener(onClickListener);
                        return;
                    default:
                        return;
                }
            }
        } else if (str.equals("type_empty") != null) {
            str = 2;
            switch (str) {
                case null:
                    setContentState(list);
                    return;
                case 1:
                    setLoadingState(list);
                    return;
                case 2:
                    setEmptyState(list);
                    this.f4599m.setImageDrawable(drawable);
                    this.f4600n.setText(str2);
                    this.f4601o.setText(str3);
                    return;
                case 3:
                    setErrorState(list);
                    this.f4603q.setImageDrawable(drawable);
                    this.f4604r.setText(str2);
                    this.f4605s.setText(str3);
                    this.f4606t.setText(str4);
                    this.f4606t.setOnClickListener(onClickListener);
                    return;
                default:
                    return;
            }
        }
        str = -1;
        switch (str) {
            case null:
                setContentState(list);
                return;
            case 1:
                setLoadingState(list);
                return;
            case 2:
                setEmptyState(list);
                this.f4599m.setImageDrawable(drawable);
                this.f4600n.setText(str2);
                this.f4601o.setText(str3);
                return;
            case 3:
                setErrorState(list);
                this.f4603q.setImageDrawable(drawable);
                this.f4604r.setText(str2);
                this.f4605s.setText(str3);
                this.f4606t.setText(str4);
                this.f4606t.setOnClickListener(onClickListener);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m5760a(String str, int i, String str2, String str3, String str4, OnClickListener onClickListener, List<Integer> list) {
        this.f4586O = str;
        int hashCode = str.hashCode();
        if (hashCode != -1093164024) {
            if (hashCode != -1093013309) {
                if (hashCode != -598131401) {
                    if (hashCode == 16748660) {
                        if (str.equals("type_content") != null) {
                            str = null;
                            switch (str) {
                                case null:
                                    setContentState(list);
                                    return;
                                case 1:
                                    setLoadingState(list);
                                    return;
                                case 2:
                                    setEmptyState(list);
                                    this.f4599m.setImageResource(i);
                                    this.f4600n.setText(str2);
                                    this.f4601o.setText(str3);
                                    return;
                                case 3:
                                    setErrorState(list);
                                    this.f4603q.setImageResource(i);
                                    this.f4604r.setText(str2);
                                    this.f4605s.setText(str3);
                                    this.f4606t.setText(str4);
                                    this.f4606t.setOnClickListener(onClickListener);
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                } else if (str.equals("type_loading") != null) {
                    str = true;
                    switch (str) {
                        case null:
                            setContentState(list);
                            return;
                        case 1:
                            setLoadingState(list);
                            return;
                        case 2:
                            setEmptyState(list);
                            this.f4599m.setImageResource(i);
                            this.f4600n.setText(str2);
                            this.f4601o.setText(str3);
                            return;
                        case 3:
                            setErrorState(list);
                            this.f4603q.setImageResource(i);
                            this.f4604r.setText(str2);
                            this.f4605s.setText(str3);
                            this.f4606t.setText(str4);
                            this.f4606t.setOnClickListener(onClickListener);
                            return;
                        default:
                            return;
                    }
                }
            } else if (str.equals("type_error") != null) {
                str = 3;
                switch (str) {
                    case null:
                        setContentState(list);
                        return;
                    case 1:
                        setLoadingState(list);
                        return;
                    case 2:
                        setEmptyState(list);
                        this.f4599m.setImageResource(i);
                        this.f4600n.setText(str2);
                        this.f4601o.setText(str3);
                        return;
                    case 3:
                        setErrorState(list);
                        this.f4603q.setImageResource(i);
                        this.f4604r.setText(str2);
                        this.f4605s.setText(str3);
                        this.f4606t.setText(str4);
                        this.f4606t.setOnClickListener(onClickListener);
                        return;
                    default:
                        return;
                }
            }
        } else if (str.equals("type_empty") != null) {
            str = 2;
            switch (str) {
                case null:
                    setContentState(list);
                    return;
                case 1:
                    setLoadingState(list);
                    return;
                case 2:
                    setEmptyState(list);
                    this.f4599m.setImageResource(i);
                    this.f4600n.setText(str2);
                    this.f4601o.setText(str3);
                    return;
                case 3:
                    setErrorState(list);
                    this.f4603q.setImageResource(i);
                    this.f4604r.setText(str2);
                    this.f4605s.setText(str3);
                    this.f4606t.setText(str4);
                    this.f4606t.setOnClickListener(onClickListener);
                    return;
                default:
                    return;
            }
        }
        str = -1;
        switch (str) {
            case null:
                setContentState(list);
                return;
            case 1:
                setLoadingState(list);
                return;
            case 2:
                setEmptyState(list);
                this.f4599m.setImageResource(i);
                this.f4600n.setText(str2);
                this.f4601o.setText(str3);
                return;
            case 3:
                setErrorState(list);
                this.f4603q.setImageResource(i);
                this.f4604r.setText(str2);
                this.f4605s.setText(str3);
                this.f4606t.setText(str4);
                this.f4606t.setOnClickListener(onClickListener);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m5763b() {
        if (this.f4596j == null) {
            this.f4592f = this.f4591e.inflate(R.layout.progress_linear_layout_loading_view, null);
            this.f4596j = (LinearLayout) this.f4592f.findViewById(R.id.linear_layout_progress);
            this.f4596j.setTag("ProgressActivity.TAG_LOADING");
            this.f4597k = (ProgressBar) this.f4592f.findViewById(R.id.progress_bar_loading);
            this.f4597k.getLayoutParams().width = this.f4607u;
            this.f4597k.getLayoutParams().height = this.f4608v;
            this.f4597k.getIndeterminateDrawable().setColorFilter(this.f4609w, Mode.SRC_IN);
            this.f4597k.requestLayout();
            if (this.f4610x != 0) {
                setBackgroundColor(this.f4610x);
            }
            this.f4593g = new LayoutParams(-1, -1);
            this.f4593g.gravity = 17;
            addView(this.f4596j, this.f4593g);
            return;
        }
        this.f4596j.setVisibility(0);
    }

    /* renamed from: c */
    private void m5764c() {
        if (this.f4598l == null) {
            this.f4592f = this.f4591e.inflate(R.layout.progress_linear_layout_empty_view, null);
            this.f4598l = (LinearLayout) this.f4592f.findViewById(R.id.linear_layout_empty);
            this.f4598l.setTag("ProgressActivity.TAG_EMPTY");
            this.f4599m = (ImageView) this.f4592f.findViewById(R.id.image_icon);
            this.f4600n = (TextView) this.f4592f.findViewById(R.id.text_title);
            this.f4601o = (TextView) this.f4592f.findViewById(R.id.text_content);
            this.f4599m.getLayoutParams().width = this.f4611y;
            this.f4599m.getLayoutParams().height = this.f4612z;
            this.f4599m.requestLayout();
            this.f4600n.setTextSize((float) this.f4572A);
            this.f4601o.setTextSize((float) this.f4573B);
            this.f4600n.setTextColor(this.f4574C);
            this.f4601o.setTextColor(this.f4575D);
            if (this.f4576E != 0) {
                setBackgroundColor(this.f4576E);
            }
            this.f4593g = new LayoutParams(-1, -1);
            this.f4593g.gravity = 17;
            addView(this.f4598l, this.f4593g);
            return;
        }
        this.f4598l.setVisibility(0);
    }

    /* renamed from: d */
    private void m5765d() {
        if (this.f4602p == null) {
            this.f4592f = this.f4591e.inflate(R.layout.progress_linear_layout_error_view, null);
            this.f4602p = (LinearLayout) this.f4592f.findViewById(R.id.linear_layout_error);
            this.f4602p.setTag("ProgressActivity.TAG_ERROR");
            this.f4603q = (ImageView) this.f4592f.findViewById(R.id.image_icon);
            this.f4604r = (TextView) this.f4592f.findViewById(R.id.text_title);
            this.f4605s = (TextView) this.f4592f.findViewById(R.id.text_content);
            this.f4606t = (Button) this.f4592f.findViewById(R.id.button_retry);
            this.f4603q.getLayoutParams().width = this.f4577F;
            this.f4603q.getLayoutParams().height = this.f4578G;
            this.f4603q.requestLayout();
            this.f4604r.setTextSize((float) this.f4579H);
            this.f4605s.setTextSize((float) this.f4580I);
            this.f4604r.setTextColor(this.f4581J);
            this.f4605s.setTextColor(this.f4582K);
            this.f4606t.setTextColor(this.f4583L);
            this.f4606t.getBackground().setColorFilter(new LightingColorFilter(1, this.f4584M));
            if (this.f4585N != 0) {
                setBackgroundColor(this.f4585N);
            }
            this.f4593g = new LayoutParams(-1, -1);
            this.f4593g.gravity = 17;
            addView(this.f4602p, this.f4593g);
            return;
        }
        this.f4602p.setVisibility(0);
    }

    private void setContentState(List<Integer> list) {
        m5766e();
        m5767f();
        m5768g();
        m5762a(true, list);
    }

    private void setLoadingState(List<Integer> list) {
        m5767f();
        m5768g();
        m5763b();
        m5762a(false, list);
    }

    private void setEmptyState(List<Integer> list) {
        m5766e();
        m5768g();
        m5764c();
        m5762a(false, list);
    }

    private void setErrorState(List<Integer> list) {
        m5766e();
        m5767f();
        m5765d();
        m5762a(false, list);
    }

    /* renamed from: a */
    private void m5762a(boolean z, List<Integer> list) {
        for (View view : this.f4595i) {
            if (!list.contains(Integer.valueOf(view.getId()))) {
                view.setVisibility(z ? 0 : 8);
            }
        }
    }

    /* renamed from: e */
    private void m5766e() {
        if (this.f4596j != null) {
            this.f4596j.setVisibility(8);
            if (this.f4610x != 0) {
                setBackgroundDrawable(this.f4594h);
            }
        }
    }

    /* renamed from: f */
    private void m5767f() {
        if (this.f4598l != null) {
            this.f4598l.setVisibility(8);
            if (this.f4576E != 0) {
                setBackgroundDrawable(this.f4594h);
            }
        }
    }

    /* renamed from: g */
    private void m5768g() {
        if (this.f4602p != null) {
            this.f4602p.setVisibility(8);
            if (this.f4585N != 0) {
                setBackgroundDrawable(this.f4594h);
            }
        }
    }
}
