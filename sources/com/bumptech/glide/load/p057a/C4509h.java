package com.bumptech.glide.load.p057a;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: com.bumptech.glide.load.a.h */
public class C4509h extends C3381b<ParcelFileDescriptor> {
    /* renamed from: a */
    protected /* synthetic */ Object mo3901a(AssetManager assetManager, String str) {
        return m24940b(assetManager, str);
    }

    public C4509h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: b */
    protected ParcelFileDescriptor m24940b(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* renamed from: a */
    protected void m24938a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo959a() {
        return ParcelFileDescriptor.class;
    }
}
