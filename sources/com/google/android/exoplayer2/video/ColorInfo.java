package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
    public static final Creator<ColorInfo> CREATOR = new C23721();
    /* renamed from: a */
    public final int f7524a;
    /* renamed from: b */
    public final int f7525b;
    /* renamed from: c */
    public final int f7526c;
    /* renamed from: d */
    public final byte[] f7527d;
    /* renamed from: e */
    private int f7528e;

    /* renamed from: com.google.android.exoplayer2.video.ColorInfo$1 */
    static class C23721 implements Creator<ColorInfo> {
        C23721() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8707a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8708a(i);
        }

        /* renamed from: a */
        public ColorInfo m8707a(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        /* renamed from: a */
        public ColorInfo[] m8708a(int i) {
            return new ColorInfo[0];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f7524a = i;
        this.f7525b = i2;
        this.f7526c = i3;
        this.f7527d = bArr;
    }

    ColorInfo(Parcel parcel) {
        this.f7524a = parcel.readInt();
        this.f7525b = parcel.readInt();
        this.f7526c = parcel.readInt();
        this.f7527d = (parcel.readInt() != 0 ? 1 : null) != null ? parcel.createByteArray() : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ColorInfo colorInfo = (ColorInfo) obj;
                if (this.f7524a == colorInfo.f7524a && this.f7525b == colorInfo.f7525b && this.f7526c == colorInfo.f7526c) {
                    if (Arrays.equals(this.f7527d, colorInfo.f7527d) != null) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ColorInfo(");
        stringBuilder.append(this.f7524a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7525b);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7526c);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7527d != null);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public int hashCode() {
        if (this.f7528e == 0) {
            this.f7528e = ((((((527 + this.f7524a) * 31) + this.f7525b) * 31) + this.f7526c) * 31) + Arrays.hashCode(this.f7527d);
        }
        return this.f7528e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7524a);
        parcel.writeInt(this.f7525b);
        parcel.writeInt(this.f7526c);
        parcel.writeInt(this.f7527d != 0 ? 1 : 0);
        if (this.f7527d != 0) {
            parcel.writeByteArray(this.f7527d);
        }
    }
}
