package com.facebook.ads.internal.p097p.p098a;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.p.a.h */
public class C3817h extends AsyncTask<C1861l, Void, C1863n> implements C1858c {
    /* renamed from: a */
    private static Executor f15248a = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    /* renamed from: b */
    private C1856a f15249b;
    /* renamed from: c */
    private C1857b f15250c;
    /* renamed from: d */
    private Exception f15251d;

    public C3817h(C1856a c1856a, C1857b c1857b) {
        this.f15249b = c1856a;
        this.f15250c = c1857b;
    }

    /* renamed from: a */
    protected C1863n m19059a(C1861l... c1861lArr) {
        if (c1861lArr != null) {
            try {
                if (c1861lArr.length > 0) {
                    return this.f15249b.m7085a(c1861lArr[0]);
                }
            } catch (Exception e) {
                this.f15251d = e;
                cancel(true);
                return null;
            }
        }
        throw new IllegalArgumentException("DoHttpRequestTask takes exactly one argument of type HttpRequest");
    }

    /* renamed from: a */
    public void mo1391a(C1861l c1861l) {
        super.executeOnExecutor(f15248a, new C1861l[]{c1861l});
    }

    /* renamed from: a */
    protected void m19061a(C1863n c1863n) {
        this.f15250c.mo1376a(c1863n);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m19059a((C1861l[]) objArr);
    }

    protected void onCancelled() {
        this.f15250c.mo1377a(this.f15251d);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m19061a((C1863n) obj);
    }
}
