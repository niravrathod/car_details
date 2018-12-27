package com.facebook.ads.internal.view.hscroll;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.internal.view.hscroll.a */
public class C2076a {
    /* renamed from: a */
    private final SparseArray<int[]> f6391a = new SparseArray();

    /* renamed from: a */
    public void m7630a(int i, int[] iArr) {
        this.f6391a.put(i, iArr);
    }

    /* renamed from: a */
    public int[] m7631a(int i) {
        return (int[]) this.f6391a.get(i);
    }

    /* renamed from: b */
    public boolean m7632b(int i) {
        return this.f6391a.indexOfKey(i) >= 0;
    }
}
