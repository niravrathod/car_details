package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.s */
final class C2493s extends Thread {
    /* renamed from: a */
    private final Object f10661a = new Object();
    /* renamed from: b */
    private final BlockingQueue<C2492r<?>> f10662b;
    /* renamed from: c */
    private final /* synthetic */ zzbo f10663c;

    public C2493s(zzbo zzbo, String str, BlockingQueue<C2492r<?>> blockingQueue) {
        this.f10663c = zzbo;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f10662b = blockingQueue;
        setName(str);
    }

    public final void run() {
        Object obj = null;
        while (obj == null) {
            try {
                this.f10663c.f21428h.acquire();
                obj = 1;
            } catch (InterruptedException e) {
                m12320a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2492r c2492r = (C2492r) this.f10662b.poll();
                if (c2492r != null) {
                    Process.setThreadPriority(c2492r.f10657a ? threadPriority : 10);
                    c2492r.run();
                } else {
                    synchronized (this.f10661a) {
                        if (this.f10662b.peek() == null && !this.f10663c.f21429i) {
                            try {
                                this.f10661a.wait(30000);
                            } catch (InterruptedException e2) {
                                m12320a(e2);
                            }
                        }
                    }
                    synchronized (this.f10663c.f21427g) {
                        if (this.f10662b.peek() == null) {
                            break;
                        }
                    }
                }
            }
            synchronized (this.f10663c.f21427g) {
                this.f10663c.f21428h.release();
                this.f10663c.f21427g.notifyAll();
                if (this == this.f10663c.f21421a) {
                    this.f10663c.f21421a = null;
                } else if (this == this.f10663c.f21422b) {
                    this.f10663c.f21422b = null;
                } else {
                    this.f10663c.mo3172r().v_().m12354a("Current scheduler thread is neither worker nor network");
                }
            }
        } catch (Throwable th) {
            synchronized (this.f10663c.f21427g) {
                this.f10663c.f21428h.release();
                this.f10663c.f21427g.notifyAll();
                if (this == this.f10663c.f21421a) {
                    this.f10663c.f21421a = null;
                } else if (this == this.f10663c.f21422b) {
                    this.f10663c.f21422b = null;
                } else {
                    this.f10663c.mo3172r().v_().m12354a("Current scheduler thread is neither worker nor network");
                }
            }
        }
    }

    /* renamed from: a */
    public final void m12321a() {
        synchronized (this.f10661a) {
            this.f10661a.notifyAll();
        }
    }

    /* renamed from: a */
    private final void m12320a(InterruptedException interruptedException) {
        this.f10663c.mo3172r().m28540i().m12355a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
