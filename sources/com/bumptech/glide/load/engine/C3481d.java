package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1194a;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.p061b.C1242a.C1241b;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.d */
class C3481d<DataType> implements C1241b {
    /* renamed from: a */
    private final C1194a<DataType> f14452a;
    /* renamed from: b */
    private final DataType f14453b;
    /* renamed from: c */
    private final C3452e f14454c;

    C3481d(C1194a<DataType> c1194a, DataType dataType, C3452e c3452e) {
        this.f14452a = c1194a;
        this.f14453b = dataType;
        this.f14454c = c3452e;
    }

    /* renamed from: a */
    public boolean mo1032a(File file) {
        return this.f14452a.mo975a(this.f14453b, file, this.f14454c);
    }
}
