package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class zzam implements zzb {
    /* renamed from: a */
    private final Map<String, du> f16872a;
    /* renamed from: b */
    private long f16873b;
    /* renamed from: c */
    private final File f16874c;
    /* renamed from: d */
    private final int f16875d;

    public zzam(File file, int i) {
        this.f16872a = new LinkedHashMap(16, 0.75f, true);
        this.f16873b = 0;
        this.f16874c = file;
        this.f16875d = i;
    }

    public zzam(File file) {
        this(file, 5242880);
    }

    /* renamed from: a */
    public final synchronized zzc mo2366a(String str) {
        du duVar = (du) this.f16872a.get(str);
        if (duVar == null) {
            return null;
        }
        File d = m21277d(str);
        eg egVar;
        try {
            egVar = new eg(new BufferedInputStream(m21265a(d)), d.length());
            if (TextUtils.equals(str, du.m8918a(egVar).f8012b)) {
                byte[] a = m21271a(egVar, egVar.m8920a());
                zzc zzc = new zzc();
                zzc.f9326a = a;
                zzc.f9327b = duVar.f8013c;
                zzc.f9328c = duVar.f8014d;
                zzc.f9329d = duVar.f8015e;
                zzc.f9330e = duVar.f8016f;
                zzc.f9331f = duVar.f8017g;
                List<zzl> list = duVar.f8018h;
                Map treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzl zzl : list) {
                    treeMap.put(zzl.m10728a(), zzl.m10729b());
                }
                zzc.f9332g = treeMap;
                zzc.f9333h = Collections.unmodifiableList(duVar.f8018h);
                egVar.close();
                return zzc;
            }
            zzaf.m9510b("%s: key=%s, found=%s", d.getAbsolutePath(), str, du.m8918a(egVar).f8012b);
            m21278e(str);
            egVar.close();
            return null;
        } catch (IOException e) {
            zzaf.m9510b("%s: %s", d.getAbsolutePath(), e.toString());
            m21274b(str);
            return null;
        } catch (Throwable th) {
            egVar.close();
        }
    }

    /* renamed from: a */
    public final synchronized void mo2367a() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.f16874c;	 Catch:{ all -> 0x0061 }
        r0 = r0.exists();	 Catch:{ all -> 0x0061 }
        r1 = 0;	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x0061 }
    L_0x000a:
        r0 = r9.f16874c;	 Catch:{ all -> 0x0061 }
        r0 = r0.mkdirs();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0022;	 Catch:{ all -> 0x0061 }
    L_0x0012:
        r0 = "Unable to create cache dir %s";	 Catch:{ all -> 0x0061 }
        r2 = 1;	 Catch:{ all -> 0x0061 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0061 }
        r3 = r9.f16874c;	 Catch:{ all -> 0x0061 }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x0061 }
        r2[r1] = r3;	 Catch:{ all -> 0x0061 }
        com.google.android.gms.internal.ads.zzaf.m9511c(r0, r2);	 Catch:{ all -> 0x0061 }
    L_0x0022:
        monitor-exit(r9);
        return;
    L_0x0024:
        r0 = r9.f16874c;	 Catch:{ all -> 0x0061 }
        r0 = r0.listFiles();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        monitor-exit(r9);
        return;
    L_0x002e:
        r2 = r0.length;	 Catch:{ all -> 0x0061 }
    L_0x002f:
        if (r1 >= r2) goto L_0x005f;	 Catch:{ all -> 0x0061 }
    L_0x0031:
        r3 = r0[r1];	 Catch:{ all -> 0x0061 }
        r4 = r3.length();	 Catch:{ IOException -> 0x0059 }
        r6 = new com.google.android.gms.internal.ads.eg;	 Catch:{ IOException -> 0x0059 }
        r7 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0059 }
        r8 = m21265a(r3);	 Catch:{ IOException -> 0x0059 }
        r7.<init>(r8);	 Catch:{ IOException -> 0x0059 }
        r6.<init>(r7, r4);	 Catch:{ IOException -> 0x0059 }
        r7 = com.google.android.gms.internal.ads.du.m8918a(r6);	 Catch:{ all -> 0x0054 }
        r7.f8011a = r4;	 Catch:{ all -> 0x0054 }
        r4 = r7.f8012b;	 Catch:{ all -> 0x0054 }
        r9.m21270a(r4, r7);	 Catch:{ all -> 0x0054 }
        r6.close();	 Catch:{ IOException -> 0x0059 }
        goto L_0x005c;	 Catch:{ IOException -> 0x0059 }
    L_0x0054:
        r4 = move-exception;	 Catch:{ IOException -> 0x0059 }
        r6.close();	 Catch:{ IOException -> 0x0059 }
        throw r4;	 Catch:{ IOException -> 0x0059 }
    L_0x0059:
        r3.delete();	 Catch:{ all -> 0x0061 }
    L_0x005c:
        r1 = r1 + 1;
        goto L_0x002f;
    L_0x005f:
        monitor-exit(r9);
        return;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzam.a():void");
    }

    /* renamed from: a */
    public final synchronized void mo2368a(java.lang.String r20, com.google.android.gms.internal.ads.zzc r21) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r19 = this;
        r1 = r19;
        r0 = r20;
        r2 = r21;
        monitor-enter(r19);
        r3 = r2.f9326a;	 Catch:{ all -> 0x0116 }
        r3 = r3.length;	 Catch:{ all -> 0x0116 }
        r4 = r1.f16873b;	 Catch:{ all -> 0x0116 }
        r6 = (long) r3;	 Catch:{ all -> 0x0116 }
        r4 = r4 + r6;	 Catch:{ all -> 0x0116 }
        r3 = r1.f16875d;	 Catch:{ all -> 0x0116 }
        r8 = (long) r3;	 Catch:{ all -> 0x0116 }
        r10 = 0;	 Catch:{ all -> 0x0116 }
        r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));	 Catch:{ all -> 0x0116 }
        if (r11 < 0) goto L_0x00c1;	 Catch:{ all -> 0x0116 }
    L_0x0016:
        r4 = com.google.android.gms.internal.ads.zzaf.f8537a;	 Catch:{ all -> 0x0116 }
        if (r4 == 0) goto L_0x0021;	 Catch:{ all -> 0x0116 }
    L_0x001a:
        r4 = "Pruning old cache entries.";	 Catch:{ all -> 0x0116 }
        r5 = new java.lang.Object[r10];	 Catch:{ all -> 0x0116 }
        com.google.android.gms.internal.ads.zzaf.m9508a(r4, r5);	 Catch:{ all -> 0x0116 }
    L_0x0021:
        r4 = r1.f16873b;	 Catch:{ all -> 0x0116 }
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0116 }
        r11 = r1.f16872a;	 Catch:{ all -> 0x0116 }
        r11 = r11.entrySet();	 Catch:{ all -> 0x0116 }
        r11 = r11.iterator();	 Catch:{ all -> 0x0116 }
        r12 = 0;	 Catch:{ all -> 0x0116 }
    L_0x0032:
        r13 = r11.hasNext();	 Catch:{ all -> 0x0116 }
        r14 = 2;	 Catch:{ all -> 0x0116 }
        if (r13 == 0) goto L_0x0094;	 Catch:{ all -> 0x0116 }
    L_0x0039:
        r13 = r11.next();	 Catch:{ all -> 0x0116 }
        r13 = (java.util.Map.Entry) r13;	 Catch:{ all -> 0x0116 }
        r13 = r13.getValue();	 Catch:{ all -> 0x0116 }
        r13 = (com.google.android.gms.internal.ads.du) r13;	 Catch:{ all -> 0x0116 }
        r15 = r13.f8012b;	 Catch:{ all -> 0x0116 }
        r15 = r1.m21277d(r15);	 Catch:{ all -> 0x0116 }
        r15 = r15.delete();	 Catch:{ all -> 0x0116 }
        if (r15 == 0) goto L_0x005e;	 Catch:{ all -> 0x0116 }
    L_0x0051:
        r16 = r4;	 Catch:{ all -> 0x0116 }
        r3 = r1.f16873b;	 Catch:{ all -> 0x0116 }
        r18 = r11;	 Catch:{ all -> 0x0116 }
        r10 = r13.f8011a;	 Catch:{ all -> 0x0116 }
        r5 = 0;	 Catch:{ all -> 0x0116 }
        r3 = r3 - r10;	 Catch:{ all -> 0x0116 }
        r1.f16873b = r3;	 Catch:{ all -> 0x0116 }
        goto L_0x0077;	 Catch:{ all -> 0x0116 }
    L_0x005e:
        r16 = r4;	 Catch:{ all -> 0x0116 }
        r18 = r11;	 Catch:{ all -> 0x0116 }
        r3 = "Could not delete cache entry for key=%s, filename=%s";	 Catch:{ all -> 0x0116 }
        r4 = new java.lang.Object[r14];	 Catch:{ all -> 0x0116 }
        r5 = r13.f8012b;	 Catch:{ all -> 0x0116 }
        r10 = 0;	 Catch:{ all -> 0x0116 }
        r4[r10] = r5;	 Catch:{ all -> 0x0116 }
        r5 = r13.f8012b;	 Catch:{ all -> 0x0116 }
        r5 = m21276c(r5);	 Catch:{ all -> 0x0116 }
        r10 = 1;	 Catch:{ all -> 0x0116 }
        r4[r10] = r5;	 Catch:{ all -> 0x0116 }
        com.google.android.gms.internal.ads.zzaf.m9510b(r3, r4);	 Catch:{ all -> 0x0116 }
    L_0x0077:
        r18.remove();	 Catch:{ all -> 0x0116 }
        r12 = r12 + 1;	 Catch:{ all -> 0x0116 }
        r3 = r1.f16873b;	 Catch:{ all -> 0x0116 }
        r5 = 0;	 Catch:{ all -> 0x0116 }
        r3 = r3 + r6;	 Catch:{ all -> 0x0116 }
        r3 = (float) r3;	 Catch:{ all -> 0x0116 }
        r4 = r1.f16875d;	 Catch:{ all -> 0x0116 }
        r4 = (float) r4;	 Catch:{ all -> 0x0116 }
        r5 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;	 Catch:{ all -> 0x0116 }
        r4 = r4 * r5;	 Catch:{ all -> 0x0116 }
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));	 Catch:{ all -> 0x0116 }
        if (r3 >= 0) goto L_0x008e;	 Catch:{ all -> 0x0116 }
    L_0x008d:
        goto L_0x0096;	 Catch:{ all -> 0x0116 }
    L_0x008e:
        r4 = r16;	 Catch:{ all -> 0x0116 }
        r11 = r18;	 Catch:{ all -> 0x0116 }
        r10 = 0;	 Catch:{ all -> 0x0116 }
        goto L_0x0032;	 Catch:{ all -> 0x0116 }
    L_0x0094:
        r16 = r4;	 Catch:{ all -> 0x0116 }
    L_0x0096:
        r3 = com.google.android.gms.internal.ads.zzaf.f8537a;	 Catch:{ all -> 0x0116 }
        if (r3 == 0) goto L_0x00c1;	 Catch:{ all -> 0x0116 }
    L_0x009a:
        r3 = "pruned %d files, %d bytes, %d ms";	 Catch:{ all -> 0x0116 }
        r4 = 3;	 Catch:{ all -> 0x0116 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0116 }
        r5 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x0116 }
        r6 = 0;	 Catch:{ all -> 0x0116 }
        r4[r6] = r5;	 Catch:{ all -> 0x0116 }
        r5 = r1.f16873b;	 Catch:{ all -> 0x0116 }
        r7 = 0;	 Catch:{ all -> 0x0116 }
        r5 = r5 - r16;	 Catch:{ all -> 0x0116 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x0116 }
        r6 = 1;	 Catch:{ all -> 0x0116 }
        r4[r6] = r5;	 Catch:{ all -> 0x0116 }
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0116 }
        r7 = 0;	 Catch:{ all -> 0x0116 }
        r5 = r5 - r8;	 Catch:{ all -> 0x0116 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x0116 }
        r4[r14] = r5;	 Catch:{ all -> 0x0116 }
        com.google.android.gms.internal.ads.zzaf.m9508a(r3, r4);	 Catch:{ all -> 0x0116 }
    L_0x00c1:
        r3 = r19.m21277d(r20);	 Catch:{ all -> 0x0116 }
        r4 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x00ff }
        r5 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00ff }
        r5.<init>(r3);	 Catch:{ IOException -> 0x00ff }
        r4.<init>(r5);	 Catch:{ IOException -> 0x00ff }
        r5 = new com.google.android.gms.internal.ads.du;	 Catch:{ IOException -> 0x00ff }
        r5.<init>(r0, r2);	 Catch:{ IOException -> 0x00ff }
        r6 = r5.m8919a(r4);	 Catch:{ IOException -> 0x00ff }
        if (r6 == 0) goto L_0x00e7;	 Catch:{ IOException -> 0x00ff }
    L_0x00da:
        r2 = r2.f9326a;	 Catch:{ IOException -> 0x00ff }
        r4.write(r2);	 Catch:{ IOException -> 0x00ff }
        r4.close();	 Catch:{ IOException -> 0x00ff }
        r1.m21270a(r0, r5);	 Catch:{ IOException -> 0x00ff }
        monitor-exit(r19);
        return;
    L_0x00e7:
        r4.close();	 Catch:{ IOException -> 0x00ff }
        r0 = "Failed to write header for %s";	 Catch:{ IOException -> 0x00ff }
        r2 = 1;	 Catch:{ IOException -> 0x00ff }
        r4 = new java.lang.Object[r2];	 Catch:{ IOException -> 0x00ff }
        r2 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x00ff }
        r5 = 0;	 Catch:{ IOException -> 0x00ff }
        r4[r5] = r2;	 Catch:{ IOException -> 0x00ff }
        com.google.android.gms.internal.ads.zzaf.m9510b(r0, r4);	 Catch:{ IOException -> 0x00ff }
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x00ff }
        r0.<init>();	 Catch:{ IOException -> 0x00ff }
        throw r0;	 Catch:{ IOException -> 0x00ff }
    L_0x00ff:
        r0 = r3.delete();	 Catch:{ all -> 0x0116 }
        if (r0 != 0) goto L_0x0114;	 Catch:{ all -> 0x0116 }
    L_0x0105:
        r0 = "Could not clean up file %s";	 Catch:{ all -> 0x0116 }
        r2 = 1;	 Catch:{ all -> 0x0116 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0116 }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x0116 }
        r4 = 0;	 Catch:{ all -> 0x0116 }
        r2[r4] = r3;	 Catch:{ all -> 0x0116 }
        com.google.android.gms.internal.ads.zzaf.m9510b(r0, r2);	 Catch:{ all -> 0x0116 }
    L_0x0114:
        monitor-exit(r19);
        return;
    L_0x0116:
        r0 = move-exception;
        monitor-exit(r19);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzam.a(java.lang.String, com.google.android.gms.internal.ads.zzc):void");
    }

    /* renamed from: b */
    private final synchronized void m21274b(String str) {
        boolean delete = m21277d(str).delete();
        m21278e(str);
        if (!delete) {
            zzaf.m9510b("Could not delete cache entry for key=%s, filename=%s", str, m21276c(str));
        }
    }

    /* renamed from: c */
    private static String m21276c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        str = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    /* renamed from: d */
    private final File m21277d(String str) {
        return new File(this.f16874c, m21276c(str));
    }

    /* renamed from: a */
    private final void m21270a(String str, du duVar) {
        if (this.f16872a.containsKey(str)) {
            this.f16873b += duVar.f8011a - ((du) this.f16872a.get(str)).f8011a;
        } else {
            this.f16873b += duVar.f8011a;
        }
        this.f16872a.put(str, duVar);
    }

    /* renamed from: e */
    private final void m21278e(String str) {
        du duVar = (du) this.f16872a.remove(str);
        if (duVar != null) {
            this.f16873b -= duVar.f8011a;
        }
    }

    /* renamed from: a */
    private static byte[] m21271a(eg egVar, long j) {
        long a = egVar.m8920a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                j = new byte[i];
                new DataInputStream(egVar).readFully(j);
                return j;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(73);
        stringBuilder.append("streamToBytes length=");
        stringBuilder.append(j);
        stringBuilder.append(", maxLength=");
        stringBuilder.append(a);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: a */
    private static InputStream m21265a(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: c */
    private static int m21275c(InputStream inputStream) {
        inputStream = inputStream.read();
        if (inputStream != -1) {
            return inputStream;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m21267a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* renamed from: a */
    static int m21264a(InputStream inputStream) {
        return (m21275c(inputStream) << 24) | (((m21275c(inputStream) | 0) | (m21275c(inputStream) << 8)) | (m21275c(inputStream) << 16));
    }

    /* renamed from: a */
    static void m21268a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: b */
    static long m21272b(InputStream inputStream) {
        return ((((((((((long) m21275c(inputStream)) & 255) | 0) | ((((long) m21275c(inputStream)) & 255) << 8)) | ((((long) m21275c(inputStream)) & 255) << 16)) | ((((long) m21275c(inputStream)) & 255) << 24)) | ((((long) m21275c(inputStream)) & 255) << 32)) | ((((long) m21275c(inputStream)) & 255) << 40)) | ((((long) m21275c(inputStream)) & 255) << 48)) | ((255 & ((long) m21275c(inputStream))) << 56);
    }

    /* renamed from: a */
    static void m21269a(OutputStream outputStream, String str) {
        str = str.getBytes("UTF-8");
        m21268a(outputStream, (long) str.length);
        outputStream.write(str, 0, str.length);
    }

    /* renamed from: a */
    static String m21266a(eg egVar) {
        return new String(m21271a(egVar, m21272b((InputStream) egVar)), "UTF-8");
    }

    /* renamed from: b */
    static List<zzl> m21273b(eg egVar) {
        int a = m21264a((InputStream) egVar);
        if (a >= 0) {
            List<zzl> emptyList = a == 0 ? Collections.emptyList() : new ArrayList();
            for (int i = 0; i < a; i++) {
                emptyList.add(new zzl(m21266a(egVar).intern(), m21266a(egVar).intern()));
            }
            return emptyList;
        }
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("readHeaderList size=");
        stringBuilder.append(a);
        throw new IOException(stringBuilder.toString());
    }
}
