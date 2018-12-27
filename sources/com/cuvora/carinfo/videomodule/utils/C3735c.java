package com.cuvora.carinfo.videomodule.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0786l;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cuvora.carinfo.videomodule.utils.c */
public class C3735c implements C0786l {
    /* renamed from: a */
    GestureDetector f14995a;
    /* renamed from: b */
    private C1623a f14996b;

    /* renamed from: com.cuvora.carinfo.videomodule.utils.c$1 */
    class C16221 extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ C3735c f4883a;

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        C16221(C3735c c3735c) {
            this.f4883a = c3735c;
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.utils.c$a */
    public interface C1623a {
        /* renamed from: a */
        void mo1236a(View view, int i);
    }

    /* renamed from: a */
    public void mo759a(boolean z) {
    }

    /* renamed from: b */
    public void mo761b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public C3735c(Context context, C1623a c1623a) {
        this.f14996b = c1623a;
        this.f14995a = new GestureDetector(context, new C16221(this));
    }

    /* renamed from: a */
    public boolean mo760a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View a = recyclerView.m24627a(motionEvent.getX(), motionEvent.getY());
        if (!(a == null || this.f14996b == null || this.f14995a.onTouchEvent(motionEvent) == null)) {
            recyclerView = recyclerView.m24674f(a);
            if (recyclerView > -1) {
                this.f14996b.mo1236a(a, recyclerView);
                return true;
            }
        }
        return null;
    }
}
