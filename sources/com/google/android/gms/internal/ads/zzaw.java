package com.google.android.gms.internal.ads;

public class zzaw extends zzr<String> {
    /* renamed from: a */
    private final Object f17000a = new Object();
    /* renamed from: b */
    private zzz<String> f17001b;

    public zzaw(int i, String str, zzz<String> zzz, zzy zzy) {
        super(i, str, zzy);
        this.f17001b = zzz;
    }

    /* renamed from: a */
    protected void mo4153a(String str) {
        synchronized (this.f17000a) {
            zzz zzz = this.f17001b;
        }
        if (zzz != null) {
            zzz.mo4156a(str);
        }
    }

    /* renamed from: a */
    protected final com.google.android.gms.internal.ads.zzx<java.lang.String> mo2369a(com.google.android.gms.internal.ads.zzp r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r1 = r11.f9765b;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r2 = r11.f9766c;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r3 = "ISO-8859-1";	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r4 = "Content-Type";	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r2 = r2.get(r4);	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r2 = (java.lang.String) r2;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        if (r2 == 0) goto L_0x003e;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
    L_0x0012:
        r4 = ";";	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r5 = 0;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r2 = r2.split(r4, r5);	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r4 = 1;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r6 = 1;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
    L_0x001b:
        r7 = r2.length;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        if (r6 >= r7) goto L_0x003e;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
    L_0x001e:
        r7 = r2[r6];	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r7 = r7.trim();	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r8 = "=";	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r7 = r7.split(r8, r5);	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r8 = r7.length;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r9 = 2;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        if (r8 != r9) goto L_0x003b;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
    L_0x002e:
        r8 = r7[r5];	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r9 = "charset";	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        r8 = r8.equals(r9);	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        if (r8 == 0) goto L_0x003b;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
    L_0x0038:
        r3 = r7[r4];	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        goto L_0x003e;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
    L_0x003b:
        r6 = r6 + 1;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        goto L_0x001b;	 Catch:{ UnsupportedEncodingException -> 0x0042 }
    L_0x003e:
        r0.<init>(r1, r3);	 Catch:{ UnsupportedEncodingException -> 0x0042 }
        goto L_0x0049;
    L_0x0042:
        r0 = new java.lang.String;
        r1 = r11.f9765b;
        r0.<init>(r1);
    L_0x0049:
        r11 = com.google.android.gms.internal.ads.zzap.m10032a(r11);
        r11 = com.google.android.gms.internal.ads.zzx.m11177a(r0, r11);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaw.a(com.google.android.gms.internal.ads.zzp):com.google.android.gms.internal.ads.zzx<java.lang.String>");
    }

    /* renamed from: a */
    protected /* synthetic */ void mo2370a(Object obj) {
        mo4153a((String) obj);
    }
}
