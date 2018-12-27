package android.arch.p001a.p002a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: android.arch.a.a.b */
public class C2998b extends C0008c {
    /* renamed from: a */
    private final Object f12702a = new Object();
    /* renamed from: b */
    private ExecutorService f12703b = Executors.newFixedThreadPool(2);
    /* renamed from: c */
    private volatile Handler f12704c;

    /* renamed from: a */
    public void mo1a(Runnable runnable) {
        this.f12703b.execute(runnable);
    }

    /* renamed from: b */
    public void mo2b(Runnable runnable) {
        if (this.f12704c == null) {
            synchronized (this.f12702a) {
                if (this.f12704c == null) {
                    this.f12704c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f12704c.post(runnable);
    }

    /* renamed from: b */
    public boolean mo3b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
