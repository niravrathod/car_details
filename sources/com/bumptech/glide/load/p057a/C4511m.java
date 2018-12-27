package com.bumptech.glide.load.p057a;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.m */
public class C4511m extends C3381b<InputStream> {
    /* renamed from: a */
    protected /* synthetic */ Object mo3901a(AssetManager assetManager, String str) {
        return m24950b(assetManager, str);
    }

    public C4511m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: b */
    protected InputStream m24950b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    /* renamed from: a */
    protected void m24948a(InputStream inputStream) {
        inputStream.close();
    }

    /* renamed from: a */
    public Class<InputStream> mo959a() {
        return InputStream.class;
    }
}
