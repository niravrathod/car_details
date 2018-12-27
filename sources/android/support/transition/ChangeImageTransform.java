package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.transition.ag.C0267a;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ChangeImageTransform extends Transition {
    /* renamed from: g */
    private static final String[] f13027g = new String[]{"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    /* renamed from: h */
    private static final TypeEvaluator<Matrix> f13028h = new C02481();
    /* renamed from: i */
    private static final Property<ImageView, Matrix> f13029i = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") {
        /* renamed from: a */
        public Matrix m889a(ImageView imageView) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m889a((ImageView) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m890a((ImageView) obj, (Matrix) obj2);
        }

        /* renamed from: a */
        public void m890a(ImageView imageView, Matrix matrix) {
            C0282k.m1034a(imageView, matrix);
        }
    };

    /* renamed from: android.support.transition.ChangeImageTransform$1 */
    static class C02481 implements TypeEvaluator<Matrix> {
        /* renamed from: a */
        public Matrix m888a(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }

        C02481() {
        }

        public /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            return m888a(f, (Matrix) obj, (Matrix) obj2);
        }
    }

    /* renamed from: android.support.transition.ChangeImageTransform$3 */
    static /* synthetic */ class C02503 {
        /* renamed from: a */
        static final /* synthetic */ int[] f895a = new int[ScaleType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = android.widget.ImageView.ScaleType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f895a = r0;
            r0 = f895a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f895a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ChangeImageTransform.3.<clinit>():void");
        }
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private void m15117d(ah ahVar) {
        View view = ahVar.f995b;
        if (view instanceof ImageView) {
            if (view.getVisibility() == 0) {
                ImageView imageView = (ImageView) view;
                if (imageView.getDrawable() != null) {
                    ahVar = ahVar.f994a;
                    ahVar.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                    ahVar.put("android:changeImageTransform:matrix", m15114b(imageView));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        m15117d(ahVar);
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        m15117d(ahVar);
    }

    /* renamed from: a */
    public String[] mo173a() {
        return f13027g;
    }

    /* renamed from: a */
    public Animator mo97a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (ahVar != null) {
            if (ahVar2 != null) {
                Rect rect = (Rect) ahVar.f994a.get("android:changeImageTransform:bounds");
                Rect rect2 = (Rect) ahVar2.f994a.get("android:changeImageTransform:bounds");
                if (rect != null) {
                    if (rect2 != null) {
                        Matrix matrix = (Matrix) ahVar.f994a.get("android:changeImageTransform:matrix");
                        Matrix matrix2 = (Matrix) ahVar2.f994a.get("android:changeImageTransform:matrix");
                        Object obj = (!(matrix == null && matrix2 == null) && (matrix == null || !matrix.equals(matrix2))) ? null : 1;
                        if (rect.equals(rect2) && obj != null) {
                            return null;
                        }
                        Animator a;
                        ImageView imageView = (ImageView) ahVar2.f995b;
                        ahVar2 = imageView.getDrawable();
                        int intrinsicWidth = ahVar2.getIntrinsicWidth();
                        ahVar2 = ahVar2.getIntrinsicHeight();
                        C0282k.m1032a(imageView);
                        if (intrinsicWidth != 0) {
                            if (ahVar2 != null) {
                                if (matrix == null) {
                                    matrix = C0286o.f1028a;
                                }
                                if (matrix2 == null) {
                                    matrix2 = C0286o.f1028a;
                                }
                                f13029i.set(imageView, matrix);
                                a = m15113a(imageView, matrix, matrix2);
                                C0282k.m1033a(imageView, a);
                                return a;
                            }
                        }
                        a = m15112a(imageView);
                        C0282k.m1033a(imageView, a);
                        return a;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    private ObjectAnimator m15112a(ImageView imageView) {
        return ObjectAnimator.ofObject(imageView, f13029i, f13028h, new Matrix[]{null, null});
    }

    /* renamed from: a */
    private ObjectAnimator m15113a(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f13029i, new C0267a(), new Matrix[]{matrix, matrix2});
    }

    /* renamed from: b */
    private static Matrix m15114b(ImageView imageView) {
        switch (C02503.f895a[imageView.getScaleType().ordinal()]) {
            case 1:
                return m15115c(imageView);
            case 2:
                return m15116d(imageView);
            default:
                return new Matrix(imageView.getImageMatrix());
        }
    }

    /* renamed from: c */
    private static Matrix m15115c(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: d */
    private static Matrix m15116d(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        float width = (float) imageView.getWidth();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float f = width / intrinsicWidth;
        imageView = (float) imageView.getHeight();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        f = Math.max(f, imageView / intrinsicHeight);
        intrinsicHeight *= f;
        int round = Math.round((width - (intrinsicWidth * f)) / 2.0f);
        imageView = Math.round((imageView - intrinsicHeight) / 1073741824);
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        matrix.postTranslate((float) round, (float) imageView);
        return matrix;
    }
}
