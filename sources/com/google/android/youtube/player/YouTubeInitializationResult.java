package com.google.android.youtube.player;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.youtube.player.internal.C2534c;
import com.google.android.youtube.player.internal.C2547r;
import com.google.android.youtube.player.internal.aa;
import com.google.android.youtube.player.internal.ab;

public enum YouTubeInitializationResult {
    SUCCESS,
    INTERNAL_ERROR,
    UNKNOWN_ERROR,
    SERVICE_MISSING,
    SERVICE_VERSION_UPDATE_REQUIRED,
    SERVICE_DISABLED,
    SERVICE_INVALID,
    ERROR_CONNECTING_TO_SERVICE,
    CLIENT_LIBRARY_UPDATE_REQUIRED,
    NETWORK_ERROR,
    DEVELOPER_KEY_INVALID,
    INVALID_APPLICATION_SIGNATURE;

    /* renamed from: com.google.android.youtube.player.YouTubeInitializationResult$a */
    private static final class C2520a implements OnClickListener {
        /* renamed from: a */
        private final Activity f10845a;
        /* renamed from: b */
        private final Intent f10846b;
        /* renamed from: c */
        private final int f10847c;

        public C2520a(Activity activity, Intent intent, int i) {
            this.f10845a = (Activity) C2534c.m12477a((Object) activity);
            this.f10846b = (Intent) C2534c.m12477a((Object) intent);
            this.f10847c = ((Integer) C2534c.m12477a(Integer.valueOf(i))).intValue();
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            try {
                this.f10845a.startActivityForResult(this.f10846b, this.f10847c);
                dialogInterface.dismiss();
            } catch (Throwable e) {
                aa.m12463a("Can't perform resolution for YouTubeInitalizationError", e);
            }
        }
    }

    /* renamed from: a */
    public final Dialog m12434a(Activity activity, int i) {
        return m12435a(activity, i, null);
    }

    /* renamed from: a */
    public final Dialog m12435a(Activity activity, int i, OnCancelListener onCancelListener) {
        Intent b;
        Builder message;
        CharSequence charSequence;
        Builder builder = new Builder(activity);
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        switch (this) {
            case SERVICE_MISSING:
            case SERVICE_VERSION_UPDATE_REQUIRED:
                b = ab.m12470b(ab.m12467a((Context) activity));
                break;
            case SERVICE_DISABLED:
                b = ab.m12465a(ab.m12467a((Context) activity));
                break;
            default:
                b = null;
                break;
        }
        OnClickListener c2520a = new C2520a(activity, b, i);
        C2547r c2547r = new C2547r(activity);
        switch (this) {
            case SERVICE_MISSING:
                message = builder.setTitle(c2547r.f10885b).setMessage(c2547r.f10886c);
                charSequence = c2547r.f10887d;
                break;
            case SERVICE_DISABLED:
                message = builder.setTitle(c2547r.f10888e).setMessage(c2547r.f10889f);
                charSequence = c2547r.f10890g;
                break;
            case SERVICE_VERSION_UPDATE_REQUIRED:
                message = builder.setTitle(c2547r.f10891h).setMessage(c2547r.f10892i);
                charSequence = c2547r.f10893j;
                break;
            default:
                String str = "Unexpected errorReason: ";
                String valueOf = String.valueOf(name());
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        return message.setPositiveButton(charSequence, c2520a).create();
    }

    /* renamed from: a */
    public final boolean m12436a() {
        switch (this) {
            case SERVICE_MISSING:
            case SERVICE_DISABLED:
            case SERVICE_VERSION_UPDATE_REQUIRED:
                return true;
            default:
                return false;
        }
    }
}
