package com.cuvora.carinfo.p072e;

import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.KeyValueModel;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.p071d.C3666b;
import java.util.List;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.e.e */
public final class C4543e extends C3666b {

    /* renamed from: com.cuvora.carinfo.e.e$a */
    static final class C1478a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1475a f4462a;
        /* renamed from: b */
        final /* synthetic */ LicenseDetailsModel f4463b;

        C1478a(C1475a c1475a, LicenseDetailsModel licenseDetailsModel) {
            this.f4462a = c1475a;
            this.f4463b = licenseDetailsModel;
        }

        public final void onClick(View view) {
            this.f4462a.mo1196b(this.f4463b);
        }
    }

    /* renamed from: com.cuvora.carinfo.e.e$b */
    static final class C1479b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1475a f4464a;
        /* renamed from: b */
        final /* synthetic */ LicenseDetailsModel f4465b;

        C1479b(C1475a c1475a, LicenseDetailsModel licenseDetailsModel) {
            this.f4464a = c1475a;
            this.f4465b = licenseDetailsModel;
        }

        public final void onClick(View view) {
            this.f4464a.mo1192a(this.f4465b);
        }
    }

    public C4543e(ViewGroup viewGroup) {
        C2885g.m13910b(viewGroup, "parent");
        super(viewGroup, (int) R.layout.row_recent_licence);
    }

    /* renamed from: a */
    public final void m25046a(LicenseDetailsModel licenseDetailsModel, C1475a c1475a) {
        C2885g.m13910b(licenseDetailsModel, "licenseDetailsModel");
        C2885g.m13910b(c1475a, "eventHandler");
        List<KeyValueModel> keys = licenseDetailsModel.getKeys();
        if (keys != null) {
            for (KeyValueModel keyValueModel : keys) {
                Object obj;
                if (C2885g.m13909a(keyValueModel.getKey(), KeyValueModel.Companion.getKEY_LICENCE_NO())) {
                    obj = this.a;
                    C2885g.m13907a(obj, "itemView");
                    obj = (TextView) obj.findViewById(C1487a.tvSubtitle);
                    C2885g.m13907a(obj, "itemView.tvSubtitle");
                    obj.setText(keyValueModel.getValue());
                }
                if (C2885g.m13909a(keyValueModel.getKey(), KeyValueModel.Companion.getKEY_HOLDERS_NAME())) {
                    obj = this.a;
                    C2885g.m13907a(obj, "itemView");
                    obj = (TextView) obj.findViewById(C1487a.tvTitle);
                    C2885g.m13907a(obj, "itemView.tvTitle");
                    obj.setText(keyValueModel.getValue());
                }
            }
        }
        Object obj2 = this.a;
        C2885g.m13907a(obj2, "itemView");
        ((AppCompatImageView) obj2.findViewById(C1487a.iv_delete)).setOnClickListener(new C1478a(c1475a, licenseDetailsModel));
        this.a.setOnClickListener(new C1479b(c1475a, licenseDetailsModel));
    }
}
