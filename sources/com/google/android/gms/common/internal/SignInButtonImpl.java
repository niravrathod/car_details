package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.p009a.p010a.C0295a;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.C2428R;
import com.google.android.gms.common.util.DeviceProperties;

public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, null);
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    public final void configure(Resources resources, SignInButtonConfig signInButtonConfig) {
        configure(resources, signInButtonConfig.getButtonSize(), signInButtonConfig.getColorScheme());
    }

    public final void configure(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        i3 = zaa(i2, C2428R.drawable.common_google_signin_btn_icon_dark, C2428R.drawable.common_google_signin_btn_icon_light, C2428R.drawable.common_google_signin_btn_icon_light);
        int zaa = zaa(i2, C2428R.drawable.common_google_signin_btn_text_dark, C2428R.drawable.common_google_signin_btn_text_light, C2428R.drawable.common_google_signin_btn_text_light);
        switch (i) {
            case 0:
            case 1:
                i3 = zaa;
                break;
            case 2:
                break;
            default:
                i2 = new StringBuilder(32);
                i2.append("Unknown button size: ");
                i2.append(i);
                throw new IllegalStateException(i2.toString());
        }
        Drawable g = C0295a.m1061g(resources.getDrawable(i3));
        C0295a.m1050a(g, resources.getColorStateList(C2428R.color.common_google_signin_btn_tint));
        C0295a.m1053a(g, Mode.SRC_ATOP);
        setBackgroundDrawable(g);
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zaa(i2, C2428R.color.common_google_signin_btn_text_dark, C2428R.color.common_google_signin_btn_text_light, C2428R.color.common_google_signin_btn_text_light))));
        switch (i) {
            case 0:
                setText(resources.getString(C2428R.string.common_signin_button_text));
                break;
            case 1:
                setText(resources.getString(C2428R.string.common_signin_button_text_long));
                break;
            case 2:
                setText(null);
                break;
            default:
                i2 = new StringBuilder(32);
                i2.append("Unknown button size: ");
                i2.append(i);
                throw new IllegalStateException(i2.toString());
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext()) != null) {
            setGravity(19);
        }
    }

    private static int zaa(int i, int i2, int i3, int i4) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            case 2:
                return i4;
            default:
                i4 = new StringBuilder(33);
                i4.append("Unknown color scheme: ");
                i4.append(i);
                throw new IllegalStateException(i4.toString());
        }
    }
}
