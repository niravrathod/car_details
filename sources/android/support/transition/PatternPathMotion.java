package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.p009a.C0302b;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {
    /* renamed from: a */
    private Path f13052a;
    /* renamed from: b */
    private final Path f13053b = new Path();
    /* renamed from: c */
    private final Matrix f13054c = new Matrix();

    public PatternPathMotion() {
        this.f13053b.lineTo(1.0f, 0.0f);
        this.f13052a = this.f13053b;
    }

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f985k);
        try {
            String a = C0388c.m1423a(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (a != null) {
                m15170a(C0302b.m1078a(a));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void m15170a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f) {
            if (f4 == f2) {
                throw new IllegalArgumentException("pattern must not end at the starting point");
            }
        }
        this.f13054c.setTranslate(-f3, -f4);
        f -= f3;
        f2 -= f4;
        f4 = 1.0f / m15168a(f, f2);
        this.f13054c.postScale(f4, f4);
        this.f13054c.postRotate((float) Math.toDegrees(-Math.atan2((double) f2, (double) f)));
        path.transform(this.f13054c, this.f13053b);
        this.f13052a = path;
    }

    /* renamed from: a */
    public Path mo172a(float f, float f2, float f3, float f4) {
        f3 -= f;
        f4 -= f2;
        float a = m15168a(f3, f4);
        f3 = Math.atan2((double) f4, (double) f3);
        this.f13054c.setScale(a, a);
        this.f13054c.postRotate((float) Math.toDegrees(f3));
        this.f13054c.postTranslate(f, f2);
        f = new Path();
        this.f13053b.transform(this.f13054c, f);
        return f;
    }

    /* renamed from: a */
    private static float m15168a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }
}
