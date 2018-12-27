package com.google.android.gms.internal.ads;

final class mz {
    /* renamed from: a */
    static String m9183a(zzbbu zzbbu) {
        nb naVar = new na(zzbbu);
        zzbbu = new StringBuilder(naVar.mo2125a());
        for (int i = 0; i < naVar.mo2125a(); i++) {
            byte a = naVar.mo2124a(i);
            if (a == (byte) 34) {
                zzbbu.append("\\\"");
            } else if (a == (byte) 39) {
                zzbbu.append("\\'");
            } else if (a != (byte) 92) {
                switch (a) {
                    case (byte) 7:
                        zzbbu.append("\\a");
                        break;
                    case (byte) 8:
                        zzbbu.append("\\b");
                        break;
                    case (byte) 9:
                        zzbbu.append("\\t");
                        break;
                    case (byte) 10:
                        zzbbu.append("\\n");
                        break;
                    case (byte) 11:
                        zzbbu.append("\\v");
                        break;
                    case (byte) 12:
                        zzbbu.append("\\f");
                        break;
                    case (byte) 13:
                        zzbbu.append("\\r");
                        break;
                    default:
                        if (a >= (byte) 32 && a <= (byte) 126) {
                            zzbbu.append((char) a);
                            break;
                        }
                        zzbbu.append('\\');
                        zzbbu.append((char) (((a >>> 6) & 3) + 48));
                        zzbbu.append((char) (((a >>> 3) & 7) + 48));
                        zzbbu.append((char) ((a & 7) + 48));
                        break;
                }
            } else {
                zzbbu.append("\\\\");
            }
        }
        return zzbbu.toString();
    }
}
