package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;

@zzaer
public final class zzarm implements zzu<zzarg> {
    /* renamed from: a */
    private boolean f16936a;

    /* renamed from: a */
    private static int m21362a(android.content.Context r1, java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        if (r2 == 0) goto L_0x0043;
    L_0x0008:
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ NumberFormatException -> 0x0014 }
        r0 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0014 }
        r1 = com.google.android.gms.internal.ads.zzaoa.m9952a(r1, r0);	 Catch:{ NumberFormatException -> 0x0014 }
        goto L_0x0044;
    L_0x0014:
        r1 = java.lang.String.valueOf(r3);
        r1 = r1.length();
        r1 = r1 + 34;
        r0 = java.lang.String.valueOf(r2);
        r0 = r0.length();
        r1 = r1 + r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r1);
        r1 = "Could not parse ";
        r0.append(r1);
        r0.append(r3);
        r1 = " in a video GMSG: ";
        r0.append(r1);
        r0.append(r2);
        r1 = r0.toString();
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
    L_0x0043:
        r1 = r4;
    L_0x0044:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarm.a(android.content.Context, java.util.Map, java.lang.String, int):int");
    }

    /* renamed from: a */
    private static void m21363a(com.google.android.gms.internal.ads.zzaqr r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = "minBufferMs";
        r3 = r4.get(r3);
        r3 = (java.lang.String) r3;
        r0 = "maxBufferMs";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1 = "bufferForPlaybackMs";
        r1 = r4.get(r1);
        r1 = (java.lang.String) r1;
        r2 = "bufferForPlaybackAfterRebufferMs";
        r4 = r4.get(r2);
        r4 = (java.lang.String) r4;
        if (r3 == 0) goto L_0x0025;
    L_0x0022:
        java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x0025:
        if (r0 == 0) goto L_0x002a;	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x0027:
        java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x002a:
        if (r1 == 0) goto L_0x002f;	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x002c:
        java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x002f:
        if (r4 == 0) goto L_0x0048;	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x0031:
        java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0035 }
        goto L_0x0048;
    L_0x0035:
        r4 = "Could not parse buffer parameters in loadControl video GMSG: (%s, %s)";
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r1[r2] = r3;
        r3 = 1;
        r1[r3] = r0;
        r3 = java.lang.String.format(r4, r1);
        com.google.android.gms.internal.ads.zzaok.m10007e(r3);
        return;
    L_0x0048:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarm.a(com.google.android.gms.internal.ads.zzaqr, java.util.Map):void");
    }

    public final /* synthetic */ void zza(java.lang.Object r12, java.util.Map r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r12 = (com.google.android.gms.internal.ads.zzarg) r12;
        r0 = "action";
        r0 = r13.get(r0);
        r0 = (java.lang.String) r0;
        if (r0 != 0) goto L_0x0012;
    L_0x000c:
        r12 = "Action missing from video GMSG.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x0012:
        r1 = 3;
        r1 = com.google.android.gms.internal.ads.zzaok.m10000a(r1);
        if (r1 == 0) goto L_0x0056;
    L_0x0019:
        r1 = new org.json.JSONObject;
        r1.<init>(r13);
        r2 = "google.afma.Notify_dt";
        r1.remove(r2);
        r1 = r1.toString();
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 13;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Video GMSG: ";
        r3.append(r2);
        r3.append(r0);
        r2 = " ";
        r3.append(r2);
        r3.append(r1);
        r1 = r3.toString();
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);
    L_0x0056:
        r1 = "background";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0080;
    L_0x005e:
        r0 = "color";
        r13 = r13.get(r0);
        r13 = (java.lang.String) r13;
        r0 = android.text.TextUtils.isEmpty(r13);
        if (r0 == 0) goto L_0x0072;
    L_0x006c:
        r12 = "Color parameter missing from color video GMSG.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x0072:
        r13 = android.graphics.Color.parseColor(r13);	 Catch:{ IllegalArgumentException -> 0x007a }
        r12.setBackgroundColor(r13);	 Catch:{ IllegalArgumentException -> 0x007a }
        return;
    L_0x007a:
        r12 = "Invalid color parameter in video GMSG.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x0080:
        r1 = "decoderProps";
        r1 = r1.equals(r0);
        r2 = 0;
        if (r1 == 0) goto L_0x00d1;
    L_0x0089:
        r0 = "mimeTypes";
        r13 = r13.get(r0);
        r13 = (java.lang.String) r13;
        if (r13 != 0) goto L_0x009e;
    L_0x0093:
        r13 = "No MIME types specified for decoder properties inspection.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r13);
        r13 = "missingMimeTypes";
        com.google.android.gms.internal.ads.zzaqr.m21306a(r12, r13);
        return;
    L_0x009e:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 >= r1) goto L_0x00af;
    L_0x00a4:
        r13 = "Video decoder properties available on API versions >= 16.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r13);
        r13 = "deficientApiVersion";
        com.google.android.gms.internal.ads.zzaqr.m21306a(r12, r13);
        return;
    L_0x00af:
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = ",";
        r13 = r13.split(r1);
        r1 = r13.length;
    L_0x00bb:
        if (r2 >= r1) goto L_0x00cd;
    L_0x00bd:
        r3 = r13[r2];
        r4 = r3.trim();
        r4 = com.google.android.gms.internal.ads.zzany.m9942a(r4);
        r0.put(r3, r4);
        r2 = r2 + 1;
        goto L_0x00bb;
    L_0x00cd:
        com.google.android.gms.internal.ads.zzaqr.m21307a(r12, r0);
        return;
    L_0x00d1:
        r1 = r12.mo4731a();
        if (r1 != 0) goto L_0x00dd;
    L_0x00d7:
        r12 = "Could not get underlay container for a video GMSG.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x00dd:
        r3 = "new";
        r3 = r3.equals(r0);
        r4 = "position";
        r4 = r4.equals(r0);
        if (r3 != 0) goto L_0x02b4;
    L_0x00eb:
        if (r4 == 0) goto L_0x00ef;
    L_0x00ed:
        goto L_0x02b4;
    L_0x00ef:
        r3 = r12.mo4198b();
        if (r3 == 0) goto L_0x013b;
    L_0x00f5:
        r4 = "timeupdate";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0130;
    L_0x00fd:
        r4 = "currentTime";
        r4 = r13.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 != 0) goto L_0x010d;
    L_0x0107:
        r12 = "currentTime parameter missing from timeupdate video GMSG.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x010d:
        r5 = java.lang.Float.parseFloat(r4);	 Catch:{ NumberFormatException -> 0x0115 }
        r3.m26358a(r5);	 Catch:{ NumberFormatException -> 0x0115 }
        goto L_0x013b;
    L_0x0115:
        r3 = "Could not parse currentTime parameter from timeupdate video GMSG: ";
        r4 = java.lang.String.valueOf(r4);
        r5 = r4.length();
        if (r5 == 0) goto L_0x0126;
    L_0x0121:
        r3 = r3.concat(r4);
        goto L_0x012c;
    L_0x0126:
        r4 = new java.lang.String;
        r4.<init>(r3);
        r3 = r4;
    L_0x012c:
        com.google.android.gms.internal.ads.zzaok.m10007e(r3);
        goto L_0x013b;
    L_0x0130:
        r4 = "skip";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x013b;
    L_0x0138:
        r3.m26375k();
    L_0x013b:
        r1 = r1.m10059a();
        if (r1 != 0) goto L_0x0145;
    L_0x0141:
        com.google.android.gms.internal.ads.zzaqr.m21305a(r12);
        return;
    L_0x0145:
        r3 = "click";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0171;
    L_0x014d:
        r12 = r12.getContext();
        r0 = "x";
        r0 = m21362a(r12, r13, r0, r2);
        r3 = "y";
        r12 = m21362a(r12, r13, r3, r2);
        r4 = android.os.SystemClock.uptimeMillis();
        r6 = 0;
        r7 = (float) r0;
        r8 = (float) r12;
        r9 = 0;
        r2 = r4;
        r12 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9);
        r1.m21316a(r12);
        r12.recycle();
        return;
    L_0x0171:
        r3 = "currentTime";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b0;
    L_0x0179:
        r12 = "time";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        if (r12 != 0) goto L_0x0189;
    L_0x0183:
        r12 = "Time parameter missing from currentTime video GMSG.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x0189:
        r13 = java.lang.Float.parseFloat(r12);	 Catch:{ NumberFormatException -> 0x0196 }
        r0 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;	 Catch:{ NumberFormatException -> 0x0196 }
        r13 = r13 * r0;	 Catch:{ NumberFormatException -> 0x0196 }
        r13 = (int) r13;	 Catch:{ NumberFormatException -> 0x0196 }
        r1.m21313a(r13);	 Catch:{ NumberFormatException -> 0x0196 }
        return;
    L_0x0196:
        r13 = "Could not parse time parameter from currentTime video GMSG: ";
        r12 = java.lang.String.valueOf(r12);
        r0 = r12.length();
        if (r0 == 0) goto L_0x01a7;
    L_0x01a2:
        r12 = r13.concat(r12);
        goto L_0x01ac;
    L_0x01a7:
        r12 = new java.lang.String;
        r12.<init>(r13);
    L_0x01ac:
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x01b0:
        r3 = "hide";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01bd;
    L_0x01b8:
        r12 = 4;
        r1.setVisibility(r12);
        return;
    L_0x01bd:
        r3 = "load";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01c9;
    L_0x01c5:
        r1.m21326h();
        return;
    L_0x01c9:
        r3 = "loadControl";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01d5;
    L_0x01d1:
        m21363a(r1, r13);
        return;
    L_0x01d5:
        r3 = "muted";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01f3;
    L_0x01dd:
        r12 = "muted";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        r12 = java.lang.Boolean.parseBoolean(r12);
        if (r12 == 0) goto L_0x01ef;
    L_0x01eb:
        r1.m21329k();
        return;
    L_0x01ef:
        r1.m21330l();
        return;
    L_0x01f3:
        r3 = "pause";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01ff;
    L_0x01fb:
        r1.m21327i();
        return;
    L_0x01ff:
        r3 = "play";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x020b;
    L_0x0207:
        r1.m21328j();
        return;
    L_0x020b:
        r3 = "show";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0217;
    L_0x0213:
        r1.setVisibility(r2);
        return;
    L_0x0217:
        r3 = "src";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x022b;
    L_0x021f:
        r12 = "src";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        r1.m21317a(r12);
        return;
    L_0x022b:
        r3 = "touchMove";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0253;
    L_0x0233:
        r0 = r12.getContext();
        r3 = "dx";
        r3 = m21362a(r0, r13, r3, r2);
        r4 = "dy";
        r13 = m21362a(r0, r13, r4, r2);
        r0 = (float) r3;
        r13 = (float) r13;
        r1.m21312a(r0, r13);
        r13 = r11.f16936a;
        if (r13 != 0) goto L_0x0252;
    L_0x024c:
        r12.mo4757f();
        r12 = 1;
        r11.f16936a = r12;
    L_0x0252:
        return;
    L_0x0253:
        r12 = "volume";
        r12 = r12.equals(r0);
        if (r12 == 0) goto L_0x028d;
    L_0x025b:
        r12 = "volume";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        if (r12 != 0) goto L_0x026b;
    L_0x0265:
        r12 = "Level parameter missing from volume video GMSG.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x026b:
        r13 = java.lang.Float.parseFloat(r12);	 Catch:{ NumberFormatException -> 0x0273 }
        r1.setVolume(r13);	 Catch:{ NumberFormatException -> 0x0273 }
        return;
    L_0x0273:
        r13 = "Could not parse volume parameter from volume video GMSG: ";
        r12 = java.lang.String.valueOf(r12);
        r0 = r12.length();
        if (r0 == 0) goto L_0x0284;
    L_0x027f:
        r12 = r13.concat(r12);
        goto L_0x0289;
    L_0x0284:
        r12 = new java.lang.String;
        r12.<init>(r13);
    L_0x0289:
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x028d:
        r12 = "watermark";
        r12 = r12.equals(r0);
        if (r12 == 0) goto L_0x0299;
    L_0x0295:
        r1.m21331m();
        return;
    L_0x0299:
        r12 = "Unknown video action: ";
        r13 = java.lang.String.valueOf(r0);
        r0 = r13.length();
        if (r0 == 0) goto L_0x02aa;
    L_0x02a5:
        r12 = r12.concat(r13);
        goto L_0x02b0;
    L_0x02aa:
        r13 = new java.lang.String;
        r13.<init>(r12);
        r12 = r13;
    L_0x02b0:
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
        return;
    L_0x02b4:
        r0 = r12.getContext();
        r4 = "x";
        r4 = m21362a(r0, r13, r4, r2);
        r5 = "y";
        r5 = m21362a(r0, r13, r5, r2);
        r6 = "w";
        r7 = -1;
        r6 = m21362a(r0, r13, r6, r7);
        r8 = "h";
        r0 = m21362a(r0, r13, r8, r7);
        r7 = r12.mo4764k();
        r7 = r7 - r4;
        r6 = java.lang.Math.min(r6, r7);
        r12 = r12.mo4763j();
        r12 = r12 - r5;
        r7 = java.lang.Math.min(r0, r12);
        r12 = "player";	 Catch:{ NumberFormatException -> 0x02f1 }
        r12 = r13.get(r12);	 Catch:{ NumberFormatException -> 0x02f1 }
        r12 = (java.lang.String) r12;	 Catch:{ NumberFormatException -> 0x02f1 }
        r12 = java.lang.Integer.parseInt(r12);	 Catch:{ NumberFormatException -> 0x02f1 }
        r8 = r12;
        goto L_0x02f2;
    L_0x02f1:
        r8 = 0;
    L_0x02f2:
        r12 = "spherical";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        r9 = java.lang.Boolean.parseBoolean(r12);
        if (r3 == 0) goto L_0x0321;
    L_0x0300:
        r12 = r1.m10059a();
        if (r12 != 0) goto L_0x0321;
    L_0x0306:
        r10 = new com.google.android.gms.internal.ads.zzarf;
        r12 = "flags";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        r10.<init>(r12);
        r3 = r1;
        r3.m10061a(r4, r5, r6, r7, r8, r9, r10);
        r12 = r1.m10059a();
        if (r12 == 0) goto L_0x0320;
    L_0x031d:
        m21363a(r12, r13);
    L_0x0320:
        return;
    L_0x0321:
        r1.m10060a(r4, r5, r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarm.zza(java.lang.Object, java.util.Map):void");
    }
}
