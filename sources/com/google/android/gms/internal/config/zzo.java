package com.google.android.gms.internal.config;

import android.os.Bundle;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.data.DataHolder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;

public final class zzo implements zzg {
    /* renamed from: a */
    private static final Charset f17403a = Charset.forName("UTF-8");
    /* renamed from: b */
    private static final Pattern f17404b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    /* renamed from: c */
    private static final Pattern f17405c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    static List<byte[]> m22149a(zzad zzad) {
        if (zzad == null) {
            return null;
        }
        DataHolder d = zzad.m27030d();
        if (d == null) {
            return null;
        }
        List<byte[]> arrayList = new ArrayList();
        for (zzx a : new DataBufferSafeParcelable(d, zzx.CREATOR)) {
            arrayList.add(a.m27059a());
        }
        zzad.m27032f();
        return arrayList;
    }

    /* renamed from: b */
    private static Status m22150b(int i) {
        String str;
        if (i == -6508) {
            str = "SUCCESS_CACHE_STALE";
        } else if (i != 6507) {
            switch (i) {
                case -6506:
                    str = "SUCCESS_CACHE";
                    break;
                case -6505:
                    str = "SUCCESS_FRESH";
                    break;
                default:
                    switch (i) {
                        case 6500:
                            str = "NOT_AUTHORIZED_TO_FETCH";
                            break;
                        case 6501:
                            str = "ANOTHER_FETCH_INFLIGHT";
                            break;
                        case 6502:
                            str = "FETCH_THROTTLED";
                            break;
                        case 6503:
                            str = "NOT_AVAILABLE";
                            break;
                        case 6504:
                            str = "FAILURE_CACHE";
                            break;
                        default:
                            str = CommonStatusCodes.getStatusCodeString(i);
                            break;
                    }
            }
        } else {
            str = "FETCH_THROTTLED_STALE";
        }
        return new Status(i, str);
    }

    /* renamed from: c */
    private static HashMap<String, TreeMap<String, byte[]>> m22152c(zzad zzad) {
        if (zzad == null) {
            return null;
        }
        DataHolder b = zzad.m27028b();
        if (b == null) {
            return null;
        }
        zzaj zzaj = (zzaj) new DataBufferSafeParcelable(b, zzaj.CREATOR).get(0);
        zzad.m27031e();
        HashMap<String, TreeMap<String, byte[]>> hashMap = new HashMap();
        for (String str : zzaj.m27033a().keySet()) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(str, treeMap);
            Bundle bundle = zzaj.m27033a().getBundle(str);
            for (String str2 : bundle.keySet()) {
                treeMap.put(str2, bundle.getByteArray(str2));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final PendingResult<zzk> mo2915a(GoogleApiClient googleApiClient, zzi zzi) {
        if (googleApiClient != null) {
            if (zzi != null) {
                return googleApiClient.enqueue(new C4874e(this, googleApiClient, zzi));
            }
        }
        return null;
    }
}
