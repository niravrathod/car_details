package com.google.android.gms.internal.measurement;

final class di {
    /* renamed from: a */
    static String m11704a(zzud zzud) {
        dk djVar = new dj(zzud);
        zzud = new StringBuilder(djVar.mo3079a());
        for (int i = 0; i < djVar.mo3079a(); i++) {
            byte a = djVar.mo3078a(i);
            if (a == (byte) 34) {
                zzud.append("\\\"");
            } else if (a == (byte) 39) {
                zzud.append("\\'");
            } else if (a != (byte) 92) {
                switch (a) {
                    case (byte) 7:
                        zzud.append("\\a");
                        break;
                    case (byte) 8:
                        zzud.append("\\b");
                        break;
                    case (byte) 9:
                        zzud.append("\\t");
                        break;
                    case (byte) 10:
                        zzud.append("\\n");
                        break;
                    case (byte) 11:
                        zzud.append("\\v");
                        break;
                    case (byte) 12:
                        zzud.append("\\f");
                        break;
                    case (byte) 13:
                        zzud.append("\\r");
                        break;
                    default:
                        if (a >= (byte) 32 && a <= (byte) 126) {
                            zzud.append((char) a);
                            break;
                        }
                        zzud.append('\\');
                        zzud.append((char) (((a >>> 6) & 3) + 48));
                        zzud.append((char) (((a >>> 3) & 7) + 48));
                        zzud.append((char) ((a & 7) + 48));
                        break;
                }
            } else {
                zzud.append("\\\\");
            }
        }
        return zzud.toString();
    }
}
