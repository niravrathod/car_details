package okhttp3.internal.p155a;

import java.io.IOException;
import okio.C2994r;
import okio.C4755c;
import okio.C4910g;

/* renamed from: okhttp3.internal.a.e */
class C4748e extends C4910g {
    /* renamed from: a */
    private boolean f20797a;

    /* renamed from: a */
    protected void mo4885a(IOException iOException) {
    }

    C4748e(C2994r c2994r) {
        super(c2994r);
    }

    public void a_(C4755c c4755c, long j) {
        if (this.f20797a) {
            c4755c.mo4565i(j);
            return;
        }
        try {
            super.a_(c4755c, j);
        } catch (C4755c c4755c2) {
            this.f20797a = 1;
            mo4885a(c4755c2);
        }
    }

    public void flush() {
        if (!this.f20797a) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f20797a = true;
                mo4885a(e);
            }
        }
    }

    public void close() {
        if (!this.f20797a) {
            try {
                super.close();
            } catch (IOException e) {
                this.f20797a = true;
                mo4885a(e);
            }
        }
    }
}
