package com.androidnetworking.p045e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView.ScaleType;
import com.androidnetworking.C1037a;
import com.androidnetworking.common.C1053a;
import com.androidnetworking.error.ANError;
import com.androidnetworking.p042a.C3331a;
import com.androidnetworking.p044d.C1058b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.androidnetworking.e.a */
public class C1080a {
    /* renamed from: a */
    private static final int f3566a = ((int) (Runtime.getRuntime().maxMemory() / 1024));
    /* renamed from: b */
    private static final int f3567b = (f3566a / 8);
    /* renamed from: j */
    private static C1080a f3568j;
    /* renamed from: c */
    private int f3569c = 100;
    /* renamed from: d */
    private final C1077b f3570d;
    /* renamed from: e */
    private final HashMap<String, C1076a> f3571e = new HashMap();
    /* renamed from: f */
    private final HashMap<String, C1076a> f3572f = new HashMap();
    /* renamed from: g */
    private final Handler f3573g = new Handler(Looper.getMainLooper());
    /* renamed from: h */
    private Runnable f3574h;
    /* renamed from: i */
    private Options f3575i = new Options();

    /* renamed from: com.androidnetworking.e.a$2 */
    class C10752 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1080a f3555a;

        C10752(C1080a c1080a) {
            this.f3555a = c1080a;
        }

        public void run() {
            for (C1076a c1076a : this.f3555a.f3572f.values()) {
                Iterator it = c1076a.f3560e.iterator();
                while (it.hasNext()) {
                    C1078c c1078c = (C1078c) it.next();
                    if (c1078c.f3563c != null) {
                        if (c1076a.m4537a() == null) {
                            c1078c.f3562b = c1076a.f3558c;
                            c1078c.f3563c.mo917a(c1078c, false);
                        } else {
                            c1078c.f3563c.mo918a(c1076a.m4537a());
                        }
                    }
                }
            }
            this.f3555a.f3572f.clear();
            this.f3555a.f3574h = null;
        }
    }

    /* renamed from: com.androidnetworking.e.a$a */
    private class C1076a {
        /* renamed from: a */
        final /* synthetic */ C1080a f3556a;
        /* renamed from: b */
        private final C1053a f3557b;
        /* renamed from: c */
        private Bitmap f3558c;
        /* renamed from: d */
        private ANError f3559d;
        /* renamed from: e */
        private final LinkedList<C1078c> f3560e = new LinkedList();

        public C1076a(C1080a c1080a, C1053a c1053a, C1078c c1078c) {
            this.f3556a = c1080a;
            this.f3557b = c1053a;
            this.f3560e.add(c1078c);
        }

        /* renamed from: a */
        public void m4539a(ANError aNError) {
            this.f3559d = aNError;
        }

        /* renamed from: a */
        public ANError m4537a() {
            return this.f3559d;
        }

        /* renamed from: a */
        public void m4538a(C1078c c1078c) {
            this.f3560e.add(c1078c);
        }

        /* renamed from: b */
        public boolean m4540b(C1078c c1078c) {
            this.f3560e.remove(c1078c);
            if (this.f3560e.size() != null) {
                return null;
            }
            this.f3557b.m4466a(true);
            if (this.f3557b.m4485p() != null) {
                this.f3557b.m4487r();
                C1081b.m4563b().m4565b(this.f3557b);
            }
            return true;
        }
    }

    /* renamed from: com.androidnetworking.e.a$b */
    public interface C1077b {
        /* renamed from: a */
        Bitmap mo899a(String str);

        /* renamed from: b */
        void mo900b(String str, Bitmap bitmap);
    }

    /* renamed from: com.androidnetworking.e.a$c */
    public class C1078c {
        /* renamed from: a */
        final /* synthetic */ C1080a f3561a;
        /* renamed from: b */
        private Bitmap f3562b;
        /* renamed from: c */
        private final C1079d f3563c;
        /* renamed from: d */
        private final String f3564d;
        /* renamed from: e */
        private final String f3565e;

        public C1078c(C1080a c1080a, Bitmap bitmap, String str, String str2, C1079d c1079d) {
            this.f3561a = c1080a;
            this.f3562b = bitmap;
            this.f3565e = str;
            this.f3564d = str2;
            this.f3563c = c1079d;
        }

        /* renamed from: a */
        public void m4545a() {
            if (this.f3563c != null) {
                C1076a c1076a = (C1076a) this.f3561a.f3571e.get(this.f3564d);
                if (c1076a == null) {
                    c1076a = (C1076a) this.f3561a.f3572f.get(this.f3564d);
                    if (c1076a != null) {
                        c1076a.m4540b(this);
                        if (c1076a.f3560e.size() == 0) {
                            this.f3561a.f3572f.remove(this.f3564d);
                        }
                    }
                } else if (c1076a.m4540b(this)) {
                    this.f3561a.f3571e.remove(this.f3564d);
                }
            }
        }

        /* renamed from: b */
        public Bitmap m4546b() {
            return this.f3562b;
        }

        /* renamed from: c */
        public String m4547c() {
            return this.f3565e;
        }
    }

    /* renamed from: com.androidnetworking.e.a$d */
    public interface C1079d {
        /* renamed from: a */
        void mo917a(C1078c c1078c, boolean z);

        /* renamed from: a */
        void mo918a(ANError aNError);
    }

    /* renamed from: a */
    public static void m4553a() {
        C1080a.m4555b();
    }

    /* renamed from: b */
    public static C1080a m4555b() {
        if (f3568j == null) {
            synchronized (C1080a.class) {
                if (f3568j == null) {
                    f3568j = new C1080a(new C3331a(f3567b));
                }
            }
        }
        return f3568j;
    }

    public C1080a(C1077b c1077b) {
        this.f3570d = c1077b;
    }

    /* renamed from: a */
    public C1078c m4559a(String str, C1079d c1079d, int i, int i2, ScaleType scaleType) {
        C1079d c1079d2 = c1079d;
        m4557c();
        String a = C1080a.m4551a(str, i, i2, scaleType);
        Bitmap a2 = this.f3570d.mo899a(a);
        if (a2 != null) {
            C1078c c1078c = new C1078c(this, a2, str, null, null);
            c1079d2.mo917a(c1078c, true);
            return c1078c;
        }
        c1078c = new C1078c(this, null, str, a, c1079d);
        c1079d2.mo917a(c1078c, true);
        C1076a c1076a = (C1076a) r6.f3571e.get(a);
        if (c1076a != null) {
            c1076a.m4538a(c1078c);
            return c1078c;
        }
        r6.f3571e.put(a, new C1076a(this, m4558a(str, i, i2, scaleType, a), c1078c));
        return c1078c;
    }

    /* renamed from: a */
    protected C1053a m4558a(String str, int i, int i2, ScaleType scaleType, final String str2) {
        str = C1037a.m4413a(str).m4442a((Object) "ImageRequestTag").m4437a(i2).m4445b(i).m4440a(scaleType).m4438a(Config.RGB_565).m4439a(this.f3575i).m4444a();
        str.m4461a(new C1058b(this) {
            /* renamed from: b */
            final /* synthetic */ C1080a f14173b;

            /* renamed from: a */
            public void mo908a(Bitmap bitmap) {
                this.f14173b.m4560a(str2, bitmap);
            }

            /* renamed from: a */
            public void mo909a(ANError aNError) {
                this.f14173b.m4561a(str2, aNError);
            }
        });
        return str;
    }

    /* renamed from: a */
    protected void m4560a(String str, Bitmap bitmap) {
        this.f3570d.mo900b(str, bitmap);
        C1076a c1076a = (C1076a) this.f3571e.remove(str);
        if (c1076a != null) {
            c1076a.f3558c = bitmap;
            m4554a(str, c1076a);
        }
    }

    /* renamed from: a */
    protected void m4561a(String str, ANError aNError) {
        C1076a c1076a = (C1076a) this.f3571e.remove(str);
        if (c1076a != null) {
            c1076a.m4539a(aNError);
            m4554a(str, c1076a);
        }
    }

    /* renamed from: a */
    private void m4554a(String str, C1076a c1076a) {
        this.f3572f.put(str, c1076a);
        if (this.f3574h == null) {
            this.f3574h = new C10752(this);
            this.f3573g.postDelayed(this.f3574h, (long) this.f3569c);
        }
    }

    /* renamed from: c */
    private void m4557c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    /* renamed from: a */
    private static String m4551a(String str, int i, int i2, ScaleType scaleType) {
        StringBuilder stringBuilder = new StringBuilder(str.length() + 12);
        stringBuilder.append("#W");
        stringBuilder.append(i);
        stringBuilder.append("#H");
        stringBuilder.append(i2);
        stringBuilder.append("#S");
        stringBuilder.append(scaleType.ordinal());
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
