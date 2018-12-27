package android.support.multidex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: android.support.multidex.b */
final class C0230b {

    /* renamed from: android.support.multidex.b$a */
    static class C0229a {
        /* renamed from: a */
        long f853a;
        /* renamed from: b */
        long f854b;

        C0229a() {
        }
    }

    /* renamed from: a */
    static long m850a(File file) {
        long j = "r";
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, j);
        try {
            j = C0230b.m851a(randomAccessFile, C0230b.m852a(randomAccessFile));
            return j;
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static C0229a m852a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            while (true) {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C0229a c0229a = new C0229a();
                    c0229a.f854b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    c0229a.f853a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return c0229a;
                }
                length--;
                if (length < j) {
                    throw new ZipException("End Of Central Directory signature not found");
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("File too short to be a zip file: ");
            stringBuilder.append(randomAccessFile.length());
            throw new ZipException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static long m851a(RandomAccessFile randomAccessFile, C0229a c0229a) {
        CRC32 crc32 = new CRC32();
        long j = c0229a.f854b;
        randomAccessFile.seek(c0229a.f853a);
        byte[] bArr = new byte[16384];
        c0229a = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (c0229a != -1) {
            crc32.update(bArr, 0, c0229a);
            j -= (long) c0229a;
            if (j == 0) {
                break;
            }
            c0229a = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }
}
