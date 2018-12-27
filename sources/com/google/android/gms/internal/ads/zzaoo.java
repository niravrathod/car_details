package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@zzaer
public final class zzaoo implements zzaod {
    /* renamed from: a */
    private final String f16879a;

    public zzaoo() {
        this(null);
    }

    public zzaoo(String str) {
        this.f16879a = str;
    }

    /* renamed from: a */
    public final void mo1944a(String str) {
        String str2;
        StringBuilder stringBuilder;
        HttpURLConnection httpURLConnection;
        try {
            str2 = "Pinging URL: ";
            String valueOf = String.valueOf(str);
            zzaok.m10001b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            zzkd.m10709a();
            zzaoa.m9960a(true, httpURLConnection, this.f16879a);
            zzaoe zzaoe = new zzaoe();
            zzaoe.m9995a(httpURLConnection, null);
            int responseCode = httpURLConnection.getResponseCode();
            zzaoe.m9994a(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 65);
                stringBuilder2.append("Received non-success response code ");
                stringBuilder2.append(responseCode);
                stringBuilder2.append(" from pinging URL: ");
                stringBuilder2.append(str);
                zzaok.m10007e(stringBuilder2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str2 = e.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(str2).length());
            stringBuilder.append("Error while parsing ping URL: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            zzaok.m10007e(stringBuilder.toString());
        } catch (IOException e2) {
            str2 = e2.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length());
            stringBuilder.append("Error while pinging URL: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            zzaok.m10007e(stringBuilder.toString());
        } catch (RuntimeException e3) {
            str2 = e3.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length());
            stringBuilder.append("Error while pinging URL: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            zzaok.m10007e(stringBuilder.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
