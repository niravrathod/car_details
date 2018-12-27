package com.bumptech.glide.load.p057a;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.n */
public class C4512n extends C3388l<InputStream> {
    /* renamed from: a */
    private static final UriMatcher f18827a = new UriMatcher(-1);

    /* renamed from: b */
    protected /* synthetic */ Object mo3900b(Uri uri, ContentResolver contentResolver) {
        return m24953a(uri, contentResolver);
    }

    static {
        f18827a.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f18827a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f18827a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f18827a.addURI("com.android.contacts", "contacts/#", 3);
        f18827a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f18827a.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C4512n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    protected InputStream m24953a(Uri uri, ContentResolver contentResolver) {
        contentResolver = m24952c(uri, contentResolver);
        if (contentResolver != null) {
            return contentResolver;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InputStream is null for ");
        stringBuilder.append(uri);
        throw new FileNotFoundException(stringBuilder.toString());
    }

    /* renamed from: c */
    private InputStream m24952c(Uri uri, ContentResolver contentResolver) {
        int match = f18827a.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m24951a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        uri = Contacts.lookupContact(contentResolver, uri);
        if (uri != null) {
            return m24951a(contentResolver, uri);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: a */
    private InputStream m24951a(ContentResolver contentResolver, Uri uri) {
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: a */
    protected void m24955a(InputStream inputStream) {
        inputStream.close();
    }

    /* renamed from: a */
    public Class<InputStream> mo959a() {
        return InputStream.class;
    }
}
