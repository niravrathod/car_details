package com.google.android.gms.internal.ads;

import java.io.PrintStream;
import java.io.PrintWriter;

public final class zzbbe {
    /* renamed from: a */
    private static final ka f9089a;
    /* renamed from: b */
    private static final int f9090b;

    /* renamed from: com.google.android.gms.internal.ads.zzbbe$a */
    static final class C4103a extends ka {
        C4103a() {
        }

        /* renamed from: a */
        public final void mo1967a(Throwable th) {
            th.printStackTrace();
        }

        /* renamed from: a */
        public final void mo1968a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    /* renamed from: a */
    public static void m10254a(Throwable th) {
        f9089a.mo1967a(th);
    }

    /* renamed from: a */
    public static void m10255a(Throwable th, PrintWriter printWriter) {
        f9089a.mo1968a(th, printWriter);
    }

    /* renamed from: a */
    private static Integer m10253a() {
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
        ka keVar;
        Throwable th;
        PrintStream printStream;
        String name;
        StringBuilder stringBuilder;
        int i = 1;
        try {
            a = m10253a();
            if (a != null) {
                try {
                    if (a.intValue() >= 19) {
                        keVar = new ke();
                        f9089a = keVar;
                        if (a != null) {
                            i = a.intValue();
                        }
                        f9090b = i;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    printStream = System.err;
                    name = C4103a.class.getName();
                    stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
                    stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
                    stringBuilder.append(name);
                    stringBuilder.append("will be used. The error is: ");
                    printStream.println(stringBuilder.toString());
                    th.printStackTrace(System.err);
                    keVar = new C4103a();
                    f9089a = keVar;
                    if (a != null) {
                        i = a.intValue();
                    }
                    f9090b = i;
                }
            }
            if ((Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ 1) != 0) {
                keVar = new kd();
            } else {
                keVar = new C4103a();
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            printStream = System.err;
            name = C4103a.class.getName();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
            stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
            stringBuilder.append(name);
            stringBuilder.append("will be used. The error is: ");
            printStream.println(stringBuilder.toString());
            th.printStackTrace(System.err);
            keVar = new C4103a();
            f9089a = keVar;
            if (a != null) {
                i = a.intValue();
            }
            f9090b = i;
        }
        f9089a = keVar;
        if (a != null) {
            i = a.intValue();
        }
        f9090b = i;
    }
}
