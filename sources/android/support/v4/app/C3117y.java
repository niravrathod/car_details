package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0369x.C0366a;
import android.support.v4.app.C0369x.C0367c;
import android.support.v4.app.C0369x.C0368d;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.y */
class C3117y implements C0365w {
    /* renamed from: a */
    private final Builder f13200a;
    /* renamed from: b */
    private final C0367c f13201b;
    /* renamed from: c */
    private RemoteViews f13202c;
    /* renamed from: d */
    private RemoteViews f13203d;
    /* renamed from: e */
    private final List<Bundle> f13204e = new ArrayList();
    /* renamed from: f */
    private final Bundle f13205f = new Bundle();
    /* renamed from: g */
    private int f13206g;
    /* renamed from: h */
    private RemoteViews f13207h;

    C3117y(C0367c c0367c) {
        this.f13201b = c0367c;
        if (VERSION.SDK_INT >= 26) {
            this.f13200a = new Builder(c0367c.f1260a, c0367c.f1253H);
        } else {
            this.f13200a = new Builder(c0367c.f1260a);
        }
        Notification notification = c0367c.f1258M;
        this.f13200a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c0367c.f1266g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c0367c.f1262c).setContentText(c0367c.f1263d).setContentInfo(c0367c.f1268i).setContentIntent(c0367c.f1264e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c0367c.f1265f, (notification.flags & 128) != 0).setLargeIcon(c0367c.f1267h).setNumber(c0367c.f1269j).setProgress(c0367c.f1276q, c0367c.f1277r, c0367c.f1278s);
        if (VERSION.SDK_INT < 21) {
            this.f13200a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f13200a.setSubText(c0367c.f1274o).setUsesChronometer(c0367c.f1272m).setPriority(c0367c.f1270k);
            Iterator it = c0367c.f1261b.iterator();
            while (it.hasNext()) {
                m15565a((C0366a) it.next());
            }
            if (c0367c.f1246A != null) {
                this.f13205f.putAll(c0367c.f1246A);
            }
            if (VERSION.SDK_INT < 20) {
                if (c0367c.f1282w) {
                    this.f13205f.putBoolean("android.support.localOnly", true);
                }
                if (c0367c.f1279t != null) {
                    this.f13205f.putString("android.support.groupKey", c0367c.f1279t);
                    if (c0367c.f1280u) {
                        this.f13205f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f13205f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (c0367c.f1281v != null) {
                    this.f13205f.putString("android.support.sortKey", c0367c.f1281v);
                }
            }
            this.f13202c = c0367c.f1250E;
            this.f13203d = c0367c.f1251F;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f13200a.setShowWhen(c0367c.f1271l);
            if (!(VERSION.SDK_INT >= 21 || c0367c.f1259N == null || c0367c.f1259N.isEmpty())) {
                this.f13205f.putStringArray("android.people", (String[]) c0367c.f1259N.toArray(new String[c0367c.f1259N.size()]));
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f13200a.setLocalOnly(c0367c.f1282w).setGroup(c0367c.f1279t).setGroupSummary(c0367c.f1280u).setSortKey(c0367c.f1281v);
            this.f13206g = c0367c.f1257L;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f13200a.setCategory(c0367c.f1285z).setColor(c0367c.f1247B).setVisibility(c0367c.f1248C).setPublicVersion(c0367c.f1249D).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = c0367c.f1259N.iterator();
            while (it2.hasNext()) {
                this.f13200a.addPerson((String) it2.next());
            }
            this.f13207h = c0367c.f1252G;
        }
        if (VERSION.SDK_INT >= 24) {
            this.f13200a.setExtras(c0367c.f1246A).setRemoteInputHistory(c0367c.f1275p);
            if (c0367c.f1250E != null) {
                this.f13200a.setCustomContentView(c0367c.f1250E);
            }
            if (c0367c.f1251F != null) {
                this.f13200a.setCustomBigContentView(c0367c.f1251F);
            }
            if (c0367c.f1252G != null) {
                this.f13200a.setCustomHeadsUpContentView(c0367c.f1252G);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f13200a.setBadgeIconType(c0367c.f1254I).setShortcutId(c0367c.f1255J).setTimeoutAfter(c0367c.f1256K).setGroupAlertBehavior(c0367c.f1257L);
            if (c0367c.f1284y) {
                this.f13200a.setColorized(c0367c.f1283x);
            }
            if (TextUtils.isEmpty(c0367c.f1253H) == null) {
                this.f13200a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    /* renamed from: a */
    public Builder mo317a() {
        return this.f13200a;
    }

    /* renamed from: b */
    public Notification m15567b() {
        C0368d c0368d = this.f13201b.f1273n;
        if (c0368d != null) {
            c0368d.mo316a((C0365w) this);
        }
        RemoteViews b = c0368d != null ? c0368d.m1361b(this) : null;
        Notification c = m15568c();
        if (b != null) {
            c.contentView = b;
        } else if (this.f13201b.f1250E != null) {
            c.contentView = this.f13201b.f1250E;
        }
        if (VERSION.SDK_INT >= 16 && c0368d != null) {
            b = c0368d.m1362c(this);
            if (b != null) {
                c.bigContentView = b;
            }
        }
        if (VERSION.SDK_INT >= 21 && c0368d != null) {
            b = this.f13201b.f1273n.m1363d(this);
            if (b != null) {
                c.headsUpContentView = b;
            }
        }
        if (VERSION.SDK_INT >= 16 && c0368d != null) {
            Bundle a = C0369x.m1364a(c);
            if (a != null) {
                c0368d.m1358a(a);
            }
        }
        return c;
    }

    /* renamed from: a */
    private void m15565a(C0366a c0366a) {
        if (VERSION.SDK_INT >= 20) {
            Bundle bundle;
            Action.Builder builder = new Action.Builder(c0366a.m1333a(), c0366a.m1334b(), c0366a.m1335c());
            if (c0366a.m1338f() != null) {
                for (RemoteInput addRemoteInput : ab.m1145a(c0366a.m1338f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (c0366a.m1336d() != null) {
                bundle = new Bundle(c0366a.m1336d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", c0366a.m1337e());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(c0366a.m1337e());
            }
            builder.addExtras(bundle);
            this.f13200a.addAction(builder.build());
        } else if (VERSION.SDK_INT >= 16) {
            this.f13204e.add(C0370z.m1365a(this.f13200a, c0366a));
        }
    }

    /* renamed from: c */
    protected Notification m15568c() {
        if (VERSION.SDK_INT >= 26) {
            return this.f13200a.build();
        }
        Notification build;
        if (VERSION.SDK_INT >= 24) {
            build = this.f13200a.build();
            if (this.f13206g != 0) {
                if (!(build.getGroup() == null || (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f13206g != 2)) {
                    m15564a(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f13206g == 1) {
                    m15564a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 21) {
            this.f13200a.setExtras(this.f13205f);
            build = this.f13200a.build();
            if (this.f13202c != null) {
                build.contentView = this.f13202c;
            }
            if (this.f13203d != null) {
                build.bigContentView = this.f13203d;
            }
            if (this.f13207h != null) {
                build.headsUpContentView = this.f13207h;
            }
            if (this.f13206g != 0) {
                if (!(build.getGroup() == null || (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f13206g != 2)) {
                    m15564a(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f13206g == 1) {
                    m15564a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 20) {
            this.f13200a.setExtras(this.f13205f);
            build = this.f13200a.build();
            if (this.f13202c != null) {
                build.contentView = this.f13202c;
            }
            if (this.f13203d != null) {
                build.bigContentView = this.f13203d;
            }
            if (this.f13206g != 0) {
                if (!(build.getGroup() == null || (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f13206g != 2)) {
                    m15564a(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f13206g == 1) {
                    m15564a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 19) {
            SparseArray a = C0370z.m1368a(this.f13204e);
            if (a != null) {
                this.f13205f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f13200a.setExtras(this.f13205f);
            build = this.f13200a.build();
            if (this.f13202c != null) {
                build.contentView = this.f13202c;
            }
            if (this.f13203d != null) {
                build.bigContentView = this.f13203d;
            }
            return build;
        } else if (VERSION.SDK_INT < 16) {
            return this.f13200a.getNotification();
        } else {
            build = this.f13200a.build();
            Bundle a2 = C0369x.m1364a(build);
            Bundle bundle = new Bundle(this.f13205f);
            for (String str : this.f13205f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray a3 = C0370z.m1368a(this.f13204e);
            if (a3 != null) {
                C0369x.m1364a(build).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            if (this.f13202c != null) {
                build.contentView = this.f13202c;
            }
            if (this.f13203d != null) {
                build.bigContentView = this.f13203d;
            }
            return build;
        }
    }

    /* renamed from: a */
    private void m15564a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
