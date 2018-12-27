package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@TargetApi(21)
@ParametersAreNonnullByDefault
final class cn {
    /* renamed from: a */
    private static final Map<String, String> f7960a;
    /* renamed from: b */
    private final Context f7961b;
    /* renamed from: c */
    private final List<String> f7962c;
    /* renamed from: d */
    private final zzajn f7963d;

    cn(Context context, List<String> list, zzajn zzajn) {
        this.f7961b = context;
        this.f7962c = list;
        this.f7963d = zzajn;
    }

    /* renamed from: a */
    final List<String> m8907a(String[] strArr) {
        List<String> arrayList = new ArrayList();
        for (String str : strArr) {
            Object obj;
            Iterator it = this.f7962c.iterator();
            String valueOf;
            String str2;
            do {
                Object obj2 = 1;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                str2 = (String) it.next();
                if (str2.equals(str)) {
                    break;
                }
                valueOf = String.valueOf("android.webkit.resource.");
                str2 = String.valueOf(str2);
            } while (!(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf)).equals(str));
            obj = 1;
            if (obj != null) {
                if (f7960a.containsKey(str)) {
                    zzbv.zzek();
                    if (!zzalo.m9800a(this.f7961b, (String) f7960a.get(str))) {
                        obj2 = null;
                    }
                }
                if (obj2 != null) {
                    arrayList.add(str);
                } else {
                    this.f7963d.m21200c(str);
                }
            } else {
                this.f7963d.m21197b(str);
            }
        }
        return arrayList;
    }

    static {
        Map hashMap = new HashMap();
        if (PlatformVersion.isAtLeastLollipop()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f7960a = hashMap;
    }
}
