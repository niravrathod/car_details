package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.a */
class C0478a {

    /* renamed from: android.support.v4.media.a$a */
    interface C0473a {
        /* renamed from: a */
        void mo341a();

        /* renamed from: b */
        void mo342b();

        /* renamed from: c */
        void mo343c();
    }

    /* renamed from: android.support.v4.media.a$b */
    static class C0474b<T extends C0473a> extends ConnectionCallback {
        /* renamed from: a */
        protected final T f1563a;

        public C0474b(T t) {
            this.f1563a = t;
        }

        public void onConnected() {
            this.f1563a.mo341a();
        }

        public void onConnectionSuspended() {
            this.f1563a.mo342b();
        }

        public void onConnectionFailed() {
            this.f1563a.mo343c();
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    static class C0475c {
        /* renamed from: a */
        public static int m1711a(Object obj) {
            return ((MediaItem) obj).getFlags();
        }

        /* renamed from: b */
        public static Object m1712b(Object obj) {
            return ((MediaItem) obj).getDescription();
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    interface C0476d {
        /* renamed from: a */
        void mo353a(String str);

        /* renamed from: a */
        void mo354a(String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.a$e */
    static class C0477e<T extends C0476d> extends SubscriptionCallback {
        /* renamed from: a */
        protected final T f1564a;

        public C0477e(T t) {
            this.f1564a = t;
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
            this.f1564a.mo354a(str, list);
        }

        public void onError(String str) {
            this.f1564a.mo353a(str);
        }
    }

    /* renamed from: a */
    public static Object m1716a(C0473a c0473a) {
        return new C0474b(c0473a);
    }

    /* renamed from: a */
    public static Object m1715a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (ConnectionCallback) obj, bundle);
    }

    /* renamed from: a */
    public static void m1718a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: b */
    public static void m1719b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: c */
    public static Bundle m1720c(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: d */
    public static Object m1721d(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: a */
    public static Object m1717a(C0476d c0476d) {
        return new C0477e(c0476d);
    }
}
