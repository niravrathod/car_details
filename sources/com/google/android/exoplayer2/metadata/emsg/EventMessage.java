package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;

public final class EventMessage implements Entry {
    public static final Creator<EventMessage> CREATOR = new C22871();
    /* renamed from: a */
    public final String f16200a;
    /* renamed from: b */
    public final String f16201b;
    /* renamed from: c */
    public final long f16202c;
    /* renamed from: d */
    public final long f16203d;
    /* renamed from: e */
    public final byte[] f16204e;
    /* renamed from: f */
    private int f16205f;

    /* renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$1 */
    static class C22871 implements Creator<EventMessage> {
        C22871() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8406a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8407a(i);
        }

        /* renamed from: a */
        public EventMessage m8406a(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* renamed from: a */
        public EventMessage[] m8407a(int i) {
            return new EventMessage[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f16200a = str;
        this.f16201b = str2;
        this.f16202c = j;
        this.f16203d = j2;
        this.f16204e = bArr;
    }

    EventMessage(Parcel parcel) {
        this.f16200a = parcel.readString();
        this.f16201b = parcel.readString();
        this.f16202c = parcel.readLong();
        this.f16203d = parcel.readLong();
        this.f16204e = parcel.createByteArray();
    }

    public int hashCode() {
        if (this.f16205f == 0) {
            int i = 0;
            int hashCode = (527 + (this.f16200a != null ? this.f16200a.hashCode() : 0)) * 31;
            if (this.f16201b != null) {
                i = this.f16201b.hashCode();
            }
            this.f16205f = ((((((hashCode + i) * 31) + ((int) (this.f16202c ^ (this.f16202c >>> 32)))) * 31) + ((int) (this.f16203d ^ (this.f16203d >>> 32)))) * 31) + Arrays.hashCode(this.f16204e);
        }
        return this.f16205f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                EventMessage eventMessage = (EventMessage) obj;
                if (this.f16202c != eventMessage.f16202c || this.f16203d != eventMessage.f16203d || !C2186s.m8052a(this.f16200a, eventMessage.f16200a) || !C2186s.m8052a(this.f16201b, eventMessage.f16201b) || Arrays.equals(this.f16204e, eventMessage.f16204e) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16200a);
        parcel.writeString(this.f16201b);
        parcel.writeLong(this.f16202c);
        parcel.writeLong(this.f16203d);
        parcel.writeByteArray(this.f16204e);
    }
}
