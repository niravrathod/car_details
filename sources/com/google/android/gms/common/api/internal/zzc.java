package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.p017f.C3131a;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class zzc extends Fragment implements LifecycleFragment {
    private static WeakHashMap<FragmentActivity, WeakReference<zzc>> zzbd = new WeakHashMap();
    private Map<String, LifecycleCallback> zzbe = new C3131a();
    private int zzbf = 0;
    private Bundle zzbg;

    public static zzc zza(FragmentActivity fragmentActivity) {
        zzc zzc;
        WeakReference weakReference = (WeakReference) zzbd.get(fragmentActivity);
        if (weakReference != null) {
            zzc = (zzc) weakReference.get();
            if (zzc != null) {
                return zzc;
            }
        }
        try {
            zzc = (zzc) fragmentActivity.m28707f().mo291a("SupportLifecycleFragmentImpl");
            if (zzc == null || zzc.isRemoving()) {
                zzc = new zzc();
                fragmentActivity.m28707f().mo292a().mo271a((Fragment) zzc, "SupportLifecycleFragmentImpl").mo280d();
            }
            zzbd.put(fragmentActivity, new WeakReference(zzc));
            return zzc;
        } catch (FragmentActivity fragmentActivity2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", fragmentActivity2);
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
            new zze(Looper.getMainLooper()).post(new zzd(this, lifecycleCallback, str));
        }
    }

    public final boolean isCreated() {
        return this.zzbf > 0;
    }

    public final boolean isStarted() {
        return this.zzbf >= 2;
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

    public final /* synthetic */ Activity getLifecycleActivity() {
        return getActivity();
    }
}
