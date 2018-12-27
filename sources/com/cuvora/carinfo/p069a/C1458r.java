package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.models.VehicleInfo;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.views.AsyncImageView;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.r */
public class C1458r extends ArrayAdapter<VehicleSearchResult> {
    /* renamed from: a */
    private Context f4439a;
    /* renamed from: b */
    private List<VehicleSearchResult> f4440b;
    /* renamed from: c */
    private C1457a f4441c;

    /* renamed from: com.cuvora.carinfo.a.r$a */
    public interface C1457a {
        /* renamed from: a */
        void mo5023a(VehicleSearchResult vehicleSearchResult);
    }

    public C1458r(Context context, List<VehicleSearchResult> list, C1457a c1457a) {
        super(context, -1, list);
        this.f4439a = context;
        this.f4441c = c1457a;
        this.f4440b = list;
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f4439a.getSystemService("layout_inflater");
        if (view == null) {
            view = layoutInflater.inflate(R.layout.row_recent_searches, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_vehicle_number);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_vehicle_description);
        AsyncImageView asyncImageView = (AsyncImageView) view.findViewById(R.id.iv_car);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_delete);
        VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) this.f4440b.get(i);
        if (vehicleSearchResult != null) {
            textView.setText(vehicleSearchResult.getVehicleNum());
            viewGroup = vehicleSearchResult.getVehicleInfoList();
            textView2.setVisibility(8);
            if (viewGroup != null && viewGroup.size() > 0) {
                viewGroup = ((VehicleInfo) viewGroup.get(0)).getVehicleInfoMap();
                if (!(viewGroup == null || viewGroup.get("Owner Name") == null)) {
                    textView2.setVisibility(0);
                    viewGroup = new StringBuilder();
                    viewGroup.append("owned by ");
                    viewGroup.append(vehicleSearchResult.getDisplayName());
                    textView2.setText(viewGroup.toString());
                }
            }
            if (!(vehicleSearchResult.getImageUrl() == null || C1562q.m5946a(vehicleSearchResult.getImageUrl()) == null)) {
                asyncImageView.setImageUrl(vehicleSearchResult.getImageUrl());
            }
            imageView.setOnClickListener(new OnClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ C1458r f4436b;

                public void onClick(View view) {
                    this.f4436b.m5703a(i, view);
                }
            });
        }
        return view;
    }

    /* renamed from: a */
    private void m5703a(final int i, View view) {
        if (this.f4439a != null) {
            PopupMenu popupMenu = new PopupMenu(this.f4439a, view);
            popupMenu.getMenuInflater().inflate(R.menu.menu_delete, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new OnMenuItemClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ C1458r f4438b;

                public boolean onMenuItemClick(MenuItem menuItem) {
                    VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) this.f4438b.f4440b.get(i);
                    if (vehicleSearchResult == null || this.f4438b.f4439a == null) {
                        return null;
                    }
                    this.f4438b.f4441c.mo5023a(vehicleSearchResult);
                    return true;
                }
            });
            popupMenu.show();
        }
    }
}
