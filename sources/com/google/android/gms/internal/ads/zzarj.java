package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@zzaer
@TargetApi(14)
public final class zzarj implements OnAudioFocusChangeListener {
    /* renamed from: a */
    private final AudioManager f9003a;
    /* renamed from: b */
    private final gc f9004b;
    /* renamed from: c */
    private boolean f9005c;
    /* renamed from: d */
    private boolean f9006d;
    /* renamed from: e */
    private boolean f9007e;
    /* renamed from: f */
    private float f9008f = 1.0f;

    public zzarj(Context context, gc gcVar) {
        this.f9003a = (AudioManager) context.getSystemService("audio");
        this.f9004b = gcVar;
    }

    /* renamed from: a */
    public final void m10080a(boolean z) {
        this.f9007e = z;
        m10077d();
    }

    /* renamed from: a */
    public final void m10079a(float f) {
        this.f9008f = f;
        m10077d();
    }

    /* renamed from: a */
    public final float m10078a() {
        float f = this.f9007e ? 0.0f : this.f9008f;
        if (this.f9005c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void m10081b() {
        this.f9006d = true;
        m10077d();
    }

    /* renamed from: c */
    public final void m10082c() {
        this.f9006d = false;
        m10077d();
    }

    public final void onAudioFocusChange(int i) {
        this.f9005c = i > 0 ? 1 : 0;
        this.f9004b.mo2375e();
    }

    /* renamed from: d */
    private final void m10077d() {
        boolean z = false;
        Object obj = (!this.f9006d || this.f9007e || this.f9008f <= 0.0f) ? null : 1;
        if (obj == null || this.f9005c) {
            if (obj == null && this.f9005c) {
                if (this.f9003a != null) {
                    if (this.f9005c) {
                        if (this.f9003a.abandonAudioFocus(this) == 0) {
                            z = true;
                        }
                        this.f9005c = z;
                    }
                }
                this.f9004b.mo2375e();
            }
            return;
        }
        if (this.f9003a != null) {
            if (!this.f9005c) {
                if (this.f9003a.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.f9005c = z;
            }
        }
        this.f9004b.mo2375e();
    }
}
