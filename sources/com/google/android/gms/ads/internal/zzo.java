package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzo {
    public static Object[] zza(String str, zzjk zzjk, String str2, int i, zzjo zzjo) {
        zzjo = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (zzjo.contains("formatString") != null) {
            arrayList.add(null);
        }
        if (zzjo.contains("networkType") != null) {
            arrayList.add(Integer.valueOf(i));
        }
        if (zzjo.contains("birthday") != null) {
            arrayList.add(Long.valueOf(zzjk.f20207b));
        }
        if (zzjo.contains("extras") != null) {
            arrayList.add(m8817a(zzjk.f20208c));
        }
        if (zzjo.contains("gender") != null) {
            arrayList.add(Integer.valueOf(zzjk.f20209d));
        }
        if (zzjo.contains("keywords") != null) {
            if (zzjk.f20210e != null) {
                arrayList.add(zzjk.f20210e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (zzjo.contains("isTestDevice") != null) {
            arrayList.add(Boolean.valueOf(zzjk.f20211f));
        }
        if (zzjo.contains("tagForChildDirectedTreatment") != null) {
            arrayList.add(Integer.valueOf(zzjk.f20212g));
        }
        if (zzjo.contains("manualImpressionsEnabled") != null) {
            arrayList.add(Boolean.valueOf(zzjk.f20213h));
        }
        if (zzjo.contains("publisherProvidedId") != null) {
            arrayList.add(zzjk.f20214i);
        }
        if (zzjo.contains("location") != null) {
            if (zzjk.f20216k != null) {
                arrayList.add(zzjk.f20216k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (zzjo.contains("contentUrl") != null) {
            arrayList.add(zzjk.f20217l);
        }
        if (zzjo.contains("networkExtras") != null) {
            arrayList.add(m8817a(zzjk.f20218m));
        }
        if (zzjo.contains("customTargeting") != null) {
            arrayList.add(m8817a(zzjk.f20219n));
        }
        if (zzjo.contains("categoryExclusions") != null) {
            if (zzjk.f20220o != null) {
                arrayList.add(zzjk.f20220o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (zzjo.contains("requestAgent") != null) {
            arrayList.add(zzjk.f20221p);
        }
        if (zzjo.contains("requestPackage") != null) {
            arrayList.add(zzjk.f20222q);
        }
        if (zzjo.contains("isDesignedForFamilies") != null) {
            arrayList.add(Boolean.valueOf(zzjk.f20223r));
        }
        return arrayList.toArray();
    }

    /* renamed from: a */
    private static String m8817a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            String str;
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = m8817a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
