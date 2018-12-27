package com.bumptech.glide.load.engine.p062c;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.engine.c.b */
final class C1258b {

    /* renamed from: com.bumptech.glide.load.engine.c.b$1 */
    class C12571 implements FilenameFilter {
        /* renamed from: a */
        final /* synthetic */ Pattern f3980a;

        C12571(Pattern pattern) {
            this.f3980a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f3980a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m5098a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return VERSION.SDK_INT < 17 ? Math.max(C1258b.m5099b(), availableProcessors) : availableProcessors;
    }

    /* renamed from: b */
    private static int m5099b() {
        File[] listFiles;
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            listFiles = new File("/sys/devices/system/cpu/").listFiles(new C12571(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        return Math.max(1, listFiles != null ? listFiles.length : 0);
    }
}
