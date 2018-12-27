package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {
    /* renamed from: a */
    private final ArrayList<C0317a> f1112a = new ArrayList();
    /* renamed from: b */
    private FrameLayout f1113b;
    /* renamed from: c */
    private Context f1114c;
    /* renamed from: d */
    private C0334l f1115d;
    /* renamed from: e */
    private int f1116e;
    /* renamed from: f */
    private OnTabChangeListener f1117f;
    /* renamed from: g */
    private C0317a f1118g;
    /* renamed from: h */
    private boolean f1119h;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C03161();
        /* renamed from: a */
        String f1107a;

        /* renamed from: android.support.v4.app.FragmentTabHost$SavedState$1 */
        static class C03161 implements Creator<SavedState> {
            C03161() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1132a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1133a(i);
            }

            /* renamed from: a */
            public SavedState m1132a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m1133a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1107a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1107a);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FragmentTabHost.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" curTab=");
            stringBuilder.append(this.f1107a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$a */
    static final class C0317a {
        /* renamed from: a */
        final String f1108a;
        /* renamed from: b */
        final Class<?> f1109b;
        /* renamed from: c */
        final Bundle f1110c;
        /* renamed from: d */
        Fragment f1111d;
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        m1138a(context, null);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1138a(context, attributeSet);
    }

    /* renamed from: a */
    private void m1138a(Context context, AttributeSet attributeSet) {
        context = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f1116e = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: a */
    private void m1137a(Context context) {
        if (findViewById(16908307) == null) {
            View linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new LayoutParams(-1, -1));
            View tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            tabWidget = new FrameLayout(context);
            tabWidget.setId(16908305);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(0, 0, 0.0f));
            tabWidget = new FrameLayout(context);
            this.f1113b = tabWidget;
            this.f1113b.setId(this.f1116e);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setup(Context context, C0334l c0334l) {
        m1137a(context);
        super.setup();
        this.f1114c = context;
        this.f1115d = c0334l;
        m1136a();
    }

    public void setup(Context context, C0334l c0334l, int i) {
        m1137a(context);
        super.setup();
        this.f1114c = context;
        this.f1115d = c0334l;
        this.f1116e = i;
        m1136a();
        this.f1113b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    /* renamed from: a */
    private void m1136a() {
        if (this.f1113b == null) {
            this.f1113b = (FrameLayout) findViewById(this.f1116e);
            if (this.f1113b == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No tab content FrameLayout found for id ");
                stringBuilder.append(this.f1116e);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f1117f = onTabChangeListener;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f1112a.size();
        C0347q c0347q = null;
        for (int i = 0; i < size; i++) {
            C0317a c0317a = (C0317a) this.f1112a.get(i);
            c0317a.f1111d = this.f1115d.mo291a(c0317a.f1108a);
            if (!(c0317a.f1111d == null || c0317a.f1111d.isDetached())) {
                if (c0317a.f1108a.equals(currentTabTag)) {
                    this.f1118g = c0317a;
                } else {
                    if (c0347q == null) {
                        c0347q = this.f1115d.mo292a();
                    }
                    c0347q.mo277b(c0317a.f1111d);
                }
            }
        }
        this.f1119h = true;
        C0347q a = m1135a(currentTabTag, c0347q);
        if (a != null) {
            a.mo278c();
            this.f1115d.mo300b();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1119h = false;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1107a = getCurrentTabTag();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setCurrentTabByTag(savedState.f1107a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onTabChanged(String str) {
        if (this.f1119h) {
            C0347q a = m1135a(str, null);
            if (a != null) {
                a.mo278c();
            }
        }
        if (this.f1117f != null) {
            this.f1117f.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private C0347q m1135a(String str, C0347q c0347q) {
        C0317a a = m1134a(str);
        if (this.f1118g != a) {
            if (c0347q == null) {
                c0347q = this.f1115d.mo292a();
            }
            if (!(this.f1118g == null || this.f1118g.f1111d == null)) {
                c0347q.mo277b(this.f1118g.f1111d);
            }
            if (a != null) {
                if (a.f1111d == null) {
                    a.f1111d = Fragment.instantiate(this.f1114c, a.f1109b.getName(), a.f1110c);
                    c0347q.mo269a(this.f1116e, a.f1111d, a.f1108a);
                } else {
                    c0347q.mo279c(a.f1111d);
                }
            }
            this.f1118g = a;
        }
        return c0347q;
    }

    /* renamed from: a */
    private C0317a m1134a(String str) {
        int size = this.f1112a.size();
        for (int i = 0; i < size; i++) {
            C0317a c0317a = (C0317a) this.f1112a.get(i);
            if (c0317a.f1108a.equals(str)) {
                return c0317a;
            }
        }
        return null;
    }
}
