package android.support.v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.support.v4.media.C0482d.C0481a;

/* renamed from: android.support.v4.media.e */
class C3146e extends C0482d {

    /* renamed from: android.support.v4.media.e$a */
    static class C3145a extends C0481a {
        /* renamed from: b */
        public static void m15667b(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: h */
    public static Uri m15668h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
