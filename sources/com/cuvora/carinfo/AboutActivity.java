package com.cuvora.carinfo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.cuvora.carinfo.fragment.C4802f;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;

public class AboutActivity extends AppCompatActivity {
    /* renamed from: n */
    public static final String f21695n = "AboutActivity";
    /* renamed from: o */
    private WebView f21696o;
    /* renamed from: p */
    private TextView f21697p;
    /* renamed from: q */
    private TextView f21698q;
    /* renamed from: r */
    private ImageView f21699r;
    /* renamed from: s */
    private int f21700s = 0;
    /* renamed from: t */
    private int f21701t = 0;

    /* renamed from: com.cuvora.carinfo.AboutActivity$1 */
    class C14071 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AboutActivity f4374a;

        C14071(AboutActivity aboutActivity) {
            this.f4374a = aboutActivity;
        }

        public void onClick(View view) {
            this.f4374a.f21701t = this.f4374a.f21701t + 1;
            if (this.f4374a.f21701t == 5) {
                this.f4374a.f21701t = 0;
                C4802f.m27786a().show(this.f4374a.m28707f(), "Internal Settings");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_about);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        mo4973h().mo538b(true);
        m29888n();
        m29886l();
        this.f21698q.setMovementMethod(LinkMovementMethod.getInstance());
        this.f21698q.setText(Html.fromHtml("<a href=\"https://cuvora.com/terms-and-conditions.html\">Terms and Conditions</a>"));
        bundle = this.f21697p;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Version ");
        stringBuilder.append(C1570t.m6004c((Context) this));
        bundle.setText(stringBuilder.toString());
        bundle = new StringBuilder();
        bundle.append("<html><body><p align=\"justify\">");
        bundle.append(C1541e.m5852a("aboutText"));
        bundle.append("</p> </body></html>");
        this.f21696o.loadData(bundle.toString(), "text/html", "utf-8");
        m29887m();
    }

    /* renamed from: l */
    private void m29886l() {
        this.f21697p.setOnClickListener(new C14071(this));
    }

    protected void onPause() {
        super.onPause();
        this.f21701t = 0;
    }

    /* renamed from: m */
    private void m29887m() {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f21699r.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ AboutActivity f4380c;

            /* renamed from: com.cuvora.carinfo.AboutActivity$2$2 */
            class C14092 implements DialogInterface.OnClickListener {
                /* renamed from: a */
                final /* synthetic */ C14102 f4377a;

                C14092(C14102 c14102) {
                    this.f4377a = c14102;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (this != 0 && this.isFinishing() == 0) {
                        defaultSharedPreferences.edit().remove("KEY_PREFIX").commit();
                        dialogInterface.dismiss();
                    }
                }
            }

            public void onClick(View view) {
                this.f4380c.f21700s = this.f4380c.f21700s + 1;
                if (this.f4380c.f21700s >= 4) {
                    this.f4380c.f21700s = 0;
                    view = new C0661a(this.f4380c);
                    final View editText = new EditText(this.f4380c);
                    view.m2642b(editText);
                    String string = defaultSharedPreferences.getString("KEY_PREFIX", "prod");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Currently used: ");
                    stringBuilder.append(string);
                    view.m2639a(stringBuilder.toString());
                    view.m2640a((CharSequence) "OK", new DialogInterface.OnClickListener(this) {
                        /* renamed from: b */
                        final /* synthetic */ C14102 f4376b;

                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (this != 0 && this.isFinishing() == 0 && C1562q.m5946a(editText.getText().toString()) != 0) {
                                defaultSharedPreferences.edit().putString("KEY_PREFIX", editText.getText().toString()).commit();
                                dialogInterface.dismiss();
                            }
                        }
                    });
                    view.m2644b("PROD", new C14092(this));
                    view.m2641a(true);
                    view.m2645b().show();
                }
            }
        });
    }

    /* renamed from: n */
    private void m29888n() {
        this.f21696o = (WebView) findViewById(R.id.wv_about);
        this.f21698q = (TextView) findViewById(R.id.tv_tnc);
        this.f21697p = (TextView) findViewById(R.id.tv_version);
        this.f21699r = (ImageView) findViewById(R.id.iv_logo_text);
    }
}
