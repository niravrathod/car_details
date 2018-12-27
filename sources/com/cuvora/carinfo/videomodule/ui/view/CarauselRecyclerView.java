package com.cuvora.carinfo.videomodule.ui.view;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView.C0771a;
import android.util.AttributeSet;
import android.util.Log;
import com.cuvora.carinfo.views.LifecycleRecyclerView;
import kotlin.jvm.internal.C2885g;

public final class CarauselRecyclerView extends LifecycleRecyclerView {
    /* renamed from: J */
    private long f21549J = 4000;
    /* renamed from: K */
    private Handler f21550K = new Handler();
    /* renamed from: L */
    private final Runnable f21551L = ((Runnable) new C1610a(this));

    /* renamed from: com.cuvora.carinfo.videomodule.ui.view.CarauselRecyclerView$a */
    static final class C1610a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ CarauselRecyclerView f4826a;

        C1610a(CarauselRecyclerView carauselRecyclerView) {
            this.f4826a = carauselRecyclerView;
        }

        public final void run() {
            this.f4826a.m28836F();
        }
    }

    public CarauselRecyclerView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    public final long getDelay() {
        return this.f21549J;
    }

    public final void setDelay(long j) {
        this.f21549J = j;
    }

    public final Handler getMyHandler() {
        return this.f21550K;
    }

    public final void setMyHandler(Handler handler) {
        this.f21550K = handler;
    }

    public void setAdapter(C0771a<?> c0771a) {
        super.setAdapter(c0771a);
        m28837G();
    }

    /* renamed from: F */
    private final void m28836F() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.getLayoutManager();	 Catch:{ Exception -> 0x003e }
        r0 = r0 instanceof android.support.v7.widget.LinearLayoutManager;	 Catch:{ Exception -> 0x003e }
        if (r0 == 0) goto L_0x0033;	 Catch:{ Exception -> 0x003e }
    L_0x0008:
        r0 = r4.getLayoutManager();	 Catch:{ Exception -> 0x003e }
        if (r0 == 0) goto L_0x002b;	 Catch:{ Exception -> 0x003e }
    L_0x000e:
        r0 = (android.support.v7.widget.LinearLayoutManager) r0;	 Catch:{ Exception -> 0x003e }
        r0 = r0.m16408n();	 Catch:{ Exception -> 0x003e }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x003e }
        r1 = r4.getAdapter();	 Catch:{ Exception -> 0x003e }
        if (r1 == 0) goto L_0x0027;	 Catch:{ Exception -> 0x003e }
    L_0x001c:
        r1 = r1.mo91a();	 Catch:{ Exception -> 0x003e }
        if (r0 != r1) goto L_0x0027;	 Catch:{ Exception -> 0x003e }
    L_0x0022:
        r0 = 0;	 Catch:{ Exception -> 0x003e }
        r4.m24663c(r0);	 Catch:{ Exception -> 0x003e }
        goto L_0x0033;	 Catch:{ Exception -> 0x003e }
    L_0x0027:
        r4.m24663c(r0);	 Catch:{ Exception -> 0x003e }
        goto L_0x0033;	 Catch:{ Exception -> 0x003e }
    L_0x002b:
        r0 = new kotlin.TypeCastException;	 Catch:{ Exception -> 0x003e }
        r1 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager";	 Catch:{ Exception -> 0x003e }
        r0.<init>(r1);	 Catch:{ Exception -> 0x003e }
        throw r0;	 Catch:{ Exception -> 0x003e }
    L_0x0033:
        r0 = r4.f21550K;	 Catch:{ Exception -> 0x003e }
        if (r0 == 0) goto L_0x003e;	 Catch:{ Exception -> 0x003e }
    L_0x0037:
        r1 = r4.f21551L;	 Catch:{ Exception -> 0x003e }
        r2 = r4.f21549J;	 Catch:{ Exception -> 0x003e }
        r0.postDelayed(r1, r2);	 Catch:{ Exception -> 0x003e }
    L_0x003e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.videomodule.ui.view.CarauselRecyclerView.F():void");
    }

    /* renamed from: G */
    private final void m28837G() {
        Handler handler = this.f21550K;
        if (handler != null) {
            handler.postDelayed(this.f21551L, this.f21549J);
        }
    }

    /* renamed from: g */
    public void mo4912g(int i) {
        super.mo4912g(i);
        if (i == 0) {
            i = this.f21550K;
            if (i != 0) {
                i.postDelayed(this.f21551L, this.f21549J);
                return;
            }
            return;
        }
        i = this.f21550K;
        if (i != 0) {
            i.removeCallbacks(this.f21551L);
        }
    }

    /* renamed from: z */
    public void mo4658z() {
        super.mo4658z();
        Log.d("HELLO", "DESTROY");
        Handler handler = this.f21550K;
        if (handler != null) {
            handler.removeCallbacks(this.f21551L);
        }
    }
}
