package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import io.fabric.sdk.android.C2766c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonUtils {
    /* renamed from: a */
    public static final Comparator<File> f11851a = new C27881();
    /* renamed from: b */
    private static Boolean f11852b;
    /* renamed from: c */
    private static final char[] f11853c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: d */
    private static long f11854d = -1;

    /* renamed from: io.fabric.sdk.android.services.common.CommonUtils$1 */
    static class C27881 implements Comparator<File> {
        C27881() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m13592a((File) obj, (File) obj2);
        }

        /* renamed from: a */
        public int m13592a(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        /* renamed from: k */
        private static final Map<String, Architecture> f11849k = null;

        static {
            f11849k = new HashMap(4);
            f11849k.put("armeabi-v7a", ARMV7);
            f11849k.put("armeabi", ARMV6);
            f11849k.put("arm64-v8a", ARM64);
            f11849k.put("x86", X86_32);
        }

        /* renamed from: a */
        static Architecture m13593a() {
            Object obj = Build.CPU_ABI;
            if (TextUtils.isEmpty(obj)) {
                C2766c.m13524h().mo3554a("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = (Architecture) f11849k.get(obj.toLowerCase(Locale.US));
            if (architecture == null) {
                architecture = UNKNOWN;
            }
            return architecture;
        }
    }

    /* renamed from: b */
    public static String m13619b(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    /* renamed from: a */
    public static SharedPreferences m13599a(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* renamed from: a */
    public static String m13601a(File file, String str) {
        String str2 = null;
        if (file.exists()) {
            Closeable bufferedReader;
            try {
                String[] split;
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        CharSequence readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            break;
                        }
                    } catch (Exception e) {
                        str = e;
                    }
                }
                str2 = split[1];
            } catch (Exception e2) {
                str = e2;
                bufferedReader = null;
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error parsing ");
                    stringBuilder.append(file);
                    C2766c.m13524h().mo3562e("Fabric", stringBuilder.toString(), str);
                    m13613a(bufferedReader, "Failed to close system file reader.");
                    return str2;
                } catch (Throwable th) {
                    file = th;
                    m13613a(bufferedReader, "Failed to close system file reader.");
                    throw file;
                }
            } catch (Throwable th2) {
                file = th2;
                bufferedReader = null;
                m13613a(bufferedReader, "Failed to close system file reader.");
                throw file;
            }
            m13613a(bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    /* renamed from: a */
    public static int m13594a() {
        return Architecture.m13593a().ordinal();
    }

    /* renamed from: b */
    public static synchronized long m13617b() {
        long j;
        synchronized (CommonUtils.class) {
            if (f11854d == -1) {
                j = 0;
                Object a = m13601a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a)) {
                    String toUpperCase = a.toUpperCase(Locale.US);
                    try {
                        long a2;
                        if (toUpperCase.endsWith("KB")) {
                            a2 = m13597a(toUpperCase, "KB", 1024);
                        } else if (toUpperCase.endsWith("MB")) {
                            a2 = m13597a(toUpperCase, "MB", 1048576);
                        } else if (toUpperCase.endsWith("GB")) {
                            a2 = m13597a(toUpperCase, "GB", 1073741824);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unexpected meminfo format while computing RAM: ");
                            stringBuilder.append(toUpperCase);
                            C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
                        }
                        j = a2;
                    } catch (Throwable e) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Unexpected meminfo format while computing RAM: ");
                        stringBuilder2.append(toUpperCase);
                        C2766c.m13524h().mo3562e("Fabric", stringBuilder2.toString(), e);
                    }
                }
                f11854d = j;
            }
            j = f11854d;
        }
        return j;
    }

    /* renamed from: a */
    static long m13597a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[null].trim()) * ((long) i);
    }

    /* renamed from: a */
    public static RunningAppProcessInfo m13598a(String str, Context context) {
        Context<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m13602a(InputStream inputStream) {
        inputStream = new Scanner(inputStream).useDelimiter("\\A");
        return inputStream.hasNext() ? inputStream.next() : "";
    }

    /* renamed from: a */
    public static String m13604a(String str) {
        return m13605a(str, "SHA-1");
    }

    /* renamed from: b */
    public static String m13622b(String str) {
        return m13605a(str, "SHA-256");
    }

    /* renamed from: b */
    public static String m13621b(InputStream inputStream) {
        return m13603a(inputStream, "SHA-1");
    }

    /* renamed from: a */
    private static String m13605a(String str, String str2) {
        return m13607a(str.getBytes(), str2);
    }

    /* renamed from: a */
    private static String m13603a(InputStream inputStream, String str) {
        try {
            str = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m13606a(str.digest());
                }
                str.update(bArr, 0, read);
            }
        } catch (InputStream inputStream2) {
            C2766c.m13524h().mo3562e("Fabric", "Could not calculate hash for app icon.", inputStream2);
            return "";
        }
    }

    /* renamed from: a */
    private static String m13607a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m13606a(instance.digest());
        } catch (byte[] bArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create hashing algorithm: ");
            stringBuilder.append(str);
            stringBuilder.append(", returning empty string.");
            C2766c.m13524h().mo3562e("Fabric", stringBuilder.toString(), bArr2);
            return "";
        }
    }

    /* renamed from: a */
    public static String m13608a(String... strArr) {
        String str = null;
        if (strArr != null) {
            if (strArr.length != 0) {
                List<String> arrayList = new ArrayList();
                for (String str2 : strArr) {
                    if (str2 != null) {
                        arrayList.add(str2.replace("-", "").toLowerCase(Locale.US));
                    }
                }
                Collections.sort(arrayList);
                strArr = new StringBuilder();
                for (String append : arrayList) {
                    strArr.append(append);
                }
                String stringBuilder = strArr.toString();
                if (stringBuilder.length() > 0) {
                    str = m13604a(stringBuilder);
                }
                return str;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static long m13618b(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: c */
    public static long m13623c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: c */
    public static Float m13624c(Context context) {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context == null) {
            return null;
        }
        return Float.valueOf(((float) context.getIntExtra("level", -1)) / ((float) context.getIntExtra("scale", -1)));
    }

    /* renamed from: d */
    public static boolean m13627d(Context context) {
        boolean z = false;
        if (m13630f(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static void m13610a(Context context, String str) {
        if (m13629e(context) != null) {
            C2766c.m13524h().mo3554a("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m13611a(Context context, String str, Throwable th) {
        if (m13629e(context) != null) {
            C2766c.m13524h().mo3561e("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m13609a(Context context, int i, String str, String str2) {
        if (m13629e(context) != null) {
            C2766c.m13524h().mo3552a(i, "Fabric", str2);
        }
    }

    /* renamed from: e */
    public static boolean m13629e(Context context) {
        if (f11852b == null) {
            f11852b = Boolean.valueOf(m13616a(context, "com.crashlytics.Trace", false));
        }
        return f11852b.booleanValue();
    }

    /* renamed from: a */
    public static boolean m13616a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = m13595a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                str = m13595a(context, str, "string");
                if (str > null) {
                    return Boolean.parseBoolean(context.getString(str));
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static int m13595a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m13634j(context));
    }

    /* renamed from: f */
    public static boolean m13630f(Context context) {
        context = Secure.getString(context.getContentResolver(), "android_id");
        if (!("sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT))) {
            if (context != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m13631g(Context context) {
        context = m13630f(context);
        String str = Build.TAGS;
        if ((context == null && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (context != null || file.exists() == null) {
            return null;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m13625c() {
        if (!Debug.isDebuggerConnected()) {
            if (!Debug.waitingForDebugger()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static int m13632h(Context context) {
        int i = m13630f(context) ? 1 : 0;
        if (m13631g(context) != null) {
            i |= 2;
        }
        return m13625c() != null ? i | 4 : i;
    }

    /* renamed from: a */
    public static int m13596a(Context context, boolean z) {
        context = m13624c(context);
        if (z) {
            if (context != null) {
                if (((double) context.floatValue()) >= 99.0d) {
                    return 3;
                }
                return ((double) context.floatValue()) < 4636666922610458624 ? 2 : null;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public static String m13606a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = f11853c[i2 >>> 4];
            cArr[i3 + 1] = f11853c[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: i */
    public static boolean m13633i(Context context) {
        return (context.getApplicationInfo().flags & 2) != null ? true : null;
    }

    /* renamed from: b */
    public static String m13620b(Context context, String str) {
        str = m13595a(context, str, "string");
        return str > null ? context.getString(str) : "";
    }

    /* renamed from: a */
    public static void m13613a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Closeable closeable2) {
                C2766c.m13524h().mo3562e("Fabric", str, closeable2);
            }
        }
    }

    /* renamed from: a */
    public static void m13614a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Flushable flushable2) {
                C2766c.m13524h().mo3562e("Fabric", str, flushable2);
            }
        }
    }

    /* renamed from: d */
    public static boolean m13628d(String str) {
        if (str != null) {
            if (str.length() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m13600a(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* renamed from: j */
    public static String m13634j(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            return context.getResources().getResourcePackageName(i);
        }
        return context.getPackageName();
    }

    /* renamed from: a */
    public static void m13615a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public static String m13635k(Context context) {
        Closeable openRawResource;
        Throwable e;
        Throwable th;
        String str = null;
        try {
            openRawResource = context.getResources().openRawResource(m13636l(context));
            try {
                String b = m13621b((InputStream) openRawResource);
                if (!m13628d(b)) {
                    str = b;
                }
                m13613a(openRawResource, "Failed to close icon input stream.");
                return str;
            } catch (Exception e2) {
                e = e2;
                try {
                    C2766c.m13524h().mo3562e("Fabric", "Could not calculate hash for app icon.", e);
                    m13613a(openRawResource, "Failed to close icon input stream.");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    m13613a(openRawResource, "Failed to close icon input stream.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            openRawResource = null;
            C2766c.m13524h().mo3562e("Fabric", "Could not calculate hash for app icon.", e);
            m13613a(openRawResource, "Failed to close icon input stream.");
            return null;
        } catch (Context context2) {
            th = context2;
            openRawResource = null;
            m13613a(openRawResource, "Failed to close icon input stream.");
            throw th;
        }
    }

    /* renamed from: l */
    public static int m13636l(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    /* renamed from: m */
    public static String m13637m(Context context) {
        int a = m13595a(context, "io.fabric.android.build_id", "string");
        if (a == 0) {
            a = m13595a(context, "com.crashlytics.android.build_id", "string");
        }
        if (a == 0) {
            return null;
        }
        context = context.getResources().getString(a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Build ID is: ");
        stringBuilder.append(context);
        C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
        return context;
    }

    /* renamed from: a */
    public static void m13612a(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        goto L_0x0008;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.CommonUtils.a(java.io.Closeable):void");
    }

    /* renamed from: c */
    public static boolean m13626c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == null ? true : null;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: n */
    public static boolean m13638n(Context context) {
        boolean z = true;
        if (!m13626c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        context = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null || context.isConnectedOrConnecting() == null) {
            z = false;
        }
        return z;
    }
}
