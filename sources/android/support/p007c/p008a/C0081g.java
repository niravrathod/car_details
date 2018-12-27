package android.support.p007c.p008a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.p009a.C0302b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.c.a.g */
public class C0081g implements Interpolator {
    /* renamed from: a */
    private float[] f102a;
    /* renamed from: b */
    private float[] f103b;

    public C0081g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C0081g(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0388c.m1422a(resources, theme, attributeSet, C0071a.f92l);
        m168a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m168a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0388c.m1425a(xmlPullParser, "pathData")) {
            String a = C0388c.m1423a(typedArray, xmlPullParser, "pathData", 4);
            xmlPullParser = C0302b.m1078a(a);
            if (xmlPullParser != null) {
                m169a(xmlPullParser);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The path is null, which is created from ");
            stringBuilder.append(a);
            throw new InflateException(stringBuilder.toString());
        } else if (!C0388c.m1425a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0388c.m1425a(xmlPullParser, "controlY1")) {
            float a2 = C0388c.m1420a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a3 = C0388c.m1420a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a4 = C0388c.m1425a(xmlPullParser, "controlX2");
            if (a4 != C0388c.m1425a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (a4) {
                m167a(a2, a3, C0388c.m1420a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0388c.m1420a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            } else {
                m166a(a2, a3);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    /* renamed from: a */
    private void m166a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m169a(path);
    }

    /* renamed from: a */
    private void m167a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m169a(path);
    }

    /* renamed from: a */
    private void m169a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        path = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (path / 0.002f)) + 1);
        if (min > 0) {
            int i2;
            this.f102a = new float[min];
            this.f103b = new float[min];
            float[] fArr = new float[2];
            for (i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * path) / ((float) (min - 1)), fArr, null);
                this.f102a[i2] = fArr[0];
                this.f103b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f102a[0])) <= 1.0E-5d && ((double) Math.abs(this.f103b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f102a[i3] - 1065353216)) <= 1.0E-5d && ((double) Math.abs(this.f103b[i3] - 1065353216)) <= 1.0E-5d) {
                    path = null;
                    float f = 0.0f;
                    while (i < min) {
                        i2 = path + 1;
                        path = this.f102a[path];
                        if (path >= f) {
                            this.f102a[i] = path;
                            i++;
                            f = path;
                            path = i2;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("The Path cannot loop back on itself, x :");
                            stringBuilder.append(path);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (pathMeasure.nextContour() != null) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("The Path must start at (0,0) and end at (1,1) start: ");
            stringBuilder2.append(this.f102a[0]);
            stringBuilder2.append(",");
            stringBuilder2.append(this.f103b[0]);
            stringBuilder2.append(" end:");
            min--;
            stringBuilder2.append(this.f102a[min]);
            stringBuilder2.append(",");
            stringBuilder2.append(this.f103b[min]);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("The Path has a invalid length ");
        stringBuilder.append(path);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f102a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f102a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f102a[length] - this.f102a[i];
        if (f2 == 0.0f) {
            return this.f103b[i];
        }
        f = (f - this.f102a[i]) / f2;
        float f3 = this.f103b[i];
        return f3 + (f * (this.f103b[length] - f3));
    }
}
