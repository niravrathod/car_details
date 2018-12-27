package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Locale;
import java.util.PriorityQueue;

@zzaer
public final class zzgu {
    /* renamed from: a */
    private final int f9515a;
    /* renamed from: b */
    private final int f9516b;
    /* renamed from: c */
    private final int f9517c;
    /* renamed from: d */
    private final zzgt f9518d = new zzgy();

    public zzgu(int i) {
        this.f9516b = i;
        this.f9515a = 6;
        this.f9517c = 0;
    }

    /* renamed from: a */
    public final String m10652a(ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            stringBuilder.append(((String) obj).toLowerCase(Locale.US));
            stringBuilder.append('\n');
        }
        return m10651a(stringBuilder.toString());
    }

    @VisibleForTesting
    /* renamed from: a */
    private final String m10651a(String str) {
        str = str.split("\n");
        if (str.length == 0) {
            return "";
        }
        qo qoVar = new qo();
        PriorityQueue priorityQueue = new PriorityQueue(this.f9516b, new qn(this));
        for (String a : str) {
            String[] a2 = zzgx.m10654a(a, false);
            if (a2.length != 0) {
                zzha.m10661a(a2, this.f9516b, this.f9515a, priorityQueue);
            }
        }
        str = priorityQueue.iterator();
        while (str.hasNext()) {
            try {
                qoVar.m9367a(this.f9518d.mo2452a(((zzhb) str.next()).f9520b));
            } catch (String str2) {
                zzaok.m10002b("Error while writing hash to byteStream", str2);
            }
        }
        return qoVar.toString();
    }
}
