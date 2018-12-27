package androidx.navigation;

import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.navigation.m */
public abstract class C0909m<D extends C0900g> {
    /* renamed from: a */
    private final CopyOnWriteArrayList<C0908c> f3082a = new CopyOnWriteArrayList();

    /* renamed from: androidx.navigation.m$a */
    public interface C0906a {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.m$b */
    public @interface C0907b {
        /* renamed from: a */
        String m3961a();
    }

    /* renamed from: androidx.navigation.m$c */
    public interface C0908c {
        /* renamed from: a */
        void mo856a(C0909m c0909m, int i, int i2);
    }

    /* renamed from: a */
    public void mo858a(Bundle bundle) {
    }

    /* renamed from: a */
    public abstract void mo853a(D d, Bundle bundle, C0904k c0904k, C0906a c0906a);

    /* renamed from: b */
    public abstract boolean mo854b();

    /* renamed from: c */
    public abstract D mo855c();

    /* renamed from: d */
    public Bundle mo859d() {
        return null;
    }

    /* renamed from: e */
    public void mo860e() {
    }

    /* renamed from: f */
    public void mo861f() {
    }

    /* renamed from: a */
    public final void m3966a(C0908c c0908c) {
        if (this.f3082a.add(c0908c) != null && this.f3082a.size() == 1) {
            mo860e();
        }
    }

    /* renamed from: b */
    public final void m3967b(C0908c c0908c) {
        if (this.f3082a.remove(c0908c) != null && this.f3082a.isEmpty() != null) {
            mo861f();
        }
    }

    /* renamed from: a */
    public final void m3963a(int i, int i2) {
        Iterator it = this.f3082a.iterator();
        while (it.hasNext()) {
            ((C0908c) it.next()).mo856a(this, i, i2);
        }
    }
}
