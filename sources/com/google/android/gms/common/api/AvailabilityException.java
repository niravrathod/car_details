package com.google.android.gms.common.api;

import android.support.v4.p017f.C3131a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final C3131a<zai<?>, ConnectionResult> zaay;

    public AvailabilityException(C3131a<zai<?>, ConnectionResult> c3131a) {
        this.zaay = c3131a;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends ApiOptions> googleApi) {
        googleApi = googleApi.zak();
        Preconditions.checkArgument(this.zaay.get(googleApi) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.zaay.get(googleApi);
    }

    public final C3131a<zai<?>, ConnectionResult> zaj() {
        return this.zaay;
    }

    public String getMessage() {
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (zai zai : this.zaay.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.zaay.get(zai);
            if (connectionResult.isSuccess()) {
                obj = null;
            }
            String zan = zai.zan();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(zan).length() + 2) + String.valueOf(valueOf).length());
            stringBuilder.append(zan);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf);
            arrayList.add(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        if (obj != null) {
            stringBuilder2.append("None of the queried APIs are available. ");
        } else {
            stringBuilder2.append("Some of the queried APIs are unavailable. ");
        }
        stringBuilder2.append(TextUtils.join("; ", arrayList));
        return stringBuilder2.toString();
    }
}
