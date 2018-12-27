package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@zzaer
@TargetApi(14)
public abstract class zzaqp extends TextureView implements gc {
    /* renamed from: a */
    protected final zzaqz f16890a = new zzaqz();
    /* renamed from: b */
    protected final zzarj f16891b;

    public zzaqp(Context context) {
        super(context);
        this.f16891b = new zzarj(context, this);
    }

    /* renamed from: a */
    public abstract String mo4183a();

    /* renamed from: a */
    public abstract void mo4184a(float f, float f2);

    /* renamed from: a */
    public abstract void mo4185a(int i);

    /* renamed from: a */
    public abstract void mo4186a(zzaqo zzaqo);

    /* renamed from: b */
    public abstract void mo4187b();

    /* renamed from: c */
    public abstract void mo4188c();

    /* renamed from: d */
    public abstract void mo4189d();

    /* renamed from: e */
    public abstract void mo2375e();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
