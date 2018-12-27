package p173;

/* renamed from: d */
public final class C4896d {
    /* renamed from: a */
    public static java.lang.String m30257a(java.lang.String r2, java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ Exception -> 0x001e }
        r3 = r3.getBytes();	 Catch:{ Exception -> 0x001e }
        r1 = "AES";	 Catch:{ Exception -> 0x001e }
        r0.<init>(r3, r1);	 Catch:{ Exception -> 0x001e }
        r3 = "AES/ECB/PKCS5Padding";	 Catch:{ Exception -> 0x001e }
        r3 = javax.crypto.Cipher.getInstance(r3);	 Catch:{ Exception -> 0x001e }
        r1 = 1;	 Catch:{ Exception -> 0x001e }
        r3.init(r1, r0);	 Catch:{ Exception -> 0x001e }
        r2 = r2.getBytes();	 Catch:{ Exception -> 0x001e }
        r2 = r3.doFinal(r2);	 Catch:{ Exception -> 0x001e }
        goto L_0x001f;
    L_0x001e:
        r2 = 0;
    L_0x001f:
        r3 = new java.lang.String;
        r0 = 0;
        r2 = android.util.Base64.encode(r2, r0);
        r3.<init>(r2);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a(java.lang.String, java.lang.String):java.lang.String");
    }
}
