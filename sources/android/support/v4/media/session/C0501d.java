package android.support.v4.media.session;

import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;

/* renamed from: android.support.v4.media.session.d */
class C0501d {

    /* renamed from: android.support.v4.media.session.d$a */
    static class C0500a {
        /* renamed from: a */
        public static Object m1857a(Object obj) {
            return ((QueueItem) obj).getDescription();
        }

        /* renamed from: b */
        public static long m1858b(Object obj) {
            return ((QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: a */
    public static Object m1859a(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
