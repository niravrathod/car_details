package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface MediationAdapter {

    public static class zza {
        /* renamed from: a */
        private int f7825a;

        public final zza zzaq(int i) {
            this.f7825a = 1;
            return this;
        }

        public final Bundle zzxq() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f7825a);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
