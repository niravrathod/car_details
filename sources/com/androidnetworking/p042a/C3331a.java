package com.androidnetworking.p042a;

import android.graphics.Bitmap;
import com.androidnetworking.p045e.C1080a.C1077b;

/* renamed from: com.androidnetworking.a.a */
public class C3331a extends C1036b<String, Bitmap> implements C1077b {
    public C3331a(int i) {
        super(i);
    }

    /* renamed from: a */
    protected int m17155a(String str, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* renamed from: a */
    public Bitmap mo899a(String str) {
        return (Bitmap) m4408a((Object) str);
    }

    /* renamed from: b */
    public void mo900b(String str, Bitmap bitmap) {
        m4412b(str, bitmap);
    }
}
