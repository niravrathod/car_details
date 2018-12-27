package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

final class ao {
    /* renamed from: a */
    private static final FilenameFilter f4258a = new C13531();

    /* renamed from: com.crashlytics.android.core.ao$1 */
    static class C13531 implements FilenameFilter {
        public boolean accept(File file, String str) {
            return true;
        }

        C13531() {
        }
    }

    /* renamed from: a */
    static int m5517a(File file, int i, Comparator<File> comparator) {
        return m5518a(file, f4258a, i, comparator);
    }

    /* renamed from: a */
    static int m5518a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        file = file.listFiles(filenameFilter);
        filenameFilter = null;
        if (file == null) {
            return 0;
        }
        int length = file.length;
        Arrays.sort(file, comparator);
        FilenameFilter length2 = file.length;
        while (filenameFilter < length2) {
            File file2 = file[filenameFilter];
            if (length <= i) {
                return length;
            }
            file2.delete();
            length--;
            filenameFilter++;
        }
        return length;
    }
}
