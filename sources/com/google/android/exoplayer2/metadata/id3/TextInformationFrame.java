package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2186s;

public final class TextInformationFrame extends Id3Frame {
    public static final Creator<TextInformationFrame> CREATOR = new C22951();
    /* renamed from: a */
    public final String f19413a;
    /* renamed from: b */
    public final String f19414b;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$1 */
    static class C22951 implements Creator<TextInformationFrame> {
        C22951() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8422a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8423a(i);
        }

        /* renamed from: a */
        public TextInformationFrame m8422a(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* renamed from: a */
        public TextInformationFrame[] m8423a(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f19413a = str2;
        this.f19414b = str3;
    }

    TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.f19413a = parcel.readString();
        this.f19414b = parcel.readString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
                if (!this.f.equals(textInformationFrame.f) || !C2186s.m8052a(this.f19413a, textInformationFrame.f19413a) || C2186s.m8052a(this.f19414b, textInformationFrame.f19414b) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.f.hashCode()) * 31) + (this.f19413a != null ? this.f19413a.hashCode() : 0)) * 31;
        if (this.f19414b != null) {
            i = this.f19414b.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.f19413a);
        parcel.writeString(this.f19414b);
    }
}
