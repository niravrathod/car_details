package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C2397R;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@zzaer
public final class zzabk extends zzabr {
    /* renamed from: a */
    private final Map<String, String> f16753a;
    /* renamed from: b */
    private final Context f16754b;

    public zzabk(zzasg zzasg, Map<String, String> map) {
        super(zzasg, "storePicture");
        this.f16753a = map;
        this.f16754b = zzasg.mo4199d();
    }

    /* renamed from: a */
    public final void m21073a() {
        if (this.f16754b == null) {
            m9445a("Activity context is not available");
            return;
        }
        zzbv.zzek();
        if (zzalo.m9820f(this.f16754b).m10873c()) {
            String str = (String) this.f16753a.get("iurl");
            if (TextUtils.isEmpty(str)) {
                m9445a("Image url cannot be empty.");
                return;
            } else if (URLUtil.isValidUrl(str)) {
                r1 = Uri.parse(str).getLastPathSegment();
                zzbv.zzek();
                if (zzalo.m9812c(r1)) {
                    Resources g = zzbv.zzeo().m9722g();
                    zzbv.zzek();
                    Builder e = zzalo.m9816e(this.f16754b);
                    e.setTitle(g != null ? g.getString(C2397R.string.s1) : "Save image");
                    e.setMessage(g != null ? g.getString(C2397R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    e.setPositiveButton(g != null ? g.getString(C2397R.string.s3) : "Accept", new C2442n(this, str, r1));
                    e.setNegativeButton(g != null ? g.getString(C2397R.string.s4) : "Decline", new C2444o(this));
                    e.create().show();
                    return;
                }
                str = "Image type not recognized: ";
                r1 = String.valueOf(r1);
                m9445a(r1.length() != 0 ? str.concat(r1) : new String(str));
                return;
            } else {
                r1 = "Invalid image url: ";
                str = String.valueOf(str);
                m9445a(str.length() != 0 ? r1.concat(str) : new String(r1));
                return;
            }
        }
        m9445a("Feature is not supported by the device.");
    }
}
