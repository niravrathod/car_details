package kotlin.jvm;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.C4332c;
import kotlin.p152c.C4326b;

/* renamed from: kotlin.jvm.a */
public final class C2880a {
    /* renamed from: a */
    public static final <T> Class<T> m13898a(C4326b<T> c4326b) {
        C2885g.m13910b(c4326b, "$receiver");
        c4326b = ((C4332c) c4326b).mo4540a();
        if (c4326b.isPrimitive()) {
            String name = c4326b.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            c4326b = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            c4326b = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            c4326b = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            c4326b = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            c4326b = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            c4326b = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            c4326b = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            c4326b = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            c4326b = Short.class;
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (c4326b != null) {
                return c4326b;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (c4326b != null) {
            return c4326b;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }
}
