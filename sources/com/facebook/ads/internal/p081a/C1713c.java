package com.facebook.ads.internal.p081a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1906a;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.c */
public class C1713c {
    /* renamed from: a */
    private static final String f5153a = "c";

    /* renamed from: a */
    public static C1712b m6462a(Context context, C1827c c1827c, String str, Uri uri, Map<String, String> map) {
        if (uri == null) {
            return null;
        }
        String authority = uri.getAuthority();
        String queryParameter = uri.getQueryParameter("video_url");
        if (!TextUtils.isEmpty(uri.getQueryParameter("data"))) {
            try {
                JSONObject jSONObject = new JSONObject(uri.getQueryParameter("data"));
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    map.put(str2, jSONObject.getString(str2));
                }
            } catch (Throwable e) {
                Log.w(f5153a, "Unable to parse json data in AdActionFactory.", e);
            }
        }
        C1719l a = C1719l.m6475a(c1827c, C1906a.m7249a());
        Object obj = -1;
        int hashCode = authority.hashCode();
        if (hashCode != -1458789996) {
            if (hashCode != 109770977) {
                if (hashCode == 1546100943) {
                    if (authority.equals("open_link")) {
                        obj = 1;
                    }
                }
            } else if (authority.equals("store")) {
                obj = null;
            }
        } else if (authority.equals("passthrough")) {
            obj = 2;
        }
        switch (obj) {
            case null:
                return queryParameter != null ? null : new C4590f(context, c1827c, str, uri, map, a);
            case 1:
                return new C4591i(context, c1827c, str, uri, map, a);
            case 2:
                return new C3764j(context, c1827c, str, uri, map);
            default:
                return new C3765k(context, c1827c, str, uri);
        }
    }

    /* renamed from: a */
    public static boolean m6463a(String str) {
        if (!"store".equalsIgnoreCase(str)) {
            if (!"open_link".equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
