package com.cuvora.carinfo.helpers;

import com.cuvora.carinfo.models.VehicleSearchResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cuvora.carinfo.helpers.o */
public class C1557o {
    /* renamed from: a */
    private static List<VehicleSearchResult> f4697a;

    /* renamed from: a */
    public static void m5936a(VehicleSearchResult vehicleSearchResult) {
        if (f4697a == null) {
            f4697a = new ArrayList();
        }
        f4697a.add(vehicleSearchResult);
    }

    /* renamed from: b */
    public static boolean m5937b(VehicleSearchResult vehicleSearchResult) {
        return (vehicleSearchResult == null || f4697a == null || f4697a.contains(vehicleSearchResult) == null) ? null : true;
    }
}
