package p000a;

import java.security.MessageDigest;

/* renamed from: a.f */
public class C0005f {
    /* renamed from: a */
    public static String m8a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            str = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : str) {
                String toHexString = Integer.toHexString(b & 255);
                while (toHexString.length() < 2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("0");
                    stringBuilder.append(toHexString);
                    toHexString = stringBuilder.toString();
                }
                stringBuffer.append(toHexString);
            }
            return stringBuffer.toString();
        } catch (String str2) {
            str2.printStackTrace();
            return "";
        }
    }
}
