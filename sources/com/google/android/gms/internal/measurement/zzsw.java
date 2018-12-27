package com.google.android.gms.internal.measurement;

import java.io.PrintStream;

public final class zzsw {
    /* renamed from: a */
    private static final an f10193a;
    /* renamed from: b */
    private static final int f10194b;

    /* renamed from: com.google.android.gms.internal.measurement.zzsw$a */
    static final class C4135a extends an {
        C4135a() {
        }
    }

    /* renamed from: a */
    private static Integer m12002a() {
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
        an aqVar;
        Throwable th;
        PrintStream printStream;
        String name;
        StringBuilder stringBuilder;
        int i = 1;
        try {
            a = m12002a();
            if (a != null) {
                try {
                    if (a.intValue() >= 19) {
                        aqVar = new aq();
                        f10193a = aqVar;
                        if (a != null) {
                            i = a.intValue();
                        }
                        f10194b = i;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    printStream = System.err;
                    name = C4135a.class.getName();
                    stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
                    stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
                    stringBuilder.append(name);
                    stringBuilder.append("will be used. The error is: ");
                    printStream.println(stringBuilder.toString());
                    th.printStackTrace(System.err);
                    aqVar = new C4135a();
                    f10193a = aqVar;
                    if (a != null) {
                        i = a.intValue();
                    }
                    f10194b = i;
                }
            }
            if ((Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ 1) != 0) {
                aqVar = new ap();
            } else {
                aqVar = new C4135a();
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            printStream = System.err;
            name = C4135a.class.getName();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
            stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
            stringBuilder.append(name);
            stringBuilder.append("will be used. The error is: ");
            printStream.println(stringBuilder.toString());
            th.printStackTrace(System.err);
            aqVar = new C4135a();
            f10193a = aqVar;
            if (a != null) {
                i = a.intValue();
            }
            f10194b = i;
        }
        f10193a = aqVar;
        if (a != null) {
            i = a.intValue();
        }
        f10194b = i;
    }
}
