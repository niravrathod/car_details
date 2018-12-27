package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.d */
class C0482d {

    /* renamed from: android.support.v4.media.d$a */
    static class C0481a {
        /* renamed from: a */
        public static Object m1724a() {
            return new Builder();
        }

        /* renamed from: a */
        public static void m1730a(Object obj, String str) {
            ((Builder) obj).setMediaId(str);
        }

        /* renamed from: a */
        public static void m1729a(Object obj, CharSequence charSequence) {
            ((Builder) obj).setTitle(charSequence);
        }

        /* renamed from: b */
        public static void m1731b(Object obj, CharSequence charSequence) {
            ((Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m1732c(Object obj, CharSequence charSequence) {
            ((Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m1726a(Object obj, Bitmap bitmap) {
            ((Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m1727a(Object obj, Uri uri) {
            ((Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m1728a(Object obj, Bundle bundle) {
            ((Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static Object m1725a(Object obj) {
            return ((Builder) obj).build();
        }
    }

    /* renamed from: a */
    public static String m1734a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: b */
    public static CharSequence m1736b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m1737c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m1738d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m1739e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m1740f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m1741g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: a */
    public static void m1735a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m1733a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }
}
