package com.bumptech.glide.load.p057a;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.a.a */
public final class C4508a extends C3388l<AssetFileDescriptor> {
    /* renamed from: b */
    protected /* synthetic */ Object mo3900b(Uri uri, ContentResolver contentResolver) {
        return m24931a(uri, contentResolver);
    }

    public C4508a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    protected AssetFileDescriptor m24931a(Uri uri, ContentResolver contentResolver) {
        contentResolver = contentResolver.openAssetFileDescriptor(uri, "r");
        if (contentResolver != null) {
            return contentResolver;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FileDescriptor is null for: ");
        stringBuilder.append(uri);
        throw new FileNotFoundException(stringBuilder.toString());
    }

    /* renamed from: a */
    protected void m24933a(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    /* renamed from: a */
    public Class<AssetFileDescriptor> mo959a() {
        return AssetFileDescriptor.class;
    }
}
