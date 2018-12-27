package com.google.android.gms.internal.firebase_messaging;

import java.io.PrintStream;

public final class zzc {
    /* renamed from: a */
    private static final C2466a f10033a;
    /* renamed from: b */
    private static final int f10034b;

    /* renamed from: com.google.android.gms.internal.firebase_messaging.zzc$a */
    static final class C4106a extends C2466a {
        C4106a() {
        }

        /* renamed from: a */
        public final void mo2918a(Throwable th, Throwable th2) {
        }
    }

    /* renamed from: a */
    public static void m11491a(Throwable th, Throwable th2) {
        f10033a.mo2918a(th, th2);
    }

    /* renamed from: a */
    private static Integer m11490a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    static {
        Integer a;
        C2466a c4105e;
        Throwable th;
        PrintStream printStream;
        String name;
        StringBuilder stringBuilder;
        int i = 1;
        try {
            a = m11490a();
            if (a != null) {
                try {
                    if (a.intValue() >= 19) {
                        c4105e = new C4105e();
                        f10033a = c4105e;
                        if (a != null) {
                            i = a.intValue();
                        }
                        f10034b = i;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    printStream = System.err;
                    name = C4106a.class.getName();
                    stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
                    stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
                    stringBuilder.append(name);
                    stringBuilder.append("will be used. The error is: ");
                    printStream.println(stringBuilder.toString());
                    th.printStackTrace(System.err);
                    c4105e = new C4106a();
                    f10033a = c4105e;
                    if (a != null) {
                        i = a.intValue();
                    }
                    f10034b = i;
                }
            }
            if ((Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ 1) != 0) {
                c4105e = new C4104d();
            } else {
                c4105e = new C4106a();
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            printStream = System.err;
            name = C4106a.class.getName();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
            stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
            stringBuilder.append(name);
            stringBuilder.append("will be used. The error is: ");
            printStream.println(stringBuilder.toString());
            th.printStackTrace(System.err);
            c4105e = new C4106a();
            f10033a = c4105e;
            if (a != null) {
                i = a.intValue();
            }
            f10034b = i;
        }
        f10033a = c4105e;
        if (a != null) {
            i = a.intValue();
        }
        f10034b = i;
    }
}
