package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

class LogFileManager {
    /* renamed from: a */
    private static final C3568a f4227a = new C3568a();
    /* renamed from: b */
    private final Context f4228b;
    /* renamed from: c */
    private final DirectoryProvider f4229c;
    /* renamed from: d */
    private C1398u f4230d;

    public interface DirectoryProvider {
        File getLogFileDir();
    }

    /* renamed from: com.crashlytics.android.core.LogFileManager$a */
    private static final class C3568a implements C1398u {
        /* renamed from: a */
        public C1357d mo1122a() {
            return null;
        }

        /* renamed from: a */
        public void mo1123a(long j, String str) {
        }

        /* renamed from: b */
        public byte[] mo1124b() {
            return null;
        }

        /* renamed from: c */
        public void mo1125c() {
        }

        /* renamed from: d */
        public void mo1126d() {
        }

        private C3568a() {
        }
    }

    LogFileManager(Context context, DirectoryProvider directoryProvider) {
        this(context, directoryProvider, null);
    }

    LogFileManager(Context context, DirectoryProvider directoryProvider, String str) {
        this.f4228b = context;
        this.f4229c = directoryProvider;
        this.f4230d = f4227a;
        m5447a(str);
    }

    /* renamed from: a */
    final void m5447a(String str) {
        this.f4230d.mo1125c();
        this.f4230d = f4227a;
        if (str != null) {
            if (CommonUtils.m13616a(this.f4228b, "com.crashlytics.CollectCustomLogs", true)) {
                m5446a(m5443b(str), 65536);
            } else {
                C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Preferences requested no custom logs. Aborting log file creation.");
            }
        }
    }

    /* renamed from: a */
    void m5445a(long j, String str) {
        this.f4230d.mo1123a(j, str);
    }

    /* renamed from: a */
    C1357d m5444a() {
        return this.f4230d.mo1122a();
    }

    /* renamed from: b */
    byte[] m5449b() {
        return this.f4230d.mo1124b();
    }

    /* renamed from: c */
    void m5450c() {
        this.f4230d.mo1126d();
    }

    /* renamed from: a */
    void m5448a(Set<String> set) {
        File[] listFiles = this.f4229c.getLogFileDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(m5442a(file))) {
                    file.delete();
                }
            }
        }
    }

    /* renamed from: a */
    void m5446a(File file, int i) {
        this.f4230d = new QueueFileLogStore(file, i);
    }

    /* renamed from: b */
    private File m5443b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("crashlytics-userlog-");
        stringBuilder.append(str);
        stringBuilder.append(".temp");
        return new File(this.f4229c.getLogFileDir(), stringBuilder.toString());
    }

    /* renamed from: a */
    private String m5442a(File file) {
        file = file.getName();
        int lastIndexOf = file.lastIndexOf(".temp");
        if (lastIndexOf == -1) {
            return file;
        }
        return file.substring("crashlytics-userlog-".length(), lastIndexOf);
    }
}
