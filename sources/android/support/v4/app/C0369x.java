package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.x */
public class C0369x {

    /* renamed from: android.support.v4.app.x$a */
    public static class C0366a {
        /* renamed from: a */
        final Bundle f1239a;
        /* renamed from: b */
        public int f1240b;
        /* renamed from: c */
        public CharSequence f1241c;
        /* renamed from: d */
        public PendingIntent f1242d;
        /* renamed from: e */
        private final ab[] f1243e;
        /* renamed from: f */
        private final ab[] f1244f;
        /* renamed from: g */
        private boolean f1245g;

        public C0366a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true);
        }

        C0366a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ab[] abVarArr, ab[] abVarArr2, boolean z) {
            this.f1240b = i;
            this.f1241c = C0367c.m1341d(charSequence);
            this.f1242d = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.f1239a = bundle;
            this.f1243e = abVarArr;
            this.f1244f = abVarArr2;
            this.f1245g = z;
        }

        /* renamed from: a */
        public int m1333a() {
            return this.f1240b;
        }

        /* renamed from: b */
        public CharSequence m1334b() {
            return this.f1241c;
        }

        /* renamed from: c */
        public PendingIntent m1335c() {
            return this.f1242d;
        }

        /* renamed from: d */
        public Bundle m1336d() {
            return this.f1239a;
        }

        /* renamed from: e */
        public boolean m1337e() {
            return this.f1245g;
        }

        /* renamed from: f */
        public ab[] m1338f() {
            return this.f1243e;
        }

        /* renamed from: g */
        public ab[] m1339g() {
            return this.f1244f;
        }
    }

    /* renamed from: android.support.v4.app.x$c */
    public static class C0367c {
        /* renamed from: A */
        Bundle f1246A;
        /* renamed from: B */
        int f1247B;
        /* renamed from: C */
        int f1248C;
        /* renamed from: D */
        Notification f1249D;
        /* renamed from: E */
        RemoteViews f1250E;
        /* renamed from: F */
        RemoteViews f1251F;
        /* renamed from: G */
        RemoteViews f1252G;
        /* renamed from: H */
        String f1253H;
        /* renamed from: I */
        int f1254I;
        /* renamed from: J */
        String f1255J;
        /* renamed from: K */
        long f1256K;
        /* renamed from: L */
        int f1257L;
        /* renamed from: M */
        Notification f1258M;
        @Deprecated
        /* renamed from: N */
        public ArrayList<String> f1259N;
        /* renamed from: a */
        public Context f1260a;
        /* renamed from: b */
        public ArrayList<C0366a> f1261b;
        /* renamed from: c */
        CharSequence f1262c;
        /* renamed from: d */
        CharSequence f1263d;
        /* renamed from: e */
        PendingIntent f1264e;
        /* renamed from: f */
        PendingIntent f1265f;
        /* renamed from: g */
        RemoteViews f1266g;
        /* renamed from: h */
        Bitmap f1267h;
        /* renamed from: i */
        CharSequence f1268i;
        /* renamed from: j */
        int f1269j;
        /* renamed from: k */
        int f1270k;
        /* renamed from: l */
        boolean f1271l;
        /* renamed from: m */
        boolean f1272m;
        /* renamed from: n */
        C0368d f1273n;
        /* renamed from: o */
        CharSequence f1274o;
        /* renamed from: p */
        CharSequence[] f1275p;
        /* renamed from: q */
        int f1276q;
        /* renamed from: r */
        int f1277r;
        /* renamed from: s */
        boolean f1278s;
        /* renamed from: t */
        String f1279t;
        /* renamed from: u */
        boolean f1280u;
        /* renamed from: v */
        String f1281v;
        /* renamed from: w */
        boolean f1282w;
        /* renamed from: x */
        boolean f1283x;
        /* renamed from: y */
        boolean f1284y;
        /* renamed from: z */
        String f1285z;

        public C0367c(Context context, String str) {
            this.f1261b = new ArrayList();
            this.f1271l = true;
            this.f1282w = false;
            this.f1247B = 0;
            this.f1248C = 0;
            this.f1254I = 0;
            this.f1257L = 0;
            this.f1258M = new Notification();
            this.f1260a = context;
            this.f1253H = str;
            this.f1258M.when = System.currentTimeMillis();
            this.f1258M.audioStreamType = -1;
            this.f1270k = 0;
            this.f1259N = new ArrayList();
        }

        @Deprecated
        public C0367c(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public C0367c m1345a(long j) {
            this.f1258M.when = j;
            return this;
        }

        /* renamed from: a */
        public C0367c m1343a(int i) {
            this.f1258M.icon = i;
            return this;
        }

        /* renamed from: a */
        public C0367c m1349a(CharSequence charSequence) {
            this.f1262c = C0367c.m1341d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0367c m1354b(CharSequence charSequence) {
            this.f1263d = C0367c.m1341d(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0367c m1346a(PendingIntent pendingIntent) {
            this.f1264e = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public C0367c m1353b(PendingIntent pendingIntent) {
            this.f1258M.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C0367c m1357c(CharSequence charSequence) {
            this.f1258M.tickerText = C0367c.m1341d(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0367c m1347a(Uri uri) {
            this.f1258M.sound = uri;
            this.f1258M.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                this.f1258M.audioAttributes = new Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public C0367c m1351a(boolean z) {
            m1340a(16, z);
            return this;
        }

        /* renamed from: b */
        public C0367c m1355b(boolean z) {
            this.f1282w = z;
            return this;
        }

        /* renamed from: a */
        private void m1340a(int i, boolean z) {
            if (z) {
                z = this.f1258M;
                z.flags = i | z.flags;
                return;
            }
            z = this.f1258M;
            z.flags = (i ^ -1) & z.flags;
        }

        /* renamed from: b */
        public C0367c m1352b(int i) {
            this.f1270k = i;
            return this;
        }

        /* renamed from: a */
        public C0367c m1344a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1261b.add(new C0366a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0367c m1348a(C0368d c0368d) {
            if (this.f1273n != c0368d) {
                this.f1273n = c0368d;
                if (this.f1273n != null) {
                    this.f1273n.m1360a(this);
                }
            }
            return this;
        }

        /* renamed from: c */
        public C0367c m1356c(int i) {
            this.f1247B = i;
            return this;
        }

        /* renamed from: a */
        public C0367c m1350a(String str) {
            this.f1253H = str;
            return this;
        }

        /* renamed from: a */
        public Notification m1342a() {
            return new C3117y(this).m15567b();
        }

        /* renamed from: d */
        protected static CharSequence m1341d(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }
    }

    /* renamed from: android.support.v4.app.x$d */
    public static abstract class C0368d {
        /* renamed from: a */
        protected C0367c f1286a;
        /* renamed from: b */
        CharSequence f1287b;
        /* renamed from: c */
        CharSequence f1288c;
        /* renamed from: d */
        boolean f1289d = false;

        /* renamed from: a */
        public void m1358a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo316a(C0365w c0365w) {
        }

        /* renamed from: b */
        public RemoteViews m1361b(C0365w c0365w) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews m1362c(C0365w c0365w) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews m1363d(C0365w c0365w) {
            return null;
        }

        /* renamed from: a */
        public void m1360a(C0367c c0367c) {
            if (this.f1286a != c0367c) {
                this.f1286a = c0367c;
                if (this.f1286a != null) {
                    this.f1286a.m1348a(this);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.x$b */
    public static class C3116b extends C0368d {
        /* renamed from: e */
        private CharSequence f13199e;

        /* renamed from: a */
        public C3116b m15562a(CharSequence charSequence) {
            this.f13199e = C0367c.m1341d(charSequence);
            return this;
        }

        /* renamed from: a */
        public void mo316a(C0365w c0365w) {
            if (VERSION.SDK_INT >= 16) {
                c0365w = new BigTextStyle(c0365w.mo317a()).setBigContentTitle(this.b).bigText(this.f13199e);
                if (this.d) {
                    c0365w.setSummaryText(this.c);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m1364a(Notification notification) {
        if (VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        return VERSION.SDK_INT >= 16 ? C0370z.m1366a(notification) : null;
    }
}
