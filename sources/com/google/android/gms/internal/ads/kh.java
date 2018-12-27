package com.google.android.gms.internal.ads;

final class kh {
    /* renamed from: a */
    static int m8965a(byte[] bArr, int i, ki kiVar) {
        int i2 = i + 1;
        i = bArr[i];
        if (i < 0) {
            return m8963a(i, bArr, i2, kiVar);
        }
        kiVar.f8206a = i;
        return i2;
    }

    /* renamed from: a */
    static int m8963a(int i, byte[] bArr, int i2, ki kiVar) {
        i &= 127;
        int i3 = i2 + 1;
        i2 = bArr[i2];
        if (i2 >= 0) {
            kiVar.f8206a = i | (i2 << 7);
            return i3;
        }
        i |= (i2 & 127) << 7;
        i2 = i3 + 1;
        byte b = bArr[i3];
        if (b >= (byte) 0) {
            kiVar.f8206a = i | (b << 14);
            return i2;
        }
        i |= (b & 127) << 14;
        i3 = i2 + 1;
        i2 = bArr[i2];
        if (i2 >= 0) {
            kiVar.f8206a = i | (i2 << 21);
            return i3;
        }
        i |= (i2 & 127) << 21;
        i2 = i3 + 1;
        b = bArr[i3];
        if (b >= (byte) 0) {
            kiVar.f8206a = i | (b << 28);
            return i2;
        }
        i |= (b & 127) << 28;
        while (true) {
            i3 = i2 + 1;
            if (bArr[i2] >= 0) {
                kiVar.f8206a = i;
                return i3;
            }
            i2 = i3;
        }
    }

    /* renamed from: b */
    static int m8967b(byte[] bArr, int i, ki kiVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            kiVar.f8207b = j;
            return i2;
        }
        j &= 127;
        i = i2 + 1;
        byte b = bArr[i2];
        long j2 = j | (((long) (b & 127)) << 7);
        int i3 = 7;
        while (b < (byte) 0) {
            i2 = i + 1;
            byte b2 = bArr[i];
            i3 += 7;
            j2 |= ((long) (b2 & 127)) << i3;
            int i4 = i2;
            b = b2;
            i = i4;
        }
        kiVar.f8207b = j2;
        return i;
    }

    /* renamed from: a */
    static int m8964a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    /* renamed from: b */
    static long m8968b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    /* renamed from: c */
    static double m8969c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m8968b(bArr, i));
    }

    /* renamed from: d */
    static float m8971d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m8964a(bArr, i));
    }

    /* renamed from: c */
    static int m8970c(byte[] bArr, int i, ki kiVar) {
        i = m8965a(bArr, i, kiVar);
        int i2 = kiVar.f8206a;
        if (i2 < 0) {
            throw zzbdl.m10341b();
        } else if (i2 == 0) {
            kiVar.f8208c = "";
            return i;
        } else {
            kiVar.f8208c = new String(bArr, i, i2, zzbdf.f9180a);
            return i + i2;
        }
    }

    /* renamed from: d */
    static int m8972d(byte[] bArr, int i, ki kiVar) {
        i = m8965a(bArr, i, kiVar);
        int i2 = kiVar.f8206a;
        if (i2 < 0) {
            throw zzbdl.m10341b();
        } else if (i2 == 0) {
            kiVar.f8208c = "";
            return i;
        } else {
            kiVar.f8208c = ni.m9275b(bArr, i, i2);
            return i + i2;
        }
    }

    /* renamed from: e */
    static int m8973e(byte[] bArr, int i, ki kiVar) {
        i = m8965a(bArr, i, kiVar);
        int i2 = kiVar.f8206a;
        if (i2 < 0) {
            throw zzbdl.m10341b();
        } else if (i2 > bArr.length - i) {
            throw zzbdl.m10340a();
        } else if (i2 == 0) {
            kiVar.f8208c = zzbbu.f9094a;
            return i;
        } else {
            kiVar.f8208c = zzbbu.m10261a(bArr, i, i2);
            return i + i2;
        }
    }

    /* renamed from: a */
    static int m8961a(int i, byte[] bArr, int i2, int i3, zzbdk<?> zzbdk, ki kiVar) {
        lh lhVar = (lh) zzbdk;
        i2 = m8965a(bArr, i2, kiVar);
        lhVar.m26080c(kiVar.f8206a);
        while (i2 < i3) {
            int a = m8965a(bArr, i2, kiVar);
            if (i != kiVar.f8206a) {
                break;
            }
            i2 = m8965a(bArr, a, kiVar);
            lhVar.m26080c(kiVar.f8206a);
        }
        return i2;
    }

    /* renamed from: a */
    static int m8966a(byte[] bArr, int i, zzbdk<?> zzbdk, ki kiVar) {
        lh lhVar = (lh) zzbdk;
        i = m8965a(bArr, i, kiVar);
        int i2 = kiVar.f8206a + i;
        while (i < i2) {
            i = m8965a(bArr, i, kiVar);
            lhVar.m26080c(kiVar.f8206a);
        }
        if (i == i2) {
            return i;
        }
        throw zzbdl.m10340a();
    }

    /* renamed from: a */
    static int m8962a(int i, byte[] bArr, int i2, int i3, zzbfv zzbfv, ki kiVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 5) {
                switch (i4) {
                    case 0:
                        bArr = m8967b(bArr, i2, kiVar);
                        zzbfv.m10376a(i, Long.valueOf(kiVar.f8207b));
                        return bArr;
                    case 1:
                        zzbfv.m10376a(i, Long.valueOf(m8968b(bArr, i2)));
                        return i2 + 8;
                    case 2:
                        i2 = m8965a(bArr, i2, kiVar);
                        i3 = kiVar.f8206a;
                        if (i3 < 0) {
                            throw zzbdl.m10341b();
                        } else if (i3 <= bArr.length - i2) {
                            if (i3 == 0) {
                                zzbfv.m10376a(i, zzbbu.f9094a);
                            } else {
                                zzbfv.m10376a(i, zzbbu.m10261a(bArr, i2, i3));
                            }
                            return i2 + i3;
                        } else {
                            throw zzbdl.m10340a();
                        }
                    case 3:
                        Object b = zzbfv.m10375b();
                        int i5 = (i & -8) | 4;
                        i4 = 0;
                        while (i2 < i3) {
                            int a = m8965a(bArr, i2, kiVar);
                            i2 = kiVar.f8206a;
                            if (i2 != i5) {
                                i4 = i2;
                                i2 = m8962a(i2, bArr, a, i3, (zzbfv) b, kiVar);
                            } else {
                                i4 = i2;
                                i2 = a;
                                if (i2 <= i3 || r0 != i5) {
                                    throw zzbdl.m10347h();
                                }
                                zzbfv.m10376a(i, b);
                                return i2;
                            }
                        }
                        if (i2 <= i3) {
                        }
                        throw zzbdl.m10347h();
                    default:
                        throw zzbdl.m10343d();
                }
            }
            zzbfv.m10376a(i, Integer.valueOf(m8964a(bArr, i2)));
            return i2 + 4;
        }
        throw zzbdl.m10343d();
    }

    /* renamed from: a */
    static int m8960a(int i, byte[] bArr, int i2, int i3, ki kiVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 5) {
                return i2 + 4;
            }
            switch (i4) {
                case 0:
                    return m8967b(bArr, i2, kiVar);
                case 1:
                    return i2 + 8;
                case 2:
                    return m8965a(bArr, i2, kiVar) + kiVar.f8206a;
                case 3:
                    i = (i & -8) | 4;
                    i4 = 0;
                    while (i2 < i3) {
                        i2 = m8965a(bArr, i2, kiVar);
                        i4 = kiVar.f8206a;
                        if (i4 != i) {
                            i2 = m8960a(i4, bArr, i2, i3, kiVar);
                        } else if (i2 > i3 && r0 == i) {
                            return i2;
                        } else {
                            throw zzbdl.m10347h();
                        }
                    }
                    if (i2 > i3) {
                    }
                    throw zzbdl.m10347h();
                default:
                    throw zzbdl.m10343d();
            }
        }
        throw zzbdl.m10343d();
    }
}
