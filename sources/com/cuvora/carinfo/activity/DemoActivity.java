package com.cuvora.carinfo.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.DlTemplateModel;
import com.cuvora.carinfo.views.DlScraperView;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

public final class DemoActivity extends AppCompatActivity {
    /* renamed from: n */
    private final String f21843n = C1541e.m5852a("js_remove_t_and_c");
    /* renamed from: o */
    private DlTemplateModel f21844o;
    /* renamed from: p */
    private String f21845p;
    /* renamed from: q */
    private String f21846q;
    /* renamed from: r */
    private String f21847r;
    /* renamed from: s */
    private HashMap f21848s;

    /* renamed from: c */
    public View m30091c(int i) {
        if (this.f21848s == null) {
            this.f21848s = new HashMap();
        }
        View view = (View) this.f21848s.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21848s.put(Integer.valueOf(i), view);
        return view;
    }

    public DemoActivity() {
        Object f = C1570t.m6018f();
        C2885g.m13907a(f, "Utils.getDlTemplateModel()");
        this.f21844o = f;
        this.f21845p = "";
        this.f21846q = "";
        this.f21847r = "";
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_demo);
        m30090l();
        ((DlScraperView) m30091c(C1487a.sc)).m6312a("", "");
    }

    /* renamed from: l */
    private final void m30090l() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript: (function(){document.getElementById('");
        stringBuilder.append(this.f21844o.getDlFieldIdentifier());
        stringBuilder.append("').value = '");
        stringBuilder.append("DL0420100115183");
        stringBuilder.append("';");
        stringBuilder.append("document.getElementById('");
        stringBuilder.append(this.f21844o.getDlDobIdentifier());
        stringBuilder.append("').value = '");
        stringBuilder.append("1991-10-06");
        stringBuilder.append("';");
        stringBuilder.append("})()");
        this.f21845p = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("javascript: $(\"button\").each(function(){  if($(this).text() && $(this).text().toLowerCase() == \"");
        stringBuilder.append(this.f21844o.getDlSubmitIdentifier());
        stringBuilder.append("\"){");
        stringBuilder.append("      $(this).click();");
        stringBuilder.append("  }");
        stringBuilder.append("});");
        this.f21846q = stringBuilder.toString();
        this.f21847r = "javascript:window.HTML_OUT.showHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');";
    }
}
