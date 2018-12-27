package com.google.firebase.components;

import com.google.firebase.p137b.C2568a;
import com.google.firebase.p137b.C2569b;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.components.m */
final /* synthetic */ class C2584m implements Runnable {
    /* renamed from: a */
    private final Entry f10968a;
    /* renamed from: b */
    private final C2568a f10969b;

    private C2584m(Entry entry, C2568a c2568a) {
        this.f10968a = entry;
        this.f10969b = c2568a;
    }

    /* renamed from: a */
    public static Runnable m12653a(Entry entry, C2568a c2568a) {
        return new C2584m(entry, c2568a);
    }

    public final void run() {
        ((C2569b) this.f10968a.getKey()).mo3309a(this.f10969b);
    }
}
