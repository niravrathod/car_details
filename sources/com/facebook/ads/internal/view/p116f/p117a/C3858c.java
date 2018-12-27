package com.facebook.ads.internal.view.p116f.p117a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.view.p116f.C3859a;

/* renamed from: com.facebook.ads.internal.view.f.a.c */
public abstract class C3858c extends RelativeLayout implements C2039b {
    /* renamed from: a */
    private C3859a f15393a;

    public C3858c(Context context) {
        super(context);
    }

    public C3858c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    protected void mo3984a() {
    }

    /* renamed from: a */
    public void mo1440a(C3859a c3859a) {
        this.f15393a = c3859a;
        mo3984a();
    }

    /* renamed from: b */
    protected void mo3985b() {
    }

    /* renamed from: b */
    public void mo1441b(C3859a c3859a) {
        mo3985b();
        this.f15393a = null;
    }

    protected C3859a getVideoView() {
        return this.f15393a;
    }
}
