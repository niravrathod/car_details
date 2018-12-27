package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {

    /* renamed from: com.google.android.gms.tasks.Tasks$b */
    interface C4142b extends OnCanceledListener, OnFailureListener, OnSuccessListener<Object> {
    }

    /* renamed from: com.google.android.gms.tasks.Tasks$a */
    private static final class C4715a implements C4142b {
        /* renamed from: a */
        private final CountDownLatch f20756a;

        private C4715a() {
            this.f20756a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void mo3205a(Object obj) {
            this.f20756a.countDown();
        }

        /* renamed from: a */
        public final void mo3204a(Exception exception) {
            this.f20756a.countDown();
        }

        /* renamed from: a */
        public final void mo3203a() {
            this.f20756a.countDown();
        }

        /* renamed from: b */
        public final void m27391b() {
            this.f20756a.await();
        }

        /* renamed from: a */
        public final boolean m27390a(long j, TimeUnit timeUnit) {
            return this.f20756a.await(j, timeUnit);
        }
    }

    /* renamed from: a */
    public static <TResult> Task<TResult> m12422a(TResult tResult) {
        Task c4150q = new C4150q();
        c4150q.m22855a((Object) tResult);
        return c4150q;
    }

    /* renamed from: a */
    public static <TResult> TResult m12423a(Task<TResult> task) {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.mo3214a()) {
            return m12426b(task);
        }
        Object c4715a = new C4715a();
        m12425a(task, c4715a);
        c4715a.m27391b();
        return m12426b(task);
    }

    /* renamed from: a */
    public static <TResult> TResult m12424a(Task<TResult> task, long j, TimeUnit timeUnit) {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.mo3214a()) {
            return m12426b(task);
        }
        Object c4715a = new C4715a();
        m12425a(task, c4715a);
        if (c4715a.m27390a(j, timeUnit) != null) {
            return m12426b(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: b */
    private static <TResult> TResult m12426b(Task<TResult> task) {
        if (task.mo3216b()) {
            return task.mo3218d();
        }
        if (task.mo3217c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo3219e());
    }

    /* renamed from: a */
    private static void m12425a(Task<?> task, C4142b c4142b) {
        task.mo3212a(TaskExecutors.f10823b, (OnSuccessListener) c4142b);
        task.mo3211a(TaskExecutors.f10823b, (OnFailureListener) c4142b);
        task.mo3209a(TaskExecutors.f10823b, (OnCanceledListener) c4142b);
    }

    private Tasks() {
    }
}
