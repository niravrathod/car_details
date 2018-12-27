package android.support.v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.app.C0328g;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0494a.C3151a;
import android.support.v4.media.session.C0495b.C3153a;
import android.support.v4.media.session.C0499c.C0496a;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class MediaControllerCompat {
    /* renamed from: a */
    private final C0486b f1576a;
    /* renamed from: b */
    private final Token f1577b;
    /* renamed from: c */
    private final HashSet<C0485a> f1578c = new HashSet();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0485a implements DeathRecipient {
        /* renamed from: a */
        C0484a f1568a;
        /* renamed from: b */
        boolean f1569b;
        /* renamed from: c */
        private final Object f1570c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0484a extends Handler {
            /* renamed from: a */
            boolean f1566a;
            /* renamed from: b */
            final /* synthetic */ C0485a f1567b;

            public void handleMessage(Message message) {
                if (this.f1566a) {
                    switch (message.what) {
                        case 1:
                            this.f1567b.m1753a((String) message.obj, message.getData());
                            break;
                        case 2:
                            this.f1567b.m1751a((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            this.f1567b.m1749a((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            this.f1567b.m1750a((C0487f) message.obj);
                            break;
                        case 5:
                            this.f1567b.m1754a((List) message.obj);
                            break;
                        case 6:
                            this.f1567b.m1752a((CharSequence) message.obj);
                            break;
                        case 7:
                            this.f1567b.m1748a((Bundle) message.obj);
                            break;
                        case 8:
                            this.f1567b.m1756b();
                            break;
                        case 9:
                            this.f1567b.m1746a(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            this.f1567b.m1755a(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            this.f1567b.m1757b(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            this.f1567b.m1745a();
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C3148b implements C0496a {
            /* renamed from: a */
            private final WeakReference<C0485a> f13288a;

            C3148b(C0485a c0485a) {
                this.f13288a = new WeakReference(c0485a);
            }

            /* renamed from: a */
            public void mo365a() {
                C0485a c0485a = (C0485a) this.f13288a.get();
                if (c0485a != null) {
                    c0485a.m1756b();
                }
            }

            /* renamed from: a */
            public void mo370a(String str, Bundle bundle) {
                C0485a c0485a = (C0485a) this.f13288a.get();
                if (c0485a == null) {
                    return;
                }
                if (!c0485a.f1569b || VERSION.SDK_INT >= 23) {
                    c0485a.m1753a(str, bundle);
                }
            }

            /* renamed from: a */
            public void mo369a(Object obj) {
                C0485a c0485a = (C0485a) this.f13288a.get();
                if (c0485a == null) {
                    return;
                }
                if (!c0485a.f1569b) {
                    c0485a.m1751a(PlaybackStateCompat.m1779a(obj));
                }
            }

            /* renamed from: b */
            public void mo372b(Object obj) {
                C0485a c0485a = (C0485a) this.f13288a.get();
                if (c0485a != null) {
                    c0485a.m1749a(MediaMetadataCompat.m1705a(obj));
                }
            }

            /* renamed from: a */
            public void mo371a(List<?> list) {
                C0485a c0485a = (C0485a) this.f13288a.get();
                if (c0485a != null) {
                    c0485a.m1754a(QueueItem.m1763a((List) list));
                }
            }

            /* renamed from: a */
            public void mo368a(CharSequence charSequence) {
                C0485a c0485a = (C0485a) this.f13288a.get();
                if (c0485a != null) {
                    c0485a.m1752a(charSequence);
                }
            }

            /* renamed from: a */
            public void mo367a(Bundle bundle) {
                C0485a c0485a = (C0485a) this.f13288a.get();
                if (c0485a != null) {
                    c0485a.m1748a(bundle);
                }
            }

            /* renamed from: a */
            public void mo366a(int i, int i2, int i3, int i4, int i5) {
                C0485a c0485a = (C0485a) this.f13288a.get();
                if (c0485a != null) {
                    c0485a.m1750a(new C0487f(i, i2, i3, i4, i5));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C4438c extends C3151a {
            /* renamed from: a */
            private final WeakReference<C0485a> f18420a;

            /* renamed from: a */
            public void mo382a(boolean z) {
            }

            C4438c(C0485a c0485a) {
                this.f18420a = new WeakReference(c0485a);
            }

            /* renamed from: a */
            public void mo380a(String str, Bundle bundle) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(1, str, bundle);
                }
            }

            /* renamed from: a */
            public void mo373a() {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(8, null, null);
                }
            }

            /* renamed from: a */
            public void mo378a(PlaybackStateCompat playbackStateCompat) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(2, playbackStateCompat, null);
                }
            }

            /* renamed from: a */
            public void mo376a(MediaMetadataCompat mediaMetadataCompat) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(3, mediaMetadataCompat, null);
                }
            }

            /* renamed from: a */
            public void mo381a(List<QueueItem> list) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(5, list, null);
                }
            }

            /* renamed from: a */
            public void mo379a(CharSequence charSequence) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(6, charSequence, null);
                }
            }

            /* renamed from: b */
            public void mo385b(boolean z) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(11, Boolean.valueOf(z), null);
                }
            }

            /* renamed from: a */
            public void mo374a(int i) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(9, Integer.valueOf(i), null);
                }
            }

            /* renamed from: b */
            public void mo384b(int i) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(12, Integer.valueOf(i), null);
                }
            }

            /* renamed from: a */
            public void mo375a(Bundle bundle) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(7, bundle, null);
                }
            }

            /* renamed from: a */
            public void mo377a(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    Object obj;
                    if (parcelableVolumeInfo != null) {
                        C0487f c0487f = new C0487f(parcelableVolumeInfo.f1585a, parcelableVolumeInfo.f1586b, parcelableVolumeInfo.f1587c, parcelableVolumeInfo.f1588d, parcelableVolumeInfo.f1589e);
                    } else {
                        obj = null;
                    }
                    c0485a.m1747a(4, obj, null);
                }
            }

            /* renamed from: b */
            public void mo383b() {
                C0485a c0485a = (C0485a) this.f18420a.get();
                if (c0485a != null) {
                    c0485a.m1747a(13, null, null);
                }
            }
        }

        /* renamed from: a */
        public void m1745a() {
        }

        /* renamed from: a */
        public void m1746a(int i) {
        }

        /* renamed from: a */
        public void m1748a(Bundle bundle) {
        }

        /* renamed from: a */
        public void m1749a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void m1750a(C0487f c0487f) {
        }

        /* renamed from: a */
        public void m1751a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void m1752a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void m1753a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void m1754a(List<QueueItem> list) {
        }

        /* renamed from: a */
        public void m1755a(boolean z) {
        }

        /* renamed from: b */
        public void m1756b() {
        }

        /* renamed from: b */
        public void m1757b(int i) {
        }

        public C0485a() {
            if (VERSION.SDK_INT >= 21) {
                this.f1570c = C0499c.m1854a(new C3148b(this));
            } else {
                this.f1570c = new C4438c(this);
            }
        }

        /* renamed from: a */
        void m1747a(int i, Object obj, Bundle bundle) {
            if (this.f1568a != null) {
                i = this.f1568a.obtainMessage(i, obj);
                i.setData(bundle);
                i.sendToTarget();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0486b {
        /* renamed from: a */
        boolean mo364a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static final class C0487f {
        /* renamed from: a */
        private final int f1571a;
        /* renamed from: b */
        private final int f1572b;
        /* renamed from: c */
        private final int f1573c;
        /* renamed from: d */
        private final int f1574d;
        /* renamed from: e */
        private final int f1575e;

        C0487f(int i, int i2, int i3, int i4, int i5) {
            this.f1571a = i;
            this.f1572b = i2;
            this.f1573c = i3;
            this.f1574d = i4;
            this.f1575e = i5;
        }
    }

    static class MediaControllerImplApi21 implements C0486b {
        /* renamed from: a */
        protected final Object f13284a;
        /* renamed from: b */
        private final List<C0485a> f13285b = new ArrayList();
        /* renamed from: c */
        private C0495b f13286c;
        /* renamed from: d */
        private HashMap<C0485a, C4761a> f13287d = new HashMap();

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f1565a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21, Handler handler) {
                super(handler);
                this.f1565a = new WeakReference(mediaControllerImplApi21);
            }

            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f1565a.get();
                if (mediaControllerImplApi21 != null) {
                    if (bundle != null) {
                        mediaControllerImplApi21.f13286c = C3153a.m15752a(C0328g.m1170a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        mediaControllerImplApi21.m15677b();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C4761a extends C4438c {
            C4761a(C0485a c0485a) {
                super(c0485a);
            }

            /* renamed from: a */
            public void mo373a() {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo376a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo381a(List<QueueItem> list) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo379a(CharSequence charSequence) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo375a(Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo377a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) {
            this.f13284a = C0499c.m1853a(context, token.m1770a());
            if (this.f13284a != null) {
                this.f13286c = token.m1771b();
                if (this.f13286c == null) {
                    m15675a();
                    return;
                }
                return;
            }
            throw new RemoteException();
        }

        /* renamed from: a */
        public boolean mo364a(KeyEvent keyEvent) {
            return C0499c.m1856a(this.f13284a, keyEvent);
        }

        /* renamed from: a */
        public void m15678a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0499c.m1855a(this.f13284a, str, bundle, resultReceiver);
        }

        /* renamed from: a */
        private void m15675a() {
            m15678a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this, new Handler()));
        }

        /* renamed from: b */
        private void m15677b() {
            if (this.f13286c != null) {
                synchronized (this.f13285b) {
                    for (C0485a c0485a : this.f13285b) {
                        C0494a c4761a = new C4761a(c0485a);
                        this.f13287d.put(c0485a, c4761a);
                        c0485a.f1569b = true;
                        try {
                            this.f13286c.mo394a(c4761a);
                            c0485a.m1745a();
                        } catch (Throwable e) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    }
                    this.f13285b.clear();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C3149e implements C0486b {
        /* renamed from: a */
        private C0495b f13289a;

        public C3149e(Token token) {
            this.f13289a = C3153a.m15752a((IBinder) token.m1770a());
        }

        /* renamed from: a */
        public boolean mo364a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f13289a.mo399a(keyEvent);
                } catch (KeyEvent keyEvent2) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", keyEvent2);
                }
                return null;
            }
            throw new IllegalArgumentException("event may not be null.");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C4439c extends MediaControllerImplApi21 {
        public C4439c(Context context, Token token) {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C4762d extends C4439c {
        public C4762d(Context context, Token token) {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, Token token) {
        if (token != null) {
            this.f1577b = token;
            if (VERSION.SDK_INT >= 24) {
                this.f1576a = new C4762d(context, token);
                return;
            } else if (VERSION.SDK_INT >= 23) {
                this.f1576a = new C4439c(context, token);
                return;
            } else if (VERSION.SDK_INT >= 21) {
                this.f1576a = new MediaControllerImplApi21(context, token);
                return;
            } else {
                this.f1576a = new C3149e(this.f1577b);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* renamed from: a */
    public boolean m1759a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f1576a.mo364a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
