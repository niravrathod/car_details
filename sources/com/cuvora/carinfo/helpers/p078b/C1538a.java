package com.cuvora.carinfo.helpers.p078b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.C4455c;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1570t;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.cuvora.carinfo.helpers.b.a */
public class C1538a {

    /* renamed from: com.cuvora.carinfo.helpers.b.a$a */
    public interface C1537a {
        /* renamed from: a */
        void mo1183a();

        /* renamed from: b */
        void mo1184b();

        /* renamed from: c */
        void mo1185c();

        /* renamed from: d */
        void mo1186d();
    }

    /* renamed from: a */
    public static void m5802a(final Activity activity, final C1537a c1537a) {
        if (!activity.isFinishing()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
            defaultSharedPreferences.edit().putInt("KEY_RATING_POPUP_COUNT", defaultSharedPreferences.getInt("KEY_RATING_POPUP_COUNT", -1) + 1).apply();
            if (defaultSharedPreferences.getInt("KEY_RATING_POPUP_COUNT", 0) % 3 == 0) {
                if (defaultSharedPreferences.getInt("KEY_RATING_POPUP_COUNT", 0) <= 10) {
                    View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_rating_popup, null, false);
                    final C4455c b = new C0661a(activity).m2642b(inflate).m2641a(true).m2645b();
                    b.getWindow().setBackgroundDrawableResource(17170445);
                    b.show();
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.rl_rating_yes);
                    LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.rl_rating_no);
                    AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.tv_text1);
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) inflate.findViewById(R.id.tv_text2);
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) inflate.findViewById(R.id.tv_text3);
                    try {
                        JSONArray e = C1541e.m5858e("ratingPopupTexts");
                        appCompatTextView.setText(e.getString(0));
                        appCompatTextView2.setText(e.getString(1));
                        appCompatTextView3.setText(e.getString(2));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    linearLayout.setOnClickListener(new OnClickListener() {
                        public void onClick(View view) {
                            C1570t.m6035t(activity);
                            C1540d.m5814a(true);
                            b.dismiss();
                            c1537a.mo1183a();
                        }
                    });
                    linearLayout2.setOnClickListener(new OnClickListener() {
                        public void onClick(View view) {
                            C1540d.m5814a((boolean) null);
                            b.dismiss();
                            c1537a.mo1184b();
                        }
                    });
                    b.setOnDismissListener(new OnDismissListener() {
                        public void onDismiss(DialogInterface dialogInterface) {
                            c1537a.mo1186d();
                        }
                    });
                    return;
                }
            }
            c1537a.mo1185c();
        }
    }
}
