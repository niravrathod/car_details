package com.feedbox.p121a;

import com.androidnetworking.C1037a;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.p044d.C1070n;
import com.feedbox.C2109c;
import com.feedbox.C2110d;
import com.feedbox.data.network.model.C2112b;
import com.feedbox.data.network.model.C2115e;
import com.feedbox.data.network.model.Content;
import com.feedbox.p121a.p122a.C2097b;
import com.feedbox.p123b.C2104b;
import com.feedbox.p123b.C2107e;
import java.util.List;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.a.a */
public final class C2099a {
    /* renamed from: a */
    public static final C2099a f6431a = new C2099a();

    /* renamed from: com.feedbox.a.a$a */
    public interface C2095a<T> {
        /* renamed from: a */
        void mo1229a(T t);

        /* renamed from: a */
        void mo1230a(String str);
    }

    /* renamed from: com.feedbox.a.a$b */
    public static final class C3928b implements C1070n<C2097b> {
        /* renamed from: a */
        final /* synthetic */ C2095a f15661a;

        C3928b(C2095a c2095a) {
            this.f15661a = c2095a;
        }

        /* renamed from: a */
        public void m19565a(C2097b c2097b) {
            if (c2097b != null) {
                C2109c.f6446a.m7675a(c2097b);
                C2109c.f6446a.m7674a().m7657d().m7649a(((C2110d) C2110d.f6448c.m7672a()).m7680d());
                this.f15661a.mo1229a((Object) c2097b);
                return;
            }
            this.f15661a.mo1230a("Something Went Wrong");
        }

        /* renamed from: a */
        public void mo1491a(ANError aNError) {
            String message;
            C2095a c2095a = this.f15661a;
            if (aNError != null) {
                message = aNError.getMessage();
                if (message != null) {
                    c2095a.mo1230a(message);
                }
            }
            message = "Something Went Wrong";
            c2095a.mo1230a(message);
        }
    }

    /* renamed from: com.feedbox.a.a$c */
    public static final class C3929c implements C1070n<C2112b> {
        /* renamed from: a */
        final /* synthetic */ C2095a f15662a;

        C3929c(C2095a c2095a) {
            this.f15662a = c2095a;
        }

        /* renamed from: a */
        public void m19568a(C2112b c2112b) {
            if (c2112b != null) {
                this.f15662a.mo1229a((Object) c2112b);
            } else {
                this.f15662a.mo1230a("Something Went Wrong");
            }
        }

        /* renamed from: a */
        public void mo1491a(ANError aNError) {
            String message;
            C2095a c2095a = this.f15662a;
            if (aNError != null) {
                message = aNError.getMessage();
                if (message != null) {
                    c2095a.mo1230a(message);
                }
            }
            message = "Something Went Wrong";
            c2095a.mo1230a(message);
        }
    }

    /* renamed from: com.feedbox.a.a$d */
    public static final class C3930d implements C1070n<List<Content>> {
        /* renamed from: a */
        final /* synthetic */ C2095a f15663a;

        C3930d(C2095a c2095a) {
            this.f15663a = c2095a;
        }

        /* renamed from: a */
        public void m19572a(List<Content> list) {
            if (list != null) {
                this.f15663a.mo1229a((Object) list);
            } else {
                this.f15663a.mo1230a("Something Went Wrong");
            }
        }

        /* renamed from: a */
        public void mo1491a(ANError aNError) {
            String message;
            C2095a c2095a = this.f15663a;
            if (aNError != null) {
                message = aNError.getMessage();
                if (message != null) {
                    c2095a.mo1230a(message);
                }
            }
            message = "Something Went Wrong";
            c2095a.mo1230a(message);
        }
    }

    /* renamed from: com.feedbox.a.a$e */
    public static final class C3931e implements C1070n<C2115e> {
        /* renamed from: a */
        final /* synthetic */ C2095a f15664a;

        C3931e(C2095a c2095a) {
            this.f15664a = c2095a;
        }

        /* renamed from: a */
        public void m19574a(C2115e c2115e) {
            if (c2115e != null) {
                this.f15664a.mo1229a((Object) c2115e);
            } else {
                this.f15664a.mo1230a("Something Went Wrong");
            }
        }

        /* renamed from: a */
        public void mo1491a(ANError aNError) {
            String message;
            C2095a c2095a = this.f15664a;
            if (aNError != null) {
                message = aNError.getMessage();
                if (message != null) {
                    c2095a.mo1230a(message);
                }
            }
            message = "Something Went Wrong";
            c2095a.mo1230a(message);
        }
    }

    private C2099a() {
    }

    /* renamed from: a */
    public final void m7660a(C2095a<C2097b> c2095a) {
        C2885g.m13910b(c2095a, "callbacks");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2107e.m7673a());
        stringBuilder.append("config/{appId}");
        C1037a.m4413a(stringBuilder.toString()).m4446b("appId", C2104b.f6439a.m7668b()).m4441a(Priority.HIGH).m4444a().m4462a(C2097b.class, (C1070n) new C3928b(c2095a));
    }

    /* renamed from: b */
    public final void m7662b(C2095a<C2112b> c2095a) {
        C2885g.m13910b(c2095a, "callbacks");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2107e.m7673a());
        stringBuilder.append("page/{pageId}");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("homepage_");
        stringBuilder2.append(C2104b.f6439a.m7668b());
        C1037a.m4413a(stringBuilder.toString()).m4446b("pageId", stringBuilder2.toString()).m4443a("buildVersion", String.valueOf(((C2110d) C2110d.f6448c.m7672a()).m7679c())).m4443a("osType", "ANDROID").m4441a(Priority.HIGH).m4444a().m4462a(C2112b.class, (C1070n) new C3929c(c2095a));
    }

    /* renamed from: a */
    public final void m7661a(String str, C2095a<List<Content>> c2095a) {
        C2885g.m13910b(str, "packageID");
        C2885g.m13910b(c2095a, "callbacks");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2107e.m7673a());
        stringBuilder.append("package/{package}");
        C1037a.m4413a(stringBuilder.toString()).m4446b("package", str).m4441a(Priority.HIGH).m4444a().m4469b(Content.class, new C3930d(c2095a));
    }

    /* renamed from: b */
    public final void m7663b(String str, C2095a<C2115e> c2095a) {
        C2885g.m13910b(str, "playId");
        C2885g.m13910b(c2095a, "callbacks");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2107e.m7673a());
        stringBuilder.append("content/related/{playId}");
        C1037a.m4413a(stringBuilder.toString()).m4446b("playId", str).m4444a().m4462a(C2115e.class, (C1070n) new C3931e(c2095a));
    }
}
