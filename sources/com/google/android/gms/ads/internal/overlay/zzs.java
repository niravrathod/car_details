package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzabx;
import com.google.android.gms.internal.ads.zzaer;

@zzaer
public final class zzs extends zzabx {
    /* renamed from: a */
    private AdOverlayInfoParcel f19526a;
    /* renamed from: b */
    private Activity f19527b;
    /* renamed from: c */
    private boolean f19528c = false;
    /* renamed from: d */
    private boolean f19529d = false;

    public zzs(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f19526a = adOverlayInfoParcel;
        this.f19527b = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
    }

    public final void onRestart() {
    }

    public final void onStart() {
    }

    public final void zzax() {
    }

    public final boolean zzou() {
        return false;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        if (this.f19526a == null) {
            this.f19527b.finish();
        } else if (z) {
            this.f19527b.finish();
        } else {
            if (bundle == null) {
                if (this.f19526a.zzcbx != null) {
                    this.f19526a.zzcbx.onAdClicked();
                }
                if (!(this.f19527b.getIntent() == null || this.f19527b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) == null || this.f19526a.zzcby == null)) {
                    this.f19526a.zzcby.zzcb();
                }
            }
            zzbv.zzeh();
            if (zza.zza(this.f19527b, this.f19526a.zzcbw, this.f19526a.zzcce) == null) {
                this.f19527b.finish();
            }
        }
    }

    public final void onResume() {
        if (this.f19528c) {
            this.f19527b.finish();
            return;
        }
        this.f19528c = true;
        if (this.f19526a.zzcby != null) {
            this.f19526a.zzcby.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f19528c);
    }

    public final void onPause() {
        if (this.f19526a.zzcby != null) {
            this.f19526a.zzcby.onPause();
        }
        if (this.f19527b.isFinishing()) {
            m25935a();
        }
    }

    public final void onStop() {
        if (this.f19527b.isFinishing()) {
            m25935a();
        }
    }

    public final void onDestroy() {
        if (this.f19527b.isFinishing()) {
            m25935a();
        }
    }

    /* renamed from: a */
    private final synchronized void m25935a() {
        if (!this.f19529d) {
            if (this.f19526a.zzcby != null) {
                this.f19526a.zzcby.zzca();
            }
            this.f19529d = true;
        }
    }
}
