package com.cuvora.carinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.cuvora.carinfo.fragment.C4549b;
import com.cuvora.carinfo.fragment.C4804h;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.models.homepage.TabContent;
import com.cuvora.carinfo.models.homepage.TabTypeEnum;

public class MyGarageActivity extends AppCompatActivity {
    /* renamed from: n */
    private Toolbar f21763n;
    /* renamed from: o */
    private C4804h f21764o;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1540d.m5805a();
        setContentView((int) R.layout.layout_my_garage);
        bundle = new TabContent();
        bundle.setType(TabTypeEnum.GARAGE);
        bundle.setShowBanner(false);
        Bundle bundle2 = new Bundle();
        String str = "key_mode";
        int i = 2;
        if (getIntent() != null) {
            i = getIntent().getIntExtra("key_mode", 2);
        }
        bundle2.putInt(str, i);
        this.f21764o = (C4804h) C4549b.f18870a.m5736a(bundle, bundle2);
        m28707f().mo292a().mo269a(R.id.frame, this.f21764o, "MyGarageFragment").mo283f();
        this.f21763n = (Toolbar) findViewById(R.id.toolbar);
        m29816a((Toolbar) this.f21763n);
        if (mo4973h() != null) {
            mo4973h().mo538b(true);
        }
    }

    /* renamed from: a */
    public void m29992a(String str) {
        if (mo4973h() != null) {
            mo4973h().mo531a((CharSequence) str);
        }
    }

    public void onBackPressed() {
        if (!this.f21764o.mo4632d()) {
            super.onBackPressed();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
