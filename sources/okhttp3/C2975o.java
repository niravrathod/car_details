package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: okhttp3.o */
public interface C2975o {
    /* renamed from: a */
    public static final C2975o f12591a = new C43821();

    /* renamed from: okhttp3.o$1 */
    class C43821 implements C2975o {
        C43821() {
        }

        /* renamed from: a */
        public List<InetAddress> mo3677a(String str) {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Broken system behaviour for dns lookup of ");
                    stringBuilder.append(str);
                    UnknownHostException unknownHostException = new UnknownHostException(stringBuilder.toString());
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
            throw new UnknownHostException("hostname == null");
        }
    }

    /* renamed from: a */
    List<InetAddress> mo3677a(String str);
}
