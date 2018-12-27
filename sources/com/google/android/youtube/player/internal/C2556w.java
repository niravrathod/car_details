package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import com.google.android.youtube.player.internal.C2536g.C4161a;

/* renamed from: com.google.android.youtube.player.internal.w */
public final class C2556w {

    /* renamed from: com.google.android.youtube.player.internal.w$a */
    public static final class C2555a extends Exception {
        public C2555a(String str) {
            super(str);
        }

        public C2555a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    private static IBinder m12563a(Class<?> cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        String str;
        String valueOf;
        try {
            return (IBinder) cls.getConstructor(new Class[]{IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE}).newInstance(new Object[]{iBinder, iBinder2, iBinder3, Boolean.valueOf(z)});
        } catch (Throwable e) {
            str = "Could not find the right constructor for ";
            valueOf = String.valueOf(cls.getName());
            throw new C2555a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
        } catch (Throwable e2) {
            str = "Exception thrown by invoked constructor in ";
            valueOf = String.valueOf(cls.getName());
            throw new C2555a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e2);
        } catch (Throwable e22) {
            str = "Unable to instantiate the dynamic class ";
            valueOf = String.valueOf(cls.getName());
            throw new C2555a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e22);
        } catch (Throwable e222) {
            str = "Unable to call the default constructor of ";
            valueOf = String.valueOf(cls.getName());
            throw new C2555a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e222);
        }
    }

    /* renamed from: a */
    private static IBinder m12564a(ClassLoader classLoader, String str, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return C2556w.m12563a(classLoader.loadClass(str), iBinder, iBinder2, iBinder3, z);
        } catch (Throwable e) {
            String str2 = "Unable to find dynamic class ";
            str = String.valueOf(str);
            throw new C2555a(str.length() != 0 ? str2.concat(str) : new String(str2), e);
        }
    }

    /* renamed from: a */
    public static C2536g m12565a(Activity activity, IBinder iBinder, boolean z) {
        C2534c.m12477a((Object) activity);
        C2534c.m12477a((Object) iBinder);
        Object b = ab.m12469b((Context) activity);
        if (b != null) {
            return C4161a.m22944a(C2556w.m12564a(b.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", C4721y.m27413a(b).asBinder(), C4721y.m27413a((Object) activity).asBinder(), iBinder, z));
        }
        throw new C2555a("Could not create remote context");
    }
}
