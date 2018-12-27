package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: androidx.navigation.e */
class C0895e {
    /* renamed from: a */
    private static final Pattern f3047a = Pattern.compile("^(\\w+-)*\\w+:");
    /* renamed from: b */
    private final ArrayList<String> f3048b = new ArrayList();
    /* renamed from: c */
    private final Pattern f3049c;

    C0895e(String str) {
        StringBuffer stringBuffer = new StringBuffer("^");
        if (!f3047a.matcher(str).find()) {
            stringBuffer.append("http[s]?://");
        }
        str = Pattern.compile("\\{(.+?)\\}").matcher(str);
        while (str.find()) {
            this.f3048b.add(str.group(1));
            str.appendReplacement(stringBuffer, "");
            stringBuffer.append("(.+?)");
        }
        str.appendTail(stringBuffer);
        this.f3049c = Pattern.compile(stringBuffer.toString());
    }

    /* renamed from: a */
    Bundle m3906a(Uri uri) {
        uri = this.f3049c.matcher(uri.toString());
        if (!uri.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f3048b.size();
        int i = 0;
        while (i < size) {
            i++;
            bundle.putString((String) this.f3048b.get(i), Uri.decode(uri.group(i)));
        }
        return bundle;
    }
}
