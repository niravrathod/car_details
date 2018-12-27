package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.iid.m */
abstract class C2598m<T> {
    /* renamed from: a */
    final int f11039a;
    /* renamed from: b */
    final TaskCompletionSource<T> f11040b = new TaskCompletionSource();
    /* renamed from: c */
    final int f11041c;
    /* renamed from: d */
    final Bundle f11042d;

    C2598m(int i, int i2, Bundle bundle) {
        this.f11039a = i;
        this.f11041c = i2;
        this.f11042d = bundle;
    }

    /* renamed from: a */
    abstract void mo3328a(Bundle bundle);

    /* renamed from: a */
    abstract boolean mo3329a();

    /* renamed from: a */
    final void m12752a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 16) + String.valueOf(valueOf2).length());
            stringBuilder.append("Finishing ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with ");
            stringBuilder.append(valueOf2);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        this.f11040b.m12419a((Object) t);
    }

    /* renamed from: a */
    final void m12751a(zzal zzal) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzal);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(valueOf2).length());
            stringBuilder.append("Failing ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with ");
            stringBuilder.append(valueOf2);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        this.f11040b.m12418a((Exception) zzal);
    }

    public String toString() {
        int i = this.f11041c;
        int i2 = this.f11039a;
        boolean a = mo3329a();
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Request { what=");
        stringBuilder.append(i);
        stringBuilder.append(" id=");
        stringBuilder.append(i2);
        stringBuilder.append(" oneWay=");
        stringBuilder.append(a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
