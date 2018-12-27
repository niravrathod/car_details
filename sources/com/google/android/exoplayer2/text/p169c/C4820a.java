package com.google.android.exoplayer2.text.p169c;

import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4693b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.c.a */
public final class C4820a extends C4693b {
    /* renamed from: a */
    private static final Pattern f21203a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    /* renamed from: b */
    private final StringBuilder f21204b = new StringBuilder();

    /* renamed from: a */
    protected /* synthetic */ C2348d mo4689a(byte[] bArr, int i, boolean z) {
        return m28031b(bArr, i, z);
    }

    public C4820a() {
        super("SubripDecoder");
    }

    /* renamed from: b */
    protected com.google.android.exoplayer2.text.p169c.C4043b m28031b(byte[] r6, int r7, boolean r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r8 = new java.util.ArrayList;
        r8.<init>();
        r0 = new com.google.android.exoplayer2.c.f;
        r0.<init>();
        r1 = new com.google.android.exoplayer2.c.k;
        r1.<init>(r6, r7);
    L_0x000f:
        r6 = r1.m8004y();
        if (r6 == 0) goto L_0x00bd;
    L_0x0015:
        r7 = r6.length();
        if (r7 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x000f;
    L_0x001c:
        java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00a5 }
        r6 = r1.m8004y();
        r7 = f21203a;
        r7 = r7.matcher(r6);
        r2 = r7.matches();
        if (r2 == 0) goto L_0x008d;
    L_0x002f:
        r6 = 1;
        r2 = com.google.android.exoplayer2.text.p169c.C4820a.m28029a(r7, r6);
        r0.m7937a(r2);
        r2 = 6;
        r3 = r7.group(r2);
        r3 = android.text.TextUtils.isEmpty(r3);
        r4 = 0;
        if (r3 != 0) goto L_0x004b;
    L_0x0043:
        r2 = com.google.android.exoplayer2.text.p169c.C4820a.m28029a(r7, r2);
        r0.m7937a(r2);
        goto L_0x004c;
    L_0x004b:
        r6 = 0;
    L_0x004c:
        r7 = r5.f21204b;
        r7.setLength(r4);
    L_0x0051:
        r7 = r1.m8004y();
        r2 = android.text.TextUtils.isEmpty(r7);
        if (r2 != 0) goto L_0x0074;
    L_0x005b:
        r2 = r5.f21204b;
        r2 = r2.length();
        if (r2 <= 0) goto L_0x006a;
    L_0x0063:
        r2 = r5.f21204b;
        r3 = "<br>";
        r2.append(r3);
    L_0x006a:
        r2 = r5.f21204b;
        r7 = r7.trim();
        r2.append(r7);
        goto L_0x0051;
    L_0x0074:
        r7 = r5.f21204b;
        r7 = r7.toString();
        r7 = android.text.Html.fromHtml(r7);
        r2 = new com.google.android.exoplayer2.text.a;
        r2.<init>(r7);
        r8.add(r2);
        if (r6 == 0) goto L_0x000f;
    L_0x0088:
        r6 = 0;
        r8.add(r6);
        goto L_0x000f;
    L_0x008d:
        r7 = "SubripDecoder";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Skipping invalid timing: ";
        r2.append(r3);
        r2.append(r6);
        r6 = r2.toString();
        android.util.Log.w(r7, r6);
        goto L_0x000f;
    L_0x00a5:
        r7 = "SubripDecoder";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Skipping invalid index: ";
        r2.append(r3);
        r2.append(r6);
        r6 = r2.toString();
        android.util.Log.w(r7, r6);
        goto L_0x000f;
    L_0x00bd:
        r6 = r8.size();
        r6 = new com.google.android.exoplayer2.text.C2333a[r6];
        r8.toArray(r6);
        r7 = r0.m7938b();
        r8 = new com.google.android.exoplayer2.text.c.b;
        r8.<init>(r6, r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.c.a.b(byte[], int, boolean):com.google.android.exoplayer2.text.c.b");
    }

    /* renamed from: a */
    private static long m28029a(Matcher matcher, int i) {
        return ((((((Long.parseLong(matcher.group(i + 1)) * 60) * 60) * 1000) + ((Long.parseLong(matcher.group(i + 2)) * 60) * 1000)) + (Long.parseLong(matcher.group(i + 3)) * 1000)) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }
}
