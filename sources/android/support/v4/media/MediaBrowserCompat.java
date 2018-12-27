package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.C0328g;
import android.support.v4.media.C0478a.C0473a;
import android.support.v4.media.C0478a.C0475c;
import android.support.v4.media.C0478a.C0476d;
import android.support.v4.media.C0479b.C3143a;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.support.v4.p017f.C3131a;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MediaBrowserCompat {
    /* renamed from: a */
    static final boolean f1479a = Log.isLoggable("MediaBrowserCompat", 3);
    /* renamed from: b */
    private final C0442e f1480b;

    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new C04361();
        /* renamed from: a */
        private final int f1458a;
        /* renamed from: b */
        private final MediaDescriptionCompat f1459b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$1 */
        static class C04361 implements Creator<MediaItem> {
            C04361() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1608a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1609a(i);
            }

            /* renamed from: a */
            public MediaItem m1608a(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: a */
            public MediaItem[] m1609a(int i) {
                return new MediaItem[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public static MediaItem m1610a(Object obj) {
            if (obj != null) {
                if (VERSION.SDK_INT >= 21) {
                    return new MediaItem(MediaDescriptionCompat.m1700a(C0475c.m1712b(obj)), C0475c.m1711a(obj));
                }
            }
            return null;
        }

        /* renamed from: a */
        public static List<MediaItem> m1611a(List<?> list) {
            if (list != null) {
                if (VERSION.SDK_INT >= 21) {
                    List<MediaItem> arrayList = new ArrayList(list.size());
                    for (Object a : list) {
                        arrayList.add(m1610a(a));
                    }
                    return arrayList;
                }
            }
            return null;
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (TextUtils.isEmpty(mediaDescriptionCompat.m1701a())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            } else {
                this.f1458a = i;
                this.f1459b = mediaDescriptionCompat;
            }
        }

        MediaItem(Parcel parcel) {
            this.f1458a = parcel.readInt();
            this.f1459b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1458a);
            this.f1459b.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaItem{");
            stringBuilder.append("mFlags=");
            stringBuilder.append(this.f1458a);
            stringBuilder.append(", mDescription=");
            stringBuilder.append(this.f1459b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0437a extends Handler {
        /* renamed from: a */
        private final WeakReference<C0448j> f1460a;
        /* renamed from: b */
        private WeakReference<Messenger> f1461b;

        C0437a(C0448j c0448j) {
            this.f1460a = new WeakReference(c0448j);
        }

        public void handleMessage(android.os.Message r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r7 = this;
            r0 = r7.f1461b;
            if (r0 == 0) goto L_0x00a5;
        L_0x0004:
            r0 = r7.f1461b;
            r0 = r0.get();
            if (r0 == 0) goto L_0x00a5;
        L_0x000c:
            r0 = r7.f1460a;
            r0 = r0.get();
            if (r0 != 0) goto L_0x0016;
        L_0x0014:
            goto L_0x00a5;
        L_0x0016:
            r0 = r8.getData();
            r1 = android.support.v4.media.session.MediaSessionCompat.class;
            r1 = r1.getClassLoader();
            r0.setClassLoader(r1);
            r1 = r7.f1460a;
            r1 = r1.get();
            r1 = (android.support.v4.media.MediaBrowserCompat.C0448j) r1;
            r2 = r7.f1461b;
            r2 = r2.get();
            r2 = (android.os.Messenger) r2;
            r3 = 1;
            r4 = r8.what;	 Catch:{ BadParcelableException -> 0x0095 }
            switch(r4) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0052;
                case 3: goto L_0x003c;
                default: goto L_0x0039;
            };	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x0039:
            r0 = "MediaBrowserCompat";	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x006e;	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x003c:
            r4 = "data_media_item_id";	 Catch:{ BadParcelableException -> 0x0095 }
            r4 = r0.getString(r4);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "data_media_item_list";	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = r0.getParcelableArrayList(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r6 = "data_options";	 Catch:{ BadParcelableException -> 0x0095 }
            r0 = r0.getBundle(r6);	 Catch:{ BadParcelableException -> 0x0095 }
            r1.mo347a(r2, r4, r5, r0);	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x00a4;	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x0052:
            r1.mo345a(r2);	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x00a4;	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x0056:
            r4 = "data_media_item_id";	 Catch:{ BadParcelableException -> 0x0095 }
            r4 = r0.getString(r4);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "data_media_session_token";	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = r0.getParcelable(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = (android.support.v4.media.session.MediaSessionCompat.Token) r5;	 Catch:{ BadParcelableException -> 0x0095 }
            r6 = "data_root_hints";	 Catch:{ BadParcelableException -> 0x0095 }
            r0 = r0.getBundle(r6);	 Catch:{ BadParcelableException -> 0x0095 }
            r1.mo346a(r2, r4, r5, r0);	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x00a4;	 Catch:{ BadParcelableException -> 0x0095 }
        L_0x006e:
            r4 = new java.lang.StringBuilder;	 Catch:{ BadParcelableException -> 0x0095 }
            r4.<init>();	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "Unhandled message: ";	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r8);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "\n  Client version: ";	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r3);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = "\n  Service version: ";	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r5 = r8.arg1;	 Catch:{ BadParcelableException -> 0x0095 }
            r4.append(r5);	 Catch:{ BadParcelableException -> 0x0095 }
            r4 = r4.toString();	 Catch:{ BadParcelableException -> 0x0095 }
            android.util.Log.w(r0, r4);	 Catch:{ BadParcelableException -> 0x0095 }
            goto L_0x00a4;
            r0 = "MediaBrowserCompat";
            r4 = "Could not unparcel the data.";
            android.util.Log.e(r0, r4);
            r8 = r8.what;
            if (r8 != r3) goto L_0x00a4;
        L_0x00a1:
            r1.mo345a(r2);
        L_0x00a4:
            return;
        L_0x00a5:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.a.handleMessage(android.os.Message):void");
        }

        /* renamed from: a */
        void m1612a(Messenger messenger) {
            this.f1461b = new WeakReference(messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0439b {
        /* renamed from: a */
        final Object f1462a;
        /* renamed from: b */
        C0438a f1463b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface C0438a {
            /* renamed from: a */
            void mo344a();

            /* renamed from: b */
            void mo348b();

            /* renamed from: c */
            void mo349c();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        private class C3134b implements C0473a {
            /* renamed from: a */
            final /* synthetic */ C0439b f13245a;

            C3134b(C0439b c0439b) {
                this.f13245a = c0439b;
            }

            /* renamed from: a */
            public void mo341a() {
                if (this.f13245a.f1463b != null) {
                    this.f13245a.f1463b.mo344a();
                }
                this.f13245a.mo361a();
            }

            /* renamed from: b */
            public void mo342b() {
                if (this.f13245a.f1463b != null) {
                    this.f13245a.f1463b.mo348b();
                }
                this.f13245a.mo362b();
            }

            /* renamed from: c */
            public void mo343c() {
                if (this.f13245a.f1463b != null) {
                    this.f13245a.f1463b.mo349c();
                }
                this.f13245a.mo363c();
            }
        }

        /* renamed from: a */
        public void mo361a() {
        }

        /* renamed from: b */
        public void mo362b() {
        }

        /* renamed from: c */
        public void mo363c() {
        }

        public C0439b() {
            if (VERSION.SDK_INT >= 21) {
                this.f1462a = C0478a.m1716a(new C3134b(this));
            } else {
                this.f1462a = null;
            }
        }

        /* renamed from: a */
        void m1617a(C0438a c0438a) {
            this.f1463b = c0438a;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0440c {
        /* renamed from: a */
        public void m1620a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void m1621b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void m1622c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class C0441d {
        /* renamed from: a */
        public void m1623a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void m1624a(String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    interface C0442e {
        /* renamed from: d */
        void mo350d();

        /* renamed from: e */
        void mo351e();

        /* renamed from: f */
        Token mo352f();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    interface C0448j {
        /* renamed from: a */
        void mo345a(Messenger messenger);

        /* renamed from: a */
        void mo346a(Messenger messenger, String str, Token token, Bundle bundle);

        /* renamed from: a */
        void mo347a(Messenger messenger, String str, List list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0449k {
        /* renamed from: a */
        public void m1633a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void m1634a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    private static class C0450l {
        /* renamed from: a */
        private Messenger f1472a;
        /* renamed from: b */
        private Bundle f1473b;

        public C0450l(IBinder iBinder, Bundle bundle) {
            this.f1472a = new Messenger(iBinder);
            this.f1473b = bundle;
        }

        /* renamed from: a */
        void m1636a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f1473b);
            m1635a(1, bundle, messenger);
        }

        /* renamed from: a */
        void m1637a(Messenger messenger) {
            m1635a(2, null, messenger);
        }

        /* renamed from: a */
        void m1638a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0328g.m1171a(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m1635a(3, bundle2, messenger);
        }

        /* renamed from: b */
        void m1639b(Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putBundle("data_root_hints", this.f1473b);
            m1635a(6, bundle, messenger);
        }

        /* renamed from: c */
        void m1640c(Messenger messenger) {
            m1635a(7, null, messenger);
        }

        /* renamed from: a */
        private void m1635a(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f1472a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    private static class C0451m {
        /* renamed from: a */
        private final List<C0452n> f1474a = new ArrayList();
        /* renamed from: b */
        private final List<Bundle> f1475b = new ArrayList();

        /* renamed from: a */
        public List<Bundle> m1642a() {
            return this.f1475b;
        }

        /* renamed from: b */
        public List<C0452n> m1643b() {
            return this.f1474a;
        }

        /* renamed from: a */
        public C0452n m1641a(Context context, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            for (context = null; context < this.f1475b.size(); context++) {
                if (C0480c.m1723a((Bundle) this.f1475b.get(context), bundle)) {
                    return (C0452n) this.f1474a.get(context);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class C0452n {
        /* renamed from: a */
        WeakReference<C0451m> f1476a;
        /* renamed from: b */
        private final Object f1477b;
        /* renamed from: c */
        private final IBinder f1478c = new Binder();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        private class C3137a implements C0476d {
            /* renamed from: a */
            final /* synthetic */ C0452n f13268a;

            C3137a(C0452n c0452n) {
                this.f13268a = c0452n;
            }

            /* renamed from: a */
            public void mo354a(String str, List<?> list) {
                C0451m c0451m = this.f13268a.f1476a == null ? null : (C0451m) this.f13268a.f1476a.get();
                if (c0451m == null) {
                    this.f13268a.m1647a(str, MediaItem.m1611a((List) list));
                    return;
                }
                List a = MediaItem.m1611a((List) list);
                List b = c0451m.m1643b();
                List a2 = c0451m.m1642a();
                for (int i = 0; i < b.size(); i++) {
                    Bundle bundle = (Bundle) a2.get(i);
                    if (bundle == null) {
                        this.f13268a.m1647a(str, a);
                    } else {
                        this.f13268a.m1648a(str, m15648a(a, bundle), bundle);
                    }
                }
            }

            /* renamed from: a */
            public void mo353a(String str) {
                this.f13268a.m1645a(str);
            }

            /* renamed from: a */
            List<MediaItem> m15648a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                bundle = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && bundle == -1) {
                    return list;
                }
                int i2 = bundle * i;
                int i3 = i2 + bundle;
                if (i >= 0 && bundle >= 1) {
                    if (i2 < list.size()) {
                        if (i3 > list.size()) {
                            i3 = list.size();
                        }
                        return list.subList(i2, i3);
                    }
                }
                return Collections.EMPTY_LIST;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        private class C4437b extends C3137a implements C3143a {
            /* renamed from: b */
            final /* synthetic */ C0452n f18419b;

            C4437b(C0452n c0452n) {
                this.f18419b = c0452n;
                super(c0452n);
            }

            /* renamed from: a */
            public void mo3766a(String str, List<?> list, Bundle bundle) {
                this.f18419b.m1648a(str, MediaItem.m1611a((List) list), bundle);
            }

            /* renamed from: a */
            public void mo3765a(String str, Bundle bundle) {
                this.f18419b.m1646a(str, bundle);
            }
        }

        /* renamed from: a */
        public void m1645a(String str) {
        }

        /* renamed from: a */
        public void m1646a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void m1647a(String str, List<MediaItem> list) {
        }

        /* renamed from: a */
        public void m1648a(String str, List<MediaItem> list, Bundle bundle) {
        }

        public C0452n() {
            if (VERSION.SDK_INT >= 26) {
                this.f1477b = C0479b.m1722a(new C4437b(this));
            } else if (VERSION.SDK_INT >= 21) {
                this.f1477b = C0478a.m1717a(new C3137a(this));
            } else {
                this.f1477b = null;
            }
        }
    }

    private static class CustomActionResultReceiver extends ResultReceiver {
        /* renamed from: d */
        private final String f13237d;
        /* renamed from: e */
        private final Bundle f13238e;
        /* renamed from: f */
        private final C0440c f13239f;

        /* renamed from: a */
        protected void mo340a(int i, Bundle bundle) {
            if (this.f13239f != null) {
                switch (i) {
                    case -1:
                        this.f13239f.m1622c(this.f13237d, this.f13238e, bundle);
                        break;
                    case 0:
                        this.f13239f.m1621b(this.f13237d, this.f13238e, bundle);
                        break;
                    case 1:
                        this.f13239f.m1620a(this.f13237d, this.f13238e, bundle);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown result code: ");
                        stringBuilder.append(i);
                        stringBuilder.append(" (extras=");
                        stringBuilder.append(this.f13238e);
                        stringBuilder.append(", resultData=");
                        stringBuilder.append(bundle);
                        stringBuilder.append(")");
                        Log.w("MediaBrowserCompat", stringBuilder.toString());
                        break;
                }
            }
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        /* renamed from: d */
        private final String f13240d;
        /* renamed from: e */
        private final C0441d f13241e;

        /* renamed from: a */
        protected void mo340a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null) {
                if (bundle.containsKey("media_item") != 0) {
                    i = bundle.getParcelable("media_item");
                    if (i != 0) {
                        if ((i instanceof MediaItem) == null) {
                            this.f13241e.m1624a(this.f13240d);
                            return;
                        }
                    }
                    this.f13241e.m1623a((MediaItem) i);
                    return;
                }
            }
            this.f13241e.m1624a(this.f13240d);
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        /* renamed from: d */
        private final String f13242d;
        /* renamed from: e */
        private final Bundle f13243e;
        /* renamed from: f */
        private final C0449k f13244f;

        /* renamed from: a */
        protected void mo340a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null) {
                if (bundle.containsKey("search_results") != 0) {
                    i = bundle.getParcelableArray("search_results");
                    bundle = null;
                    if (i != 0) {
                        bundle = new ArrayList();
                        for (Object obj : i) {
                            bundle.add((MediaItem) obj);
                        }
                    }
                    this.f13244f.m1634a(this.f13242d, this.f13243e, bundle);
                    return;
                }
            }
            this.f13244f.m1633a(this.f13242d, this.f13243e);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C3135f implements C0438a, C0442e, C0448j {
        /* renamed from: a */
        final Context f13246a;
        /* renamed from: b */
        protected final Object f13247b;
        /* renamed from: c */
        protected final Bundle f13248c;
        /* renamed from: d */
        protected final C0437a f13249d = new C0437a(this);
        /* renamed from: e */
        protected int f13250e;
        /* renamed from: f */
        protected C0450l f13251f;
        /* renamed from: g */
        protected Messenger f13252g;
        /* renamed from: h */
        private final C3131a<String, C0451m> f13253h = new C3131a();
        /* renamed from: i */
        private Token f13254i;

        /* renamed from: a */
        public void mo345a(Messenger messenger) {
        }

        /* renamed from: a */
        public void mo346a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo349c() {
        }

        C3135f(Context context, ComponentName componentName, C0439b c0439b, Bundle bundle) {
            this.f13246a = context;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_client_version", 1);
            this.f13248c = new Bundle(bundle);
            c0439b.m1617a(this);
            this.f13247b = C0478a.m1715a(context, componentName, c0439b.f1462a, this.f13248c);
        }

        /* renamed from: d */
        public void mo350d() {
            C0478a.m1718a(this.f13247b);
        }

        /* renamed from: e */
        public void mo351e() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f13251f;
            if (r0 == 0) goto L_0x0017;
        L_0x0004:
            r0 = r2.f13252g;
            if (r0 == 0) goto L_0x0017;
        L_0x0008:
            r0 = r2.f13251f;	 Catch:{ RemoteException -> 0x0010 }
            r1 = r2.f13252g;	 Catch:{ RemoteException -> 0x0010 }
            r0.m1640c(r1);	 Catch:{ RemoteException -> 0x0010 }
            goto L_0x0017;
        L_0x0010:
            r0 = "MediaBrowserCompat";
            r1 = "Remote error unregistering client messenger.";
            android.util.Log.i(r0, r1);
        L_0x0017:
            r0 = r2.f13247b;
            android.support.v4.media.C0478a.m1719b(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.f.e():void");
        }

        /* renamed from: f */
        public Token mo352f() {
            if (this.f13254i == null) {
                this.f13254i = Token.m1768a(C0478a.m1721d(this.f13247b));
            }
            return this.f13254i;
        }

        /* renamed from: a */
        public void mo344a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.f13247b;
            r0 = android.support.v4.media.C0478a.m1720c(r0);
            if (r0 != 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r1 = "extra_service_version";
            r2 = 0;
            r1 = r0.getInt(r1, r2);
            r4.f13250e = r1;
            r1 = "extra_messenger";
            r1 = android.support.v4.app.C0328g.m1170a(r0, r1);
            if (r1 == 0) goto L_0x0042;
        L_0x001a:
            r2 = new android.support.v4.media.MediaBrowserCompat$l;
            r3 = r4.f13248c;
            r2.<init>(r1, r3);
            r4.f13251f = r2;
            r1 = new android.os.Messenger;
            r2 = r4.f13249d;
            r1.<init>(r2);
            r4.f13252g = r1;
            r1 = r4.f13249d;
            r2 = r4.f13252g;
            r1.m1612a(r2);
            r1 = r4.f13251f;	 Catch:{ RemoteException -> 0x003b }
            r2 = r4.f13252g;	 Catch:{ RemoteException -> 0x003b }
            r1.m1639b(r2);	 Catch:{ RemoteException -> 0x003b }
            goto L_0x0042;
        L_0x003b:
            r1 = "MediaBrowserCompat";
            r2 = "Remote error registering client messenger.";
            android.util.Log.i(r1, r2);
        L_0x0042:
            r1 = "extra_session_binder";
            r0 = android.support.v4.app.C0328g.m1170a(r0, r1);
            r0 = android.support.v4.media.session.C0495b.C3153a.m15752a(r0);
            if (r0 == 0) goto L_0x005a;
        L_0x004e:
            r1 = r4.f13247b;
            r1 = android.support.v4.media.C0478a.m1721d(r1);
            r0 = android.support.v4.media.session.MediaSessionCompat.Token.m1769a(r1, r0);
            r4.f13254i = r0;
        L_0x005a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.f.a():void");
        }

        /* renamed from: b */
        public void mo348b() {
            this.f13251f = null;
            this.f13252g = null;
            this.f13254i = null;
            this.f13249d.m1612a(null);
        }

        /* renamed from: a */
        public void mo347a(Messenger messenger, String str, List list, Bundle bundle) {
            if (this.f13252g == messenger) {
                C0451m c0451m = (C0451m) this.f13253h.get(str);
                if (c0451m == null) {
                    if (MediaBrowserCompat.f1479a != null) {
                        list = new StringBuilder();
                        list.append("onLoadChildren for id that isn't subscribed id=");
                        list.append(str);
                        Log.d("MediaBrowserCompat", list.toString());
                    }
                    return;
                }
                messenger = c0451m.m1641a(this.f13246a, bundle);
                if (messenger != null) {
                    if (bundle == null) {
                        if (list == null) {
                            messenger.m1645a(str);
                        } else {
                            messenger.m1647a(str, list);
                        }
                    } else if (list == null) {
                        messenger.m1646a(str, bundle);
                    } else {
                        messenger.m1648a(str, list, bundle);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    static class C3136i implements C0442e, C0448j {
        /* renamed from: a */
        final Context f13255a;
        /* renamed from: b */
        final ComponentName f13256b;
        /* renamed from: c */
        final C0439b f13257c;
        /* renamed from: d */
        final Bundle f13258d;
        /* renamed from: e */
        final C0437a f13259e = new C0437a(this);
        /* renamed from: f */
        int f13260f = 1;
        /* renamed from: g */
        C0447a f13261g;
        /* renamed from: h */
        C0450l f13262h;
        /* renamed from: i */
        Messenger f13263i;
        /* renamed from: j */
        private final C3131a<String, C0451m> f13264j = new C3131a();
        /* renamed from: k */
        private String f13265k;
        /* renamed from: l */
        private Token f13266l;
        /* renamed from: m */
        private Bundle f13267m;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$1 */
        class C04431 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C3136i f1464a;

            C04431(C3136i c3136i) {
                this.f1464a = c3136i;
            }

            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
                /*
                r5 = this;
                r0 = r5.f1464a;
                r0 = r0.f13260f;
                if (r0 != 0) goto L_0x0007;
            L_0x0006:
                return;
            L_0x0007:
                r0 = r5.f1464a;
                r1 = 2;
                r0.f13260f = r1;
                r0 = android.support.v4.media.MediaBrowserCompat.f1479a;
                if (r0 == 0) goto L_0x0032;
            L_0x0010:
                r0 = r5.f1464a;
                r0 = r0.f13261g;
                if (r0 != 0) goto L_0x0017;
            L_0x0016:
                goto L_0x0032;
            L_0x0017:
                r0 = new java.lang.RuntimeException;
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "mServiceConnection should be null. Instead it is ";
                r1.append(r2);
                r2 = r5.f1464a;
                r2 = r2.f13261g;
                r1.append(r2);
                r1 = r1.toString();
                r0.<init>(r1);
                throw r0;
            L_0x0032:
                r0 = r5.f1464a;
                r0 = r0.f13262h;
                if (r0 != 0) goto L_0x00bb;
            L_0x0038:
                r0 = r5.f1464a;
                r0 = r0.f13263i;
                if (r0 != 0) goto L_0x00a0;
            L_0x003e:
                r0 = new android.content.Intent;
                r1 = "android.media.browse.MediaBrowserService";
                r0.<init>(r1);
                r1 = r5.f1464a;
                r1 = r1.f13256b;
                r0.setComponent(r1);
                r1 = r5.f1464a;
                r2 = new android.support.v4.media.MediaBrowserCompat$i$a;
                r3 = r5.f1464a;
                r2.<init>(r3);
                r1.f13261g = r2;
                r1 = 0;
                r2 = r5.f1464a;	 Catch:{ Exception -> 0x0066 }
                r2 = r2.f13255a;	 Catch:{ Exception -> 0x0066 }
                r3 = r5.f1464a;	 Catch:{ Exception -> 0x0066 }
                r3 = r3.f13261g;	 Catch:{ Exception -> 0x0066 }
                r4 = 1;	 Catch:{ Exception -> 0x0066 }
                r0 = r2.bindService(r0, r3, r4);	 Catch:{ Exception -> 0x0066 }
                goto L_0x0081;
            L_0x0066:
                r0 = "MediaBrowserCompat";
                r2 = new java.lang.StringBuilder;
                r2.<init>();
                r3 = "Failed binding to service ";
                r2.append(r3);
                r3 = r5.f1464a;
                r3 = r3.f13256b;
                r2.append(r3);
                r2 = r2.toString();
                android.util.Log.e(r0, r2);
                r0 = 0;
            L_0x0081:
                if (r0 != 0) goto L_0x008f;
            L_0x0083:
                r0 = r5.f1464a;
                r0.m15639a();
                r0 = r5.f1464a;
                r0 = r0.f13257c;
                r0.mo363c();
            L_0x008f:
                r0 = android.support.v4.media.MediaBrowserCompat.f1479a;
                if (r0 == 0) goto L_0x009f;
            L_0x0093:
                r0 = "MediaBrowserCompat";
                r1 = "connect...";
                android.util.Log.d(r0, r1);
                r0 = r5.f1464a;
                r0.m15644c();
            L_0x009f:
                return;
            L_0x00a0:
                r0 = new java.lang.RuntimeException;
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "mCallbacksMessenger should be null. Instead it is ";
                r1.append(r2);
                r2 = r5.f1464a;
                r2 = r2.f13263i;
                r1.append(r2);
                r1 = r1.toString();
                r0.<init>(r1);
                throw r0;
            L_0x00bb:
                r0 = new java.lang.RuntimeException;
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "mServiceBinderWrapper should be null. Instead it is ";
                r1.append(r2);
                r2 = r5.f1464a;
                r2 = r2.f13262h;
                r1.append(r2);
                r1 = r1.toString();
                r0.<init>(r1);
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.1.run():void");
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$2 */
        class C04442 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C3136i f1465a;

            C04442(C3136i c3136i) {
                this.f1465a = c3136i;
            }

            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
                /*
                r3 = this;
                r0 = r3.f1465a;
                r0 = r0.f13263i;
                if (r0 == 0) goto L_0x002c;
            L_0x0006:
                r0 = r3.f1465a;	 Catch:{ RemoteException -> 0x0012 }
                r0 = r0.f13262h;	 Catch:{ RemoteException -> 0x0012 }
                r1 = r3.f1465a;	 Catch:{ RemoteException -> 0x0012 }
                r1 = r1.f13263i;	 Catch:{ RemoteException -> 0x0012 }
                r0.m1637a(r1);	 Catch:{ RemoteException -> 0x0012 }
                goto L_0x002c;
            L_0x0012:
                r0 = "MediaBrowserCompat";
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = "RemoteException during connect for ";
                r1.append(r2);
                r2 = r3.f1465a;
                r2 = r2.f13256b;
                r1.append(r2);
                r1 = r1.toString();
                android.util.Log.w(r0, r1);
            L_0x002c:
                r0 = r3.f1465a;
                r0 = r0.f13260f;
                r1 = r3.f1465a;
                r1.m15639a();
                if (r0 == 0) goto L_0x003b;
            L_0x0037:
                r1 = r3.f1465a;
                r1.f13260f = r0;
            L_0x003b:
                r0 = android.support.v4.media.MediaBrowserCompat.f1479a;
                if (r0 == 0) goto L_0x004b;
            L_0x003f:
                r0 = "MediaBrowserCompat";
                r1 = "disconnect...";
                android.util.Log.d(r0, r1);
                r0 = r3.f1465a;
                r0.m15644c();
            L_0x004b:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.2.run():void");
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        private class C0447a implements ServiceConnection {
            /* renamed from: a */
            final /* synthetic */ C3136i f1471a;

            C0447a(C3136i c3136i) {
                this.f1471a = c3136i;
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m1628a(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0447a f1468c;

                    public void run() {
                        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
                        /*
                        r4 = this;
                        r0 = android.support.v4.media.MediaBrowserCompat.f1479a;
                        if (r0 == 0) goto L_0x002d;
                    L_0x0004:
                        r0 = "MediaBrowserCompat";
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r2 = "MediaServiceConnection.onServiceConnected name=";
                        r1.append(r2);
                        r2 = r2;
                        r1.append(r2);
                        r2 = " binder=";
                        r1.append(r2);
                        r2 = r3;
                        r1.append(r2);
                        r1 = r1.toString();
                        android.util.Log.d(r0, r1);
                        r0 = r4.f1468c;
                        r0 = r0.f1471a;
                        r0.m15644c();
                    L_0x002d:
                        r0 = r4.f1468c;
                        r1 = "onServiceConnected";
                        r0 = r0.m1629a(r1);
                        if (r0 != 0) goto L_0x0038;
                    L_0x0037:
                        return;
                    L_0x0038:
                        r0 = r4.f1468c;
                        r0 = r0.f1471a;
                        r1 = new android.support.v4.media.MediaBrowserCompat$l;
                        r2 = r3;
                        r3 = r4.f1468c;
                        r3 = r3.f1471a;
                        r3 = r3.f13258d;
                        r1.<init>(r2, r3);
                        r0.f13262h = r1;
                        r0 = r4.f1468c;
                        r0 = r0.f1471a;
                        r1 = new android.os.Messenger;
                        r2 = r4.f1468c;
                        r2 = r2.f1471a;
                        r2 = r2.f13259e;
                        r1.<init>(r2);
                        r0.f13263i = r1;
                        r0 = r4.f1468c;
                        r0 = r0.f1471a;
                        r0 = r0.f13259e;
                        r1 = r4.f1468c;
                        r1 = r1.f1471a;
                        r1 = r1.f13263i;
                        r0.m1612a(r1);
                        r0 = r4.f1468c;
                        r0 = r0.f1471a;
                        r1 = 2;
                        r0.f13260f = r1;
                        r0 = android.support.v4.media.MediaBrowserCompat.f1479a;	 Catch:{ RemoteException -> 0x009a }
                        if (r0 == 0) goto L_0x0084;	 Catch:{ RemoteException -> 0x009a }
                    L_0x0076:
                        r0 = "MediaBrowserCompat";	 Catch:{ RemoteException -> 0x009a }
                        r1 = "ServiceCallbacks.onConnect...";	 Catch:{ RemoteException -> 0x009a }
                        android.util.Log.d(r0, r1);	 Catch:{ RemoteException -> 0x009a }
                        r0 = r4.f1468c;	 Catch:{ RemoteException -> 0x009a }
                        r0 = r0.f1471a;	 Catch:{ RemoteException -> 0x009a }
                        r0.m15644c();	 Catch:{ RemoteException -> 0x009a }
                    L_0x0084:
                        r0 = r4.f1468c;	 Catch:{ RemoteException -> 0x009a }
                        r0 = r0.f1471a;	 Catch:{ RemoteException -> 0x009a }
                        r0 = r0.f13262h;	 Catch:{ RemoteException -> 0x009a }
                        r1 = r4.f1468c;	 Catch:{ RemoteException -> 0x009a }
                        r1 = r1.f1471a;	 Catch:{ RemoteException -> 0x009a }
                        r1 = r1.f13255a;	 Catch:{ RemoteException -> 0x009a }
                        r2 = r4.f1468c;	 Catch:{ RemoteException -> 0x009a }
                        r2 = r2.f1471a;	 Catch:{ RemoteException -> 0x009a }
                        r2 = r2.f13263i;	 Catch:{ RemoteException -> 0x009a }
                        r0.m1636a(r1, r2);	 Catch:{ RemoteException -> 0x009a }
                        goto L_0x00c9;
                        r0 = "MediaBrowserCompat";
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r2 = "RemoteException during connect for ";
                        r1.append(r2);
                        r2 = r4.f1468c;
                        r2 = r2.f1471a;
                        r2 = r2.f13256b;
                        r1.append(r2);
                        r1 = r1.toString();
                        android.util.Log.w(r0, r1);
                        r0 = android.support.v4.media.MediaBrowserCompat.f1479a;
                        if (r0 == 0) goto L_0x00c9;
                    L_0x00bb:
                        r0 = "MediaBrowserCompat";
                        r1 = "ServiceCallbacks.onConnect...";
                        android.util.Log.d(r0, r1);
                        r0 = r4.f1468c;
                        r0 = r0.f1471a;
                        r0.m15644c();
                    L_0x00c9:
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.a.1.run():void");
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                m1628a(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0447a f1470b;

                    public void run() {
                        if (MediaBrowserCompat.f1479a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("MediaServiceConnection.onServiceDisconnected name=");
                            stringBuilder.append(componentName);
                            stringBuilder.append(" this=");
                            stringBuilder.append(this);
                            stringBuilder.append(" mServiceConnection=");
                            stringBuilder.append(this.f1470b.f1471a.f13261g);
                            Log.d("MediaBrowserCompat", stringBuilder.toString());
                            this.f1470b.f1471a.m15644c();
                        }
                        if (this.f1470b.m1629a("onServiceDisconnected")) {
                            this.f1470b.f1471a.f13262h = null;
                            this.f1470b.f1471a.f13263i = null;
                            this.f1470b.f1471a.f13259e.m1612a(null);
                            this.f1470b.f1471a.f13260f = 4;
                            this.f1470b.f1471a.f13257c.mo362b();
                        }
                    }
                });
            }

            /* renamed from: a */
            private void m1628a(Runnable runnable) {
                if (Thread.currentThread() == this.f1471a.f13259e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f1471a.f13259e.post(runnable);
                }
            }

            /* renamed from: a */
            boolean m1629a(String str) {
                if (this.f1471a.f13261g == this && this.f1471a.f13260f != 0) {
                    if (this.f1471a.f13260f != 1) {
                        return true;
                    }
                }
                if (!(this.f1471a.f13260f == 0 || this.f1471a.f13260f == 1)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(" for ");
                    stringBuilder.append(this.f1471a.f13256b);
                    stringBuilder.append(" with mServiceConnection=");
                    stringBuilder.append(this.f1471a.f13261g);
                    stringBuilder.append(" this=");
                    stringBuilder.append(this);
                    Log.i("MediaBrowserCompat", stringBuilder.toString());
                }
                return null;
            }
        }

        public C3136i(Context context, ComponentName componentName, C0439b c0439b, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (c0439b != null) {
                this.f13255a = context;
                this.f13256b = componentName;
                this.f13257c = c0439b;
                if (bundle == null) {
                    context = null;
                } else {
                    context = new Bundle(bundle);
                }
                this.f13258d = context;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: d */
        public void mo350d() {
            if (this.f13260f != 0) {
                if (this.f13260f != 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
                    stringBuilder.append(C3136i.m15637a(this.f13260f));
                    stringBuilder.append(")");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            this.f13260f = 2;
            this.f13259e.post(new C04431(this));
        }

        /* renamed from: e */
        public void mo351e() {
            this.f13260f = 0;
            this.f13259e.post(new C04442(this));
        }

        /* renamed from: a */
        void m15639a() {
            if (this.f13261g != null) {
                this.f13255a.unbindService(this.f13261g);
            }
            this.f13260f = 1;
            this.f13261g = null;
            this.f13262h = null;
            this.f13263i = null;
            this.f13259e.m1612a(null);
            this.f13265k = null;
            this.f13266l = null;
        }

        /* renamed from: b */
        public boolean m15643b() {
            return this.f13260f == 3;
        }

        /* renamed from: f */
        public Token mo352f() {
            if (m15643b()) {
                return this.f13266l;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getSessionToken() called while not connected(state=");
            stringBuilder.append(this.f13260f);
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public void mo346a(android.os.Messenger r6, java.lang.String r7, android.support.v4.media.session.MediaSessionCompat.Token r8, android.os.Bundle r9) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = "onConnect";
            r6 = r5.m15638a(r6, r0);
            if (r6 != 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r6 = r5.f13260f;
            r0 = 2;
            if (r6 == r0) goto L_0x0030;
        L_0x000e:
            r6 = "MediaBrowserCompat";
            r7 = new java.lang.StringBuilder;
            r7.<init>();
            r8 = "onConnect from service while mState=";
            r7.append(r8);
            r8 = r5.f13260f;
            r8 = android.support.v4.media.MediaBrowserCompat.C3136i.m15637a(r8);
            r7.append(r8);
            r8 = "... ignoring";
            r7.append(r8);
            r7 = r7.toString();
            android.util.Log.w(r6, r7);
            return;
        L_0x0030:
            r5.f13265k = r7;
            r5.f13266l = r8;
            r5.f13267m = r9;
            r6 = 3;
            r5.f13260f = r6;
            r6 = android.support.v4.media.MediaBrowserCompat.f1479a;
            if (r6 == 0) goto L_0x0047;
        L_0x003d:
            r6 = "MediaBrowserCompat";
            r7 = "ServiceCallbacks.onConnect...";
            android.util.Log.d(r6, r7);
            r5.m15644c();
        L_0x0047:
            r6 = r5.f13257c;
            r6.mo361a();
            r6 = r5.f13264j;	 Catch:{ RemoteException -> 0x0097 }
            r6 = r6.entrySet();	 Catch:{ RemoteException -> 0x0097 }
            r6 = r6.iterator();	 Catch:{ RemoteException -> 0x0097 }
        L_0x0056:
            r7 = r6.hasNext();	 Catch:{ RemoteException -> 0x0097 }
            if (r7 == 0) goto L_0x009e;	 Catch:{ RemoteException -> 0x0097 }
        L_0x005c:
            r7 = r6.next();	 Catch:{ RemoteException -> 0x0097 }
            r7 = (java.util.Map.Entry) r7;	 Catch:{ RemoteException -> 0x0097 }
            r8 = r7.getKey();	 Catch:{ RemoteException -> 0x0097 }
            r8 = (java.lang.String) r8;	 Catch:{ RemoteException -> 0x0097 }
            r7 = r7.getValue();	 Catch:{ RemoteException -> 0x0097 }
            r7 = (android.support.v4.media.MediaBrowserCompat.C0451m) r7;	 Catch:{ RemoteException -> 0x0097 }
            r9 = r7.m1643b();	 Catch:{ RemoteException -> 0x0097 }
            r7 = r7.m1642a();	 Catch:{ RemoteException -> 0x0097 }
            r0 = 0;	 Catch:{ RemoteException -> 0x0097 }
        L_0x0077:
            r1 = r9.size();	 Catch:{ RemoteException -> 0x0097 }
            if (r0 >= r1) goto L_0x0056;	 Catch:{ RemoteException -> 0x0097 }
        L_0x007d:
            r1 = r5.f13262h;	 Catch:{ RemoteException -> 0x0097 }
            r2 = r9.get(r0);	 Catch:{ RemoteException -> 0x0097 }
            r2 = (android.support.v4.media.MediaBrowserCompat.C0452n) r2;	 Catch:{ RemoteException -> 0x0097 }
            r2 = r2.f1478c;	 Catch:{ RemoteException -> 0x0097 }
            r3 = r7.get(r0);	 Catch:{ RemoteException -> 0x0097 }
            r3 = (android.os.Bundle) r3;	 Catch:{ RemoteException -> 0x0097 }
            r4 = r5.f13263i;	 Catch:{ RemoteException -> 0x0097 }
            r1.m1638a(r8, r2, r3, r4);	 Catch:{ RemoteException -> 0x0097 }
            r0 = r0 + 1;
            goto L_0x0077;
        L_0x0097:
            r6 = "MediaBrowserCompat";
            r7 = "addSubscription failed with RemoteException.";
            android.util.Log.d(r6, r7);
        L_0x009e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.a(android.os.Messenger, java.lang.String, android.support.v4.media.session.MediaSessionCompat$Token, android.os.Bundle):void");
        }

        /* renamed from: a */
        public void mo345a(Messenger messenger) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onConnectFailed for ");
            stringBuilder.append(this.f13256b);
            Log.e("MediaBrowserCompat", stringBuilder.toString());
            if (m15638a(messenger, "onConnectFailed") != null) {
                if (this.f13260f != 2) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("onConnect from service while mState=");
                    stringBuilder2.append(C3136i.m15637a(this.f13260f));
                    stringBuilder2.append("... ignoring");
                    Log.w("MediaBrowserCompat", stringBuilder2.toString());
                    return;
                }
                m15639a();
                this.f13257c.mo363c();
            }
        }

        /* renamed from: a */
        public void mo347a(Messenger messenger, String str, List list, Bundle bundle) {
            if (m15638a(messenger, "onLoadChildren") != null) {
                if (MediaBrowserCompat.f1479a != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onLoadChildren for ");
                    stringBuilder.append(this.f13256b);
                    stringBuilder.append(" id=");
                    stringBuilder.append(str);
                    Log.d("MediaBrowserCompat", stringBuilder.toString());
                }
                C0451m c0451m = (C0451m) this.f13264j.get(str);
                if (c0451m == null) {
                    if (MediaBrowserCompat.f1479a != null) {
                        list = new StringBuilder();
                        list.append("onLoadChildren for id that isn't subscribed id=");
                        list.append(str);
                        Log.d("MediaBrowserCompat", list.toString());
                    }
                    return;
                }
                messenger = c0451m.m1641a(this.f13255a, bundle);
                if (messenger != null) {
                    if (bundle == null) {
                        if (list == null) {
                            messenger.m1645a(str);
                        } else {
                            messenger.m1647a(str, list);
                        }
                    } else if (list == null) {
                        messenger.m1646a(str, bundle);
                    } else {
                        messenger.m1648a(str, list, bundle);
                    }
                }
            }
        }

        /* renamed from: a */
        private static String m15637a(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTING";
                case 1:
                    return "CONNECT_STATE_DISCONNECTED";
                case 2:
                    return "CONNECT_STATE_CONNECTING";
                case 3:
                    return "CONNECT_STATE_CONNECTED";
                case 4:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("UNKNOWN/");
                    stringBuilder.append(i);
                    return stringBuilder.toString();
            }
        }

        /* renamed from: a */
        private boolean m15638a(Messenger messenger, String str) {
            if (this.f13263i == messenger && this.f13260f != null) {
                if (this.f13260f != 1) {
                    return true;
                }
            }
            if (!(this.f13260f == null || this.f13260f == 1)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" for ");
                stringBuilder.append(this.f13256b);
                stringBuilder.append(" with mCallbacksMessenger=");
                stringBuilder.append(this.f13263i);
                stringBuilder.append(" this=");
                stringBuilder.append(this);
                Log.i("MediaBrowserCompat", stringBuilder.toString());
            }
            return null;
        }

        /* renamed from: c */
        void m15644c() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceComponent=");
            stringBuilder.append(this.f13256b);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mCallback=");
            stringBuilder.append(this.f13257c);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mRootHints=");
            stringBuilder.append(this.f13258d);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mState=");
            stringBuilder.append(C3136i.m15637a(this.f13260f));
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceConnection=");
            stringBuilder.append(this.f13261g);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mServiceBinderWrapper=");
            stringBuilder.append(this.f13262h);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mCallbacksMessenger=");
            stringBuilder.append(this.f13263i);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mRootId=");
            stringBuilder.append(this.f13265k);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  mMediaSessionToken=");
            stringBuilder.append(this.f13266l);
            Log.d("MediaBrowserCompat", stringBuilder.toString());
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C4436g extends C3135f {
        C4436g(Context context, ComponentName componentName, C0439b c0439b, Bundle bundle) {
            super(context, componentName, c0439b, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C4760h extends C4436g {
        C4760h(Context context, ComponentName componentName, C0439b c0439b, Bundle bundle) {
            super(context, componentName, c0439b, bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0439b c0439b, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            this.f1480b = new C4760h(context, componentName, c0439b, bundle);
        } else if (VERSION.SDK_INT >= 23) {
            this.f1480b = new C4436g(context, componentName, c0439b, bundle);
        } else if (VERSION.SDK_INT >= 21) {
            this.f1480b = new C3135f(context, componentName, c0439b, bundle);
        } else {
            this.f1480b = new C3136i(context, componentName, c0439b, bundle);
        }
    }

    /* renamed from: a */
    public void m1649a() {
        this.f1480b.mo350d();
    }

    /* renamed from: b */
    public void m1650b() {
        this.f1480b.mo351e();
    }

    /* renamed from: c */
    public Token m1651c() {
        return this.f1480b.mo352f();
    }
}
