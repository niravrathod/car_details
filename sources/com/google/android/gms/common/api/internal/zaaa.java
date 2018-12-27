package com.google.android.gms.common.api.internal;

import android.support.v4.p017f.C3131a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

final class zaaa implements OnCompleteListener<Map<zai<?>, String>> {
    private final /* synthetic */ zax zafh;
    private SignInConnectionListener zafi;

    zaaa(zax zax, SignInConnectionListener signInConnectionListener) {
        this.zafh = zax;
        this.zafi = signInConnectionListener;
    }

    final void cancel() {
        this.zafi.onComplete();
    }

    public final void onComplete(Task<Map<zai<?>, String>> task) {
        this.zafh.zaen.lock();
        try {
            if (this.zafh.zafc) {
                if (task.mo3216b()) {
                    this.zafh.zafe = new C3131a(this.zafh.zaeu.size());
                    task = this.zafh.zaeu.values().iterator();
                    while (task.hasNext()) {
                        this.zafh.zafe.put(((zaw) task.next()).zak(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.mo3219e() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.mo3219e();
                    if (this.zafh.zafa) {
                        this.zafh.zafe = new C3131a(this.zafh.zaeu.size());
                        for (zaw zaw : this.zafh.zaeu.values()) {
                            zai zak = zaw.zak();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(zaw);
                            if (this.zafh.zaa(zaw, connectionResult)) {
                                this.zafh.zafe.put(zak, new ConnectionResult(16));
                            } else {
                                this.zafh.zafe.put(zak, connectionResult);
                            }
                        }
                    } else {
                        this.zafh.zafe = availabilityException.zaj();
                    }
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.mo3219e());
                    this.zafh.zafe = Collections.emptyMap();
                }
                if (this.zafh.isConnected() != null) {
                    this.zafh.zafd.putAll(this.zafh.zafe);
                    if (this.zafh.zaaf() == null) {
                        this.zafh.zaad();
                        this.zafh.zaae();
                        this.zafh.zaey.signalAll();
                    }
                }
                this.zafi.onComplete();
                this.zafh.zaen.unlock();
                return;
            }
            this.zafi.onComplete();
        } finally {
            this.zafh.zaen.unlock();
        }
    }
}
