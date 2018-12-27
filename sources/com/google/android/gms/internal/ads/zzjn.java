package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@zzaer
public final class zzjn {
    /* renamed from: a */
    public static final zzjn f9565a = new zzjn();

    @VisibleForTesting
    protected zzjn() {
    }

    /* renamed from: a */
    public static zzjk m10692a(Context context, zzmg zzmg) {
        Context context2;
        List list;
        String a;
        zzmg zzmg2 = zzmg;
        Date a2 = zzmg.m10754a();
        long time = a2 != null ? a2.getTime() : -1;
        String b = zzmg.m10757b();
        int c = zzmg.m10758c();
        Collection d = zzmg.m10760d();
        if (d.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(d));
            context2 = context;
        }
        boolean a3 = zzmg2.m10755a(context2);
        int l = zzmg.m10768l();
        Location e = zzmg.m10761e();
        Bundle b2 = zzmg2.m10756b(AdMobAdapter.class);
        boolean f = zzmg.m10762f();
        String g = zzmg.m10763g();
        SearchAdRequest i = zzmg.m10765i();
        zznb zznb = i != null ? new zznb(i) : null;
        context2 = context.getApplicationContext();
        if (context2 != null) {
            String packageName = context2.getPackageName();
            zzkd.m10709a();
            a = zzaoa.m9956a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            a = null;
        }
        return new zzjk(8, time, b2, c, list, a3, l, f, g, zznb, e, b, zzmg.m10767k(), zzmg.m10769m(), Collections.unmodifiableList(new ArrayList(zzmg.m10770n())), zzmg.m10764h(), a, zzmg.m10771o(), null, zzmg.m10772p(), null);
    }
}
