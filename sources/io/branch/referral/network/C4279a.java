package io.branch.referral.network;

import android.content.Context;
import io.branch.referral.C2754n;
import io.branch.referral.network.BranchRemoteInterface.C2755a;
import org.json.JSONObject;

/* renamed from: io.branch.referral.network.a */
public class C4279a extends BranchRemoteInterface {
    /* renamed from: a */
    C2754n f17979a;

    C4279a(Context context) {
        this.f17979a = C2754n.m13342a(context);
    }

    /* renamed from: a */
    public C2755a mo3533a(String str) {
        return m23485a(str, 0);
    }

    /* renamed from: a */
    public C2755a mo3534a(String str, JSONObject jSONObject) {
        return m23486a(str, jSONObject, 0);
    }

    /* renamed from: a */
    private io.branch.referral.network.BranchRemoteInterface.C2755a m23485a(java.lang.String r8, int r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = -113; // 0xffffffffffffff8f float:NaN double:NaN;
        r1 = 0;
        r2 = r7.f17979a;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r2 = r2.m13367b();	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        if (r2 > 0) goto L_0x000d;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x000b:
        r2 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x000d:
        r3 = "?";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = r8.contains(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        if (r3 == 0) goto L_0x0018;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x0015:
        r3 = "&";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        goto L_0x001a;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x0018:
        r3 = "?";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
    L_0x001a:
        r4 = new java.lang.StringBuilder;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.<init>();	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r8);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = "retryNumber";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = "=";	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.append(r9);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = r4.toString();	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4 = new java.net.URL;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r4.<init>(r3);	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = r4.openConnection();	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3 = (javax.net.ssl.HttpsURLConnection) r3;	 Catch:{ SocketException -> 0x0124, SocketTimeoutException -> 0x00f9, IOException -> 0x00d2 }
        r3.setConnectTimeout(r2);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r3.setReadTimeout(r2);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r2 = r3.getResponseCode();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        if (r2 < r4) goto L_0x0072;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
    L_0x004f:
        r4 = r7.f17979a;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r4 = r4.m13371c();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        if (r9 >= r4) goto L_0x0072;
    L_0x0057:
        r1 = r7.f17979a;	 Catch:{ InterruptedException -> 0x0062 }
        r1 = r1.m13374d();	 Catch:{ InterruptedException -> 0x0062 }
        r1 = (long) r1;	 Catch:{ InterruptedException -> 0x0062 }
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x0062 }
        goto L_0x0066;
    L_0x0062:
        r1 = move-exception;
        r1.printStackTrace();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
    L_0x0066:
        r9 = r9 + 1;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r1 = r7.m23485a(r8, r9);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        if (r3 == 0) goto L_0x0071;
    L_0x006e:
        r3.disconnect();
    L_0x0071:
        return r1;
    L_0x0072:
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 == r4) goto L_0x008f;
    L_0x0076:
        r4 = r3.getErrorStream();	 Catch:{ FileNotFoundException -> 0x00a2 }
        if (r4 == 0) goto L_0x008f;	 Catch:{ FileNotFoundException -> 0x00a2 }
    L_0x007c:
        r4 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ FileNotFoundException -> 0x00a2 }
        r5 = r3.getErrorStream();	 Catch:{ FileNotFoundException -> 0x00a2 }
        r5 = r7.m23487a(r5);	 Catch:{ FileNotFoundException -> 0x00a2 }
        r4.<init>(r5, r2);	 Catch:{ FileNotFoundException -> 0x00a2 }
        if (r3 == 0) goto L_0x008e;
    L_0x008b:
        r3.disconnect();
    L_0x008e:
        return r4;
    L_0x008f:
        r4 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ FileNotFoundException -> 0x00a2 }
        r5 = r3.getInputStream();	 Catch:{ FileNotFoundException -> 0x00a2 }
        r5 = r7.m23487a(r5);	 Catch:{ FileNotFoundException -> 0x00a2 }
        r4.<init>(r5, r2);	 Catch:{ FileNotFoundException -> 0x00a2 }
        if (r3 == 0) goto L_0x00a1;
    L_0x009e:
        r3.disconnect();
    L_0x00a1:
        return r4;
    L_0x00a2:
        r4 = "BranchSDK";	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5 = new java.lang.StringBuilder;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5.<init>();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r6 = "A resource conflict occurred with this request ";	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5.append(r6);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5.append(r8);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r5 = r5.toString();	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        io.branch.referral.C2754n.m13344b(r4, r5);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r4 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        r4.<init>(r1, r2);	 Catch:{ SocketException -> 0x00cc, SocketTimeoutException -> 0x00ca, IOException -> 0x00c7, all -> 0x00c3 }
        if (r3 == 0) goto L_0x00c2;
    L_0x00bf:
        r3.disconnect();
    L_0x00c2:
        return r4;
    L_0x00c3:
        r8 = move-exception;
        r1 = r3;
        goto L_0x014b;
    L_0x00c7:
        r8 = move-exception;
        r1 = r3;
        goto L_0x00d3;
    L_0x00ca:
        r1 = r3;
        goto L_0x00f9;
    L_0x00cc:
        r8 = move-exception;
        r1 = r3;
        goto L_0x0125;
    L_0x00cf:
        r8 = move-exception;
        goto L_0x014b;
    L_0x00d2:
        r8 = move-exception;
    L_0x00d3:
        r9 = r7.getClass();	 Catch:{ all -> 0x00cf }
        r9 = r9.getSimpleName();	 Catch:{ all -> 0x00cf }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00cf }
        r2.<init>();	 Catch:{ all -> 0x00cf }
        r3 = "Branch connect exception: ";	 Catch:{ all -> 0x00cf }
        r2.append(r3);	 Catch:{ all -> 0x00cf }
        r8 = r8.getMessage();	 Catch:{ all -> 0x00cf }
        r2.append(r8);	 Catch:{ all -> 0x00cf }
        r8 = r2.toString();	 Catch:{ all -> 0x00cf }
        io.branch.referral.C2754n.m13344b(r9, r8);	 Catch:{ all -> 0x00cf }
        r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00cf }
        r8.<init>(r0);	 Catch:{ all -> 0x00cf }
        throw r8;	 Catch:{ all -> 0x00cf }
    L_0x00f9:
        r0 = r7.f17979a;	 Catch:{ all -> 0x00cf }
        r0 = r0.m13371c();	 Catch:{ all -> 0x00cf }
        if (r9 >= r0) goto L_0x011c;
    L_0x0101:
        r0 = r7.f17979a;	 Catch:{ InterruptedException -> 0x010c }
        r0 = r0.m13374d();	 Catch:{ InterruptedException -> 0x010c }
        r2 = (long) r0;	 Catch:{ InterruptedException -> 0x010c }
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x010c }
        goto L_0x0110;
    L_0x010c:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x00cf }
    L_0x0110:
        r9 = r9 + 1;	 Catch:{ all -> 0x00cf }
        r8 = r7.m23485a(r8, r9);	 Catch:{ all -> 0x00cf }
        if (r1 == 0) goto L_0x011b;
    L_0x0118:
        r1.disconnect();
    L_0x011b:
        return r8;
    L_0x011c:
        r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00cf }
        r9 = -111; // 0xffffffffffffff91 float:NaN double:NaN;	 Catch:{ all -> 0x00cf }
        r8.<init>(r9);	 Catch:{ all -> 0x00cf }
        throw r8;	 Catch:{ all -> 0x00cf }
    L_0x0124:
        r8 = move-exception;	 Catch:{ all -> 0x00cf }
    L_0x0125:
        r9 = r7.getClass();	 Catch:{ all -> 0x00cf }
        r9 = r9.getSimpleName();	 Catch:{ all -> 0x00cf }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00cf }
        r2.<init>();	 Catch:{ all -> 0x00cf }
        r3 = "Http connect exception: ";	 Catch:{ all -> 0x00cf }
        r2.append(r3);	 Catch:{ all -> 0x00cf }
        r8 = r8.getMessage();	 Catch:{ all -> 0x00cf }
        r2.append(r8);	 Catch:{ all -> 0x00cf }
        r8 = r2.toString();	 Catch:{ all -> 0x00cf }
        io.branch.referral.C2754n.m13344b(r9, r8);	 Catch:{ all -> 0x00cf }
        r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00cf }
        r8.<init>(r0);	 Catch:{ all -> 0x00cf }
        throw r8;	 Catch:{ all -> 0x00cf }
    L_0x014b:
        if (r1 == 0) goto L_0x0150;
    L_0x014d:
        r1.disconnect();
    L_0x0150:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.a.a(java.lang.String, int):io.branch.referral.network.BranchRemoteInterface$a");
    }

    /* renamed from: a */
    private io.branch.referral.network.BranchRemoteInterface.C2755a m23486a(java.lang.String r10, org.json.JSONObject r11, int r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r0 = r9.f17979a;
        r0 = r0.m13367b();
        if (r0 > 0) goto L_0x000a;
    L_0x0008:
        r0 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
    L_0x000a:
        r1 = "retryNumber";	 Catch:{ JSONException -> 0x000f }
        r11.put(r1, r12);	 Catch:{ JSONException -> 0x000f }
    L_0x000f:
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r2 = 1;
        r3 = 0;
        r4 = new java.net.URL;	 Catch:{ SocketTimeoutException -> 0x0158, IOException -> 0x012f, Exception -> 0x00ef }
        r4.<init>(r10);	 Catch:{ SocketTimeoutException -> 0x0158, IOException -> 0x012f, Exception -> 0x00ef }
        r4 = r4.openConnection();	 Catch:{ SocketTimeoutException -> 0x0158, IOException -> 0x012f, Exception -> 0x00ef }
        r4 = (javax.net.ssl.HttpsURLConnection) r4;	 Catch:{ SocketTimeoutException -> 0x0158, IOException -> 0x012f, Exception -> 0x00ef }
        r4.setConnectTimeout(r0);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r4.setReadTimeout(r0);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r4.setDoInput(r2);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r4.setDoOutput(r2);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0 = "Content-Type";	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r5 = "application/json";	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r4.setRequestProperty(r0, r5);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0 = "Accept";	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r5 = "application/json";	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r4.setRequestProperty(r0, r5);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0 = "POST";	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r4.setRequestMethod(r0);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0 = new java.io.OutputStreamWriter;	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r5 = r4.getOutputStream();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0.<init>(r5);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r5 = r11.toString();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0.write(r5);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0.flush();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0.close();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0 = r4.getResponseCode();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        if (r0 < r1) goto L_0x007c;	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
    L_0x0059:
        r5 = r9.f17979a;	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r5 = r5.m13371c();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        if (r12 >= r5) goto L_0x007c;
    L_0x0061:
        r0 = r9.f17979a;	 Catch:{ InterruptedException -> 0x006c }
        r0 = r0.m13374d();	 Catch:{ InterruptedException -> 0x006c }
        r5 = (long) r0;	 Catch:{ InterruptedException -> 0x006c }
        java.lang.Thread.sleep(r5);	 Catch:{ InterruptedException -> 0x006c }
        goto L_0x0070;
    L_0x006c:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
    L_0x0070:
        r12 = r12 + 1;	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        r0 = r9.m23486a(r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
        if (r4 == 0) goto L_0x007b;
    L_0x0078:
        r4.disconnect();
    L_0x007b:
        return r0;
    L_0x007c:
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 == r5) goto L_0x0090;
    L_0x0080:
        r5 = r4.getErrorStream();	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
        if (r5 == 0) goto L_0x0090;	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
    L_0x0086:
        r5 = r4.getErrorStream();	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
        goto L_0x0094;	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
    L_0x008b:
        r0 = move-exception;	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
        r5 = r3;	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
        goto L_0x00d9;	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
    L_0x008e:
        r5 = r3;	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
        goto L_0x00ad;	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
    L_0x0090:
        r5 = r4.getInputStream();	 Catch:{ FileNotFoundException -> 0x008e, all -> 0x008b }
    L_0x0094:
        r6 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ FileNotFoundException -> 0x00ad }
        r7 = r9.m23487a(r5);	 Catch:{ FileNotFoundException -> 0x00ad }
        r6.<init>(r7, r0);	 Catch:{ FileNotFoundException -> 0x00ad }
        if (r5 == 0) goto L_0x00a7;
    L_0x009f:
        r5.close();	 Catch:{ IOException -> 0x00a3, SocketTimeoutException -> 0x00e9, Exception -> 0x00e4 }
        goto L_0x00a7;
    L_0x00a3:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
    L_0x00a7:
        if (r4 == 0) goto L_0x00ac;
    L_0x00a9:
        r4.disconnect();
    L_0x00ac:
        return r6;
    L_0x00ad:
        r6 = "BranchSDK";	 Catch:{ all -> 0x00d8 }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d8 }
        r7.<init>();	 Catch:{ all -> 0x00d8 }
        r8 = "A resource conflict occurred with this request ";	 Catch:{ all -> 0x00d8 }
        r7.append(r8);	 Catch:{ all -> 0x00d8 }
        r7.append(r10);	 Catch:{ all -> 0x00d8 }
        r7 = r7.toString();	 Catch:{ all -> 0x00d8 }
        io.branch.referral.C2754n.m13344b(r6, r7);	 Catch:{ all -> 0x00d8 }
        r6 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ all -> 0x00d8 }
        r6.<init>(r3, r0);	 Catch:{ all -> 0x00d8 }
        if (r5 == 0) goto L_0x00d2;
    L_0x00ca:
        r5.close();	 Catch:{ IOException -> 0x00ce, SocketTimeoutException -> 0x00e9, Exception -> 0x00e4 }
        goto L_0x00d2;
    L_0x00ce:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
    L_0x00d2:
        if (r4 == 0) goto L_0x00d7;
    L_0x00d4:
        r4.disconnect();
    L_0x00d7:
        return r6;
    L_0x00d8:
        r0 = move-exception;
    L_0x00d9:
        if (r5 == 0) goto L_0x00e3;
    L_0x00db:
        r5.close();	 Catch:{ IOException -> 0x00df, SocketTimeoutException -> 0x00e9, Exception -> 0x00e4 }
        goto L_0x00e3;
    L_0x00df:
        r5 = move-exception;
        r5.printStackTrace();	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
    L_0x00e3:
        throw r0;	 Catch:{ SocketTimeoutException -> 0x00e9, IOException -> 0x00e6, Exception -> 0x00e4 }
    L_0x00e4:
        r10 = move-exception;
        goto L_0x00f1;
    L_0x00e6:
        r10 = move-exception;
        r3 = r4;
        goto L_0x0130;
    L_0x00e9:
        r3 = r4;
        goto L_0x0158;
    L_0x00eb:
        r10 = move-exception;
        r4 = r3;
        goto L_0x0182;
    L_0x00ef:
        r10 = move-exception;
        r4 = r3;
    L_0x00f1:
        r11 = r9.getClass();	 Catch:{ all -> 0x012d }
        r11 = r11.getSimpleName();	 Catch:{ all -> 0x012d }
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012d }
        r12.<init>();	 Catch:{ all -> 0x012d }
        r0 = "Exception: ";	 Catch:{ all -> 0x012d }
        r12.append(r0);	 Catch:{ all -> 0x012d }
        r0 = r10.getMessage();	 Catch:{ all -> 0x012d }
        r12.append(r0);	 Catch:{ all -> 0x012d }
        r12 = r12.toString();	 Catch:{ all -> 0x012d }
        io.branch.referral.C2754n.m13344b(r11, r12);	 Catch:{ all -> 0x012d }
        r11 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x012d }
        r12 = 11;	 Catch:{ all -> 0x012d }
        if (r11 < r12) goto L_0x0122;	 Catch:{ all -> 0x012d }
    L_0x0117:
        r10 = r10 instanceof android.os.NetworkOnMainThreadException;	 Catch:{ all -> 0x012d }
        if (r10 == 0) goto L_0x0122;	 Catch:{ all -> 0x012d }
    L_0x011b:
        r10 = "BranchSDK";	 Catch:{ all -> 0x012d }
        r11 = "Branch Error: Don't call our synchronous methods on the main thread!!!";	 Catch:{ all -> 0x012d }
        android.util.Log.i(r10, r11);	 Catch:{ all -> 0x012d }
    L_0x0122:
        r10 = new io.branch.referral.network.BranchRemoteInterface$a;	 Catch:{ all -> 0x012d }
        r10.<init>(r3, r1);	 Catch:{ all -> 0x012d }
        if (r4 == 0) goto L_0x012c;
    L_0x0129:
        r4.disconnect();
    L_0x012c:
        return r10;
    L_0x012d:
        r10 = move-exception;
        goto L_0x0182;
    L_0x012f:
        r10 = move-exception;
    L_0x0130:
        r11 = r9.getClass();	 Catch:{ all -> 0x00eb }
        r11 = r11.getSimpleName();	 Catch:{ all -> 0x00eb }
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00eb }
        r12.<init>();	 Catch:{ all -> 0x00eb }
        r0 = "Http connect exception: ";	 Catch:{ all -> 0x00eb }
        r12.append(r0);	 Catch:{ all -> 0x00eb }
        r10 = r10.getMessage();	 Catch:{ all -> 0x00eb }
        r12.append(r10);	 Catch:{ all -> 0x00eb }
        r10 = r12.toString();	 Catch:{ all -> 0x00eb }
        io.branch.referral.C2754n.m13344b(r11, r10);	 Catch:{ all -> 0x00eb }
        r10 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00eb }
        r11 = -113; // 0xffffffffffffff8f float:NaN double:NaN;	 Catch:{ all -> 0x00eb }
        r10.<init>(r11);	 Catch:{ all -> 0x00eb }
        throw r10;	 Catch:{ all -> 0x00eb }
    L_0x0158:
        r0 = r9.f17979a;	 Catch:{ all -> 0x00eb }
        r0 = r0.m13371c();	 Catch:{ all -> 0x00eb }
        if (r12 >= r0) goto L_0x017a;
    L_0x0160:
        r0 = r9.f17979a;	 Catch:{ InterruptedException -> 0x016b }
        r0 = r0.m13374d();	 Catch:{ InterruptedException -> 0x016b }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x016b }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x016b }
        goto L_0x016f;
    L_0x016b:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x00eb }
    L_0x016f:
        r12 = r12 + r2;	 Catch:{ all -> 0x00eb }
        r10 = r9.m23486a(r10, r11, r12);	 Catch:{ all -> 0x00eb }
        if (r3 == 0) goto L_0x0179;
    L_0x0176:
        r3.disconnect();
    L_0x0179:
        return r10;
    L_0x017a:
        r10 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException;	 Catch:{ all -> 0x00eb }
        r11 = -111; // 0xffffffffffffff91 float:NaN double:NaN;	 Catch:{ all -> 0x00eb }
        r10.<init>(r11);	 Catch:{ all -> 0x00eb }
        throw r10;	 Catch:{ all -> 0x00eb }
    L_0x0182:
        if (r4 == 0) goto L_0x0187;
    L_0x0184:
        r4.disconnect();
    L_0x0187:
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.a.a(java.lang.String, org.json.JSONObject, int):io.branch.referral.network.BranchRemoteInterface$a");
    }

    /* renamed from: a */
    private java.lang.String m23487a(java.io.InputStream r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0011;
    L_0x0002:
        r0 = new java.io.BufferedReader;
        r1 = new java.io.InputStreamReader;
        r1.<init>(r3);
        r0.<init>(r1);
        r3 = r0.readLine();	 Catch:{ IOException -> 0x0011 }
        goto L_0x0012;
    L_0x0011:
        r3 = 0;
    L_0x0012:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.a.a(java.io.InputStream):java.lang.String");
    }
}
