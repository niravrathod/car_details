package io.fabric.sdk.android.services.concurrency;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DependencyPriorityBlockingQueue<E extends C2822a & C2828i & C2825f> extends PriorityBlockingQueue<E> {
    final Queue<E> blockedQueue = new LinkedList();
    private final ReentrantLock lock = new ReentrantLock();

    public /* synthetic */ Object peek() {
        return m13751b();
    }

    public /* synthetic */ Object poll() {
        return m13753c();
    }

    public /* synthetic */ Object poll(long j, TimeUnit timeUnit) {
        return m13747a(j, timeUnit);
    }

    public /* synthetic */ Object take() {
        return m13745a();
    }

    /* renamed from: a */
    public E m13745a() {
        return m13752b(0, null, null);
    }

    /* renamed from: b */
    public E m13751b() {
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
        r0 = 1;
        r1 = 0;
        r0 = r2.m13752b(r0, r1, r1);	 Catch:{ InterruptedException -> 0x0007 }
        return r0;
    L_0x0007:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue.b():E");
    }

    /* renamed from: a */
    public E m13747a(long j, TimeUnit timeUnit) {
        return m13752b(3, Long.valueOf(j), timeUnit);
    }

    /* renamed from: c */
    public E m13753c() {
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
        r0 = 2;
        r1 = 0;
        r0 = r2.m13752b(r0, r1, r1);	 Catch:{ InterruptedException -> 0x0007 }
        return r0;
    L_0x0007:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue.c():E");
    }

    public int size() {
        try {
            this.lock.lock();
            int size = this.blockedQueue.size() + super.size();
            return size;
        } finally {
            this.lock.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.lock.lock();
            tArr = m13750a(super.toArray(tArr), this.blockedQueue.toArray(tArr));
            return tArr;
        } finally {
            this.lock.unlock();
        }
    }

    public Object[] toArray() {
        try {
            this.lock.lock();
            Object[] a = m13750a(super.toArray(), this.blockedQueue.toArray());
            return a;
        } finally {
            this.lock.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        int drainTo;
        try {
            this.lock.lock();
            drainTo = super.drainTo(collection) + this.blockedQueue.size();
            while (!this.blockedQueue.isEmpty()) {
                collection.add(this.blockedQueue.poll());
            }
            return drainTo;
        } finally {
            drainTo = this.lock;
            drainTo.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.lock.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.blockedQueue.isEmpty() && drainTo <= i) {
                collection.add(this.blockedQueue.poll());
                drainTo++;
            }
            this.lock.unlock();
            return drainTo;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.lock.lock();
            if (!super.contains(obj)) {
                if (this.blockedQueue.contains(obj) == null) {
                    obj = null;
                    this.lock.unlock();
                    return obj;
                }
            }
            obj = true;
            this.lock.unlock();
            return obj;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }

    public void clear() {
        try {
            this.lock.lock();
            this.blockedQueue.clear();
            super.clear();
        } finally {
            this.lock.unlock();
        }
    }

    public boolean remove(Object obj) {
        try {
            this.lock.lock();
            if (!super.remove(obj)) {
                if (this.blockedQueue.remove(obj) == null) {
                    obj = null;
                    this.lock.unlock();
                    return obj;
                }
            }
            obj = true;
            this.lock.unlock();
            return obj;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.lock.lock();
            collection = this.blockedQueue.removeAll(collection) | super.removeAll(collection);
            return collection;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: a */
    E m13746a(int i, Long l, TimeUnit timeUnit) {
        switch (i) {
            case 0:
                i = (C2822a) super.take();
                break;
            case 1:
                i = (C2822a) super.peek();
                break;
            case 2:
                i = (C2822a) super.poll();
                break;
            case 3:
                i = (C2822a) super.poll(l.longValue(), timeUnit);
                break;
            default:
                return null;
        }
        return i;
    }

    /* renamed from: a */
    boolean m13748a(int i, E e) {
        try {
            this.lock.lock();
            if (i == 1) {
                super.remove(e);
            }
            i = this.blockedQueue.offer(e);
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: b */
    E m13752b(int i, Long l, TimeUnit timeUnit) {
        C2822a a;
        while (true) {
            a = m13746a(i, l, timeUnit);
            if (a == null) {
                break;
            } else if (m13749a(a)) {
                break;
            } else {
                m13748a(i, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    boolean m13749a(E e) {
        return e.mo3586d();
    }

    /* renamed from: d */
    public void m13754d() {
        try {
            this.lock.lock();
            Iterator it = this.blockedQueue.iterator();
            while (it.hasNext()) {
                C2822a c2822a = (C2822a) it.next();
                if (m13749a(c2822a)) {
                    super.offer(c2822a);
                    it.remove();
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    /* renamed from: a */
    <T> T[] m13750a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, objArr, 0, length);
        System.arraycopy(tArr2, 0, objArr, length, length2);
        return objArr;
    }
}
