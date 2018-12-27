package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.t */
class C0289t<T> extends Property<T, Float> {
    /* renamed from: a */
    private final Property<T, PointF> f1030a;
    /* renamed from: b */
    private final PathMeasure f1031b;
    /* renamed from: c */
    private final float f1032c;
    /* renamed from: d */
    private final float[] f1033d = new float[2];
    /* renamed from: e */
    private final PointF f1034e = new PointF();
    /* renamed from: f */
    private float f1035f;

    public /* synthetic */ Object get(Object obj) {
        return m1041a(obj);
    }

    public /* synthetic */ void set(Object obj, Object obj2) {
        m1042a(obj, (Float) obj2);
    }

    C0289t(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f1030a = property;
        this.f1031b = new PathMeasure(path, false);
        this.f1032c = this.f1031b.getLength();
    }

    /* renamed from: a */
    public Float m1041a(T t) {
        return Float.valueOf(this.f1035f);
    }

    /* renamed from: a */
    public void m1042a(T t, Float f) {
        this.f1035f = f.floatValue();
        this.f1031b.getPosTan(this.f1032c * f.floatValue(), this.f1033d, null);
        this.f1034e.x = this.f1033d[0];
        this.f1034e.y = this.f1033d[1];
        this.f1030a.set(t, this.f1034e);
    }
}
