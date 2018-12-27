package com.cuvora.carinfo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.cuvora.carinfo.fragment.C4552m;
import com.cuvora.carinfo.fragment.C4552m.C1518b;
import com.cuvora.carinfo.models.homepage.City;

public class SelectStateCityActivity extends AppCompatActivity implements C1518b {
    /* renamed from: n */
    private static C1434a f21826n;
    /* renamed from: o */
    private Toolbar f21827o;

    /* renamed from: com.cuvora.carinfo.SelectStateCityActivity$a */
    public interface C1434a {
        /* renamed from: a */
        void mo3928a(City city);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activit_select_state_city);
        this.f21827o = (Toolbar) findViewById(R.id.toolbar);
        this.f21827o.setTitle((CharSequence) "Select Your City");
        m29816a((Toolbar) this.f21827o);
        if (mo4973h() != null) {
            mo4973h().mo538b(true);
        }
        FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.frame_layout, null).findViewById(R.id.fl_fragment);
        Fragment a = C4552m.m25070a();
        a.m25079a((C1518b) this);
        m28707f().mo292a().mo269a(frameLayout.getId(), a, C4552m.f18878b).mo280d();
    }

    /* renamed from: a */
    public void mo5025a(City city) {
        if (f21826n != null) {
            f21826n.mo3928a(city);
            onBackPressed();
        }
    }

    /* renamed from: a */
    public static void m30066a(C1434a c1434a) {
        f21826n = c1434a;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
