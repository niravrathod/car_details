package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.v4.media.C0478a.C0476d;
import android.support.v4.media.C0478a.C0477e;
import java.util.List;

/* renamed from: android.support.v4.media.b */
class C0479b {

    /* renamed from: android.support.v4.media.b$a */
    interface C3143a extends C0476d {
        /* renamed from: a */
        void mo3765a(String str, Bundle bundle);

        /* renamed from: a */
        void mo3766a(String str, List<?> list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.b$b */
    static class C3144b<T extends C3143a> extends C0477e<T> {
        C3144b(T t) {
            super(t);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
            ((C3143a) this.a).mo3766a(str, list, bundle);
        }

        public void onError(String str, Bundle bundle) {
            ((C3143a) this.a).mo3765a(str, bundle);
        }
    }

    /* renamed from: a */
    static Object m1722a(C3143a c3143a) {
        return new C3144b(c3143a);
    }
}
