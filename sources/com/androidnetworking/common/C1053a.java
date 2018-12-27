package com.androidnetworking.common;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView.ScaleType;
import com.androidnetworking.error.ANError;
import com.androidnetworking.model.C1091a;
import com.androidnetworking.model.C1092b;
import com.androidnetworking.p043b.C1040b;
import com.androidnetworking.p044d.C1057a;
import com.androidnetworking.p044d.C1058b;
import com.androidnetworking.p044d.C1060d;
import com.androidnetworking.p044d.C1061e;
import com.androidnetworking.p044d.C1062f;
import com.androidnetworking.p044d.C1063g;
import com.androidnetworking.p044d.C1064h;
import com.androidnetworking.p044d.C1065i;
import com.androidnetworking.p044d.C1066j;
import com.androidnetworking.p044d.C1067k;
import com.androidnetworking.p044d.C1068l;
import com.androidnetworking.p044d.C1069m;
import com.androidnetworking.p044d.C1070n;
import com.androidnetworking.p044d.C1073p;
import com.androidnetworking.p044d.C1074q;
import com.androidnetworking.p045e.C1081b;
import com.androidnetworking.p046f.C1087a;
import com.androidnetworking.p046f.C1090c;
import com.google.gson.internal.C$Gson$Types;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import okhttp3.C2902d;
import okhttp3.C2903e;
import okhttp3.C2981s;
import okhttp3.C2981s.C2980a;
import okhttp3.C2984u;
import okhttp3.C2988w;
import okhttp3.C2991z;
import okhttp3.C4385q.C2978a;
import okhttp3.C4386v;
import okhttp3.C4386v.C2985a;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.aa;
import okio.C4905m;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.androidnetworking.common.a */
public class C1053a<T extends C1053a> {
    /* renamed from: a */
    private static final String f3493a = "a";
    /* renamed from: v */
    private static final C2984u f3494v = C2984u.m14560a("application/json; charset=utf-8");
    /* renamed from: w */
    private static final C2984u f3495w = C2984u.m14560a("text/x-markdown; charset=utf-8");
    /* renamed from: y */
    private static final Object f3496y = new Object();
    /* renamed from: A */
    private C2903e f3497A;
    /* renamed from: B */
    private int f3498B;
    /* renamed from: C */
    private boolean f3499C;
    /* renamed from: D */
    private boolean f3500D;
    /* renamed from: E */
    private boolean f3501E;
    /* renamed from: F */
    private int f3502F = 0;
    /* renamed from: G */
    private C1062f f3503G;
    /* renamed from: H */
    private C1063g f3504H;
    /* renamed from: I */
    private C1073p f3505I;
    /* renamed from: J */
    private C1069m f3506J;
    /* renamed from: K */
    private C1058b f3507K;
    /* renamed from: L */
    private C1070n f3508L;
    /* renamed from: M */
    private C1066j f3509M;
    /* renamed from: N */
    private C1065i f3510N;
    /* renamed from: O */
    private C1068l f3511O;
    /* renamed from: P */
    private C1064h f3512P;
    /* renamed from: Q */
    private C1067k f3513Q;
    /* renamed from: R */
    private C1061e f3514R;
    /* renamed from: S */
    private C1074q f3515S;
    /* renamed from: T */
    private C1060d f3516T;
    /* renamed from: U */
    private C1057a f3517U;
    /* renamed from: V */
    private Config f3518V;
    /* renamed from: W */
    private int f3519W;
    /* renamed from: X */
    private int f3520X;
    /* renamed from: Y */
    private ScaleType f3521Y;
    /* renamed from: Z */
    private C2902d f3522Z = null;
    private Executor aa = null;
    private C2988w ab = null;
    private String ac = null;
    private Type ad = null;
    /* renamed from: b */
    private int f3523b;
    /* renamed from: c */
    private Priority f3524c;
    /* renamed from: d */
    private int f3525d = 0;
    /* renamed from: e */
    private String f3526e;
    /* renamed from: f */
    private int f3527f;
    /* renamed from: g */
    private Object f3528g;
    /* renamed from: h */
    private ResponseType f3529h;
    /* renamed from: i */
    private HashMap<String, List<String>> f3530i = new HashMap();
    /* renamed from: j */
    private HashMap<String, String> f3531j = new HashMap();
    /* renamed from: k */
    private HashMap<String, String> f3532k = new HashMap();
    /* renamed from: l */
    private HashMap<String, C1092b> f3533l = new HashMap();
    /* renamed from: m */
    private HashMap<String, List<String>> f3534m = new HashMap();
    /* renamed from: n */
    private HashMap<String, String> f3535n = new HashMap();
    /* renamed from: o */
    private HashMap<String, List<C1091a>> f3536o = new HashMap();
    /* renamed from: p */
    private String f3537p;
    /* renamed from: q */
    private String f3538q;
    /* renamed from: r */
    private String f3539r = null;
    /* renamed from: s */
    private String f3540s = null;
    /* renamed from: t */
    private byte[] f3541t = null;
    /* renamed from: u */
    private File f3542u = null;
    /* renamed from: x */
    private C2984u f3543x = null;
    /* renamed from: z */
    private Future f3544z;

    /* renamed from: com.androidnetworking.common.a$2 */
    class C10452 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1053a f3466a;

        C10452(C1053a c1053a) {
            this.f3466a = c1053a;
        }

        public void run() {
            if (this.f3466a.f3516T != null) {
                this.f3466a.f3516T.m4508a();
            }
            this.f3466a.m4488s();
        }
    }

    /* renamed from: com.androidnetworking.common.a$3 */
    class C10463 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1053a f3467a;

        C10463(C1053a c1053a) {
            this.f3467a = c1053a;
        }

        public void run() {
            if (this.f3467a.f3516T != null) {
                this.f3467a.f3516T.m4508a();
            }
            this.f3467a.m4488s();
        }
    }

    /* renamed from: com.androidnetworking.common.a$a */
    public static class C1052a<T extends C1052a> {
        /* renamed from: a */
        private Priority f3477a = Priority.MEDIUM;
        /* renamed from: b */
        private int f3478b = 0;
        /* renamed from: c */
        private String f3479c;
        /* renamed from: d */
        private Object f3480d;
        /* renamed from: e */
        private Config f3481e;
        /* renamed from: f */
        private Options f3482f;
        /* renamed from: g */
        private int f3483g;
        /* renamed from: h */
        private int f3484h;
        /* renamed from: i */
        private ScaleType f3485i;
        /* renamed from: j */
        private HashMap<String, List<String>> f3486j = new HashMap();
        /* renamed from: k */
        private HashMap<String, List<String>> f3487k = new HashMap();
        /* renamed from: l */
        private HashMap<String, String> f3488l = new HashMap();
        /* renamed from: m */
        private C2902d f3489m;
        /* renamed from: n */
        private Executor f3490n;
        /* renamed from: o */
        private C2988w f3491o;
        /* renamed from: p */
        private String f3492p;

        public C1052a(String str) {
            this.f3479c = str;
            this.f3478b = 0;
        }

        /* renamed from: a */
        public T m4441a(Priority priority) {
            this.f3477a = priority;
            return this;
        }

        /* renamed from: a */
        public T m4442a(Object obj) {
            this.f3480d = obj;
            return this;
        }

        /* renamed from: a */
        public T m4443a(String str, String str2) {
            List list = (List) this.f3487k.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f3487k.put(str, list);
            }
            if (list.contains(str2) == null) {
                list.add(str2);
            }
            return this;
        }

        /* renamed from: b */
        public T m4446b(String str, String str2) {
            this.f3488l.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public T m4438a(Config config) {
            this.f3481e = config;
            return this;
        }

        /* renamed from: a */
        public T m4439a(Options options) {
            this.f3482f = options;
            return this;
        }

        /* renamed from: a */
        public T m4437a(int i) {
            this.f3484h = i;
            return this;
        }

        /* renamed from: b */
        public T m4445b(int i) {
            this.f3483g = i;
            return this;
        }

        /* renamed from: a */
        public T m4440a(ScaleType scaleType) {
            this.f3485i = scaleType;
            return this;
        }

        /* renamed from: a */
        public C1053a m4444a() {
            return new C1053a(this);
        }
    }

    /* renamed from: com.androidnetworking.common.a$1 */
    class C33351 implements C1061e {
        /* renamed from: a */
        final /* synthetic */ C1053a f14170a;

        C33351(C1053a c1053a) {
            this.f14170a = c1053a;
        }

        /* renamed from: a */
        public void mo906a(long j, long j2) {
            if (this.f14170a.f3514R != null && !this.f14170a.f3499C) {
                this.f14170a.f3514R.mo906a(j, j2);
            }
        }
    }

    /* renamed from: com.androidnetworking.common.a$4 */
    class C33364 implements C1074q {
        /* renamed from: a */
        final /* synthetic */ C1053a f14171a;

        C33364(C1053a c1053a) {
            this.f14171a = c1053a;
        }

        /* renamed from: a */
        public void mo907a(long j, long j2) {
            this.f14171a.f3498B = (int) ((100 * j) / j2);
            if (this.f14171a.f3515S != null && !this.f14171a.f3499C) {
                this.f14171a.f3515S.mo907a(j, j2);
            }
        }
    }

    public C1053a(C1052a c1052a) {
        this.f3523b = c1052a.f3478b;
        this.f3524c = c1052a.f3477a;
        this.f3526e = c1052a.f3479c;
        this.f3528g = c1052a.f3480d;
        this.f3530i = c1052a.f3486j;
        this.f3518V = c1052a.f3481e;
        this.f3520X = c1052a.f3484h;
        this.f3519W = c1052a.f3483g;
        this.f3521Y = c1052a.f3485i;
        this.f3534m = c1052a.f3487k;
        this.f3535n = c1052a.f3488l;
        this.f3522Z = c1052a.f3489m;
        this.aa = c1052a.f3490n;
        this.ab = c1052a.f3491o;
        this.ac = c1052a.f3492p;
    }

    /* renamed from: a */
    public void m4461a(C1058b c1058b) {
        this.f3529h = ResponseType.BITMAP;
        this.f3507K = c1058b;
        C1081b.m4563b().m4564a(this);
    }

    /* renamed from: a */
    public void m4462a(Class cls, C1070n c1070n) {
        this.ad = cls;
        this.f3529h = ResponseType.PARSED;
        this.f3508L = c1070n;
        C1081b.m4563b().m4564a(this);
    }

    /* renamed from: b */
    public void m4469b(Class cls, C1070n c1070n) {
        this.ad = C$Gson$Types.m12897a((Type) null, (Type) List.class, cls);
        this.f3529h = ResponseType.PARSED;
        this.f3508L = c1070n;
        C1081b.m4563b().m4564a(this);
    }

    /* renamed from: a */
    public C1057a m4457a() {
        return this.f3517U;
    }

    /* renamed from: b */
    public int m4467b() {
        return this.f3523b;
    }

    /* renamed from: c */
    public Priority m4472c() {
        return this.f3524c;
    }

    /* renamed from: d */
    public String m4473d() {
        String str = this.f3526e;
        for (Entry entry : this.f3535n.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{");
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("}");
            str = str.replace(stringBuilder.toString(), String.valueOf(entry.getValue()));
        }
        Builder n = HttpUrl.m13959e(str).m13975n();
        if (this.f3534m != null) {
            for (Entry entry2 : this.f3534m.entrySet()) {
                String str2 = (String) entry2.getKey();
                List<String> list = (List) entry2.getValue();
                if (list != null) {
                    for (String a : list) {
                        n.m13939a(str2, a);
                    }
                }
            }
        }
        return n.m13943c().toString();
    }

    /* renamed from: e */
    public int m4474e() {
        return this.f3527f;
    }

    /* renamed from: a */
    public void m4459a(int i) {
        this.f3527f = i;
    }

    /* renamed from: f */
    public ResponseType m4475f() {
        return this.f3529h;
    }

    /* renamed from: g */
    public int m4476g() {
        return this.f3525d;
    }

    /* renamed from: h */
    public C2988w m4477h() {
        return this.ab;
    }

    /* renamed from: a */
    public void m4463a(String str) {
        this.ac = str;
    }

    /* renamed from: i */
    public String m4478i() {
        return this.ac;
    }

    /* renamed from: j */
    public C1061e m4479j() {
        return new C33351(this);
    }

    /* renamed from: k */
    public void m4480k() {
        this.f3500D = true;
        if (this.f3516T == null) {
            m4488s();
        } else if (this.f3499C) {
            m4468b(new ANError());
            m4488s();
        } else if (this.aa != null) {
            this.aa.execute(new C10452(this));
        } else {
            C1040b.m4416a().m4417b().mo903c().execute(new C10463(this));
        }
    }

    /* renamed from: l */
    public C1074q m4481l() {
        return new C33364(this);
    }

    /* renamed from: m */
    public String m4482m() {
        return this.f3537p;
    }

    /* renamed from: n */
    public String m4483n() {
        return this.f3538q;
    }

    /* renamed from: o */
    public C2902d m4484o() {
        return this.f3522Z;
    }

    /* renamed from: a */
    public void m4466a(boolean z) {
        if (!z) {
            try {
                if (this.f3502F) {
                    if (this.f3498B >= this.f3502F) {
                        return;
                    }
                }
            } catch (boolean z2) {
                z2.printStackTrace();
                return;
            }
        }
        this.f3499C = true;
        this.f3501E = false;
        if (this.f3497A != null) {
            this.f3497A.mo3690b();
        }
        if (this.f3544z != null) {
            this.f3544z.cancel(true);
        }
        if (!this.f3500D) {
            m4468b(new ANError());
        }
    }

    /* renamed from: p */
    public boolean m4485p() {
        return this.f3499C;
    }

    /* renamed from: b */
    public void m4471b(boolean z) {
        this.f3501E = z;
    }

    /* renamed from: q */
    public C2903e m4486q() {
        return this.f3497A;
    }

    /* renamed from: a */
    public void m4465a(C2903e c2903e) {
        this.f3497A = c2903e;
    }

    /* renamed from: a */
    public void m4464a(Future future) {
        this.f3544z = future;
    }

    /* renamed from: r */
    public void m4487r() {
        this.f3503G = null;
        this.f3504H = null;
        this.f3505I = null;
        this.f3507K = null;
        this.f3508L = null;
        this.f3514R = null;
        this.f3515S = null;
        this.f3516T = null;
        this.f3517U = null;
    }

    /* renamed from: s */
    public void m4488s() {
        m4487r();
        C1081b.m4563b().m4565b(this);
    }

    /* renamed from: a */
    public C1054b m4456a(aa aaVar) {
        switch (this.f3529h) {
            case JSON_ARRAY:
                try {
                    return C1054b.m4493a(new JSONArray(C4905m.a(aaVar.m14017h().mo916c()).mo4575p()));
                } catch (Throwable e) {
                    return C1054b.m4492a(C1090c.m4597b(new ANError(e)));
                }
            case JSON_OBJECT:
                try {
                    return C1054b.m4493a(new JSONObject(C4905m.a(aaVar.m14017h().mo916c()).mo4575p()));
                } catch (Throwable e2) {
                    return C1054b.m4492a(C1090c.m4597b(new ANError(e2)));
                }
            case STRING:
                try {
                    return C1054b.m4493a(C4905m.a(aaVar.m14017h().mo916c()).mo4575p());
                } catch (Throwable e22) {
                    return C1054b.m4492a(C1090c.m4597b(new ANError(e22)));
                }
            case BITMAP:
                synchronized (f3496y) {
                    try {
                        aaVar = C1090c.m4589a(aaVar, this.f3519W, this.f3520X, this.f3518V, this.f3521Y);
                    } catch (Throwable e222) {
                        return C1054b.m4492a(C1090c.m4597b(new ANError(e222)));
                    }
                }
                return aaVar;
            case PARSED:
                try {
                    return C1054b.m4493a(C1087a.m4584a().mo904a(this.ad).mo905a(aaVar.m14017h()));
                } catch (Throwable e2222) {
                    return C1054b.m4492a(C1090c.m4597b(new ANError(e2222)));
                }
            case PREFETCH:
                try {
                    C4905m.a(aaVar.m14017h().mo916c()).mo4565i(Long.MAX_VALUE);
                    return C1054b.m4493a((Object) "prefetch");
                } catch (Throwable e22222) {
                    return C1054b.m4492a(C1090c.m4597b(new ANError(e22222)));
                }
            default:
                return null;
        }
    }

    /* renamed from: a */
    public ANError m4458a(ANError aNError) {
        try {
            if (!(aNError.m4579a() == null || aNError.m4579a().m14017h() == null || aNError.m4579a().m14017h().mo916c() == null)) {
                aNError.m4583b(C4905m.a(aNError.m4579a().m14017h().mo916c()).mo4575p());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aNError;
    }

    /* renamed from: b */
    public synchronized void m4468b(ANError aNError) {
        try {
            if (!this.f3500D) {
                if (this.f3499C) {
                    aNError.m4582b();
                    aNError.m4580a(0);
                }
                m4453c(aNError);
            }
            this.f3500D = true;
        } catch (ANError aNError2) {
            aNError2.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public void m4460a(final C1054b c1054b) {
        try {
            this.f3500D = true;
            if (this.f3499C) {
                ANError aNError = new ANError();
                aNError.m4582b();
                aNError.m4580a(0);
                m4453c(aNError);
                m4488s();
            } else if (this.aa != null) {
                this.aa.execute(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1053a f3469b;

                    public void run() {
                        this.f3469b.m4450b(c1054b);
                    }
                });
            } else {
                C1040b.m4416a().m4417b().mo903c().execute(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1053a f3471b;

                    public void run() {
                        this.f3471b.m4450b(c1054b);
                    }
                });
            }
        } catch (C1054b c1054b2) {
            c1054b2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m4450b(C1054b c1054b) {
        if (this.f3504H != null) {
            this.f3504H.m4514a((JSONObject) c1054b.m4494a());
        } else if (this.f3503G != null) {
            this.f3503G.m4512a((JSONArray) c1054b.m4494a());
        } else if (this.f3505I != null) {
            this.f3505I.m4532a((String) c1054b.m4494a());
        } else if (this.f3507K != null) {
            this.f3507K.mo908a((Bitmap) c1054b.m4494a());
        } else if (this.f3508L != null) {
            this.f3508L.mo1492a(c1054b.m4494a());
        } else if (this.f3509M != null) {
            this.f3509M.m4520a(c1054b.m4498d(), (JSONObject) c1054b.m4494a());
        } else if (this.f3510N != null) {
            this.f3510N.m4518a(c1054b.m4498d(), (JSONArray) c1054b.m4494a());
        } else if (this.f3511O != null) {
            this.f3511O.m4524a(c1054b.m4498d(), (String) c1054b.m4494a());
        } else if (this.f3512P != null) {
            this.f3512P.m4516a(c1054b.m4498d(), (Bitmap) c1054b.m4494a());
        } else if (this.f3513Q != null) {
            this.f3513Q.m4522a(c1054b.m4498d(), c1054b.m4494a());
        }
        m4488s();
    }

    /* renamed from: c */
    private void m4453c(ANError aNError) {
        if (this.f3504H != null) {
            this.f3504H.m4513a(aNError);
        } else if (this.f3503G != null) {
            this.f3503G.m4511a(aNError);
        } else if (this.f3505I != null) {
            this.f3505I.m4531a(aNError);
        } else if (this.f3507K != null) {
            this.f3507K.mo909a(aNError);
        } else if (this.f3508L != null) {
            this.f3508L.mo1491a(aNError);
        } else if (this.f3506J != null) {
            this.f3506J.m4525a(aNError);
        } else if (this.f3509M != null) {
            this.f3509M.m4519a(aNError);
        } else if (this.f3510N != null) {
            this.f3510N.m4517a(aNError);
        } else if (this.f3511O != null) {
            this.f3511O.m4523a(aNError);
        } else if (this.f3512P != null) {
            this.f3512P.m4515a(aNError);
        } else if (this.f3513Q != null) {
            this.f3513Q.m4521a(aNError);
        } else if (this.f3516T != null) {
            this.f3516T.m4509a(aNError);
        }
    }

    /* renamed from: b */
    public void m4470b(final aa aaVar) {
        try {
            this.f3500D = true;
            if (this.f3499C) {
                ANError aNError = new ANError();
                aNError.m4582b();
                aNError.m4580a(0);
                if (this.f3506J != null) {
                    this.f3506J.m4525a(aNError);
                }
                m4488s();
            } else if (this.aa != null) {
                this.aa.execute(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1053a f3473b;

                    public void run() {
                        if (this.f3473b.f3506J != null) {
                            this.f3473b.f3506J.m4526a(aaVar);
                        }
                        this.f3473b.m4488s();
                    }
                });
            } else {
                C1040b.m4416a().m4417b().mo903c().execute(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1053a f3475b;

                    public void run() {
                        if (this.f3475b.f3506J != null) {
                            this.f3475b.f3506J.m4526a(aaVar);
                        }
                        this.f3475b.m4488s();
                    }
                });
            }
        } catch (aa aaVar2) {
            aaVar2.printStackTrace();
        }
    }

    /* renamed from: t */
    public C2991z m4489t() {
        if (this.f3539r != null) {
            if (this.f3543x != null) {
                return C2991z.m14632a(this.f3543x, this.f3539r);
            }
            return C2991z.m14632a(f3494v, this.f3539r);
        } else if (this.f3540s != null) {
            if (this.f3543x != null) {
                return C2991z.m14632a(this.f3543x, this.f3540s);
            }
            return C2991z.m14632a(f3495w, this.f3540s);
        } else if (this.f3542u != null) {
            if (this.f3543x != null) {
                return C2991z.m14631a(this.f3543x, this.f3542u);
            }
            return C2991z.m14631a(f3495w, this.f3542u);
        } else if (this.f3541t == null) {
            C2978a c2978a = new C2978a();
            try {
                for (Entry entry : this.f3531j.entrySet()) {
                    c2978a.m14527a((String) entry.getKey(), (String) entry.getValue());
                }
                for (Entry entry2 : this.f3532k.entrySet()) {
                    c2978a.m14529b((String) entry2.getKey(), (String) entry2.getValue());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return c2978a.m14528a();
        } else if (this.f3543x != null) {
            return C2991z.m14633a(this.f3543x, this.f3541t);
        } else {
            return C2991z.m14633a(f3495w, this.f3541t);
        }
    }

    /* renamed from: u */
    public C2991z m4490u() {
        C2985a a = new C2985a().m14565a(this.f3543x == null ? C4386v.f18244e : this.f3543x);
        try {
            for (Entry entry : this.f3533l.entrySet()) {
                C1092b c1092b = (C1092b) entry.getValue();
                C2984u c2984u = null;
                if (c1092b.f3598b != null) {
                    c2984u = C2984u.m14560a(c1092b.f3598b);
                }
                String[] strArr = new String[2];
                strArr[0] = "Content-Disposition";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("form-data; name=\"");
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append("\"");
                strArr[1] = stringBuilder.toString();
                a.m14564a(C2981s.m14545a(strArr), C2991z.m14632a(c2984u, c1092b.f3597a));
            }
            for (Entry entry2 : this.f3536o.entrySet()) {
                for (C1091a c1091a : (List) entry2.getValue()) {
                    C2984u a2;
                    String name = c1091a.f3595a.getName();
                    if (c1091a.f3596b != null) {
                        a2 = C2984u.m14560a(c1091a.f3596b);
                    } else {
                        a2 = C2984u.m14560a(C1090c.m4593a(name));
                    }
                    C2991z a3 = C2991z.m14631a(a2, c1091a.f3595a);
                    String[] strArr2 = new String[2];
                    strArr2[0] = "Content-Disposition";
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("form-data; name=\"");
                    stringBuilder2.append((String) entry2.getKey());
                    stringBuilder2.append("\"; filename=\"");
                    stringBuilder2.append(name);
                    stringBuilder2.append("\"");
                    strArr2[1] = stringBuilder2.toString();
                    a.m14564a(C2981s.m14545a(strArr2), a3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a.m14567a();
    }

    /* renamed from: v */
    public C2981s m4491v() {
        C2980a c2980a = new C2980a();
        try {
            if (this.f3530i != null) {
                for (Entry entry : this.f3530i.entrySet()) {
                    String str = (String) entry.getKey();
                    List<String> list = (List) entry.getValue();
                    if (list != null) {
                        for (String a : list) {
                            c2980a.m14538a(str, a);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c2980a.m14539a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ANRequest{sequenceNumber='");
        stringBuilder.append(this.f3527f);
        stringBuilder.append(", mMethod=");
        stringBuilder.append(this.f3523b);
        stringBuilder.append(", mPriority=");
        stringBuilder.append(this.f3524c);
        stringBuilder.append(", mRequestType=");
        stringBuilder.append(this.f3525d);
        stringBuilder.append(", mUrl=");
        stringBuilder.append(this.f3526e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
