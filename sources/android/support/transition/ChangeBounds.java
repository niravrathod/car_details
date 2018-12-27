package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.transition.Transition.C0262c;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public class ChangeBounds extends Transition {
    /* renamed from: g */
    private static final String[] f13015g = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    /* renamed from: h */
    private static final Property<Drawable, PointF> f13016h = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        /* renamed from: a */
        private Rect f870a = new Rect();

        public /* synthetic */ Object get(Object obj) {
            return m873a((Drawable) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m874a((Drawable) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m874a(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f870a);
            this.f870a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f870a);
        }

        /* renamed from: a */
        public PointF m873a(Drawable drawable) {
            drawable.copyBounds(this.f870a);
            return new PointF((float) this.f870a.left, (float) this.f870a.top);
        }
    };
    /* renamed from: i */
    private static final Property<C0246a, PointF> f13017i = new Property<C0246a, PointF>(PointF.class, "topLeft") {
        /* renamed from: a */
        public PointF m875a(C0246a c0246a) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m875a((C0246a) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m876a((C0246a) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m876a(C0246a c0246a, PointF pointF) {
            c0246a.m886a(pointF);
        }
    };
    /* renamed from: j */
    private static final Property<C0246a, PointF> f13018j = new Property<C0246a, PointF>(PointF.class, "bottomRight") {
        /* renamed from: a */
        public PointF m877a(C0246a c0246a) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m877a((C0246a) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m878a((C0246a) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m878a(C0246a c0246a, PointF pointF) {
            c0246a.m887b(pointF);
        }
    };
    /* renamed from: k */
    private static final Property<View, PointF> f13019k = new Property<View, PointF>(PointF.class, "bottomRight") {
        /* renamed from: a */
        public PointF m879a(View view) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m879a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m880a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m880a(View view, PointF pointF) {
            au.m1005a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    /* renamed from: l */
    private static final Property<View, PointF> f13020l = new Property<View, PointF>(PointF.class, "topLeft") {
        /* renamed from: a */
        public PointF m881a(View view) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m881a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m882a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m882a(View view, PointF pointF) {
            au.m1005a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    /* renamed from: m */
    private static final Property<View, PointF> f13021m = new Property<View, PointF>(PointF.class, "position") {
        /* renamed from: a */
        public PointF m883a(View view) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m883a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m884a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m884a(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            pointF = Math.round(pointF.y);
            au.m1005a(view, round, pointF, view.getWidth() + round, view.getHeight() + pointF);
        }
    };
    /* renamed from: q */
    private static C0294z f13022q = new C0294z();
    /* renamed from: n */
    private int[] f13023n;
    /* renamed from: o */
    private boolean f13024o;
    /* renamed from: p */
    private boolean f13025p;

    /* renamed from: android.support.transition.ChangeBounds$a */
    private static class C0246a {
        /* renamed from: a */
        private int f886a;
        /* renamed from: b */
        private int f887b;
        /* renamed from: c */
        private int f888c;
        /* renamed from: d */
        private int f889d;
        /* renamed from: e */
        private View f890e;
        /* renamed from: f */
        private int f891f;
        /* renamed from: g */
        private int f892g;

        C0246a(View view) {
            this.f890e = view;
        }

        /* renamed from: a */
        void m886a(PointF pointF) {
            this.f886a = Math.round(pointF.x);
            this.f887b = Math.round(pointF.y);
            this.f891f++;
            if (this.f891f == this.f892g) {
                m885a();
            }
        }

        /* renamed from: b */
        void m887b(PointF pointF) {
            this.f888c = Math.round(pointF.x);
            this.f889d = Math.round(pointF.y);
            this.f892g++;
            if (this.f891f == this.f892g) {
                m885a();
            }
        }

        /* renamed from: a */
        private void m885a() {
            au.m1005a(this.f890e, this.f886a, this.f887b, this.f888c, this.f889d);
            this.f891f = 0;
            this.f892g = 0;
        }
    }

    public ChangeBounds() {
        this.f13023n = new int[2];
        this.f13024o = false;
        this.f13025p = false;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13023n = new int[2];
        this.f13024o = false;
        this.f13025p = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f978d);
        boolean a = C0388c.m1424a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        m15104a(a);
    }

    /* renamed from: a */
    public String[] mo173a() {
        return f13015g;
    }

    /* renamed from: a */
    public void m15104a(boolean z) {
        this.f13024o = z;
    }

    /* renamed from: d */
    private void m15101d(ah ahVar) {
        View view = ahVar.f995b;
        if (C0560r.m2212x(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            ahVar.f994a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            ahVar.f994a.put("android:changeBounds:parent", ahVar.f995b.getParent());
            if (this.f13025p) {
                ahVar.f995b.getLocationInWindow(this.f13023n);
                ahVar.f994a.put("android:changeBounds:windowX", Integer.valueOf(this.f13023n[0]));
                ahVar.f994a.put("android:changeBounds:windowY", Integer.valueOf(this.f13023n[1]));
            }
            if (this.f13024o) {
                ahVar.f994a.put("android:changeBounds:clip", C0560r.m2214z(view));
            }
        }
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        m15101d(ahVar);
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        m15101d(ahVar);
    }

    /* renamed from: a */
    private boolean m15100a(View view, View view2) {
        if (!this.f13025p) {
            return true;
        }
        ah b = m943b(view, true);
        if (b == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == b.f995b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Animator mo97a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        ChangeBounds changeBounds = this;
        ah ahVar3 = ahVar;
        ah ahVar4 = ahVar2;
        if (ahVar3 != null) {
            if (ahVar4 != null) {
                ViewGroup viewGroup2 = (ViewGroup) ahVar3.f994a.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) ahVar4.f994a.get("android:changeBounds:parent");
                if (viewGroup2 != null) {
                    if (viewGroup3 != null) {
                        View view = ahVar4.f995b;
                        int i;
                        int i2;
                        int i3;
                        Animator ofObject;
                        if (m15100a(viewGroup2, viewGroup3)) {
                            Rect rect = (Rect) ahVar3.f994a.get("android:changeBounds:bounds");
                            Rect rect2 = (Rect) ahVar4.f994a.get("android:changeBounds:bounds");
                            int i4 = rect.left;
                            int i5 = rect2.left;
                            int i6 = rect.top;
                            int i7 = rect2.top;
                            int i8 = rect.right;
                            int i9 = rect2.right;
                            i = rect.bottom;
                            int i10 = rect2.bottom;
                            int i11 = i8 - i4;
                            i2 = i - i6;
                            int i12 = i9 - i5;
                            int i13 = i10 - i7;
                            View view2 = view;
                            Rect rect3 = (Rect) ahVar3.f994a.get("android:changeBounds:clip");
                            Rect rect4 = (Rect) ahVar4.f994a.get("android:changeBounds:clip");
                            if ((i11 == 0 || i2 == 0) && (i12 == 0 || i13 == 0)) {
                                i3 = 0;
                            } else {
                                if (i4 == i5) {
                                    if (i6 == i7) {
                                        i3 = 0;
                                        if (!(i8 == i9 && i == i10)) {
                                            i3++;
                                        }
                                    }
                                }
                                i3 = 1;
                                i3++;
                            }
                            if (!(rect3 == null || rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                                i3++;
                            }
                            if (i3 > 0) {
                                Animator a;
                                Rect rect5 = rect4;
                                Rect rect6 = rect3;
                                if (changeBounds.f13024o) {
                                    Animator animator;
                                    Rect rect7;
                                    final View view3;
                                    view = view2;
                                    au.m1005a(view, i4, i6, Math.max(i11, i12) + i4, Math.max(i2, i13) + i6);
                                    if (i4 == i5) {
                                        if (i6 == i7) {
                                            animator = null;
                                            if (rect6 != null) {
                                                i = 0;
                                                rect7 = new Rect(0, 0, i11, i2);
                                            } else {
                                                i = 0;
                                                rect7 = rect6;
                                            }
                                            if (rect7.equals(rect5 != null ? new Rect(i, i, i12, i13) : rect5)) {
                                                C0560r.m2173a(view, rect7);
                                                ofObject = ObjectAnimator.ofObject(view, "clipBounds", f13022q, new Object[]{rect7, r2});
                                                view3 = view;
                                                rect = rect5;
                                                i13 = i5;
                                                i11 = i7;
                                                i4 = i9;
                                                i5 = i10;
                                                ofObject.addListener(new AnimatorListenerAdapter(this) {
                                                    /* renamed from: g */
                                                    final /* synthetic */ ChangeBounds f884g;
                                                    /* renamed from: h */
                                                    private boolean f885h;

                                                    public void onAnimationCancel(Animator animator) {
                                                        this.f885h = true;
                                                    }

                                                    public void onAnimationEnd(Animator animator) {
                                                        if (this.f885h == null) {
                                                            C0560r.m2173a(view3, rect);
                                                            au.m1005a(view3, i13, i11, i4, i5);
                                                        }
                                                    }
                                                });
                                            } else {
                                                ofObject = null;
                                            }
                                            a = ag.m981a(animator, ofObject);
                                        }
                                    }
                                    animator = C0287p.m1039a(view, f13021m, m961l().mo172a((float) i4, (float) i6, (float) i5, (float) i7));
                                    if (rect6 != null) {
                                        i = 0;
                                        rect7 = rect6;
                                    } else {
                                        i = 0;
                                        rect7 = new Rect(0, 0, i11, i2);
                                    }
                                    if (rect5 != null) {
                                    }
                                    if (rect7.equals(rect5 != null ? new Rect(i, i, i12, i13) : rect5)) {
                                        ofObject = null;
                                    } else {
                                        C0560r.m2173a(view, rect7);
                                        ofObject = ObjectAnimator.ofObject(view, "clipBounds", f13022q, new Object[]{rect7, r2});
                                        view3 = view;
                                        rect = rect5;
                                        i13 = i5;
                                        i11 = i7;
                                        i4 = i9;
                                        i5 = i10;
                                        ofObject.addListener(/* anonymous class already generated */);
                                    }
                                    a = ag.m981a(animator, ofObject);
                                } else {
                                    view = view2;
                                    au.m1005a(view, i4, i6, i8, i);
                                    if (i3 != 2) {
                                        if (i4 == i5) {
                                            if (i6 == i7) {
                                                a = C0287p.m1039a(view, f13019k, m961l().mo172a((float) i8, (float) i, (float) i9, (float) i10));
                                            }
                                        }
                                        a = C0287p.m1039a(view, f13020l, m961l().mo172a((float) i4, (float) i6, (float) i5, (float) i7));
                                    } else if (i11 == i12 && i2 == i13) {
                                        a = C0287p.m1039a(view, f13021m, m961l().mo172a((float) i4, (float) i6, (float) i5, (float) i7));
                                    } else {
                                        final C0246a c0246a = new C0246a(view);
                                        ObjectAnimator a2 = C0287p.m1039a(c0246a, f13017i, m961l().mo172a((float) i4, (float) i6, (float) i5, (float) i7));
                                        ObjectAnimator a3 = C0287p.m1039a(c0246a, f13018j, m961l().mo172a((float) i8, (float) i, (float) i9, (float) i10));
                                        Animator animatorSet = new AnimatorSet();
                                        animatorSet.playTogether(new Animator[]{a2, a3});
                                        animatorSet.addListener(new AnimatorListenerAdapter(changeBounds) {
                                            /* renamed from: b */
                                            final /* synthetic */ ChangeBounds f877b;
                                            private C0246a mViewBounds = c0246a;
                                        });
                                        a = animatorSet;
                                    }
                                }
                                if (view.getParent() instanceof ViewGroup) {
                                    final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                                    an.m986a(viewGroup4, true);
                                    mo199a(new ad(changeBounds) {
                                        /* renamed from: a */
                                        boolean f18373a = null;
                                        /* renamed from: c */
                                        final /* synthetic */ ChangeBounds f18375c;

                                        /* renamed from: a */
                                        public void mo175a(Transition transition) {
                                            if (!this.f18373a) {
                                                an.m986a(viewGroup4, false);
                                            }
                                            transition.mo206b((C0262c) this);
                                        }

                                        /* renamed from: b */
                                        public void mo176b(Transition transition) {
                                            an.m986a(viewGroup4, false);
                                        }

                                        /* renamed from: c */
                                        public void mo177c(Transition transition) {
                                            an.m986a(viewGroup4, true);
                                        }
                                    });
                                }
                                return a;
                            }
                        }
                        i2 = ((Integer) ahVar3.f994a.get("android:changeBounds:windowX")).intValue();
                        int intValue = ((Integer) ahVar3.f994a.get("android:changeBounds:windowY")).intValue();
                        i = ((Integer) ahVar4.f994a.get("android:changeBounds:windowX")).intValue();
                        i3 = ((Integer) ahVar4.f994a.get("android:changeBounds:windowY")).intValue();
                        if (i2 == i) {
                            if (intValue != i3) {
                            }
                        }
                        viewGroup.getLocationInWindow(changeBounds.f13023n);
                        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
                        view.draw(new Canvas(createBitmap));
                        Drawable bitmapDrawable = new BitmapDrawable(createBitmap);
                        float c = au.m1009c(view);
                        au.m1003a(view, 0.0f);
                        au.m1001a(viewGroup).mo221a(bitmapDrawable);
                        PropertyValuesHolder a4 = C0290u.m1043a(f13016h, m961l().mo172a((float) (i2 - changeBounds.f13023n[0]), (float) (intValue - changeBounds.f13023n[1]), (float) (i - changeBounds.f13023n[0]), (float) (i3 - changeBounds.f13023n[1])));
                        ofObject = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{a4});
                        final ViewGroup viewGroup5 = viewGroup;
                        final Drawable drawable = bitmapDrawable;
                        final View view4 = view;
                        final float f = c;
                        ofObject.addListener(new AnimatorListenerAdapter(this) {
                            /* renamed from: e */
                            final /* synthetic */ ChangeBounds f875e;

                            public void onAnimationEnd(Animator animator) {
                                au.m1001a(viewGroup5).mo222b(drawable);
                                au.m1003a(view4, f);
                            }
                        });
                        return ofObject;
                        return null;
                    }
                }
                return null;
            }
        }
        return null;
    }
}
