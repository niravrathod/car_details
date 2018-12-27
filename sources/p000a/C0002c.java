package p000a;

import android.util.Base64;
import com.cuvora.carinfo.helpers.C1541e;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: a.c */
public class C0002c {
    /* renamed from: a */
    public static C0004e m1a(String str) {
        String format = new SimpleDateFormat(C0001b.f6g).format(new Date());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C0000a.m0a(C1541e.m5852a("MPaivahanSalt"), C1541e.m5852a("MParivahanSecretKey")));
        stringBuilder.append(C0005f.m8a(format));
        String a = C0005f.m8a(stringBuilder.toString());
        format = C0000a.m0a(format, C1541e.m5852a("MParivahanSecretKey"));
        C0004e c0004e = new C0004e();
        c0004e.m6a(C0003d.m3a(str, C0005f.m8a(format)));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(a);
        stringBuilder2.append(":");
        stringBuilder2.append(format);
        stringBuilder2.append(":");
        stringBuilder2.append(C0000a.m0a(C0005f.m8a(str), C1541e.m5852a("MParivahanSecretKey")));
        int i = 0;
        str = "";
        String[] split = new String(Base64.encode(stringBuilder2.toString().getBytes(), 0)).split("\\s+");
        int length = split.length;
        while (i < length) {
            String str2 = split[i];
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(str2);
            str = stringBuilder3.toString();
            i++;
        }
        c0004e.m5a(str);
        return c0004e;
    }

    /* renamed from: b */
    public static String m2b(String str) {
        try {
            return new JSONObject(str).getString("result");
        } catch (String str2) {
            str2.printStackTrace();
            return null;
        }
    }
}
