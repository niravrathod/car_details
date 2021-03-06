package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.p017f.C3131a;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class zza extends Fragment implements LifecycleFragment {
    private static WeakHashMap<Activity, WeakReference<zza>> zzbd = new WeakHashMap();
    private Map<String, LifecycleCallback> zzbe = new C3131a();
    private int zzbf = 0;
    private Bundle zzbg;

    public static zza zza(Activity activity) {
        zza zza;
        WeakReference weakReference = (WeakReference) zzbd.get(activity);
        if (weakReference != null) {
            zza = (zza) weakReference.get();
            if (zza != null) {
                return zza;
            }
        }
        try {
            zza = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zza == null || zza.isRemoving()) {
                zza = new zza();
                activity.getFragmentManager().beginTransaction().add(zza, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            zzbd.put(activity, new WeakReference(zza));
            return zza;
        } catch (Activity activity2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", activity2);
        }
    }

    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.zzbe.get(str));
    }

    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        if (this.zzbe.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
            stringBuilder.append("LifecycleCallback with tag ");
            stringBuilder.append(str);
            stringBuilder.append(" already added to this fragment.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.zzbe.put(str, lifecycleCallback);
        if (this.zzbf > 0) {
            new zze(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback, str));
        }
    }

    public final boolean isCreated() {
        return this.zzbf > 0;
    }

    public final boolean isStarted() {
        return this.zzbf >= 2;
    }

    public final Activity getLifecycleActivity() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzbf = 1;
        this.zzbg = bundle;
        for (Entry entry : this.zzbe.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.zzbf = 2;
        for (LifecycleCallback onStart : this.zzbe.values()) {
            onStart.onStart();
        }
    }

    public final void onResume() {
        super.onResume();
        this.zzbf = 3;
        for (LifecycleCallback onResume : this.zzbe.values()) {
            onResume.onResume();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback onActivityResult : this.zzbe.values()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.zzbe.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.zzbf = 4;
        for (LifecycleCallback onStop : this.zzbe.values()) {
            onStop.onStop();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zzbf = 5;
        for (LifecycleCallback onDestroy : this.zzbe.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.zzbe.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
