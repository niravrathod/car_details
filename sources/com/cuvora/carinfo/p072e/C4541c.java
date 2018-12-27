package com.cuvora.carinfo.p072e;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.models.VehicleInfo;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.p071d.C3666b;
import com.cuvora.carinfo.views.AsyncImageView;
import java.util.List;
import java.util.Map;

/* renamed from: com.cuvora.carinfo.e.c */
public class C4541c extends C3666b {
    public C4541c(ViewGroup viewGroup) {
        super(viewGroup, (int) R.layout.row_recent_searches);
    }

    /* renamed from: a */
    public void m25041a(final VehicleSearchResult vehicleSearchResult, final C1475a c1475a) {
        TextView textView = (TextView) this.a.findViewById(R.id.tv_vehicle_number);
        TextView textView2 = (TextView) this.a.findViewById(R.id.tv_vehicle_description);
        AsyncImageView asyncImageView = (AsyncImageView) this.a.findViewById(R.id.iv_car);
        ImageView imageView = (ImageView) this.a.findViewById(R.id.iv_delete);
        vehicleSearchResult.getVehicleNum();
        textView.setText(vehicleSearchResult.getVehicleNum());
        List vehicleInfoList = vehicleSearchResult.getVehicleInfoList();
        textView2.setVisibility(8);
        if (vehicleInfoList != null && vehicleInfoList.size() > 0) {
            Map vehicleInfoMap = ((VehicleInfo) vehicleInfoList.get(0)).getVehicleInfoMap();
            if (!(vehicleInfoMap == null || vehicleInfoMap.get("Owner Name") == null)) {
                textView2.setVisibility(0);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("owned by ");
                stringBuilder.append(vehicleSearchResult.getDisplayName());
                textView2.setText(stringBuilder.toString());
            }
        }
        if (vehicleSearchResult.getImageUrl() != null && C1562q.m5946a(vehicleSearchResult.getImageUrl())) {
            asyncImageView.setImageUrl(vehicleSearchResult.getImageUrl());
        }
        imageView.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ C4541c f4458c;

            public void onClick(View view) {
                c1475a.mo1194a(vehicleSearchResult, true);
            }
        });
        this.a.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ C4541c f4461c;

            public void onClick(View view) {
                c1475a.mo1193a(vehicleSearchResult);
            }
        });
    }
}
