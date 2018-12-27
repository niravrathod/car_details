package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.C0392c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.u */
public abstract class C0363u {

    /* renamed from: android.support.v4.app.u$a */
    public interface C0362a<D> {
        /* renamed from: a */
        C0392c<D> mo1158a(int i, Bundle bundle);

        /* renamed from: a */
        void mo1159a(C0392c<D> c0392c);

        /* renamed from: a */
        void mo1160a(C0392c<D> c0392c, D d);
    }

    /* renamed from: a */
    public abstract <D> C0392c<D> mo264a(int i, Bundle bundle, C0362a<D> c0362a);

    /* renamed from: a */
    public abstract void mo265a(int i);

    /* renamed from: a */
    public abstract void mo266a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
