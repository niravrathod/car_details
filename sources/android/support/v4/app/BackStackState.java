package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.C3106d.C0326a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new C03071();
    /* renamed from: a */
    final int[] f1053a;
    /* renamed from: b */
    final int f1054b;
    /* renamed from: c */
    final int f1055c;
    /* renamed from: d */
    final String f1056d;
    /* renamed from: e */
    final int f1057e;
    /* renamed from: f */
    final int f1058f;
    /* renamed from: g */
    final CharSequence f1059g;
    /* renamed from: h */
    final int f1060h;
    /* renamed from: i */
    final CharSequence f1061i;
    /* renamed from: j */
    final ArrayList<String> f1062j;
    /* renamed from: k */
    final ArrayList<String> f1063k;
    /* renamed from: l */
    final boolean f1064l;

    /* renamed from: android.support.v4.app.BackStackState$1 */
    static class C03071 implements Creator<BackStackState> {
        C03071() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1104a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1105a(i);
        }

        /* renamed from: a */
        public BackStackState m1104a(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: a */
        public BackStackState[] m1105a(int i) {
            return new BackStackState[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public BackStackState(C3106d c3106d) {
        int size = c3106d.f13119b.size();
        this.f1053a = new int[(size * 6)];
        if (c3106d.f13126i) {
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0326a c0326a = (C0326a) c3106d.f13119b.get(i);
                int i3 = i2 + 1;
                this.f1053a[i2] = c0326a.f1142a;
                int i4 = i3 + 1;
                this.f1053a[i3] = c0326a.f1143b != null ? c0326a.f1143b.mIndex : -1;
                i3 = i4 + 1;
                this.f1053a[i4] = c0326a.f1144c;
                i4 = i3 + 1;
                this.f1053a[i3] = c0326a.f1145d;
                i3 = i4 + 1;
                this.f1053a[i4] = c0326a.f1146e;
                i4 = i3 + 1;
                this.f1053a[i3] = c0326a.f1147f;
                i++;
                i2 = i4;
            }
            this.f1054b = c3106d.f13124g;
            this.f1055c = c3106d.f13125h;
            this.f1056d = c3106d.f13128k;
            this.f1057e = c3106d.f13130m;
            this.f1058f = c3106d.f13131n;
            this.f1059g = c3106d.f13132o;
            this.f1060h = c3106d.f13133p;
            this.f1061i = c3106d.f13134q;
            this.f1062j = c3106d.f13135r;
            this.f1063k = c3106d.f13136s;
            this.f1064l = c3106d.f13137t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackState(Parcel parcel) {
        this.f1053a = parcel.createIntArray();
        this.f1054b = parcel.readInt();
        this.f1055c = parcel.readInt();
        this.f1056d = parcel.readString();
        this.f1057e = parcel.readInt();
        this.f1058f = parcel.readInt();
        this.f1059g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1060h = parcel.readInt();
        this.f1061i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1062j = parcel.createStringArrayList();
        this.f1063k = parcel.createStringArrayList();
        this.f1064l = parcel.readInt() != null ? true : null;
    }

    /* renamed from: a */
    public C3106d m1106a(C3112m c3112m) {
        C3106d c3106d = new C3106d(c3112m);
        int i = 0;
        int i2 = 0;
        while (i < this.f1053a.length) {
            C0326a c0326a = new C0326a();
            int i3 = i + 1;
            c0326a.f1142a = this.f1053a[i];
            if (C3112m.f13159a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Instantiate ");
                stringBuilder.append(c3106d);
                stringBuilder.append(" op #");
                stringBuilder.append(i2);
                stringBuilder.append(" base fragment #");
                stringBuilder.append(this.f1053a[i3]);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            int i4 = i3 + 1;
            i = this.f1053a[i3];
            if (i >= 0) {
                c0326a.f1143b = (Fragment) c3112m.f13171f.get(i);
            } else {
                c0326a.f1143b = null;
            }
            i3 = i4 + 1;
            c0326a.f1144c = this.f1053a[i4];
            i4 = i3 + 1;
            c0326a.f1145d = this.f1053a[i3];
            i3 = i4 + 1;
            c0326a.f1146e = this.f1053a[i4];
            i4 = i3 + 1;
            c0326a.f1147f = this.f1053a[i3];
            c3106d.f13120c = c0326a.f1144c;
            c3106d.f13121d = c0326a.f1145d;
            c3106d.f13122e = c0326a.f1146e;
            c3106d.f13123f = c0326a.f1147f;
            c3106d.m15353a(c0326a);
            i2++;
            i = i4;
        }
        c3106d.f13124g = this.f1054b;
        c3106d.f13125h = this.f1055c;
        c3106d.f13128k = this.f1056d;
        c3106d.f13130m = this.f1057e;
        c3106d.f13126i = true;
        c3106d.f13131n = this.f1058f;
        c3106d.f13132o = this.f1059g;
        c3106d.f13133p = this.f1060h;
        c3106d.f13134q = this.f1061i;
        c3106d.f13135r = this.f1062j;
        c3106d.f13136s = this.f1063k;
        c3106d.f13137t = this.f1064l;
        c3106d.m15351a(1);
        return c3106d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1053a);
        parcel.writeInt(this.f1054b);
        parcel.writeInt(this.f1055c);
        parcel.writeString(this.f1056d);
        parcel.writeInt(this.f1057e);
        parcel.writeInt(this.f1058f);
        TextUtils.writeToParcel(this.f1059g, parcel, 0);
        parcel.writeInt(this.f1060h);
        TextUtils.writeToParcel(this.f1061i, parcel, 0);
        parcel.writeStringList(this.f1062j);
        parcel.writeStringList(this.f1063k);
        parcel.writeInt(this.f1064l);
    }
}
