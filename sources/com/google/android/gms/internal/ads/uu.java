package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;

@zzaer
final class uu {
    /* renamed from: a */
    final zzjk f8421a;
    /* renamed from: b */
    final String f8422b;
    /* renamed from: c */
    final int f8423c;

    /* renamed from: a */
    static uu m9399a(String str) {
        str = str.split("\u0000");
        if (str.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(str[0], 0), "UTF-8");
                int parseInt = Integer.parseInt(str[1]);
                str = Base64.decode(str[2], 0);
                obtain.unmarshall(str, 0, str.length);
                obtain.setDataPosition(0);
                uu uuVar = new uu((zzjk) zzjk.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return uuVar;
            } catch (Throwable e) {
                zzbv.zzeo().m9714a(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    uu(us usVar) {
        this(usVar.m9388a(), usVar.m9392c(), usVar.m9391b());
    }

    @VisibleForTesting
    private uu(zzjk zzjk, String str, int i) {
        this.f8421a = zzjk;
        this.f8422b = str;
        this.f8423c = i;
    }

    /* renamed from: a */
    final java.lang.String m9400a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = android.os.Parcel.obtain();
        r1 = r6.f8422b;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r2 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = r1.getBytes(r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r2 = 0;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = android.util.Base64.encodeToString(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r3 = r6.f8423c;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r6.f8421a;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4.writeToParcel(r0, r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r0.marshall();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r2 = android.util.Base64.encodeToString(r4, r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r4.length();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r4 + 2;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = java.lang.String.valueOf(r3);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = r5.length();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r4 + r5;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = r5.length();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r4 + r5;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.<init>(r4);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r3);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = r5.toString();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r0.recycle();
        return r1;
    L_0x0060:
        r1 = move-exception;
        goto L_0x006d;
    L_0x0062:
        r1 = "QueueSeed encode failed because UTF-8 is not available.";	 Catch:{ all -> 0x0060 }
        com.google.android.gms.internal.ads.zzaok.m10003c(r1);	 Catch:{ all -> 0x0060 }
        r0.recycle();
        r0 = "";
        return r0;
    L_0x006d:
        r0.recycle();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uu.a():java.lang.String");
    }
}
