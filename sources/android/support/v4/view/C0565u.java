package android.support.v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.u */
public final class C0565u {
    /* renamed from: a */
    static final C0564c f1777a;

    /* renamed from: android.support.v4.view.u$c */
    static class C0564c {
        C0564c() {
        }

        /* renamed from: a */
        public boolean mo3788a(ViewParent viewParent, View view, View view2, int i) {
            return viewParent instanceof C0552k ? ((C0552k) viewParent).onStartNestedScroll(view, view2, i) : null;
        }

        /* renamed from: b */
        public void mo3789b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0552k) {
                ((C0552k) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo3783a(ViewParent viewParent, View view) {
            if (viewParent instanceof C0552k) {
                ((C0552k) viewParent).onStopNestedScroll(view);
            }
        }

        /* renamed from: a */
        public void mo3784a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C0552k) {
                ((C0552k) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo3785a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C0552k) {
                ((C0552k) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo3787a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent instanceof C0552k ? ((C0552k) viewParent).onNestedFling(view, f, f2, z) : null;
        }

        /* renamed from: a */
        public boolean mo3786a(ViewParent viewParent, View view, float f, float f2) {
            return viewParent instanceof C0552k ? ((C0552k) viewParent).onNestedPreFling(view, f, f2) : null;
        }
    }

    /* renamed from: android.support.v4.view.u$a */
    static class C3171a extends C0564c {
        C3171a() {
        }
    }

    /* renamed from: android.support.v4.view.u$b */
    static class C4444b extends C3171a {
        C4444b() {
        }

        /* renamed from: a */
        public boolean mo3788a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (View view3) {
                i = new StringBuilder();
                i.append("ViewParent ");
                i.append(viewParent);
                i.append(" does not implement interface ");
                i.append("method onStartNestedScroll");
                Log.e("ViewParentCompat", i.toString(), view3);
                return null;
            }
        }

        /* renamed from: b */
        public void mo3789b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (View view3) {
                i = new StringBuilder();
                i.append("ViewParent ");
                i.append(viewParent);
                i.append(" does not implement interface ");
                i.append("method onNestedScrollAccepted");
                Log.e("ViewParentCompat", i.toString(), view3);
            }
        }

        /* renamed from: a */
        public void mo3783a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (View view2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onStopNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), view2);
            }
        }

        /* renamed from: a */
        public void mo3784a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (View view2) {
                i2 = new StringBuilder();
                i2.append("ViewParent ");
                i2.append(viewParent);
                i2.append(" does not implement interface ");
                i2.append("method onNestedScroll");
                Log.e("ViewParentCompat", i2.toString(), view2);
            }
        }

        /* renamed from: a */
        public void mo3785a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (View view2) {
                i2 = new StringBuilder();
                i2.append("ViewParent ");
                i2.append(viewParent);
                i2.append(" does not implement interface ");
                i2.append("method onNestedPreScroll");
                Log.e("ViewParentCompat", i2.toString(), view2);
            }
        }

        /* renamed from: a */
        public boolean mo3787a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (View view2) {
                f2 = new StringBuilder();
                f2.append("ViewParent ");
                f2.append(viewParent);
                f2.append(" does not implement interface ");
                f2.append("method onNestedFling");
                Log.e("ViewParentCompat", f2.toString(), view2);
                return null;
            }
        }

        /* renamed from: a */
        public boolean mo3786a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (View view2) {
                f2 = new StringBuilder();
                f2.append("ViewParent ");
                f2.append(viewParent);
                f2.append(" does not implement interface ");
                f2.append("method onNestedPreFling");
                Log.e("ViewParentCompat", f2.toString(), view2);
                return null;
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1777a = new C4444b();
        } else if (VERSION.SDK_INT >= 19) {
            f1777a = new C3171a();
        } else {
            f1777a = new C0564c();
        }
    }

    /* renamed from: a */
    public static boolean m2232a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C3168l) {
            return ((C3168l) viewParent).mo3727a(view, view2, i, i2);
        }
        return i2 == 0 ? f1777a.mo3788a(viewParent, view, view2, i) : null;
    }

    /* renamed from: b */
    public static void m2233b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C3168l) {
            ((C3168l) viewParent).mo3728b(view, view2, i, i2);
        } else if (i2 == 0) {
            f1777a.mo3789b(viewParent, view, view2, i);
        }
    }

    /* renamed from: a */
    public static void m2227a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C3168l) {
            ((C3168l) viewParent).mo3729c(view, i);
        } else if (i == 0) {
            f1777a.mo3783a(viewParent, view);
        }
    }

    /* renamed from: a */
    public static void m2228a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C3168l) {
            ((C3168l) viewParent).mo3725a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            f1777a.mo3784a(viewParent, view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2229a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C3168l) {
            ((C3168l) viewParent).mo3726a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f1777a.mo3785a(viewParent, view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public static boolean m2231a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f1777a.mo3787a(viewParent, view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m2230a(ViewParent viewParent, View view, float f, float f2) {
        return f1777a.mo3786a(viewParent, view, f, f2);
    }
}
