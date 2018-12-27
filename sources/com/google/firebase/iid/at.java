package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

final class at implements Continuation<Bundle, String> {
    /* renamed from: a */
    private final /* synthetic */ aq f17739a;

    at(aq aqVar) {
        this.f17739a = aqVar;
    }

    public final /* synthetic */ Object then(Task task) {
        return aq.m23055a((Bundle) task.mo3213a(IOException.class));
    }
}
