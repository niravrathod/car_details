package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

@zzaer
public final class zzati {
    /* renamed from: a */
    private static final Pattern f9013a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    /* renamed from: b */
    private static final Pattern f9014b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* renamed from: a */
    public static String m10101a(String str, String... strArr) {
        if (strArr.length == 0) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher = f9013a.matcher(str);
        int i = 0;
        int end;
        if (matcher.find()) {
            end = matcher.end();
            stringBuilder.append(str.substring(0, end));
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                if (str2 != null) {
                    stringBuilder.append(str2);
                }
                i++;
            }
            stringBuilder.append(str.substring(end));
        } else {
            if (!f9014b.matcher(str).find()) {
                end = strArr.length;
                while (i < end) {
                    String str3 = strArr[i];
                    if (str3 != null) {
                        stringBuilder.append(str3);
                    }
                    i++;
                }
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m10100a() {
        String str = (String) zzkd.m10713e().m10897a(zznw.f9683H);
        String str2 = "12.4.51-000";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", str2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<script>");
            stringBuilder.append("Object.defineProperty(window,'MRAID_ENV',{get:function(){return ");
            stringBuilder.append(jSONObject.toString());
            stringBuilder.append("}});");
            stringBuilder.append("</script>");
            return stringBuilder.toString();
        } catch (Throwable e) {
            zzaok.m10004c("Unable to build MRAID_ENV", e);
            return null;
        }
    }
}
