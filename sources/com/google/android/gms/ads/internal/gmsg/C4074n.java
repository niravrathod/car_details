package com.google.android.gms.ads.internal.gmsg;

import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.n */
final class C4074n implements zzu<zzasg> {
    C4074n() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        WindowManager windowManager = (WindowManager) zzasg.getContext().getSystemService("window");
        zzbv.zzek();
        View view = (View) zzasg;
        map = zzalo.m9777a(windowManager);
        int i = map.widthPixels;
        map = map.heightPixels;
        int[] iArr = new int[2];
        Map hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(map));
        zzasg.mo4743a("locationReady", hashMap);
        zzaok.m10007e("GET LOCATION COMPILED");
    }
}
