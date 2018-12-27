package com.facebook.ads.internal.p097p.p099b.p100a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.p.b.a.d */
class C1872d {

    /* renamed from: com.facebook.ads.internal.p.b.a.d$a */
    private static final class C1871a implements Comparator<File> {
        private C1871a() {
        }

        /* renamed from: a */
        private int m7140a(long j, long j2) {
            return j < j2 ? -1 : j == j2 ? 0 : 1;
        }

        /* renamed from: a */
        public int m7141a(File file, File file2) {
            return m7140a(file.lastModified(), file2.lastModified());
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m7141a((File) obj, (File) obj2);
        }
    }

    /* renamed from: a */
    static void m7142a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("File ");
                stringBuilder.append(file);
                stringBuilder.append(" is not directory!");
                throw new IOException(stringBuilder.toString());
            }
        } else if (!file.mkdirs()) {
            throw new IOException(String.format("Directory %s can't be created", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: b */
    static List<File> m7143b(File file) {
        List linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new C1871a());
        return asList;
    }

    /* renamed from: c */
    static void m7144c(File file) {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                C1872d.m7145d(file);
                if (file.lastModified() < currentTimeMillis) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error set last modified date to ");
                    stringBuilder.append(file);
                    throw new IOException(stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: d */
    static void m7145d(File file) {
        long length = file.length();
        if (length == 0) {
            C1872d.m7146e(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        length--;
        randomAccessFile.seek(length);
        byte readByte = randomAccessFile.readByte();
        randomAccessFile.seek(length);
        randomAccessFile.write(readByte);
        randomAccessFile.close();
    }

    /* renamed from: e */
    private static void m7146e(File file) {
        if (!file.delete() || !file.createNewFile()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error recreate zero-size file ");
            stringBuilder.append(file);
            throw new IOException(stringBuilder.toString());
        }
    }
}
