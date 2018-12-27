package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.p055g.C1178i;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j */
public final class C3519j implements ImageHeaderParser {
    /* renamed from: a */
    static final byte[] f14552a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    /* renamed from: b */
    private static final int[] f14553b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j$b */
    private static final class C1282b {
        /* renamed from: a */
        private final ByteBuffer f4050a;

        C1282b(byte[] bArr, int i) {
            this.f4050a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        void m5172a(ByteOrder byteOrder) {
            this.f4050a.order(byteOrder);
        }

        /* renamed from: a */
        int m5170a() {
            return this.f4050a.remaining();
        }

        /* renamed from: a */
        int m5171a(int i) {
            return m5169a(i, 4) ? this.f4050a.getInt(i) : -1;
        }

        /* renamed from: b */
        short m5173b(int i) {
            return m5169a(i, 2) ? this.f4050a.getShort(i) : (short) -1;
        }

        /* renamed from: a */
        private boolean m5169a(int i, int i2) {
            return this.f4050a.remaining() - i >= i2;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j$c */
    private interface C1283c {
        /* renamed from: a */
        int mo1054a();

        /* renamed from: a */
        int mo1055a(byte[] bArr, int i);

        /* renamed from: a */
        long mo1056a(long j);

        /* renamed from: b */
        short mo1057b();

        /* renamed from: c */
        int mo1058c();
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j$a */
    private static final class C3517a implements C1283c {
        /* renamed from: a */
        private final ByteBuffer f14550a;

        C3517a(ByteBuffer byteBuffer) {
            this.f14550a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo1054a() {
            return ((mo1058c() << 8) & 65280) | (mo1058c() & 255);
        }

        /* renamed from: b */
        public short mo1057b() {
            return (short) (mo1058c() & 255);
        }

        /* renamed from: a */
        public long mo1056a(long j) {
            j = (int) Math.min((long) this.f14550a.remaining(), j);
            this.f14550a.position(this.f14550a.position() + j);
            return (long) j;
        }

        /* renamed from: a */
        public int mo1055a(byte[] bArr, int i) {
            i = Math.min(i, this.f14550a.remaining());
            if (i == 0) {
                return -1;
            }
            this.f14550a.get(bArr, 0, i);
            return i;
        }

        /* renamed from: c */
        public int mo1058c() {
            if (this.f14550a.remaining() < 1) {
                return -1;
            }
            return this.f14550a.get();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j$d */
    private static final class C3518d implements C1283c {
        /* renamed from: a */
        private final InputStream f14551a;

        C3518d(InputStream inputStream) {
            this.f14551a = inputStream;
        }

        /* renamed from: a */
        public int mo1054a() {
            return ((this.f14551a.read() << 8) & 65280) | (this.f14551a.read() & 255);
        }

        /* renamed from: b */
        public short mo1057b() {
            return (short) (this.f14551a.read() & 255);
        }

        /* renamed from: a */
        public long mo1056a(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f14551a.skip(j2);
                if (skip > 0) {
                    j2 -= skip;
                } else if (this.f14551a.read() == -1) {
                    break;
                } else {
                    j2--;
                }
            }
            return j - j2;
        }

        /* renamed from: a */
        public int mo1055a(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f14551a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        /* renamed from: c */
        public int mo1058c() {
            return this.f14551a.read();
        }
    }

    /* renamed from: a */
    private static int m17823a(int i, int i2) {
        return (i + 2) + (i2 * 12);
    }

    /* renamed from: a */
    private static boolean m17828a(int i) {
        if (!((i & 65496) == 65496 || i == 19789)) {
            if (i != 18761) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public ImageType mo1060a(InputStream inputStream) {
        return m17827a(new C3518d((InputStream) C1178i.m4880a((Object) inputStream)));
    }

    /* renamed from: a */
    public ImageType mo1061a(ByteBuffer byteBuffer) {
        return m17827a(new C3517a((ByteBuffer) C1178i.m4880a((Object) byteBuffer)));
    }

    /* renamed from: a */
    public int mo1059a(InputStream inputStream, C1230b c1230b) {
        return m17825a(new C3518d((InputStream) C1178i.m4880a((Object) inputStream)), (C1230b) C1178i.m4880a((Object) c1230b));
    }

    /* renamed from: a */
    private ImageType m17827a(C1283c c1283c) {
        int a = c1283c.mo1054a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        a = ((a << 16) & -65536) | (c1283c.mo1054a() & 65535);
        if (a == -1991225785) {
            c1283c.mo1056a(21);
            return c1283c.mo1058c() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        } else if ((a >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            if (a != 1380533830) {
                return ImageType.UNKNOWN;
            }
            c1283c.mo1056a(4);
            if ((((c1283c.mo1054a() << 16) & -65536) | (c1283c.mo1054a() & 65535)) != 1464156752) {
                return ImageType.UNKNOWN;
            }
            a = ((c1283c.mo1054a() << 16) & -65536) | (c1283c.mo1054a() & 65535);
            if ((a & -256) != 1448097792) {
                return ImageType.UNKNOWN;
            }
            a &= 255;
            if (a == 88) {
                c1283c.mo1056a(4);
                return (c1283c.mo1058c() & 16) != null ? ImageType.WEBP_A : ImageType.WEBP;
            } else if (a != 76) {
                return ImageType.WEBP;
            } else {
                c1283c.mo1056a(4);
                return (c1283c.mo1058c() & 8) != null ? ImageType.WEBP_A : ImageType.WEBP;
            }
        }
    }

    /* renamed from: a */
    private int m17825a(C1283c c1283c, C1230b c1230b) {
        int a = c1283c.mo1054a();
        if (C3519j.m17828a(a)) {
            a = m17830b(c1283c);
            if (a == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3) != null) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            Object obj = (byte[]) c1230b.mo1011a(a, byte[].class);
            try {
                c1283c = m17826a(c1283c, obj, a);
                return c1283c;
            } finally {
                c1230b.mo1014a(obj);
            }
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3) != null) {
                c1230b = new StringBuilder();
                c1230b.append("Parser doesn't handle magic number: ");
                c1230b.append(a);
                Log.d("DfltImageHeaderParser", c1230b.toString());
            }
            return -1;
        }
    }

    /* renamed from: a */
    private int m17826a(C1283c c1283c, byte[] bArr, int i) {
        c1283c = c1283c.mo1055a(bArr, i);
        if (c1283c != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to read exif segment data, length: ");
                stringBuilder.append(i);
                stringBuilder.append(", actually read: ");
                stringBuilder.append(c1283c);
                Log.d("DfltImageHeaderParser", stringBuilder.toString());
            }
            return -1;
        } else if (m17829a(bArr, i) != null) {
            return C3519j.m17824a(new C1282b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3) != null) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    private boolean m17829a(byte[] bArr, int i) {
        i = (bArr == null || i <= f14552a.length) ? 0 : 1;
        if (i == 0) {
            return i;
        }
        for (int i2 = 0; i2 < f14552a.length; i2++) {
            if (bArr[i2] != f14552a[i2]) {
                return false;
            }
        }
        return i;
    }

    /* renamed from: b */
    private int m17830b(C1283c c1283c) {
        long a;
        long j;
        do {
            short b = c1283c.mo1057b();
            if (b != (short) 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3) != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown segmentId=");
                    stringBuilder.append(b);
                    Log.d("DfltImageHeaderParser", stringBuilder.toString());
                }
                return -1;
            }
            b = c1283c.mo1057b();
            if (b == (short) 218) {
                return -1;
            }
            if (b == (short) 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3) != null) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            int a2 = c1283c.mo1054a() - 2;
            if (b == (short) 225) {
                return a2;
            }
            j = (long) a2;
            a = c1283c.mo1056a(j);
        } while (a == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3) != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unable to skip enough data, type: ");
            stringBuilder2.append(b);
            stringBuilder2.append(", wanted to skip: ");
            stringBuilder2.append(a2);
            stringBuilder2.append(", but actually skipped: ");
            stringBuilder2.append(a);
            Log.d("DfltImageHeaderParser", stringBuilder2.toString());
        }
        return -1;
    }

    /* renamed from: a */
    private static int m17824a(C1282b c1282b) {
        ByteOrder byteOrder;
        int length = "Exif\u0000\u0000".length();
        short b = c1282b.m5173b(length);
        if (b == (short) 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (b != (short) 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown endianness = ");
                stringBuilder.append(b);
                Log.d("DfltImageHeaderParser", stringBuilder.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c1282b.m5172a(byteOrder);
        int a = c1282b.m5171a(length + 4) + length;
        short b2 = c1282b.m5173b(a);
        for (int i = 0; i < b2; i++) {
            int a2 = C3519j.m17823a(a, i);
            short b3 = c1282b.m5173b(a2);
            if (b3 == (short) 274) {
                StringBuilder stringBuilder2;
                short b4 = c1282b.m5173b(a2 + 2);
                if (b4 >= (short) 1) {
                    if (b4 <= (short) 12) {
                        int a3 = c1282b.m5171a(a2 + 4);
                        if (a3 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder stringBuilder3 = new StringBuilder();
                                stringBuilder3.append("Got tagIndex=");
                                stringBuilder3.append(i);
                                stringBuilder3.append(" tagType=");
                                stringBuilder3.append(b3);
                                stringBuilder3.append(" formatCode=");
                                stringBuilder3.append(b4);
                                stringBuilder3.append(" componentCount=");
                                stringBuilder3.append(a3);
                                Log.d("DfltImageHeaderParser", stringBuilder3.toString());
                            }
                            a3 += f14553b[b4];
                            if (a3 <= 4) {
                                a2 += 8;
                                if (a2 >= 0) {
                                    if (a2 <= c1282b.m5170a()) {
                                        if (a3 >= 0) {
                                            if (a3 + a2 <= c1282b.m5170a()) {
                                                return c1282b.m5173b(a2);
                                            }
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            StringBuilder stringBuilder4 = new StringBuilder();
                                            stringBuilder4.append("Illegal number of bytes for TI tag data tagType=");
                                            stringBuilder4.append(b3);
                                            Log.d("DfltImageHeaderParser", stringBuilder4.toString());
                                        }
                                    }
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder stringBuilder5 = new StringBuilder();
                                    stringBuilder5.append("Illegal tagValueOffset=");
                                    stringBuilder5.append(a2);
                                    stringBuilder5.append(" tagType=");
                                    stringBuilder5.append(b3);
                                    Log.d("DfltImageHeaderParser", stringBuilder5.toString());
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Got byte count > 4, not orientation, continuing, formatCode=");
                                stringBuilder2.append(b4);
                                Log.d("DfltImageHeaderParser", stringBuilder2.toString());
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Got invalid format code = ");
                    stringBuilder2.append(b4);
                    Log.d("DfltImageHeaderParser", stringBuilder2.toString());
                }
            }
        }
        return -1;
    }
}
