package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;

@VisibleForTesting
final class aa extends BroadcastReceiver {
    @Nullable
    /* renamed from: a */
    private C2606z f10986a;

    public aa(C2606z c2606z) {
        this.f10986a = c2606z;
    }

    /* renamed from: a */
    public final void m12688a() {
        if (FirebaseInstanceId.m12665g()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f10986a.m12797a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f10986a != null && this.f10986a.m12798b() != null) {
            if (FirebaseInstanceId.m12665g() != null) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m12660a(this.f10986a, 0);
            this.f10986a.m12797a().unregisterReceiver(this);
            this.f10986a = null;
        }
    }
}
