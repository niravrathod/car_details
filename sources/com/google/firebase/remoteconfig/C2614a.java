package com.google.firebase.remoteconfig;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.config.zzal;
import com.google.android.gms.internal.config.zzam;
import com.google.android.gms.internal.config.zzan;
import com.google.android.gms.internal.config.zzao;
import com.google.android.gms.internal.config.zzap;
import com.google.android.gms.internal.config.zzaq;
import com.google.android.gms.internal.config.zzar;
import com.google.android.gms.internal.config.zzas;
import com.google.android.gms.internal.config.zzat;
import com.google.android.gms.internal.config.zzau;
import com.google.android.gms.internal.config.zzav;
import com.google.android.gms.internal.config.zzaw;
import com.google.android.gms.internal.config.zzax;
import com.google.android.gms.internal.config.zzay;
import com.google.android.gms.internal.config.zzbh;
import com.google.android.gms.internal.config.zze;
import com.google.android.gms.internal.config.zzj;
import com.google.android.gms.internal.config.zzv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.C2572b;
import com.google.firebase.p136a.C2559a;
import com.google.firebase.remoteconfig.C2617c.C2616a;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.remoteconfig.a */
public class C2614a {
    /* renamed from: a */
    public static final byte[] f11087a = new byte[0];
    @GuardedBy("FirebaseRemoteConfig.class")
    /* renamed from: b */
    private static C2614a f11088b;
    /* renamed from: c */
    private zzao f11089c;
    /* renamed from: d */
    private zzao f11090d;
    /* renamed from: e */
    private zzao f11091e;
    /* renamed from: f */
    private zzar f11092f;
    /* renamed from: g */
    private final Context f11093g;
    /* renamed from: h */
    private final C2572b f11094h;
    /* renamed from: i */
    private final ReadWriteLock f11095i = new ReentrantReadWriteLock(true);
    /* renamed from: j */
    private final C2559a f11096j;

    private C2614a(Context context, zzao zzao, zzao zzao2, zzao zzao3, zzar zzar) {
        this.f11093g = context;
        if (zzar == null) {
            zzar = new zzar();
        }
        this.f11092f = zzar;
        this.f11092f.m11355a(m12832b(this.f11093g));
        this.f11089c = zzao;
        this.f11090d = zzao2;
        this.f11091e = zzao3;
        this.f11094h = C2572b.m12600b(this.f11093g);
        this.f11096j = C2614a.m12834d(this.f11093g);
    }

    /* renamed from: a */
    private static zzao m12825a(zzas zzas) {
        if (zzas == null) {
            return null;
        }
        Map hashMap = new HashMap();
        for (zzav zzav : zzas.f20457a) {
            String str = zzav.f20467a;
            Map hashMap2 = new HashMap();
            for (zzat zzat : zzav.f20468b) {
                hashMap2.put(zzat.f20461a, zzat.f20462b);
            }
            hashMap.put(str, hashMap2);
        }
        byte[][] bArr = zzas.f20459c;
        List arrayList = new ArrayList();
        for (Object add : bArr) {
            arrayList.add(add);
        }
        return new zzao(hashMap, zzas.f20458b, arrayList);
    }

    /* renamed from: a */
    private final Task<Void> m12826a(long j, zzv zzv) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11095i.readLock().lock();
        try {
            zzj zzj = new zzj();
            zzj.m11443a(j);
            if (this.f11094h != null) {
                zzj.m11444a(this.f11094h.m12610c().m12615a());
            }
            if (this.f11092f.m11360b()) {
                zzj.m11445a("_rcn_developer", "true");
            }
            zzj.m11442a(10300);
            zzao zzao = this.f11090d;
            int i = BaseClientBuilder.API_PRIORITY_OTHER;
            if (!(zzao == null || this.f11090d.m11352d() == -1)) {
                long convert = TimeUnit.SECONDS.convert(System.currentTimeMillis() - this.f11090d.m11352d(), TimeUnit.MILLISECONDS);
                zzj.m11447c(convert < 2147483647L ? (int) convert : BaseClientBuilder.API_PRIORITY_OTHER);
            }
            if (!(this.f11089c == null || this.f11089c.m11352d() == -1)) {
                long convert2 = TimeUnit.SECONDS.convert(System.currentTimeMillis() - this.f11089c.m11352d(), TimeUnit.MILLISECONDS);
                if (convert2 < 2147483647L) {
                    i = (int) convert2;
                }
                zzj.m11446b(i);
            }
            zze.f9974b.mo2915a(zzv.asGoogleApiClient(), zzj.m11441a()).setResultCallback(new C4202d(this, taskCompletionSource));
            return taskCompletionSource.m12417a();
        } finally {
            this.f11095i.readLock().unlock();
        }
    }

    /* renamed from: a */
    public static C2614a m12827a() {
        return C2614a.m12828a(C2572b.m12602d().m12607a());
    }

    /* renamed from: a */
    private static C2614a m12828a(Context context) {
        synchronized (C2614a.class) {
            if (f11088b == null) {
                zzao zzao;
                zzao zzao2;
                zzar zzar;
                zzaw c = C2614a.m12833c(context);
                zzao zzao3 = null;
                if (c == null) {
                    if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                        Log.d("FirebaseRemoteConfig", "No persisted config was found. Initializing from scratch.");
                    }
                    zzao = null;
                    zzao2 = zzao;
                    zzar = zzao2;
                } else {
                    zzar zzar2;
                    if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                        Log.d("FirebaseRemoteConfig", "Initializing from persisted config.");
                    }
                    zzao a = C2614a.m12825a(c.f20469a);
                    zzao = C2614a.m12825a(c.f20470b);
                    zzao2 = C2614a.m12825a(c.f20471c);
                    zzau zzau = c.f20472d;
                    if (zzau != null) {
                        zzar2 = new zzar();
                        zzar2.m11354a(zzau.f20463a);
                        zzar2.m11359a(zzau.f20464b);
                    }
                    if (zzar2 != null) {
                        zzax[] zzaxArr = c.f20473e;
                        Map hashMap = new HashMap();
                        if (zzaxArr != null) {
                            for (zzax zzax : zzaxArr) {
                                hashMap.put(zzax.f20477c, new zzal(zzax.f20475a, zzax.f20476b));
                            }
                        }
                        zzar2.m11358a(hashMap);
                    }
                    zzar = zzar2;
                    zzao3 = a;
                }
                f11088b = new C2614a(context, zzao3, zzao, zzao2, zzar);
            }
        }
        return f11088b;
    }

    /* renamed from: a */
    private final void m12829a(TaskCompletionSource<Void> taskCompletionSource, Status status) {
        if (status == null) {
            Log.w("FirebaseRemoteConfig", "Received null IPC status for failure.");
        } else {
            int statusCode = status.getStatusCode();
            String statusMessage = status.getStatusMessage();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(statusMessage).length() + 25);
            stringBuilder.append("IPC failure: ");
            stringBuilder.append(statusCode);
            stringBuilder.append(":");
            stringBuilder.append(statusMessage);
            Log.w("FirebaseRemoteConfig", stringBuilder.toString());
        }
        this.f11095i.writeLock().lock();
        try {
            this.f11092f.m11354a(1);
            taskCompletionSource.m12418a(new FirebaseRemoteConfigFetchException());
            m12835d();
        } finally {
            this.f11095i.writeLock().unlock();
        }
    }

    /* renamed from: a */
    private static void m12830a(Runnable runnable) {
        AsyncTask.SERIAL_EXECUTOR.execute(runnable);
    }

    /* renamed from: a */
    private final void m12831a(Map<String, Object> map, String str, boolean z) {
        if (str != null) {
            Object obj;
            Map hashMap;
            Object obj2;
            String str2;
            byte[] bArr;
            zzao zzao;
            long currentTimeMillis;
            if (map != null) {
                if (!map.isEmpty()) {
                    obj = null;
                    hashMap = new HashMap();
                    if (obj == null) {
                        for (String str3 : map.keySet()) {
                            obj2 = map.get(str3);
                            if (obj2 instanceof String) {
                                str2 = (String) obj2;
                            } else if (obj2 instanceof Long) {
                                str2 = ((Long) obj2).toString();
                            } else if (obj2 instanceof Integer) {
                                str2 = ((Integer) obj2).toString();
                            } else if (obj2 instanceof Double) {
                                str2 = ((Double) obj2).toString();
                            } else if (obj2 instanceof Float) {
                                str2 = ((Float) obj2).toString();
                            } else if (obj2 instanceof byte[]) {
                                bArr = (byte[]) obj2;
                                hashMap.put(str3, obj2);
                            } else if (obj2 instanceof Boolean) {
                                throw new IllegalArgumentException("The type of a default value needs to beone of String, Long, Double, Boolean, or byte[].");
                            } else {
                                str2 = ((Boolean) obj2).toString();
                            }
                            obj2 = str2.getBytes(zzaq.f9930a);
                            hashMap.put(str3, obj2);
                        }
                    }
                    this.f11095i.writeLock().lock();
                    if (obj == null) {
                        try {
                            if (this.f11091e != null) {
                                if (!this.f11091e.m11347a(str)) {
                                    this.f11091e.m11346a(null, str);
                                    zzao = this.f11091e;
                                    currentTimeMillis = System.currentTimeMillis();
                                }
                            }
                            this.f11095i.writeLock().unlock();
                        } catch (Throwable th) {
                            this.f11095i.writeLock().unlock();
                        }
                    } else {
                        if (this.f11091e == null) {
                            this.f11091e = new zzao(new HashMap(), System.currentTimeMillis(), null);
                        }
                        this.f11091e.m11346a(hashMap, str);
                        zzao = this.f11091e;
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    zzao.m11345a(currentTimeMillis);
                    if (z) {
                        this.f11092f.m11356a(str);
                    }
                    m12835d();
                    this.f11095i.writeLock().unlock();
                }
            }
            obj = 1;
            hashMap = new HashMap();
            if (obj == null) {
                for (String str32 : map.keySet()) {
                    obj2 = map.get(str32);
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    } else if (obj2 instanceof Long) {
                        str2 = ((Long) obj2).toString();
                    } else if (obj2 instanceof Integer) {
                        str2 = ((Integer) obj2).toString();
                    } else if (obj2 instanceof Double) {
                        str2 = ((Double) obj2).toString();
                    } else if (obj2 instanceof Float) {
                        str2 = ((Float) obj2).toString();
                    } else if (obj2 instanceof byte[]) {
                        bArr = (byte[]) obj2;
                        hashMap.put(str32, obj2);
                    } else if (obj2 instanceof Boolean) {
                        throw new IllegalArgumentException("The type of a default value needs to beone of String, Long, Double, Boolean, or byte[].");
                    } else {
                        str2 = ((Boolean) obj2).toString();
                    }
                    obj2 = str2.getBytes(zzaq.f9930a);
                    hashMap.put(str32, obj2);
                }
            }
            this.f11095i.writeLock().lock();
            if (obj == null) {
                if (this.f11091e == null) {
                    this.f11091e = new zzao(new HashMap(), System.currentTimeMillis(), null);
                }
                this.f11091e.m11346a(hashMap, str);
                zzao = this.f11091e;
                currentTimeMillis = System.currentTimeMillis();
            } else {
                if (this.f11091e != null) {
                    if (!this.f11091e.m11347a(str)) {
                        this.f11091e.m11346a(null, str);
                        zzao = this.f11091e;
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                this.f11095i.writeLock().unlock();
            }
            zzao.m11345a(currentTimeMillis);
            if (z) {
                this.f11092f.m11356a(str);
            }
            m12835d();
            this.f11095i.writeLock().unlock();
        }
    }

    /* renamed from: b */
    private final long m12832b(android.content.Context r4) {
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
        r3 = this;
        r0 = r3.f11093g;	 Catch:{ NameNotFoundException -> 0x0012 }
        r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0);	 Catch:{ NameNotFoundException -> 0x0012 }
        r1 = r4.getPackageName();	 Catch:{ NameNotFoundException -> 0x0012 }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x0012 }
        r0 = r0.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0012 }
        r0 = r0.lastUpdateTime;	 Catch:{ NameNotFoundException -> 0x0012 }
        goto L_0x003d;
    L_0x0012:
        r0 = "FirebaseRemoteConfig";
        r4 = r4.getPackageName();
        r1 = java.lang.String.valueOf(r4);
        r1 = r1.length();
        r1 = r1 + 25;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Package [";
        r2.append(r1);
        r2.append(r4);
        r4 = "] was not found!";
        r2.append(r4);
        r4 = r2.toString();
        android.util.Log.e(r0, r4);
        r0 = 0;
    L_0x003d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.a.b(android.content.Context):long");
    }

    /* renamed from: c */
    private static zzaw m12833c(Context context) {
        FileInputStream openFileInput;
        Throwable e;
        Throwable th;
        if (context == null) {
            return null;
        }
        try {
            openFileInput = context.openFileInput("persisted_config");
            try {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = openFileInput.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                zzay a = zzay.m11363a(toByteArray, 0, toByteArray.length);
                zzbh zzaw = new zzaw();
                zzaw.mo4333a(a);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (Throwable e2) {
                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e2);
                    }
                }
                return zzaw;
            } catch (FileNotFoundException e3) {
                e = e3;
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", e);
                }
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (Throwable e22) {
                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e22);
                    }
                }
                return null;
            } catch (IOException e4) {
                e = e4;
                try {
                    Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", e);
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable e222) {
                            Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e222);
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable e2222) {
                            Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e2222);
                        }
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            openFileInput = null;
            if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", e);
            }
            if (openFileInput != null) {
                openFileInput.close();
            }
            return null;
        } catch (IOException e6) {
            e = e6;
            openFileInput = null;
            Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", e);
            if (openFileInput != null) {
                openFileInput.close();
            }
            return null;
        } catch (Throwable e22222) {
            th = e22222;
            openFileInput = null;
            if (openFileInput != null) {
                openFileInput.close();
            }
            throw th;
        }
    }

    /* renamed from: d */
    private static com.google.firebase.p136a.C2559a m12834d(android.content.Context r3) {
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
        r0 = new com.google.firebase.a.a;	 Catch:{ NoClassDefFoundError -> 0x0009 }
        r1 = "frc";	 Catch:{ NoClassDefFoundError -> 0x0009 }
        r2 = 1;	 Catch:{ NoClassDefFoundError -> 0x0009 }
        r0.<init>(r3, r1, r2);	 Catch:{ NoClassDefFoundError -> 0x0009 }
        return r0;
    L_0x0009:
        r3 = "FirebaseRemoteConfig";
        r0 = "Unable to use ABT: Analytics library is missing.";
        android.util.Log.w(r3, r0);
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.a.d(android.content.Context):com.google.firebase.a.a");
    }

    /* renamed from: d */
    private final void m12835d() {
        this.f11095i.readLock().lock();
        try {
            C2614a.m12830a(new zzan(this.f11093g, this.f11089c, this.f11090d, this.f11091e, this.f11092f));
        } finally {
            this.f11095i.readLock().unlock();
        }
    }

    /* renamed from: a */
    public Task<Void> m12836a(long j) {
        return m12826a(j, new zzv(this.f11093g));
    }

    /* renamed from: a */
    public String m12837a(String str) {
        return m12838a(str, "configns:firebase");
    }

    /* renamed from: a */
    public String m12838a(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        this.f11095i.readLock().lock();
        try {
            String str3;
            if (this.f11090d != null && this.f11090d.m11348a(str, str2)) {
                str3 = new String(this.f11090d.m11350b(str, str2), zzaq.f9930a);
            } else if (this.f11091e == null || !this.f11091e.m11348a(str, str2)) {
                str = "";
                this.f11095i.readLock().unlock();
                return str;
            } else {
                str3 = new String(this.f11091e.m11350b(str, str2), zzaq.f9930a);
            }
            this.f11095i.readLock().unlock();
            return str3;
        } catch (Throwable th) {
            this.f11095i.readLock().unlock();
        }
    }

    /* renamed from: a */
    public void m12839a(int i) {
        m12840a(i, "configns:firebase");
    }

    /* renamed from: a */
    public void m12840a(int i, String str) {
        if (str == null) {
            if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                Log.d("FirebaseRemoteConfig", "namespace cannot be null for setDefaults.");
            }
            return;
        }
        this.f11095i.readLock().lock();
        try {
            if (!(this.f11092f == null || this.f11092f.m11361c() == null || this.f11092f.m11361c().get(str) == null)) {
                zzal zzal = (zzal) this.f11092f.m11361c().get(str);
                if (i == zzal.m11341a() && this.f11092f.m11362d() == zzal.m11342b()) {
                    if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                        Log.d("FirebaseRemoteConfig", "Skipped setting defaults from resource file as this resource file was already applied.");
                    }
                    this.f11095i.readLock().unlock();
                    return;
                }
            }
            this.f11095i.readLock().unlock();
            Map hashMap = new HashMap();
            try {
                XmlResourceParser xml = this.f11093g.getResources().getXml(i);
                Object obj = null;
                Object obj2 = obj;
                Object obj3 = obj2;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        obj = xml.getName();
                    } else if (eventType == 3) {
                        if (!(!"entry".equals(xml.getName()) || obj2 == null || obj3 == null)) {
                            hashMap.put(obj2, obj3);
                            obj2 = null;
                            obj3 = obj2;
                        }
                        obj = null;
                    } else if (eventType == 4) {
                        if ("key".equals(obj)) {
                            obj2 = xml.getText();
                        } else if ("value".equals(obj)) {
                            obj3 = xml.getText();
                        }
                    }
                }
                this.f11092f.m11357a(str, new zzal(i, this.f11092f.m11362d()));
                m12831a(hashMap, str, false);
            } catch (Throwable e) {
                Log.e("FirebaseRemoteConfig", "Caught exception while parsing XML resource. Skipping setDefaults.", e);
            }
        } catch (Throwable th) {
            this.f11095i.readLock().unlock();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m12841a(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r11, com.google.android.gms.internal.config.zzk r12) {
        /*
        r10 = this;
        r0 = 0;
        if (r12 == 0) goto L_0x0150;
    L_0x0003:
        r1 = r12.getStatus();
        if (r1 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x0150;
    L_0x000b:
        r1 = r12.getStatus();
        r1 = r1.getStatusCode();
        r2 = r10.f11095i;
        r2 = r2.writeLock();
        r2.lock();
        r2 = -6508; // 0xffffffffffffe694 float:NaN double:NaN;
        r3 = -1;
        if (r1 == r2) goto L_0x00d1;
    L_0x0021:
        r2 = 6507; // 0x196b float:9.118E-42 double:3.215E-320;
        if (r1 == r2) goto L_0x00be;
    L_0x0025:
        switch(r1) {
            case -6506: goto L_0x00d1;
            case -6505: goto L_0x005e;
            default: goto L_0x0028;
        };
    L_0x0028:
        switch(r1) {
            case 6500: goto L_0x0059;
            case 6501: goto L_0x0059;
            case 6502: goto L_0x00be;
            case 6503: goto L_0x0059;
            case 6504: goto L_0x0059;
            default: goto L_0x002b;
        };
    L_0x002b:
        r0 = r12.getStatus();	 Catch:{ all -> 0x0056 }
        r0 = r0.isSuccess();	 Catch:{ all -> 0x0056 }
        if (r0 == 0) goto L_0x004d;
    L_0x0035:
        r0 = "FirebaseRemoteConfig";
        r2 = 45;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0056 }
        r3.<init>(r2);	 Catch:{ all -> 0x0056 }
        r2 = "Unknown (successful) status code: ";
        r3.append(r2);	 Catch:{ all -> 0x0056 }
        r3.append(r1);	 Catch:{ all -> 0x0056 }
        r1 = r3.toString();	 Catch:{ all -> 0x0056 }
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x0056 }
    L_0x004d:
        r12 = r12.getStatus();	 Catch:{ all -> 0x0056 }
    L_0x0051:
        r10.m12829a(r11, r12);	 Catch:{ all -> 0x0056 }
        goto L_0x013c;
    L_0x0056:
        r11 = move-exception;
        goto L_0x0146;
    L_0x0059:
        r12 = r12.getStatus();	 Catch:{ all -> 0x0056 }
        goto L_0x0051;
    L_0x005e:
        r1 = r12.mo4337c();	 Catch:{ all -> 0x0056 }
        r2 = new java.util.HashMap;	 Catch:{ all -> 0x0056 }
        r2.<init>();	 Catch:{ all -> 0x0056 }
        r4 = r1.keySet();	 Catch:{ all -> 0x0056 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0056 }
    L_0x006f:
        r5 = r4.hasNext();	 Catch:{ all -> 0x0056 }
        if (r5 == 0) goto L_0x00a2;
    L_0x0075:
        r5 = r4.next();	 Catch:{ all -> 0x0056 }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x0056 }
        r6 = new java.util.HashMap;	 Catch:{ all -> 0x0056 }
        r6.<init>();	 Catch:{ all -> 0x0056 }
        r7 = r1.get(r5);	 Catch:{ all -> 0x0056 }
        r7 = (java.util.Set) r7;	 Catch:{ all -> 0x0056 }
        r7 = r7.iterator();	 Catch:{ all -> 0x0056 }
    L_0x008a:
        r8 = r7.hasNext();	 Catch:{ all -> 0x0056 }
        if (r8 == 0) goto L_0x009e;
    L_0x0090:
        r8 = r7.next();	 Catch:{ all -> 0x0056 }
        r8 = (java.lang.String) r8;	 Catch:{ all -> 0x0056 }
        r9 = r12.mo4335a(r8, r0, r5);	 Catch:{ all -> 0x0056 }
        r6.put(r8, r9);	 Catch:{ all -> 0x0056 }
        goto L_0x008a;
    L_0x009e:
        r2.put(r5, r6);	 Catch:{ all -> 0x0056 }
        goto L_0x006f;
    L_0x00a2:
        r1 = new com.google.android.gms.internal.config.zzao;	 Catch:{ all -> 0x0056 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0056 }
        r12 = r12.mo4336b();	 Catch:{ all -> 0x0056 }
        r1.<init>(r2, r4, r12);	 Catch:{ all -> 0x0056 }
        r10.f11089c = r1;	 Catch:{ all -> 0x0056 }
        r12 = r10.f11092f;	 Catch:{ all -> 0x0056 }
        r12.m11354a(r3);	 Catch:{ all -> 0x0056 }
        r11.m12419a(r0);	 Catch:{ all -> 0x0056 }
    L_0x00b9:
        r10.m12835d();	 Catch:{ all -> 0x0056 }
        goto L_0x013c;
    L_0x00be:
        r0 = r10.f11092f;	 Catch:{ all -> 0x0056 }
        r1 = 2;
        r0.m11354a(r1);	 Catch:{ all -> 0x0056 }
        r0 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;	 Catch:{ all -> 0x0056 }
        r1 = r12.mo4334a();	 Catch:{ all -> 0x0056 }
        r0.<init>(r1);	 Catch:{ all -> 0x0056 }
        r11.m12418a(r0);	 Catch:{ all -> 0x0056 }
        goto L_0x00b9;
    L_0x00d1:
        r1 = r10.f11092f;	 Catch:{ all -> 0x0056 }
        r1.m11354a(r3);	 Catch:{ all -> 0x0056 }
        r1 = r10.f11089c;	 Catch:{ all -> 0x0056 }
        if (r1 == 0) goto L_0x0137;
    L_0x00da:
        r1 = r10.f11089c;	 Catch:{ all -> 0x0056 }
        r1 = r1.m11351c();	 Catch:{ all -> 0x0056 }
        if (r1 != 0) goto L_0x0137;
    L_0x00e2:
        r1 = r12.mo4337c();	 Catch:{ all -> 0x0056 }
        r2 = new java.util.HashMap;	 Catch:{ all -> 0x0056 }
        r2.<init>();	 Catch:{ all -> 0x0056 }
        r3 = r1.keySet();	 Catch:{ all -> 0x0056 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0056 }
    L_0x00f3:
        r4 = r3.hasNext();	 Catch:{ all -> 0x0056 }
        if (r4 == 0) goto L_0x0126;
    L_0x00f9:
        r4 = r3.next();	 Catch:{ all -> 0x0056 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0056 }
        r5 = new java.util.HashMap;	 Catch:{ all -> 0x0056 }
        r5.<init>();	 Catch:{ all -> 0x0056 }
        r6 = r1.get(r4);	 Catch:{ all -> 0x0056 }
        r6 = (java.util.Set) r6;	 Catch:{ all -> 0x0056 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0056 }
    L_0x010e:
        r7 = r6.hasNext();	 Catch:{ all -> 0x0056 }
        if (r7 == 0) goto L_0x0122;
    L_0x0114:
        r7 = r6.next();	 Catch:{ all -> 0x0056 }
        r7 = (java.lang.String) r7;	 Catch:{ all -> 0x0056 }
        r8 = r12.mo4335a(r7, r0, r4);	 Catch:{ all -> 0x0056 }
        r5.put(r7, r8);	 Catch:{ all -> 0x0056 }
        goto L_0x010e;
    L_0x0122:
        r2.put(r4, r5);	 Catch:{ all -> 0x0056 }
        goto L_0x00f3;
    L_0x0126:
        r1 = new com.google.android.gms.internal.config.zzao;	 Catch:{ all -> 0x0056 }
        r3 = r10.f11089c;	 Catch:{ all -> 0x0056 }
        r3 = r3.m11352d();	 Catch:{ all -> 0x0056 }
        r12 = r12.mo4336b();	 Catch:{ all -> 0x0056 }
        r1.<init>(r2, r3, r12);	 Catch:{ all -> 0x0056 }
        r10.f11089c = r1;	 Catch:{ all -> 0x0056 }
    L_0x0137:
        r11.m12419a(r0);	 Catch:{ all -> 0x0056 }
        goto L_0x00b9;
    L_0x013c:
        r11 = r10.f11095i;
        r11 = r11.writeLock();
        r11.unlock();
        return;
    L_0x0146:
        r12 = r10.f11095i;
        r12 = r12.writeLock();
        r12.unlock();
        throw r11;
    L_0x0150:
        r10.m12829a(r11, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.a.a(com.google.android.gms.tasks.TaskCompletionSource, com.google.android.gms.internal.config.zzk):void");
    }

    /* renamed from: a */
    public void m12842a(C2617c c2617c) {
        this.f11095i.writeLock().lock();
        try {
            boolean b = this.f11092f.m11360b();
            boolean a = c2617c == null ? false : c2617c.m12851a();
            this.f11092f.m11359a(a);
            if (b != a) {
                m12835d();
            }
            this.f11095i.writeLock().unlock();
        } catch (Throwable th) {
            this.f11095i.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public boolean m12843b() {
        this.f11095i.writeLock().lock();
        try {
            if (this.f11089c != null) {
                if (this.f11090d == null || this.f11090d.m11352d() < this.f11089c.m11352d()) {
                    long d = this.f11089c.m11352d();
                    this.f11090d = this.f11089c;
                    this.f11090d.m11345a(System.currentTimeMillis());
                    this.f11089c = new zzao(null, d, null);
                    C2614a.m12830a(new zzam(this.f11096j, this.f11090d.m11349b()));
                    m12835d();
                    this.f11095i.writeLock().unlock();
                    return true;
                }
            }
            this.f11095i.writeLock().unlock();
            return false;
        } catch (Throwable th) {
            this.f11095i.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public boolean m12844b(String str) {
        return m12845b(str, "configns:firebase");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public boolean m12845b(java.lang.String r6, java.lang.String r7) {
        /*
        r5 = this;
        r0 = 0;
        if (r7 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5.f11095i;
        r1 = r1.readLock();
        r1.lock();
        r1 = r5.f11090d;	 Catch:{ all -> 0x0084 }
        r2 = 1;
        if (r1 == 0) goto L_0x0053;
    L_0x0012:
        r1 = r5.f11090d;	 Catch:{ all -> 0x0084 }
        r1 = r1.m11348a(r6, r7);	 Catch:{ all -> 0x0084 }
        if (r1 == 0) goto L_0x0053;
    L_0x001a:
        r1 = new java.lang.String;	 Catch:{ all -> 0x0084 }
        r3 = r5.f11090d;	 Catch:{ all -> 0x0084 }
        r3 = r3.m11350b(r6, r7);	 Catch:{ all -> 0x0084 }
        r4 = com.google.android.gms.internal.config.zzaq.f9930a;	 Catch:{ all -> 0x0084 }
        r1.<init>(r3, r4);	 Catch:{ all -> 0x0084 }
        r3 = com.google.android.gms.internal.config.zzaq.f9931b;	 Catch:{ all -> 0x0084 }
        r3 = r3.matcher(r1);	 Catch:{ all -> 0x0084 }
        r3 = r3.matches();	 Catch:{ all -> 0x0084 }
        if (r3 == 0) goto L_0x003d;
    L_0x0033:
        r6 = r5.f11095i;
        r6 = r6.readLock();
        r6.unlock();
        return r2;
    L_0x003d:
        r3 = com.google.android.gms.internal.config.zzaq.f9932c;	 Catch:{ all -> 0x0084 }
        r1 = r3.matcher(r1);	 Catch:{ all -> 0x0084 }
        r1 = r1.matches();	 Catch:{ all -> 0x0084 }
        if (r1 == 0) goto L_0x0053;
    L_0x0049:
        r6 = r5.f11095i;
        r6 = r6.readLock();
        r6.unlock();
        return r0;
    L_0x0053:
        r1 = r5.f11091e;	 Catch:{ all -> 0x0084 }
        if (r1 == 0) goto L_0x0049;
    L_0x0057:
        r1 = r5.f11091e;	 Catch:{ all -> 0x0084 }
        r1 = r1.m11348a(r6, r7);	 Catch:{ all -> 0x0084 }
        if (r1 == 0) goto L_0x0049;
    L_0x005f:
        r1 = new java.lang.String;	 Catch:{ all -> 0x0084 }
        r3 = r5.f11091e;	 Catch:{ all -> 0x0084 }
        r6 = r3.m11350b(r6, r7);	 Catch:{ all -> 0x0084 }
        r7 = com.google.android.gms.internal.config.zzaq.f9930a;	 Catch:{ all -> 0x0084 }
        r1.<init>(r6, r7);	 Catch:{ all -> 0x0084 }
        r6 = com.google.android.gms.internal.config.zzaq.f9931b;	 Catch:{ all -> 0x0084 }
        r6 = r6.matcher(r1);	 Catch:{ all -> 0x0084 }
        r6 = r6.matches();	 Catch:{ all -> 0x0084 }
        if (r6 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0033;
    L_0x0079:
        r6 = com.google.android.gms.internal.config.zzaq.f9932c;	 Catch:{ all -> 0x0084 }
        r6 = r6.matcher(r1);	 Catch:{ all -> 0x0084 }
        r6 = r6.matches();	 Catch:{ all -> 0x0084 }
        goto L_0x0049;
    L_0x0084:
        r6 = move-exception;
        r7 = r5.f11095i;
        r7 = r7.readLock();
        r7.unlock();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.a.b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: c */
    public C2615b m12846c() {
        C2615b zzap = new zzap();
        this.f11095i.readLock().lock();
        try {
            zzap.m22138a(this.f11089c == null ? -1 : this.f11089c.m11352d());
            zzap.m22137a(this.f11092f.m11353a());
            zzap.m22139a(new C2616a().m12849a(this.f11092f.m11360b()).m12850a());
            return zzap;
        } finally {
            this.f11095i.readLock().unlock();
        }
    }
}
