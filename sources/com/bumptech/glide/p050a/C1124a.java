package com.bumptech.glide.p050a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.a.a */
public final class C1124a implements Closeable {
    /* renamed from: a */
    final ThreadPoolExecutor f3668a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1120a());
    /* renamed from: b */
    private final File f3669b;
    /* renamed from: c */
    private final File f3670c;
    /* renamed from: d */
    private final File f3671d;
    /* renamed from: e */
    private final File f3672e;
    /* renamed from: f */
    private final int f3673f;
    /* renamed from: g */
    private long f3674g;
    /* renamed from: h */
    private final int f3675h;
    /* renamed from: i */
    private long f3676i = 0;
    /* renamed from: j */
    private Writer f3677j;
    /* renamed from: k */
    private final LinkedHashMap<String, C1122c> f3678k = new LinkedHashMap(0, 0.75f, true);
    /* renamed from: l */
    private int f3679l;
    /* renamed from: m */
    private long f3680m = 0;
    /* renamed from: n */
    private final Callable<Void> f3681n = new C11191(this);

    /* renamed from: com.bumptech.glide.a.a$1 */
    class C11191 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ C1124a f3650a;

        C11191(C1124a c1124a) {
            this.f3650a = c1124a;
        }

        public /* synthetic */ Object call() {
            return m4641a();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public java.lang.Void m4641a() {
            /*
            r4 = this;
            r0 = r4.f3650a;
            monitor-enter(r0);
            r1 = r4.f3650a;	 Catch:{ all -> 0x0028 }
            r1 = r1.f3677j;	 Catch:{ all -> 0x0028 }
            r2 = 0;
            if (r1 != 0) goto L_0x000e;
        L_0x000c:
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            return r2;
        L_0x000e:
            r1 = r4.f3650a;	 Catch:{ all -> 0x0028 }
            r1.m4682g();	 Catch:{ all -> 0x0028 }
            r1 = r4.f3650a;	 Catch:{ all -> 0x0028 }
            r1 = r1.m4679e();	 Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026;
        L_0x001b:
            r1 = r4.f3650a;	 Catch:{ all -> 0x0028 }
            r1.m4675d();	 Catch:{ all -> 0x0028 }
            r1 = r4.f3650a;	 Catch:{ all -> 0x0028 }
            r3 = 0;
            r1.f3679l = r3;	 Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            return r2;
        L_0x0028:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.1.a():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.a.a$a */
    private static final class C1120a implements ThreadFactory {
        private C1120a() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: com.bumptech.glide.a.a$b */
    public final class C1121b {
        /* renamed from: a */
        final /* synthetic */ C1124a f3651a;
        /* renamed from: b */
        private final C1122c f3652b;
        /* renamed from: c */
        private final boolean[] f3653c;
        /* renamed from: d */
        private boolean f3654d;

        private C1121b(C1124a c1124a, C1122c c1122c) {
            this.f3651a = c1124a;
            this.f3652b = c1122c;
            this.f3653c = c1122c.f3660f != null ? null : new boolean[c1124a.f3675h];
        }

        /* renamed from: a */
        public File m4644a(int i) {
            synchronized (this.f3651a) {
                if (this.f3652b.f3661g == this) {
                    if (!this.f3652b.f3660f) {
                        this.f3653c[i] = true;
                    }
                    i = this.f3652b.m4661b(i);
                    if (!this.f3651a.f3669b.exists()) {
                        this.f3651a.f3669b.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return i;
        }

        /* renamed from: a */
        public void m4645a() {
            this.f3651a.m4667a(this, true);
            this.f3654d = true;
        }

        /* renamed from: b */
        public void m4646b() {
            this.f3651a.m4667a(this, false);
        }

        /* renamed from: c */
        public void m4647c() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f3654d;
            if (r0 != 0) goto L_0x0007;
        L_0x0004:
            r1.m4646b();	 Catch:{ IOException -> 0x0007 }
        L_0x0007:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.b.c():void");
        }
    }

    /* renamed from: com.bumptech.glide.a.a$c */
    private final class C1122c {
        /* renamed from: a */
        File[] f3655a;
        /* renamed from: b */
        File[] f3656b;
        /* renamed from: c */
        final /* synthetic */ C1124a f3657c;
        /* renamed from: d */
        private final String f3658d;
        /* renamed from: e */
        private final long[] f3659e;
        /* renamed from: f */
        private boolean f3660f;
        /* renamed from: g */
        private C1121b f3661g;
        /* renamed from: h */
        private long f3662h;

        private C1122c(C1124a c1124a, String str) {
            this.f3657c = c1124a;
            this.f3658d = str;
            this.f3659e = new long[c1124a.f3675h];
            this.f3655a = new File[c1124a.f3675h];
            this.f3656b = new File[c1124a.f3675h];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append('.');
            str = stringBuilder.length();
            for (int i = 0; i < c1124a.f3675h; i++) {
                stringBuilder.append(i);
                this.f3655a[i] = new File(c1124a.f3669b, stringBuilder.toString());
                stringBuilder.append(".tmp");
                this.f3656b[i] = new File(c1124a.f3669b, stringBuilder.toString());
                stringBuilder.setLength(str);
            }
        }

        /* renamed from: a */
        public String m4660a() {
            StringBuilder stringBuilder = new StringBuilder();
            for (long j : this.f3659e) {
                stringBuilder.append(' ');
                stringBuilder.append(j);
            }
            return stringBuilder.toString();
        }

        /* renamed from: a */
        private void m4652a(java.lang.String[] r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r5.length;
            r1 = r4.f3657c;
            r1 = r1.f3675h;
            if (r0 != r1) goto L_0x0020;
        L_0x0009:
            r0 = 0;
        L_0x000a:
            r1 = r5.length;	 Catch:{ NumberFormatException -> 0x001b }
            if (r0 >= r1) goto L_0x001a;	 Catch:{ NumberFormatException -> 0x001b }
        L_0x000d:
            r1 = r4.f3659e;	 Catch:{ NumberFormatException -> 0x001b }
            r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x001b }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x001b }
            r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x001b }
            r0 = r0 + 1;
            goto L_0x000a;
        L_0x001a:
            return;
        L_0x001b:
            r5 = r4.m4654b(r5);
            throw r5;
        L_0x0020:
            r5 = r4.m4654b(r5);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.c.a(java.lang.String[]):void");
        }

        /* renamed from: b */
        private IOException m4654b(String[] strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: a */
        public File m4659a(int i) {
            return this.f3655a[i];
        }

        /* renamed from: b */
        public File m4661b(int i) {
            return this.f3656b[i];
        }
    }

    /* renamed from: com.bumptech.glide.a.a$d */
    public final class C1123d {
        /* renamed from: a */
        final /* synthetic */ C1124a f3663a;
        /* renamed from: b */
        private final String f3664b;
        /* renamed from: c */
        private final long f3665c;
        /* renamed from: d */
        private final long[] f3666d;
        /* renamed from: e */
        private final File[] f3667e;

        private C1123d(C1124a c1124a, String str, long j, File[] fileArr, long[] jArr) {
            this.f3663a = c1124a;
            this.f3664b = str;
            this.f3665c = j;
            this.f3667e = fileArr;
            this.f3666d = jArr;
        }

        /* renamed from: a */
        public File m4662a(int i) {
            return this.f3667e[i];
        }
    }

    private C1124a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f3669b = file2;
        this.f3673f = i;
        this.f3670c = new File(file2, "journal");
        this.f3671d = new File(file2, "journal.tmp");
        this.f3672e = new File(file2, "journal.bkp");
        this.f3675h = i2;
        this.f3674g = j;
    }

    /* renamed from: a */
    public static C1124a m4665a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    C1124a.m4670a(file2, file3, false);
                }
            }
            C1124a c1124a = new C1124a(file, i, i2, j);
            if (c1124a.f3670c.exists()) {
                try {
                    c1124a.m4671b();
                    c1124a.m4673c();
                    return c1124a;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DiskLruCache ");
                    stringBuilder.append(file);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    printStream.println(stringBuilder.toString());
                    c1124a.m4684a();
                }
            }
            file.mkdirs();
            c1124a = new C1124a(file, i, i2, j);
            c1124a.m4675d();
            return c1124a;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: b */
    private void m4671b() {
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
        r8 = this;
        r0 = new com.bumptech.glide.a.b;
        r1 = new java.io.FileInputStream;
        r2 = r8.f3670c;
        r1.<init>(r2);
        r2 = com.bumptech.glide.p050a.C1127c.f3688a;
        r0.<init>(r1, r2);
        r1 = r0.m4689a();	 Catch:{ all -> 0x00be }
        r2 = r0.m4689a();	 Catch:{ all -> 0x00be }
        r3 = r0.m4689a();	 Catch:{ all -> 0x00be }
        r4 = r0.m4689a();	 Catch:{ all -> 0x00be }
        r5 = r0.m4689a();	 Catch:{ all -> 0x00be }
        r6 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x00be }
        r6 = r6.equals(r1);	 Catch:{ all -> 0x00be }
        if (r6 == 0) goto L_0x008a;	 Catch:{ all -> 0x00be }
    L_0x002a:
        r6 = "1";	 Catch:{ all -> 0x00be }
        r6 = r6.equals(r2);	 Catch:{ all -> 0x00be }
        if (r6 == 0) goto L_0x008a;	 Catch:{ all -> 0x00be }
    L_0x0032:
        r6 = r8.f3673f;	 Catch:{ all -> 0x00be }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x00be }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x00be }
        if (r3 == 0) goto L_0x008a;	 Catch:{ all -> 0x00be }
    L_0x003e:
        r3 = r8.f3675h;	 Catch:{ all -> 0x00be }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x00be }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x00be }
        if (r3 == 0) goto L_0x008a;	 Catch:{ all -> 0x00be }
    L_0x004a:
        r3 = "";	 Catch:{ all -> 0x00be }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x00be }
        if (r3 == 0) goto L_0x008a;
    L_0x0052:
        r1 = 0;
    L_0x0053:
        r2 = r0.m4689a();	 Catch:{ EOFException -> 0x005d }
        r8.m4677d(r2);	 Catch:{ EOFException -> 0x005d }
        r1 = r1 + 1;
        goto L_0x0053;
    L_0x005d:
        r2 = r8.f3678k;	 Catch:{ all -> 0x00be }
        r2 = r2.size();	 Catch:{ all -> 0x00be }
        r1 = r1 - r2;	 Catch:{ all -> 0x00be }
        r8.f3679l = r1;	 Catch:{ all -> 0x00be }
        r1 = r0.m4690b();	 Catch:{ all -> 0x00be }
        if (r1 == 0) goto L_0x0070;	 Catch:{ all -> 0x00be }
    L_0x006c:
        r8.m4675d();	 Catch:{ all -> 0x00be }
        goto L_0x0086;	 Catch:{ all -> 0x00be }
    L_0x0070:
        r1 = new java.io.BufferedWriter;	 Catch:{ all -> 0x00be }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x00be }
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00be }
        r4 = r8.f3670c;	 Catch:{ all -> 0x00be }
        r5 = 1;	 Catch:{ all -> 0x00be }
        r3.<init>(r4, r5);	 Catch:{ all -> 0x00be }
        r4 = com.bumptech.glide.p050a.C1127c.f3688a;	 Catch:{ all -> 0x00be }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x00be }
        r1.<init>(r2);	 Catch:{ all -> 0x00be }
        r8.f3677j = r1;	 Catch:{ all -> 0x00be }
    L_0x0086:
        com.bumptech.glide.p050a.C1127c.m4691a(r0);
        return;
    L_0x008a:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x00be }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00be }
        r6.<init>();	 Catch:{ all -> 0x00be }
        r7 = "unexpected journal header: [";	 Catch:{ all -> 0x00be }
        r6.append(r7);	 Catch:{ all -> 0x00be }
        r6.append(r1);	 Catch:{ all -> 0x00be }
        r1 = ", ";	 Catch:{ all -> 0x00be }
        r6.append(r1);	 Catch:{ all -> 0x00be }
        r6.append(r2);	 Catch:{ all -> 0x00be }
        r1 = ", ";	 Catch:{ all -> 0x00be }
        r6.append(r1);	 Catch:{ all -> 0x00be }
        r6.append(r4);	 Catch:{ all -> 0x00be }
        r1 = ", ";	 Catch:{ all -> 0x00be }
        r6.append(r1);	 Catch:{ all -> 0x00be }
        r6.append(r5);	 Catch:{ all -> 0x00be }
        r1 = "]";	 Catch:{ all -> 0x00be }
        r6.append(r1);	 Catch:{ all -> 0x00be }
        r1 = r6.toString();	 Catch:{ all -> 0x00be }
        r3.<init>(r1);	 Catch:{ all -> 0x00be }
        throw r3;	 Catch:{ all -> 0x00be }
    L_0x00be:
        r1 = move-exception;
        com.bumptech.glide.p050a.C1127c.m4691a(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.b():void");
    }

    /* renamed from: d */
    private void m4677d(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            String substring;
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == "REMOVE".length() && str.startsWith("REMOVE")) {
                    this.f3678k.remove(substring);
                    return;
                }
            }
            substring = str.substring(i, indexOf2);
            C1122c c1122c = (C1122c) this.f3678k.get(substring);
            if (c1122c == null) {
                c1122c = new C1122c(substring);
                this.f3678k.put(substring, c1122c);
            }
            if (indexOf2 != -1 && indexOf == "CLEAN".length() && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c1122c.f3660f = true;
                c1122c.f3661g = null;
                c1122c.m4652a(split);
            } else if (indexOf2 == -1 && indexOf == "DIRTY".length() && str.startsWith("DIRTY")) {
                c1122c.f3661g = new C1121b(c1122c);
            } else if (!(indexOf2 == -1 && indexOf == "READ".length() && str.startsWith("READ"))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected journal line: ");
                stringBuilder.append(str);
                throw new IOException(stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected journal line: ");
        stringBuilder.append(str);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: c */
    private void m4673c() {
        C1124a.m4669a(this.f3671d);
        Iterator it = this.f3678k.values().iterator();
        while (it.hasNext()) {
            C1122c c1122c = (C1122c) it.next();
            int i = 0;
            if (c1122c.f3661g == null) {
                while (i < this.f3675h) {
                    this.f3676i += c1122c.f3659e[i];
                    i++;
                }
            } else {
                c1122c.f3661g = null;
                while (i < this.f3675h) {
                    C1124a.m4669a(c1122c.m4659a(i));
                    C1124a.m4669a(c1122c.m4661b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: d */
    private synchronized void m4675d() {
        if (this.f3677j != null) {
            this.f3677j.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3671d), C1127c.f3688a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3673f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3675h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1122c c1122c : this.f3678k.values()) {
                StringBuilder stringBuilder;
                if (c1122c.f3661g != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("DIRTY ");
                    stringBuilder.append(c1122c.f3658d);
                    stringBuilder.append('\n');
                    bufferedWriter.write(stringBuilder.toString());
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("CLEAN ");
                    stringBuilder.append(c1122c.f3658d);
                    stringBuilder.append(c1122c.m4660a());
                    stringBuilder.append('\n');
                    bufferedWriter.write(stringBuilder.toString());
                }
            }
            if (this.f3670c.exists()) {
                C1124a.m4670a(this.f3670c, this.f3672e, true);
            }
            C1124a.m4670a(this.f3671d, this.f3670c, false);
            this.f3672e.delete();
            this.f3677j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3670c, true), C1127c.f3688a));
        } finally {
            bufferedWriter.close();
        }
    }

    /* renamed from: a */
    private static void m4669a(File file) {
        if (!file.exists()) {
            return;
        }
        if (file.delete() == null) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m4670a(File file, File file2, boolean z) {
        if (z) {
            C1124a.m4669a(file2);
        }
        if (file.renameTo(file2) == null) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public synchronized C1123d m4683a(String str) {
        m4681f();
        C1122c c1122c = (C1122c) this.f3678k.get(str);
        if (c1122c == null) {
            return null;
        }
        if (!c1122c.f3660f) {
            return null;
        }
        for (File exists : c1122c.f3655a) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f3679l++;
        this.f3677j.append("READ");
        this.f3677j.append(' ');
        this.f3677j.append(str);
        this.f3677j.append('\n');
        if (m4679e()) {
            this.f3668a.submit(this.f3681n);
        }
        return new C1123d(str, c1122c.f3662h, c1122c.f3655a, c1122c.f3659e);
    }

    /* renamed from: b */
    public C1121b m4685b(String str) {
        return m4664a(str, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized com.bumptech.glide.p050a.C1124a.C1121b m4664a(java.lang.String r6, long r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.m4681f();	 Catch:{ all -> 0x005d }
        r0 = r5.f3678k;	 Catch:{ all -> 0x005d }
        r0 = r0.get(r6);	 Catch:{ all -> 0x005d }
        r0 = (com.bumptech.glide.p050a.C1124a.C1122c) r0;	 Catch:{ all -> 0x005d }
        r1 = -1;
        r3 = 0;
        r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r4 == 0) goto L_0x001f;
    L_0x0013:
        if (r0 == 0) goto L_0x001d;
    L_0x0015:
        r1 = r0.f3662h;	 Catch:{ all -> 0x005d }
        r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x001f;
    L_0x001d:
        monitor-exit(r5);
        return r3;
    L_0x001f:
        if (r0 != 0) goto L_0x002c;
    L_0x0021:
        r0 = new com.bumptech.glide.a.a$c;	 Catch:{ all -> 0x005d }
        r0.<init>(r6);	 Catch:{ all -> 0x005d }
        r7 = r5.f3678k;	 Catch:{ all -> 0x005d }
        r7.put(r6, r0);	 Catch:{ all -> 0x005d }
        goto L_0x0034;
    L_0x002c:
        r7 = r0.f3661g;	 Catch:{ all -> 0x005d }
        if (r7 == 0) goto L_0x0034;
    L_0x0032:
        monitor-exit(r5);
        return r3;
    L_0x0034:
        r7 = new com.bumptech.glide.a.a$b;	 Catch:{ all -> 0x005d }
        r7.<init>(r0);	 Catch:{ all -> 0x005d }
        r0.f3661g = r7;	 Catch:{ all -> 0x005d }
        r8 = r5.f3677j;	 Catch:{ all -> 0x005d }
        r0 = "DIRTY";
        r8.append(r0);	 Catch:{ all -> 0x005d }
        r8 = r5.f3677j;	 Catch:{ all -> 0x005d }
        r0 = 32;
        r8.append(r0);	 Catch:{ all -> 0x005d }
        r8 = r5.f3677j;	 Catch:{ all -> 0x005d }
        r8.append(r6);	 Catch:{ all -> 0x005d }
        r6 = r5.f3677j;	 Catch:{ all -> 0x005d }
        r8 = 10;
        r6.append(r8);	 Catch:{ all -> 0x005d }
        r6 = r5.f3677j;	 Catch:{ all -> 0x005d }
        r6.flush();	 Catch:{ all -> 0x005d }
        monitor-exit(r5);
        return r7;
    L_0x005d:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.a(java.lang.String, long):com.bumptech.glide.a.a$b");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized void m4667a(com.bumptech.glide.p050a.C1124a.C1121b r10, boolean r11) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r10.f3652b;	 Catch:{ all -> 0x010f }
        r1 = r0.f3661g;	 Catch:{ all -> 0x010f }
        if (r1 != r10) goto L_0x0109;
    L_0x000b:
        r1 = 0;
        if (r11 == 0) goto L_0x004d;
    L_0x000e:
        r2 = r0.f3660f;	 Catch:{ all -> 0x010f }
        if (r2 != 0) goto L_0x004d;
    L_0x0014:
        r2 = 0;
    L_0x0015:
        r3 = r9.f3675h;	 Catch:{ all -> 0x010f }
        if (r2 >= r3) goto L_0x004d;
    L_0x0019:
        r3 = r10.f3653c;	 Catch:{ all -> 0x010f }
        r3 = r3[r2];	 Catch:{ all -> 0x010f }
        if (r3 == 0) goto L_0x0033;
    L_0x0021:
        r3 = r0.m4661b(r2);	 Catch:{ all -> 0x010f }
        r3 = r3.exists();	 Catch:{ all -> 0x010f }
        if (r3 != 0) goto L_0x0030;
    L_0x002b:
        r10.m4646b();	 Catch:{ all -> 0x010f }
        monitor-exit(r9);
        return;
    L_0x0030:
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x0033:
        r10.m4646b();	 Catch:{ all -> 0x010f }
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x010f }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010f }
        r11.<init>();	 Catch:{ all -> 0x010f }
        r0 = "Newly created entry didn't create value for index ";
        r11.append(r0);	 Catch:{ all -> 0x010f }
        r11.append(r2);	 Catch:{ all -> 0x010f }
        r11 = r11.toString();	 Catch:{ all -> 0x010f }
        r10.<init>(r11);	 Catch:{ all -> 0x010f }
        throw r10;	 Catch:{ all -> 0x010f }
    L_0x004d:
        r10 = r9.f3675h;	 Catch:{ all -> 0x010f }
        if (r1 >= r10) goto L_0x0082;
    L_0x0051:
        r10 = r0.m4661b(r1);	 Catch:{ all -> 0x010f }
        if (r11 == 0) goto L_0x007c;
    L_0x0057:
        r2 = r10.exists();	 Catch:{ all -> 0x010f }
        if (r2 == 0) goto L_0x007f;
    L_0x005d:
        r2 = r0.m4659a(r1);	 Catch:{ all -> 0x010f }
        r10.renameTo(r2);	 Catch:{ all -> 0x010f }
        r10 = r0.f3659e;	 Catch:{ all -> 0x010f }
        r3 = r10[r1];	 Catch:{ all -> 0x010f }
        r5 = r2.length();	 Catch:{ all -> 0x010f }
        r10 = r0.f3659e;	 Catch:{ all -> 0x010f }
        r10[r1] = r5;	 Catch:{ all -> 0x010f }
        r7 = r9.f3676i;	 Catch:{ all -> 0x010f }
        r10 = 0;
        r7 = r7 - r3;
        r7 = r7 + r5;
        r9.f3676i = r7;	 Catch:{ all -> 0x010f }
        goto L_0x007f;
    L_0x007c:
        com.bumptech.glide.p050a.C1124a.m4669a(r10);	 Catch:{ all -> 0x010f }
    L_0x007f:
        r1 = r1 + 1;
        goto L_0x004d;
    L_0x0082:
        r10 = r9.f3679l;	 Catch:{ all -> 0x010f }
        r1 = 1;
        r10 = r10 + r1;
        r9.f3679l = r10;	 Catch:{ all -> 0x010f }
        r10 = 0;
        r0.f3661g = r10;	 Catch:{ all -> 0x010f }
        r10 = r0.f3660f;	 Catch:{ all -> 0x010f }
        r10 = r10 | r11;
        r2 = 10;
        r3 = 32;
        if (r10 == 0) goto L_0x00ca;
    L_0x0097:
        r0.f3660f = r1;	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r1 = "CLEAN";
        r10.append(r1);	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r10.append(r3);	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r1 = r0.f3658d;	 Catch:{ all -> 0x010f }
        r10.append(r1);	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r1 = r0.m4660a();	 Catch:{ all -> 0x010f }
        r10.append(r1);	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r10.append(r2);	 Catch:{ all -> 0x010f }
        if (r11 == 0) goto L_0x00ed;
    L_0x00bf:
        r10 = r9.f3680m;	 Catch:{ all -> 0x010f }
        r1 = 1;
        r1 = r1 + r10;
        r9.f3680m = r1;	 Catch:{ all -> 0x010f }
        r0.f3662h = r10;	 Catch:{ all -> 0x010f }
        goto L_0x00ed;
    L_0x00ca:
        r10 = r9.f3678k;	 Catch:{ all -> 0x010f }
        r11 = r0.f3658d;	 Catch:{ all -> 0x010f }
        r10.remove(r11);	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r11 = "REMOVE";
        r10.append(r11);	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r10.append(r3);	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r11 = r0.f3658d;	 Catch:{ all -> 0x010f }
        r10.append(r11);	 Catch:{ all -> 0x010f }
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r10.append(r2);	 Catch:{ all -> 0x010f }
    L_0x00ed:
        r10 = r9.f3677j;	 Catch:{ all -> 0x010f }
        r10.flush();	 Catch:{ all -> 0x010f }
        r10 = r9.f3676i;	 Catch:{ all -> 0x010f }
        r0 = r9.f3674g;	 Catch:{ all -> 0x010f }
        r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0100;
    L_0x00fa:
        r10 = r9.m4679e();	 Catch:{ all -> 0x010f }
        if (r10 == 0) goto L_0x0107;
    L_0x0100:
        r10 = r9.f3668a;	 Catch:{ all -> 0x010f }
        r11 = r9.f3681n;	 Catch:{ all -> 0x010f }
        r10.submit(r11);	 Catch:{ all -> 0x010f }
    L_0x0107:
        monitor-exit(r9);
        return;
    L_0x0109:
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x010f }
        r10.<init>();	 Catch:{ all -> 0x010f }
        throw r10;	 Catch:{ all -> 0x010f }
    L_0x010f:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.a(com.bumptech.glide.a.a$b, boolean):void");
    }

    /* renamed from: e */
    private boolean m4679e() {
        return this.f3679l >= 2000 && this.f3679l >= this.f3678k.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public synchronized boolean m4686c(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r7.m4681f();	 Catch:{ all -> 0x0090 }
        r0 = r7.f3678k;	 Catch:{ all -> 0x0090 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0090 }
        r0 = (com.bumptech.glide.p050a.C1124a.C1122c) r0;	 Catch:{ all -> 0x0090 }
        r1 = 0;
        if (r0 == 0) goto L_0x008e;
    L_0x000f:
        r2 = r0.f3661g;	 Catch:{ all -> 0x0090 }
        if (r2 == 0) goto L_0x0017;
    L_0x0015:
        goto L_0x008e;
    L_0x0017:
        r2 = r7.f3675h;	 Catch:{ all -> 0x0090 }
        if (r1 >= r2) goto L_0x005a;
    L_0x001b:
        r2 = r0.m4659a(r1);	 Catch:{ all -> 0x0090 }
        r3 = r2.exists();	 Catch:{ all -> 0x0090 }
        if (r3 == 0) goto L_0x0043;
    L_0x0025:
        r3 = r2.delete();	 Catch:{ all -> 0x0090 }
        if (r3 == 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0043;
    L_0x002c:
        r8 = new java.io.IOException;	 Catch:{ all -> 0x0090 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0090 }
        r0.<init>();	 Catch:{ all -> 0x0090 }
        r1 = "failed to delete ";
        r0.append(r1);	 Catch:{ all -> 0x0090 }
        r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r0.toString();	 Catch:{ all -> 0x0090 }
        r8.<init>(r0);	 Catch:{ all -> 0x0090 }
        throw r8;	 Catch:{ all -> 0x0090 }
    L_0x0043:
        r2 = r7.f3676i;	 Catch:{ all -> 0x0090 }
        r4 = r0.f3659e;	 Catch:{ all -> 0x0090 }
        r5 = r4[r1];	 Catch:{ all -> 0x0090 }
        r4 = 0;
        r2 = r2 - r5;
        r7.f3676i = r2;	 Catch:{ all -> 0x0090 }
        r2 = r0.f3659e;	 Catch:{ all -> 0x0090 }
        r3 = 0;
        r2[r1] = r3;	 Catch:{ all -> 0x0090 }
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x005a:
        r0 = r7.f3679l;	 Catch:{ all -> 0x0090 }
        r1 = 1;
        r0 = r0 + r1;
        r7.f3679l = r0;	 Catch:{ all -> 0x0090 }
        r0 = r7.f3677j;	 Catch:{ all -> 0x0090 }
        r2 = "REMOVE";
        r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r7.f3677j;	 Catch:{ all -> 0x0090 }
        r2 = 32;
        r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r7.f3677j;	 Catch:{ all -> 0x0090 }
        r0.append(r8);	 Catch:{ all -> 0x0090 }
        r0 = r7.f3677j;	 Catch:{ all -> 0x0090 }
        r2 = 10;
        r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r7.f3678k;	 Catch:{ all -> 0x0090 }
        r0.remove(r8);	 Catch:{ all -> 0x0090 }
        r8 = r7.m4679e();	 Catch:{ all -> 0x0090 }
        if (r8 == 0) goto L_0x008c;
    L_0x0085:
        r8 = r7.f3668a;	 Catch:{ all -> 0x0090 }
        r0 = r7.f3681n;	 Catch:{ all -> 0x0090 }
        r8.submit(r0);	 Catch:{ all -> 0x0090 }
    L_0x008c:
        monitor-exit(r7);
        return r1;
    L_0x008e:
        monitor-exit(r7);
        return r1;
    L_0x0090:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.c(java.lang.String):boolean");
    }

    /* renamed from: f */
    private void m4681f() {
        if (this.f3677j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() {
        if (this.f3677j != null) {
            Iterator it = new ArrayList(this.f3678k.values()).iterator();
            while (it.hasNext()) {
                C1122c c1122c = (C1122c) it.next();
                if (c1122c.f3661g != null) {
                    c1122c.f3661g.m4646b();
                }
            }
            m4682g();
            this.f3677j.close();
            this.f3677j = null;
        }
    }

    /* renamed from: g */
    private void m4682g() {
        while (this.f3676i > this.f3674g) {
            m4686c((String) ((Entry) this.f3678k.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: a */
    public void m4684a() {
        close();
        C1127c.m4692a(this.f3669b);
    }
}
