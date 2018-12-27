package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzoy extends RelativeLayout {
    /* renamed from: a */
    private static final float[] f9762a = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    /* renamed from: b */
    private AnimationDrawable f9763b;

    public zzoy(Context context, zzov zzov, LayoutParams layoutParams) {
        View textView;
        super(context);
        Preconditions.checkNotNull(zzov);
        Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f9762a, null, null));
        shapeDrawable.getPaint().setColor(zzov.m26670d());
        setLayoutParams(layoutParams);
        zzbv.zzem().mo4957a((View) this, shapeDrawable);
        layoutParams = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzov.mo2611a())) {
            ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            textView = new TextView(context);
            textView.setLayoutParams(layoutParams2);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzov.mo2611a());
            textView.setTextColor(zzov.m26671e());
            textView.setTextSize((float) zzov.m26672f());
            zzkd.m10709a();
            int a = zzaoa.m9952a(context, 4);
            zzkd.m10709a();
            textView.setPadding(a, 0, zzaoa.m9952a(context, 4), 0);
            addView(textView);
            layoutParams.addRule(1, textView.getId());
        }
        textView = new ImageView(context);
        textView.setLayoutParams(layoutParams);
        textView.setId(1195835394);
        Context<zzpa> c = zzov.m26669c();
        if (c != null && c.size() > 1) {
            this.f9763b = new AnimationDrawable();
            for (zzpa a2 : c) {
                try {
                    this.f9763b.addFrame((Drawable) ObjectWrapper.m26020a(a2.mo2615a()), zzov.m26673g());
                } catch (LayoutParams layoutParams3) {
                    zzaok.m10002b("Error while getting drawable.", layoutParams3);
                }
            }
            zzbv.zzem().mo4957a(textView, this.f9763b);
        } else if (c.size() == 1) {
            try {
                textView.setImageDrawable((Drawable) ObjectWrapper.m26020a(((zzpa) c.get(0)).mo2615a()));
            } catch (Context context2) {
                zzaok.m10002b("Error while getting drawable.", context2);
            }
        }
        addView(textView);
    }

    public final void onAttachedToWindow() {
        if (this.f9763b != null) {
            this.f9763b.start();
        }
        super.onAttachedToWindow();
    }
}
