package com.google.android.gms.internal.measurement;

import android.util.Log;

final class aj extends zzsl<Boolean> {
    aj(zzsv zzsv, String str, Boolean bool) {
        super(zzsv, str, bool);
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2922a(String str) {
        if (zzsg.f10153a.matcher(str).matches()) {
            return Boolean.valueOf(true);
        }
        if (zzsg.f10154b.matcher(str).matches()) {
            return Boolean.valueOf(null);
        }
        String str2 = this.a;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 28) + String.valueOf(str).length());
        stringBuilder.append("Invalid boolean value for ");
        stringBuilder.append(str2);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        Log.e("PhenotypeFlag", stringBuilder.toString());
        return null;
    }
}
