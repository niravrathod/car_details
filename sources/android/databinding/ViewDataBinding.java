package android.databinding;

import android.annotation.TargetApi;
import android.arch.lifecycle.C0022e;
import android.arch.lifecycle.C0023f;
import android.arch.lifecycle.C0029m;
import android.arch.lifecycle.Lifecycle.Event;
import android.databinding.C0057c.C0056a;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.android.databinding.library.C1035a.C1034a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends C3015a {
    /* renamed from: a */
    static int f18280a = VERSION.SDK_INT;
    /* renamed from: c */
    private static final int f18281c = "binding_".length();
    /* renamed from: d */
    private static final boolean f18282d = (f18280a >= 16);
    /* renamed from: e */
    private static final C0051a f18283e = new C30101();
    /* renamed from: f */
    private static final C0051a f18284f = new C30112();
    /* renamed from: g */
    private static final C0051a f18285g = new C30123();
    /* renamed from: h */
    private static final C0051a f18286h = new C30134();
    /* renamed from: i */
    private static final C0056a<C0063h, ViewDataBinding, Void> f18287i = new C30145();
    /* renamed from: j */
    private static final ReferenceQueue<ViewDataBinding> f18288j = new ReferenceQueue();
    /* renamed from: k */
    private static final OnAttachStateChangeListener f18289k;
    /* renamed from: b */
    protected final C0059e f18290b;
    /* renamed from: l */
    private final Runnable f18291l = new C00497(this);
    /* renamed from: m */
    private boolean f18292m = false;
    /* renamed from: n */
    private boolean f18293n = false;
    /* renamed from: o */
    private C0054d[] f18294o;
    /* renamed from: p */
    private final View f18295p;
    /* renamed from: q */
    private C0057c<C0063h, ViewDataBinding, Void> f18296q;
    /* renamed from: r */
    private boolean f18297r;
    /* renamed from: s */
    private Choreographer f18298s;
    /* renamed from: t */
    private final FrameCallback f18299t;
    /* renamed from: u */
    private Handler f18300u;
    /* renamed from: v */
    private ViewDataBinding f18301v;
    /* renamed from: w */
    private C0023f f18302w;

    /* renamed from: android.databinding.ViewDataBinding$6 */
    static class C00486 implements OnAttachStateChangeListener {
        public void onViewDetachedFromWindow(View view) {
        }

        C00486() {
        }

        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m24014b(view).f18291l.run();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$7 */
    class C00497 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ViewDataBinding f67a;

        C00497(ViewDataBinding viewDataBinding) {
            this.f67a = viewDataBinding;
        }

        public void run() {
            synchronized (this) {
                this.f67a.f18292m = false;
            }
            ViewDataBinding.m24020i();
            if (VERSION.SDK_INT < 19 || this.f67a.f18295p.isAttachedToWindow()) {
                this.f67a.m24021a();
                return;
            }
            this.f67a.f18295p.removeOnAttachStateChangeListener(ViewDataBinding.f18289k);
            this.f67a.f18295p.addOnAttachStateChangeListener(ViewDataBinding.f18289k);
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$8 */
    class C00508 implements FrameCallback {
        /* renamed from: a */
        final /* synthetic */ ViewDataBinding f68a;

        C00508(ViewDataBinding viewDataBinding) {
            this.f68a = viewDataBinding;
        }

        public void doFrame(long j) {
            this.f68a.f18291l.run();
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$a */
    private interface C0051a {
    }

    /* renamed from: android.databinding.ViewDataBinding$b */
    protected static class C0052b {
        /* renamed from: a */
        public final String[][] f69a;
        /* renamed from: b */
        public final int[][] f70b;
        /* renamed from: c */
        public final int[][] f71c;
    }

    /* renamed from: android.databinding.ViewDataBinding$c */
    private interface C0053c<T> {
        /* renamed from: a */
        void m115a(T t);
    }

    /* renamed from: android.databinding.ViewDataBinding$d */
    private static class C0054d<T> extends WeakReference<ViewDataBinding> {
        /* renamed from: a */
        private final C0053c<T> f72a;
        /* renamed from: b */
        private T f73b;

        /* renamed from: a */
        public boolean m116a() {
            boolean z;
            if (this.f73b != null) {
                this.f72a.m115a(this.f73b);
                z = true;
            } else {
                z = false;
            }
            this.f73b = null;
            return z;
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$1 */
    static class C30101 implements C0051a {
        C30101() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$2 */
    static class C30112 implements C0051a {
        C30112() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$3 */
    static class C30123 implements C0051a {
        C30123() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$4 */
    static class C30134 implements C0051a {
        C30134() {
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$5 */
    static class C30145 extends C0056a<C0063h, ViewDataBinding, Void> {
        C30145() {
        }

        /* renamed from: a */
        public void m14743a(C0063h c0063h, ViewDataBinding viewDataBinding, int i, Void voidR) {
            switch (i) {
                case 1:
                    if (c0063h.m137a(viewDataBinding) == null) {
                        viewDataBinding.f18293n = true;
                        return;
                    }
                    return;
                case 2:
                    c0063h.m138b(viewDataBinding);
                    return;
                case 3:
                    c0063h.m139c(viewDataBinding);
                    return;
                default:
                    return;
            }
        }
    }

    public class OnStartListener implements C0022e {
        /* renamed from: a */
        final /* synthetic */ ViewDataBinding f12734a;

        @C0029m(a = Event.ON_START)
        public void onStart() {
            this.f12734a.m24021a();
        }
    }

    /* renamed from: a */
    public abstract boolean mo4903a(int i, Object obj);

    /* renamed from: b */
    protected abstract void mo4904b();

    /* renamed from: c */
    public abstract boolean mo4905c();

    static {
        if (VERSION.SDK_INT < 19) {
            f18289k = null;
        } else {
            f18289k = new C00486();
        }
    }

    protected ViewDataBinding(C0059e c0059e, View view, int i) {
        this.f18290b = c0059e;
        this.f18294o = new C0054d[i];
        this.f18295p = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f18282d != null) {
            this.f18298s = Choreographer.getInstance();
            this.f18299t = new C00508(this);
        } else {
            this.f18299t = null;
            this.f18300u = new Handler(Looper.myLooper());
        }
    }

    /* renamed from: a */
    protected void m24022a(View view) {
        view.setTag(C1034a.dataBinding, this);
    }

    /* renamed from: a */
    public void m24021a() {
        if (this.f18301v == null) {
            mo4906h();
        } else {
            this.f18301v.m24021a();
        }
    }

    /* renamed from: h */
    private void mo4906h() {
        if (this.f18297r) {
            m24027e();
        } else if (mo4905c()) {
            this.f18297r = true;
            this.f18293n = false;
            if (this.f18296q != null) {
                this.f18296q.m127a(this, 1, null);
                if (this.f18293n) {
                    this.f18296q.m127a(this, 2, null);
                }
            }
            if (!this.f18293n) {
                mo4904b();
                if (this.f18296q != null) {
                    this.f18296q.m127a(this, 3, null);
                }
            }
            this.f18297r = false;
        }
    }

    /* renamed from: b */
    static ViewDataBinding m24014b(View view) {
        return view != null ? (ViewDataBinding) view.getTag(C1034a.dataBinding) : null;
    }

    /* renamed from: d */
    public View m24026d() {
        return this.f18295p;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    protected void m24027e() {
        /*
        r2 = this;
        r0 = r2.f18301v;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r2.f18301v;
        r0.m24027e();
        goto L_0x003f;
    L_0x000a:
        monitor-enter(r2);
        r0 = r2.f18292m;	 Catch:{ all -> 0x0040 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x0040 }
        return;
    L_0x0011:
        r0 = 1;
        r2.f18292m = r0;	 Catch:{ all -> 0x0040 }
        monitor-exit(r2);	 Catch:{ all -> 0x0040 }
        r0 = r2.f18302w;
        if (r0 == 0) goto L_0x002c;
    L_0x0019:
        r0 = r2.f18302w;
        r0 = r0.getLifecycle();
        r0 = r0.mo15a();
        r1 = android.arch.lifecycle.Lifecycle.State.STARTED;
        r0 = r0.m22a(r1);
        if (r0 != 0) goto L_0x002c;
    L_0x002b:
        return;
    L_0x002c:
        r0 = f18282d;
        if (r0 == 0) goto L_0x0038;
    L_0x0030:
        r0 = r2.f18298s;
        r1 = r2.f18299t;
        r0.postFrameCallback(r1);
        goto L_0x003f;
    L_0x0038:
        r0 = r2.f18300u;
        r1 = r2.f18291l;
        r0.post(r1);
    L_0x003f:
        return;
    L_0x0040:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0040 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.ViewDataBinding.e():void");
    }

    /* renamed from: a */
    protected static Object[] m24012a(C0059e c0059e, View view, int i, C0052b c0052b, SparseIntArray sparseIntArray) {
        i = new Object[i];
        m24009a(c0059e, view, i, c0052b, sparseIntArray, true);
        return i;
    }

    /* renamed from: a */
    private static void m24009a(C0059e c0059e, View view, Object[] objArr, C0052b c0052b, SparseIntArray sparseIntArray, boolean z) {
        C0059e c0059e2 = c0059e;
        View view2 = view;
        C0052b c0052b2 = c0052b;
        SparseIntArray sparseIntArray2 = sparseIntArray;
        if (m24014b(view) == null) {
            int lastIndexOf;
            int b;
            int i;
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            int i2 = 1;
            if (z && str != null && str.startsWith("layout")) {
                lastIndexOf = str.lastIndexOf(95);
                if (lastIndexOf > 0) {
                    lastIndexOf++;
                    if (m24011a(str, lastIndexOf)) {
                        b = m24013b(str, lastIndexOf);
                        if (objArr[b] == null) {
                            objArr[b] = view2;
                        }
                        if (c0052b2 == null) {
                            b = -1;
                        }
                        lastIndexOf = b;
                        tag = 1;
                        i = lastIndexOf;
                    }
                }
                tag = null;
                lastIndexOf = -1;
                i = lastIndexOf;
            } else if (str == null || !str.startsWith("binding_")) {
                tag = null;
                i = -1;
            } else {
                b = m24013b(str, f18281c);
                if (objArr[b] == null) {
                    objArr[b] = view2;
                }
                if (c0052b2 == null) {
                    b = -1;
                }
                i = b;
                tag = 1;
            }
            if (tag == null) {
                b = view.getId();
                if (b > 0 && sparseIntArray2 != null) {
                    b = sparseIntArray2.get(b, -1);
                    if (b >= 0 && objArr[b] == null) {
                        objArr[b] = view2;
                    }
                }
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                int i3 = 0;
                b = 0;
                while (i3 < childCount) {
                    int i4;
                    int i5;
                    View childAt = viewGroup.getChildAt(i3);
                    if (i >= 0 && (childAt.getTag() instanceof String)) {
                        String str2 = (String) childAt.getTag();
                        if (str2.endsWith("_0") && str2.startsWith("layout") && str2.indexOf(47) > 0) {
                            lastIndexOf = m24007a(str2, b, c0052b2, i);
                            if (lastIndexOf >= 0) {
                                b = lastIndexOf + 1;
                                int i6 = c0052b2.f70b[i][lastIndexOf];
                                lastIndexOf = c0052b2.f71c[i][lastIndexOf];
                                int a = m24006a(viewGroup, i3);
                                if (a == i3) {
                                    objArr[i6] = C0060f.m131a(c0059e, childAt, lastIndexOf);
                                    i4 = i3;
                                    i5 = b;
                                } else {
                                    a = (a - i3) + i2;
                                    View[] viewArr = new View[a];
                                    for (i4 = 0; i4 < a; i4++) {
                                        viewArr[i4] = viewGroup.getChildAt(i3 + i4);
                                    }
                                    objArr[i6] = C0060f.m133a(c0059e, viewArr, lastIndexOf);
                                    i4 = i3 + (a - 1);
                                    i5 = b;
                                    i2 = 1;
                                }
                                if (i2 == 0) {
                                    m24009a(c0059e, childAt, objArr, c0052b, sparseIntArray, false);
                                }
                                i3 = i4 + 1;
                                b = i5;
                                i2 = 1;
                            }
                        }
                    }
                    i4 = i3;
                    i5 = b;
                    i2 = 0;
                    if (i2 == 0) {
                        m24009a(c0059e, childAt, objArr, c0052b, sparseIntArray, false);
                    }
                    i3 = i4 + 1;
                    b = i5;
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m24007a(String str, int i, C0052b c0052b, int i2) {
        str = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        c0052b = c0052b.f69a[i2];
        i2 = c0052b.length;
        while (i < i2) {
            if (TextUtils.equals(str, c0052b[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private static int m24006a(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (m24011a(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m24011a(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: b */
    private static int m24013b(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            i2 = (i2 * 10) + (str.charAt(i) - 48);
            i++;
        }
        return i2;
    }

    /* renamed from: i */
    private static void m24020i() {
        while (true) {
            Reference poll = f18288j.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C0054d) {
                ((C0054d) poll).m116a();
            }
        }
    }
}
