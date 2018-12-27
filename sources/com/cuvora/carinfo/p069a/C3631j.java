package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.VariantColors;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.cuvora.carinfo.a.j */
public class C3631j extends C0771a<C3630a> {
    /* renamed from: a */
    private Context f14831a;
    /* renamed from: b */
    private List<VariantColors> f14832b;
    /* renamed from: c */
    private Pattern f14833c = Pattern.compile("^#([A-Fa-f0-9]{6})$");

    /* renamed from: com.cuvora.carinfo.a.j$a */
    public static class C3630a extends C0798v {
        /* renamed from: n */
        private ImageView f14827n;
        /* renamed from: o */
        private TextView f14828o;
        /* renamed from: p */
        private RelativeLayout f14829p;
        /* renamed from: q */
        private ImageView f14830q;

        public C3630a(View view) {
            super(view);
            this.f14827n = (ImageView) view.findViewById(R.id.variantColorImageView);
            this.f14828o = (TextView) view.findViewById(R.id.variantColorTextView);
            this.f14829p = (RelativeLayout) view.findViewById(R.id.rl_variant_color);
            this.f14830q = (ImageView) view.findViewById(R.id.variantColorSmallImageView);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18346a(viewGroup, i);
    }

    public C3631j(List<VariantColors> list, Context context) {
        this.f14832b = list;
        this.f14831a = context;
    }

    /* renamed from: a */
    public C3630a m18346a(ViewGroup viewGroup, int i) {
        return new C3630a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.colors_recycler_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m18348a(C3630a c3630a, int i) {
        if (this.f14832b != null && !((VariantColors) this.f14832b.get(i)).getCode().equals("") && ((VariantColors) this.f14832b.get(i)).getCode().length() >= 6) {
            if (((VariantColors) this.f14832b.get(i)).getCode().length() > 6) {
                c3630a.f14829p.setVisibility(0);
                String[] split = ((VariantColors) this.f14832b.get(i)).getCode().split(",");
                c3630a.f14830q.setVisibility(0);
                GradientDrawable gradientDrawable = (GradientDrawable) c3630a.f14827n.getBackground();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("#");
                stringBuilder.append(split[0]);
                gradientDrawable.setColor(Color.parseColor(stringBuilder.toString()));
                gradientDrawable = (GradientDrawable) c3630a.f14830q.getBackground();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("#");
                stringBuilder2.append(split[1]);
                gradientDrawable.setColor(Color.parseColor(stringBuilder2.toString()));
                c3630a.f14828o.setText(((VariantColors) this.f14832b.get(i)).getName());
                return;
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("#");
            stringBuilder3.append(((VariantColors) this.f14832b.get(i)).getCode());
            if (m18344a(stringBuilder3.toString())) {
                c3630a.f14829p.setVisibility(0);
                c3630a.f14830q.setVisibility(8);
                GradientDrawable gradientDrawable2 = (GradientDrawable) c3630a.f14827n.getBackground();
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("#");
                stringBuilder4.append(((VariantColors) this.f14832b.get(i)).getCode());
                gradientDrawable2.setColor(Color.parseColor(stringBuilder4.toString()));
                c3630a.f14828o.setText(((VariantColors) this.f14832b.get(i)).getName());
                return;
            }
            c3630a.f14829p.setVisibility(8);
        }
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14832b == null) {
            return 0;
        }
        return this.f14832b.size();
    }

    /* renamed from: a */
    private boolean m18344a(String str) {
        Log.i("COLOR_DEBUG", String.valueOf(this.f14833c.matcher(str).matches()));
        return this.f14833c.matcher(str).matches();
    }
}
