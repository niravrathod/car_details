package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.C2162b;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Parcelable, Comparator<SchemeData> {
    public static final Creator<DrmInitData> CREATOR = new C21881();
    /* renamed from: a */
    public final int f6775a;
    /* renamed from: b */
    private final SchemeData[] f6776b;
    /* renamed from: c */
    private int f6777c;

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$1 */
    static class C21881 implements Creator<DrmInitData> {
        C21881() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8069a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8070a(i);
        }

        /* renamed from: a */
        public DrmInitData m8069a(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        /* renamed from: a */
        public DrmInitData[] m8070a(int i) {
            return new DrmInitData[i];
        }
    }

    public static final class SchemeData implements Parcelable {
        public static final Creator<SchemeData> CREATOR = new C21891();
        /* renamed from: a */
        public final String f6770a;
        /* renamed from: b */
        public final byte[] f6771b;
        /* renamed from: c */
        public final boolean f6772c;
        /* renamed from: d */
        private int f6773d;
        /* renamed from: e */
        private final UUID f6774e;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$1 */
        static class C21891 implements Creator<SchemeData> {
            C21891() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m8071a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m8072a(i);
            }

            /* renamed from: a */
            public SchemeData m8071a(Parcel parcel) {
                return new SchemeData(parcel);
            }

            /* renamed from: a */
            public SchemeData[] m8072a(int i) {
                return new SchemeData[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f6774e = (UUID) C2163a.m7914a((Object) uuid);
            this.f6770a = (String) C2163a.m7914a((Object) str);
            this.f6771b = (byte[]) C2163a.m7914a((Object) bArr);
            this.f6772c = z;
        }

        SchemeData(Parcel parcel) {
            this.f6774e = new UUID(parcel.readLong(), parcel.readLong());
            this.f6770a = parcel.readString();
            this.f6771b = parcel.createByteArray();
            this.f6772c = parcel.readByte() != null ? true : null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            boolean z = true;
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!this.f6770a.equals(schemeData.f6770a) || !C2186s.m8052a(this.f6774e, schemeData.f6774e) || Arrays.equals(this.f6771b, schemeData.f6771b) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.f6773d == 0) {
                this.f6773d = (((this.f6774e.hashCode() * 31) + this.f6770a.hashCode()) * 31) + Arrays.hashCode(this.f6771b);
            }
            return this.f6773d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f6774e.getMostSignificantBits());
            parcel.writeLong(this.f6774e.getLeastSignificantBits());
            parcel.writeString(this.f6770a);
            parcel.writeByteArray(this.f6771b);
            parcel.writeByte((byte) this.f6772c);
        }
    }

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m8074a((SchemeData) obj, (SchemeData) obj2);
    }

    public DrmInitData(List<SchemeData> list) {
        this(false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(true, schemeDataArr);
    }

    private DrmInitData(boolean z, SchemeData... schemeDataArr) {
        if (z) {
            schemeDataArr = (SchemeData[]) schemeDataArr.clone();
        }
        Arrays.sort(schemeDataArr, this);
        for (z = true; z < schemeDataArr.length; z++) {
            if (schemeDataArr[z - 1].f6774e.equals(schemeDataArr[z].f6774e)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Duplicate data for uuid: ");
                stringBuilder.append(schemeDataArr[z].f6774e);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.f6776b = schemeDataArr;
        this.f6775a = schemeDataArr.length;
    }

    DrmInitData(Parcel parcel) {
        this.f6776b = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.f6775a = this.f6776b.length;
    }

    /* renamed from: a */
    public SchemeData m8075a(int i) {
        return this.f6776b[i];
    }

    public int hashCode() {
        if (this.f6777c == 0) {
            this.f6777c = Arrays.hashCode(this.f6776b);
        }
        return this.f6777c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return Arrays.equals(this.f6776b, ((DrmInitData) obj).f6776b);
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m8074a(SchemeData schemeData, SchemeData schemeData2) {
        if (C2162b.f6692b.equals(schemeData.f6774e)) {
            return C2162b.f6692b.equals(schemeData2.f6774e) != null ? null : 1;
        } else {
            return schemeData.f6774e.compareTo(schemeData2.f6774e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f6776b, 0);
    }
}
