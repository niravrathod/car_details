package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0503e {

    /* renamed from: android.support.v4.media.session.e$a */
    static final class C0502a {
        /* renamed from: a */
        public static String m1860a(Object obj) {
            return ((CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static CharSequence m1861b(Object obj) {
            return ((CustomAction) obj).getName();
        }

        /* renamed from: c */
        public static int m1862c(Object obj) {
            return ((CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static Bundle m1863d(Object obj) {
            return ((CustomAction) obj).getExtras();
        }
    }

    /* renamed from: a */
    public static int m1864a(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: b */
    public static long m1865b(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: c */
    public static long m1866c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static float m1867d(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: e */
    public static long m1868e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: f */
    public static CharSequence m1869f(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: g */
    public static long m1870g(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: h */
    public static List<Object> m1871h(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: i */
    public static long m1872i(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }
}
