package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2186s;

public final class UrlLinkFrame extends Id3Frame {
    public static final Creator<UrlLinkFrame> CREATOR = new C22961();
    /* renamed from: a */
    public final String f19415a;
    /* renamed from: b */
    public final String f19416b;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$1 */
    static class C22961 implements Creator<UrlLinkFrame> {
        C22961() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8424a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8425a(i);
        }

        /* renamed from: a */
        public UrlLinkFrame m8424a(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        /* renamed from: a */
        public UrlLinkFrame[] m8425a(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f19415a = str2;
        this.f19416b = str3;
    }

    UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.f19415a = parcel.readString();
        this.f19416b = parcel.readString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
                if (!this.f.equals(urlLinkFrame.f) || !C2186s.m8052a(this.f19415a, urlLinkFrame.f19415a) || C2186s.m8052a(this.f19416b, urlLinkFrame.f19416b) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.f.hashCode()) * 31) + (this.f19415a != null ? this.f19415a.hashCode() : 0)) * 31;
        if (this.f19416b != null) {
            i = this.f19416b.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.f19415a);
        parcel.writeString(this.f19416b);
    }
}
