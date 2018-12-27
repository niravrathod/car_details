package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
class C0499c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface C0496a {
        /* renamed from: a */
        void mo365a();

        /* renamed from: a */
        void mo366a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo367a(Bundle bundle);

        /* renamed from: a */
        void mo368a(CharSequence charSequence);

        /* renamed from: a */
        void mo369a(Object obj);

        /* renamed from: a */
        void mo370a(String str, Bundle bundle);

        /* renamed from: a */
        void mo371a(List<?> list);

        /* renamed from: b */
        void mo372b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    static class C0497b<T extends C0496a> extends Callback {
        /* renamed from: a */
        protected final T f1607a;

        public C0497b(T t) {
            this.f1607a = t;
        }

        public void onSessionDestroyed() {
            this.f1607a.mo365a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.f1607a.mo370a(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1607a.mo369a((Object) playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1607a.mo372b(mediaMetadata);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.f1607a.mo371a((List) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f1607a.mo368a(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            this.f1607a.mo367a(bundle);
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f1607a.mo366a(playbackInfo.getPlaybackType(), C0498c.m1852b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    public static class C0498c {
        /* renamed from: a */
        public static AudioAttributes m1851a(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m1852b(Object obj) {
            return C0498c.m1850a(C0498c.m1851a(obj));
        }

        /* renamed from: a */
        private static int m1850a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return null;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m1853a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    /* renamed from: a */
    public static Object m1854a(C0496a c0496a) {
        return new C0497b(c0496a);
    }

    /* renamed from: a */
    public static boolean m1856a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: a */
    public static void m1855a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
