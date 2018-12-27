package com.google.android.gms.common.api.internal;

import android.support.v4.p017f.C3131a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

final class zaz implements OnCompleteListener<Map<zai<?>, String>> {
    private final /* synthetic */ zax zafh;

    private zaz(zax zax) {
        this.zafh = zax;
    }

    public final void onComplete(Task<Map<zai<?>, String>> task) {
        this.zafh.zaen.lock();
        try {
            if (this.zafh.zafc) {
                if (task.mo3216b()) {
                    this.zafh.zafd = new C3131a(this.zafh.zaet.size());
                    task = this.zafh.zaet.values().iterator();
                    while (task.hasNext()) {
                        this.zafh.zafd.put(((zaw) task.next()).zak(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.mo3219e() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.mo3219e();
                    if (this.zafh.zafa) {
                        this.zafh.zafd = new C3131a(this.zafh.zaet.size());
                        for (zaw zaw : this.zafh.zaet.values()) {
                            zai zak = zaw.zak();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(zaw);
                            if (this.zafh.zaa(zaw, connectionResult)) {
                                this.zafh.zafd.put(zak, new ConnectionResult(16));
                            } else {
                                this.zafh.zafd.put(zak, connectionResult);
                            }
                        }
                    } else {
                        this.zafh.zafd = availabilityException.zaj();
                    }
                    this.zafh.zafg = this.zafh.zaaf();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.mo3219e());
                    this.zafh.zafd = Collections.emptyMap();
                    this.zafh.zafg = new ConnectionResult(8);
                }
                if (this.zafh.zafe != null) {
                    this.zafh.zafd.putAll(this.zafh.zafe);
                    this.zafh.zafg = this.zafh.zaaf();
                }
                if (this.zafh.zafg == null) {
                    this.zafh.zaad();
                    this.zafh.zaae();
                } else {
                    this.zafh.zafc = false;
                    this.zafh.zaew.zac(this.zafh.zafg);
                }
                this.zafh.zaey.signalAll();
                this.zafh.zaen.unlock();
            }
        } finally {
            this.zafh.zaen.unlock();
        }
    }
}
