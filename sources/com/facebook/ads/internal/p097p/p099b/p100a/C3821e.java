package com.facebook.ads.internal.p097p.p099b.p100a;

import android.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.p.b.a.e */
abstract class C3821e implements C1868a {
    /* renamed from: a */
    private final ExecutorService f15255a = Executors.newSingleThreadExecutor();

    /* renamed from: com.facebook.ads.internal.p.b.a.e$a */
    private class C1873a implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ C3821e f5708a;
        /* renamed from: b */
        private final File f5709b;

        public C1873a(C3821e c3821e, File file) {
            this.f5708a = c3821e;
            this.f5709b = file;
        }

        /* renamed from: a */
        public Void m7147a() {
            this.f5708a.m19072b(this.f5709b);
            return null;
        }

        public /* synthetic */ Object call() {
            return m7147a();
        }
    }

    C3821e() {
    }

    /* renamed from: a */
    private void m19070a(List<File> list) {
        long b = m19071b((List) list);
        int size = list.size();
        for (File file : list) {
            if (!mo3977a(file, b, size)) {
                long length = file.length();
                StringBuilder stringBuilder;
                if (file.delete()) {
                    size--;
                    b -= length;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Cache file ");
                    stringBuilder.append(file);
                    stringBuilder.append(" is deleted because it exceeds cache limit");
                    Log.i("ProxyCache", stringBuilder.toString());
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error deleting file ");
                    stringBuilder.append(file);
                    stringBuilder.append(" for trimming cache");
                    Log.e("ProxyCache", stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: b */
    private long m19071b(List<File> list) {
        long j = 0;
        for (File length : list) {
            j += length.length();
        }
        return j;
    }

    /* renamed from: b */
    private void m19072b(File file) {
        C1872d.m7144c(file);
        m19070a(C1872d.m7143b(file.getParentFile()));
    }

    /* renamed from: a */
    public void mo1398a(File file) {
        this.f15255a.submit(new C1873a(this, file));
    }

    /* renamed from: a */
    protected abstract boolean mo3977a(File file, long j, int i);
}
