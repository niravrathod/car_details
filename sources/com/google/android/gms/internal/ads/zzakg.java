package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import com.j256.ormlite.stmt.query.SimpleComparison;

@zzaer
public final class zzakg {
    /* renamed from: a */
    public static String m9683a(String str, Context context, boolean z) {
        if ((!((Boolean) zzkd.m10713e().m10897a(zznw.aj)).booleanValue() || z) && zzbv.zzfj().m9668a(context)) {
            if (!TextUtils.isEmpty(str)) {
                String e = zzbv.zzfj().m9675e(context);
                if (e == false) {
                    return str;
                }
                if (((Boolean) zzkd.m10713e().m10897a(zznw.ae)).booleanValue()) {
                    String str2 = (String) zzkd.m10713e().m10897a(zznw.af);
                    if (str.contains(str2)) {
                        if (zzbv.zzek().m9846d(str)) {
                            zzbv.zzfj().m9674d(context, e);
                            return str.replace(str2, e);
                        } else if (zzbv.zzek().m9847e(str)) {
                            zzbv.zzfj().m9676e(context, e);
                            return str.replace(str2, e);
                        }
                    }
                } else if (!str.contains("fbs_aeid")) {
                    if (zzbv.zzek().m9846d(str)) {
                        zzbv.zzfj().m9674d(context, e);
                        return m9680a(str, "fbs_aeid", e).toString();
                    } else if (zzbv.zzek().m9847e(str)) {
                        zzbv.zzfj().m9676e(context, e);
                        return m9680a(str, "fbs_aeid", e).toString();
                    }
                }
                return str;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m9682a(String str, Context context) {
        if (zzbv.zzfj().m9668a(context)) {
            if (!TextUtils.isEmpty(str)) {
                String e = zzbv.zzfj().m9675e(context);
                if (e == null || !zzbv.zzek().m9847e(str)) {
                    return str;
                }
                if (((Boolean) zzkd.m10713e().m10897a(zznw.ae)).booleanValue()) {
                    String str2 = (String) zzkd.m10713e().m10897a(zznw.af);
                    if (str.contains(str2)) {
                        return str.replace(str2, e);
                    }
                } else if (!str.contains("fbs_aeid")) {
                    return m9680a(str, "fbs_aeid", e).toString();
                }
                return str;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m9681a(Uri uri, Context context) {
        if (!zzbv.zzfj().m9668a(context)) {
            return uri.toString();
        }
        String e = zzbv.zzfj().m9675e(context);
        if (e == null) {
            return uri.toString();
        }
        if (((Boolean) zzkd.m10713e().m10897a(zznw.ae)).booleanValue()) {
            String str = (String) zzkd.m10713e().m10897a(zznw.af);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                zzbv.zzfj().m9674d(context, e);
                return uri2.replace(str, e);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = m9680a(uri.toString(), "fbs_aeid", e);
            zzbv.zzfj().m9674d(context, e);
        }
        return uri.toString();
    }

    @VisibleForTesting
    /* renamed from: a */
    private static Uri m9680a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        indexOf++;
        StringBuilder stringBuilder = new StringBuilder(str.substring(0, indexOf));
        stringBuilder.append(str2);
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        stringBuilder.append(str3);
        stringBuilder.append("&");
        stringBuilder.append(str.substring(indexOf));
        return Uri.parse(stringBuilder.toString());
    }
}
