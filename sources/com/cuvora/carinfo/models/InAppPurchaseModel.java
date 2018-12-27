package com.cuvora.carinfo.models;

import com.android.billingclient.api.C1025g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InAppPurchaseModel implements Serializable {
    public boolean isAutoRenewing;
    public String orderId;
    public long purchaseTime;
    public String purchaseToken;
    public String skuId;

    public static List<InAppPurchaseModel> fromBillingClientPurchase(List<C1025g> list) {
        List<InAppPurchaseModel> arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1025g c1025g = (C1025g) list.get(i);
            InAppPurchaseModel inAppPurchaseModel = new InAppPurchaseModel();
            inAppPurchaseModel.isAutoRenewing = c1025g.m4386e();
            inAppPurchaseModel.orderId = c1025g.m4382a();
            inAppPurchaseModel.purchaseTime = c1025g.m4384c();
            inAppPurchaseModel.purchaseToken = c1025g.m4385d();
            inAppPurchaseModel.skuId = c1025g.m4383b();
            arrayList.add(inAppPurchaseModel);
        }
        return arrayList;
    }
}
