package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.support.v4.content.p014a.C0388c;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {
    /* renamed from: a */
    private static final float f13008a = ((float) Math.tan(Math.toRadians(35.0d)));
    /* renamed from: b */
    private float f13009b = 0.0f;
    /* renamed from: c */
    private float f13010c = 0.0f;
    /* renamed from: d */
    private float f13011d = 70.0f;
    /* renamed from: e */
    private float f13012e = 0.0f;
    /* renamed from: f */
    private float f13013f = 0.0f;
    /* renamed from: g */
    private float f13014g = f13008a;

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f984j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        m15098b(C0388c.m1420a(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        m15097a(C0388c.m1420a(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        m15099c(C0388c.m1420a(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void m15097a(float f) {
        this.f13009b = f;
        this.f13012e = m15095d(f);
    }

    /* renamed from: b */
    public void m15098b(float f) {
        this.f13010c = f;
        this.f13013f = m15095d(f);
    }

    /* renamed from: c */
    public void m15099c(float f) {
        this.f13011d = f;
        this.f13014g = m15095d(f);
    }

    /* renamed from: d */
    private static float m15095d(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    /* renamed from: a */
    public Path mo172a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = (f5 * f5) + (f6 * f6);
        float f8 = (f + f3) / 2.0f;
        float f9 = (f2 + f4) / 2.0f;
        float f10 = 0.25f * f7;
        Object obj = f2 > f4 ? 1 : null;
        if (Math.abs(f5) < Math.abs(f6)) {
            f5 = Math.abs(f7 / (f6 * 2.0f));
            if (obj != null) {
                f6 = f5 + f4;
                f5 = f3;
            } else {
                f6 = f5 + f2;
                f5 = f;
            }
            f7 = (this.f13013f * f10) * this.f13013f;
        } else {
            f7 /= f5 * 2.0f;
            if (obj != null) {
                f6 = f2;
                f5 = f7 + f;
            } else {
                f5 = f3 - f7;
                f6 = f4;
            }
            f7 = (this.f13012e * f10) * this.f13012e;
        }
        float f11 = f8 - f5;
        float f12 = f9 - f6;
        f11 = (f11 * f11) + (f12 * f12);
        f10 = (f10 * this.f13014g) * this.f13014g;
        if (f11 >= f7) {
            f7 = f11 > f10 ? f10 : 0.0f;
        }
        if (f7 != 0.0f) {
            f7 = (float) Math.sqrt((double) (f7 / f11));
            f5 = ((f5 - f8) * f7) + f8;
            f6 = f9 + (f7 * (f6 - f9));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }
}
