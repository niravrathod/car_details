package com.cuvora.carinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.CarOverview;
import java.util.ArrayList;

/* renamed from: com.cuvora.carinfo.fragment.i */
public class C4551i extends Fragment {
    /* renamed from: a */
    ArrayList<CarOverview> f18876a;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bundle = getArguments();
        if (bundle != null) {
            this.f18876a = (ArrayList) bundle.getSerializable("KEY_OVERVIEW");
        }
        return layoutInflater.inflate(R.layout.fragment_overview, viewGroup, false);
    }

    /* renamed from: a */
    public static C4551i m25068a() {
        return new C4551i();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.overview_container_ll);
        for (int i = 0; i < this.f18876a.size(); i++) {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.car_properties_grid_recycler_items, linearLayout, false);
            TextView textView = (TextView) inflate.findViewById(R.id.carPropertyValueTextView);
            ((TextView) inflate.findViewById(R.id.carPropertyLabelTextView)).setText(((CarOverview) this.f18876a.get(i)).getName());
            textView.setText((CharSequence) ((CarOverview) this.f18876a.get(i)).getValues().get(0));
            linearLayout.addView(inflate);
        }
    }
}
