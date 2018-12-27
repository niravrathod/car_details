package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.iid.s */
final /* synthetic */ class C4200s implements Continuation {
    /* renamed from: a */
    private final C2600r f17745a;
    /* renamed from: b */
    private final Pair f17746b;

    C4200s(C2600r c2600r, Pair pair) {
        this.f17745a = c2600r;
        this.f17746b = pair;
    }

    public final Object then(Task task) {
        return this.f17745a.m12762a(this.f17746b, task);
    }
}
