package com.cuvora.carinfo.p072e;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.p071d.C3666b;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.e.h */
public class C4545h extends C3666b {

    /* renamed from: com.cuvora.carinfo.e.h$a */
    static final class C1483a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1475a f4472a;

        C1483a(C1475a c1475a) {
            this.f4472a = c1475a;
        }

        public final void onClick(View view) {
            this.f4472a.mo1191a();
        }
    }

    protected C4545h(ViewGroup viewGroup) {
        C2885g.m13910b(viewGroup, "parent");
        super(viewGroup, (int) R.layout.view_garage_user_info_header);
    }

    /* renamed from: a */
    public final void m25048a(GarageResult garageResult, C1475a c1475a) {
        C2885g.m13910b(c1475a, "eventHandler");
        Object findViewById = this.a.findViewById(R.id.tvName);
        C2885g.m13907a(findViewById, "itemView.findViewById<Ap…patTextView>(R.id.tvName)");
        ((AppCompatTextView) findViewById).setText(C1570t.m5975a(garageResult));
        ((AppCompatTextView) this.a.findViewById(R.id.tvUpdate)).setOnClickListener(new C1483a(c1475a));
    }
}
