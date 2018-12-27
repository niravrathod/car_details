package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.p055g.C1180j;

/* renamed from: com.bumptech.glide.load.engine.v */
class C1279v {
    /* renamed from: a */
    private boolean f4030a;
    /* renamed from: b */
    private final Handler f4031b = new Handler(Looper.getMainLooper(), new C1278a());

    /* renamed from: com.bumptech.glide.load.engine.v$a */
    private static final class C1278a implements Callback {
        C1278a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return null;
            }
            ((C1277s) message.obj).mo1048f();
            return true;
        }
    }

    C1279v() {
    }

    /* renamed from: a */
    void m5155a(C1277s<?> c1277s) {
        C1180j.m4896a();
        if (this.f4030a) {
            this.f4031b.obtainMessage(1, c1277s).sendToTarget();
            return;
        }
        this.f4030a = true;
        c1277s.mo1048f();
        this.f4030a = null;
    }
}
