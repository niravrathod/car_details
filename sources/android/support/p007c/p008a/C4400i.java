package android.support.p007c.p008a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.p014a.C0387b;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.p009a.C0302b;
import android.support.v4.p009a.C0302b.C0301b;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.p017f.C3131a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.c.a.i */
public class C4400i extends C3018h {
    /* renamed from: a */
    static final Mode f18309a = Mode.SRC_IN;
    /* renamed from: c */
    private C0085f f18310c;
    /* renamed from: d */
    private PorterDuffColorFilter f18311d;
    /* renamed from: e */
    private ColorFilter f18312e;
    /* renamed from: f */
    private boolean f18313f;
    /* renamed from: g */
    private boolean f18314g;
    /* renamed from: h */
    private ConstantState f18315h;
    /* renamed from: i */
    private final float[] f18316i;
    /* renamed from: j */
    private final Matrix f18317j;
    /* renamed from: k */
    private final Rect f18318k;

    /* renamed from: android.support.c.a.i$c */
    private static class C0082c {
        /* renamed from: a */
        final ArrayList<Object> f104a = new ArrayList();
        /* renamed from: b */
        float f105b = 0.0f;
        /* renamed from: c */
        int f106c;
        /* renamed from: d */
        private final Matrix f107d = new Matrix();
        /* renamed from: e */
        private float f108e = 0.0f;
        /* renamed from: f */
        private float f109f = 0.0f;
        /* renamed from: g */
        private float f110g = 1.0f;
        /* renamed from: h */
        private float f111h = 1.0f;
        /* renamed from: i */
        private float f112i = 0.0f;
        /* renamed from: j */
        private float f113j = 0.0f;
        /* renamed from: k */
        private final Matrix f114k = new Matrix();
        /* renamed from: l */
        private int[] f115l;
        /* renamed from: m */
        private String f116m = null;

        public C0082c(C0082c c0082c, C3131a<String, Object> c3131a) {
            this.f105b = c0082c.f105b;
            this.f108e = c0082c.f108e;
            this.f109f = c0082c.f109f;
            this.f110g = c0082c.f110g;
            this.f111h = c0082c.f111h;
            this.f112i = c0082c.f112i;
            this.f113j = c0082c.f113j;
            this.f115l = c0082c.f115l;
            this.f116m = c0082c.f116m;
            this.f106c = c0082c.f106c;
            if (this.f116m != null) {
                c3131a.put(this.f116m, this);
            }
            this.f114k.set(c0082c.f114k);
            c0082c = c0082c.f104a;
            for (int i = 0; i < c0082c.size(); i++) {
                Object obj = c0082c.get(i);
                if (obj instanceof C0082c) {
                    this.f104a.add(new C0082c((C0082c) obj, c3131a));
                } else {
                    C0083d c3020b;
                    if (obj instanceof C3020b) {
                        c3020b = new C3020b((C3020b) obj);
                    } else if (obj instanceof C3019a) {
                        c3020b = new C3019a((C3019a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f104a.add(c3020b);
                    if (c3020b.f118n != null) {
                        c3131a.put(c3020b.f118n, c3020b);
                    }
                }
            }
        }

        public String getGroupName() {
            return this.f116m;
        }

        public Matrix getLocalMatrix() {
            return this.f114k;
        }

        /* renamed from: a */
        public void m174a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            resources = C0388c.m1422a(resources, theme, attributeSet, C0071a.f82b);
            m172a(resources, xmlPullParser);
            resources.recycle();
        }

        /* renamed from: a */
        private void m172a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f115l = null;
            this.f105b = C0388c.m1420a(typedArray, xmlPullParser, "rotation", 5, this.f105b);
            this.f108e = typedArray.getFloat(1, this.f108e);
            this.f109f = typedArray.getFloat(2, this.f109f);
            this.f110g = C0388c.m1420a(typedArray, xmlPullParser, "scaleX", 3, this.f110g);
            this.f111h = C0388c.m1420a(typedArray, xmlPullParser, "scaleY", 4, this.f111h);
            this.f112i = C0388c.m1420a(typedArray, xmlPullParser, "translateX", 6, this.f112i);
            this.f113j = C0388c.m1420a(typedArray, xmlPullParser, "translateY", 7, this.f113j);
            typedArray = typedArray.getString(null);
            if (typedArray != null) {
                this.f116m = typedArray;
            }
            m171a();
        }

        /* renamed from: a */
        private void m171a() {
            this.f114k.reset();
            this.f114k.postTranslate(-this.f108e, -this.f109f);
            this.f114k.postScale(this.f110g, this.f111h);
            this.f114k.postRotate(this.f105b, 0.0f, 0.0f);
            this.f114k.postTranslate(this.f112i + this.f108e, this.f113j + this.f109f);
        }

        public float getRotation() {
            return this.f105b;
        }

        public void setRotation(float f) {
            if (f != this.f105b) {
                this.f105b = f;
                m171a();
            }
        }

        public float getPivotX() {
            return this.f108e;
        }

        public void setPivotX(float f) {
            if (f != this.f108e) {
                this.f108e = f;
                m171a();
            }
        }

        public float getPivotY() {
            return this.f109f;
        }

        public void setPivotY(float f) {
            if (f != this.f109f) {
                this.f109f = f;
                m171a();
            }
        }

        public float getScaleX() {
            return this.f110g;
        }

        public void setScaleX(float f) {
            if (f != this.f110g) {
                this.f110g = f;
                m171a();
            }
        }

        public float getScaleY() {
            return this.f111h;
        }

        public void setScaleY(float f) {
            if (f != this.f111h) {
                this.f111h = f;
                m171a();
            }
        }

        public float getTranslateX() {
            return this.f112i;
        }

        public void setTranslateX(float f) {
            if (f != this.f112i) {
                this.f112i = f;
                m171a();
            }
        }

        public float getTranslateY() {
            return this.f113j;
        }

        public void setTranslateY(float f) {
            if (f != this.f113j) {
                this.f113j = f;
                m171a();
            }
        }
    }

    /* renamed from: android.support.c.a.i$d */
    private static class C0083d {
        /* renamed from: m */
        protected C0301b[] f117m = null;
        /* renamed from: n */
        String f118n;
        /* renamed from: o */
        int f119o;

        /* renamed from: a */
        public boolean mo27a() {
            return false;
        }

        public C0083d(C0083d c0083d) {
            this.f118n = c0083d.f118n;
            this.f119o = c0083d.f119o;
            this.f117m = C0302b.m1083a(c0083d.f117m);
        }

        /* renamed from: a */
        public void m175a(Path path) {
            path.reset();
            if (this.f117m != null) {
                C0301b.m1075a(this.f117m, path);
            }
        }

        public String getPathName() {
            return this.f118n;
        }

        public C0301b[] getPathData() {
            return this.f117m;
        }

        public void setPathData(C0301b[] c0301bArr) {
            if (C0302b.m1081a(this.f117m, c0301bArr)) {
                C0302b.m1084b(this.f117m, c0301bArr);
            } else {
                this.f117m = C0302b.m1083a(c0301bArr);
            }
        }
    }

    /* renamed from: android.support.c.a.i$e */
    private static class C0084e {
        /* renamed from: k */
        private static final Matrix f120k = new Matrix();
        /* renamed from: a */
        final C0082c f121a;
        /* renamed from: b */
        float f122b;
        /* renamed from: c */
        float f123c;
        /* renamed from: d */
        float f124d;
        /* renamed from: e */
        float f125e;
        /* renamed from: f */
        int f126f;
        /* renamed from: g */
        String f127g;
        /* renamed from: h */
        final C3131a<String, Object> f128h;
        /* renamed from: i */
        private final Path f129i;
        /* renamed from: j */
        private final Path f130j;
        /* renamed from: l */
        private final Matrix f131l;
        /* renamed from: m */
        private Paint f132m;
        /* renamed from: n */
        private Paint f133n;
        /* renamed from: o */
        private PathMeasure f134o;
        /* renamed from: p */
        private int f135p;

        /* renamed from: a */
        private static float m177a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public C0084e() {
            this.f131l = new Matrix();
            this.f122b = 0.0f;
            this.f123c = 0.0f;
            this.f124d = 0.0f;
            this.f125e = 0.0f;
            this.f126f = 255;
            this.f127g = null;
            this.f128h = new C3131a();
            this.f121a = new C0082c();
            this.f129i = new Path();
            this.f130j = new Path();
        }

        public void setRootAlpha(int i) {
            this.f126f = i;
        }

        public int getRootAlpha() {
            return this.f126f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C0084e(C0084e c0084e) {
            this.f131l = new Matrix();
            this.f122b = 0.0f;
            this.f123c = 0.0f;
            this.f124d = 0.0f;
            this.f125e = 0.0f;
            this.f126f = 255;
            this.f127g = null;
            this.f128h = new C3131a();
            this.f121a = new C0082c(c0084e.f121a, this.f128h);
            this.f129i = new Path(c0084e.f129i);
            this.f130j = new Path(c0084e.f130j);
            this.f122b = c0084e.f122b;
            this.f123c = c0084e.f123c;
            this.f124d = c0084e.f124d;
            this.f125e = c0084e.f125e;
            this.f135p = c0084e.f135p;
            this.f126f = c0084e.f126f;
            this.f127g = c0084e.f127g;
            if (c0084e.f127g != null) {
                this.f128h.put(c0084e.f127g, this);
            }
        }

        /* renamed from: a */
        private void m181a(C0082c c0082c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0082c.f107d.set(matrix);
            c0082c.f107d.preConcat(c0082c.f114k);
            canvas.save();
            for (matrix = null; matrix < c0082c.f104a.size(); matrix++) {
                Object obj = c0082c.f104a.get(matrix);
                if (obj instanceof C0082c) {
                    m181a((C0082c) obj, c0082c.f107d, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0083d) {
                    m182a(c0082c, (C0083d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void m185a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m181a(this.f121a, f120k, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        private void m182a(C0082c c0082c, C0083d c0083d, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            i = ((float) i) / this.f124d;
            i2 = ((float) i2) / this.f125e;
            float min = Math.min(i, i2);
            Matrix a = c0082c.f107d;
            this.f131l.set(a);
            this.f131l.postScale(i, i2);
            c0082c = m178a(a);
            if (c0082c != null) {
                c0083d.m175a(this.f129i);
                i2 = this.f129i;
                this.f130j.reset();
                if (c0083d.mo27a()) {
                    this.f130j.addPath(i2, this.f131l);
                    canvas.clipPath(this.f130j);
                } else {
                    C3020b c3020b = (C3020b) c0083d;
                    if (!(c3020b.f12744g == 0.0f && c3020b.f12745h == 1.0f)) {
                        float f = (c3020b.f12744g + c3020b.f12746i) % 1.0f;
                        float f2 = (c3020b.f12745h + c3020b.f12746i) % 1.0f;
                        if (this.f134o == null) {
                            this.f134o = new PathMeasure();
                        }
                        this.f134o.setPath(this.f129i, false);
                        float length = this.f134o.getLength();
                        f *= length;
                        f2 *= length;
                        i2.reset();
                        if (f > f2) {
                            this.f134o.getSegment(f, length, i2, true);
                            this.f134o.getSegment(0.0f, f2, i2, true);
                        } else {
                            this.f134o.getSegment(f, f2, i2, true);
                        }
                        i2.rLineTo(0.0f, 0.0f);
                    }
                    this.f130j.addPath(i2, this.f131l);
                    if (c3020b.f12740c != 0) {
                        if (this.f133n == 0) {
                            this.f133n = new Paint();
                            this.f133n.setStyle(Style.FILL);
                            this.f133n.setAntiAlias(true);
                        }
                        i = this.f133n;
                        i.setColor(C4400i.m24031a(c3020b.f12740c, c3020b.f12743f));
                        i.setColorFilter(colorFilter);
                        this.f130j.setFillType(c3020b.f12742e == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f130j, i);
                    }
                    if (c3020b.f12738a != 0) {
                        if (this.f132m == 0) {
                            this.f132m = new Paint();
                            this.f132m.setStyle(Style.STROKE);
                            this.f132m.setAntiAlias(true);
                        }
                        i = this.f132m;
                        if (c3020b.f12748k != 0) {
                            i.setStrokeJoin(c3020b.f12748k);
                        }
                        if (c3020b.f12747j != 0) {
                            i.setStrokeCap(c3020b.f12747j);
                        }
                        i.setStrokeMiter(c3020b.f12749l);
                        i.setColor(C4400i.m24031a(c3020b.f12738a, c3020b.f12741d));
                        i.setColorFilter(colorFilter);
                        i.setStrokeWidth(c3020b.f12739b * (min * c0082c));
                        canvas.drawPath(this.f130j, i);
                    }
                }
            }
        }

        /* renamed from: a */
        private float m178a(Matrix matrix) {
            float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            matrix = C0084e.m177a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(matrix) / max;
            }
            return 0.0f;
        }
    }

    /* renamed from: android.support.c.a.i$f */
    private static class C0085f extends ConstantState {
        /* renamed from: a */
        int f136a;
        /* renamed from: b */
        C0084e f137b;
        /* renamed from: c */
        ColorStateList f138c;
        /* renamed from: d */
        Mode f139d;
        /* renamed from: e */
        boolean f140e;
        /* renamed from: f */
        Bitmap f141f;
        /* renamed from: g */
        ColorStateList f142g;
        /* renamed from: h */
        Mode f143h;
        /* renamed from: i */
        int f144i;
        /* renamed from: j */
        boolean f145j;
        /* renamed from: k */
        boolean f146k;
        /* renamed from: l */
        Paint f147l;

        public C0085f(C0085f c0085f) {
            this.f138c = null;
            this.f139d = C4400i.f18309a;
            if (c0085f != null) {
                this.f136a = c0085f.f136a;
                this.f137b = new C0084e(c0085f.f137b);
                if (c0085f.f137b.f133n != null) {
                    this.f137b.f133n = new Paint(c0085f.f137b.f133n);
                }
                if (c0085f.f137b.f132m != null) {
                    this.f137b.f132m = new Paint(c0085f.f137b.f132m);
                }
                this.f138c = c0085f.f138c;
                this.f139d = c0085f.f139d;
                this.f140e = c0085f.f140e;
            }
        }

        /* renamed from: a */
        public void m188a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f141f, null, rect, m186a(colorFilter));
        }

        /* renamed from: a */
        public boolean m189a() {
            return this.f137b.getRootAlpha() < 255;
        }

        /* renamed from: a */
        public Paint m186a(ColorFilter colorFilter) {
            if (!m189a() && colorFilter == null) {
                return null;
            }
            if (this.f147l == null) {
                this.f147l = new Paint();
                this.f147l.setFilterBitmap(true);
            }
            this.f147l.setAlpha(this.f137b.getRootAlpha());
            this.f147l.setColorFilter(colorFilter);
            return this.f147l;
        }

        /* renamed from: a */
        public void m187a(int i, int i2) {
            this.f141f.eraseColor(0);
            this.f137b.m185a(new Canvas(this.f141f), i, i2, null);
        }

        /* renamed from: b */
        public void m190b(int i, int i2) {
            if (this.f141f == null || !m193c(i, i2)) {
                this.f141f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f146k = true;
            }
        }

        /* renamed from: c */
        public boolean m193c(int i, int i2) {
            return i == this.f141f.getWidth() && i2 == this.f141f.getHeight();
        }

        /* renamed from: b */
        public boolean m191b() {
            return !this.f146k && this.f142g == this.f138c && this.f143h == this.f139d && this.f145j == this.f140e && this.f144i == this.f137b.getRootAlpha();
        }

        /* renamed from: c */
        public void m192c() {
            this.f142g = this.f138c;
            this.f143h = this.f139d;
            this.f144i = this.f137b.getRootAlpha();
            this.f145j = this.f140e;
            this.f146k = false;
        }

        public C0085f() {
            this.f138c = null;
            this.f139d = C4400i.f18309a;
            this.f137b = new C0084e();
        }

        public Drawable newDrawable() {
            return new C4400i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C4400i(this);
        }

        public int getChangingConfigurations() {
            return this.f136a;
        }
    }

    /* renamed from: android.support.c.a.i$g */
    private static class C0086g extends ConstantState {
        /* renamed from: a */
        private final ConstantState f148a;

        public C0086g(ConstantState constantState) {
            this.f148a = constantState;
        }

        public Drawable newDrawable() {
            Drawable c4400i = new C4400i();
            c4400i.b = (VectorDrawable) this.f148a.newDrawable();
            return c4400i;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable c4400i = new C4400i();
            c4400i.b = (VectorDrawable) this.f148a.newDrawable(resources);
            return c4400i;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c4400i = new C4400i();
            c4400i.b = (VectorDrawable) this.f148a.newDrawable(resources, theme);
            return c4400i;
        }

        public boolean canApplyTheme() {
            return this.f148a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f148a.getChangingConfigurations();
        }
    }

    /* renamed from: android.support.c.a.i$a */
    private static class C3019a extends C0083d {
        /* renamed from: a */
        public boolean mo27a() {
            return true;
        }

        public C3019a(C3019a c3019a) {
            super(c3019a);
        }

        /* renamed from: a */
        public void m14749a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0388c.m1425a(xmlPullParser, "pathData") != null) {
                resources = C0388c.m1422a(resources, theme, attributeSet, C0071a.f84d);
                m14748a(resources);
                resources.recycle();
            }
        }

        /* renamed from: a */
        private void m14748a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            typedArray = typedArray.getString(1);
            if (typedArray != null) {
                this.m = C0302b.m1085b(typedArray);
            }
        }
    }

    /* renamed from: android.support.c.a.i$b */
    private static class C3020b extends C0083d {
        /* renamed from: a */
        int f12738a = 0;
        /* renamed from: b */
        float f12739b = 0.0f;
        /* renamed from: c */
        int f12740c = 0;
        /* renamed from: d */
        float f12741d = 1.0f;
        /* renamed from: e */
        int f12742e = 0;
        /* renamed from: f */
        float f12743f = 1.0f;
        /* renamed from: g */
        float f12744g = 0.0f;
        /* renamed from: h */
        float f12745h = 1.0f;
        /* renamed from: i */
        float f12746i = 0.0f;
        /* renamed from: j */
        Cap f12747j = Cap.BUTT;
        /* renamed from: k */
        Join f12748k = Join.MITER;
        /* renamed from: l */
        float f12749l = 4.0f;
        /* renamed from: p */
        private int[] f12750p;

        public C3020b(C3020b c3020b) {
            super(c3020b);
            this.f12750p = c3020b.f12750p;
            this.f12738a = c3020b.f12738a;
            this.f12739b = c3020b.f12739b;
            this.f12741d = c3020b.f12741d;
            this.f12740c = c3020b.f12740c;
            this.f12742e = c3020b.f12742e;
            this.f12743f = c3020b.f12743f;
            this.f12744g = c3020b.f12744g;
            this.f12745h = c3020b.f12745h;
            this.f12746i = c3020b.f12746i;
            this.f12747j = c3020b.f12747j;
            this.f12748k = c3020b.f12748k;
            this.f12749l = c3020b.f12749l;
        }

        /* renamed from: a */
        private Cap m14751a(int i, Cap cap) {
            switch (i) {
                case 0:
                    return Cap.BUTT;
                case 1:
                    return Cap.ROUND;
                case 2:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Join m14752a(int i, Join join) {
            switch (i) {
                case 0:
                    return Join.MITER;
                case 1:
                    return Join.ROUND;
                case 2:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        public void m14754a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0388c.m1422a(resources, theme, attributeSet, C0071a.f83c);
            m14753a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        private void m14753a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f12750p = null;
            if (C0388c.m1425a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                string = typedArray.getString(2);
                if (string != null) {
                    this.m = C0302b.m1085b(string);
                }
                this.f12740c = C0388c.m1426b(typedArray, xmlPullParser, "fillColor", 1, this.f12740c);
                this.f12743f = C0388c.m1420a(typedArray, xmlPullParser, "fillAlpha", 12, this.f12743f);
                this.f12747j = m14751a(C0388c.m1421a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f12747j);
                this.f12748k = m14752a(C0388c.m1421a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f12748k);
                this.f12749l = C0388c.m1420a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f12749l);
                this.f12738a = C0388c.m1426b(typedArray, xmlPullParser, "strokeColor", 3, this.f12738a);
                this.f12741d = C0388c.m1420a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f12741d);
                this.f12739b = C0388c.m1420a(typedArray, xmlPullParser, "strokeWidth", 4, this.f12739b);
                this.f12745h = C0388c.m1420a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f12745h);
                this.f12746i = C0388c.m1420a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f12746i);
                this.f12744g = C0388c.m1420a(typedArray, xmlPullParser, "trimPathStart", 5, this.f12744g);
                this.f12742e = C0388c.m1421a(typedArray, xmlPullParser, "fillType", 13, this.f12742e);
            }
        }

        int getStrokeColor() {
            return this.f12738a;
        }

        void setStrokeColor(int i) {
            this.f12738a = i;
        }

        float getStrokeWidth() {
            return this.f12739b;
        }

        void setStrokeWidth(float f) {
            this.f12739b = f;
        }

        float getStrokeAlpha() {
            return this.f12741d;
        }

        void setStrokeAlpha(float f) {
            this.f12741d = f;
        }

        int getFillColor() {
            return this.f12740c;
        }

        void setFillColor(int i) {
            this.f12740c = i;
        }

        float getFillAlpha() {
            return this.f12743f;
        }

        void setFillAlpha(float f) {
            this.f12743f = f;
        }

        float getTrimPathStart() {
            return this.f12744g;
        }

        void setTrimPathStart(float f) {
            this.f12744g = f;
        }

        float getTrimPathEnd() {
            return this.f12745h;
        }

        void setTrimPathEnd(float f) {
            this.f12745h = f;
        }

        float getTrimPathOffset() {
            return this.f12746i;
        }

        void setTrimPathOffset(float f) {
            this.f12746i = f;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    C4400i() {
        this.f18314g = true;
        this.f18316i = new float[9];
        this.f18317j = new Matrix();
        this.f18318k = new Rect();
        this.f18310c = new C0085f();
    }

    C4400i(C0085f c0085f) {
        this.f18314g = true;
        this.f18316i = new float[9];
        this.f18317j = new Matrix();
        this.f18318k = new Rect();
        this.f18310c = c0085f;
        this.f18311d = m24038a(this.f18311d, c0085f.f138c, c0085f.f139d);
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
            return this;
        }
        if (!this.f18313f && super.mutate() == this) {
            this.f18310c = new C0085f(this.f18310c);
            this.f18313f = true;
        }
        return this;
    }

    /* renamed from: a */
    Object m24039a(String str) {
        return this.f18310c.f137b.f128h.get(str);
    }

    public ConstantState getConstantState() {
        if (this.b != null && VERSION.SDK_INT >= 24) {
            return new C0086g(this.b.getConstantState());
        }
        this.f18310c.f136a = getChangingConfigurations();
        return this.f18310c;
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        copyBounds(this.f18318k);
        if (this.f18318k.width() > 0) {
            if (this.f18318k.height() > 0) {
                ColorFilter colorFilter = this.f18312e == null ? this.f18311d : this.f18312e;
                canvas.getMatrix(this.f18317j);
                this.f18317j.getValues(this.f18316i);
                float abs = Math.abs(this.f18316i[0]);
                float abs2 = Math.abs(this.f18316i[4]);
                float abs3 = Math.abs(this.f18316i[1]);
                float abs4 = Math.abs(this.f18316i[3]);
                if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                int height = (int) (((float) this.f18318k.height()) * abs2);
                int min = Math.min(2048, (int) (((float) this.f18318k.width()) * abs));
                height = Math.min(2048, height);
                if (min > 0) {
                    if (height > 0) {
                        int save = canvas.save();
                        canvas.translate((float) this.f18318k.left, (float) this.f18318k.top);
                        if (m24036a()) {
                            canvas.translate((float) this.f18318k.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                        this.f18318k.offsetTo(0, 0);
                        this.f18310c.m190b(min, height);
                        if (!this.f18314g) {
                            this.f18310c.m187a(min, height);
                        } else if (!this.f18310c.m191b()) {
                            this.f18310c.m187a(min, height);
                            this.f18310c.m192c();
                        }
                        this.f18310c.m188a(canvas, colorFilter, this.f18318k);
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }

    public int getAlpha() {
        if (this.b != null) {
            return C0295a.m1057c(this.b);
        }
        return this.f18310c.f137b.getRootAlpha();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
            return;
        }
        if (this.f18310c.f137b.getRootAlpha() != i) {
            this.f18310c.f137b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f18312e = colorFilter;
        invalidateSelf();
    }

    /* renamed from: a */
    PorterDuffColorFilter m24038a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList != null) {
            if (mode != null) {
                return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
        }
        return null;
    }

    public void setTint(int i) {
        if (this.b != null) {
            C0295a.m1048a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0295a.m1050a(this.b, colorStateList);
            return;
        }
        C0085f c0085f = this.f18310c;
        if (c0085f.f138c != colorStateList) {
            c0085f.f138c = colorStateList;
            this.f18311d = m24038a(this.f18311d, colorStateList, c0085f.f139d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            C0295a.m1053a(this.b, mode);
            return;
        }
        C0085f c0085f = this.f18310c;
        if (c0085f.f139d != mode) {
            c0085f.f139d = mode;
            this.f18311d = m24038a(this.f18311d, c0085f.f138c, mode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        boolean z;
        if (!super.isStateful()) {
            if (this.f18310c == null || this.f18310c.f138c == null || !this.f18310c.f138c.isStateful()) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        iArr = this.f18310c;
        if (iArr.f138c == null || iArr.f139d == null) {
            return null;
        }
        this.f18311d = m24038a(this.f18311d, iArr.f138c, iArr.f139d);
        invalidateSelf();
        return 1;
    }

    public int getOpacity() {
        return this.b != null ? this.b.getOpacity() : -3;
    }

    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return (int) this.f18310c.f137b.f122b;
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return (int) this.f18310c.f137b.f123c;
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            C0295a.m1058d(this.b);
        }
        return false;
    }

    public boolean isAutoMirrored() {
        if (this.b != null) {
            return C0295a.m1055b(this.b);
        }
        return this.f18310c.f140e;
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0295a.m1054a(this.b, z);
        } else {
            this.f18310c.f140e = z;
        }
    }

    /* renamed from: a */
    public static C4400i m24033a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 24) {
            C4400i c4400i = new C4400i();
            c4400i.b = C0387b.m1419a(resources, i, theme);
            c4400i.f18315h = new C0086g(c4400i.b.getConstantState());
            return c4400i;
        }
        try {
            int next;
            i = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(i);
            while (true) {
                next = i.next();
                if (next == 2 || next == 1) {
                    if (next == 2) {
                        return C4400i.m24034a(resources, i, asAttributeSet, theme);
                    }
                    throw new XmlPullParserException("No start tag found");
                }
            }
            if (next == 2) {
                return C4400i.m24034a(resources, i, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Resources resources2) {
            Log.e("VectorDrawableCompat", "parser error", resources2);
            return null;
        } catch (Resources resources22) {
            Log.e("VectorDrawableCompat", "parser error", resources22);
            return null;
        }
    }

    /* renamed from: a */
    public static C4400i m24034a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C4400i c4400i = new C4400i();
        c4400i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c4400i;
    }

    /* renamed from: a */
    static int m24031a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0295a.m1052a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0085f c0085f = this.f18310c;
        c0085f.f137b = new C0084e();
        TypedArray a = C0388c.m1422a(resources, theme, attributeSet, C0071a.f81a);
        m24035a(a, xmlPullParser);
        a.recycle();
        c0085f.f136a = getChangingConfigurations();
        c0085f.f146k = true;
        m24037b(resources, xmlPullParser, attributeSet, theme);
        this.f18311d = m24038a(this.f18311d, c0085f.f138c, c0085f.f139d);
    }

    /* renamed from: a */
    private static Mode m24032a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m24035a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0085f c0085f = this.f18310c;
        C0084e c0084e = c0085f.f137b;
        c0085f.f139d = C4400i.m24032a(C0388c.m1421a(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            c0085f.f138c = colorStateList;
        }
        c0085f.f140e = C0388c.m1424a(typedArray, xmlPullParser, "autoMirrored", 5, c0085f.f140e);
        c0084e.f124d = C0388c.m1420a(typedArray, xmlPullParser, "viewportWidth", 7, c0084e.f124d);
        c0084e.f125e = C0388c.m1420a(typedArray, xmlPullParser, "viewportHeight", 8, c0084e.f125e);
        StringBuilder stringBuilder;
        if (c0084e.f124d <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(typedArray.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else if (c0084e.f125e > 0.0f) {
            c0084e.f122b = typedArray.getDimension(3, c0084e.f122b);
            c0084e.f123c = typedArray.getDimension(2, c0084e.f123c);
            if (c0084e.f122b <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else if (c0084e.f123c > 0.0f) {
                c0084e.setAlpha(C0388c.m1420a(typedArray, xmlPullParser, "alpha", 4, c0084e.getAlpha()));
                typedArray = typedArray.getString(null);
                if (typedArray != null) {
                    c0084e.f127g = typedArray;
                    c0084e.f128h.put(typedArray, c0084e);
                }
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(typedArray.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private void m24037b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0085f c0085f = this.f18310c;
        C0084e c0084e = c0085f.f137b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0084e.f121a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0082c c0082c = (C0082c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C3020b c3020b = new C3020b();
                    c3020b.m14754a(resources, attributeSet, theme, xmlPullParser);
                    c0082c.f104a.add(c3020b);
                    if (c3020b.getPathName() != null) {
                        c0084e.f128h.put(c3020b.getPathName(), c3020b);
                    }
                    obj = null;
                    c0085f.f136a = c3020b.o | c0085f.f136a;
                } else if ("clip-path".equals(name)) {
                    C3019a c3019a = new C3019a();
                    c3019a.m14749a(resources, attributeSet, theme, xmlPullParser);
                    c0082c.f104a.add(c3019a);
                    if (c3019a.getPathName() != null) {
                        c0084e.f128h.put(c3019a.getPathName(), c3019a);
                    }
                    c0085f.f136a = c3019a.o | c0085f.f136a;
                } else if ("group".equals(name)) {
                    C0082c c0082c2 = new C0082c();
                    c0082c2.m174a(resources, attributeSet, theme, xmlPullParser);
                    c0082c.f104a.add(c0082c2);
                    arrayDeque.push(c0082c2);
                    if (c0082c2.getGroupName() != null) {
                        c0084e.f128h.put(c0082c2.getGroupName(), c0082c2);
                    }
                    c0085f.f136a = c0082c2.f106c | c0085f.f136a;
                }
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (obj != null) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    void m24040a(boolean z) {
        this.f18314g = z;
    }

    /* renamed from: a */
    private boolean m24036a() {
        boolean z = false;
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (isAutoMirrored() && C0295a.m1063i(this) == 1) {
            z = true;
        }
        return z;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f18310c.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
