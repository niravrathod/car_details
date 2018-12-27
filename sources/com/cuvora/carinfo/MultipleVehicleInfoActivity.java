package com.cuvora.carinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cuvora.carinfo.models.VehicleInfo;
import com.cuvora.carinfo.models.VehicleSearchResult;
import java.util.Map.Entry;

public class MultipleVehicleInfoActivity extends AppCompatActivity {
    /* renamed from: n */
    private LinearLayout f21762n;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_multiple_vehicle_info);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        mo4973h().mo538b(true);
        m29991l();
        m29990a((VehicleSearchResult) getIntent().getSerializableExtra("KEY_VEHICLE_INFO"));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }

    /* renamed from: a */
    private void m29990a(VehicleSearchResult vehicleSearchResult) {
        vehicleSearchResult = vehicleSearchResult.getVehicleInfoList();
        int i = 0;
        while (i < vehicleSearchResult.size()) {
            VehicleInfo vehicleInfo = (VehicleInfo) vehicleSearchResult.get(i);
            i++;
            this.f21762n.addView(m29988a(vehicleInfo, i));
        }
    }

    /* renamed from: l */
    private void m29991l() {
        this.f21762n = (LinearLayout) findViewById(R.id.ll_multiple_vehicle_info_container);
    }

    /* renamed from: a */
    private View m29988a(VehicleInfo vehicleInfo, int i) {
        if (vehicleInfo != null) {
            if (vehicleInfo.getVehicleInfoMap() != null) {
                CardView cardView = (CardView) LayoutInflater.from(this).inflate(R.layout.layout_multiple_vehicle_info_card, null);
                TextView textView = (TextView) cardView.findViewById(R.id.tv_heading);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(getResources().getString(R.string.registration_details));
                stringBuilder.append(" ");
                stringBuilder.append(i);
                textView.setText(stringBuilder.toString());
                LinearLayout linearLayout = (LinearLayout) cardView.findViewById(R.id.ll_vehicle_detail);
                for (Entry entry : vehicleInfo.getVehicleInfoMap().entrySet()) {
                    linearLayout.addView(m29989a(entry.getKey().toString(), entry.getValue().toString()));
                }
                ImageView imageView = (ImageView) cardView.findViewById(R.id.iv_share);
                return cardView;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m29989a(String str, String str2) {
        View inflate = getLayoutInflater().inflate(R.layout.layout_multiple_vehicle_info_row, null, false);
        ((TextView) inflate.findViewById(R.id.tv_key)).setText(str);
        ((TextView) inflate.findViewById(R.id.tv_value)).setText(str2);
        return inflate;
    }
}
