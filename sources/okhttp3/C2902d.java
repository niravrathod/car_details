package okhttp3;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.p156b.C2924e;

/* renamed from: okhttp3.d */
public final class C2902d {
    /* renamed from: a */
    public static final C2902d f12212a = new C2901a().m14054a().m14057c();
    /* renamed from: b */
    public static final C2902d f12213b = new C2901a().m14056b().m14055a(BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).m14057c();
    @Nullable
    /* renamed from: c */
    String f12214c;
    /* renamed from: d */
    private final boolean f12215d;
    /* renamed from: e */
    private final boolean f12216e;
    /* renamed from: f */
    private final int f12217f;
    /* renamed from: g */
    private final int f12218g;
    /* renamed from: h */
    private final boolean f12219h;
    /* renamed from: i */
    private final boolean f12220i;
    /* renamed from: j */
    private final boolean f12221j;
    /* renamed from: k */
    private final int f12222k;
    /* renamed from: l */
    private final int f12223l;
    /* renamed from: m */
    private final boolean f12224m;
    /* renamed from: n */
    private final boolean f12225n;
    /* renamed from: o */
    private final boolean f12226o;

    /* renamed from: okhttp3.d$a */
    public static final class C2901a {
        /* renamed from: a */
        boolean f12204a;
        /* renamed from: b */
        boolean f12205b;
        /* renamed from: c */
        int f12206c = -1;
        /* renamed from: d */
        int f12207d = -1;
        /* renamed from: e */
        int f12208e = -1;
        /* renamed from: f */
        boolean f12209f;
        /* renamed from: g */
        boolean f12210g;
        /* renamed from: h */
        boolean f12211h;

        /* renamed from: a */
        public C2901a m14054a() {
            this.f12204a = true;
            return this;
        }

        /* renamed from: a */
        public C2901a m14055a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                i = timeUnit.toSeconds((long) i);
                this.f12207d = i > 2147483647L ? BaseClientBuilder.API_PRIORITY_OTHER : (int) i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("maxStale < 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /* renamed from: b */
        public C2901a m14056b() {
            this.f12209f = true;
            return this;
        }

        /* renamed from: c */
        public C2902d m14057c() {
            return new C2902d(this);
        }
    }

    private C2902d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f12215d = z;
        this.f12216e = z2;
        this.f12217f = i;
        this.f12218g = i2;
        this.f12219h = z3;
        this.f12220i = z4;
        this.f12221j = z5;
        this.f12222k = i3;
        this.f12223l = i4;
        this.f12224m = z6;
        this.f12225n = z7;
        this.f12226o = z8;
        this.f12214c = str;
    }

    C2902d(C2901a c2901a) {
        this.f12215d = c2901a.f12204a;
        this.f12216e = c2901a.f12205b;
        this.f12217f = c2901a.f12206c;
        this.f12218g = -1;
        this.f12219h = false;
        this.f12220i = false;
        this.f12221j = false;
        this.f12222k = c2901a.f12207d;
        this.f12223l = c2901a.f12208e;
        this.f12224m = c2901a.f12209f;
        this.f12225n = c2901a.f12210g;
        this.f12226o = c2901a.f12211h;
    }

    /* renamed from: a */
    public boolean m14060a() {
        return this.f12215d;
    }

    /* renamed from: b */
    public boolean m14061b() {
        return this.f12216e;
    }

    /* renamed from: c */
    public int m14062c() {
        return this.f12217f;
    }

    /* renamed from: d */
    public boolean m14063d() {
        return this.f12219h;
    }

    /* renamed from: e */
    public boolean m14064e() {
        return this.f12220i;
    }

    /* renamed from: f */
    public boolean m14065f() {
        return this.f12221j;
    }

    /* renamed from: g */
    public int m14066g() {
        return this.f12222k;
    }

    /* renamed from: h */
    public int m14067h() {
        return this.f12223l;
    }

    /* renamed from: i */
    public boolean m14068i() {
        return this.f12224m;
    }

    /* renamed from: j */
    public boolean m14069j() {
        return this.f12226o;
    }

    /* renamed from: a */
    public static C2902d m14058a(C2981s c2981s) {
        C2981s c2981s2 = c2981s;
        int a = c2981s.m14546a();
        Object obj = 1;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = -1;
        int i4 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        for (int i5 = 0; i5 < a; i5++) {
            int i6;
            int a2;
            int a3;
            String trim;
            int a4;
            String trim2;
            String a5 = c2981s2.m14547a(i5);
            String b = c2981s2.m14549b(i5);
            if (a5.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = b;
                    for (i6 = 0; i6 < b.length(); i6 = a2) {
                        a3 = C2924e.m14153a(b, i6, "=,;");
                        trim = b.substring(i6, a3).trim();
                        if (!(a3 == b.length() || b.charAt(a3) == ',')) {
                            if (b.charAt(a3) == ';') {
                                a4 = C2924e.m14152a(b, a3 + 1);
                                if (a4 < b.length() || b.charAt(a4) != '\"') {
                                    a2 = C2924e.m14153a(b, a4, ",;");
                                    trim2 = b.substring(a4, a2).trim();
                                } else {
                                    a4++;
                                    a2 = C2924e.m14153a(b, a4, "\"");
                                    trim2 = b.substring(a4, a2);
                                    a2++;
                                }
                                if (!"no-cache".equalsIgnoreCase(trim)) {
                                    z = true;
                                } else if (!"no-store".equalsIgnoreCase(trim)) {
                                    z2 = true;
                                } else if (!"max-age".equalsIgnoreCase(trim)) {
                                    i = C2924e.m14160b(trim2, -1);
                                } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                                    i2 = C2924e.m14160b(trim2, -1);
                                } else if (!"private".equalsIgnoreCase(trim)) {
                                    z3 = true;
                                } else if (!"public".equalsIgnoreCase(trim)) {
                                    z4 = true;
                                } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                                    z5 = true;
                                } else if (!"max-stale".equalsIgnoreCase(trim)) {
                                    i3 = C2924e.m14160b(trim2, BaseClientBuilder.API_PRIORITY_OTHER);
                                } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                                    i4 = C2924e.m14160b(trim2, -1);
                                } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                                    z6 = true;
                                } else if (!"no-transform".equalsIgnoreCase(trim)) {
                                    z7 = true;
                                } else if (!"immutable".equalsIgnoreCase(trim)) {
                                    z8 = true;
                                }
                            }
                        }
                        a2 = a3 + 1;
                        trim2 = null;
                        if (!"no-cache".equalsIgnoreCase(trim)) {
                            z = true;
                        } else if (!"no-store".equalsIgnoreCase(trim)) {
                            z2 = true;
                        } else if (!"max-age".equalsIgnoreCase(trim)) {
                            i = C2924e.m14160b(trim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                            i2 = C2924e.m14160b(trim2, -1);
                        } else if (!"private".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else if (!"public".equalsIgnoreCase(trim)) {
                            z4 = true;
                        } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                            z5 = true;
                        } else if (!"max-stale".equalsIgnoreCase(trim)) {
                            i3 = C2924e.m14160b(trim2, BaseClientBuilder.API_PRIORITY_OTHER);
                        } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                            i4 = C2924e.m14160b(trim2, -1);
                        } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                            z6 = true;
                        } else if (!"no-transform".equalsIgnoreCase(trim)) {
                            z7 = true;
                        } else if (!"immutable".equalsIgnoreCase(trim)) {
                            z8 = true;
                        }
                    }
                }
            } else if (!a5.equalsIgnoreCase("Pragma")) {
            }
            obj = null;
            while (i6 < b.length()) {
                a3 = C2924e.m14153a(b, i6, "=,;");
                trim = b.substring(i6, a3).trim();
                if (b.charAt(a3) == ';') {
                    a4 = C2924e.m14152a(b, a3 + 1);
                    if (a4 < b.length()) {
                    }
                    a2 = C2924e.m14153a(b, a4, ",;");
                    trim2 = b.substring(a4, a2).trim();
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        z = true;
                    } else if (!"no-store".equalsIgnoreCase(trim)) {
                        z2 = true;
                    } else if (!"max-age".equalsIgnoreCase(trim)) {
                        i = C2924e.m14160b(trim2, -1);
                    } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                        i2 = C2924e.m14160b(trim2, -1);
                    } else if (!"private".equalsIgnoreCase(trim)) {
                        z3 = true;
                    } else if (!"public".equalsIgnoreCase(trim)) {
                        z4 = true;
                    } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                        z5 = true;
                    } else if (!"max-stale".equalsIgnoreCase(trim)) {
                        i3 = C2924e.m14160b(trim2, BaseClientBuilder.API_PRIORITY_OTHER);
                    } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                        i4 = C2924e.m14160b(trim2, -1);
                    } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                        z6 = true;
                    } else if (!"no-transform".equalsIgnoreCase(trim)) {
                        z7 = true;
                    } else if (!"immutable".equalsIgnoreCase(trim)) {
                        z8 = true;
                    }
                } else {
                    a2 = a3 + 1;
                    trim2 = null;
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        z = true;
                    } else if (!"no-store".equalsIgnoreCase(trim)) {
                        z2 = true;
                    } else if (!"max-age".equalsIgnoreCase(trim)) {
                        i = C2924e.m14160b(trim2, -1);
                    } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                        i2 = C2924e.m14160b(trim2, -1);
                    } else if (!"private".equalsIgnoreCase(trim)) {
                        z3 = true;
                    } else if (!"public".equalsIgnoreCase(trim)) {
                        z4 = true;
                    } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                        z5 = true;
                    } else if (!"max-stale".equalsIgnoreCase(trim)) {
                        i3 = C2924e.m14160b(trim2, BaseClientBuilder.API_PRIORITY_OTHER);
                    } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                        i4 = C2924e.m14160b(trim2, -1);
                    } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                        z6 = true;
                    } else if (!"no-transform".equalsIgnoreCase(trim)) {
                        z7 = true;
                    } else if (!"immutable".equalsIgnoreCase(trim)) {
                        z8 = true;
                    }
                }
            }
        }
        return new C2902d(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, obj == null ? null : str);
    }

    public String toString() {
        String str = this.f12214c;
        if (str != null) {
            return str;
        }
        str = m14059k();
        this.f12214c = str;
        return str;
    }

    /* renamed from: k */
    private String m14059k() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f12215d) {
            stringBuilder.append("no-cache, ");
        }
        if (this.f12216e) {
            stringBuilder.append("no-store, ");
        }
        if (this.f12217f != -1) {
            stringBuilder.append("max-age=");
            stringBuilder.append(this.f12217f);
            stringBuilder.append(", ");
        }
        if (this.f12218g != -1) {
            stringBuilder.append("s-maxage=");
            stringBuilder.append(this.f12218g);
            stringBuilder.append(", ");
        }
        if (this.f12219h) {
            stringBuilder.append("private, ");
        }
        if (this.f12220i) {
            stringBuilder.append("public, ");
        }
        if (this.f12221j) {
            stringBuilder.append("must-revalidate, ");
        }
        if (this.f12222k != -1) {
            stringBuilder.append("max-stale=");
            stringBuilder.append(this.f12222k);
            stringBuilder.append(", ");
        }
        if (this.f12223l != -1) {
            stringBuilder.append("min-fresh=");
            stringBuilder.append(this.f12223l);
            stringBuilder.append(", ");
        }
        if (this.f12224m) {
            stringBuilder.append("only-if-cached, ");
        }
        if (this.f12225n) {
            stringBuilder.append("no-transform, ");
        }
        if (this.f12226o) {
            stringBuilder.append("immutable, ");
        }
        if (stringBuilder.length() == 0) {
            return "";
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
