package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzcj extends zzci {
    /* renamed from: a */
    public static zzcj m28363a(String str, Context context, boolean z) {
        zzci.m26563a(context, z);
        return new zzcj(context, str, z);
    }

    private zzcj(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: a */
    protected final List<Callable<Void>> mo4813a(zzdb zzdb, Context context, zzbb zzbb, zzay zzay) {
        if (zzdb.m10510c() != null) {
            if (this.r) {
                int n = zzdb.m10521n();
                List<Callable<Void>> arrayList = new ArrayList();
                arrayList.addAll(super.mo4813a(zzdb, context, zzbb, zzay));
                arrayList.add(new zzdu(zzdb, "DPtJycwRqj/e0TdTHULzeUhZhWJ1IU3iwhH90sUbn4eYKEdB5HI7UC0PtJgg2RSN", "Ye7G7hL63+8nOBoyCAHdjfK62rvCOKz3+aC1KA/K9CI=", zzbb, n, 24));
                return arrayList;
            }
        }
        return super.mo4813a(zzdb, context, zzbb, zzay);
    }
}
