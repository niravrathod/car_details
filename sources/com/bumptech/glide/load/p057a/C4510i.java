package com.bumptech.glide.load.p057a;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.a.i */
public class C4510i extends C3388l<ParcelFileDescriptor> {
    /* renamed from: b */
    protected /* synthetic */ Object mo3900b(Uri uri, ContentResolver contentResolver) {
        return m24941a(uri, contentResolver);
    }

    public C4510i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    protected ParcelFileDescriptor m24941a(Uri uri, ContentResolver contentResolver) {
        contentResolver = contentResolver.openAssetFileDescriptor(uri, "r");
        if (contentResolver != null) {
            return contentResolver.getParcelFileDescriptor();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FileDescriptor is null for: ");
        stringBuilder.append(uri);
        throw new FileNotFoundException(stringBuilder.toString());
    }

    /* renamed from: a */
    protected void m24943a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo959a() {
        return ParcelFileDescriptor.class;
    }
}
