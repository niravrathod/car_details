package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.k */
final class C2597k {
    /* renamed from: a */
    private final Messenger f11037a;
    /* renamed from: b */
    private final zzl f11038b;

    C2597k(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f11037a = new Messenger(iBinder);
            this.f11038b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f11038b = new zzl(iBinder);
            this.f11037a = null;
        } else {
            iBinder = "Invalid interface descriptor: ";
            interfaceDescriptor = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", interfaceDescriptor.length() != 0 ? iBinder.concat(interfaceDescriptor) : new String(iBinder));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    final void m12749a(Message message) {
        if (this.f11037a != null) {
            this.f11037a.send(message);
        } else if (this.f11038b != null) {
            this.f11038b.m12806a(message);
        } else {
            throw new IllegalStateException("Both messengers are null");
        }
    }
}
