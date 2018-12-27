package okhttp3.internal.p158d;

import java.io.File;
import java.io.IOException;
import okio.C2994r;
import okio.C2995s;
import okio.C4905m;

/* renamed from: okhttp3.internal.d.a */
public interface C2940a {
    /* renamed from: a */
    public static final C2940a f12402a = new C43541();

    /* renamed from: okhttp3.internal.d.a$1 */
    class C43541 implements C2940a {
        C43541() {
        }

        /* renamed from: a */
        public C2995s mo3638a(File file) {
            return C4905m.a(file);
        }

        /* renamed from: b */
        public okio.C2994r mo3640b(java.io.File r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = okio.C4905m.b(r2);	 Catch:{ FileNotFoundException -> 0x0005 }
            return r0;
        L_0x0005:
            r0 = r2.getParentFile();
            r0.mkdirs();
            r2 = okio.C4905m.b(r2);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.d.a.1.b(java.io.File):okio.r");
        }

        /* renamed from: c */
        public okio.C2994r mo3641c(java.io.File r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = okio.C4905m.c(r2);	 Catch:{ FileNotFoundException -> 0x0005 }
            return r0;
        L_0x0005:
            r0 = r2.getParentFile();
            r0.mkdirs();
            r2 = okio.C4905m.c(r2);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.d.a.1.c(java.io.File):okio.r");
        }

        /* renamed from: d */
        public void mo3642d(File file) {
            if (!file.delete()) {
                if (file.exists()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("failed to delete ");
                    stringBuilder.append(file);
                    throw new IOException(stringBuilder.toString());
                }
            }
        }

        /* renamed from: e */
        public boolean mo3643e(File file) {
            return file.exists();
        }

        /* renamed from: f */
        public long mo3644f(File file) {
            return file.length();
        }

        /* renamed from: a */
        public void mo3639a(File file, File file2) {
            mo3642d(file2);
            if (!file.renameTo(file2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("failed to rename ");
                stringBuilder.append(file);
                stringBuilder.append(" to ");
                stringBuilder.append(file2);
                throw new IOException(stringBuilder.toString());
            }
        }

        /* renamed from: g */
        public void mo3645g(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                file = listFiles.length;
                int i = 0;
                while (i < file) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo3645g(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("failed to delete ");
                        stringBuilder.append(file2);
                        throw new IOException(stringBuilder.toString());
                    }
                }
                return;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("not a readable directory: ");
            stringBuilder2.append(file);
            throw new IOException(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    C2995s mo3638a(File file);

    /* renamed from: a */
    void mo3639a(File file, File file2);

    /* renamed from: b */
    C2994r mo3640b(File file);

    /* renamed from: c */
    C2994r mo3641c(File file);

    /* renamed from: d */
    void mo3642d(File file);

    /* renamed from: e */
    boolean mo3643e(File file);

    /* renamed from: f */
    long mo3644f(File file);

    /* renamed from: g */
    void mo3645g(File file);
}
