package com.crashlytics.android.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: com.crashlytics.android.core.f */
class C1360f extends FileOutputStream {
    /* renamed from: a */
    public static final FilenameFilter f4270a = new C13591();
    /* renamed from: b */
    private final String f4271b;
    /* renamed from: c */
    private File f4272c;
    /* renamed from: d */
    private File f4273d;
    /* renamed from: e */
    private boolean f4274e = false;

    /* renamed from: com.crashlytics.android.core.f$1 */
    static class C13591 implements FilenameFilter {
        C13591() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public C1360f(File file, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".cls_temp");
        super(new File(file, stringBuilder.toString()));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(file);
        stringBuilder2.append(File.separator);
        stringBuilder2.append(str);
        this.f4271b = stringBuilder2.toString();
        str = new StringBuilder();
        str.append(this.f4271b);
        str.append(".cls_temp");
        this.f4272c = new File(str.toString());
    }

    public synchronized void close() {
        if (!this.f4274e) {
            this.f4274e = true;
            super.flush();
            super.close();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f4271b);
            stringBuilder.append(".cls");
            File file = new File(stringBuilder.toString());
            if (this.f4272c.renameTo(file)) {
                this.f4272c = null;
                this.f4273d = file;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f4272c.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not rename temp file: ");
            stringBuilder2.append(this.f4272c);
            stringBuilder2.append(" -> ");
            stringBuilder2.append(file);
            stringBuilder2.append(str);
            throw new IOException(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    public void m5543a() {
        if (!this.f4274e) {
            this.f4274e = true;
            super.flush();
            super.close();
        }
    }
}
