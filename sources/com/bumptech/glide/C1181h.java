package com.bumptech.glide;

import com.bumptech.glide.request.p068b.C1309c;
import com.bumptech.glide.request.p068b.C3548a;

/* renamed from: com.bumptech.glide.h */
public abstract class C1181h<CHILD extends C1181h<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* renamed from: a */
    private C1309c<? super TranscodeType> f3838a = C3548a.m17991a();

    public /* synthetic */ Object clone() {
        return m4905a();
    }

    /* renamed from: a */
    public final CHILD m4905a() {
        try {
            return (C1181h) super.clone();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    final C1309c<? super TranscodeType> m4906b() {
        return this.f3838a;
    }
}
