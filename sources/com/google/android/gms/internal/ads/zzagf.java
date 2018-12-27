package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

@zzaer
@Class(creator = "LargeParcelTeleporterCreator")
@Reserved({1})
public final class zzagf extends AbstractSafeParcelable {
    public static final Creator<zzagf> CREATOR = new zzagh();
    @Field(id = 2)
    /* renamed from: a */
    private ParcelFileDescriptor f19814a;
    /* renamed from: b */
    private Parcelable f19815b;
    /* renamed from: c */
    private boolean f19816c;

    @Constructor
    public zzagf(@Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f19814a = parcelFileDescriptor;
        this.f19815b = null;
        this.f19816c = true;
    }

    public zzagf(SafeParcelable safeParcelable) {
        this.f19814a = null;
        this.f19815b = safeParcelable;
        this.f19816c = null;
    }

    /* renamed from: a */
    public final <T extends SafeParcelable> T m26180a(Creator<T> creator) {
        if (this.f19816c) {
            if (this.f19814a == null) {
                zzaok.m10003c("File descriptor is empty, returning null.");
                return null;
            }
            byte[] autoCloseInputStream = new AutoCloseInputStream(this.f19814a);
            Closeable dataInputStream = new DataInputStream(autoCloseInputStream);
            try {
                autoCloseInputStream = new byte[dataInputStream.readInt()];
                boolean z = false;
                dataInputStream.readFully(autoCloseInputStream, z, autoCloseInputStream.length);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(autoCloseInputStream, z, autoCloseInputStream.length);
                    obtain.setDataPosition(z);
                    this.f19815b = (SafeParcelable) creator.createFromParcel(obtain);
                    this.f19816c = z;
                } finally {
                    obtain.recycle();
                }
            } catch (IOException e) {
                creator = e;
                autoCloseInputStream = "Could not read from parcel file descriptor";
                zzaok.m10002b(autoCloseInputStream, creator);
                return null;
            } finally {
                IOUtils.closeQuietly(dataInputStream);
            }
        }
        return (SafeParcelable) this.f19815b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m26178a();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f19814a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: a */
    private final ParcelFileDescriptor m26178a() {
        if (this.f19814a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f19815b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.f19814a = m26179a(marshall);
            } finally {
                obtain.recycle();
            }
        }
        return this.f19814a;
    }

    /* renamed from: a */
    private final <T> ParcelFileDescriptor m26179a(byte[] bArr) {
        Closeable autoCloseOutputStream;
        Throwable e;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new bo(this, autoCloseOutputStream, bArr)).start();
                return createPipe[null];
            } catch (IOException e2) {
                e = e2;
                zzaok.m10002b("Error transporting the ad response", e);
                zzbv.zzeo().m9714a(e, "LargeParcelTeleporter.pipeData.2");
                IOUtils.closeQuietly(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = null;
            zzaok.m10002b("Error transporting the ad response", e);
            zzbv.zzeo().m9714a(e, "LargeParcelTeleporter.pipeData.2");
            IOUtils.closeQuietly(autoCloseOutputStream);
            return null;
        }
    }
}
