package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ah {
    /* renamed from: a */
    public final Map<String, Object> f994a = new HashMap();
    /* renamed from: b */
    public View f995b;
    /* renamed from: c */
    final ArrayList<Transition> f996c = new ArrayList();

    public boolean equals(Object obj) {
        if (obj instanceof ah) {
            ah ahVar = (ah) obj;
            if (this.f995b == ahVar.f995b && this.f994a.equals(ahVar.f994a) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        return (this.f995b.hashCode() * 31) + this.f994a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionValues@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(":\n");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    view = ");
        stringBuilder3.append(this.f995b);
        stringBuilder3.append("\n");
        stringBuilder2 = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    values:");
        stringBuilder2 = stringBuilder3.toString();
        for (String str : this.f994a.keySet()) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append("    ");
            stringBuilder4.append(str);
            stringBuilder4.append(": ");
            stringBuilder4.append(this.f994a.get(str));
            stringBuilder4.append("\n");
            stringBuilder2 = stringBuilder4.toString();
        }
        return stringBuilder2;
    }
}
