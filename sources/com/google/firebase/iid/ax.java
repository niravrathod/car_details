package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.content.C0389b;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.firebase_messaging.zzc;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

final class ax {
    ax() {
    }

    /* renamed from: a */
    final ay m12720a(Context context, String str) {
        ay c = m12717c(context, str);
        if (c != null) {
            return c;
        }
        return m12721b(context, str);
    }

    /* renamed from: b */
    final ay m12721b(Context context, String str) {
        ay ayVar = new ay(C2589c.m12734a(), System.currentTimeMillis());
        ay a = m12705a(context, str, ayVar, true);
        if (a == null || a.equals(ayVar)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            m12711a(context, str, ayVar);
            return ayVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3) != null) {
            Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
        }
        return a;
    }

    /* renamed from: a */
    static void m12710a(Context context) {
        for (File file : m12716b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    private final ay m12717c(Context context, String str) {
        zzaa zzaa;
        try {
            ay d = m12718d(context, str);
            if (d != null) {
                m12711a(context, str, d);
                return d;
            }
            zzaa = null;
            try {
                ay a = m12706a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m12705a(context, str, a, false);
                    return a;
                }
            } catch (Context context2) {
                zzaa = context2;
            }
            if (zzaa == null) {
                return null;
            }
            throw zzaa;
        } catch (zzaa e) {
            zzaa = e;
        }
    }

    /* renamed from: a */
    private static KeyPair m12709a(String str, String str2) {
        try {
            str = Base64.decode(str, 8);
            str2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(str)), instance.generatePrivate(new PKCS8EncodedKeySpec(str2)));
            } catch (Exception e) {
                str2 = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 19);
                stringBuilder.append("Invalid key stored ");
                stringBuilder.append(str2);
                Log.w("FirebaseInstanceId", stringBuilder.toString());
                throw new zzaa(e);
            }
        } catch (Exception e2) {
            throw new zzaa(e2);
        }
    }

    /* renamed from: d */
    private final ay m12718d(Context context, String str) {
        File e = m12719e(context, str);
        if (e.exists() == null) {
            return null;
        }
        try {
            return m12707a(e);
        } catch (String str2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                str2 = String.valueOf(str2);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 40);
                stringBuilder.append("Failed to read key from file, retrying: ");
                stringBuilder.append(str2);
                Log.d("FirebaseInstanceId", stringBuilder.toString());
            }
            try {
                return m12707a(e);
            } catch (Exception e2) {
                str2 = String.valueOf(e2);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str2).length() + 45);
                stringBuilder2.append("IID file exists, but failed to read from it: ");
                stringBuilder2.append(str2);
                Log.w("FirebaseInstanceId", stringBuilder2.toString());
                throw new zzaa(e2);
            }
        }
    }

    /* renamed from: a */
    private final ay m12705a(Context context, String str, ay ayVar, boolean z) {
        ay ayVar2;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to properties file");
        }
        Properties properties = new Properties();
        properties.setProperty("pub", ayVar.m12723b());
        properties.setProperty("pri", ayVar.m12726c());
        properties.setProperty("cre", String.valueOf(ayVar.f11020b));
        context = m12719e(context, str);
        try {
            context.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(context, "rw");
            Throwable th;
            try {
                Throwable th2;
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z && channel.size() > 0) {
                        try {
                            channel.position(0);
                            z = m12708a(channel);
                            if (channel != null) {
                                m12714a(null, channel);
                            }
                            m12713a(null, randomAccessFile);
                            return z;
                        } catch (boolean z2) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                z2 = String.valueOf(z2);
                                StringBuilder stringBuilder = new StringBuilder(String.valueOf(z2).length() + 64);
                                stringBuilder.append("Tried reading key pair before writing new one, but failed with: ");
                                stringBuilder.append(z2);
                                Log.d("FirebaseInstanceId", stringBuilder.toString());
                            }
                        }
                    }
                    channel.position(0);
                    properties.store(Channels.newOutputStream(channel), null);
                    if (channel != null) {
                        m12714a(null, channel);
                    }
                    m12713a(null, randomAccessFile);
                    return ayVar;
                } catch (boolean z22) {
                    ayVar2 = z22;
                    th2 = ayVar;
                    ayVar = ayVar2;
                }
                m12713a(th, randomAccessFile);
                throw context;
                if (channel != null) {
                    m12714a(th2, channel);
                }
                throw ayVar;
            } catch (ay ayVar3) {
                ayVar2 = ayVar3;
                th = context;
                context = ayVar2;
            }
        } catch (Context context2) {
            context2 = String.valueOf(context2);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(context2).length() + 21);
            stringBuilder2.append("Failed to write key: ");
            stringBuilder2.append(context2);
            Log.w("FirebaseInstanceId", stringBuilder2.toString());
            return null;
        }
    }

    /* renamed from: b */
    private static File m12716b(Context context) {
        File b = C0389b.m1437b(context);
        if (b != null && b.isDirectory()) {
            return b;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: e */
    private static File m12719e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "com.google.InstanceId.properties";
        } else {
            try {
                str = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 33);
                stringBuilder.append("com.google.InstanceId_");
                stringBuilder.append(str);
                stringBuilder.append(".properties");
                str = stringBuilder.toString();
            } catch (Context context2) {
                throw new AssertionError(context2);
            }
        }
        return new File(m12716b(context2), str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final com.google.firebase.iid.ay m12707a(java.io.File r10) {
        /*
        r9 = this;
        r0 = new java.io.FileInputStream;
        r0.<init>(r10);
        r10 = 0;
        r7 = r0.getChannel();	 Catch:{ Throwable -> 0x0034 }
        r2 = 0;
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r6 = 1;
        r1 = r7;
        r1.lock(r2, r4, r6);	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
        r1 = m12708a(r7);	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
        if (r7 == 0) goto L_0x001f;
    L_0x001c:
        m12714a(r10, r7);	 Catch:{ Throwable -> 0x0034 }
    L_0x001f:
        m12712a(r10, r0);
        return r1;
    L_0x0023:
        r1 = move-exception;
        r2 = r10;
        goto L_0x002c;
    L_0x0026:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0028 }
    L_0x0028:
        r2 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x002c:
        if (r7 == 0) goto L_0x0031;
    L_0x002e:
        m12714a(r2, r7);	 Catch:{ Throwable -> 0x0034 }
    L_0x0031:
        throw r1;	 Catch:{ Throwable -> 0x0034 }
    L_0x0032:
        r1 = move-exception;
        goto L_0x0036;
    L_0x0034:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x0032 }
    L_0x0036:
        m12712a(r10, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.ax.a(java.io.File):com.google.firebase.iid.ay");
    }

    /* renamed from: a */
    private static ay m12708a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new zzaa("Invalid properties file");
        }
        try {
            return new ay(m12709a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (Exception e) {
            throw new zzaa(e);
        }
    }

    /* renamed from: a */
    private static ay m12706a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C2604x.m12781a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C2604x.m12781a(str, "|K|"), null);
        if (string != null) {
            if (string2 != null) {
                return new ay(m12709a(string, string2), m12715b(sharedPreferences, str));
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m12711a(android.content.Context r3, java.lang.String r4, com.google.firebase.iid.ay r5) {
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
        r2 = this;
        r0 = "com.google.android.gms.appid";
        r1 = 0;
        r3 = r3.getSharedPreferences(r0, r1);
        r0 = m12706a(r3, r4);	 Catch:{ zzaa -> 0x0012 }
        r0 = r5.equals(r0);	 Catch:{ zzaa -> 0x0012 }
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        r0 = "FirebaseInstanceId";
        r1 = 3;
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x0022;
    L_0x001b:
        r0 = "FirebaseInstanceId";
        r1 = "Writing key to shared preferences";
        android.util.Log.d(r0, r1);
    L_0x0022:
        r3 = r3.edit();
        r0 = "|P|";
        r0 = com.google.firebase.iid.C2604x.m12781a(r4, r0);
        r1 = r5.m12723b();
        r3.putString(r0, r1);
        r0 = "|K|";
        r0 = com.google.firebase.iid.C2604x.m12781a(r4, r0);
        r1 = r5.m12726c();
        r3.putString(r0, r1);
        r0 = "cre";
        r4 = com.google.firebase.iid.C2604x.m12781a(r4, r0);
        r0 = r5.f11020b;
        r5 = java.lang.String.valueOf(r0);
        r3.putString(r4, r5);
        r3.commit();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.ax.a(android.content.Context, java.lang.String, com.google.firebase.iid.ay):void");
    }

    /* renamed from: b */
    private static long m12715b(android.content.SharedPreferences r1, java.lang.String r2) {
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
        r0 = "cre";
        r2 = com.google.firebase.iid.C2604x.m12781a(r2, r0);
        r0 = 0;
        r1 = r1.getString(r2, r0);
        if (r1 == 0) goto L_0x0012;
    L_0x000d:
        r1 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x0012 }
        return r1;
    L_0x0012:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.ax.b(android.content.SharedPreferences, java.lang.String):long");
    }

    /* renamed from: a */
    private static /* synthetic */ void m12714a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
                return;
            } catch (FileChannel fileChannel2) {
                zzc.m11491a(th, fileChannel2);
                return;
            }
        }
        fileChannel2.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m12713a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
                return;
            } catch (RandomAccessFile randomAccessFile2) {
                zzc.m11491a(th, randomAccessFile2);
                return;
            }
        }
        randomAccessFile2.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m12712a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
                return;
            } catch (FileInputStream fileInputStream2) {
                zzc.m11491a(th, fileInputStream2);
                return;
            }
        }
        fileInputStream2.close();
    }
}
