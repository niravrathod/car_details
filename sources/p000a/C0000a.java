package p000a;

import android.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: a.a */
public class C0000a {
    /* renamed from: a */
    public static String m0a(String str, String str2) {
        try {
            Key secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            str2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
            str2.init(1, secretKeySpec);
            str = str2.doFinal(str.getBytes());
        } catch (String str3) {
            System.out.println(str3.toString());
            str3 = null;
        }
        return new String(Base64.encodeToString(str3, 2));
    }
}
