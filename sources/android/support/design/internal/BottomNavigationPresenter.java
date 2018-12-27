package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.view.menu.C0728o;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3227j;
import android.support.v7.view.menu.C4465u;

public class BottomNavigationPresenter implements C0728o {
    /* renamed from: a */
    private C3224h f12808a;
    /* renamed from: b */
    private BottomNavigationMenuView f12809b;
    /* renamed from: c */
    private boolean f12810c = false;
    /* renamed from: d */
    private int f12811d;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C01451();
        /* renamed from: a */
        int f537a;

        /* renamed from: android.support.design.internal.BottomNavigationPresenter$SavedState$1 */
        static class C01451 implements Creator<SavedState> {
            C01451() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m480a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m481a(i);
            }

            /* renamed from: a */
            public SavedState m480a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m481a(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f537a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f537a);
        }
    }

    /* renamed from: a */
    public void mo77a(C3224h c3224h, boolean z) {
    }

    /* renamed from: a */
    public void mo78a(C0727a c0727a) {
    }

    /* renamed from: a */
    public boolean mo80a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo81a(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    /* renamed from: a */
    public boolean mo82a(C4465u c4465u) {
        return false;
    }

    /* renamed from: b */
    public boolean mo84b(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    /* renamed from: a */
    public void m14857a(BottomNavigationMenuView bottomNavigationMenuView) {
        this.f12809b = bottomNavigationMenuView;
    }

    /* renamed from: a */
    public void mo75a(Context context, C3224h c3224h) {
        this.f12809b.mo74a(this.f12808a);
        this.f12808a = c3224h;
    }

    /* renamed from: a */
    public void mo79a(boolean z) {
        if (!this.f12810c) {
            if (z) {
                this.f12809b.m14850a();
            } else {
                this.f12809b.m14853b();
            }
        }
    }

    /* renamed from: a */
    public void m14854a(int i) {
        this.f12811d = i;
    }

    /* renamed from: b */
    public int mo83b() {
        return this.f12811d;
    }

    /* renamed from: c */
    public Parcelable mo85c() {
        Parcelable savedState = new SavedState();
        savedState.f537a = this.f12809b.getSelectedItemId();
        return savedState;
    }

    /* renamed from: a */
    public void mo76a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f12809b.m14851a(((SavedState) parcelable).f537a);
        }
    }

    /* renamed from: b */
    public void m14865b(boolean z) {
        this.f12810c = z;
    }
}
