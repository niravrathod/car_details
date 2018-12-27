package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v4.view.C0555o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.CarsImage;
import com.cuvora.carinfo.views.AsyncImageView;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.b */
public class C3617b extends C0555o {
    /* renamed from: a */
    Context f14789a;
    /* renamed from: b */
    private List<CarsImage> f14790b;

    /* renamed from: a */
    public boolean mo313a(View view, Object obj) {
        return view == obj;
    }

    public C3617b(List<CarsImage> list, Context context) {
        this.f14790b = list;
        this.f14789a = context;
    }

    /* renamed from: b */
    public int mo1187b() {
        if (this.f14790b == null) {
            return 0;
        }
        return this.f14790b.size();
    }

    /* renamed from: a */
    public Object mo309a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_slider_variant_activity_layout, viewGroup, false);
        ((AsyncImageView) inflate.findViewById(R.id.imageSlider)).setImageUrl(((CarsImage) this.f14790b.get(i)).getSanitizedCarLargeImage(), R.drawable.ic_sedan_car_model);
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: a */
    public void mo312a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((LinearLayout) obj);
    }
}
