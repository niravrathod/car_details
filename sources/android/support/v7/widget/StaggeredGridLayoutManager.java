package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.view.p018a.C0532b.C0531c;
import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0783i.C0781a;
import android.support.v7.widget.RecyclerView.C0790o;
import android.support.v7.widget.RecyclerView.C0794r;
import android.support.v7.widget.RecyclerView.C0794r.C0793b;
import android.support.v7.widget.RecyclerView.C0795s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends C0783i implements C0793b {
    /* renamed from: A */
    private SavedState f13862A;
    /* renamed from: B */
    private int f13863B;
    /* renamed from: C */
    private final Rect f13864C = new Rect();
    /* renamed from: D */
    private final C0823a f13865D = new C0823a(this);
    /* renamed from: E */
    private boolean f13866E = false;
    /* renamed from: F */
    private boolean f13867F = true;
    /* renamed from: G */
    private int[] f13868G;
    /* renamed from: H */
    private final Runnable f13869H = new C08201(this);
    /* renamed from: a */
    C0824b[] f13870a;
    /* renamed from: b */
    ai f13871b;
    /* renamed from: c */
    ai f13872c;
    /* renamed from: d */
    boolean f13873d = false;
    /* renamed from: e */
    boolean f13874e = false;
    /* renamed from: f */
    int f13875f = -1;
    /* renamed from: g */
    int f13876g = Integer.MIN_VALUE;
    /* renamed from: h */
    LazySpanLookup f13877h = new LazySpanLookup();
    /* renamed from: i */
    private int f13878i = -1;
    /* renamed from: j */
    private int f13879j;
    /* renamed from: k */
    private int f13880k;
    /* renamed from: l */
    private final ae f13881l;
    /* renamed from: m */
    private BitSet f13882m;
    /* renamed from: n */
    private int f13883n = 2;
    /* renamed from: o */
    private boolean f13884o;
    /* renamed from: z */
    private boolean f13885z;

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$1 */
    class C08201 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ StaggeredGridLayoutManager f2623a;

        C08201(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.f2623a = staggeredGridLayoutManager;
        }

        public void run() {
            this.f2623a.m16614g();
        }
    }

    static class LazySpanLookup {
        /* renamed from: a */
        int[] f2628a;
        /* renamed from: b */
        List<FullSpanItem> f2629b;

        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new C08211();
            /* renamed from: a */
            int f2624a;
            /* renamed from: b */
            int f2625b;
            /* renamed from: c */
            int[] f2626c;
            /* renamed from: d */
            boolean f2627d;

            /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 */
            static class C08211 implements Creator<FullSpanItem> {
                C08211() {
                }

                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m3328a(parcel);
                }

                public /* synthetic */ Object[] newArray(int i) {
                    return m3329a(i);
                }

                /* renamed from: a */
                public FullSpanItem m3328a(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: a */
                public FullSpanItem[] m3329a(int i) {
                    return new FullSpanItem[i];
                }
            }

            public int describeContents() {
                return 0;
            }

            FullSpanItem(Parcel parcel) {
                this.f2624a = parcel.readInt();
                this.f2625b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f2627d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f2626c = new int[readInt];
                    parcel.readIntArray(this.f2626c);
                }
            }

            FullSpanItem() {
            }

            /* renamed from: a */
            int m3330a(int i) {
                return this.f2626c == null ? 0 : this.f2626c[i];
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2624a);
                parcel.writeInt(this.f2625b);
                parcel.writeInt(this.f2627d);
                if (this.f2626c == 0 || this.f2626c.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(this.f2626c.length);
                parcel.writeIntArray(this.f2626c);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FullSpanItem{mPosition=");
                stringBuilder.append(this.f2624a);
                stringBuilder.append(", mGapDir=");
                stringBuilder.append(this.f2625b);
                stringBuilder.append(", mHasUnwantedGapAfter=");
                stringBuilder.append(this.f2627d);
                stringBuilder.append(", mGapPerSpan=");
                stringBuilder.append(Arrays.toString(this.f2626c));
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        LazySpanLookup() {
        }

        /* renamed from: a */
        int m3334a(int i) {
            if (this.f2629b != null) {
                for (int size = this.f2629b.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f2629b.get(size)).f2624a >= i) {
                        this.f2629b.remove(size);
                    }
                }
            }
            return m3340b(i);
        }

        /* renamed from: b */
        int m3340b(int i) {
            if (this.f2628a == null || i >= this.f2628a.length) {
                return -1;
            }
            int g = m3333g(i);
            if (g == -1) {
                Arrays.fill(this.f2628a, i, this.f2628a.length, -1);
                return this.f2628a.length;
            }
            g++;
            Arrays.fill(this.f2628a, i, g, -1);
            return g;
        }

        /* renamed from: c */
        int m3342c(int i) {
            if (this.f2628a != null) {
                if (i < this.f2628a.length) {
                    return this.f2628a[i];
                }
            }
            return -1;
        }

        /* renamed from: a */
        void m3338a(int i, C0824b c0824b) {
            m3344e(i);
            this.f2628a[i] = c0824b.f2651e;
        }

        /* renamed from: d */
        int m3343d(int i) {
            int length = this.f2628a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: e */
        void m3344e(int i) {
            if (this.f2628a == null) {
                this.f2628a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f2628a, -1);
            } else if (i >= this.f2628a.length) {
                Object obj = this.f2628a;
                this.f2628a = new int[m3343d(i)];
                System.arraycopy(obj, 0, this.f2628a, 0, obj.length);
                Arrays.fill(this.f2628a, obj.length, this.f2628a.length, -1);
            }
        }

        /* renamed from: a */
        void m3336a() {
            if (this.f2628a != null) {
                Arrays.fill(this.f2628a, -1);
            }
            this.f2629b = null;
        }

        /* renamed from: a */
        void m3337a(int i, int i2) {
            if (this.f2628a != null) {
                if (i < this.f2628a.length) {
                    int i3 = i + i2;
                    m3344e(i3);
                    System.arraycopy(this.f2628a, i3, this.f2628a, i, (this.f2628a.length - i) - i2);
                    Arrays.fill(this.f2628a, this.f2628a.length - i2, this.f2628a.length, -1);
                    m3331c(i, i2);
                }
            }
        }

        /* renamed from: c */
        private void m3331c(int i, int i2) {
            if (this.f2629b != null) {
                int i3 = i + i2;
                for (int size = this.f2629b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f2629b.get(size);
                    if (fullSpanItem.f2624a >= i) {
                        if (fullSpanItem.f2624a < i3) {
                            this.f2629b.remove(size);
                        } else {
                            fullSpanItem.f2624a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        void m3341b(int i, int i2) {
            if (this.f2628a != null) {
                if (i < this.f2628a.length) {
                    int i3 = i + i2;
                    m3344e(i3);
                    System.arraycopy(this.f2628a, i, this.f2628a, i3, (this.f2628a.length - i) - i2);
                    Arrays.fill(this.f2628a, i, i3, -1);
                    m3332d(i, i2);
                }
            }
        }

        /* renamed from: d */
        private void m3332d(int i, int i2) {
            if (this.f2629b != null) {
                for (int size = this.f2629b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f2629b.get(size);
                    if (fullSpanItem.f2624a >= i) {
                        fullSpanItem.f2624a += i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m3333g(int i) {
            if (this.f2629b == null) {
                return -1;
            }
            FullSpanItem f = m3345f(i);
            if (f != null) {
                this.f2629b.remove(f);
            }
            int size = this.f2629b.size();
            int i2 = 0;
            while (i2 < size) {
                if (((FullSpanItem) this.f2629b.get(i2)).f2624a >= i) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f2629b.get(i2);
            this.f2629b.remove(i2);
            return fullSpanItem.f2624a;
        }

        /* renamed from: a */
        public void m3339a(FullSpanItem fullSpanItem) {
            if (this.f2629b == null) {
                this.f2629b = new ArrayList();
            }
            int size = this.f2629b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f2629b.get(i);
                if (fullSpanItem2.f2624a == fullSpanItem.f2624a) {
                    this.f2629b.remove(i);
                }
                if (fullSpanItem2.f2624a >= fullSpanItem.f2624a) {
                    this.f2629b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f2629b.add(fullSpanItem);
        }

        /* renamed from: f */
        public FullSpanItem m3345f(int i) {
            if (this.f2629b == null) {
                return null;
            }
            for (int size = this.f2629b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f2629b.get(size);
                if (fullSpanItem.f2624a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: a */
        public FullSpanItem m3335a(int i, int i2, int i3, boolean z) {
            if (this.f2629b == null) {
                return null;
            }
            int size = this.f2629b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f2629b.get(i4);
                if (fullSpanItem.f2624a >= i2) {
                    return null;
                }
                if (fullSpanItem.f2624a >= i && (i3 == 0 || fullSpanItem.f2625b == i3 || (z && fullSpanItem.f2627d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C08221();
        /* renamed from: a */
        int f2630a;
        /* renamed from: b */
        int f2631b;
        /* renamed from: c */
        int f2632c;
        /* renamed from: d */
        int[] f2633d;
        /* renamed from: e */
        int f2634e;
        /* renamed from: f */
        int[] f2635f;
        /* renamed from: g */
        List<FullSpanItem> f2636g;
        /* renamed from: h */
        boolean f2637h;
        /* renamed from: i */
        boolean f2638i;
        /* renamed from: j */
        boolean f2639j;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$SavedState$1 */
        static class C08221 implements Creator<SavedState> {
            C08221() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3346a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m3347a(i);
            }

            /* renamed from: a */
            public SavedState m3346a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m3347a(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.f2630a = parcel.readInt();
            this.f2631b = parcel.readInt();
            this.f2632c = parcel.readInt();
            if (this.f2632c > 0) {
                this.f2633d = new int[this.f2632c];
                parcel.readIntArray(this.f2633d);
            }
            this.f2634e = parcel.readInt();
            if (this.f2634e > 0) {
                this.f2635f = new int[this.f2634e];
                parcel.readIntArray(this.f2635f);
            }
            boolean z = false;
            this.f2637h = parcel.readInt() == 1;
            this.f2638i = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f2639j = z;
            this.f2636g = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f2632c = savedState.f2632c;
            this.f2630a = savedState.f2630a;
            this.f2631b = savedState.f2631b;
            this.f2633d = savedState.f2633d;
            this.f2634e = savedState.f2634e;
            this.f2635f = savedState.f2635f;
            this.f2637h = savedState.f2637h;
            this.f2638i = savedState.f2638i;
            this.f2639j = savedState.f2639j;
            this.f2636g = savedState.f2636g;
        }

        /* renamed from: a */
        void m3348a() {
            this.f2633d = null;
            this.f2632c = 0;
            this.f2634e = 0;
            this.f2635f = null;
            this.f2636g = null;
        }

        /* renamed from: b */
        void m3349b() {
            this.f2633d = null;
            this.f2632c = 0;
            this.f2630a = -1;
            this.f2631b = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2630a);
            parcel.writeInt(this.f2631b);
            parcel.writeInt(this.f2632c);
            if (this.f2632c > 0) {
                parcel.writeIntArray(this.f2633d);
            }
            parcel.writeInt(this.f2634e);
            if (this.f2634e > 0) {
                parcel.writeIntArray(this.f2635f);
            }
            parcel.writeInt(this.f2637h);
            parcel.writeInt(this.f2638i);
            parcel.writeInt(this.f2639j);
            parcel.writeList(this.f2636g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C0823a {
        /* renamed from: a */
        int f2640a;
        /* renamed from: b */
        int f2641b;
        /* renamed from: c */
        boolean f2642c;
        /* renamed from: d */
        boolean f2643d;
        /* renamed from: e */
        boolean f2644e;
        /* renamed from: f */
        int[] f2645f;
        /* renamed from: g */
        final /* synthetic */ StaggeredGridLayoutManager f2646g;

        C0823a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.f2646g = staggeredGridLayoutManager;
            m3350a();
        }

        /* renamed from: a */
        void m3350a() {
            this.f2640a = -1;
            this.f2641b = Integer.MIN_VALUE;
            this.f2642c = false;
            this.f2643d = false;
            this.f2644e = false;
            if (this.f2645f != null) {
                Arrays.fill(this.f2645f, -1);
            }
        }

        /* renamed from: a */
        void m3352a(C0824b[] c0824bArr) {
            int length = c0824bArr.length;
            if (this.f2645f == null || this.f2645f.length < length) {
                this.f2645f = new int[this.f2646g.f13870a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2645f[i] = c0824bArr[i].m3354a(Integer.MIN_VALUE);
            }
        }

        /* renamed from: b */
        void m3353b() {
            int d;
            if (this.f2642c) {
                d = this.f2646g.f13871b.mo772d();
            } else {
                d = this.f2646g.f13871b.mo770c();
            }
            this.f2641b = d;
        }

        /* renamed from: a */
        void m3351a(int i) {
            if (this.f2642c) {
                this.f2641b = this.f2646g.f13871b.mo772d() - i;
            } else {
                this.f2641b = this.f2646g.f13871b.mo770c() + i;
            }
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    class C0824b {
        /* renamed from: a */
        ArrayList<View> f2647a = new ArrayList();
        /* renamed from: b */
        int f2648b = Integer.MIN_VALUE;
        /* renamed from: c */
        int f2649c = Integer.MIN_VALUE;
        /* renamed from: d */
        int f2650d = null;
        /* renamed from: e */
        final int f2651e;
        /* renamed from: f */
        final /* synthetic */ StaggeredGridLayoutManager f2652f;

        C0824b(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
            this.f2652f = staggeredGridLayoutManager;
            this.f2651e = i;
        }

        /* renamed from: a */
        int m3354a(int i) {
            if (this.f2648b != Integer.MIN_VALUE) {
                return this.f2648b;
            }
            if (this.f2647a.size() == 0) {
                return i;
            }
            m3358a();
            return this.f2648b;
        }

        /* renamed from: a */
        void m3358a() {
            View view = (View) this.f2647a.get(0);
            LayoutParams c = m3364c(view);
            this.f2648b = this.f2652f.f13871b.mo767a(view);
            if (c.f13861b) {
                FullSpanItem f = this.f2652f.f13877h.m3345f(c.m2942f());
                if (f != null && f.f2625b == -1) {
                    this.f2648b -= f.m3330a(this.f2651e);
                }
            }
        }

        /* renamed from: b */
        int m3361b() {
            if (this.f2648b != Integer.MIN_VALUE) {
                return this.f2648b;
            }
            m3358a();
            return this.f2648b;
        }

        /* renamed from: b */
        int m3362b(int i) {
            if (this.f2649c != Integer.MIN_VALUE) {
                return this.f2649c;
            }
            if (this.f2647a.size() == 0) {
                return i;
            }
            m3365c();
            return this.f2649c;
        }

        /* renamed from: c */
        void m3365c() {
            View view = (View) this.f2647a.get(this.f2647a.size() - 1);
            LayoutParams c = m3364c(view);
            this.f2649c = this.f2652f.f13871b.mo769b(view);
            if (c.f13861b) {
                FullSpanItem f = this.f2652f.f13877h.m3345f(c.m2942f());
                if (f != null && f.f2625b == 1) {
                    this.f2649c += f.m3330a(this.f2651e);
                }
            }
        }

        /* renamed from: d */
        int m3367d() {
            if (this.f2649c != Integer.MIN_VALUE) {
                return this.f2649c;
            }
            m3365c();
            return this.f2649c;
        }

        /* renamed from: a */
        void m3359a(View view) {
            LayoutParams c = m3364c(view);
            c.f13860a = this;
            this.f2647a.add(0, view);
            this.f2648b = Integer.MIN_VALUE;
            if (this.f2647a.size() == 1) {
                this.f2649c = Integer.MIN_VALUE;
            }
            if (c.m2940d() || c.m2941e()) {
                this.f2650d += this.f2652f.f13871b.mo775e(view);
            }
        }

        /* renamed from: b */
        void m3363b(View view) {
            LayoutParams c = m3364c(view);
            c.f13860a = this;
            this.f2647a.add(view);
            this.f2649c = Integer.MIN_VALUE;
            if (this.f2647a.size() == 1) {
                this.f2648b = Integer.MIN_VALUE;
            }
            if (c.m2940d() || c.m2941e()) {
                this.f2650d += this.f2652f.f13871b.mo775e(view);
            }
        }

        /* renamed from: a */
        void m3360a(boolean z, int i) {
            int b;
            if (z) {
                b = m3362b(Integer.MIN_VALUE);
            } else {
                b = m3354a(Integer.MIN_VALUE);
            }
            m3369e();
            if (b != Integer.MIN_VALUE) {
                if ((!z || b >= this.f2652f.f13871b.mo772d()) && (z || b <= this.f2652f.f13871b.mo770c())) {
                    if (i != Integer.MIN_VALUE) {
                        b += i;
                    }
                    this.f2649c = b;
                    this.f2648b = b;
                }
            }
        }

        /* renamed from: e */
        void m3369e() {
            this.f2647a.clear();
            m3370f();
            this.f2650d = 0;
        }

        /* renamed from: f */
        void m3370f() {
            this.f2648b = Integer.MIN_VALUE;
            this.f2649c = Integer.MIN_VALUE;
        }

        /* renamed from: c */
        void m3366c(int i) {
            this.f2648b = i;
            this.f2649c = i;
        }

        /* renamed from: g */
        void m3371g() {
            int size = this.f2647a.size();
            View view = (View) this.f2647a.remove(size - 1);
            LayoutParams c = m3364c(view);
            c.f13860a = null;
            if (c.m2940d() || c.m2941e()) {
                this.f2650d -= this.f2652f.f13871b.mo775e(view);
            }
            if (size == 1) {
                this.f2648b = Integer.MIN_VALUE;
            }
            this.f2649c = Integer.MIN_VALUE;
        }

        /* renamed from: h */
        void m3372h() {
            View view = (View) this.f2647a.remove(0);
            LayoutParams c = m3364c(view);
            c.f13860a = null;
            if (this.f2647a.size() == 0) {
                this.f2649c = Integer.MIN_VALUE;
            }
            if (c.m2940d() || c.m2941e()) {
                this.f2650d -= this.f2652f.f13871b.mo775e(view);
            }
            this.f2648b = Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public int m3373i() {
            return this.f2650d;
        }

        /* renamed from: c */
        LayoutParams m3364c(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: d */
        void m3368d(int i) {
            if (this.f2648b != Integer.MIN_VALUE) {
                this.f2648b += i;
            }
            if (this.f2649c != Integer.MIN_VALUE) {
                this.f2649c += i;
            }
        }

        /* renamed from: j */
        public int m3374j() {
            if (this.f2652f.f13873d) {
                return m3355a(this.f2647a.size() - 1, -1, true);
            }
            return m3355a(0, this.f2647a.size(), true);
        }

        /* renamed from: k */
        public int m3375k() {
            if (this.f2652f.f13873d) {
                return m3355a(0, this.f2647a.size(), true);
            }
            return m3355a(this.f2647a.size() - 1, -1, true);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        int m3356a(int r11, int r12, boolean r13, boolean r14, boolean r15) {
            /*
            r10 = this;
            r0 = r10.f2652f;
            r0 = r0.f13871b;
            r0 = r0.mo770c();
            r1 = r10.f2652f;
            r1 = r1.f13871b;
            r1 = r1.mo772d();
            r2 = -1;
            r3 = 1;
            if (r12 <= r11) goto L_0x0016;
        L_0x0014:
            r4 = 1;
            goto L_0x0017;
        L_0x0016:
            r4 = -1;
        L_0x0017:
            if (r11 == r12) goto L_0x006f;
        L_0x0019:
            r5 = r10.f2647a;
            r5 = r5.get(r11);
            r5 = (android.view.View) r5;
            r6 = r10.f2652f;
            r6 = r6.f13871b;
            r6 = r6.mo767a(r5);
            r7 = r10.f2652f;
            r7 = r7.f13871b;
            r7 = r7.mo769b(r5);
            r8 = 0;
            if (r15 == 0) goto L_0x003a;
        L_0x0034:
            if (r6 > r1) goto L_0x0038;
        L_0x0036:
            r9 = 1;
            goto L_0x003d;
        L_0x0038:
            r9 = 0;
            goto L_0x003d;
        L_0x003a:
            if (r6 >= r1) goto L_0x0038;
        L_0x003c:
            goto L_0x0036;
        L_0x003d:
            if (r15 == 0) goto L_0x0043;
        L_0x003f:
            if (r7 < r0) goto L_0x0046;
        L_0x0041:
            r8 = 1;
            goto L_0x0046;
        L_0x0043:
            if (r7 <= r0) goto L_0x0046;
        L_0x0045:
            goto L_0x0041;
        L_0x0046:
            if (r9 == 0) goto L_0x006d;
        L_0x0048:
            if (r8 == 0) goto L_0x006d;
        L_0x004a:
            if (r13 == 0) goto L_0x0059;
        L_0x004c:
            if (r14 == 0) goto L_0x0059;
        L_0x004e:
            if (r6 < r0) goto L_0x006d;
        L_0x0050:
            if (r7 > r1) goto L_0x006d;
        L_0x0052:
            r11 = r10.f2652f;
            r11 = r11.m3110d(r5);
            return r11;
        L_0x0059:
            if (r14 == 0) goto L_0x0062;
        L_0x005b:
            r11 = r10.f2652f;
            r11 = r11.m3110d(r5);
            return r11;
        L_0x0062:
            if (r6 < r0) goto L_0x0066;
        L_0x0064:
            if (r7 <= r1) goto L_0x006d;
        L_0x0066:
            r11 = r10.f2652f;
            r11 = r11.m3110d(r5);
            return r11;
        L_0x006d:
            r11 = r11 + r4;
            goto L_0x0017;
        L_0x006f:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.b.a(int, int, boolean, boolean, boolean):int");
        }

        /* renamed from: a */
        int m3355a(int i, int i2, boolean z) {
            return m3356a(i, i2, false, false, z);
        }

        /* renamed from: a */
        public View m3357a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                i2 = this.f2647a.size() - 1;
                while (i2 >= 0) {
                    View view2 = (View) this.f2647a.get(i2);
                    if (!this.f2652f.f13873d || this.f2652f.m3110d(view2) < i) {
                        if (this.f2652f.f13873d || this.f2652f.m3110d(view2) > i) {
                            if (!view2.hasFocusable()) {
                                break;
                            }
                            i2--;
                            view = view2;
                        } else {
                            break;
                        }
                    }
                    break;
                }
            }
            i2 = this.f2647a.size();
            int i3 = 0;
            while (i3 < i2) {
                View view3 = (View) this.f2647a.get(i3);
                if (!this.f2652f.f13873d || this.f2652f.m3110d(view3) > i) {
                    if (this.f2652f.f13873d || this.f2652f.m3110d(view3) < i) {
                        if (!view3.hasFocusable()) {
                            break;
                        }
                        i3++;
                        view = view3;
                    } else {
                        break;
                    }
                }
                break;
            }
            return view;
        }
    }

    public static class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams {
        /* renamed from: a */
        C0824b f13860a;
        /* renamed from: b */
        boolean f13861b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public boolean m16526a() {
            return this.f13861b;
        }

        /* renamed from: b */
        public final int m16527b() {
            if (this.f13860a == null) {
                return -1;
            }
            return this.f13860a.f2651e;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        context = C0783i.m3016a(context, attributeSet, i, i2);
        m16595b(context.f2484a);
        m16574a(context.f2485b);
        m16590a(context.f2486c);
        this.f13881l = new ae();
        m16528N();
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f13879j = i2;
        m16574a(i);
        this.f13881l = new ae();
        m16528N();
    }

    /* renamed from: c */
    public boolean mo682c() {
        return this.f13883n != 0;
    }

    /* renamed from: N */
    private void m16528N() {
        this.f13871b = ai.m3473a(this, this.f13879j);
        this.f13872c = ai.m3473a(this, 1 - this.f13879j);
    }

    /* renamed from: g */
    boolean m16614g() {
        if (!(m3154w() == 0 || this.f13883n == 0)) {
            if (m3149r()) {
                int o;
                int M;
                if (this.f13874e) {
                    o = m16625o();
                    M = m16567M();
                } else {
                    o = m16567M();
                    M = m16625o();
                }
                if (o == 0 && m16616h() != null) {
                    this.f13877h.m3336a();
                    m3035K();
                    m3147p();
                    return true;
                } else if (!this.f13866E) {
                    return false;
                } else {
                    int i = this.f13874e ? -1 : 1;
                    M++;
                    FullSpanItem a = this.f13877h.m3335a(o, M, i, true);
                    if (a == null) {
                        this.f13866E = false;
                        this.f13877h.m3334a(M);
                        return false;
                    }
                    FullSpanItem a2 = this.f13877h.m3335a(o, a.f2624a, i * -1, true);
                    if (a2 == null) {
                        this.f13877h.m3334a(a.f2624a);
                    } else {
                        this.f13877h.m3334a(a2.f2624a + 1);
                    }
                    m3035K();
                    m3147p();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public void mo755m(int i) {
        if (i == 0) {
            m16614g();
        }
    }

    /* renamed from: a */
    public void mo673a(RecyclerView recyclerView, C0790o c0790o) {
        super.mo673a(recyclerView, c0790o);
        m3086a((Runnable) this.f13869H);
        for (c0790o = null; c0790o < this.f13878i; c0790o++) {
            this.f13870a[c0790o].m3369e();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: h */
    android.view.View m16616h() {
        /*
        r12 = this;
        r0 = r12.m3154w();
        r1 = 1;
        r0 = r0 - r1;
        r2 = new java.util.BitSet;
        r3 = r12.f13878i;
        r2.<init>(r3);
        r3 = r12.f13878i;
        r4 = 0;
        r2.set(r4, r3, r1);
        r3 = r12.f13879j;
        r5 = -1;
        if (r3 != r1) goto L_0x0020;
    L_0x0018:
        r3 = r12.m16618j();
        if (r3 == 0) goto L_0x0020;
    L_0x001e:
        r3 = 1;
        goto L_0x0021;
    L_0x0020:
        r3 = -1;
    L_0x0021:
        r6 = r12.f13874e;
        if (r6 == 0) goto L_0x0027;
    L_0x0025:
        r6 = -1;
        goto L_0x002b;
    L_0x0027:
        r0 = r0 + 1;
        r6 = r0;
        r0 = 0;
    L_0x002b:
        if (r0 >= r6) goto L_0x002e;
    L_0x002d:
        r5 = 1;
    L_0x002e:
        if (r0 == r6) goto L_0x00ab;
    L_0x0030:
        r7 = r12.m3137j(r0);
        r8 = r7.getLayoutParams();
        r8 = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) r8;
        r9 = r8.f13860a;
        r9 = r9.f2651e;
        r9 = r2.get(r9);
        if (r9 == 0) goto L_0x0054;
    L_0x0044:
        r9 = r8.f13860a;
        r9 = r12.m16542a(r9);
        if (r9 == 0) goto L_0x004d;
    L_0x004c:
        return r7;
    L_0x004d:
        r9 = r8.f13860a;
        r9 = r9.f2651e;
        r2.clear(r9);
    L_0x0054:
        r9 = r8.f13861b;
        if (r9 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x00a9;
    L_0x0059:
        r9 = r0 + r5;
        if (r9 == r6) goto L_0x00a9;
    L_0x005d:
        r9 = r12.m3137j(r9);
        r10 = r12.f13874e;
        if (r10 == 0) goto L_0x0077;
    L_0x0065:
        r10 = r12.f13871b;
        r10 = r10.mo769b(r7);
        r11 = r12.f13871b;
        r11 = r11.mo769b(r9);
        if (r10 >= r11) goto L_0x0074;
    L_0x0073:
        return r7;
    L_0x0074:
        if (r10 != r11) goto L_0x008a;
    L_0x0076:
        goto L_0x0088;
    L_0x0077:
        r10 = r12.f13871b;
        r10 = r10.mo767a(r7);
        r11 = r12.f13871b;
        r11 = r11.mo767a(r9);
        if (r10 <= r11) goto L_0x0086;
    L_0x0085:
        return r7;
    L_0x0086:
        if (r10 != r11) goto L_0x008a;
    L_0x0088:
        r10 = 1;
        goto L_0x008b;
    L_0x008a:
        r10 = 0;
    L_0x008b:
        if (r10 == 0) goto L_0x00a9;
    L_0x008d:
        r9 = r9.getLayoutParams();
        r9 = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) r9;
        r8 = r8.f13860a;
        r8 = r8.f2651e;
        r9 = r9.f13860a;
        r9 = r9.f2651e;
        r8 = r8 - r9;
        if (r8 >= 0) goto L_0x00a0;
    L_0x009e:
        r8 = 1;
        goto L_0x00a1;
    L_0x00a0:
        r8 = 0;
    L_0x00a1:
        if (r3 >= 0) goto L_0x00a5;
    L_0x00a3:
        r9 = 1;
        goto L_0x00a6;
    L_0x00a5:
        r9 = 0;
    L_0x00a6:
        if (r8 == r9) goto L_0x00a9;
    L_0x00a8:
        return r7;
    L_0x00a9:
        r0 = r0 + r5;
        goto L_0x002e;
    L_0x00ab:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.h():android.view.View");
    }

    /* renamed from: a */
    private boolean m16542a(C0824b c0824b) {
        if (this.f13874e) {
            if (c0824b.m3367d() < this.f13871b.mo772d()) {
                return c0824b.m3364c((View) c0824b.f2647a.get(c0824b.f2647a.size() - 1)).f13861b ^ 1;
            }
        } else if (c0824b.m3361b() > this.f13871b.mo770c()) {
            return c0824b.m3364c((View) c0824b.f2647a.get(0)).f13861b ^ 1;
        }
        return false;
    }

    /* renamed from: a */
    public void m16574a(int i) {
        mo676a(null);
        if (i != this.f13878i) {
            m16617i();
            this.f13878i = i;
            this.f13882m = new BitSet(this.f13878i);
            this.f13870a = new C0824b[this.f13878i];
            for (i = 0; i < this.f13878i; i++) {
                this.f13870a[i] = new C0824b(this, i);
            }
            m3147p();
        }
    }

    /* renamed from: b */
    public void m16595b(int i) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("invalid orientation.");
            }
        }
        mo676a(null);
        if (i != this.f13879j) {
            this.f13879j = i;
            i = this.f13871b;
            this.f13871b = this.f13872c;
            this.f13872c = i;
            m3147p();
        }
    }

    /* renamed from: a */
    public void m16590a(boolean z) {
        mo676a(null);
        if (!(this.f13862A == null || this.f13862A.f2637h == z)) {
            this.f13862A.f2637h = z;
        }
        this.f13873d = z;
        m3147p();
    }

    /* renamed from: a */
    public void mo676a(String str) {
        if (this.f13862A == null) {
            super.mo676a(str);
        }
    }

    /* renamed from: i */
    public void m16617i() {
        this.f13877h.m3336a();
        m3147p();
    }

    /* renamed from: O */
    private void m16529O() {
        if (this.f13879j != 1) {
            if (m16618j()) {
                this.f13874e = this.f13873d ^ true;
                return;
            }
        }
        this.f13874e = this.f13873d;
    }

    /* renamed from: j */
    boolean m16618j() {
        return m3152u() == 1;
    }

    /* renamed from: a */
    public void mo744a(Rect rect, int i, int i2) {
        int B = m3026B() + m3028D();
        int C = m3027C() + m3029E();
        if (this.f13879j == 1) {
            rect = C0783i.m3014a(i2, (int) rect.height() + C, m3033I());
            i = C0783i.m3014a(i, (this.f13880k * this.f13878i) + B, m3032H());
        } else {
            i = C0783i.m3014a(i, (int) rect.width() + B, m3032H());
            rect = C0783i.m3014a(i2, (int) (this.f13880k * this.f13878i) + C, m3033I());
        }
        m3130g(i, rect);
    }

    /* renamed from: c */
    public void mo681c(C0790o c0790o, C0795s c0795s) {
        m16535a(c0790o, c0795s, true);
    }

    /* renamed from: a */
    private void m16535a(C0790o c0790o, C0795s c0795s, boolean z) {
        C0823a c0823a = this.f13865D;
        if (!(this.f13862A == null && this.f13875f == -1) && c0795s.m3249e() == 0) {
            m3100c(c0790o);
            c0823a.m3350a();
            return;
        }
        Object obj;
        int i;
        boolean z2 = true;
        if (c0823a.f2644e && this.f13875f == -1) {
            if (this.f13862A == null) {
                obj = null;
                if (obj != null) {
                    c0823a.m3350a();
                    if (this.f13862A == null) {
                        m16537a(c0823a);
                    } else {
                        m16529O();
                        c0823a.f2642c = this.f13874e;
                    }
                    m16581a(c0795s, c0823a);
                    c0823a.f2644e = true;
                }
                if (this.f13862A == null && this.f13875f == -1 && !(c0823a.f2642c == this.f13884o && m16618j() == this.f13885z)) {
                    this.f13877h.m3336a();
                    c0823a.f2643d = true;
                }
                if (m3154w() > 0 && (this.f13862A == null || this.f13862A.f2632c < 1)) {
                    if (c0823a.f2643d) {
                        if (obj == null) {
                            if (this.f13865D.f2645f == null) {
                                for (i = 0; i < this.f13878i; i++) {
                                    C0824b c0824b = this.f13870a[i];
                                    c0824b.m3369e();
                                    c0824b.m3366c(this.f13865D.f2645f[i]);
                                }
                            }
                        }
                        for (i = 0; i < this.f13878i; i++) {
                            this.f13870a[i].m3360a(this.f13874e, c0823a.f2641b);
                        }
                        this.f13865D.m3352a(this.f13870a);
                    } else {
                        for (i = 0; i < this.f13878i; i++) {
                            this.f13870a[i].m3369e();
                            if (c0823a.f2641b != Integer.MIN_VALUE) {
                                this.f13870a[i].m3366c(c0823a.f2641b);
                            }
                        }
                    }
                }
                m3050a(c0790o);
                this.f13881l.f2775a = false;
                this.f13866E = false;
                m16611f(this.f13872c.mo776f());
                m16545b(c0823a.f2640a, c0795s);
                if (c0823a.f2642c) {
                    m16551g(1);
                    m16531a(c0790o, this.f13881l, c0795s);
                    m16551g(-1);
                    this.f13881l.f2777c = c0823a.f2640a + this.f13881l.f2778d;
                    m16531a(c0790o, this.f13881l, c0795s);
                } else {
                    m16551g(-1);
                    m16531a(c0790o, this.f13881l, c0795s);
                    m16551g(1);
                    this.f13881l.f2777c = c0823a.f2640a + this.f13881l.f2778d;
                    m16531a(c0790o, this.f13881l, c0795s);
                }
                m16530P();
                if (m3154w() > 0) {
                    if (this.f13874e) {
                        m16549c(c0790o, c0795s, true);
                        m16547b(c0790o, c0795s, false);
                    } else {
                        m16547b(c0790o, c0795s, true);
                        m16549c(c0790o, c0795s, false);
                    }
                }
                if (z && !c0795s.m3245a()) {
                    z = this.f13883n && m3154w() <= false && (this.f13866E || m16616h());
                    if (z) {
                        m3086a((Runnable) this.f13869H);
                        if (m16614g()) {
                            if (c0795s.m3245a()) {
                                this.f13865D.m3350a();
                            }
                            this.f13884o = c0823a.f2642c;
                            this.f13885z = m16618j();
                            if (z2) {
                                this.f13865D.m3350a();
                                m16535a(c0790o, c0795s, false);
                            }
                        }
                    }
                }
                z2 = false;
                if (c0795s.m3245a()) {
                    this.f13865D.m3350a();
                }
                this.f13884o = c0823a.f2642c;
                this.f13885z = m16618j();
                if (z2) {
                    this.f13865D.m3350a();
                    m16535a(c0790o, c0795s, false);
                }
            }
        }
        obj = 1;
        if (obj != null) {
            c0823a.m3350a();
            if (this.f13862A == null) {
                m16529O();
                c0823a.f2642c = this.f13874e;
            } else {
                m16537a(c0823a);
            }
            m16581a(c0795s, c0823a);
            c0823a.f2644e = true;
        }
        this.f13877h.m3336a();
        c0823a.f2643d = true;
        if (c0823a.f2643d) {
            if (obj == null) {
                if (this.f13865D.f2645f == null) {
                    for (i = 0; i < this.f13878i; i++) {
                        C0824b c0824b2 = this.f13870a[i];
                        c0824b2.m3369e();
                        c0824b2.m3366c(this.f13865D.f2645f[i]);
                    }
                }
            }
            for (i = 0; i < this.f13878i; i++) {
                this.f13870a[i].m3360a(this.f13874e, c0823a.f2641b);
            }
            this.f13865D.m3352a(this.f13870a);
        } else {
            for (i = 0; i < this.f13878i; i++) {
                this.f13870a[i].m3369e();
                if (c0823a.f2641b != Integer.MIN_VALUE) {
                    this.f13870a[i].m3366c(c0823a.f2641b);
                }
            }
        }
        m3050a(c0790o);
        this.f13881l.f2775a = false;
        this.f13866E = false;
        m16611f(this.f13872c.mo776f());
        m16545b(c0823a.f2640a, c0795s);
        if (c0823a.f2642c) {
            m16551g(1);
            m16531a(c0790o, this.f13881l, c0795s);
            m16551g(-1);
            this.f13881l.f2777c = c0823a.f2640a + this.f13881l.f2778d;
            m16531a(c0790o, this.f13881l, c0795s);
        } else {
            m16551g(-1);
            m16531a(c0790o, this.f13881l, c0795s);
            m16551g(1);
            this.f13881l.f2777c = c0823a.f2640a + this.f13881l.f2778d;
            m16531a(c0790o, this.f13881l, c0795s);
        }
        m16530P();
        if (m3154w() > 0) {
            if (this.f13874e) {
                m16549c(c0790o, c0795s, true);
                m16547b(c0790o, c0795s, false);
            } else {
                m16547b(c0790o, c0795s, true);
                m16549c(c0790o, c0795s, false);
            }
        }
        if (!this.f13883n) {
        }
        if (z) {
            m3086a((Runnable) this.f13869H);
            if (m16614g()) {
                if (c0795s.m3245a()) {
                    this.f13865D.m3350a();
                }
                this.f13884o = c0823a.f2642c;
                this.f13885z = m16618j();
                if (z2) {
                    this.f13865D.m3350a();
                    m16535a(c0790o, c0795s, false);
                }
            }
        }
        z2 = false;
        if (c0795s.m3245a()) {
            this.f13865D.m3350a();
        }
        this.f13884o = c0823a.f2642c;
        this.f13885z = m16618j();
        if (z2) {
            this.f13865D.m3350a();
            m16535a(c0790o, c0795s, false);
        }
    }

    /* renamed from: a */
    public void mo672a(C0795s c0795s) {
        super.mo672a(c0795s);
        this.f13875f = -1;
        this.f13876g = Integer.MIN_VALUE;
        this.f13862A = null;
        this.f13865D.m3350a();
    }

    /* renamed from: P */
    private void m16530P() {
        if (this.f13872c.mo779h() != 1073741824) {
            int i;
            int w = m3154w();
            float f = 0.0f;
            for (i = 0; i < w; i++) {
                View j = m3137j(i);
                float e = (float) this.f13872c.mo775e(j);
                if (e >= f) {
                    if (((LayoutParams) j.getLayoutParams()).m16526a()) {
                        e = (e * 1.0f) / ((float) this.f13878i);
                    }
                    f = Math.max(f, e);
                }
            }
            i = this.f13880k;
            int round = Math.round(f * ((float) this.f13878i));
            if (this.f13872c.mo779h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f13872c.mo776f());
            }
            m16611f(round);
            if (this.f13880k != i) {
                for (int i2 = 0; i2 < w; i2++) {
                    View j2 = m3137j(i2);
                    LayoutParams layoutParams = (LayoutParams) j2.getLayoutParams();
                    if (!layoutParams.f13861b) {
                        if (m16618j() && this.f13879j == 1) {
                            j2.offsetLeftAndRight(((-((this.f13878i - 1) - layoutParams.f13860a.f2651e)) * this.f13880k) - ((-((this.f13878i - 1) - layoutParams.f13860a.f2651e)) * i));
                        } else {
                            int i3 = layoutParams.f13860a.f2651e * this.f13880k;
                            int i4 = layoutParams.f13860a.f2651e * i;
                            if (this.f13879j == 1) {
                                j2.offsetLeftAndRight(i3 - i4);
                            } else {
                                j2.offsetTopAndBottom(i3 - i4);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m16537a(C0823a c0823a) {
        if (this.f13862A.f2632c > 0) {
            if (this.f13862A.f2632c == this.f13878i) {
                for (int i = 0; i < this.f13878i; i++) {
                    this.f13870a[i].m3369e();
                    int i2 = this.f13862A.f2633d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        if (this.f13862A.f2638i) {
                            i2 += this.f13871b.mo772d();
                        } else {
                            i2 += this.f13871b.mo770c();
                        }
                    }
                    this.f13870a[i].m3366c(i2);
                }
            } else {
                this.f13862A.m3348a();
                this.f13862A.f2630a = this.f13862A.f2631b;
            }
        }
        this.f13885z = this.f13862A.f2639j;
        m16590a(this.f13862A.f2637h);
        m16529O();
        if (this.f13862A.f2630a != -1) {
            this.f13875f = this.f13862A.f2630a;
            c0823a.f2642c = this.f13862A.f2638i;
        } else {
            c0823a.f2642c = this.f13874e;
        }
        if (this.f13862A.f2634e > 1) {
            this.f13877h.f2628a = this.f13862A.f2635f;
            this.f13877h.f2629b = this.f13862A.f2636g;
        }
    }

    /* renamed from: a */
    void m16581a(C0795s c0795s, C0823a c0823a) {
        if (!m16598b(c0795s, c0823a) && m16550c(c0795s, c0823a) == null) {
            c0823a.m3353b();
            c0823a.f2640a = null;
        }
    }

    /* renamed from: c */
    private boolean m16550c(C0795s c0795s, C0823a c0823a) {
        if (this.f13884o) {
            c0795s = m16565w(c0795s.m3249e());
        } else {
            c0795s = m16564v(c0795s.m3249e());
        }
        c0823a.f2640a = c0795s;
        c0823a.f2641b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: b */
    boolean m16598b(C0795s c0795s, C0823a c0823a) {
        boolean z = false;
        if (!c0795s.m3245a()) {
            if (this.f13875f != -1) {
                if (this.f13875f >= 0) {
                    if (this.f13875f < c0795s.m3249e()) {
                        if (!(this.f13862A == null || this.f13862A.f2630a == -1)) {
                            if (this.f13862A.f2632c >= 1) {
                                c0823a.f2641b = Integer.MIN_VALUE;
                                c0823a.f2640a = this.f13875f;
                                return true;
                            }
                        }
                        View c = mo680c((int) this.f13875f);
                        if (c != null) {
                            int o;
                            if (this.f13874e) {
                                o = m16625o();
                            } else {
                                o = m16567M();
                            }
                            c0823a.f2640a = o;
                            if (this.f13876g != Integer.MIN_VALUE) {
                                if (c0823a.f2642c) {
                                    c0823a.f2641b = (this.f13871b.mo772d() - this.f13876g) - this.f13871b.mo769b(c);
                                } else {
                                    c0823a.f2641b = (this.f13871b.mo770c() + this.f13876g) - this.f13871b.mo767a(c);
                                }
                                return true;
                            } else if (this.f13871b.mo775e(c) > this.f13871b.mo776f()) {
                                if (c0823a.f2642c != null) {
                                    c0795s = this.f13871b.mo772d();
                                } else {
                                    c0795s = this.f13871b.mo770c();
                                }
                                c0823a.f2641b = c0795s;
                                return true;
                            } else {
                                o = this.f13871b.mo767a(c) - this.f13871b.mo770c();
                                if (o < 0) {
                                    c0823a.f2641b = -o;
                                    return true;
                                }
                                o = this.f13871b.mo772d() - this.f13871b.mo769b(c);
                                if (o < 0) {
                                    c0823a.f2641b = o;
                                    return true;
                                }
                                c0823a.f2641b = Integer.MIN_VALUE;
                            }
                        } else {
                            c0823a.f2640a = this.f13875f;
                            if (this.f13876g == -2147483648) {
                                if (m16563u(c0823a.f2640a) == 1) {
                                    z = true;
                                }
                                c0823a.f2642c = z;
                                c0823a.m3353b();
                            } else {
                                c0823a.m3351a(this.f13876g);
                            }
                            c0823a.f2643d = true;
                        }
                        return true;
                    }
                }
                this.f13875f = -1;
                this.f13876g = Integer.MIN_VALUE;
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    void m16611f(int i) {
        this.f13880k = i / this.f13878i;
        this.f13863B = MeasureSpec.makeMeasureSpec(i, this.f13872c.mo779h());
    }

    /* renamed from: b */
    public boolean mo678b() {
        return this.f13862A == null;
    }

    /* renamed from: c */
    public int mo679c(C0795s c0795s) {
        return m16544b(c0795s);
    }

    /* renamed from: b */
    private int m16544b(C0795s c0795s) {
        if (m3154w() == 0) {
            return null;
        }
        return ap.m3529a(c0795s, this.f13871b, m16594b(this.f13867F ^ 1), m16607e(this.f13867F ^ 1), this, this.f13867F, this.f13874e);
    }

    /* renamed from: d */
    public int mo683d(C0795s c0795s) {
        return m16544b(c0795s);
    }

    /* renamed from: e */
    public int mo686e(C0795s c0795s) {
        return m16552i(c0795s);
    }

    /* renamed from: i */
    private int m16552i(C0795s c0795s) {
        if (m3154w() == 0) {
            return null;
        }
        return ap.m3528a(c0795s, this.f13871b, m16594b(this.f13867F ^ 1), m16607e(this.f13867F ^ 1), this, this.f13867F);
    }

    /* renamed from: f */
    public int mo689f(C0795s c0795s) {
        return m16552i(c0795s);
    }

    /* renamed from: g */
    public int mo691g(C0795s c0795s) {
        return m16553j(c0795s);
    }

    /* renamed from: j */
    private int m16553j(C0795s c0795s) {
        if (m3154w() == 0) {
            return null;
        }
        return ap.m3530b(c0795s, this.f13871b, m16594b(this.f13867F ^ 1), m16607e(this.f13867F ^ 1), this, this.f13867F);
    }

    /* renamed from: h */
    public int mo692h(C0795s c0795s) {
        return m16553j(c0795s);
    }

    /* renamed from: a */
    private void m16541a(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f13861b) {
            if (this.f13879j == 1) {
                m16539a(view, this.f13863B, C0783i.m3015a(m3025A(), m3156y(), m3027C() + m3029E(), (int) layoutParams.height, true), z);
            } else {
                m16539a(view, C0783i.m3015a(m3157z(), m3155x(), m3026B() + m3028D(), (int) layoutParams.width, true), this.f13863B, z);
            }
        } else if (this.f13879j == 1) {
            m16539a(view, C0783i.m3015a(this.f13880k, m3155x(), 0, layoutParams.width, false), C0783i.m3015a(m3025A(), m3156y(), m3027C() + m3029E(), (int) layoutParams.height, true), z);
        } else {
            m16539a(view, C0783i.m3015a(m3157z(), m3155x(), m3026B() + m3028D(), layoutParams.width, true), C0783i.m3015a(this.f13880k, m3156y(), 0, (int) layoutParams.height, false), z);
        }
    }

    /* renamed from: a */
    private void m16539a(View view, int i, int i2, boolean z) {
        m3095b(view, this.f13864C);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        i = m16543b(i, layoutParams.leftMargin + this.f13864C.left, layoutParams.rightMargin + this.f13864C.right);
        i2 = m16543b(i2, layoutParams.topMargin + this.f13864C.top, layoutParams.bottomMargin + this.f13864C.bottom);
        if (z) {
            z = m3083a(view, i, i2, (android.support.v7.widget.RecyclerView.LayoutParams) layoutParams);
        } else {
            z = m3097b(view, i, i2, (android.support.v7.widget.RecyclerView.LayoutParams) layoutParams);
        }
        if (z) {
            view.measure(i, i2);
        }
    }

    /* renamed from: b */
    private int m16543b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i;
            }
        }
        return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    /* renamed from: a */
    public void mo671a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f13862A = (SavedState) parcelable;
            m3147p();
        }
    }

    /* renamed from: d */
    public Parcelable mo685d() {
        if (this.f13862A != null) {
            return new SavedState(this.f13862A);
        }
        Parcelable savedState = new SavedState();
        savedState.f2637h = this.f13873d;
        savedState.f2638i = this.f13884o;
        savedState.f2639j = this.f13885z;
        int i = 0;
        if (this.f13877h == null || this.f13877h.f2628a == null) {
            savedState.f2634e = 0;
        } else {
            savedState.f2635f = this.f13877h.f2628a;
            savedState.f2634e = savedState.f2635f.length;
            savedState.f2636g = this.f13877h.f2629b;
        }
        if (m3154w() > 0) {
            int o;
            if (this.f13884o) {
                o = m16625o();
            } else {
                o = m16567M();
            }
            savedState.f2630a = o;
            savedState.f2631b = m16619k();
            savedState.f2632c = this.f13878i;
            savedState.f2633d = new int[this.f13878i];
            while (i < this.f13878i) {
                if (this.f13884o) {
                    o = this.f13870a[i].m3362b(Integer.MIN_VALUE);
                    if (o != Integer.MIN_VALUE) {
                        o -= this.f13871b.mo772d();
                    }
                } else {
                    o = this.f13870a[i].m3354a(Integer.MIN_VALUE);
                    if (o != Integer.MIN_VALUE) {
                        o -= this.f13871b.mo770c();
                    }
                }
                savedState.f2633d[i] = o;
                i++;
            }
        } else {
            savedState.f2630a = -1;
            savedState.f2631b = -1;
            savedState.f2632c = 0;
        }
        return savedState;
    }

    /* renamed from: a */
    public void mo745a(C0790o c0790o, C0795s c0795s, View view, C0532b c0532b) {
        c0790o = view.getLayoutParams();
        if ((c0790o instanceof LayoutParams) == null) {
            super.m3069a(view, c0532b);
            return;
        }
        LayoutParams layoutParams = (LayoutParams) c0790o;
        if (this.f13879j == null) {
            c0532b.m1966b(C0531c.m1949a(layoutParams.m16527b(), layoutParams.f13861b != null ? this.f13878i : 1, -1, -1, layoutParams.f13861b, false));
        } else {
            c0532b.m1966b(C0531c.m1949a(-1, -1, layoutParams.m16527b(), layoutParams.f13861b != null ? this.f13878i : 1, layoutParams.f13861b, false));
        }
    }

    /* renamed from: a */
    public void mo675a(AccessibilityEvent accessibilityEvent) {
        super.mo675a(accessibilityEvent);
        if (m3154w() > 0) {
            View b = m16594b(false);
            View e = m16607e(false);
            if (b != null) {
                if (e != null) {
                    int d = m3110d(b);
                    int d2 = m3110d(e);
                    if (d < d2) {
                        accessibilityEvent.setFromIndex(d);
                        accessibilityEvent.setToIndex(d2);
                    } else {
                        accessibilityEvent.setFromIndex(d2);
                        accessibilityEvent.setToIndex(d);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    int m16619k() {
        View e;
        if (this.f13874e) {
            e = m16607e(true);
        } else {
            e = m16594b(true);
        }
        if (e == null) {
            return -1;
        }
        return m3110d(e);
    }

    /* renamed from: a */
    public int mo741a(C0790o c0790o, C0795s c0795s) {
        if (this.f13879j == 0) {
            return this.f13878i;
        }
        return super.mo741a(c0790o, c0795s);
    }

    /* renamed from: b */
    public int mo751b(C0790o c0790o, C0795s c0795s) {
        if (this.f13879j == 1) {
            return this.f13878i;
        }
        return super.mo751b(c0790o, c0795s);
    }

    /* renamed from: b */
    View m16594b(boolean z) {
        int c = this.f13871b.mo770c();
        int d = this.f13871b.mo772d();
        int w = m3154w();
        View view = null;
        for (int i = 0; i < w; i++) {
            View j = m3137j(i);
            int a = this.f13871b.mo767a(j);
            if (this.f13871b.mo769b(j) > c) {
                if (a < d) {
                    if (a < c) {
                        if (z) {
                            if (view == null) {
                                view = j;
                            }
                        }
                    }
                    return j;
                }
            }
        }
        return view;
    }

    /* renamed from: e */
    View m16607e(boolean z) {
        int c = this.f13871b.mo770c();
        int d = this.f13871b.mo772d();
        View view = null;
        for (int w = m3154w() - 1; w >= 0; w--) {
            View j = m3137j(w);
            int a = this.f13871b.mo767a(j);
            int b = this.f13871b.mo769b(j);
            if (b > c) {
                if (a < d) {
                    if (b > d) {
                        if (z) {
                            if (view == null) {
                                view = j;
                            }
                        }
                    }
                    return j;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    private void m16547b(C0790o c0790o, C0795s c0795s, boolean z) {
        int r = m16560r(Integer.MIN_VALUE);
        if (r != Integer.MIN_VALUE) {
            int d = this.f13871b.mo772d() - r;
            if (d > 0) {
                d -= -m16599c(-d, c0790o, c0795s);
                if (z && d > 0) {
                    this.f13871b.mo768a(d);
                }
            }
        }
    }

    /* renamed from: c */
    private void m16549c(C0790o c0790o, C0795s c0795s, boolean z) {
        int q = m16558q((int) BaseClientBuilder.API_PRIORITY_OTHER);
        if (q != BaseClientBuilder.API_PRIORITY_OTHER) {
            q -= this.f13871b.mo770c();
            if (q > 0) {
                q -= m16599c(q, c0790o, c0795s);
                if (z && q > 0) {
                    this.f13871b.mo768a(-q);
                }
            }
        }
    }

    /* renamed from: b */
    private void m16545b(int i, C0795s c0795s) {
        boolean z = false;
        this.f13881l.f2776b = 0;
        this.f13881l.f2777c = i;
        if (m3151t()) {
            c0795s = c0795s.m3247c();
            if (c0795s != -1) {
                if (this.f13874e == (c0795s < i)) {
                    c0795s = this.f13871b.mo776f();
                    i = 0;
                    if (m3150s()) {
                        this.f13881l.f2780f = this.f13871b.mo770c() - i;
                        this.f13881l.f2781g = this.f13871b.mo772d() + c0795s;
                    } else {
                        this.f13881l.f2781g = this.f13871b.mo774e() + c0795s;
                        this.f13881l.f2780f = -i;
                    }
                    this.f13881l.f2782h = false;
                    this.f13881l.f2775a = true;
                    i = this.f13881l;
                    if (this.f13871b.mo779h() == null && this.f13871b.mo774e() == null) {
                        z = true;
                    }
                    i.f2783i = z;
                }
                i = this.f13871b.mo776f();
                c0795s = null;
                if (m3150s()) {
                    this.f13881l.f2781g = this.f13871b.mo774e() + c0795s;
                    this.f13881l.f2780f = -i;
                } else {
                    this.f13881l.f2780f = this.f13871b.mo770c() - i;
                    this.f13881l.f2781g = this.f13871b.mo772d() + c0795s;
                }
                this.f13881l.f2782h = false;
                this.f13881l.f2775a = true;
                i = this.f13881l;
                z = true;
                i.f2783i = z;
            }
        }
        i = 0;
        c0795s = null;
        if (m3150s()) {
            this.f13881l.f2780f = this.f13871b.mo770c() - i;
            this.f13881l.f2781g = this.f13871b.mo772d() + c0795s;
        } else {
            this.f13881l.f2781g = this.f13871b.mo774e() + c0795s;
            this.f13881l.f2780f = -i;
        }
        this.f13881l.f2782h = false;
        this.f13881l.f2775a = true;
        i = this.f13881l;
        z = true;
        i.f2783i = z;
    }

    /* renamed from: g */
    private void m16551g(int i) {
        this.f13881l.f2779e = i;
        ae aeVar = this.f13881l;
        int i2 = 1;
        if (this.f13874e != (i == -1)) {
            i2 = -1;
        }
        aeVar.f2778d = i2;
    }

    /* renamed from: k */
    public void mo753k(int i) {
        super.mo753k(i);
        for (int i2 = 0; i2 < this.f13878i; i2++) {
            this.f13870a[i2].m3368d(i);
        }
    }

    /* renamed from: l */
    public void mo754l(int i) {
        super.mo754l(i);
        for (int i2 = 0; i2 < this.f13878i; i2++) {
            this.f13870a[i2].m3368d(i);
        }
    }

    /* renamed from: b */
    public void mo752b(RecyclerView recyclerView, int i, int i2) {
        m16548c(i, i2, 2);
    }

    /* renamed from: a */
    public void mo747a(RecyclerView recyclerView, int i, int i2) {
        m16548c(i, i2, 1);
    }

    /* renamed from: a */
    public void mo746a(RecyclerView recyclerView) {
        this.f13877h.m3336a();
        m3147p();
    }

    /* renamed from: a */
    public void mo748a(RecyclerView recyclerView, int i, int i2, int i3) {
        m16548c(i, i2, 8);
    }

    /* renamed from: a */
    public void mo749a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m16548c(i, i2, 4);
    }

    /* renamed from: c */
    private void m16548c(int i, int i2, int i3) {
        int i4;
        int i5;
        int o = this.f13874e ? m16625o() : m16567M();
        if (i3 != 8) {
            i4 = i + i2;
        } else if (i < i2) {
            i4 = i2 + 1;
        } else {
            i5 = i + 1;
            i4 = i2;
            this.f13877h.m3340b(i4);
            if (i3 != 8) {
                switch (i3) {
                    case 1:
                        this.f13877h.m3341b(i, i2);
                        break;
                    case 2:
                        this.f13877h.m3337a(i, i2);
                        break;
                    default:
                        break;
                }
            }
            this.f13877h.m3337a(i, 1);
            this.f13877h.m3341b(i2, 1);
            if (i5 <= o) {
                if (i4 <= (this.f13874e == 0 ? m16567M() : m16625o())) {
                    m3147p();
                }
            }
        }
        i5 = i4;
        i4 = i;
        this.f13877h.m3340b(i4);
        if (i3 != 8) {
            switch (i3) {
                case 1:
                    this.f13877h.m3341b(i, i2);
                    break;
                case 2:
                    this.f13877h.m3337a(i, i2);
                    break;
                default:
                    break;
            }
        }
        this.f13877h.m3337a(i, 1);
        this.f13877h.m3341b(i2, 1);
        if (i5 <= o) {
            if (this.f13874e == 0) {
            }
            if (i4 <= (this.f13874e == 0 ? m16567M() : m16625o())) {
                m3147p();
            }
        }
    }

    /* renamed from: a */
    private int m16531a(C0790o c0790o, ae aeVar, C0795s c0795s) {
        int i;
        int i2;
        C0790o c0790o2 = c0790o;
        ae aeVar2 = aeVar;
        boolean z = false;
        this.f13882m.set(0, this.f13878i, true);
        if (this.f13881l.f2783i) {
            i = aeVar2.f2779e == 1 ? BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE;
        } else {
            if (aeVar2.f2779e == 1) {
                i2 = aeVar2.f2781g + aeVar2.f2776b;
            } else {
                i2 = aeVar2.f2780f - aeVar2.f2776b;
            }
            i = i2;
        }
        m16533a(aeVar2.f2779e, i);
        if (r6.f13874e) {
            i2 = r6.f13871b.mo772d();
        } else {
            i2 = r6.f13871b.mo770c();
        }
        int i3 = i2;
        Object obj = null;
        while (aeVar.m3461a(c0795s) && (r6.f13881l.f2783i || !r6.f13882m.isEmpty())) {
            C0824b a;
            int e;
            int i4;
            int i5;
            int e2;
            View a2 = aeVar2.m3460a(c0790o2);
            LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
            i2 = layoutParams.m2942f();
            int c = r6.f13877h.m3342c(i2);
            Object obj2 = c == -1 ? 1 : null;
            if (obj2 != null) {
                a = layoutParams.f13861b ? r6.f13870a[z] : m16532a(aeVar2);
                r6.f13877h.m3338a(i2, a);
            } else {
                a = r6.f13870a[c];
            }
            C0824b c0824b = a;
            layoutParams.f13860a = c0824b;
            if (aeVar2.f2779e == 1) {
                m3093b(a2);
            } else {
                m3094b(a2, (int) z);
            }
            m16541a(a2, layoutParams, z);
            FullSpanItem n;
            if (aeVar2.f2779e == 1) {
                if (layoutParams.f13861b) {
                    c = m16560r(i3);
                } else {
                    c = c0824b.m3362b(i3);
                }
                e = r6.f13871b.mo775e(a2) + c;
                if (obj2 != null && layoutParams.f13861b) {
                    n = m16554n(c);
                    n.f2625b = -1;
                    n.f2624a = i2;
                    r6.f13877h.m3339a(n);
                }
                i4 = e;
                e = c;
            } else {
                if (layoutParams.f13861b) {
                    c = m16558q(i3);
                } else {
                    c = c0824b.m3354a(i3);
                }
                e = c - r6.f13871b.mo775e(a2);
                if (obj2 != null && layoutParams.f13861b) {
                    n = m16555o(c);
                    n.f2625b = 1;
                    n.f2624a = i2;
                    r6.f13877h.m3339a(n);
                }
                i4 = c;
            }
            if (layoutParams.f13861b && aeVar2.f2778d == -1) {
                if (obj2 != null) {
                    r6.f13866E = true;
                } else {
                    if (aeVar2.f2779e == 1) {
                        c = m16623m();
                    } else {
                        c = m16624n();
                    }
                    if ((c ^ 1) != 0) {
                        FullSpanItem f = r6.f13877h.m3345f(i2);
                        if (f != null) {
                            f.f2627d = true;
                        }
                        r6.f13866E = true;
                    }
                }
            }
            m16540a(a2, layoutParams, aeVar2);
            if (m16618j() && r6.f13879j == 1) {
                if (layoutParams.f13861b) {
                    i2 = r6.f13872c.mo772d();
                } else {
                    i2 = r6.f13872c.mo772d() - (((r6.f13878i - 1) - c0824b.f2651e) * r6.f13880k);
                }
                i5 = i2;
                e2 = i2 - r6.f13872c.mo775e(a2);
            } else {
                if (layoutParams.f13861b) {
                    i2 = r6.f13872c.mo770c();
                } else {
                    i2 = (c0824b.f2651e * r6.f13880k) + r6.f13872c.mo770c();
                }
                e2 = i2;
                i5 = r6.f13872c.mo775e(a2) + i2;
            }
            if (r6.f13879j == 1) {
                m3066a(a2, e2, e, i5, i4);
            } else {
                m3066a(a2, e, e2, i4, i5);
            }
            if (layoutParams.f13861b) {
                m16533a(r6.f13881l.f2779e, i);
            } else {
                m16538a(c0824b, r6.f13881l.f2779e, i);
            }
            m16536a(c0790o2, r6.f13881l);
            if (r6.f13881l.f2782h && a2.hasFocusable()) {
                if (layoutParams.f13861b) {
                    r6.f13882m.clear();
                } else {
                    r6.f13882m.set(c0824b.f2651e, false);
                    obj = 1;
                    z = false;
                }
            }
            obj = 1;
            z = false;
        }
        if (obj == null) {
            m16536a(c0790o2, r6.f13881l);
        }
        if (r6.f13881l.f2779e == -1) {
            c = r6.f13871b.mo770c() - m16558q(r6.f13871b.mo770c());
        } else {
            c = m16560r(r6.f13871b.mo772d()) - r6.f13871b.mo772d();
        }
        if (c > 0) {
            return Math.min(aeVar2.f2776b, c);
        }
        return 0;
    }

    /* renamed from: n */
    private FullSpanItem m16554n(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f2626c = new int[this.f13878i];
        for (int i2 = 0; i2 < this.f13878i; i2++) {
            fullSpanItem.f2626c[i2] = i - this.f13870a[i2].m3362b(i);
        }
        return fullSpanItem;
    }

    /* renamed from: o */
    private FullSpanItem m16555o(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f2626c = new int[this.f13878i];
        for (int i2 = 0; i2 < this.f13878i; i2++) {
            fullSpanItem.f2626c[i2] = this.f13870a[i2].m3354a(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: a */
    private void m16540a(View view, LayoutParams layoutParams, ae aeVar) {
        if (aeVar.f2779e == 1) {
            if (layoutParams.f13861b != null) {
                m16557p(view);
            } else {
                layoutParams.f13860a.m3363b(view);
            }
        } else if (layoutParams.f13861b != null) {
            m16559q(view);
        } else {
            layoutParams.f13860a.m3359a(view);
        }
    }

    /* renamed from: a */
    private void m16536a(C0790o c0790o, ae aeVar) {
        if (aeVar.f2775a) {
            if (!aeVar.f2783i) {
                if (aeVar.f2776b == 0) {
                    if (aeVar.f2779e == -1) {
                        m16546b(c0790o, aeVar.f2781g);
                    } else {
                        m16534a(c0790o, aeVar.f2780f);
                    }
                } else if (aeVar.f2779e == -1) {
                    r0 = aeVar.f2780f - m16556p(aeVar.f2780f);
                    if (r0 < 0) {
                        r4 = aeVar.f2781g;
                    } else {
                        r4 = aeVar.f2781g - Math.min(r0, aeVar.f2776b);
                    }
                    m16546b(c0790o, r4);
                } else {
                    r0 = m16561s(aeVar.f2781g) - aeVar.f2781g;
                    if (r0 < 0) {
                        r4 = aeVar.f2780f;
                    } else {
                        r4 = Math.min(r0, aeVar.f2776b) + aeVar.f2780f;
                    }
                    m16534a(c0790o, r4);
                }
            }
        }
    }

    /* renamed from: p */
    private void m16557p(View view) {
        for (int i = this.f13878i - 1; i >= 0; i--) {
            this.f13870a[i].m3363b(view);
        }
    }

    /* renamed from: q */
    private void m16559q(View view) {
        for (int i = this.f13878i - 1; i >= 0; i--) {
            this.f13870a[i].m3359a(view);
        }
    }

    /* renamed from: a */
    private void m16533a(int i, int i2) {
        for (int i3 = 0; i3 < this.f13878i; i3++) {
            if (!this.f13870a[i3].f2647a.isEmpty()) {
                m16538a(this.f13870a[i3], i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m16538a(C0824b c0824b, int i, int i2) {
        int i3 = c0824b.m3373i();
        if (i == -1) {
            if (c0824b.m3361b() + i3 <= i2) {
                this.f13882m.set(c0824b.f2651e, false);
            }
        } else if (c0824b.m3367d() - i3 >= i2) {
            this.f13882m.set(c0824b.f2651e, false);
        }
    }

    /* renamed from: p */
    private int m16556p(int i) {
        int a = this.f13870a[0].m3354a(i);
        for (int i2 = 1; i2 < this.f13878i; i2++) {
            int a2 = this.f13870a[i2].m3354a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: q */
    private int m16558q(int i) {
        int a = this.f13870a[0].m3354a(i);
        for (int i2 = 1; i2 < this.f13878i; i2++) {
            int a2 = this.f13870a[i2].m3354a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: m */
    boolean m16623m() {
        int b = this.f13870a[0].m3362b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f13878i; i++) {
            if (this.f13870a[i].m3362b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    boolean m16624n() {
        int a = this.f13870a[0].m3354a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f13878i; i++) {
            if (this.f13870a[i].m3354a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private int m16560r(int i) {
        int b = this.f13870a[0].m3362b(i);
        for (int i2 = 1; i2 < this.f13878i; i2++) {
            int b2 = this.f13870a[i2].m3362b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: s */
    private int m16561s(int i) {
        int b = this.f13870a[0].m3362b(i);
        for (int i2 = 1; i2 < this.f13878i; i2++) {
            int b2 = this.f13870a[i2].m3362b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: a */
    private void m16534a(C0790o c0790o, int i) {
        while (m3154w() > 0) {
            int i2 = 0;
            View j = m3137j(0);
            if (this.f13871b.mo769b(j) <= i && this.f13871b.mo771c(j) <= i) {
                LayoutParams layoutParams = (LayoutParams) j.getLayoutParams();
                if (layoutParams.f13861b) {
                    int i3 = 0;
                    while (i3 < this.f13878i) {
                        if (this.f13870a[i3].f2647a.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    while (i2 < this.f13878i) {
                        this.f13870a[i2].m3372h();
                        i2++;
                    }
                } else if (layoutParams.f13860a.f2647a.size() != 1) {
                    layoutParams.f13860a.m3372h();
                } else {
                    return;
                }
                m3070a(j, c0790o);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m16546b(C0790o c0790o, int i) {
        int w = m3154w() - 1;
        while (w >= 0) {
            View j = m3137j(w);
            if (this.f13871b.mo767a(j) >= i && this.f13871b.mo773d(j) >= i) {
                LayoutParams layoutParams = (LayoutParams) j.getLayoutParams();
                if (layoutParams.f13861b) {
                    int i2 = 0;
                    while (i2 < this.f13878i) {
                        if (this.f13870a[i2].f2647a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f13878i; i3++) {
                        this.f13870a[i3].m3371g();
                    }
                } else if (layoutParams.f13860a.f2647a.size() != 1) {
                    layoutParams.f13860a.m3371g();
                } else {
                    return;
                }
                m3070a(j, c0790o);
                w--;
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    private boolean m16562t(int i) {
        boolean z = false;
        if (this.f13879j == 0) {
            if ((i == -1) != this.f13874e) {
                z = true;
            }
            return z;
        }
        if (((i == -1) == this.f13874e) == m16618j()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private C0824b m16532a(ae aeVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m16562t(aeVar.f2779e)) {
            i = this.f13878i - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f13878i;
            i2 = 1;
        }
        C0824b c0824b = null;
        int c;
        C0824b c0824b2;
        int b;
        if (aeVar.f2779e == 1) {
            aeVar = BaseClientBuilder.API_PRIORITY_OTHER;
            c = this.f13871b.mo770c();
            while (i != i3) {
                c0824b2 = this.f13870a[i];
                b = c0824b2.m3362b(c);
                if (b < aeVar) {
                    c0824b = c0824b2;
                    aeVar = b;
                }
                i += i2;
            }
            return c0824b;
        }
        aeVar = Integer.MIN_VALUE;
        c = this.f13871b.mo772d();
        while (i != i3) {
            c0824b2 = this.f13870a[i];
            b = c0824b2.m3354a(c);
            if (b > aeVar) {
                c0824b = c0824b2;
                aeVar = b;
            }
            i += i2;
        }
        return c0824b;
    }

    /* renamed from: f */
    public boolean mo690f() {
        return this.f13879j == 1;
    }

    /* renamed from: e */
    public boolean mo688e() {
        return this.f13879j == 0;
    }

    /* renamed from: a */
    public int mo666a(int i, C0790o c0790o, C0795s c0795s) {
        return m16599c(i, c0790o, c0795s);
    }

    /* renamed from: b */
    public int mo677b(int i, C0790o c0790o, C0795s c0795s) {
        return m16599c(i, c0790o, c0795s);
    }

    /* renamed from: u */
    private int m16563u(int i) {
        int i2 = -1;
        if (m3154w() == 0) {
            if (this.f13874e != 0) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < m16567M()) == this.f13874e) {
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: d */
    public PointF mo684d(int i) {
        i = m16563u(i);
        PointF pointF = new PointF();
        if (i == 0) {
            return 0;
        }
        if (this.f13879j == 0) {
            pointF.x = (float) i;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i;
        }
        return pointF;
    }

    /* renamed from: a */
    public void mo674a(RecyclerView recyclerView, C0795s c0795s, int i) {
        c0795s = new af(recyclerView.getContext());
        c0795s.m3234d(i);
        m3055a((C0794r) c0795s);
    }

    /* renamed from: e */
    public void mo687e(int i) {
        if (!(this.f13862A == null || this.f13862A.f2630a == i)) {
            this.f13862A.m3349b();
        }
        this.f13875f = i;
        this.f13876g = Integer.MIN_VALUE;
        m3147p();
    }

    /* renamed from: a */
    public void mo669a(int i, int i2, C0795s c0795s, C0781a c0781a) {
        if (this.f13879j != 0) {
            i = i2;
        }
        if (m3154w() != 0) {
            if (i != 0) {
                m16576a(i, c0795s);
                if (this.f13868G == 0 || this.f13868G.length < this.f13878i) {
                    this.f13868G = new int[this.f13878i];
                }
                i = 0;
                int i3 = 0;
                for (i2 = 0; i2 < this.f13878i; i2++) {
                    int a;
                    if (this.f13881l.f2778d == -1) {
                        a = this.f13881l.f2780f - this.f13870a[i2].m3354a(this.f13881l.f2780f);
                    } else {
                        a = this.f13870a[i2].m3362b(this.f13881l.f2781g) - this.f13881l.f2781g;
                    }
                    if (a >= 0) {
                        this.f13868G[i3] = a;
                        i3++;
                    }
                }
                Arrays.sort(this.f13868G, 0, i3);
                while (i < i3 && this.f13881l.m3461a(c0795s) != 0) {
                    c0781a.mo762b(this.f13881l.f2777c, this.f13868G[i]);
                    i2 = this.f13881l;
                    i2.f2777c += this.f13881l.f2778d;
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    void m16576a(int i, C0795s c0795s) {
        int o;
        int i2;
        if (i > 0) {
            o = m16625o();
            i2 = 1;
        } else {
            o = m16567M();
            i2 = -1;
        }
        this.f13881l.f2775a = true;
        m16545b(o, c0795s);
        m16551g(i2);
        this.f13881l.f2777c = o + this.f13881l.f2778d;
        this.f13881l.f2776b = Math.abs(i);
    }

    /* renamed from: c */
    int m16599c(int i, C0790o c0790o, C0795s c0795s) {
        if (m3154w() != 0) {
            if (i != 0) {
                m16576a(i, c0795s);
                c0795s = m16531a(c0790o, this.f13881l, c0795s);
                if (this.f13881l.f2776b >= c0795s) {
                    i = i < 0 ? -c0795s : c0795s;
                }
                this.f13871b.mo768a(-i);
                this.f13884o = this.f13874e;
                this.f13881l.f2776b = 0;
                m16536a(c0790o, this.f13881l);
                return i;
            }
        }
        return 0;
    }

    /* renamed from: o */
    int m16625o() {
        int w = m3154w();
        if (w == 0) {
            return 0;
        }
        return m3110d(m3137j(w - 1));
    }

    /* renamed from: M */
    int m16567M() {
        if (m3154w() == 0) {
            return 0;
        }
        return m3110d(m3137j(0));
    }

    /* renamed from: v */
    private int m16564v(int i) {
        int w = m3154w();
        for (int i2 = 0; i2 < w; i2++) {
            int d = m3110d(m3137j(i2));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    /* renamed from: w */
    private int m16565w(int i) {
        for (int w = m3154w() - 1; w >= 0; w--) {
            int d = m3110d(m3137j(w));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public android.support.v7.widget.RecyclerView.LayoutParams mo667a() {
        if (this.f13879j == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    public android.support.v7.widget.RecyclerView.LayoutParams mo742a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public android.support.v7.widget.RecyclerView.LayoutParams mo743a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public boolean mo750a(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    public View mo668a(View view, int i, C0790o c0790o, C0795s c0795s) {
        if (m3154w() == 0) {
            return null;
        }
        C0795s e = m3117e(view);
        if (e == null) {
            return null;
        }
        m16529O();
        i = m16566x(i);
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        int o;
        LayoutParams layoutParams = (LayoutParams) e.getLayoutParams();
        boolean z = layoutParams.f13861b;
        C0824b c0824b = layoutParams.f13860a;
        if (i == 1) {
            o = m16625o();
        } else {
            o = m16567M();
        }
        m16545b(o, c0795s);
        m16551g(i);
        this.f13881l.f2777c = this.f13881l.f2778d + o;
        this.f13881l.f2776b = (int) (((float) this.f13871b.mo776f()) * 0.33333334f);
        this.f13881l.f2782h = true;
        int i2 = 0;
        this.f13881l.f2775a = false;
        m16531a(c0790o, this.f13881l, c0795s);
        this.f13884o = this.f13874e;
        if (!z) {
            c0790o = c0824b.m3357a(o, i);
            if (!(c0790o == null || c0790o == e)) {
                return c0790o;
            }
        }
        if (m16562t(i) != null) {
            for (c0790o = this.f13878i - 1; c0790o >= null; c0790o--) {
                c0795s = this.f13870a[c0790o].m3357a(o, i);
                if (c0795s != null && c0795s != e) {
                    return c0795s;
                }
            }
        } else {
            for (c0790o = null; c0790o < this.f13878i; c0790o++) {
                c0795s = this.f13870a[c0790o].m3357a(o, i);
                if (c0795s != null && c0795s != e) {
                    return c0795s;
                }
            }
        }
        c0790o = (this.f13873d ^ 1) == (i == -1 ? true : null) ? true : null;
        if (!z) {
            if (c0790o != null) {
                c0795s = c0824b.m3374j();
            } else {
                c0795s = c0824b.m3375k();
            }
            c0795s = mo680c((int) c0795s);
            if (!(c0795s == null || c0795s == e)) {
                return c0795s;
            }
        }
        if (m16562t(i) != 0) {
            for (i = this.f13878i - 1; i >= 0; i--) {
                if (i != c0824b.f2651e) {
                    if (c0790o != null) {
                        c0795s = this.f13870a[i].m3374j();
                    } else {
                        c0795s = this.f13870a[i].m3375k();
                    }
                    c0795s = mo680c((int) c0795s);
                    if (!(c0795s == null || c0795s == e)) {
                        return c0795s;
                    }
                }
            }
        } else {
            while (i2 < this.f13878i) {
                if (c0790o != null) {
                    i = this.f13870a[i2].m3374j();
                } else {
                    i = this.f13870a[i2].m3375k();
                }
                i = mo680c(i);
                if (i != 0 && i != e) {
                    return i;
                }
                i2++;
            }
        }
        return null;
    }

    /* renamed from: x */
    private int m16566x(int i) {
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        if (i == 17) {
            if (this.f13879j != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f13879j != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f13879j == 0) {
                i3 = 1;
            }
            return i3;
        } else if (i != 130) {
            switch (i) {
                case 1:
                    return (this.f13879j == 1 || m16618j() == 0) ? -1 : 1;
                case 2:
                    return (this.f13879j == 1 || m16618j() == 0) ? 1 : -1;
                default:
                    return Integer.MIN_VALUE;
            }
        } else {
            if (this.f13879j == 1) {
                i3 = 1;
            }
            return i3;
        }
    }
}
