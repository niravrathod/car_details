package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.o */
public abstract class C0555o {
    /* renamed from: a */
    private final DataSetObservable f1760a = new DataSetObservable();
    /* renamed from: b */
    private DataSetObserver f1761b;

    /* renamed from: a */
    public int m2086a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public Parcelable mo308a() {
        return null;
    }

    /* renamed from: a */
    public void mo310a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void m2092a(View view) {
    }

    /* renamed from: a */
    public abstract boolean mo313a(View view, Object obj);

    /* renamed from: b */
    public abstract int mo1187b();

    @Deprecated
    /* renamed from: b */
    public void m2099b(View view) {
    }

    @Deprecated
    /* renamed from: b */
    public void m2100b(View view, int i, Object obj) {
    }

    /* renamed from: c */
    public CharSequence mo3918c(int i) {
        return null;
    }

    /* renamed from: d */
    public float m2105d(int i) {
        return 1.0f;
    }

    /* renamed from: a */
    public void mo311a(ViewGroup viewGroup) {
        m2092a((View) viewGroup);
    }

    /* renamed from: a */
    public Object mo309a(ViewGroup viewGroup, int i) {
        return m2088a((View) viewGroup, i);
    }

    /* renamed from: a */
    public void mo312a(ViewGroup viewGroup, int i, Object obj) {
        m2093a((View) viewGroup, i, obj);
    }

    /* renamed from: b */
    public void mo315b(ViewGroup viewGroup, int i, Object obj) {
        m2100b((View) viewGroup, i, obj);
    }

    /* renamed from: b */
    public void mo314b(ViewGroup viewGroup) {
        m2099b((View) viewGroup);
    }

    @Deprecated
    /* renamed from: a */
    public Object m2088a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    /* renamed from: a */
    public void m2093a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: a */
    public void m2090a(DataSetObserver dataSetObserver) {
        this.f1760a.registerObserver(dataSetObserver);
    }

    /* renamed from: b */
    public void m2098b(DataSetObserver dataSetObserver) {
        this.f1760a.unregisterObserver(dataSetObserver);
    }

    /* renamed from: c */
    void m2104c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f1761b = dataSetObserver;
        }
    }
}
