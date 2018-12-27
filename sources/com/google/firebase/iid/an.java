package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

final /* synthetic */ class an implements C2601t {
    /* renamed from: a */
    private final FirebaseInstanceId f17724a;
    /* renamed from: b */
    private final String f17725b;
    /* renamed from: c */
    private final String f17726c;
    /* renamed from: d */
    private final String f17727d;
    /* renamed from: e */
    private final String f17728e;

    an(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, String str4) {
        this.f17724a = firebaseInstanceId;
        this.f17725b = str;
        this.f17726c = str2;
        this.f17727d = str3;
        this.f17728e = str4;
    }

    /* renamed from: a */
    public final Task mo3319a() {
        return this.f17724a.m12669a(this.f17725b, this.f17726c, this.f17727d, this.f17728e);
    }
}
