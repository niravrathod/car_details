package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.r */
public class C0037r {
    /* renamed from: a */
    private final C0036a f64a;
    /* renamed from: b */
    private final C0038s f65b;

    /* renamed from: android.arch.lifecycle.r$a */
    public interface C0036a {
        /* renamed from: a */
        <T extends C0035q> T mo261a(Class<T> cls);
    }

    public C0037r(C0038s c0038s, C0036a c0036a) {
        this.f64a = c0036a;
        this.f65b = c0038s;
    }

    /* renamed from: a */
    public <T extends C0035q> T m92a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            stringBuilder.append(canonicalName);
            return m93a(stringBuilder.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0035q> T m93a(String str, Class<T> cls) {
        T a = this.f65b.m94a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        cls = this.f64a.mo261a(cls);
        this.f65b.m96a(str, cls);
        return cls;
    }
}
