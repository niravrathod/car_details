package com.google.android.gms.common.api.internal;

import android.support.v4.p017f.C3131a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;

public final class zak {
    private final C3131a<zai<?>, ConnectionResult> zaay = new C3131a();
    private final C3131a<zai<?>, String> zada = new C3131a();
    private final TaskCompletionSource<Map<zai<?>, String>> zadb = new TaskCompletionSource();
    private int zadc;
    private boolean zadd = false;

    public zak(Iterable<? extends GoogleApi<?>> iterable) {
        for (GoogleApi zak : iterable) {
            this.zaay.put(zak.zak(), null);
        }
        this.zadc = this.zaay.keySet().size();
    }

    public final Set<zai<?>> zap() {
        return this.zaay.keySet();
    }

    public final Task<Map<zai<?>, String>> getTask() {
        return this.zadb.m12417a();
    }

    public final void zaa(zai<?> zai, ConnectionResult connectionResult, String str) {
        this.zaay.put(zai, connectionResult);
        this.zada.put(zai, str);
        this.zadc -= 1;
        if (connectionResult.isSuccess() == null) {
            this.zadd = true;
        }
        if (this.zadc == null) {
            if (this.zadd != null) {
                this.zadb.m12418a(new AvailabilityException(this.zaay));
                return;
            }
            this.zadb.m12419a(this.zada);
        }
    }
}
