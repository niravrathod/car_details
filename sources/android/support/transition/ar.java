package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0560r;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ar implements at {
    /* renamed from: a */
    protected C0271a f13072a;

    /* renamed from: android.support.transition.ar$a */
    static class C0271a extends ViewGroup {
        /* renamed from: a */
        static Method f1012a;
        /* renamed from: b */
        ViewGroup f1013b;
        /* renamed from: c */
        View f1014c;
        /* renamed from: d */
        ArrayList<Drawable> f1015d = null;
        /* renamed from: e */
        ar f1016e;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

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
            r0 = android.view.ViewGroup.class;	 Catch:{ NoSuchMethodException -> 0x001c }
            r1 = "invalidateChildInParentFast";	 Catch:{ NoSuchMethodException -> 0x001c }
            r2 = 3;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 0;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 1;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 2;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = android.graphics.Rect.class;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x001c }
            f1012a = r0;	 Catch:{ NoSuchMethodException -> 0x001c }
        L_0x001c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ar.a.<clinit>():void");
        }

        C0271a(Context context, ViewGroup viewGroup, View view, ar arVar) {
            super(context);
            this.f1013b = viewGroup;
            this.f1014c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f1016e = arVar;
        }

        /* renamed from: a */
        public void m990a(Drawable drawable) {
            if (this.f1015d == null) {
                this.f1015d = new ArrayList();
            }
            if (!this.f1015d.contains(drawable)) {
                this.f1015d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void m993b(Drawable drawable) {
            if (this.f1015d != null) {
                this.f1015d.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        protected boolean verifyDrawable(Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                if (this.f1015d == null || this.f1015d.contains(drawable) == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: a */
        public void m991a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f1013b || viewGroup.getParent() == null || !C0560r.m2162A(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f1013b.getLocationOnScreen(iArr2);
                    C0560r.m2192d(view, iArr[0] - iArr2[0]);
                    C0560r.m2190c(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* renamed from: b */
        public void m994b(View view) {
            super.removeView(view);
            if (m992a() != null) {
                this.f1013b.removeView(this);
            }
        }

        /* renamed from: a */
        boolean m992a() {
            return getChildCount() == 0 && (this.f1015d == null || this.f1015d.size() == 0);
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f1013b.getLocationOnScreen(iArr);
            this.f1014c.getLocationOnScreen(iArr2);
            int i = 0;
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f1014c.getWidth(), this.f1014c.getHeight()));
            super.dispatchDraw(canvas);
            int size = this.f1015d == null ? 0 : this.f1015d.size();
            while (i < size) {
                ((Drawable) this.f1015d.get(i)).draw(canvas);
                i++;
            }
        }

        /* renamed from: a */
        private void m989a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f1013b.getLocationOnScreen(iArr2);
            this.f1014c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f1013b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f1013b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m989a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }
    }

    ar(Context context, ViewGroup viewGroup, View view) {
        this.f13072a = new C0271a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static ViewGroup m15236c(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: d */
    static ar m15237d(View view) {
        ViewGroup c = m15236c(view);
        if (c == null) {
            return null;
        }
        int childCount = c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c.getChildAt(i);
            if (childAt instanceof C0271a) {
                return ((C0271a) childAt).f1016e;
            }
        }
        return new ak(c.getContext(), c, view);
    }

    /* renamed from: a */
    public void mo221a(Drawable drawable) {
        this.f13072a.m990a(drawable);
    }

    /* renamed from: b */
    public void mo222b(Drawable drawable) {
        this.f13072a.m993b(drawable);
    }
}
