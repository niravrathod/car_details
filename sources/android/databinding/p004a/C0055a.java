package android.databinding.p004a;

import android.text.Spanned;
import android.widget.TextView;

/* renamed from: android.databinding.a.a */
public class C0055a {
    /* renamed from: a */
    public static void m117a(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else if (!C0055a.m118a(charSequence, text)) {
                    return;
                }
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    private static boolean m118a(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null ? 1 : null) != (charSequence2 == null ? 1 : null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
