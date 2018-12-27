package android.support.v4.p017f;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.f.e */
public class C0419e extends Writer {
    /* renamed from: a */
    private final String f1420a;
    /* renamed from: b */
    private StringBuilder f1421b = new StringBuilder(128);

    public C0419e(String str) {
        this.f1420a = str;
    }

    public void close() {
        m1536a();
    }

    public void flush() {
        m1536a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m1536a();
            } else {
                this.f1421b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m1536a() {
        if (this.f1421b.length() > 0) {
            Log.d(this.f1420a, this.f1421b.toString());
            this.f1421b.delete(0, this.f1421b.length());
        }
    }
}
