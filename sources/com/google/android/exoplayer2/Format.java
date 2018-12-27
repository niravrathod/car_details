package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Creator<Format> CREATOR = new C21221();
    /* renamed from: A */
    private int f6483A;
    /* renamed from: a */
    public final String f6484a;
    /* renamed from: b */
    public final int f6485b;
    /* renamed from: c */
    public final String f6486c;
    /* renamed from: d */
    public final Metadata f6487d;
    /* renamed from: e */
    public final String f6488e;
    /* renamed from: f */
    public final String f6489f;
    /* renamed from: g */
    public final int f6490g;
    /* renamed from: h */
    public final List<byte[]> f6491h;
    /* renamed from: i */
    public final DrmInitData f6492i;
    /* renamed from: j */
    public final int f6493j;
    /* renamed from: k */
    public final int f6494k;
    /* renamed from: l */
    public final float f6495l;
    /* renamed from: m */
    public final int f6496m;
    /* renamed from: n */
    public final float f6497n;
    /* renamed from: o */
    public final int f6498o;
    /* renamed from: p */
    public final byte[] f6499p;
    /* renamed from: q */
    public final ColorInfo f6500q;
    /* renamed from: r */
    public final int f6501r;
    /* renamed from: s */
    public final int f6502s;
    /* renamed from: t */
    public final int f6503t;
    /* renamed from: u */
    public final int f6504u;
    /* renamed from: v */
    public final int f6505v;
    /* renamed from: w */
    public final long f6506w;
    /* renamed from: x */
    public final int f6507x;
    /* renamed from: y */
    public final String f6508y;
    /* renamed from: z */
    public final int f6509z;

    /* renamed from: com.google.android.exoplayer2.Format$1 */
    static class C21221 implements Creator<Format> {
        C21221() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7734a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7735a(i);
        }

        /* renamed from: a */
        public Format m7734a(Parcel parcel) {
            return new Format(parcel);
        }

        /* renamed from: a */
        public Format[] m7735a(int i) {
            return new Format[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static Format m7737a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
        return m7738a(str, str2, str3, i, i2, i3, i4, f, (List) list, i5, f2, null, -1, null, drmInitData);
    }

    /* renamed from: a */
    public static Format m7738a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    /* renamed from: a */
    public static Format m7741a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData, int i5, String str4) {
        return m7740a(str, str2, str3, i, i2, i3, i4, -1, (List) list, drmInitData, i5, str4);
    }

    /* renamed from: a */
    public static Format m7740a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return m7739a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, (List) list, drmInitData, i6, str4, null);
    }

    /* renamed from: a */
    public static Format m7739a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    /* renamed from: a */
    public static Format m7744a(String str, String str2, String str3, int i, int i2, String str4, DrmInitData drmInitData) {
        return m7743a(str, str2, str3, i, i2, str4, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static Format m7742a(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData) {
        return m7743a(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static Format m7743a(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    /* renamed from: a */
    public static Format m7746a(String str, String str2, String str3, int i, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    /* renamed from: a */
    public static Format m7736a(String str, String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    /* renamed from: a */
    public static Format m7745a(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, DrmInitData drmInitData, Metadata metadata) {
        this.f6484a = str;
        this.f6488e = str2;
        this.f6489f = str3;
        this.f6486c = str4;
        this.f6485b = i;
        this.f6490g = i2;
        this.f6493j = i3;
        this.f6494k = i4;
        this.f6495l = f;
        this.f6496m = i5;
        this.f6497n = f2;
        this.f6499p = bArr;
        this.f6498o = i6;
        this.f6500q = colorInfo;
        this.f6501r = i7;
        this.f6502s = i8;
        this.f6503t = i9;
        this.f6504u = i10;
        this.f6505v = i11;
        this.f6507x = i12;
        this.f6508y = str5;
        this.f6509z = i13;
        this.f6506w = j;
        r0.f6491h = list == null ? Collections.emptyList() : list;
        r0.f6492i = drmInitData;
        r0.f6487d = metadata;
    }

    Format(Parcel parcel) {
        this.f6484a = parcel.readString();
        this.f6488e = parcel.readString();
        this.f6489f = parcel.readString();
        this.f6486c = parcel.readString();
        this.f6485b = parcel.readInt();
        this.f6490g = parcel.readInt();
        this.f6493j = parcel.readInt();
        this.f6494k = parcel.readInt();
        this.f6495l = parcel.readFloat();
        this.f6496m = parcel.readInt();
        this.f6497n = parcel.readFloat();
        this.f6499p = (parcel.readInt() != 0 ? 1 : null) != null ? parcel.createByteArray() : null;
        this.f6498o = parcel.readInt();
        this.f6500q = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f6501r = parcel.readInt();
        this.f6502s = parcel.readInt();
        this.f6503t = parcel.readInt();
        this.f6504u = parcel.readInt();
        this.f6505v = parcel.readInt();
        this.f6507x = parcel.readInt();
        this.f6508y = parcel.readString();
        this.f6509z = parcel.readInt();
        this.f6506w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f6491h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f6491h.add(parcel.createByteArray());
        }
        this.f6492i = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f6487d = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    /* renamed from: a */
    public Format m7753a(int i) {
        int i2 = i;
        return new Format(this.f6484a, this.f6488e, this.f6489f, this.f6486c, this.f6485b, i2, this.f6493j, this.f6494k, this.f6495l, this.f6496m, this.f6497n, this.f6499p, this.f6498o, this.f6500q, this.f6501r, this.f6502s, this.f6503t, this.f6504u, this.f6505v, this.f6507x, this.f6508y, this.f6509z, this.f6506w, this.f6491h, this.f6492i, this.f6487d);
    }

    /* renamed from: a */
    public Format m7755a(long j) {
        return new Format(this.f6484a, this.f6488e, this.f6489f, this.f6486c, this.f6485b, this.f6490g, this.f6493j, this.f6494k, this.f6495l, this.f6496m, this.f6497n, this.f6499p, this.f6498o, this.f6500q, this.f6501r, this.f6502s, this.f6503t, this.f6504u, this.f6505v, this.f6507x, this.f6508y, this.f6509z, j, this.f6491h, this.f6492i, this.f6487d);
    }

    /* renamed from: a */
    public Format m7754a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        return new Format(this.f6484a, this.f6488e, this.f6489f, this.f6486c, this.f6485b, this.f6490g, this.f6493j, this.f6494k, this.f6495l, this.f6496m, this.f6497n, this.f6499p, this.f6498o, this.f6500q, this.f6501r, this.f6502s, this.f6503t, i3, i4, this.f6507x, this.f6508y, this.f6509z, this.f6506w, this.f6491h, this.f6492i, this.f6487d);
    }

    /* renamed from: a */
    public Format m7756a(DrmInitData drmInitData) {
        DrmInitData drmInitData2 = drmInitData;
        return new Format(this.f6484a, this.f6488e, this.f6489f, this.f6486c, this.f6485b, this.f6490g, this.f6493j, this.f6494k, this.f6495l, this.f6496m, this.f6497n, this.f6499p, this.f6498o, this.f6500q, this.f6501r, this.f6502s, this.f6503t, this.f6504u, this.f6505v, this.f6507x, this.f6508y, this.f6509z, this.f6506w, this.f6491h, drmInitData2, this.f6487d);
    }

    /* renamed from: a */
    public Format m7757a(Metadata metadata) {
        Metadata metadata2 = metadata;
        return new Format(this.f6484a, this.f6488e, this.f6489f, this.f6486c, this.f6485b, this.f6490g, this.f6493j, this.f6494k, this.f6495l, this.f6496m, this.f6497n, this.f6499p, this.f6498o, this.f6500q, this.f6501r, this.f6502s, this.f6503t, this.f6504u, this.f6505v, this.f6507x, this.f6508y, this.f6509z, this.f6506w, this.f6491h, this.f6492i, metadata2);
    }

    /* renamed from: a */
    public int m7752a() {
        if (this.f6493j == -1) {
            return -1;
        }
        if (this.f6494k == -1) {
            return -1;
        }
        return this.f6494k * this.f6493j;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: b */
    public final MediaFormat m7758b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f6489f);
        m7750a(mediaFormat, "language", this.f6508y);
        m7749a(mediaFormat, "max-input-size", this.f6490g);
        m7749a(mediaFormat, "width", this.f6493j);
        m7749a(mediaFormat, "height", this.f6494k);
        m7748a(mediaFormat, "frame-rate", this.f6495l);
        m7749a(mediaFormat, "rotation-degrees", this.f6496m);
        m7749a(mediaFormat, "channel-count", this.f6501r);
        m7749a(mediaFormat, "sample-rate", this.f6502s);
        m7749a(mediaFormat, "encoder-delay", this.f6504u);
        m7749a(mediaFormat, "encoder-padding", this.f6505v);
        for (int i = 0; i < this.f6491h.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("csd-");
            stringBuilder.append(i);
            mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap((byte[]) this.f6491h.get(i)));
        }
        m7747a(mediaFormat, this.f6500q);
        return mediaFormat;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Format(");
        stringBuilder.append(this.f6484a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6488e);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6489f);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6485b);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6508y);
        stringBuilder.append(", [");
        stringBuilder.append(this.f6493j);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6494k);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6495l);
        stringBuilder.append("]");
        stringBuilder.append(", [");
        stringBuilder.append(this.f6501r);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6502s);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

    public int hashCode() {
        if (this.f6483A == 0) {
            int i = 0;
            int hashCode = (((((((((((((((((((((((527 + (this.f6484a == null ? 0 : this.f6484a.hashCode())) * 31) + (this.f6488e == null ? 0 : this.f6488e.hashCode())) * 31) + (this.f6489f == null ? 0 : this.f6489f.hashCode())) * 31) + (this.f6486c == null ? 0 : this.f6486c.hashCode())) * 31) + this.f6485b) * 31) + this.f6493j) * 31) + this.f6494k) * 31) + this.f6501r) * 31) + this.f6502s) * 31) + (this.f6508y == null ? 0 : this.f6508y.hashCode())) * 31) + this.f6509z) * 31) + (this.f6492i == null ? 0 : this.f6492i.hashCode())) * 31;
            if (this.f6487d != null) {
                i = this.f6487d.hashCode();
            }
            this.f6483A = hashCode + i;
        }
        return this.f6483A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                Format format = (Format) obj;
                if (this.f6485b == format.f6485b && this.f6490g == format.f6490g && this.f6493j == format.f6493j && this.f6494k == format.f6494k && this.f6495l == format.f6495l && this.f6496m == format.f6496m && this.f6497n == format.f6497n && this.f6498o == format.f6498o && this.f6501r == format.f6501r && this.f6502s == format.f6502s && this.f6503t == format.f6503t && this.f6504u == format.f6504u && this.f6505v == format.f6505v && this.f6506w == format.f6506w && this.f6507x == format.f6507x && C2186s.m8052a(this.f6484a, format.f6484a) && C2186s.m8052a(this.f6508y, format.f6508y) && this.f6509z == format.f6509z && C2186s.m8052a(this.f6488e, format.f6488e) && C2186s.m8052a(this.f6489f, format.f6489f) && C2186s.m8052a(this.f6486c, format.f6486c) && C2186s.m8052a(this.f6492i, format.f6492i) && C2186s.m8052a(this.f6487d, format.f6487d) && C2186s.m8052a(this.f6500q, format.f6500q) && Arrays.equals(this.f6499p, format.f6499p)) {
                    if (this.f6491h.size() == format.f6491h.size()) {
                        for (int i = 0; i < this.f6491h.size(); i++) {
                            if (!Arrays.equals((byte[]) this.f6491h.get(i), (byte[]) format.f6491h.get(i))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @TargetApi(24)
    /* renamed from: a */
    private static void m7747a(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            m7749a(mediaFormat, "color-transfer", colorInfo.f7526c);
            m7749a(mediaFormat, "color-standard", colorInfo.f7524a);
            m7749a(mediaFormat, "color-range", colorInfo.f7525b);
            m7751a(mediaFormat, "hdr-static-info", colorInfo.f7527d);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m7750a(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m7749a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m7748a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m7751a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6484a);
        parcel.writeString(this.f6488e);
        parcel.writeString(this.f6489f);
        parcel.writeString(this.f6486c);
        parcel.writeInt(this.f6485b);
        parcel.writeInt(this.f6490g);
        parcel.writeInt(this.f6493j);
        parcel.writeInt(this.f6494k);
        parcel.writeFloat(this.f6495l);
        parcel.writeInt(this.f6496m);
        parcel.writeFloat(this.f6497n);
        parcel.writeInt(this.f6499p != null ? 1 : 0);
        if (this.f6499p != null) {
            parcel.writeByteArray(this.f6499p);
        }
        parcel.writeInt(this.f6498o);
        parcel.writeParcelable(this.f6500q, i);
        parcel.writeInt(this.f6501r);
        parcel.writeInt(this.f6502s);
        parcel.writeInt(this.f6503t);
        parcel.writeInt(this.f6504u);
        parcel.writeInt(this.f6505v);
        parcel.writeInt(this.f6507x);
        parcel.writeString(this.f6508y);
        parcel.writeInt(this.f6509z);
        parcel.writeLong(this.f6506w);
        i = this.f6491h.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            parcel.writeByteArray((byte[]) this.f6491h.get(i2));
        }
        parcel.writeParcelable(this.f6492i, 0);
        parcel.writeParcelable(this.f6487d, 0);
    }
}
