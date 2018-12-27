package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

@Deprecated
public class FirebaseInstanceIdService extends zzb {
    @Deprecated
    /* renamed from: a */
    public void mo3930a() {
    }

    /* renamed from: a */
    protected final Intent mo3317a(Intent intent) {
        return (Intent) C2603w.m12774a().f11059a.poll();
    }

    /* renamed from: b */
    public final void mo3318b(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            mo3930a();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                intent = String.valueOf(intent.getExtras());
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(stringExtra).length() + 21) + String.valueOf(intent).length());
                stringBuilder.append("Received command: ");
                stringBuilder.append(stringExtra);
                stringBuilder.append(" - ");
                stringBuilder.append(intent);
                Log.d("FirebaseInstanceId", stringBuilder.toString());
            }
            if ("RST".equals(stringExtra) == null) {
                if ("RST_FULL".equals(stringExtra) == null) {
                    if ("SYNC".equals(stringExtra) != null) {
                        FirebaseInstanceId.m12658a().m12686l();
                    }
                }
            }
            FirebaseInstanceId.m12658a().m12682h();
        }
    }
}
