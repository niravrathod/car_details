package com.androidnetworking.p045e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.androidnetworking.model.Progress;
import com.androidnetworking.p044d.C1074q;

/* renamed from: com.androidnetworking.e.h */
public class C1086h extends Handler {
    /* renamed from: a */
    private final C1074q f3588a;

    public C1086h(C1074q c1074q) {
        super(Looper.getMainLooper());
        this.f3588a = c1074q;
    }

    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else if (this.f3588a != null) {
            Progress progress = (Progress) message.obj;
            this.f3588a.mo907a(progress.currentBytes, progress.totalBytes);
        }
    }
}
