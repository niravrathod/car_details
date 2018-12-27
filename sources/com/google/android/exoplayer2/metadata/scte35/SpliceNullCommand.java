package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class SpliceNullCommand extends SpliceCommand {
    public static final Creator<SpliceNullCommand> CREATOR = new C23021();

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand$1 */
    static class C23021 implements Creator<SpliceNullCommand> {
        C23021() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8436a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8437a(i);
        }

        /* renamed from: a */
        public SpliceNullCommand m8436a(Parcel parcel) {
            return new SpliceNullCommand();
        }

        /* renamed from: a */
        public SpliceNullCommand[] m8437a(int i) {
            return new SpliceNullCommand[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
