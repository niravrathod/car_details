package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class BackgroundDetector implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final BackgroundDetector zzas = new BackgroundDetector();
    private final AtomicBoolean zzat = new AtomicBoolean();
    private final AtomicBoolean zzau = new AtomicBoolean();
    @GuardedBy("sInstance")
    private final ArrayList<BackgroundStateChangeListener> zzav = new ArrayList();
    @GuardedBy("sInstance")
    private boolean zzaw = false;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    @KeepForSdk
    public static BackgroundDetector getInstance() {
        return zzas;
    }

    @KeepForSdk
    public static void initialize(Application application) {
        synchronized (zzas) {
            if (!zzas.zzaw) {
                application.registerActivityLifecycleCallbacks(zzas);
                application.registerComponentCallbacks(zzas);
                zzas.zzaw = true;
            }
        }
    }

    @TargetApi(16)
    @KeepForSdk
    public final boolean readCurrentStateIfPossible(boolean z) {
        if (!this.zzau.get()) {
            if (!PlatformVersion.isAtLeastJellyBean()) {
                return z;
            }
            z = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(z);
            if (!this.zzau.getAndSet(true) && z.importance > true) {
                this.zzat.set(true);
            }
        }
        return isInBackground();
    }

    @KeepForSdk
    public final boolean isInBackground() {
        return this.zzat.get();
    }

    @KeepForSdk
    public final void addListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (zzas) {
            this.zzav.add(backgroundStateChangeListener);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity = this.zzat.compareAndSet(true, false);
        this.zzau.set(true);
        if (activity != null) {
            onBackgroundStateChanged(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        activity = this.zzat.compareAndSet(true, false);
        this.zzau.set(true);
        if (activity != null) {
            onBackgroundStateChanged(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.zzat.compareAndSet(false, true) != 0) {
            this.zzau.set(true);
            onBackgroundStateChanged(true);
        }
    }

    private final void onBackgroundStateChanged(boolean z) {
        synchronized (zzas) {
            ArrayList arrayList = this.zzav;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((BackgroundStateChangeListener) obj).onBackgroundStateChanged(z);
            }
        }
    }
}
