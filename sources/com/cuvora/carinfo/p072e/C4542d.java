package com.cuvora.carinfo.p072e;

import android.support.v7.widget.RecyclerView.C0798v;
import android.view.ViewGroup;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.p071d.C1474d;
import com.cuvora.carinfo.p071d.C3665a;
import com.cuvora.carinfo.p071d.C3666b;

/* renamed from: com.cuvora.carinfo.e.d */
public class C4542d extends C3665a<Object, C1475a, C3666b> {
    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m25042a(viewGroup, i);
    }

    public C4542d(C1474d<Object> c1474d, C1475a c1475a) {
        super(c1474d, c1475a);
    }

    /* renamed from: a */
    public C3666b m25042a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 9:
                return new C4540b(viewGroup);
            case 1:
                return new C4546i(viewGroup);
            case 3:
                return new C4541c(viewGroup);
            case 5:
                return new C4544f(viewGroup);
            case 7:
                return new C4545h(viewGroup);
            case 8:
                return new C4543e(viewGroup);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void m25044a(C3666b c3666b, int i) {
        VehicleSearchResult vehicleSearchResult;
        switch (mo95b(i)) {
            case 0:
                ((C4540b) c3666b).m25040a("PROFILE DETAILS", true);
                return;
            case 1:
                ((C4546i) c3666b).m25049a((GarageResult) this.a.mo4633e(c3666b.m3286e()), (C1475a) this.b);
                return;
            case 2:
                ((C4540b) c3666b).m25040a("MY VEHICLES", true);
                return;
            case 3:
                vehicleSearchResult = (VehicleSearchResult) this.a.mo4633e(c3666b.m3286e());
                if (vehicleSearchResult != null) {
                    c3666b.a.setVisibility(0);
                    ((C4541c) c3666b).m25041a(vehicleSearchResult, (C1475a) this.b);
                    return;
                }
                c3666b.a.setVisibility(8);
                return;
            case 4:
                ((C4540b) c3666b).m25040a("RECENT SEARCHES", true);
                return;
            case 5:
                vehicleSearchResult = (VehicleSearchResult) this.a.mo4633e(c3666b.m3286e());
                if (vehicleSearchResult != null) {
                    c3666b.a.setVisibility(0);
                    ((C4544f) c3666b).m25047a(vehicleSearchResult, (C1475a) this.b);
                    return;
                }
                c3666b.a.setVisibility(8);
                return;
            case 6:
                ((C4540b) c3666b).m25040a("MY DETAILS", true);
                return;
            case 7:
                ((C4545h) c3666b).m25048a((GarageResult) this.a.mo4633e(c3666b.m3286e()), (C1475a) this.b);
                return;
            case 8:
                LicenseDetailsModel licenseDetailsModel = (LicenseDetailsModel) this.a.mo4633e(c3666b.m3286e());
                if (licenseDetailsModel != null) {
                    ((C4543e) c3666b).m25046a(licenseDetailsModel, (C1475a) this.b);
                    return;
                }
                return;
            case 9:
                ((C4540b) c3666b).m25040a("Recent Searched Licences", true);
                return;
            default:
                return;
        }
    }
}
