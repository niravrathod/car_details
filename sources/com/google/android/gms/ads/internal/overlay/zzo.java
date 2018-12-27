package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaoa;
import com.google.android.gms.internal.ads.zzkd;
import javax.annotation.Nullable;

@zzaer
public final class zzo extends FrameLayout implements OnClickListener {
    /* renamed from: a */
    private final ImageButton f7711a;
    /* renamed from: b */
    private final zzw f7712b;

    public zzo(Context context, C2411f c2411f, @Nullable zzw zzw) {
        super(context);
        this.f7712b = zzw;
        setOnClickListener(this);
        this.f7711a = new ImageButton(context);
        this.f7711a.setImageResource(17301527);
        this.f7711a.setBackgroundColor(0);
        this.f7711a.setOnClickListener(this);
        zzw = this.f7711a;
        zzkd.m10709a();
        int a = zzaoa.m9952a(context, c2411f.f7706a);
        zzkd.m10709a();
        int a2 = zzaoa.m9952a(context, 0);
        zzkd.m10709a();
        int a3 = zzaoa.m9952a(context, c2411f.f7707b);
        zzkd.m10709a();
        zzw.setPadding(a, a2, a3, zzaoa.m9952a(context, c2411f.f7709d));
        this.f7711a.setContentDescription("Interstitial close button");
        zzkd.m10709a();
        zzaoa.m9952a(context, c2411f.f7710e);
        zzw = this.f7711a;
        zzkd.m10709a();
        a = zzaoa.m9952a(context, (c2411f.f7710e + c2411f.f7706a) + c2411f.f7707b);
        zzkd.m10709a();
        addView(zzw, new LayoutParams(a, zzaoa.m9952a(context, c2411f.f7710e + c2411f.f7709d), 17));
    }

    public final void onClick(View view) {
        if (this.f7712b != null) {
            this.f7712b.zzot();
        }
    }

    public final void zzu(boolean z) {
        if (z) {
            this.f7711a.setVisibility(8);
        } else {
            this.f7711a.setVisibility(0);
        }
    }
}
