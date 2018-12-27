package okhttp3.internal.http2;

import java.util.List;
import okio.C4394e;

/* renamed from: okhttp3.internal.http2.j */
public interface C2964j {
    /* renamed from: a */
    public static final C2964j f12531a = new C43791();

    /* renamed from: okhttp3.internal.http2.j$1 */
    class C43791 implements C2964j {
        /* renamed from: a */
        public void mo3670a(int i, ErrorCode errorCode) {
        }

        /* renamed from: a */
        public boolean mo3671a(int i, List<C2950a> list) {
            return true;
        }

        /* renamed from: a */
        public boolean mo3672a(int i, List<C2950a> list, boolean z) {
            return true;
        }

        C43791() {
        }

        /* renamed from: a */
        public boolean mo3673a(int i, C4394e c4394e, int i2, boolean z) {
            c4394e.mo4565i((long) i2);
            return true;
        }
    }

    /* renamed from: a */
    void mo3670a(int i, ErrorCode errorCode);

    /* renamed from: a */
    boolean mo3671a(int i, List<C2950a> list);

    /* renamed from: a */
    boolean mo3672a(int i, List<C2950a> list, boolean z);

    /* renamed from: a */
    boolean mo3673a(int i, C4394e c4394e, int i2, boolean z);
}
