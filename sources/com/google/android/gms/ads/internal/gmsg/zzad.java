package com.google.android.gms.ads.internal.gmsg;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@VisibleForTesting
public final class zzad {
    /* renamed from: a */
    private final Context f7694a;
    /* renamed from: b */
    private final zzck f7695b;
    /* renamed from: c */
    private final View f7696c;

    public zzad(Context context, zzck zzck, View view) {
        this.f7694a = context;
        this.f7695b = zzck;
        this.f7696c = view;
    }

    /* renamed from: a */
    private static Intent m8793a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final ResolveInfo m8794a(Intent intent) {
        return m8795a(intent, new ArrayList());
    }

    @VisibleForTesting
    /* renamed from: a */
    private final ResolveInfo m8795a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f7694a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            Collection queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            intent = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && intent != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(i);
                    if (intent != null && intent.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = intent;
                        break;
                    }
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            zzbv.zzeo().m9714a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }

    /* renamed from: a */
    private static Intent m8792a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    @VisibleForTesting
    public final Intent zzi(Map<String, String> map) {
        ActivityManager activityManager = (ActivityManager) this.f7694a.getSystemService("activity");
        String str = (String) map.get("u");
        Uri uri = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList;
        Intent a;
        Intent a2;
        ResolveInfo a3;
        Intent a4;
        ArrayList arrayList2;
        int size;
        int i;
        ResolveInfo resolveInfo;
        Iterator it;
        Uri parse = Uri.parse(zzac.m20363a(this.f7694a, this.f7695b, str, this.f7696c, null));
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
        if (Boolean.parseBoolean((String) map.get("use_custom_tabs")) == null) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.cc)).booleanValue() == null) {
                map = null;
                if ("http".equalsIgnoreCase(parse.getScheme())) {
                    uri = parse.buildUpon().scheme("https").build();
                } else if ("https".equalsIgnoreCase(parse.getScheme())) {
                    uri = parse.buildUpon().scheme("http").build();
                }
                arrayList = new ArrayList();
                a = m8793a(parse);
                a2 = m8793a(uri);
                if (map != null) {
                    zzbv.zzek();
                    zzalo.m9806b(this.f7694a, a);
                    zzbv.zzek();
                    zzalo.m9806b(this.f7694a, a2);
                }
                a3 = m8795a(a, arrayList);
                if (a3 != null) {
                    return m8792a(a, a3);
                }
                if (a2 != null) {
                    a3 = m8794a(a2);
                    if (a3 != null) {
                        a4 = m8792a(a, a3);
                        if (m8794a(a4) != null) {
                            return a4;
                        }
                    }
                }
                if (arrayList.size() == null) {
                    return a;
                }
                if (parseBoolean2 && activityManager != null) {
                    map = activityManager.getRunningAppProcesses();
                    if (map != null) {
                        arrayList2 = arrayList;
                        size = arrayList2.size();
                        i = 0;
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            resolveInfo = (ResolveInfo) obj;
                            it = map.iterator();
                            while (it.hasNext()) {
                                if (((RunningAppProcessInfo) it.next()).processName.equals(resolveInfo.activityInfo.packageName)) {
                                    return m8792a(a, resolveInfo);
                                }
                            }
                        }
                    }
                }
                return parseBoolean ? m8792a(a, (ResolveInfo) arrayList.get(0)) : a;
            }
        }
        map = true;
        if ("http".equalsIgnoreCase(parse.getScheme())) {
            uri = parse.buildUpon().scheme("https").build();
        } else if ("https".equalsIgnoreCase(parse.getScheme())) {
            uri = parse.buildUpon().scheme("http").build();
        }
        arrayList = new ArrayList();
        a = m8793a(parse);
        a2 = m8793a(uri);
        if (map != null) {
            zzbv.zzek();
            zzalo.m9806b(this.f7694a, a);
            zzbv.zzek();
            zzalo.m9806b(this.f7694a, a2);
        }
        a3 = m8795a(a, arrayList);
        if (a3 != null) {
            return m8792a(a, a3);
        }
        if (a2 != null) {
            a3 = m8794a(a2);
            if (a3 != null) {
                a4 = m8792a(a, a3);
                if (m8794a(a4) != null) {
                    return a4;
                }
            }
        }
        if (arrayList.size() == null) {
            return a;
        }
        map = activityManager.getRunningAppProcesses();
        if (map != null) {
            arrayList2 = arrayList;
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                resolveInfo = (ResolveInfo) obj2;
                it = map.iterator();
                while (it.hasNext()) {
                    if (((RunningAppProcessInfo) it.next()).processName.equals(resolveInfo.activityInfo.packageName)) {
                        return m8792a(a, resolveInfo);
                    }
                }
            }
        }
        if (parseBoolean) {
        }
    }
}
