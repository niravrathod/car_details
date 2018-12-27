package io.fabric.sdk.android;

import io.fabric.sdk.android.services.common.C2810r;
import io.fabric.sdk.android.services.concurrency.C4312c;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

/* renamed from: io.fabric.sdk.android.g */
class C4731g<Result> extends C4312c<Void, Void, Result> {
    /* renamed from: a */
    final C2771h<Result> f20785a;

    public C4731g(C2771h<Result> c2771h) {
        this.f20785a = c2771h;
    }

    /* renamed from: a */
    protected void mo4530a() {
        super.mo4530a();
        C2810r a = m27446a("onPreExecute");
        try {
            boolean onPreExecute = this.f20785a.onPreExecute();
            a.m13728b();
            if (onPreExecute) {
                return;
            }
        } catch (UnmetDependencyException e) {
            throw e;
        } catch (Throwable e2) {
            C2766c.m13524h().mo3562e("Fabric", "Failure onPreExecute()", e2);
            a.m13728b();
        } catch (Throwable th) {
            a.m13728b();
            m13741a(true);
        }
        m13741a(true);
    }

    /* renamed from: a */
    protected Result m27448a(Void... voidArr) {
        voidArr = m27446a("doInBackground");
        Result doInBackground = !m13744e() ? this.f20785a.doInBackground() : null;
        voidArr.m13728b();
        return doInBackground;
    }

    /* renamed from: a */
    protected void mo4531a(Result result) {
        this.f20785a.onPostExecute(result);
        this.f20785a.initializationCallback.mo3564a((Object) result);
    }

    /* renamed from: b */
    protected void mo4532b(Result result) {
        this.f20785a.onCancelled(result);
        result = new StringBuilder();
        result.append(this.f20785a.getIdentifier());
        result.append(" Initialization was cancelled");
        this.f20785a.initializationCallback.mo3563a(new InitializationException(result.toString()));
    }

    /* renamed from: b */
    public Priority mo3582b() {
        return Priority.HIGH;
    }

    /* renamed from: a */
    private C2810r m27446a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f20785a.getIdentifier());
        stringBuilder.append(".");
        stringBuilder.append(str);
        C2810r c2810r = new C2810r(stringBuilder.toString(), "KitInitialization");
        c2810r.m13727a();
        return c2810r;
    }
}
