package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.C0503e.C0502a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new C04921();
    /* renamed from: a */
    final int f1595a;
    /* renamed from: b */
    final long f1596b;
    /* renamed from: c */
    final long f1597c;
    /* renamed from: d */
    final float f1598d;
    /* renamed from: e */
    final long f1599e;
    /* renamed from: f */
    final int f1600f;
    /* renamed from: g */
    final CharSequence f1601g;
    /* renamed from: h */
    final long f1602h;
    /* renamed from: i */
    List<CustomAction> f1603i;
    /* renamed from: j */
    final long f1604j;
    /* renamed from: k */
    final Bundle f1605k;
    /* renamed from: l */
    private Object f1606l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$1 */
    static class C04921 implements Creator<PlaybackStateCompat> {
        C04921() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1774a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1775a(i);
        }

        /* renamed from: a */
        public PlaybackStateCompat m1774a(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: a */
        public PlaybackStateCompat[] m1775a(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new C04931();
        /* renamed from: a */
        private final String f1590a;
        /* renamed from: b */
        private final CharSequence f1591b;
        /* renamed from: c */
        private final int f1592c;
        /* renamed from: d */
        private final Bundle f1593d;
        /* renamed from: e */
        private Object f1594e;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$1 */
        static class C04931 implements Creator<CustomAction> {
            C04931() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1776a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1777a(i);
            }

            /* renamed from: a */
            public CustomAction m1776a(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: a */
            public CustomAction[] m1777a(int i) {
                return new CustomAction[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1590a = str;
            this.f1591b = charSequence;
            this.f1592c = i;
            this.f1593d = bundle;
        }

        CustomAction(Parcel parcel) {
            this.f1590a = parcel.readString();
            this.f1591b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1592c = parcel.readInt();
            this.f1593d = parcel.readBundle();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1590a);
            TextUtils.writeToParcel(this.f1591b, parcel, i);
            parcel.writeInt(this.f1592c);
            parcel.writeBundle(this.f1593d);
        }

        /* renamed from: a */
        public static CustomAction m1778a(Object obj) {
            if (obj != null) {
                if (VERSION.SDK_INT >= 21) {
                    CustomAction customAction = new CustomAction(C0502a.m1860a(obj), C0502a.m1861b(obj), C0502a.m1862c(obj), C0502a.m1863d(obj));
                    customAction.f1594e = obj;
                    return customAction;
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Action:mName='");
            stringBuilder.append(this.f1591b);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.f1592c);
            stringBuilder.append(", mExtras=");
            stringBuilder.append(this.f1593d);
            return stringBuilder.toString();
        }
    }

    public int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1595a = i;
        this.f1596b = j;
        this.f1597c = j2;
        this.f1598d = f;
        this.f1599e = j3;
        this.f1600f = i2;
        this.f1601g = charSequence;
        this.f1602h = j4;
        this.f1603i = new ArrayList(list);
        this.f1604j = j5;
        this.f1605k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1595a = parcel.readInt();
        this.f1596b = parcel.readLong();
        this.f1598d = parcel.readFloat();
        this.f1602h = parcel.readLong();
        this.f1597c = parcel.readLong();
        this.f1599e = parcel.readLong();
        this.f1601g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1603i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1604j = parcel.readLong();
        this.f1605k = parcel.readBundle();
        this.f1600f = parcel.readInt();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.f1595a);
        stringBuilder.append(", position=");
        stringBuilder.append(this.f1596b);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.f1597c);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.f1598d);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.f1602h);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.f1599e);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.f1600f);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.f1601g);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.f1603i);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.f1604j);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1595a);
        parcel.writeLong(this.f1596b);
        parcel.writeFloat(this.f1598d);
        parcel.writeLong(this.f1602h);
        parcel.writeLong(this.f1597c);
        parcel.writeLong(this.f1599e);
        TextUtils.writeToParcel(this.f1601g, parcel, i);
        parcel.writeTypedList(this.f1603i);
        parcel.writeLong(this.f1604j);
        parcel.writeBundle(this.f1605k);
        parcel.writeInt(this.f1600f);
    }

    /* renamed from: a */
    public static PlaybackStateCompat m1779a(Object obj) {
        Object obj2 = obj;
        PlaybackStateCompat playbackStateCompat = null;
        if (obj2 == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List list;
        List<Object> h = C0503e.m1871h(obj);
        if (h != null) {
            List arrayList = new ArrayList(h.size());
            for (Object a : h) {
                arrayList.add(CustomAction.m1778a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            playbackStateCompat = C0504f.m1873a(obj);
        }
        PlaybackStateCompat playbackStateCompat2 = new PlaybackStateCompat(C0503e.m1864a(obj), C0503e.m1865b(obj), C0503e.m1866c(obj), C0503e.m1867d(obj), C0503e.m1868e(obj), 0, C0503e.m1869f(obj), C0503e.m1870g(obj), list, C0503e.m1872i(obj), playbackStateCompat);
        playbackStateCompat2.f1606l = obj2;
        return playbackStateCompat2;
    }
}
