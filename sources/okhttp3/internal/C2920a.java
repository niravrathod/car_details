package okhttp3.internal;

import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.C2895a;
import okhttp3.C2967j;
import okhttp3.C2969k;
import okhttp3.C2981s.C2980a;
import okhttp3.aa.C2896a;
import okhttp3.ac;
import okhttp3.internal.connection.C2935d;
import okhttp3.internal.connection.C2939f;
import okhttp3.internal.connection.C4353c;

/* renamed from: okhttp3.internal.a */
public abstract class C2920a {
    /* renamed from: a */
    public static C2920a f12341a;

    /* renamed from: a */
    public abstract int mo3679a(C2896a c2896a);

    /* renamed from: a */
    public abstract Socket mo3680a(C2967j c2967j, C2895a c2895a, C2939f c2939f);

    /* renamed from: a */
    public abstract C4353c mo3681a(C2967j c2967j, C2895a c2895a, C2939f c2939f, ac acVar);

    /* renamed from: a */
    public abstract C2935d mo3682a(C2967j c2967j);

    /* renamed from: a */
    public abstract void mo3683a(C2969k c2969k, SSLSocket sSLSocket, boolean z);

    /* renamed from: a */
    public abstract void mo3684a(C2980a c2980a, String str);

    /* renamed from: a */
    public abstract void mo3685a(C2980a c2980a, String str, String str2);

    /* renamed from: a */
    public abstract boolean mo3686a(C2895a c2895a, C2895a c2895a2);

    /* renamed from: a */
    public abstract boolean mo3687a(C2967j c2967j, C4353c c4353c);

    /* renamed from: b */
    public abstract void mo3688b(C2967j c2967j, C4353c c4353c);
}
