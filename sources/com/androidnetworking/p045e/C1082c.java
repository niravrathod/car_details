package com.androidnetworking.p045e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.androidnetworking.model.Progress;
import com.androidnetworking.p044d.C1061e;

/* renamed from: com.androidnetworking.e.c */
public class C1082c extends Handler {
    /* renamed from: a */
    private final C1061e f3579a;

    public C1082c(C1061e c1061e) {
        super(Looper.getMainLooper());
        this.f3579a = c1061e;
    }

    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else if (this.f3579a != null) {
            Progress progress = (Progress) message.obj;
            this.f3579a.mo906a(progress.currentBytes, progress.totalBytes);
        }
    }
}
