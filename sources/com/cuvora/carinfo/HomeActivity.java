package com.cuvora.carinfo;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.transition.Slide;
import android.support.transition.Transition;
import android.support.transition.ae;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.C0576c;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.C3199a;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cuvora.carinfo.fragment.C4552m;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1548k;
import com.cuvora.carinfo.helpers.C1561p;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.C4568k;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.RewardedVideoSubModel;
import com.cuvora.carinfo.models.homepage.ActionTypeEnum;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.HomePageData;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.models.homepage.SectionTypeEnum;
import com.cuvora.carinfo.p071d.C1473c;
import com.cuvora.carinfo.p076h.C1530a;
import com.cuvora.carinfo.views.AdFreeOptionsView;
import com.cuvora.carinfo.views.AdFreeOptionsView.C1628a;
import com.cuvora.carinfo.views.HomePageBaseCustomView;
import com.cuvora.carinfo.views.MyScrollView;
import com.cuvora.carinfo.views.MyScrollView.C1668a;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public class HomeActivity extends AppCompatActivity implements C1530a<Section, Element>, C1668a {
    /* renamed from: A */
    private Transition f21741A;
    /* renamed from: B */
    private C0362a<Response> f21742B = new C0362a<Response>(this) {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f14764a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        {
            this.f14764a = r1;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            return new C4568k(this.f14764a);
        }

        /* renamed from: a */
        public void m18197a(C0392c<Response> c0392c, Response response) {
            this.f14764a.m29977u();
            if ((response instanceof HomePageData) != null) {
                this.f14764a.f21748s = (HomePageData) response;
                this.f14764a.m29975s();
            } else if (this.f14764a.f21748s == null) {
                this.f14764a.m29961a((String) this.f14764a.getString(R.string.homepage_data_error_msg));
            }
        }
    };
    /* renamed from: n */
    AdFreeOptionsView f21743n;
    /* renamed from: o */
    RelativeLayout f21744o;
    /* renamed from: p */
    OnClickListener f21745p = new OnClickListener(this) {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f4392a;

        {
            this.f4392a = r1;
        }

        @SuppressLint({"RestrictedApi"})
        public void onClick(View view) {
            DrawerLayout drawerLayout = (DrawerLayout) this.f4392a.findViewById(R.id.drawer_layout);
            view = view.getId();
            if (view == R.id.menu_garage) {
                this.f4392a.startActivity(new Intent(this.f4392a, MyGarageActivity.class));
            } else if (view == R.id.menu_rate) {
                C1540d.m5839l();
                C1570t.m5997b(this.f4392a, this.f4392a.getPackageName());
            } else if (view == R.id.menu_feedback) {
                C1540d.m5835j();
                C1570t.m6012d(this.f4392a, this.f4392a.getResources().getString(R.string.feedback_carinfo));
            } else if (view == R.id.menu_about) {
                C1540d.m5837k();
                this.f4392a.startActivity(new Intent(this.f4392a, AboutActivity.class));
            } else if (view == R.id.menu_share) {
                C1561p.m5939a(this.f4392a);
            } else if (view == R.id.menuAdFree) {
                C1540d.m5811a("Ad free option selected from Side Drawer", (this.f4392a.f21743n.m6216b() ? ActionTypeEnum.REWARDED_INAPP : ActionTypeEnum.INAPP).name());
                this.f4392a.f21743n.setType(this.f4392a.f21743n.m6216b() ? ActionTypeEnum.REWARDED_INAPP : ActionTypeEnum.INAPP);
                this.f4392a.m29982l();
                this.f4392a.f21744o.setVisibility(0);
            }
            drawerLayout.m2302f(8388611);
        }
    };
    /* renamed from: q */
    private String f21746q;
    /* renamed from: r */
    private ProgressDialog f21747r;
    /* renamed from: s */
    private HomePageData f21748s;
    /* renamed from: t */
    private LinearLayout f21749t;
    /* renamed from: u */
    private MyScrollView f21750u;
    /* renamed from: v */
    private ImageView f21751v;
    /* renamed from: w */
    private InterstitialAd f21752w;
    /* renamed from: x */
    private InterstitialAd f21753x;
    /* renamed from: y */
    private AdView f21754y;
    /* renamed from: z */
    private LinearLayout f21755z;

    /* renamed from: com.cuvora.carinfo.HomeActivity$2 */
    class C14192 implements DialogInterface.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f4395a;

        C14192(HomeActivity homeActivity) {
            this.f4395a = homeActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.cuvora.carinfo.HomeActivity$3 */
    class C14203 implements DialogInterface.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f4396a;

        C14203(HomeActivity homeActivity) {
            this.f4396a = homeActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.cuvora.carinfo.HomeActivity$4 */
    class C14214 implements DialogInterface.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f4397a;

        C14214(HomeActivity homeActivity) {
            this.f4397a = homeActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C1540d.m5835j();
            C1570t.m6012d(this.f4397a, this.f4397a.getResources().getString(R.string.feedback_carinfo));
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.cuvora.carinfo.HomeActivity$6 */
    static /* synthetic */ class C14226 {
        /* renamed from: a */
        static final /* synthetic */ int[] f4398a = new int[SectionTypeEnum.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.values();
            r0 = r0.length;
            r0 = new int[r0];
            f4399b = r0;
            r0 = 1;
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.RCSTATUS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.MYGARAGE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.SEARCHBYNAME;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.SHARE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.CARS_HOME;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r3 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.INSTANT_ARTICLE;	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r3 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.VEHICLE_DETAILS;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r3 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.VIDEO_YOUTUBE;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r3 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x006e }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.REDIRECT;	 Catch:{ NoSuchFieldError -> 0x006e }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r3 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x007a }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.DEEPLINK;	 Catch:{ NoSuchFieldError -> 0x007a }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r3 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.MARKET;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r3 = 11;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.INAPP;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0092 }
            r3 = 12;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0092 }
        L_0x0092:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x009e }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.REWARDED;	 Catch:{ NoSuchFieldError -> 0x009e }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x009e }
            r3 = 13;	 Catch:{ NoSuchFieldError -> 0x009e }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x009e }
        L_0x009e:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x00aa }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.REWARDED_INAPP;	 Catch:{ NoSuchFieldError -> 0x00aa }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x00aa }
            r3 = 14;	 Catch:{ NoSuchFieldError -> 0x00aa }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x00aa }
        L_0x00aa:
            r1 = f4399b;	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r2 = com.cuvora.carinfo.models.homepage.ActionTypeEnum.CAR_MODEL;	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r3 = 15;	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x00b6 }
        L_0x00b6:
            r1 = com.cuvora.carinfo.models.homepage.SectionTypeEnum.values();
            r1 = r1.length;
            r1 = new int[r1];
            f4398a = r1;
            r1 = f4398a;	 Catch:{ NoSuchFieldError -> 0x00c9 }
            r2 = com.cuvora.carinfo.models.homepage.SectionTypeEnum.TRENDING;	 Catch:{ NoSuchFieldError -> 0x00c9 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c9 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x00c9 }
        L_0x00c9:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.HomeActivity.6.<clinit>():void");
        }
    }

    /* renamed from: com.cuvora.carinfo.HomeActivity$7 */
    class C14237 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f4400a;

        C14237(HomeActivity homeActivity) {
            this.f4400a = homeActivity;
        }

        public void onClick(View view) {
            this.f4400a.startActivity(new Intent(this.f4400a, AboutActivity.class));
        }
    }

    /* renamed from: com.cuvora.carinfo.HomeActivity$9 */
    class C14249 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f4401a;

        C14249(HomeActivity homeActivity) {
            this.f4401a = homeActivity;
        }

        public void onClick(View view) {
            ((CarInfoApplication) this.f4401a.getApplication()).m5694a();
            this.f4401a.m29982l();
            this.f4401a.f21744o.setVisibility(8);
        }
    }

    /* renamed from: com.cuvora.carinfo.HomeActivity$5 */
    class C35975 implements C1473c<Boolean> {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f14765a;

        C35975(HomeActivity homeActivity) {
            this.f14765a = homeActivity;
        }

        /* renamed from: a */
        public void m18199a(Boolean bool) {
            if (bool.booleanValue() != null) {
                bool = new Intent(this.f14765a, ExitAppSupportActivity.class);
                bool.addFlags(268533760);
                this.f14765a.startActivity(bool);
                return;
            }
            this.f14765a.finish();
        }
    }

    /* renamed from: com.cuvora.carinfo.HomeActivity$8 */
    class C35988 implements C1628a {
        /* renamed from: a */
        final /* synthetic */ HomeActivity f14766a;

        C35988(HomeActivity homeActivity) {
            this.f14766a = homeActivity;
        }

        /* renamed from: a */
        public void mo1163a() {
            this.f14766a.f21744o.performClick();
            ((CarInfoApplication) this.f14766a.getApplication()).m5694a();
            this.f14766a.m29965b(this.f14766a.getString(R.string.ad_free_subsc_congrats));
            this.f14766a.m29973q();
            if (this.f14766a.mo4973h() != null) {
                HomeActivity homeActivity;
                int i;
                ActionBar h = this.f14766a.mo4973h();
                if (C1570t.m6032q(this.f14766a)) {
                    homeActivity = this.f14766a;
                    i = R.string.app_name_prem;
                } else {
                    homeActivity = this.f14766a;
                    i = R.string.app_name;
                }
                h.mo531a(homeActivity.getString(i));
            }
            int i2 = 8;
            if (this.f14766a.f21754y != null) {
                this.f14766a.f21754y.setVisibility(8);
            }
            if (this.f14766a.f21755z != null) {
                LinearLayout c = this.f14766a.f21755z;
                if (!C1570t.m6032q(this.f14766a)) {
                    i2 = 0;
                }
                c.setVisibility(i2);
            }
        }

        /* renamed from: b */
        public void mo1164b() {
            this.f14766a.f21744o.performClick();
            ((CarInfoApplication) this.f14766a.getApplication()).m5694a();
            RewardedVideoSubModel e = C1570t.m6014e();
            this.f14766a.m29968c(String.format(this.f14766a.getString(R.string.ad_free_rewarded_subsc_congrats), new Object[]{Integer.valueOf(e.validity)}));
            this.f14766a.m29973q();
            if (this.f14766a.mo4973h() != null) {
                HomeActivity homeActivity;
                int i;
                ActionBar h = this.f14766a.mo4973h();
                if (C1570t.m6032q(this.f14766a)) {
                    homeActivity = this.f14766a;
                    i = R.string.app_name_prem;
                } else {
                    homeActivity = this.f14766a;
                    i = R.string.app_name;
                }
                h.mo531a(homeActivity.getString(i));
            }
            int i2 = 8;
            if (this.f14766a.f21754y != null) {
                this.f14766a.f21754y.setVisibility(8);
            }
            if (this.f14766a.f21755z != null) {
                LinearLayout c = this.f14766a.f21755z;
                if (!C1570t.m6032q(this.f14766a)) {
                    i2 = 0;
                }
                c.setVisibility(i2);
            }
        }
    }

    /* renamed from: m */
    public void mo5019m() {
    }

    /* renamed from: n */
    public void mo5020n() {
    }

    /* renamed from: b */
    public /* synthetic */ void mo1190b(Object obj) {
        m29979a((Section) obj);
    }

    public HomeActivity() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" ");
        this.f21746q = stringBuilder.toString();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21741A = new Slide();
        this.f21741A.mo205b(0);
        this.f21741A.mo197a(250);
        setContentView((int) R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        m29816a(toolbar);
        if (mo4973h() != null) {
            mo4973h().mo531a(getString(C1570t.m6032q(this) ? R.string.app_name_prem : R.string.app_name));
        }
        m29974r();
        m29972p();
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        C0576c c45321 = new C3199a(this, this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            /* renamed from: c */
            final /* synthetic */ HomeActivity f18856c;

            /* renamed from: a */
            public void mo502a(View view) {
                C1570t.m5983a(this.f18856c, this.f18856c.getCurrentFocus());
                super.mo502a(view);
            }
        };
        drawerLayout.m2282a(c45321);
        c45321.m15898a();
        this.f21753x = C1533a.m5782a((Context) this);
        this.f21751v.setOnClickListener(new C14237(this));
        if (this.f21748s != null) {
            m29975s();
        }
        m29973q();
    }

    /* renamed from: p */
    private void m29972p() {
        this.f21743n.setListener(new C35988(this));
        this.f21744o.setOnClickListener(new C14249(this));
        this.f21743n.setOnClickListener(new OnClickListener(this) {
            /* renamed from: a */
            final /* synthetic */ HomeActivity f4391a;

            public void onClick(View view) {
            }

            {
                this.f4391a = r1;
            }
        });
    }

    /* renamed from: l */
    public void m29982l() {
        ae.m973a(this.f21744o, this.f21741A);
    }

    protected void onResume() {
        if (this.f21743n != null) {
            this.f21743n.m6217c();
        }
        mo5021o();
        super.onResume();
        C1533a.m5790a(this.f21753x, (Context) this);
    }

    /* renamed from: q */
    private void m29973q() {
        if (this.f21748s != null || C1547j.m5914d(this)) {
            if (this.f21748s == null) {
                m29976t();
            }
            m28708g().mo264a(100, null, this.f21742B).m1455m();
            return;
        }
        m29961a(getString(R.string.no_internet_connectivity));
    }

    /* renamed from: r */
    private void m29974r() {
        this.f21743n = (AdFreeOptionsView) findViewById(R.id.adFreeOptionView);
        this.f21743n.m6215a();
        this.f21744o = (RelativeLayout) findViewById(R.id.view_ad_free_root);
        this.f21749t = (LinearLayout) findViewById(R.id.ll_content);
        this.f21750u = (MyScrollView) findViewById(R.id.sv_content);
        this.f21750u.setListener(this);
        this.f21751v = (ImageView) findViewById(R.id.iv_logo_cuvora);
        this.f21752w = C1533a.m5791b(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.menu_rate);
        ((TextView) linearLayout.findViewById(R.id.tv_option_name)).setText(R.string.rate_app);
        linearLayout.setOnClickListener(this.f21745p);
        linearLayout = (LinearLayout) findViewById(R.id.menu_garage);
        ((TextView) linearLayout.findViewById(R.id.tv_option_name)).setText(R.string.my_garage_text);
        linearLayout.setOnClickListener(this.f21745p);
        linearLayout = (LinearLayout) findViewById(R.id.menu_feedback);
        ((TextView) linearLayout.findViewById(R.id.tv_option_name)).setText(R.string.feedback);
        linearLayout.setOnClickListener(this.f21745p);
        linearLayout = (LinearLayout) findViewById(R.id.menu_about);
        ((TextView) linearLayout.findViewById(R.id.tv_option_name)).setText(R.string.about_us);
        linearLayout.setOnClickListener(this.f21745p);
        linearLayout = (LinearLayout) findViewById(R.id.menu_share);
        ((TextView) linearLayout.findViewById(R.id.tv_option_name)).setText(R.string.share_app);
        linearLayout.setOnClickListener(this.f21745p);
        this.f21755z = (LinearLayout) findViewById(R.id.menuAdFree);
        ((TextView) this.f21755z.findViewById(R.id.tv_option_name)).setText(R.string.go_pro);
        this.f21755z.setOnClickListener(this.f21745p);
        this.f21755z.setVisibility(C1570t.m6032q(this) ? 8 : 0);
        this.f21754y = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21754y, (Context) this);
    }

    protected void onPause() {
        if (this.f21743n != null) {
            this.f21743n.m6218d();
        }
        super.onPause();
    }

    protected void onDestroy() {
        if (this.f21743n != null) {
            this.f21743n.m6219e();
        }
        this.f21754y.destroy();
        super.onDestroy();
    }

    /* renamed from: s */
    private void m29975s() {
        this.f21749t.removeAllViews();
        this.f21750u.setVisibility(0);
        if (C1570t.m6032q(this)) {
            this.f21749t.addView(LayoutInflater.from(this).inflate(R.layout.view_premium_user, this.f21749t, false));
        }
        for (Section section : this.f21748s.getSections()) {
        }
    }

    /* renamed from: a */
    private void m29961a(String str) {
        C0661a c0661a = new C0661a(this);
        c0661a.m2643b((CharSequence) str);
        c0661a.m2640a((CharSequence) "TRY AGAIN", new DialogInterface.OnClickListener(this) {
            /* renamed from: a */
            final /* synthetic */ HomeActivity f4393a;

            {
                this.f4393a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                this.f4393a.m29973q();
            }
        });
        c0661a.m2641a(true);
        c0661a.m2634a(new OnCancelListener(this) {
            /* renamed from: a */
            final /* synthetic */ HomeActivity f4394a;

            {
                this.f4394a = r1;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f4394a.finish();
            }
        });
        c0661a.m2645b().show();
    }

    /* renamed from: b */
    private void m29965b(String str) {
        C0661a c0661a = new C0661a(this);
        c0661a.m2643b((CharSequence) str);
        c0661a.m2639a((CharSequence) "Congratulations!!");
        c0661a.m2641a(true);
        c0661a.m2644b("Dismiss", new C14192(this));
        c0661a.m2645b().show();
    }

    /* renamed from: c */
    private void m29968c(String str) {
        C0661a c0661a = new C0661a(this);
        c0661a.m2643b((CharSequence) str);
        c0661a.m2639a((CharSequence) "Congratulations!!");
        c0661a.m2640a((CharSequence) "Dismiss", new C14203(this));
        c0661a.m2641a(true);
        c0661a.m2644b("Feedback", new C14214(this));
        c0661a.m2645b().show();
    }

    /* renamed from: t */
    private void m29976t() {
        if (!isFinishing()) {
            if (this.f21747r == null) {
                this.f21747r = new ProgressDialog(this);
            }
            boolean z = true;
            this.f21747r.setIndeterminate(true);
            ProgressDialog progressDialog = this.f21747r;
            if (this.f21748s == null) {
                z = false;
            }
            progressDialog.setCancelable(z);
            this.f21747r.setMessage(getResources().getString(R.string.please_wait));
            if (!this.f21747r.isShowing()) {
                this.f21747r.show();
            }
        }
    }

    /* renamed from: u */
    private void m29977u() {
        try {
            if (this.f21747r != null && this.f21747r.isShowing() && !isFinishing()) {
                this.f21747r.dismiss();
                this.f21747r = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m29979a(Section section) {
        C1540d.m5808a(section.getType());
        C1533a.m5785a((Context) this, C1533a.m5796d(this) + 1);
        if (C14226.f4398a[section.getType().ordinal()] == 1) {
            startActivity(new Intent(this, TrendingSearchActivity.class));
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void m29978a(Element element) {
        ActionTypeEnum type = element.getAction().getType();
        C1533a.m5785a((Context) this, C1533a.m5796d(this) + 1);
        C1540d.m5807a(element.getAction());
        Intent intent;
        switch (type) {
            case RCSTATUS:
                startActivity(new Intent(this, SearchActivity.class));
                break;
            case MYGARAGE:
                startActivity(new Intent(this, MyGarageActivity.class));
                break;
            case SEARCHBYNAME:
                startActivity(new Intent(this, ReverseSearchActivity.class));
                break;
            case SHARE:
                C1561p.m5939a(this);
                return;
            case CARS_HOME:
                element = new Intent(this, CarsBrandsActivity.class);
                if (C1547j.m5914d(this)) {
                    element.putExtra("STATE", "LOADING");
                } else {
                    element.putExtra("STATE", "ERROR");
                }
                startActivity(element);
                break;
            case INSTANT_ARTICLE:
                intent = new Intent(this, InstantArticleActivity.class);
                intent.putExtra("KEY_DATA", element.getAction().getInstantArticleData());
                startActivity(intent);
                break;
            case VEHICLE_DETAILS:
                intent = new Intent(this, VehicleInfoActivity.class);
                intent.putExtra("KEY_VEHICLE_INFO", element.getAction().getVehicleSearchResult());
                startActivity(intent);
                break;
            case VIDEO_YOUTUBE:
                intent = new Intent(this, VideoActivity.class);
                intent.putExtra("KEY_VIDEO_DATA", element.getAction().getVideoData());
                startActivity(intent);
                break;
            case REDIRECT:
                intent = new Intent(this, GenericWebViewActivity.class);
                intent.putExtra("KEY_WEB_VIEW_TITLE", element.getContent().getTitle());
                intent.putExtra("KEY_WEB_VIEW_URL", element.getAction().getDeeplink().getUrl());
                startActivity(intent);
                break;
            case DEEPLINK:
                Map meta = element.getAction().getDeeplink().getMeta();
                Bundle bundle = new Bundle();
                bundle.putSerializable("deepLink", element.getAction().getDeeplink().getUrl());
                for (Entry entry : meta.entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                C1548k.m5918a(this, bundle);
                return;
            case MARKET:
                C1570t.m6006c(this, element.getAction().getDeeplink().getUrl());
                break;
            case INAPP:
                this.f21743n.setType(ActionTypeEnum.INAPP);
                m29982l();
                this.f21744o.setVisibility(0);
                break;
            case REWARDED:
                this.f21743n.setType(this.f21743n.m6216b() ? ActionTypeEnum.REWARDED : ActionTypeEnum.INAPP);
                m29982l();
                this.f21744o.setVisibility(0);
                break;
            case REWARDED_INAPP:
                this.f21743n.setType(this.f21743n.m6216b() ? ActionTypeEnum.REWARDED_INAPP : ActionTypeEnum.INAPP);
                m29982l();
                this.f21744o.setVisibility(0);
                break;
            case CAR_MODEL:
                intent = new Intent(this, CarDetailActivity.class);
                intent.putExtra("KEY_MODEL_ID", element.getAction().getModelId());
                if (C1547j.m5914d(this) == null) {
                    intent.putExtra("STATE", "ERROR");
                } else {
                    intent.putExtra("STATE", "LOADING");
                }
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void onBackPressed() {
        if (this.f21744o.getVisibility() == 0) {
            this.f21744o.performClick();
        } else if (m28707f().mo291a(C4552m.f18878b) != null) {
            m28707f().mo301c();
        } else {
            DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawerLayout.m2304g(8388611)) {
                drawerLayout.m2302f(8388611);
            } else if (C1533a.m5795c(this)) {
                C1533a.m5786a((Context) this, this.f21752w, new C35975(this));
            } else {
                super.onBackPressed();
            }
        }
    }

    /* renamed from: o */
    public void mo5021o() {
        Log.d(this.f21746q, " scrollInIdleState called ");
        if (this.f21749t != null) {
            int i = 0;
            while (i < this.f21749t.getChildCount()) {
                if (this.f21749t.getChildAt(i) != null && (this.f21749t.getChildAt(i) instanceof HomePageBaseCustomView)) {
                    View view = (HomePageBaseCustomView) this.f21749t.getChildAt(i);
                    if (m29962a(view)) {
                        view.m6314a();
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private boolean m29962a(View view) {
        Rect rect = new Rect();
        this.f21750u.getDrawingRect(rect);
        float y = view.getY();
        float height = ((float) view.getHeight()) + y;
        float height2 = (((float) rect.top) > y || ((float) rect.bottom) < height) ? (((float) rect.top) > y || y >= ((float) rect.bottom)) ? (((float) rect.bottom) < height || height <= ((float) rect.top)) ? 0.0f : height - ((float) rect.top) : ((float) rect.bottom) - y : (float) view.getHeight();
        return height2 / ((float) view.getHeight()) >= 0.7f ? true : null;
    }
}
