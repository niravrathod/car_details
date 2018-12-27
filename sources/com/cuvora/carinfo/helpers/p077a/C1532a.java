package com.cuvora.carinfo.helpers.p077a;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.unomer.sdk.C2690a;
import com.unomer.sdk.C2691b;

/* renamed from: com.cuvora.carinfo.helpers.a.a */
public class C1532a {
    /* renamed from: a */
    private static C2690a f4654a;

    /* renamed from: com.cuvora.carinfo.helpers.a.a$1 */
    static class C15311 implements OnClickListener {
        C15311() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static C2690a m5780a(Activity activity, C2691b c2691b) {
        if (f4654a == null) {
            f4654a = new C2690a(activity, "0gdH2paZln721Dxy3xPxFw==", "wDjc8tA6o1pYQgGvl3sSZKhzWm5uIk", c2691b);
            f4654a.m12999a();
        }
        return f4654a;
    }

    /* renamed from: a */
    public static void m5781a(Activity activity, String str, String str2) {
        new Builder(activity).setCancelable(true).setMessage(str2).setTitle(str).setPositiveButton("OK", new C15311()).show();
    }
}
