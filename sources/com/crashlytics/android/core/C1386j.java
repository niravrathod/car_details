package com.crashlytics.android.core;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.C1367h.C1365a;
import com.crashlytics.android.core.C1390m.C1388a;
import com.crashlytics.android.core.C1390m.C1389b;
import com.crashlytics.android.core.LogFileManager.DirectoryProvider;
import com.crashlytics.android.core.ah.C1350b;
import com.crashlytics.android.core.ah.C1351c;
import com.crashlytics.android.core.ah.C1352d;
import com.crashlytics.android.core.ah.C3570a;
import com.crashlytics.android.core.j.AnonymousClass16;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2798i.C4302a;
import io.fabric.sdk.android.services.common.C2798i.C4303b;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.p148c.C2786a;
import io.fabric.sdk.android.services.settings.C2845m;
import io.fabric.sdk.android.services.settings.C2847o;
import io.fabric.sdk.android.services.settings.C2848p;
import io.fabric.sdk.android.services.settings.C2851q;
import io.fabric.sdk.android.services.settings.C2853s;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.core.j */
class C1386j {
    /* renamed from: a */
    static final FilenameFilter f4323a = new C1380d("BeginSession") {
        public boolean accept(File file, String str) {
            return (super.accept(file, str) == null || str.endsWith(".cls") == null) ? null : true;
        }
    };
    /* renamed from: b */
    static final FilenameFilter f4324b = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return (str.length() != ".cls".length() + 35 || str.endsWith(".cls") == null) ? null : true;
        }
    };
    /* renamed from: c */
    static final FileFilter f4325c = new FileFilter() {
        public boolean accept(File file) {
            return (file.isDirectory() && file.getName().length() == 35) ? true : null;
        }
    };
    /* renamed from: d */
    static final Comparator<File> f4326d = new Comparator<File>() {
        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m5557a((File) obj, (File) obj2);
        }

        /* renamed from: a */
        public int m5557a(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    /* renamed from: e */
    static final Comparator<File> f4327e = new Comparator<File>() {
        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m5558a((File) obj, (File) obj2);
        }

        /* renamed from: a */
        public int m5558a(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    /* renamed from: f */
    private static final Pattern f4328f = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    /* renamed from: g */
    private static final Map<String, String> f4329g = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    /* renamed from: h */
    private static final String[] f4330h = new String[]{"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    /* renamed from: i */
    private final AtomicInteger f4331i = new AtomicInteger(0);
    /* renamed from: j */
    private final CrashlyticsCore f4332j;
    /* renamed from: k */
    private final C1370i f4333k;
    /* renamed from: l */
    private final C2834c f4334l;
    /* renamed from: m */
    private final IdManager f4335m;
    /* renamed from: n */
    private final ad f4336n;
    /* renamed from: o */
    private final C2786a f4337o;
    /* renamed from: p */
    private final C1349a f4338p;
    /* renamed from: q */
    private final C3576g f4339q;
    /* renamed from: r */
    private final LogFileManager f4340r;
    /* renamed from: s */
    private final C1351c f4341s;
    /* renamed from: t */
    private final C1350b f4342t;
    /* renamed from: u */
    private final C1396s f4343u;
    /* renamed from: v */
    private final al f4344v;
    /* renamed from: w */
    private final String f4345w;
    /* renamed from: x */
    private final C1354b f4346x;
    /* renamed from: y */
    private final EventLogger f4347y;
    /* renamed from: z */
    private C1390m f4348z;

    /* renamed from: com.crashlytics.android.core.j$4 */
    class C13734 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ C1386j f4308a;

        C13734(C1386j c1386j) {
            this.f4308a = c1386j;
        }

        public /* synthetic */ Object call() {
            return m5563a();
        }

        /* renamed from: a */
        public Void m5563a() {
            this.f4308a.m5631o();
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.j$6 */
    class C13756 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1386j f4311a;

        C13756(C1386j c1386j) {
            this.f4311a = c1386j;
        }

        public void run() {
            this.f4311a.m5645a(this.f4311a.m5601a(new C1382f()));
        }
    }

    /* renamed from: com.crashlytics.android.core.j$a */
    private static class C1378a implements FilenameFilter {
        private C1378a() {
        }

        public boolean accept(File file, String str) {
            return (C1386j.f4324b.accept(file, str) != null || C1386j.f4328f.matcher(str).matches() == null) ? null : true;
        }
    }

    /* renamed from: com.crashlytics.android.core.j$b */
    private interface C1379b {
        /* renamed from: a */
        void mo1141a(CodedOutputStream codedOutputStream);
    }

    /* renamed from: com.crashlytics.android.core.j$d */
    static class C1380d implements FilenameFilter {
        /* renamed from: a */
        private final String f4316a;

        public C1380d(String str) {
            this.f4316a = str;
        }

        public boolean accept(File file, String str) {
            return (str.contains(this.f4316a) == null || str.endsWith(".cls_temp") != null) ? null : true;
        }
    }

    /* renamed from: com.crashlytics.android.core.j$e */
    private interface C1381e {
        /* renamed from: a */
        void mo1140a(FileOutputStream fileOutputStream);
    }

    /* renamed from: com.crashlytics.android.core.j$f */
    static class C1382f implements FilenameFilter {
        C1382f() {
        }

        public boolean accept(File file, String str) {
            if (C1360f.f4270a.accept(file, str) == null) {
                if (str.contains("SessionMissingBinaryImages") == null) {
                    return null;
                }
            }
            return true;
        }
    }

    /* renamed from: com.crashlytics.android.core.j$k */
    private static final class C1384k implements Runnable {
        /* renamed from: a */
        private final Context f4319a;
        /* renamed from: b */
        private final Report f4320b;
        /* renamed from: c */
        private final ah f4321c;

        public C1384k(Context context, Report report, ah ahVar) {
            this.f4319a = context;
            this.f4320b = report;
            this.f4321c = ahVar;
        }

        public void run() {
            if (CommonUtils.m13638n(this.f4319a)) {
                C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Attempting to send crash report at time of crash...");
                this.f4321c.m5483a(this.f4320b);
            }
        }
    }

    /* renamed from: com.crashlytics.android.core.j$l */
    static class C1385l implements FilenameFilter {
        /* renamed from: a */
        private final String f4322a;

        public C1385l(String str) {
            this.f4322a = str;
        }

        public boolean accept(File file, String str) {
            file = new StringBuilder();
            file.append(this.f4322a);
            file.append(".cls");
            boolean z = false;
            if (str.equals(file.toString()) != null) {
                return false;
            }
            if (str.contains(this.f4322a) != null && str.endsWith(".cls_temp") == null) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.crashlytics.android.core.j$c */
    private static final class C3575c implements C1389b {
        private C3575c() {
        }

        /* renamed from: a */
        public C2853s mo1144a() {
            return C2851q.m13855a().m13858b();
        }
    }

    /* renamed from: com.crashlytics.android.core.j$g */
    private static final class C3576g implements DirectoryProvider {
        /* renamed from: a */
        private final C2786a f14735a;

        public C3576g(C2786a c2786a) {
            this.f14735a = c2786a;
        }

        public File getLogFileDir() {
            File file = new File(this.f14735a.mo3575a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: com.crashlytics.android.core.j$h */
    private static final class C3578h implements C1352d {
        /* renamed from: a */
        private final C2771h f14737a;
        /* renamed from: b */
        private final ad f14738b;
        /* renamed from: c */
        private final C2847o f14739c;

        /* renamed from: com.crashlytics.android.core.j$h$1 */
        class C35771 implements C1365a {
            /* renamed from: a */
            final /* synthetic */ C3578h f14736a;

            C35771(C3578h c3578h) {
                this.f14736a = c3578h;
            }

            /* renamed from: a */
            public void mo1146a(boolean z) {
                this.f14736a.f14738b.m5470a(z);
            }
        }

        public C3578h(C2771h c2771h, ad adVar, C2847o c2847o) {
            this.f14737a = c2771h;
            this.f14738b = adVar;
            this.f14739c = c2847o;
        }

        /* renamed from: a */
        public boolean mo1137a() {
            Activity b = this.f14737a.getFabric().m13531b();
            if (b != null) {
                if (!b.isFinishing()) {
                    final C1367h a = C1367h.m5550a(b, this.f14739c, new C35771(this));
                    b.runOnUiThread(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C3578h f4318b;

                        public void run() {
                            a.m5551a();
                        }
                    });
                    C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Waiting for user opt-in.");
                    a.m5552b();
                    return a.m5553c();
                }
            }
            return true;
        }
    }

    /* renamed from: com.crashlytics.android.core.j$i */
    private final class C3579i implements C1351c {
        /* renamed from: a */
        final /* synthetic */ C1386j f14740a;

        private C3579i(C1386j c1386j) {
            this.f14740a = c1386j;
        }

        /* renamed from: a */
        public File[] mo1147a() {
            return this.f14740a.m5649b();
        }

        /* renamed from: b */
        public File[] mo1148b() {
            return this.f14740a.m5657j().listFiles();
        }

        /* renamed from: c */
        public File[] mo1149c() {
            return this.f14740a.m5650c();
        }
    }

    /* renamed from: com.crashlytics.android.core.j$j */
    private final class C3580j implements C1350b {
        /* renamed from: a */
        final /* synthetic */ C1386j f14741a;

        private C3580j(C1386j c1386j) {
            this.f14741a = c1386j;
        }

        /* renamed from: a */
        public boolean mo1150a() {
            return this.f14741a.m5653f();
        }
    }

    C1386j(CrashlyticsCore crashlyticsCore, C1370i c1370i, C2834c c2834c, IdManager idManager, ad adVar, C2786a c2786a, C1349a c1349a, an anVar, C1354b c1354b, EventLogger eventLogger) {
        this.f4332j = crashlyticsCore;
        this.f4333k = c1370i;
        this.f4334l = c2834c;
        this.f4335m = idManager;
        this.f4336n = adVar;
        this.f4337o = c2786a;
        this.f4338p = c1349a;
        this.f4345w = anVar.mo1156a();
        this.f4346x = c1354b;
        this.f4347y = eventLogger;
        crashlyticsCore = crashlyticsCore.getContext();
        this.f4339q = new C3576g(c2786a);
        this.f4340r = new LogFileManager(crashlyticsCore, this.f4339q);
        this.f4341s = new C3579i();
        this.f4342t = new C3580j();
        this.f4343u = new C1396s(crashlyticsCore);
        this.f4344v = new C3586y(1024, new al[]{new ag(10)});
    }

    /* renamed from: a */
    void m5642a(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        m5635a();
        this.f4348z = new C1390m(new C1388a(this) {
            /* renamed from: a */
            final /* synthetic */ C1386j f14730a;

            {
                this.f14730a = r1;
            }

            /* renamed from: a */
            public void mo1143a(C1389b c1389b, Thread thread, Throwable th, boolean z) {
                this.f14730a.m5639a(c1389b, thread, th, z);
            }
        }, new C3575c(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.f4348z);
    }

    /* renamed from: a */
    synchronized void m5639a(C1389b c1389b, Thread thread, Throwable th, boolean z) {
        C2774k h = C2766c.m13524h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics is handling uncaught exception \"");
        stringBuilder.append(th);
        stringBuilder.append("\" from thread ");
        stringBuilder.append(thread.getName());
        h.mo3554a(str, stringBuilder.toString());
        this.f4343u.m5670c();
        final Date date = new Date();
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final C1389b c1389b2 = c1389b;
        final boolean z2 = z;
        this.f4333k.m5554a(new Callable<Void>(this) {
            /* renamed from: f */
            final /* synthetic */ C1386j f4294f;

            public /* synthetic */ Object call() {
                return m5559a();
            }

            /* renamed from: a */
            public Void m5559a() {
                C2848p c2848p;
                C2845m c2845m;
                Object obj;
                this.f4294f.f4332j.createCrashMarker();
                this.f4294f.m5591a(date, thread2, th2);
                C2853s a = c1389b2.mo1144a();
                if (a != null) {
                    c2848p = a.f12056b;
                    c2845m = a.f12058d;
                } else {
                    c2848p = null;
                    c2845m = c2848p;
                }
                if (c2845m != null) {
                    if (!c2845m.f12031e) {
                        obj = null;
                        if (obj != null || z2) {
                            this.f4294f.m5570a(date.getTime());
                        }
                        this.f4294f.m5648b(c2848p);
                        this.f4294f.m5631o();
                        if (c2848p != null) {
                            this.f4294f.m5637a(c2848p.f12049g);
                        }
                        if (!this.f4294f.m5611b(a)) {
                            this.f4294f.m5615c(a);
                        }
                        return null;
                    }
                }
                obj = 1;
                this.f4294f.m5570a(date.getTime());
                this.f4294f.m5648b(c2848p);
                this.f4294f.m5631o();
                if (c2848p != null) {
                    this.f4294f.m5637a(c2848p.f12049g);
                }
                if (this.f4294f.m5611b(a)) {
                    this.f4294f.m5615c(a);
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    void m5636a(float f, C2853s c2853s) {
        if (c2853s == null) {
            C2766c.m13524h().mo3559d(CrashlyticsCore.TAG, "Could not send reports. Settings are not available.");
            return;
        }
        new ah(this.f4338p.f4231a, m5603b(c2853s.f12055a.f12021d, c2853s.f12055a.f12022e), this.f4341s, this.f4342t).m5482a(f, m5611b(c2853s) ? new C3578h(this.f4332j, this.f4336n, c2853s.f12057c) : new C3570a());
    }

    /* renamed from: a */
    void m5638a(final long j, final String str) {
        this.f4333k.m5556b(new Callable<Void>(this) {
            /* renamed from: c */
            final /* synthetic */ C1386j f4297c;

            public /* synthetic */ Object call() {
                return m5560a();
            }

            /* renamed from: a */
            public Void m5560a() {
                if (!this.f4297c.m5653f()) {
                    this.f4297c.f4340r.m5445a(j, str);
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    void m5643a(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.f4333k.m5555a(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ C1386j f4301d;

            public void run() {
                if (!this.f4301d.m5653f()) {
                    this.f4301d.m5609b(date, thread, th);
                }
            }
        });
    }

    /* renamed from: a */
    void m5641a(final String str, final String str2, final String str3) {
        this.f4333k.m5556b(new Callable<Void>(this) {
            /* renamed from: d */
            final /* synthetic */ C1386j f4305d;

            public /* synthetic */ Object call() {
                return m5561a();
            }

            /* renamed from: a */
            public Void m5561a() {
                new C1400x(this.f4305d.m5654g()).m5689a(this.f4305d.m5629m(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    /* renamed from: a */
    void m5644a(final Map<String, String> map) {
        this.f4333k.m5556b(new Callable<Void>(this) {
            /* renamed from: b */
            final /* synthetic */ C1386j f4307b;

            public /* synthetic */ Object call() {
                return m5562a();
            }

            /* renamed from: a */
            public Void m5562a() {
                new C1400x(this.f4307b.m5654g()).m5690a(this.f4307b.m5629m(), map);
                return null;
            }
        });
    }

    /* renamed from: a */
    void m5635a() {
        this.f4333k.m5556b(new C13734(this));
    }

    /* renamed from: m */
    private String m5629m() {
        File[] p = m5632p();
        return p.length > 0 ? C1386j.m5569a(p[0]) : null;
    }

    /* renamed from: n */
    private String m5630n() {
        File[] p = m5632p();
        return p.length > 1 ? C1386j.m5569a(p[1]) : null;
    }

    /* renamed from: a */
    static String m5569a(File file) {
        return file.getName().substring(0, 35);
    }

    /* renamed from: a */
    boolean m5647a(final C2848p c2848p) {
        return ((Boolean) this.f4333k.m5554a(new Callable<Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ C1386j f4310b;

            public /* synthetic */ Object call() {
                return m5564a();
            }

            /* renamed from: a */
            public Boolean m5564a() {
                if (this.f4310b.m5653f()) {
                    C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Skipping session finalization because a crash has already occurred.");
                    return Boolean.FALSE;
                }
                C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Finalizing previously open sessions.");
                this.f4310b.m5582a(c2848p, true);
                C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Closed all previously open sessions");
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* renamed from: o */
    private void m5631o() {
        Date date = new Date();
        String c1358e = new C1358e(this.f4335m).toString();
        C2774k h = C2766c.m13524h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Opening a new session with ID ");
        stringBuilder.append(c1358e);
        h.mo3554a(str, stringBuilder.toString());
        m5590a(c1358e, date);
        m5616c(c1358e);
        m5620d(c1358e);
        m5623e(c1358e);
        this.f4340r.m5447a(c1358e);
    }

    /* renamed from: b */
    void m5648b(C2848p c2848p) {
        m5582a(c2848p, false);
    }

    /* renamed from: a */
    private void m5582a(C2848p c2848p, boolean z) {
        m5604b(z + 8);
        File[] p = m5632p();
        if (p.length <= z) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "No open sessions to be closed.");
            return;
        }
        m5625f(C1386j.m5569a(p[z]));
        if (c2848p == null) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Unable to close session. Settings are not loaded.");
        } else {
            m5594a(p, (int) z, c2848p.f12045c);
        }
    }

    /* renamed from: a */
    private void m5594a(File[] fileArr, int i, int i2) {
        C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String a = C1386j.m5569a(file);
            C2774k h = C2766c.m13524h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Closing session: ");
            stringBuilder.append(a);
            h.mo3554a(str, stringBuilder.toString());
            m5583a(file, a, i2);
            i++;
        }
    }

    /* renamed from: a */
    private void m5576a(C1360f c1360f) {
        if (c1360f != null) {
            try {
                c1360f.m5543a();
            } catch (C1360f c1360f2) {
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error closing session file stream in the presence of an exception", c1360f2);
            }
        }
    }

    /* renamed from: a */
    private void m5592a(Set<File> set) {
        for (File b : set) {
            m5608b(b);
        }
    }

    /* renamed from: b */
    private void m5608b(File file) {
        if (file.isDirectory()) {
            for (File b : file.listFiles()) {
                m5608b(b);
            }
        }
        file.delete();
    }

    /* renamed from: a */
    private void m5586a(String str) {
        for (File delete : m5612b(str)) {
            delete.delete();
        }
    }

    /* renamed from: b */
    private File[] m5612b(String str) {
        return m5601a(new C1385l(str));
    }

    /* renamed from: b */
    File[] m5649b() {
        List linkedList = new LinkedList();
        Collections.addAll(linkedList, m5599a(m5655h(), f4324b));
        Collections.addAll(linkedList, m5599a(m5656i(), f4324b));
        Collections.addAll(linkedList, m5599a(m5654g(), f4324b));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* renamed from: c */
    File[] m5650c() {
        return m5600a(f4325c);
    }

    /* renamed from: d */
    File[] m5651d() {
        return m5601a(f4323a);
    }

    /* renamed from: p */
    private File[] m5632p() {
        File[] d = m5651d();
        Arrays.sort(d, f4326d);
        return d;
    }

    /* renamed from: a */
    private File[] m5600a(FileFilter fileFilter) {
        return m5613b(m5654g().listFiles(fileFilter));
    }

    /* renamed from: a */
    private File[] m5601a(FilenameFilter filenameFilter) {
        return m5599a(m5654g(), filenameFilter);
    }

    /* renamed from: a */
    private File[] m5599a(File file, FilenameFilter filenameFilter) {
        return m5613b(file.listFiles(filenameFilter));
    }

    /* renamed from: c */
    private File[] m5618c(File file) {
        return m5613b(file.listFiles());
    }

    /* renamed from: b */
    private File[] m5613b(File[] fileArr) {
        return fileArr == null ? new File[null] : fileArr;
    }

    /* renamed from: a */
    private void m5587a(String str, int i) {
        File g = m5654g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("SessionEvent");
        ao.m5518a(g, new C1380d(stringBuilder.toString()), i, f4327e);
    }

    /* renamed from: a */
    void m5637a(int i) {
        i -= ao.m5517a(m5655h(), i, f4327e);
        ao.m5518a(m5654g(), f4324b, i - ao.m5517a(m5656i(), i, f4327e), f4327e);
    }

    /* renamed from: b */
    private void m5604b(int i) {
        Set hashSet = new HashSet();
        File[] p = m5632p();
        i = Math.min(i, p.length);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(C1386j.m5569a(p[i2]));
        }
        this.f4340r.m5448a(hashSet);
        m5595a(m5601a(new C1378a()), hashSet);
    }

    /* renamed from: a */
    private void m5595a(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = f4328f.matcher(name);
            C2774k h;
            String str;
            StringBuilder stringBuilder;
            if (!matcher.matches()) {
                h = C2766c.m13524h();
                str = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Deleting unknown file: ");
                stringBuilder.append(name);
                h.mo3554a(str, stringBuilder.toString());
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                h = C2766c.m13524h();
                str = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Trimming session file: ");
                stringBuilder.append(name);
                h.mo3554a(str, stringBuilder.toString());
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private File[] m5602a(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        m5587a(str, i);
        i = new StringBuilder();
        i.append(str);
        i.append("SessionEvent");
        return m5601a(new C1380d(i.toString()));
    }

    /* renamed from: e */
    void m5652e() {
        this.f4333k.m5555a(new C13756(this));
    }

    /* renamed from: a */
    void m5645a(File[] fileArr) {
        final Set hashSet = new HashSet();
        for (File file : fileArr) {
            C2774k h = C2766c.m13524h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found invalid session part file: ");
            stringBuilder.append(file);
            h.mo3554a(str, stringBuilder.toString());
            hashSet.add(C1386j.m5569a(file));
        }
        if (hashSet.isEmpty() == null) {
            fileArr = m5657j();
            if (!fileArr.exists()) {
                fileArr.mkdir();
            }
            for (File file2 : m5601a(new FilenameFilter(this) {
                /* renamed from: b */
                final /* synthetic */ C1386j f4313b;

                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                C2774k h2 = C2766c.m13524h();
                String str2 = CrashlyticsCore.TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Moving session file: ");
                stringBuilder2.append(file2);
                h2.mo3554a(str2, stringBuilder2.toString());
                if (!file2.renameTo(new File(fileArr, file2.getName()))) {
                    h2 = C2766c.m13524h();
                    str2 = CrashlyticsCore.TAG;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Could not move session file. Deleting ");
                    stringBuilder2.append(file2);
                    h2.mo3554a(str2, stringBuilder2.toString());
                    file2.delete();
                }
            }
            m5633q();
        }
    }

    /* renamed from: q */
    private void m5633q() {
        File j = m5657j();
        if (j.exists()) {
            File[] a = m5599a(j, new C1382f());
            Arrays.sort(a, Collections.reverseOrder());
            Set hashSet = new HashSet();
            for (int i = 0; i < a.length && hashSet.size() < 4; i++) {
                hashSet.add(C1386j.m5569a(a[i]));
            }
            m5595a(m5618c(j), hashSet);
        }
    }

    /* renamed from: a */
    private void m5571a(Context context, File file, String str) {
        byte[] b = ab.m5464b(file);
        byte[] c = ab.m5466c(file);
        byte[] a = ab.m5462a(file, context);
        if (b != null) {
            if (b.length != 0) {
                C1386j.m5621d(str, "<native-crash: minidump>");
                byte[] a2 = m5597a(str, "BeginSession.json");
                byte[] a3 = m5597a(str, "SessionApp.json");
                byte[] a4 = m5597a(str, "SessionDevice.json");
                byte[] a5 = m5597a(str, "SessionOS.json");
                byte[] a6 = ab.m5461a(new C1400x(m5654g()).m5691b(str));
                LogFileManager logFileManager = new LogFileManager(this.f4332j.getContext(), this.f4339q, str);
                byte[] b2 = logFileManager.m5449b();
                logFileManager.m5450c();
                byte[] a7 = ab.m5461a(new C1400x(m5654g()).m5692c(str));
                File file2 = new File(this.f4337o.mo3575a(), str);
                if (file2.mkdir() == null) {
                    C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Couldn't create native sessions directory");
                    return;
                }
                m5593a(b, new File(file2, "minidump"));
                m5593a(c, new File(file2, "metadata"));
                m5593a(a, new File(file2, "binaryImages"));
                m5593a(a2, new File(file2, "session"));
                m5593a(a3, new File(file2, "app"));
                m5593a(a4, new File(file2, "device"));
                m5593a(a5, new File(file2, "os"));
                m5593a(a6, new File(file2, "user"));
                m5593a(b2, new File(file2, "logs"));
                m5593a(a7, new File(file2, "keys"));
                return;
            }
        }
        context = C2766c.m13524h();
        str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No minidump data found in directory ");
        stringBuilder.append(file);
        context.mo3559d(str, stringBuilder.toString());
    }

    /* renamed from: a */
    boolean m5646a(final CrashlyticsNdkData crashlyticsNdkData) {
        return crashlyticsNdkData == null ? true : ((Boolean) this.f4333k.m5554a(new Callable<Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ C1386j f4315b;

            public /* synthetic */ Object call() {
                return m5565a();
            }

            /* renamed from: a */
            public Boolean m5565a() {
                Set set = crashlyticsNdkData.timestampedDirectories;
                String e = this.f4315b.m5630n();
                if (!(e == null || set.isEmpty())) {
                    File file = (File) set.first();
                    if (file != null) {
                        this.f4315b.m5571a(this.f4315b.f4332j.getContext(), file, e);
                    }
                }
                this.f4315b.m5592a(set);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* renamed from: a */
    private void m5593a(byte[] bArr, File file) {
        if (bArr != null && bArr.length > 0) {
            m5610b(bArr, file);
        }
    }

    /* renamed from: b */
    private void m5610b(byte[] bArr, File file) {
        Closeable closeable = null;
        try {
            Closeable gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                CommonUtils.m13612a(gZIPOutputStream);
            } catch (Throwable th) {
                bArr = th;
                closeable = gZIPOutputStream;
                CommonUtils.m13612a(closeable);
                throw bArr;
            }
        } catch (Throwable th2) {
            bArr = th2;
            CommonUtils.m13612a(closeable);
            throw bArr;
        }
    }

    /* renamed from: a */
    private void m5591a(Date date, Thread thread, Throwable th) {
        Closeable c1360f;
        Flushable flushable = null;
        try {
            String m = m5629m();
            if (m == null) {
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Tried to write a fatal exception while no session was open.", null);
                CommonUtils.m13614a(null, "Failed to flush to session begin file.");
                CommonUtils.m13613a(null, "Failed to close fatal exception file output stream.");
                return;
            }
            C1386j.m5621d(m, th.getClass().getName());
            File g = m5654g();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m);
            stringBuilder.append("SessionCrash");
            c1360f = new C1360f(g, stringBuilder.toString());
            try {
                Flushable a = CodedOutputStream.m5391a((OutputStream) c1360f);
                try {
                    m5574a(a, date, thread, th, "crash", true);
                    CommonUtils.m13614a(a, "Failed to flush to session begin file.");
                } catch (Exception e) {
                    date = e;
                    flushable = a;
                    try {
                        C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", date);
                        CommonUtils.m13614a(flushable, "Failed to flush to session begin file.");
                        CommonUtils.m13613a(c1360f, "Failed to close fatal exception file output stream.");
                    } catch (Throwable th2) {
                        date = th2;
                        CommonUtils.m13614a(flushable, "Failed to flush to session begin file.");
                        CommonUtils.m13613a(c1360f, "Failed to close fatal exception file output stream.");
                        throw date;
                    }
                } catch (Throwable th3) {
                    date = th3;
                    flushable = a;
                    CommonUtils.m13614a(flushable, "Failed to flush to session begin file.");
                    CommonUtils.m13613a(c1360f, "Failed to close fatal exception file output stream.");
                    throw date;
                }
            } catch (Exception e2) {
                date = e2;
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", date);
                CommonUtils.m13614a(flushable, "Failed to flush to session begin file.");
                CommonUtils.m13613a(c1360f, "Failed to close fatal exception file output stream.");
            }
            CommonUtils.m13613a(c1360f, "Failed to close fatal exception file output stream.");
        } catch (Exception e3) {
            date = e3;
            c1360f = null;
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", date);
            CommonUtils.m13614a(flushable, "Failed to flush to session begin file.");
            CommonUtils.m13613a(c1360f, "Failed to close fatal exception file output stream.");
        } catch (Throwable th4) {
            date = th4;
            c1360f = null;
            CommonUtils.m13614a(flushable, "Failed to flush to session begin file.");
            CommonUtils.m13613a(c1360f, "Failed to close fatal exception file output stream.");
            throw date;
        }
    }

    /* renamed from: b */
    private void m5609b(Date date, Thread thread, Throwable th) {
        Closeable c1360f;
        String m = m5629m();
        Flushable flushable = null;
        if (m == null) {
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        C1386j.m5617c(m, th.getClass().getName());
        try {
            C2774k h = C2766c.m13524h();
            String str = CrashlyticsCore.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Crashlytics is logging non-fatal exception \"");
            stringBuilder.append(th);
            stringBuilder.append("\" from thread ");
            stringBuilder.append(thread.getName());
            h.mo3554a(str, stringBuilder.toString());
            String a = CommonUtils.m13600a(this.f4331i.getAndIncrement());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(m);
            stringBuilder2.append("SessionEvent");
            stringBuilder2.append(a);
            c1360f = new C1360f(m5654g(), stringBuilder2.toString());
            try {
                Flushable a2 = CodedOutputStream.m5391a((OutputStream) c1360f);
                try {
                    m5574a(a2, date, thread, th, "error", false);
                    CommonUtils.m13614a(a2, "Failed to flush to non-fatal file.");
                } catch (Exception e) {
                    date = e;
                    flushable = a2;
                    try {
                        C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", date);
                        CommonUtils.m13614a(flushable, "Failed to flush to non-fatal file.");
                        CommonUtils.m13613a(c1360f, "Failed to close non-fatal file output stream.");
                        m5587a(m, 64);
                    } catch (Throwable th2) {
                        date = th2;
                        CommonUtils.m13614a(flushable, "Failed to flush to non-fatal file.");
                        CommonUtils.m13613a(c1360f, "Failed to close non-fatal file output stream.");
                        throw date;
                    }
                } catch (Throwable th3) {
                    date = th3;
                    flushable = a2;
                    CommonUtils.m13614a(flushable, "Failed to flush to non-fatal file.");
                    CommonUtils.m13613a(c1360f, "Failed to close non-fatal file output stream.");
                    throw date;
                }
            } catch (Exception e2) {
                date = e2;
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", date);
                CommonUtils.m13614a(flushable, "Failed to flush to non-fatal file.");
                CommonUtils.m13613a(c1360f, "Failed to close non-fatal file output stream.");
                m5587a(m, 64);
            }
        } catch (Exception e3) {
            date = e3;
            c1360f = null;
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", date);
            CommonUtils.m13614a(flushable, "Failed to flush to non-fatal file.");
            CommonUtils.m13613a(c1360f, "Failed to close non-fatal file output stream.");
            m5587a(m, 64);
        } catch (Throwable th4) {
            date = th4;
            c1360f = null;
            CommonUtils.m13614a(flushable, "Failed to flush to non-fatal file.");
            CommonUtils.m13613a(c1360f, "Failed to close non-fatal file output stream.");
            throw date;
        }
        CommonUtils.m13613a(c1360f, "Failed to close non-fatal file output stream.");
        try {
            m5587a(m, 64);
        } catch (Date date2) {
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An error occurred when trimming non-fatal files.", date2);
        }
    }

    /* renamed from: a */
    private void m5588a(String str, String str2, C1379b c1379b) {
        Flushable flushable = null;
        Closeable c1360f;
        try {
            Flushable a;
            File g = m5654g();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            c1360f = new C1360f(g, stringBuilder.toString());
            try {
                a = CodedOutputStream.m5391a((OutputStream) c1360f);
            } catch (Throwable th) {
                c1379b = th;
                str = new StringBuilder();
                str.append("Failed to flush to session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.m13614a(flushable, str.toString());
                str = new StringBuilder();
                str.append("Failed to close session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.m13613a(c1360f, str.toString());
                throw c1379b;
            }
            try {
                c1379b.mo1141a(a);
                c1379b = new StringBuilder();
                c1379b.append("Failed to flush to session ");
                c1379b.append(str2);
                c1379b.append(" file.");
                CommonUtils.m13614a(a, c1379b.toString());
                str = new StringBuilder();
                str.append("Failed to close session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.m13613a(c1360f, str.toString());
            } catch (Throwable th2) {
                c1379b = th2;
                flushable = a;
                str = new StringBuilder();
                str.append("Failed to flush to session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.m13614a(flushable, str.toString());
                str = new StringBuilder();
                str.append("Failed to close session ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.m13613a(c1360f, str.toString());
                throw c1379b;
            }
        } catch (Throwable th3) {
            c1379b = th3;
            c1360f = null;
            str = new StringBuilder();
            str.append("Failed to flush to session ");
            str.append(str2);
            str.append(" file.");
            CommonUtils.m13614a(flushable, str.toString());
            str = new StringBuilder();
            str.append("Failed to close session ");
            str.append(str2);
            str.append(" file.");
            CommonUtils.m13613a(c1360f, str.toString());
            throw c1379b;
        }
    }

    /* renamed from: a */
    private void m5589a(String str, String str2, C1381e c1381e) {
        Closeable closeable = null;
        try {
            File g = m5654g();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            Closeable fileOutputStream = new FileOutputStream(new File(g, stringBuilder.toString()));
            try {
                c1381e.mo1140a(fileOutputStream);
                str = new StringBuilder();
                str.append("Failed to close ");
                str.append(str2);
                str.append(" file.");
                CommonUtils.m13613a(fileOutputStream, str.toString());
            } catch (Throwable th) {
                str = th;
                closeable = fileOutputStream;
                c1381e = new StringBuilder();
                c1381e.append("Failed to close ");
                c1381e.append(str2);
                c1381e.append(" file.");
                CommonUtils.m13613a(closeable, c1381e.toString());
                throw str;
            }
        } catch (Throwable th2) {
            str = th2;
            c1381e = new StringBuilder();
            c1381e.append("Failed to close ");
            c1381e.append(str2);
            c1381e.append(" file.");
            CommonUtils.m13613a(closeable, c1381e.toString());
            throw str;
        }
    }

    /* renamed from: a */
    private byte[] m5597a(String str, String str2) {
        File g = m5654g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return ab.m5461a(new File(g, stringBuilder.toString()));
    }

    /* renamed from: a */
    private void m5590a(String str, Date date) {
        final String str2 = str;
        final String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{this.f4332j.getVersion()});
        final long time = date.getTime() / 1000;
        m5588a(str, "BeginSession", new C1379b(this) {
            /* renamed from: d */
            final /* synthetic */ C1386j f14734d;

            /* renamed from: a */
            public void mo1141a(CodedOutputStream codedOutputStream) {
                ai.m5508a(codedOutputStream, str2, format, time);
            }
        });
        m5589a(str, "BeginSession.json", new C1381e(this) {
            /* renamed from: d */
            final /* synthetic */ C1386j f14695d;

            /* renamed from: a */
            public void mo1140a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$18$1(this)).toString().getBytes());
            }
        });
    }

    /* renamed from: c */
    private void m5616c(String str) {
        String c = this.f4335m.m13650c();
        String str2 = this.f4338p.f4235e;
        String str3 = this.f4338p.f4236f;
        final String str4 = c;
        final String str5 = str2;
        final String str6 = str3;
        final String b = this.f4335m.m13649b();
        final int a = DeliveryMechanism.m13639a(this.f4338p.f4233c).m13640a();
        m5588a(str, "SessionApp", new C1379b(this) {
            /* renamed from: f */
            final /* synthetic */ C1386j f14701f;

            /* renamed from: a */
            public void mo1141a(CodedOutputStream codedOutputStream) {
                ai.m5510a(codedOutputStream, str4, this.f14701f.f4338p.f4231a, str5, str6, b, a, this.f14701f.f4345w);
            }
        });
        m5589a(str, "SessionApp.json", new C1381e(this) {
            /* renamed from: f */
            final /* synthetic */ C1386j f14707f;

            /* renamed from: a */
            public void mo1140a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$20$1(this)).toString().getBytes());
            }
        });
    }

    /* renamed from: d */
    private void m5620d(String str) {
        final boolean g = CommonUtils.m13631g(this.f4332j.getContext());
        m5588a(str, "SessionOS", new C1379b(this) {
            /* renamed from: b */
            final /* synthetic */ C1386j f14709b;

            /* renamed from: a */
            public void mo1141a(CodedOutputStream codedOutputStream) {
                ai.m5511a(codedOutputStream, VERSION.RELEASE, VERSION.CODENAME, g);
            }
        });
        m5589a(str, "SessionOS.json", new C1381e(this) {
            /* renamed from: b */
            final /* synthetic */ C1386j f14711b;

            /* renamed from: a */
            public void mo1140a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$22$1(this)).toString().getBytes());
            }
        });
    }

    /* renamed from: e */
    private void m5623e(String str) {
        String str2 = str;
        Context context = this.f4332j.getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a = CommonUtils.m13594a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = CommonUtils.m13617b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean f = CommonUtils.m13630f(context);
        final int i = a;
        final int i2 = availableProcessors;
        final long j = b;
        final long j2 = blockCount;
        final boolean z = f;
        long j3 = b;
        C1379b c1379b = r0;
        final Map h = this.f4335m.m13655h();
        int i3 = availableProcessors;
        final int h2 = CommonUtils.m13632h(context);
        AnonymousClass16 anonymousClass16 = new C1379b(this) {
            /* renamed from: h */
            final /* synthetic */ C1386j f14719h;

            /* renamed from: a */
            public void mo1141a(CodedOutputStream codedOutputStream) {
                ai.m5501a(codedOutputStream, i, Build.MODEL, i2, j, j2, z, h, h2, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        m5588a(str2, "SessionDevice", c1379b);
        i2 = i3;
        j = j3;
        m5589a(str2, "SessionDevice.json", new C1381e(this) {
            /* renamed from: h */
            final /* synthetic */ C1386j f14727h;

            /* renamed from: a */
            public void mo1140a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$24$1(this)).toString().getBytes());
            }
        });
    }

    /* renamed from: f */
    private void m5625f(String str) {
        final UserMetaData g = m5626g(str);
        m5588a(str, "SessionUser", new C1379b(this) {
            /* renamed from: b */
            final /* synthetic */ C1386j f14729b;

            /* renamed from: a */
            public void mo1141a(CodedOutputStream codedOutputStream) {
                ai.m5509a(codedOutputStream, g.id, g.name, g.email);
            }
        });
    }

    /* renamed from: a */
    private void m5574a(CodedOutputStream codedOutputStream, Date date, Thread thread, Throwable th, String str, boolean z) {
        boolean z2;
        Thread[] threadArr;
        TreeMap attributes;
        Map treeMap;
        am amVar = new am(th, this.f4344v);
        Context context = this.f4332j.getContext();
        long time = date.getTime() / 1000;
        Float c = CommonUtils.m13624c(context);
        int a = CommonUtils.m13596a(context, this.f4343u.m5669b());
        boolean d = CommonUtils.m13627d(context);
        int i = context.getResources().getConfiguration().orientation;
        long b = CommonUtils.m13617b() - CommonUtils.m13618b(context);
        long c2 = CommonUtils.m13623c(Environment.getDataDirectory().getPath());
        RunningAppProcessInfo a2 = CommonUtils.m13598a(context.getPackageName(), context);
        List linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = amVar.f4256c;
        String str2 = this.f4338p.f4232b;
        String c3 = this.f4335m.m13650c();
        int i2 = 0;
        if (z) {
            Map allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Entry entry : allStackTraces.entrySet()) {
                threadArr2[i2] = (Thread) entry.getKey();
                linkedList.add(r0.f4344v.mo1136a((StackTraceElement[]) entry.getValue()));
                i2++;
            }
            z2 = true;
            threadArr = threadArr2;
        } else {
            z2 = true;
            threadArr = new Thread[0];
        }
        if (CommonUtils.m13616a(context, "com.crashlytics.CollectCustomKeys", z2)) {
            attributes = r0.f4332j.getAttributes();
            if (attributes != null && attributes.size() > z2) {
                treeMap = new TreeMap(attributes);
                ai.m5502a(codedOutputStream, time, str, amVar, thread, stackTraceElementArr, threadArr, linkedList, treeMap, r0.f4340r, a2, i, c3, str2, c, a, d, b, c2);
            }
        }
        attributes = new TreeMap();
        treeMap = attributes;
        ai.m5502a(codedOutputStream, time, str, amVar, thread, stackTraceElementArr, threadArr, linkedList, treeMap, r0.f4340r, a2, i, c3, str2, c, a, d, b, c2);
    }

    /* renamed from: a */
    private void m5583a(File file, String str, int i) {
        String str2;
        StringBuilder stringBuilder;
        C2774k h = C2766c.m13524h();
        String str3 = CrashlyticsCore.TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Collecting session parts for ID ");
        stringBuilder2.append(str);
        h.mo3554a(str3, stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append("SessionCrash");
        File[] a = m5601a(new C1380d(stringBuilder3.toString()));
        boolean z = a != null && a.length > 0;
        C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(str);
        stringBuilder4.append("SessionEvent");
        File[] a2 = m5601a(new C1380d(stringBuilder4.toString()));
        boolean z2 = a2 != null && a2.length > 0;
        C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (!z) {
            if (!z2) {
                file = C2766c.m13524h();
                str2 = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("No events present for session ID ");
                stringBuilder.append(str);
                file.mo3554a(str2, stringBuilder.toString());
                file = C2766c.m13524h();
                str2 = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Removing session part files for ID ");
                stringBuilder.append(str);
                file.mo3554a(str2, stringBuilder.toString());
                m5586a(str);
            }
        }
        m5584a(file, str, m5602a(str, a2, i), z ? a[0] : null);
        file = C2766c.m13524h();
        str2 = CrashlyticsCore.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Removing session part files for ID ");
        stringBuilder.append(str);
        file.mo3554a(str2, stringBuilder.toString());
        m5586a(str);
    }

    /* renamed from: a */
    private void m5584a(File file, String str, File[] fileArr, File file2) {
        Closeable c1360f;
        Flushable a;
        StringBuilder stringBuilder;
        boolean z = file2 != null;
        File h = z ? m5655h() : m5656i();
        if (!h.exists()) {
            h.mkdirs();
        }
        Flushable flushable = null;
        try {
            c1360f = new C1360f(h, str);
            try {
                a = CodedOutputStream.m5391a((OutputStream) c1360f);
                try {
                    C2774k h2 = C2766c.m13524h();
                    String str2 = CrashlyticsCore.TAG;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Collecting SessionStart data for session ID ");
                    stringBuilder2.append(str);
                    h2.mo3554a(str2, stringBuilder2.toString());
                    C1386j.m5572a((CodedOutputStream) a, file);
                    a.m5418a(4, new Date().getTime() / 1000);
                    a.m5420a(5, z);
                    a.m5417a(11, 1);
                    a.m5428b(12, 3);
                    m5573a((CodedOutputStream) a, str);
                    C1386j.m5575a((CodedOutputStream) a, fileArr, str);
                    if (z) {
                        C1386j.m5572a((CodedOutputStream) a, file2);
                    }
                    CommonUtils.m13614a(a, "Error flushing session file stream");
                    CommonUtils.m13613a(c1360f, "Failed to close CLS file");
                } catch (Exception e) {
                    file = e;
                    flushable = a;
                    try {
                        fileArr = C2766c.m13524h();
                        file2 = CrashlyticsCore.TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to write session file for session ID: ");
                        stringBuilder.append(str);
                        fileArr.mo3562e(file2, stringBuilder.toString(), file);
                        CommonUtils.m13614a(flushable, "Error flushing session file stream");
                        m5576a((C1360f) c1360f);
                    } catch (Throwable th) {
                        file = th;
                        a = flushable;
                        CommonUtils.m13614a(a, "Error flushing session file stream");
                        CommonUtils.m13613a(c1360f, "Failed to close CLS file");
                        throw file;
                    }
                } catch (Throwable th2) {
                    file = th2;
                    CommonUtils.m13614a(a, "Error flushing session file stream");
                    CommonUtils.m13613a(c1360f, "Failed to close CLS file");
                    throw file;
                }
            } catch (Exception e2) {
                file = e2;
                fileArr = C2766c.m13524h();
                file2 = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to write session file for session ID: ");
                stringBuilder.append(str);
                fileArr.mo3562e(file2, stringBuilder.toString(), file);
                CommonUtils.m13614a(flushable, "Error flushing session file stream");
                m5576a((C1360f) c1360f);
            }
        } catch (Exception e3) {
            file = e3;
            c1360f = null;
            fileArr = C2766c.m13524h();
            file2 = CrashlyticsCore.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to write session file for session ID: ");
            stringBuilder.append(str);
            fileArr.mo3562e(file2, stringBuilder.toString(), file);
            CommonUtils.m13614a(flushable, "Error flushing session file stream");
            m5576a((C1360f) c1360f);
        } catch (Throwable th3) {
            file = th3;
            a = null;
            c1360f = a;
            CommonUtils.m13614a(a, "Error flushing session file stream");
            CommonUtils.m13613a(c1360f, "Failed to close CLS file");
            throw file;
        }
    }

    /* renamed from: a */
    private static void m5575a(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, CommonUtils.f11851a);
        for (File name : fileArr) {
            try {
                C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, name.getName()}));
                C1386j.m5572a(codedOutputStream, name);
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error writting non-fatal to session.", e);
            }
        }
    }

    /* renamed from: a */
    private void m5573a(CodedOutputStream codedOutputStream, String str) {
        for (String str2 : f4330h) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(".cls");
            File[] a = m5601a(new C1380d(stringBuilder.toString()));
            if (a.length == 0) {
                C2774k h = C2766c.m13524h();
                String str3 = CrashlyticsCore.TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Can't find ");
                stringBuilder2.append(str2);
                stringBuilder2.append(" data for session ID ");
                stringBuilder2.append(str);
                h.mo3562e(str3, stringBuilder2.toString(), null);
            } else {
                C2774k h2 = C2766c.m13524h();
                String str4 = CrashlyticsCore.TAG;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Collecting ");
                stringBuilder3.append(str2);
                stringBuilder3.append(" data for session ID ");
                stringBuilder3.append(str);
                h2.mo3554a(str4, stringBuilder3.toString());
                C1386j.m5572a(codedOutputStream, a[0]);
            }
        }
    }

    /* renamed from: a */
    private static void m5572a(CodedOutputStream codedOutputStream, File file) {
        Closeable fileInputStream;
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    C1386j.m5585a((InputStream) fileInputStream, codedOutputStream, (int) file.length());
                    CommonUtils.m13613a(fileInputStream, "Failed to close file input stream.");
                    return;
                } catch (Throwable th) {
                    codedOutputStream = th;
                    CommonUtils.m13613a(fileInputStream, "Failed to close file input stream.");
                    throw codedOutputStream;
                }
            } catch (Throwable th2) {
                codedOutputStream = th2;
                fileInputStream = null;
                CommonUtils.m13613a(fileInputStream, "Failed to close file input stream.");
                throw codedOutputStream;
            }
        }
        codedOutputStream = C2766c.m13524h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to include a file that doesn't exist: ");
        stringBuilder.append(file.getName());
        codedOutputStream.mo3562e(str, stringBuilder.toString(), null);
    }

    /* renamed from: a */
    private static void m5585a(InputStream inputStream, CodedOutputStream codedOutputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        codedOutputStream.m5425a(bArr);
    }

    /* renamed from: g */
    private UserMetaData m5626g(String str) {
        if (m5653f()) {
            return new UserMetaData(this.f4332j.getUserIdentifier(), this.f4332j.getUserName(), this.f4332j.getUserEmail());
        }
        return new C1400x(m5654g()).m5688a(str);
    }

    /* renamed from: f */
    boolean m5653f() {
        return this.f4348z != null && this.f4348z.m5665a();
    }

    /* renamed from: g */
    File m5654g() {
        return this.f4337o.mo3575a();
    }

    /* renamed from: h */
    File m5655h() {
        return new File(m5654g(), "fatal-sessions");
    }

    /* renamed from: i */
    File m5656i() {
        return new File(m5654g(), "nonfatal-sessions");
    }

    /* renamed from: j */
    File m5657j() {
        return new File(m5654g(), "invalidClsFiles");
    }

    /* renamed from: a */
    void m5640a(C2853s c2853s) {
        if (c2853s.f12058d.f12031e != null && this.f4346x.mo1155a() != null) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Registered Firebase Analytics event listener");
        }
    }

    /* renamed from: k */
    void m5658k() {
        this.f4343u.m5668a();
    }

    /* renamed from: b */
    private boolean m5611b(C2853s c2853s) {
        boolean z = false;
        if (c2853s == null) {
            return false;
        }
        if (c2853s.f12058d.f12027a != null && this.f4336n.m5471a() == null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private C1392o m5603b(String str, String str2) {
        String b = CommonUtils.m13620b(this.f4332j.getContext(), "com.crashlytics.ApiEndpoint");
        return new C3572g(new C3583q(this.f4332j, b, str, this.f4334l), new aa(this.f4332j, b, str2, this.f4334l));
    }

    /* renamed from: c */
    private void m5615c(C2853s c2853s) {
        if (c2853s == null) {
            C2766c.m13524h().mo3559d(CrashlyticsCore.TAG, "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context context = this.f4332j.getContext();
        ah ahVar = new ah(this.f4338p.f4231a, m5603b(c2853s.f12055a.f12021d, c2853s.f12055a.f12022e), this.f4341s, this.f4342t);
        for (File ajVar : m5649b()) {
            this.f4333k.m5555a(new C1384k(context, new aj(ajVar, f4329g), ahVar));
        }
    }

    /* renamed from: c */
    private static void m5617c(String str, String str2) {
        Answers answers = (Answers) C2766c.m13515a(Answers.class);
        if (answers == null) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new C4303b(str, str2));
        }
    }

    /* renamed from: d */
    private static void m5621d(String str, String str2) {
        Answers answers = (Answers) C2766c.m13515a(Answers.class);
        if (answers == null) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new C4302a(str, str2));
        }
    }

    /* renamed from: a */
    private void m5570a(long j) {
        if (m5634r()) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return;
        }
        if (this.f4347y != null) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j);
            this.f4347y.logEvent("clx", "_ae", bundle);
        } else {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    /* renamed from: r */
    private boolean m5634r() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = "com.google.firebase.crash.FirebaseCrash";	 Catch:{ ClassNotFoundException -> 0x0007 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0007 }
        r0 = 1;
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.j.r():boolean");
    }
}
