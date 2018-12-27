package com.cuvora.carinfo.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout.C0176b;
import android.support.design.widget.TabLayout.C0181e;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v4.view.C0555o;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.C0576c;
import android.support.v7.app.C3199a;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cuvora.carinfo.AboutActivity;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.ExitAppSupportActivity;
import com.cuvora.carinfo.MyGarageActivity;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.fragment.C4549b;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1550l;
import com.cuvora.carinfo.helpers.C1561p;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.p078b.C1538a;
import com.cuvora.carinfo.helpers.p078b.C1538a.C1537a;
import com.cuvora.carinfo.loaders.C4569l;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.homepage.HomeTabData;
import com.cuvora.carinfo.models.homepage.TabContent;
import com.cuvora.carinfo.p069a.C4534o;
import com.cuvora.carinfo.p071d.C1473c;
import com.cuvora.carinfo.views.AsyncImageView;
import com.cuvora.carinfo.views.MyTabLayout;
import com.cuvora.carinfo.views.NonSwipeableViewPager;
import com.google.android.gms.ads.InterstitialAd;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

public final class HomePageActivity extends InterstitialActivity {
    /* renamed from: n */
    private ProgressDialog f21899n;
    /* renamed from: o */
    private final int f21900o = 100;
    /* renamed from: p */
    private InterstitialAd f21901p;
    /* renamed from: q */
    private HomeTabData f21902q;
    /* renamed from: r */
    private boolean f21903r;
    /* renamed from: s */
    private final C3653f f21904s = new C3653f(this);
    /* renamed from: t */
    private OnClickListener f21905t = new C1461c(this);
    /* renamed from: u */
    private final C3650a f21906u = new C3650a(this);
    /* renamed from: v */
    private HashMap f21907v;

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$b */
    static final class C1460b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomePageActivity f4446a;

        C1460b(HomePageActivity homePageActivity) {
            this.f4446a = homePageActivity;
        }

        public final void onClick(View view) {
            this.f4446a.startActivity(new Intent(this.f4446a, AboutActivity.class));
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$c */
    static final class C1461c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomePageActivity f4447a;

        C1461c(HomePageActivity homePageActivity) {
            this.f4447a = homePageActivity;
        }

        public final void onClick(View view) {
            C2885g.m13907a((Object) view, "v");
            view = view.getId();
            if (view == R.id.menu_garage) {
                this.f4447a.startActivity(new Intent(this.f4447a, MyGarageActivity.class));
            } else if (view == R.id.menu_rate) {
                C1540d.m5839l();
                C1570t.m5997b((Context) this.f4447a, this.f4447a.getPackageName());
            } else if (view == R.id.menu_feedback) {
                C1540d.m5835j();
                C1570t.m6012d((Context) this.f4447a, this.f4447a.getResources().getString(R.string.feedback_carinfo));
            } else if (view == R.id.menu_about) {
                C1540d.m5837k();
                this.f4447a.startActivity(new Intent(this.f4447a, AboutActivity.class));
            } else if (view == R.id.menu_share) {
                C1561p.m5939a((Context) this.f4447a);
            }
            ((DrawerLayout) this.f4447a.mo5038c(C1487a.drawerLayout)).m2302f(8388611);
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$g */
    static final class C1462g implements DialogInterface.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomePageActivity f4448a;

        C1462g(HomePageActivity homePageActivity) {
            this.f4448a = homePageActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f4448a.m30176r();
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$h */
    static final class C1463h implements OnCancelListener {
        /* renamed from: a */
        final /* synthetic */ HomePageActivity f4449a;

        C1463h(HomePageActivity homePageActivity) {
            this.f4449a = homePageActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f4449a.finish();
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$i */
    static final class C1464i implements DialogInterface.OnClickListener {
        /* renamed from: a */
        public static final C1464i f4450a = new C1464i();

        C1464i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$a */
    public static final class C3650a implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ HomePageActivity f14869a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
            C2885g.m13910b(c0392c, "loader");
        }

        C3650a(HomePageActivity homePageActivity) {
            this.f14869a = homePageActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            return (C0392c) new C4569l((Context) this.f14869a);
        }

        /* renamed from: a */
        public void m18419a(C0392c<Response> c0392c, Response response) {
            C2885g.m13910b(c0392c, "loader");
            this.f14869a.m30174p();
            if ((response instanceof HomeTabData) != null) {
                if (this.f14869a.f21902q == null) {
                    this.f14869a.f21902q = (HomeTabData) response;
                    this.f14869a.m30178t();
                }
            } else if (this.f14869a.f21902q == null) {
                HomePageActivity homePageActivity = this.f14869a;
                String string = this.f14869a.getString(R.string.homepage_data_error_msg);
                C2885g.m13907a((Object) string, "getString(R.string.homepage_data_error_msg)");
                homePageActivity.m30167b(string);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$d */
    static final class C3652d<T> implements C1473c<Boolean> {
        /* renamed from: a */
        final /* synthetic */ HomePageActivity f14871a;

        C3652d(HomePageActivity homePageActivity) {
            this.f14871a = homePageActivity;
        }

        /* renamed from: a */
        public final void m18425a(Boolean bool) {
            if (bool == null) {
                C2885g.m13906a();
            }
            if (bool.booleanValue() != null) {
                this.f14871a.f21903r = true;
                this.f14871a.m30175q();
            } else if (this.f14871a.f21903r == null) {
                C1538a.m5802a((Activity) this.f14871a, new C1537a() {
                    /* renamed from: a */
                    public void mo1183a() {
                        this.f14871a.finish();
                    }

                    /* renamed from: b */
                    public void mo1184b() {
                        this.f14871a.m30175q();
                    }

                    /* renamed from: c */
                    public void mo1185c() {
                        super.onBackPressed();
                    }

                    /* renamed from: d */
                    public void mo1186d() {
                        this.f14871a.finish();
                    }
                });
                this.f14871a.f21903r = true;
            } else {
                super.onBackPressed();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$f */
    public static final class C3653f implements C0176b {
        /* renamed from: a */
        final /* synthetic */ HomePageActivity f14872a;

        /* renamed from: c */
        public void mo142c(C0181e c0181e) {
            C2885g.m13910b(c0181e, "tab");
        }

        C3653f(HomePageActivity homePageActivity) {
            this.f14872a = homePageActivity;
        }

        /* renamed from: b */
        public void mo141b(C0181e c0181e) {
            C2885g.m13910b(c0181e, "tab");
            HomeTabData e = this.f14872a.f21902q;
            if (e != null) {
                View a = c0181e.m615a();
                if (a != null) {
                    AsyncImageView asyncImageView = (AsyncImageView) a.findViewById(R.id.ivTab);
                    if (asyncImageView != null) {
                        Object obj = e.getTabContents().get(c0181e.m619c());
                        C2885g.m13907a(obj, "it.tabContents[tab.position]");
                        asyncImageView.setImageUrl(((TabContent) obj).getIcon());
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo140a(C0181e c0181e) {
            String tabName;
            View a;
            AsyncImageView asyncImageView;
            C2885g.m13910b(c0181e, "tab");
            HomeTabData e = this.f14872a.f21902q;
            if (e != null) {
                List tabContents = e.getTabContents();
                if (tabContents != null) {
                    TabContent tabContent = (TabContent) tabContents.get(c0181e.m619c());
                    if (tabContent != null) {
                        tabName = tabContent.getTabName();
                        if (tabName != null) {
                            C1540d.m5838k(tabName);
                            ((NonSwipeableViewPager) this.f14872a.mo5038c(C1487a.pager)).setCurrentItem(c0181e.m619c(), false);
                            e = this.f14872a.f21902q;
                            if (e != null) {
                                a = c0181e.m615a();
                                if (a != null) {
                                    asyncImageView = (AsyncImageView) a.findViewById(R.id.ivTab);
                                    if (asyncImageView != null) {
                                        Object obj = e.getTabContents().get(c0181e.m619c());
                                        C2885g.m13907a(obj, "it.tabContents[tab.position]");
                                        asyncImageView.setImageUrl(((TabContent) obj).getSelectedIcon());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            tabName = "";
            C1540d.m5838k(tabName);
            ((NonSwipeableViewPager) this.f14872a.mo5038c(C1487a.pager)).setCurrentItem(c0181e.m619c(), false);
            e = this.f14872a.f21902q;
            if (e != null) {
                a = c0181e.m615a();
                if (a != null) {
                    asyncImageView = (AsyncImageView) a.findViewById(R.id.ivTab);
                    if (asyncImageView != null) {
                        Object obj2 = e.getTabContents().get(c0181e.m619c());
                        C2885g.m13907a(obj2, "it.tabContents[tab.position]");
                        asyncImageView.setImageUrl(((TabContent) obj2).getSelectedIcon());
                    }
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.HomePageActivity$e */
    public static final class C4537e extends C3199a {
        /* renamed from: c */
        final /* synthetic */ HomePageActivity f18862c;

        C4537e(HomePageActivity homePageActivity, Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
            this.f18862c = homePageActivity;
            super(activity, drawerLayout, toolbar, i, i2);
        }

        /* renamed from: a */
        public void mo502a(View view) {
            C2885g.m13910b(view, "drawerView");
            C1570t.m5983a((Context) this.f18862c, this.f18862c.getCurrentFocus());
            super.mo502a(view);
        }
    }

    /* renamed from: c */
    public View mo5038c(int i) {
        if (this.f21907v == null) {
            this.f21907v = new HashMap();
        }
        View view = (View) this.f21907v.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21907v.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: m */
    public boolean mo5037m() {
        return false;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_home_page);
        m29816a((Toolbar) mo5038c(C1487a.toolbar));
        if (mo4973h() != null) {
            Object h = mo4973h();
            if (h == null) {
                C2885g.m13906a();
            }
            C2885g.m13907a(h, "supportActionBar!!");
            h.mo531a((CharSequence) getString(R.string.app_name));
        }
        Activity activity = this;
        Bundle c4537e = new C4537e(this, activity, (DrawerLayout) mo5038c(C1487a.drawerLayout), (Toolbar) mo5038c(C1487a.toolbar), R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        ((DrawerLayout) mo5038c(C1487a.drawerLayout)).setDrawerLockMode(1);
        ((DrawerLayout) mo5038c(C1487a.drawerLayout)).m2282a((C0576c) c4537e);
        c4537e.m15898a();
        m30173o();
        Context context = this;
        this.f21901p = C1533a.m5791b(context);
        ((MyTabLayout) mo5038c(C1487a.tabLayout)).setupWithViewPager((NonSwipeableViewPager) mo5038c(C1487a.pager));
        ((MyTabLayout) mo5038c(C1487a.tabLayout)).m650a();
        this.f21902q = C1570t.m6030o(context);
        if (C1570t.m6038w(context)) {
            this.f21902q = (HomeTabData) null;
            String string = getString(R.string.ad_free_subsc_congrats);
            C2885g.m13907a((Object) string, "message");
            m30164a(string);
            C1570t.m6037v(context);
        }
        if (this.f21902q != null) {
            m30178t();
        }
        m30176r();
        C1550l.m5920a(activity);
    }

    /* renamed from: l */
    public String mo5036l() {
        Object string = getResources().getString(R.string.home_screen_interstial_ad_unit_id);
        C2885g.m13907a(string, "resources.getString(R.st…en_interstial_ad_unit_id)");
        return string;
    }

    /* renamed from: o */
    private final void m30173o() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.menu_rate);
        View findViewById = linearLayout.findViewById(R.id.tv_option_name);
        if (findViewById != null) {
            ((TextView) findViewById).setText(R.string.rate_app);
            linearLayout.setOnClickListener(this.f21905t);
            linearLayout = (LinearLayout) findViewById(R.id.menu_garage);
            findViewById = linearLayout.findViewById(R.id.tv_option_name);
            if (findViewById != null) {
                ((TextView) findViewById).setText(R.string.my_garage_text);
                linearLayout.setOnClickListener(this.f21905t);
                linearLayout = (LinearLayout) findViewById(R.id.menu_feedback);
                findViewById = linearLayout.findViewById(R.id.tv_option_name);
                if (findViewById != null) {
                    ((TextView) findViewById).setText(R.string.feedback);
                    linearLayout.setOnClickListener(this.f21905t);
                    linearLayout = (LinearLayout) findViewById(R.id.menu_about);
                    findViewById = linearLayout.findViewById(R.id.tv_option_name);
                    if (findViewById != null) {
                        ((TextView) findViewById).setText(R.string.about_us);
                        linearLayout.setOnClickListener(this.f21905t);
                        linearLayout = (LinearLayout) findViewById(R.id.menu_share);
                        View findViewById2 = linearLayout.findViewById(R.id.tv_option_name);
                        if (findViewById2 != null) {
                            ((TextView) findViewById2).setText(R.string.share_app);
                            linearLayout.setOnClickListener(this.f21905t);
                            ((ImageView) mo5038c(C1487a.ivCuvoraLogo)).setOnClickListener(new C1460b(this));
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    protected void onResume() {
        super.onResume();
    }

    /* renamed from: p */
    private final void m30174p() {
        try {
            if (this.f21899n != null) {
                ProgressDialog progressDialog = this.f21899n;
                if (progressDialog != null && progressDialog.isShowing() && !isFinishing()) {
                    progressDialog = this.f21899n;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    this.f21899n = (ProgressDialog) null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private final void m30164a(String str) {
        C0661a c0661a = new C0661a(this);
        c0661a.m2643b((CharSequence) str);
        c0661a.m2639a((CharSequence) "Congratulations!!");
        c0661a.m2641a(true);
        c0661a.m2644b("Dismiss", C1464i.f4450a);
        c0661a.m2645b().show();
    }

    public void onBackPressed() {
        Object obj = (NonSwipeableViewPager) mo5038c(C1487a.pager);
        C2885g.m13907a(obj, "pager");
        C0555o adapter = obj.getAdapter();
        if (adapter != null) {
            ViewGroup viewGroup = (NonSwipeableViewPager) mo5038c(C1487a.pager);
            Object obj2 = (NonSwipeableViewPager) mo5038c(C1487a.pager);
            C2885g.m13907a(obj2, "pager");
            obj = adapter.mo309a(viewGroup, obj2.getCurrentItem());
        } else {
            obj = null;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.fragment.BaseHomeFragment");
        } else if (!((C4549b) obj).mo4632d()) {
            HomeTabData homeTabData = this.f21902q;
            if (homeTabData != null) {
                obj = homeTabData.getTabContents();
                C2885g.m13907a(obj, "it.tabContents");
                int i = 0;
                for (Object obj3 : (Iterable) obj) {
                    Object obj32;
                    C2885g.m13907a(obj32, "item");
                    if (obj32.isSelected()) {
                        obj32 = (NonSwipeableViewPager) mo5038c(C1487a.pager);
                        C2885g.m13907a(obj32, "pager");
                        if (obj32.getCurrentItem() != i) {
                            ((NonSwipeableViewPager) mo5038c(C1487a.pager)).setCurrentItem(i, false);
                            return;
                        }
                    }
                    i++;
                }
            }
            if (((DrawerLayout) mo5038c(C1487a.drawerLayout)).m2304g(8388611)) {
                ((DrawerLayout) mo5038c(C1487a.drawerLayout)).m2302f(8388611);
            } else {
                Context context = this;
                if (C1533a.m5795c(context)) {
                    C1533a.m5786a(context, this.f21901p, (C1473c) new C3652d(this));
                } else {
                    super.onBackPressed();
                }
            }
        }
    }

    /* renamed from: q */
    private final void m30175q() {
        Intent intent = new Intent(this, ExitAppSupportActivity.class);
        intent.addFlags(268533760);
        startActivity(intent);
    }

    /* renamed from: r */
    private final void m30176r() {
        if (this.f21902q != null || C1547j.m5914d(this)) {
            if (this.f21902q == null) {
                m30177s();
            }
            m28708g().mo264a(this.f21900o, null, this.f21906u).m1455m();
            return;
        }
        String string = getString(R.string.no_internet_connectivity);
        C2885g.m13907a((Object) string, "getString(R.string.no_internet_connectivity)");
        m30167b(string);
    }

    /* renamed from: s */
    private final void m30177s() {
        if (!isFinishing()) {
            if (this.f21899n == null) {
                this.f21899n = new ProgressDialog(this);
            }
            ProgressDialog progressDialog = this.f21899n;
            boolean z = true;
            if (progressDialog != null) {
                progressDialog.setIndeterminate(true);
            }
            progressDialog = this.f21899n;
            if (progressDialog != null) {
                if (this.f21902q == null) {
                    z = false;
                }
                progressDialog.setCancelable(z);
            }
            progressDialog = this.f21899n;
            if (progressDialog != null) {
                progressDialog.setMessage(getResources().getString(R.string.please_wait));
            }
            progressDialog = this.f21899n;
            if (!(progressDialog == null || progressDialog.isShowing())) {
                progressDialog = this.f21899n;
                if (progressDialog != null) {
                    progressDialog.show();
                }
            }
        }
    }

    /* renamed from: b */
    private final void m30167b(String str) {
        C0661a c0661a = new C0661a(this);
        c0661a.m2643b((CharSequence) str);
        c0661a.m2640a((CharSequence) "TRY AGAIN", (DialogInterface.OnClickListener) new C1462g(this));
        c0661a.m2641a(true);
        c0661a.m2634a((OnCancelListener) new C1463h(this));
        c0661a.m2645b().show();
    }

    /* renamed from: t */
    private final void m30178t() {
        HomeTabData homeTabData = this.f21902q;
        if (homeTabData != null) {
            Object obj = (NonSwipeableViewPager) mo5038c(C1487a.pager);
            C2885g.m13907a(obj, "pager");
            if (obj.getAdapter() == null) {
                obj = (NonSwipeableViewPager) mo5038c(C1487a.pager);
                C2885g.m13907a(obj, "pager");
                obj.setOffscreenPageLimit(homeTabData.getTabContents().size());
                obj = (NonSwipeableViewPager) mo5038c(C1487a.pager);
                C2885g.m13907a(obj, "pager");
                Context context = this;
                Object f = m28707f();
                C2885g.m13907a(f, "supportFragmentManager");
                obj.setAdapter(new C4534o(context, f, homeTabData));
                ((MyTabLayout) mo5038c(C1487a.tabLayout)).setupTabIcons(homeTabData);
                ((MyTabLayout) mo5038c(C1487a.tabLayout)).m652a((C0176b) this.f21904s);
                if (homeTabData.getTabContents().size() < 2) {
                    Object obj2 = (MyTabLayout) mo5038c(C1487a.tabLayout);
                    C2885g.m13907a(obj2, "tabLayout");
                    obj2.setVisibility(8);
                }
            }
        }
    }
}
