package com.cuvora.carinfo.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.C0363u;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.C0392c;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cuvora.carinfo.AboutActivity;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.MyGarageActivity;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.SearchActivity;
import com.cuvora.carinfo.VehicleInfoActivity;
import com.cuvora.carinfo.activity.LicenseInfoActivity;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.C3688b;
import com.cuvora.carinfo.loaders.C1579s;
import com.cuvora.carinfo.loaders.C4567i;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Action;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Type;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.p071d.C1474d;
import com.cuvora.carinfo.p072e.C1475a;
import com.cuvora.carinfo.p072e.C1482g;
import com.cuvora.carinfo.p072e.C4542d;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.C2888j;
import kotlin.text.C4883n;
import kotlin.text.C4886o;

/* renamed from: com.cuvora.carinfo.fragment.h */
public final class C4804h extends C4549b implements C1474d<Object> {
    /* renamed from: b */
    public static final C1502a f21029b = new C1502a();
    /* renamed from: s */
    private static C1482g f21030s;
    /* renamed from: c */
    private int f21031c = 2;
    /* renamed from: d */
    private C0362a<Response> f21032d = new C3671b(this);
    /* renamed from: e */
    private int f21033e;
    /* renamed from: f */
    private int f21034f;
    /* renamed from: g */
    private int f21035g;
    /* renamed from: h */
    private final String f21036h = "KEY_VEHICLE_NUMBER";
    /* renamed from: i */
    private final String f21037i = "KEY_ACTION";
    /* renamed from: j */
    private final String f21038j = "KEY_TYPE";
    /* renamed from: k */
    private final String f21039k = "KEY_AVAILABLE_NUMBERS";
    /* renamed from: l */
    private final int f21040l = 1;
    /* renamed from: m */
    private GarageResult f21041m;
    /* renamed from: n */
    private C4542d f21042n;
    /* renamed from: o */
    private final int f21043o = 1;
    /* renamed from: p */
    private List<VehicleSearchResult> f21044p;
    /* renamed from: q */
    private final C3673d f21045q = new C3673d(this);
    /* renamed from: r */
    private C1475a f21046r = new C3672c(this);
    /* renamed from: t */
    private HashMap f21047t;

    /* renamed from: com.cuvora.carinfo.fragment.h$a */
    public static final class C1502a {
        private C1502a() {
        }

        /* renamed from: a */
        public final void m5738a(C1482g c1482g) {
            C2885g.m13910b(c1482g, "callback");
            C4804h.f21030s = c1482g;
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$e */
    static final class C1505e implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4804h f4493a;

        C1505e(C4804h c4804h) {
            this.f4493a = c4804h;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (this.f4493a.m27801m() != null) {
                this.f4493a.m27802n();
                dialogInterface = this.f4493a.getActivity();
                if (dialogInterface != null) {
                    dialogInterface.finish();
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$f */
    static final class C1506f implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4804h f4494a;

        C1506f(C4804h c4804h) {
            this.f4494a = c4804h;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            dialogInterface = this.f4494a.getActivity();
            if (dialogInterface != null) {
                dialogInterface.finish();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$g */
    static final class C1507g implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4804h f4495a;

        C1507g(C4804h c4804h) {
            this.f4495a = c4804h;
        }

        public final void onClick(View view) {
            this.f4495a.m27802n();
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$h */
    static final class C1508h implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4804h f4496a;

        C1508h(C4804h c4804h) {
            this.f4496a = c4804h;
        }

        public final void onClick(View view) {
            if (C1547j.m5914d(this.f4496a.getActivity()) == null) {
                C1570t.m5978a((Activity) this.f4496a.getActivity());
                return;
            }
            view = this.f4496a.getContext();
            if (view != null) {
                view.startActivity(new Intent(this.f4496a.getContext(), SearchActivity.class));
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$i */
    static final class C1509i implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4804h f4497a;

        C1509i(C4804h c4804h) {
            this.f4497a = c4804h;
        }

        public final void onClick(View view) {
            C1540d.m5835j();
            C1570t.m6007c(this.f4497a.getContext(), this.f4497a.getResources().getString(R.string.contact_carinfo), null);
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$j */
    static final class C1510j implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4804h f4498a;

        C1510j(C4804h c4804h) {
            this.f4498a = c4804h;
        }

        public final void onClick(View view) {
            C1540d.m5837k();
            this.f4498a.startActivity(new Intent(this.f4498a.getContext(), AboutActivity.class));
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$b */
    public static final class C3671b implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ C4804h f14888a;
        /* renamed from: b */
        private String f14889b;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
            C2885g.m13910b(c0392c, "loader");
        }

        C3671b(C4804h c4804h) {
            this.f14888a = c4804h;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            i = 0;
            this.f14889b = bundle != null ? bundle.getString(this.f14888a.m27815h()) : null;
            View view = this.f14888a.getView();
            if (view != null) {
                view = view.findViewById(R.id.pb);
                if (view != null) {
                    view.setVisibility(0);
                }
            }
            Context context = this.f14888a.getContext();
            if (context == null) {
                C2885g.m13906a();
            }
            String str = this.f14889b;
            Object obj = bundle != null ? bundle.get(this.f14888a.m27816i()) : null;
            if (obj != null) {
                Action action = (Action) obj;
                if (bundle != null) {
                    i = bundle.get(this.f14888a.m27817j());
                }
                if (i != 0) {
                    return new UpdateVehicleInRecentOrGarageLoader(context, str, action, (Type) i);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Type");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Action");
        }

        /* renamed from: a */
        public void m18468a(android.support.v4.content.C0392c<com.cuvora.carinfo.models.Response> r2, com.cuvora.carinfo.models.Response r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = "loader";
            kotlin.jvm.internal.C2885g.m13910b(r2, r0);
            r2 = r1.f14888a;	 Catch:{ Exception -> 0x001c }
            r2 = r2.getView();	 Catch:{ Exception -> 0x001c }
            if (r2 == 0) goto L_0x001d;	 Catch:{ Exception -> 0x001c }
        L_0x000d:
            r0 = 2131231064; // 0x7f080158 float:1.8078198E38 double:1.052968052E-314;	 Catch:{ Exception -> 0x001c }
            r2 = r2.findViewById(r0);	 Catch:{ Exception -> 0x001c }
            if (r2 == 0) goto L_0x001d;	 Catch:{ Exception -> 0x001c }
        L_0x0016:
            r0 = 8;	 Catch:{ Exception -> 0x001c }
            r2.setVisibility(r0);	 Catch:{ Exception -> 0x001c }
            goto L_0x001d;
        L_0x001d:
            if (r3 == 0) goto L_0x0071;
        L_0x001f:
            r2 = r3 instanceof com.cuvora.carinfo.models.GarageResult;
            if (r2 == 0) goto L_0x0071;
        L_0x0023:
            r2 = r1.f14888a;
            r3 = (com.cuvora.carinfo.models.GarageResult) r3;
            r2.f21041m = r3;
            r2 = r1.f14888a;
            r2 = r2.f21041m;
            if (r2 == 0) goto L_0x0065;
        L_0x0032:
            r2 = r2.getVehicleNumbers();
            if (r2 == 0) goto L_0x0065;
        L_0x0038:
            r3 = r1.f14889b;
            r2 = r2.contains(r3);
            if (r2 != 0) goto L_0x0065;
        L_0x0040:
            r2 = r1.f14888a;
            r2 = r2.f21041m;
            if (r2 == 0) goto L_0x0065;
        L_0x0048:
            r2 = r2.getMyGarageVehicles();
            if (r2 == 0) goto L_0x0065;
        L_0x004e:
            r3 = r1.f14889b;
            r2 = r2.contains(r3);
            if (r2 != 0) goto L_0x0065;
        L_0x0056:
            r2 = r1.f14888a;
            r2 = r2.getContext();
            r2 = com.cuvora.carinfo.helpers.C3688b.m18507a(r2);
            r3 = r1.f14889b;
            r2.m18510a(r3);
        L_0x0065:
            r2 = r1.f14888a;
            r2 = r2.getContext();
            r3 = "Deleted!";
            com.cuvora.carinfo.helpers.C1570t.m5985a(r2, r3);
            goto L_0x0088;
        L_0x0071:
            r2 = r1;
            r2 = (com.cuvora.carinfo.fragment.C4804h.C3671b) r2;
            r2 = r1.f14888a;
            r2 = r2.getActivity();
            r2 = (android.content.Context) r2;
            r3 = "Updation failed, Please try again! ";
            r3 = (java.lang.CharSequence) r3;
            r0 = 0;
            r2 = android.widget.Toast.makeText(r2, r3, r0);
            r2.show();
        L_0x0088:
            r2 = r1.f14888a;
            r2.m27805q();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.fragment.h.b.a(android.support.v4.content.c, com.cuvora.carinfo.models.Response):void");
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$c */
    public static final class C3672c implements C1475a {
        /* renamed from: a */
        final /* synthetic */ C4804h f14890a;

        /* renamed from: com.cuvora.carinfo.fragment.h$c$a */
        static final class C1503a implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C3672c f4489a;
            /* renamed from: b */
            final /* synthetic */ boolean f4490b;
            /* renamed from: c */
            final /* synthetic */ VehicleSearchResult f4491c;

            C1503a(C3672c c3672c, boolean z, VehicleSearchResult vehicleSearchResult) {
                this.f4489a = c3672c;
                this.f4490b = z;
                this.f4491c = vehicleSearchResult;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface = new Bundle();
                dialogInterface.putString(this.f4489a.f14890a.m27815h(), this.f4491c.getVehicleNum());
                dialogInterface.putSerializable(this.f4489a.f14890a.m27816i(), Action.DELETE);
                dialogInterface.putSerializable(this.f4489a.f14890a.m27817j(), this.f4490b ? Type.GARAGE : Type.RECENT);
                i = this.f4489a.f14890a.getLoaderManager();
                if (i != 0) {
                    dialogInterface = i.mo264a(this.f4489a.f14890a.f21040l, dialogInterface, this.f4489a.f14890a.m27814g());
                    if (dialogInterface != null) {
                        dialogInterface.m1455m();
                    }
                }
            }
        }

        /* renamed from: com.cuvora.carinfo.fragment.h$c$b */
        static final class C1504b implements OnClickListener {
            /* renamed from: a */
            public static final C1504b f4492a = new C1504b();

            C1504b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: b */
        public void mo1196b(LicenseDetailsModel licenseDetailsModel) {
            C2885g.m13910b(licenseDetailsModel, "licenseDetailsModel");
        }

        C3672c(C4804h c4804h) {
            this.f14890a = c4804h;
        }

        /* renamed from: a */
        public void mo1192a(LicenseDetailsModel licenseDetailsModel) {
            C2885g.m13910b(licenseDetailsModel, "licenseDetailsModel");
            Intent intent = new Intent(this.f14890a.getContext(), LicenseInfoActivity.class);
            intent.putExtra("license_data", licenseDetailsModel);
            this.f14890a.startActivity(intent);
        }

        /* renamed from: a */
        public void mo1191a() {
            Intent intent = new Intent(this.f14890a.getContext(), MyGarageActivity.class);
            intent.putExtra("key_mode", 0);
            this.f14890a.startActivity(intent);
        }

        /* renamed from: a */
        public void mo1193a(VehicleSearchResult vehicleSearchResult) {
            C2885g.m13910b(vehicleSearchResult, "vehicleSearchResult");
            C1540d.m5833i();
            this.f14890a.m27796a(vehicleSearchResult);
        }

        /* renamed from: a */
        public void mo1195a(boolean z) {
            if (z) {
                Object obj = (AppCompatButton) this.f14890a.mo4626a(C1487a.btnUpdate);
                C2885g.m13907a(obj, "btnUpdate");
                obj.setVisibility(0);
                return;
            }
            obj = (AppCompatButton) this.f14890a.mo4626a(C1487a.btnUpdate);
            C2885g.m13907a(obj, "btnUpdate");
            obj.setVisibility(8);
        }

        /* renamed from: b */
        public void mo1197b(VehicleSearchResult vehicleSearchResult) {
            C2885g.m13910b(vehicleSearchResult, "vehicleSearchResult");
            C1540d.m5833i();
            this.f14890a.m27796a(vehicleSearchResult);
        }

        /* renamed from: a */
        public void mo1194a(VehicleSearchResult vehicleSearchResult, boolean z) {
            C2885g.m13910b(vehicleSearchResult, "vehicleSearchResult");
            Context context = this.f14890a.getContext();
            if (context != null) {
                if (C1547j.m5914d(this.f14890a.getActivity())) {
                    C0661a c0661a = new C0661a(context);
                    C2888j c2888j = C2888j.f12093a;
                    Object string = this.f14890a.getResources().getString(R.string.delete_confirmation);
                    C2885g.m13907a(string, "resources.getString(R.string.delete_confirmation)");
                    Object[] objArr = new Object[1];
                    objArr[0] = z ? "garage" : "recent searches";
                    string = String.format(string, Arrays.copyOf(objArr, objArr.length));
                    C2885g.m13907a(string, "java.lang.String.format(format, *args)");
                    c0661a.m2643b((CharSequence) string);
                    c0661a.m2640a((CharSequence) "YES", (OnClickListener) new C1503a(this, z, vehicleSearchResult));
                    c0661a.m2644b("CANCEL", (OnClickListener) C1504b.f4492a);
                    c0661a.m2641a(true);
                    c0661a.m2645b().show();
                } else {
                    C1570t.m5978a((Activity) this.f14890a.getActivity());
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$d */
    public static final class C3673d implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ C4804h f14891a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
            C2885g.m13910b(c0392c, "loader");
        }

        C3673d(C4804h c4804h) {
            this.f14891a = c4804h;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            i = this.f14891a.getView();
            if (i != 0) {
                i = i.findViewById(R.id.pb);
                if (i != 0) {
                    i.setVisibility(0);
                }
            }
            return (C0392c) new C4567i(this.f14891a.getContext(), bundle != null ? bundle.getString(this.f14891a.m27818k()) : null);
        }

        /* renamed from: a */
        public void m18479a(C0392c<Response> c0392c, Response response) {
            C2885g.m13910b(c0392c, "loader");
            try {
                c0392c = this.f14891a.getView();
                if (c0392c != null) {
                    c0392c = c0392c.findViewById(R.id.pb);
                    if (c0392c != null) {
                        c0392c.setVisibility(8);
                    }
                }
            } catch (C0392c<Response> c0392c2) {
                c0392c2.printStackTrace();
            }
            if (!(response == null || (response instanceof GarageResult) == null)) {
                this.f14891a.f21041m = (GarageResult) response;
                c0392c2 = this.f14891a.f21041m;
                c0392c2 = c0392c2 != null ? c0392c2.getVehicleSearchResultList() : null;
                if (c0392c2 != null) {
                    c0392c2 = c0392c2.iterator();
                    while (c0392c2.hasNext() != null) {
                        C3688b.m18507a(this.f14891a.getContext()).m18509a((VehicleSearchResult) c0392c2.next());
                    }
                }
            }
            this.f14891a.m27805q();
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.h$k */
    public static final class C3674k extends C1579s {
        /* renamed from: a */
        final /* synthetic */ C4804h f14892a;

        C3674k(C4804h c4804h, Context context, boolean z, GarageResult garageResult) {
            this.f14892a = c4804h;
            super(context, z, garageResult);
        }

        public /* synthetic */ void onPostExecute(Object obj) {
            mo1198a((GarageResult) obj);
        }

        /* renamed from: a */
        protected void mo1198a(com.cuvora.carinfo.models.GarageResult r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            if (r3 == 0) goto L_0x000f;
        L_0x0002:
            r0 = r3.getUserId();
            if (r0 == 0) goto L_0x000f;
        L_0x0008:
            r1 = io.branch.referral.Branch.m23406b();
            r1.m23451a(r0);
        L_0x000f:
            r0 = r2.f14892a;	 Catch:{ Exception -> 0x0026 }
            r0 = r0.getView();	 Catch:{ Exception -> 0x0026 }
            if (r0 == 0) goto L_0x0027;	 Catch:{ Exception -> 0x0026 }
        L_0x0017:
            r1 = 2131231064; // 0x7f080158 float:1.8078198E38 double:1.052968052E-314;	 Catch:{ Exception -> 0x0026 }
            r0 = r0.findViewById(r1);	 Catch:{ Exception -> 0x0026 }
            if (r0 == 0) goto L_0x0027;	 Catch:{ Exception -> 0x0026 }
        L_0x0020:
            r1 = 8;	 Catch:{ Exception -> 0x0026 }
            r0.setVisibility(r1);	 Catch:{ Exception -> 0x0026 }
            goto L_0x0027;
        L_0x0027:
            super.onPostExecute(r3);
            r3 = r2.f14892a;
            r3 = r3.getActivity();
            r3 = r3 instanceof com.cuvora.carinfo.MyGarageActivity;
            if (r3 == 0) goto L_0x005f;
        L_0x0034:
            r3 = r2.f14892a;
            r3 = r3.getActivity();
            if (r3 == 0) goto L_0x0057;
        L_0x003c:
            r3 = (com.cuvora.carinfo.MyGarageActivity) r3;
            r0 = r2.f14892a;
            r0 = r0.mo4634f();
            if (r0 != 0) goto L_0x0049;
        L_0x0046:
            r0 = "Edit Profile";
            goto L_0x0053;
        L_0x0049:
            r0 = r2.f14892a;
            r0 = r0.getContext();
            r0 = com.cuvora.carinfo.helpers.C1570t.m6031p(r0);
        L_0x0053:
            r3.m29992a(r0);
            goto L_0x005f;
        L_0x0057:
            r3 = new kotlin.TypeCastException;
            r0 = "null cannot be cast to non-null type com.cuvora.carinfo.MyGarageActivity";
            r3.<init>(r0);
            throw r3;
        L_0x005f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.fragment.h.k.a(com.cuvora.carinfo.models.GarageResult):void");
        }
    }

    /* renamed from: a */
    public View mo4626a(int i) {
        if (this.f21047t == null) {
            this.f21047t = new HashMap();
        }
        View view = (View) this.f21047t.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21047t.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo4629e() {
        if (this.f21047t != null) {
            this.f21047t.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4629e();
    }

    /* renamed from: f */
    public final int mo4634f() {
        return this.f21031c;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.view_my_garage, viewGroup, false);
    }

    /* renamed from: b */
    public void mo4630b() {
        int i;
        super.mo4630b();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments = arguments.getBundle("tab_bundle");
            if (arguments != null) {
                i = arguments.getInt("key_mode");
                this.f21031c = i;
            }
        }
        i = 2;
        this.f21031c = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        ((AppCompatButton) mo4626a(C1487a.btnUpdate)).setOnClickListener((View.OnClickListener) new C1507g(this));
        ((TextView) mo4626a(C1487a.tvSearchNow)).setOnClickListener((View.OnClickListener) new C1508h(this));
        if ((getActivity() instanceof MyGarageActivity) != null) {
            view = getActivity();
            if (view != null) {
                ((MyGarageActivity) view).m29992a(this.f21031c == null ? "Edit Profile" : C1570t.m6031p(getContext()));
                Object a = mo4626a(C1487a.layoutContact);
                C2885g.m13907a(a, "layoutContact");
                a.setVisibility(8);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.MyGarageActivity");
            }
        }
        m27804p();
        ((AppCompatTextView) mo4626a(C1487a.tvContactUs)).setOnClickListener((View.OnClickListener) new C1509i(this));
        ((AppCompatTextView) mo4626a(C1487a.tvAboutUs)).setOnClickListener((View.OnClickListener) new C1510j(this));
    }

    /* renamed from: m */
    private final boolean m27801m() {
        if (f21030s == null) {
            return false;
        }
        C1482g c1482g = f21030s;
        String str = null;
        if (C1562q.m5946a(c1482g != null ? c1482g.f_() : null)) {
            int length;
            c1482g = f21030s;
            if (c1482g != null) {
                String f_ = c1482g.f_();
                if (f_ != null) {
                    length = f_.length();
                    if (length < 3) {
                        Toast.makeText(getContext(), "Please enter a valid name!", 0).show();
                        return false;
                    }
                }
            }
            length = 0;
            if (length < 3) {
                Toast.makeText(getContext(), "Please enter a valid name!", 0).show();
                return false;
            }
        }
        c1482g = f21030s;
        if (C1562q.m5946a(c1482g != null ? c1482g.mo3924b() : null)) {
            c1482g = f21030s;
            if (!C1570t.m6008c(c1482g != null ? c1482g.mo3924b() : null)) {
                Toast.makeText(getContext(), "Please enter a valid email id!", 0).show();
                return false;
            }
        }
        c1482g = f21030s;
        if (C1562q.m5946a(c1482g != null ? c1482g.mo3925c() : null)) {
            c1482g = f21030s;
            if (c1482g != null) {
                str = c1482g.mo3925c();
            }
            if (!C1570t.m6001b(str)) {
                Toast.makeText(getContext(), "Please enter a valid 10 digit mobile!", 0).show();
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private final void m27802n() {
        if (m27801m()) {
            C1482g c1482g;
            GarageResult garageResult = this.f21041m;
            String str = null;
            if (garageResult != null) {
                c1482g = f21030s;
                garageResult.setEmail(c1482g != null ? c1482g.mo3924b() : null);
            }
            garageResult = this.f21041m;
            if (garageResult != null) {
                c1482g = f21030s;
                garageResult.setName(c1482g != null ? c1482g.f_() : null);
            }
            garageResult = this.f21041m;
            if (garageResult != null) {
                c1482g = f21030s;
                if (c1482g != null) {
                    str = c1482g.mo3925c();
                }
                garageResult.setMobileNumber(str);
            }
            m27803o();
            Object obj = (AppCompatButton) mo4626a(C1487a.btnUpdate);
            C2885g.m13907a(obj, "btnUpdate");
            obj.setVisibility(8);
            C1482g c1482g2 = f21030s;
            if (c1482g2 != null) {
                c1482g2.mo3926d();
            }
            Toast.makeText(getContext(), "Updated!", 0).show();
            C1570t.m5983a(getContext(), getView());
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: o */
    private final void m27803o() {
        View view = getView();
        if (view != null) {
            view = view.findViewById(R.id.pb);
            if (view != null) {
                view.setVisibility(0);
            }
        }
        new C3674k(this, getContext(), false, this.f21041m).execute(new Void[0]);
    }

    /* renamed from: p */
    private final void m27804p() {
        this.f21041m = new GarageResult();
        Object a = C3688b.m18507a(getContext());
        C2885g.m13907a(a, "DatabaseHelper.getInstance(context)");
        this.f21044p = a.m18511b();
        this.f21042n = new C4542d(this, this.f21046r);
        a = (RecyclerView) mo4626a(C1487a.recyclerView);
        C2885g.m13907a(a, "recyclerView");
        a.setLayoutManager(new LinearLayoutManager(getContext()));
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        List<VehicleSearchResult> list = this.f21044p;
        if (list != null) {
            for (VehicleSearchResult vehicleNum : list) {
                arrayList.add(vehicleNum.getVehicleNum());
            }
        }
        bundle.putString(this.f21039k, TextUtils.join(",", arrayList));
        C0363u loaderManager = getLoaderManager();
        if (loaderManager != null) {
            C0392c a2 = loaderManager.mo264a(this.f21043o, bundle, this.f21045q);
            if (a2 != null) {
                a2.m1455m();
            }
        }
    }

    /* renamed from: g */
    public final C0362a<Response> m27814g() {
        return this.f21032d;
    }

    /* renamed from: q */
    private final void m27805q() {
        this.f21041m = C1570t.m6026k(getContext());
        if (getActivity() instanceof MyGarageActivity) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ((MyGarageActivity) activity).m29992a(this.f21031c == 0 ? "Edit Profile" : C1570t.m6031p(getContext()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.MyGarageActivity");
            }
        }
        Object a = C3688b.m18507a(getContext());
        C2885g.m13907a(a, "DatabaseHelper.getInstance(context)");
        this.f21044p = a.m18511b();
        List list = this.f21044p;
        if (list != null) {
            Collection collection = list;
            if ((collection.isEmpty() ^ 1) != 0) {
                Object obj = (LinearLayout) mo4626a(C1487a.llPlaceholder);
                C2885g.m13907a(obj, "llPlaceholder");
                obj.setVisibility(8);
                int size = collection.size();
                for (int i = 0; i < size; i++) {
                    VehicleSearchResult a2 = C1545h.m5871a(((VehicleSearchResult) list.get(i)).getJsonString());
                    if (a2 != null) {
                        list.set(i, a2);
                    } else {
                        list.remove(i);
                    }
                }
            } else {
                a = (LinearLayout) mo4626a(C1487a.llPlaceholder);
                C2885g.m13907a(a, "llPlaceholder");
                a.setVisibility(0);
            }
            a = (RecyclerView) mo4626a(C1487a.recyclerView);
            C2885g.m13907a(a, "recyclerView");
            if (a.getAdapter() == null) {
                a = (RecyclerView) mo4626a(C1487a.recyclerView);
                C2885g.m13907a(a, "recyclerView");
                a.setAdapter(this.f21042n);
            } else {
                C4542d c4542d = this.f21042n;
                if (c4542d != null) {
                    c4542d.m2967e();
                }
            }
        }
        if (this.f21044p == null) {
            a = (LinearLayout) mo4626a(C1487a.llPlaceholder);
            C2885g.m13907a(a, "llPlaceholder");
            a.setVisibility(0);
        }
    }

    /* renamed from: a */
    private final void m27796a(VehicleSearchResult vehicleSearchResult) {
        Intent intent = new Intent(getContext(), VehicleInfoActivity.class);
        intent.putExtra("KEY_VEHICLE_INFO", vehicleSearchResult);
        startActivityForResult(intent, 200);
    }

    /* renamed from: e */
    public Object mo4633e(int i) {
        List myGarageVehicles;
        int size;
        Object obj;
        List<VehicleSearchResult> list;
        String vehicleNum;
        GarageResult garageResult;
        List myGarageVehicles2;
        String str;
        List<VehicleSearchResult> list2;
        GarageResult garageResult2 = this.f21041m;
        if (garageResult2 != null) {
            myGarageVehicles = garageResult2.getMyGarageVehicles();
            if (myGarageVehicles != null) {
                size = myGarageVehicles.size();
                obj = null;
                switch (mo4631d(i)) {
                    case 0:
                        return "Update Details";
                    case 1:
                        return this.f21041m;
                    case 2:
                        return "My Vehicles";
                    case 3:
                        list = this.f21044p;
                        if (list != null) {
                            for (VehicleSearchResult vehicleSearchResult : list) {
                                vehicleNum = vehicleSearchResult.getVehicleNum();
                                garageResult = this.f21041m;
                                if (garageResult != null) {
                                    myGarageVehicles2 = garageResult.getMyGarageVehicles();
                                    if (myGarageVehicles2 != null) {
                                        str = (String) myGarageVehicles2.get(i - 3);
                                        if (C4883n.m30195a(vehicleNum, str, true)) {
                                            return vehicleSearchResult;
                                        }
                                    }
                                }
                                str = null;
                                if (C4883n.m30195a(vehicleNum, str, true)) {
                                    return vehicleSearchResult;
                                }
                            }
                            break;
                        }
                        break;
                    case 4:
                        return "Recent Vehicles";
                    case 5:
                        list2 = this.f21044p;
                        if (list2 != null) {
                            for (VehicleSearchResult vehicleSearchResult2 : list2) {
                                if (size <= 0) {
                                    garageResult = this.f21041m;
                                    if (garageResult != null) {
                                        myGarageVehicles2 = garageResult.getVehicleNumbers();
                                        if (myGarageVehicles2 != null) {
                                            str = (String) myGarageVehicles2.get((i - 4) - size);
                                            if (str != null) {
                                            }
                                        }
                                    }
                                    str = "";
                                } else {
                                    garageResult = this.f21041m;
                                    if (garageResult != null) {
                                        myGarageVehicles2 = garageResult.getVehicleNumbers();
                                        if (myGarageVehicles2 != null) {
                                            str = (String) myGarageVehicles2.get(i - 3);
                                            if (str != null) {
                                            }
                                        }
                                    }
                                    str = "";
                                }
                                if (C4883n.m30195a(vehicleSearchResult2.getVehicleNum(), str, true)) {
                                    return vehicleSearchResult2;
                                }
                            }
                            break;
                        }
                        break;
                    case 6:
                        return "My Details";
                    case 7:
                        return this.f21041m;
                    case 8:
                        if (this.f21033e <= 0 && this.f21034f > 0) {
                            i -= (this.f21033e + 5) + this.f21034f;
                            garageResult2 = this.f21041m;
                            if (garageResult2 != null) {
                                myGarageVehicles = garageResult2.getLicenceDetails();
                                if (myGarageVehicles != null) {
                                    obj = (LicenseDetailsModel) myGarageVehicles.get(i);
                                }
                            }
                            return obj;
                        } else if (this.f21033e <= 0 && this.f21034f == 0) {
                            i -= this.f21033e + 4;
                            garageResult2 = this.f21041m;
                            if (garageResult2 != null) {
                                myGarageVehicles = garageResult2.getLicenceDetails();
                                if (myGarageVehicles != null) {
                                    obj = (LicenseDetailsModel) myGarageVehicles.get(i);
                                }
                            }
                            return obj;
                        } else if (this.f21033e == 0 || this.f21034f <= 0) {
                            i -= 3;
                            garageResult2 = this.f21041m;
                            if (garageResult2 != null) {
                                myGarageVehicles = garageResult2.getLicenceDetails();
                                if (myGarageVehicles != null) {
                                    obj = (LicenseDetailsModel) myGarageVehicles.get(i);
                                }
                            }
                            return obj;
                        } else {
                            i -= this.f21034f + 4;
                            garageResult2 = this.f21041m;
                            if (garageResult2 != null) {
                                myGarageVehicles = garageResult2.getLicenceDetails();
                                if (myGarageVehicles != null) {
                                    obj = (LicenseDetailsModel) myGarageVehicles.get(i);
                                }
                            }
                            return obj;
                        }
                    case 9:
                        return "Recent Searched Licences";
                    default:
                        break;
                }
                return null;
            }
        }
        size = 0;
        obj = null;
        switch (mo4631d(i)) {
            case 0:
                return "Update Details";
            case 1:
                return this.f21041m;
            case 2:
                return "My Vehicles";
            case 3:
                list = this.f21044p;
                if (list != null) {
                    for (VehicleSearchResult vehicleSearchResult3 : list) {
                        vehicleNum = vehicleSearchResult3.getVehicleNum();
                        garageResult = this.f21041m;
                        if (garageResult != null) {
                            myGarageVehicles2 = garageResult.getMyGarageVehicles();
                            if (myGarageVehicles2 != null) {
                                str = (String) myGarageVehicles2.get(i - 3);
                                if (C4883n.m30195a(vehicleNum, str, true)) {
                                    return vehicleSearchResult3;
                                }
                            }
                        }
                        str = null;
                        if (C4883n.m30195a(vehicleNum, str, true)) {
                            return vehicleSearchResult3;
                        }
                    }
                    break;
                }
                break;
            case 4:
                return "Recent Vehicles";
            case 5:
                list2 = this.f21044p;
                if (list2 != null) {
                    for (VehicleSearchResult vehicleSearchResult22 : list2) {
                        if (size <= 0) {
                            garageResult = this.f21041m;
                            if (garageResult != null) {
                                myGarageVehicles2 = garageResult.getVehicleNumbers();
                                if (myGarageVehicles2 != null) {
                                    str = (String) myGarageVehicles2.get(i - 3);
                                    if (str != null) {
                                    }
                                }
                            }
                            str = "";
                        } else {
                            garageResult = this.f21041m;
                            if (garageResult != null) {
                                myGarageVehicles2 = garageResult.getVehicleNumbers();
                                if (myGarageVehicles2 != null) {
                                    str = (String) myGarageVehicles2.get((i - 4) - size);
                                    if (str != null) {
                                    }
                                }
                            }
                            str = "";
                        }
                        if (C4883n.m30195a(vehicleSearchResult22.getVehicleNum(), str, true)) {
                            return vehicleSearchResult22;
                        }
                    }
                    break;
                }
                break;
            case 6:
                return "My Details";
            case 7:
                return this.f21041m;
            case 8:
                if (this.f21033e <= 0) {
                    break;
                }
                if (this.f21033e <= 0) {
                    break;
                }
                if (this.f21033e == 0) {
                    break;
                }
                i -= 3;
                garageResult2 = this.f21041m;
                if (garageResult2 != null) {
                    myGarageVehicles = garageResult2.getLicenceDetails();
                    if (myGarageVehicles != null) {
                        obj = (LicenseDetailsModel) myGarageVehicles.get(i);
                    }
                }
                return obj;
            case 9:
                return "Recent Searched Licences";
            default:
                break;
        }
        return null;
    }

    /* renamed from: l */
    public int mo4635l() {
        int i = 0;
        if (this.f21041m == null) {
            return 0;
        }
        int intValue;
        GarageResult garageResult;
        List vehicleNumbers;
        Integer valueOf;
        int intValue2;
        GarageResult garageResult2;
        List licenceSearches;
        GarageResult garageResult3;
        List licenceSearches2;
        int i2;
        GarageResult garageResult4 = this.f21041m;
        Integer num = null;
        if (garageResult4 != null) {
            List myGarageVehicles = garageResult4.getMyGarageVehicles();
            if (!(myGarageVehicles == null || myGarageVehicles.isEmpty())) {
                Integer valueOf2;
                garageResult4 = this.f21041m;
                if (garageResult4 != null) {
                    myGarageVehicles = garageResult4.getMyGarageVehicles();
                    if (myGarageVehicles != null) {
                        valueOf2 = Integer.valueOf(myGarageVehicles.size());
                        if (valueOf2 == null) {
                            C2885g.m13906a();
                        }
                        intValue = valueOf2.intValue() + 1;
                        garageResult = this.f21041m;
                        if (garageResult != null) {
                            vehicleNumbers = garageResult.getVehicleNumbers();
                            if (!(vehicleNumbers == null || vehicleNumbers.isEmpty())) {
                                garageResult = this.f21041m;
                                if (garageResult != null) {
                                    vehicleNumbers = garageResult.getVehicleNumbers();
                                    if (vehicleNumbers != null) {
                                        valueOf = Integer.valueOf(vehicleNumbers.size());
                                        if (valueOf == null) {
                                            C2885g.m13906a();
                                        }
                                        intValue2 = valueOf.intValue() + 1;
                                        garageResult2 = this.f21041m;
                                        if (garageResult2 != null) {
                                            licenceSearches = garageResult2.getLicenceSearches();
                                            if (!(licenceSearches == null || licenceSearches.isEmpty())) {
                                                garageResult3 = this.f21041m;
                                                if (garageResult3 != null) {
                                                    licenceSearches2 = garageResult3.getLicenceSearches();
                                                    if (licenceSearches2 != null) {
                                                        num = Integer.valueOf(licenceSearches2.size());
                                                    }
                                                }
                                                if (num == null) {
                                                    C2885g.m13906a();
                                                }
                                                i = num.intValue() + 1;
                                            }
                                        }
                                        i2 = 2;
                                        switch (this.f21031c) {
                                            case 0:
                                                break;
                                            case 1:
                                                i2 = ((intValue + 2) + intValue2) + i;
                                                break;
                                            case 2:
                                                i2 = ((intValue + 2) + intValue2) + i;
                                                break;
                                            default:
                                                i2 = ((intValue + 2) + intValue2) + i;
                                                break;
                                        }
                                        return i2;
                                    }
                                }
                                valueOf = null;
                                if (valueOf == null) {
                                    C2885g.m13906a();
                                }
                                intValue2 = valueOf.intValue() + 1;
                                garageResult2 = this.f21041m;
                                if (garageResult2 != null) {
                                    licenceSearches = garageResult2.getLicenceSearches();
                                    garageResult3 = this.f21041m;
                                    if (garageResult3 != null) {
                                        licenceSearches2 = garageResult3.getLicenceSearches();
                                        if (licenceSearches2 != null) {
                                            num = Integer.valueOf(licenceSearches2.size());
                                        }
                                    }
                                    if (num == null) {
                                        C2885g.m13906a();
                                    }
                                    i = num.intValue() + 1;
                                }
                                i2 = 2;
                                switch (this.f21031c) {
                                    case 0:
                                        break;
                                    case 1:
                                        i2 = ((intValue + 2) + intValue2) + i;
                                        break;
                                    case 2:
                                        i2 = ((intValue + 2) + intValue2) + i;
                                        break;
                                    default:
                                        i2 = ((intValue + 2) + intValue2) + i;
                                        break;
                                }
                                return i2;
                            }
                        }
                        intValue2 = 0;
                        garageResult2 = this.f21041m;
                        if (garageResult2 != null) {
                            licenceSearches = garageResult2.getLicenceSearches();
                            garageResult3 = this.f21041m;
                            if (garageResult3 != null) {
                                licenceSearches2 = garageResult3.getLicenceSearches();
                                if (licenceSearches2 != null) {
                                    num = Integer.valueOf(licenceSearches2.size());
                                }
                            }
                            if (num == null) {
                                C2885g.m13906a();
                            }
                            i = num.intValue() + 1;
                        }
                        i2 = 2;
                        switch (this.f21031c) {
                            case 0:
                                break;
                            case 1:
                                i2 = ((intValue + 2) + intValue2) + i;
                                break;
                            case 2:
                                i2 = ((intValue + 2) + intValue2) + i;
                                break;
                            default:
                                i2 = ((intValue + 2) + intValue2) + i;
                                break;
                        }
                        return i2;
                    }
                }
                valueOf2 = null;
                if (valueOf2 == null) {
                    C2885g.m13906a();
                }
                intValue = valueOf2.intValue() + 1;
                garageResult = this.f21041m;
                if (garageResult != null) {
                    vehicleNumbers = garageResult.getVehicleNumbers();
                    garageResult = this.f21041m;
                    if (garageResult != null) {
                        vehicleNumbers = garageResult.getVehicleNumbers();
                        if (vehicleNumbers != null) {
                            valueOf = Integer.valueOf(vehicleNumbers.size());
                            if (valueOf == null) {
                                C2885g.m13906a();
                            }
                            intValue2 = valueOf.intValue() + 1;
                            garageResult2 = this.f21041m;
                            if (garageResult2 != null) {
                                licenceSearches = garageResult2.getLicenceSearches();
                                garageResult3 = this.f21041m;
                                if (garageResult3 != null) {
                                    licenceSearches2 = garageResult3.getLicenceSearches();
                                    if (licenceSearches2 != null) {
                                        num = Integer.valueOf(licenceSearches2.size());
                                    }
                                }
                                if (num == null) {
                                    C2885g.m13906a();
                                }
                                i = num.intValue() + 1;
                            }
                            i2 = 2;
                            switch (this.f21031c) {
                                case 0:
                                    break;
                                case 1:
                                    i2 = ((intValue + 2) + intValue2) + i;
                                    break;
                                case 2:
                                    i2 = ((intValue + 2) + intValue2) + i;
                                    break;
                                default:
                                    i2 = ((intValue + 2) + intValue2) + i;
                                    break;
                            }
                            return i2;
                        }
                    }
                    valueOf = null;
                    if (valueOf == null) {
                        C2885g.m13906a();
                    }
                    intValue2 = valueOf.intValue() + 1;
                    garageResult2 = this.f21041m;
                    if (garageResult2 != null) {
                        licenceSearches = garageResult2.getLicenceSearches();
                        garageResult3 = this.f21041m;
                        if (garageResult3 != null) {
                            licenceSearches2 = garageResult3.getLicenceSearches();
                            if (licenceSearches2 != null) {
                                num = Integer.valueOf(licenceSearches2.size());
                            }
                        }
                        if (num == null) {
                            C2885g.m13906a();
                        }
                        i = num.intValue() + 1;
                    }
                    i2 = 2;
                    switch (this.f21031c) {
                        case 0:
                            break;
                        case 1:
                            i2 = ((intValue + 2) + intValue2) + i;
                            break;
                        case 2:
                            i2 = ((intValue + 2) + intValue2) + i;
                            break;
                        default:
                            i2 = ((intValue + 2) + intValue2) + i;
                            break;
                    }
                    return i2;
                }
                intValue2 = 0;
                garageResult2 = this.f21041m;
                if (garageResult2 != null) {
                    licenceSearches = garageResult2.getLicenceSearches();
                    garageResult3 = this.f21041m;
                    if (garageResult3 != null) {
                        licenceSearches2 = garageResult3.getLicenceSearches();
                        if (licenceSearches2 != null) {
                            num = Integer.valueOf(licenceSearches2.size());
                        }
                    }
                    if (num == null) {
                        C2885g.m13906a();
                    }
                    i = num.intValue() + 1;
                }
                i2 = 2;
                switch (this.f21031c) {
                    case 0:
                        break;
                    case 1:
                        i2 = ((intValue + 2) + intValue2) + i;
                        break;
                    case 2:
                        i2 = ((intValue + 2) + intValue2) + i;
                        break;
                    default:
                        i2 = ((intValue + 2) + intValue2) + i;
                        break;
                }
                return i2;
            }
        }
        intValue = 0;
        garageResult = this.f21041m;
        if (garageResult != null) {
            vehicleNumbers = garageResult.getVehicleNumbers();
            garageResult = this.f21041m;
            if (garageResult != null) {
                vehicleNumbers = garageResult.getVehicleNumbers();
                if (vehicleNumbers != null) {
                    valueOf = Integer.valueOf(vehicleNumbers.size());
                    if (valueOf == null) {
                        C2885g.m13906a();
                    }
                    intValue2 = valueOf.intValue() + 1;
                    garageResult2 = this.f21041m;
                    if (garageResult2 != null) {
                        licenceSearches = garageResult2.getLicenceSearches();
                        garageResult3 = this.f21041m;
                        if (garageResult3 != null) {
                            licenceSearches2 = garageResult3.getLicenceSearches();
                            if (licenceSearches2 != null) {
                                num = Integer.valueOf(licenceSearches2.size());
                            }
                        }
                        if (num == null) {
                            C2885g.m13906a();
                        }
                        i = num.intValue() + 1;
                    }
                    i2 = 2;
                    switch (this.f21031c) {
                        case 0:
                            break;
                        case 1:
                            i2 = ((intValue + 2) + intValue2) + i;
                            break;
                        case 2:
                            i2 = ((intValue + 2) + intValue2) + i;
                            break;
                        default:
                            i2 = ((intValue + 2) + intValue2) + i;
                            break;
                    }
                    return i2;
                }
            }
            valueOf = null;
            if (valueOf == null) {
                C2885g.m13906a();
            }
            intValue2 = valueOf.intValue() + 1;
            garageResult2 = this.f21041m;
            if (garageResult2 != null) {
                licenceSearches = garageResult2.getLicenceSearches();
                garageResult3 = this.f21041m;
                if (garageResult3 != null) {
                    licenceSearches2 = garageResult3.getLicenceSearches();
                    if (licenceSearches2 != null) {
                        num = Integer.valueOf(licenceSearches2.size());
                    }
                }
                if (num == null) {
                    C2885g.m13906a();
                }
                i = num.intValue() + 1;
            }
            i2 = 2;
            switch (this.f21031c) {
                case 0:
                    break;
                case 1:
                    i2 = ((intValue + 2) + intValue2) + i;
                    break;
                case 2:
                    i2 = ((intValue + 2) + intValue2) + i;
                    break;
                default:
                    i2 = ((intValue + 2) + intValue2) + i;
                    break;
            }
            return i2;
        }
        intValue2 = 0;
        garageResult2 = this.f21041m;
        if (garageResult2 != null) {
            licenceSearches = garageResult2.getLicenceSearches();
            garageResult3 = this.f21041m;
            if (garageResult3 != null) {
                licenceSearches2 = garageResult3.getLicenceSearches();
                if (licenceSearches2 != null) {
                    num = Integer.valueOf(licenceSearches2.size());
                }
            }
            if (num == null) {
                C2885g.m13906a();
            }
            i = num.intValue() + 1;
        }
        i2 = 2;
        switch (this.f21031c) {
            case 0:
                break;
            case 1:
                i2 = ((intValue + 2) + intValue2) + i;
                break;
            case 2:
                i2 = ((intValue + 2) + intValue2) + i;
                break;
            default:
                i2 = ((intValue + 2) + intValue2) + i;
                break;
        }
        return i2;
    }

    /* renamed from: d */
    public int mo4631d(int i) {
        int size;
        GarageResult garageResult;
        List vehicleNumbers;
        int size2;
        GarageResult garageResult2;
        List licenceSearches;
        int size3;
        int i2;
        int i3;
        int i4;
        GarageResult garageResult3 = this.f21041m;
        int i5 = 0;
        if (garageResult3 != null) {
            List myGarageVehicles = garageResult3.getMyGarageVehicles();
            if (myGarageVehicles != null) {
                size = myGarageVehicles.size();
                garageResult = this.f21041m;
                if (garageResult != null) {
                    vehicleNumbers = garageResult.getVehicleNumbers();
                    if (vehicleNumbers != null) {
                        size2 = vehicleNumbers.size();
                        garageResult2 = this.f21041m;
                        if (garageResult2 != null) {
                            licenceSearches = garageResult2.getLicenceSearches();
                            if (licenceSearches != null) {
                                size3 = licenceSearches.size();
                                this.f21033e = size;
                                this.f21034f = size2;
                                this.f21035g = size3;
                                i2 = size <= 0 ? 2 : -1;
                                i3 = size2 <= 0 ? size <= 0 ? size + 3 : 2 : -1;
                                i4 = 3;
                                size = size3 <= 0 ? (i2 != -1 || i3 == -1) ? (i2 == -1 || i3 == -1) ? (i2 == -1 && i3 == -1) ? size + 3 : 2 : size2 + 3 : (size + 4) + size2 : -1;
                                if (i != 0) {
                                    switch (this.f21031c) {
                                        case 0:
                                        case 1:
                                            break;
                                        case 2:
                                            i5 = 6;
                                            break;
                                        default:
                                            break;
                                    }
                                    return i5;
                                }
                                i5 = 1;
                                if (i != 1) {
                                    switch (this.f21031c) {
                                        case 0:
                                        case 1:
                                            break;
                                        case 2:
                                            i5 = 7;
                                            break;
                                        default:
                                            break;
                                    }
                                    return i5;
                                } else if (i != i2) {
                                    return 2;
                                } else {
                                    if (i != i3) {
                                        return 4;
                                    }
                                    if (i != size) {
                                        return 9;
                                    }
                                    if (i <= i2) {
                                        Log.d("Something went wrong", " Did you add add a new view holder?");
                                        return -1;
                                    } else if (i3 == -1) {
                                        size2 = 5;
                                        if (i >= i3) {
                                            size2 = 3;
                                        } else if (size != -1) {
                                            if (i >= size) {
                                                size2 = 8;
                                            }
                                        }
                                        return size2;
                                    } else {
                                        if (size != -1) {
                                            if (i >= size) {
                                                i4 = 8;
                                            }
                                        }
                                        return i4;
                                    }
                                }
                            }
                        }
                        size3 = 0;
                        this.f21033e = size;
                        this.f21034f = size2;
                        this.f21035g = size3;
                        if (size <= 0) {
                        }
                        if (size2 <= 0) {
                        }
                        i4 = 3;
                        if (size3 <= 0) {
                        }
                        if (i != 0) {
                            i5 = 1;
                            if (i != 1) {
                                switch (this.f21031c) {
                                    case 0:
                                    case 1:
                                        break;
                                    case 2:
                                        i5 = 7;
                                        break;
                                    default:
                                        break;
                                }
                                return i5;
                            } else if (i != i2) {
                                return 2;
                            } else {
                                if (i != i3) {
                                    return 4;
                                }
                                if (i != size) {
                                    return 9;
                                }
                                if (i <= i2) {
                                    Log.d("Something went wrong", " Did you add add a new view holder?");
                                    return -1;
                                } else if (i3 == -1) {
                                    if (size != -1) {
                                        if (i >= size) {
                                            i4 = 8;
                                        }
                                    }
                                    return i4;
                                } else {
                                    size2 = 5;
                                    if (i >= i3) {
                                        size2 = 3;
                                    } else if (size != -1) {
                                        if (i >= size) {
                                            size2 = 8;
                                        }
                                    }
                                    return size2;
                                }
                            }
                        }
                        switch (this.f21031c) {
                            case 0:
                            case 1:
                                break;
                            case 2:
                                i5 = 6;
                                break;
                            default:
                                break;
                        }
                        return i5;
                    }
                }
                size2 = 0;
                garageResult2 = this.f21041m;
                if (garageResult2 != null) {
                    licenceSearches = garageResult2.getLicenceSearches();
                    if (licenceSearches != null) {
                        size3 = licenceSearches.size();
                        this.f21033e = size;
                        this.f21034f = size2;
                        this.f21035g = size3;
                        if (size <= 0) {
                        }
                        if (size2 <= 0) {
                            if (size <= 0) {
                            }
                        }
                        i4 = 3;
                        if (size3 <= 0) {
                            if (i2 != -1) {
                            }
                            if (i2 == -1) {
                            }
                            if (i2 == -1) {
                            }
                        }
                        if (i != 0) {
                            switch (this.f21031c) {
                                case 0:
                                case 1:
                                    break;
                                case 2:
                                    i5 = 6;
                                    break;
                                default:
                                    break;
                            }
                            return i5;
                        }
                        i5 = 1;
                        if (i != 1) {
                            switch (this.f21031c) {
                                case 0:
                                case 1:
                                    break;
                                case 2:
                                    i5 = 7;
                                    break;
                                default:
                                    break;
                            }
                            return i5;
                        } else if (i != i2) {
                            return 2;
                        } else {
                            if (i != i3) {
                                return 4;
                            }
                            if (i != size) {
                                return 9;
                            }
                            if (i <= i2) {
                                Log.d("Something went wrong", " Did you add add a new view holder?");
                                return -1;
                            } else if (i3 == -1) {
                                size2 = 5;
                                if (i >= i3) {
                                    size2 = 3;
                                } else if (size != -1) {
                                    if (i >= size) {
                                        size2 = 8;
                                    }
                                }
                                return size2;
                            } else {
                                if (size != -1) {
                                    if (i >= size) {
                                        i4 = 8;
                                    }
                                }
                                return i4;
                            }
                        }
                    }
                }
                size3 = 0;
                this.f21033e = size;
                this.f21034f = size2;
                this.f21035g = size3;
                if (size <= 0) {
                }
                if (size2 <= 0) {
                }
                i4 = 3;
                if (size3 <= 0) {
                }
                if (i != 0) {
                    i5 = 1;
                    if (i != 1) {
                        switch (this.f21031c) {
                            case 0:
                            case 1:
                                break;
                            case 2:
                                i5 = 7;
                                break;
                            default:
                                break;
                        }
                        return i5;
                    } else if (i != i2) {
                        return 2;
                    } else {
                        if (i != i3) {
                            return 4;
                        }
                        if (i != size) {
                            return 9;
                        }
                        if (i <= i2) {
                            Log.d("Something went wrong", " Did you add add a new view holder?");
                            return -1;
                        } else if (i3 == -1) {
                            if (size != -1) {
                                if (i >= size) {
                                    i4 = 8;
                                }
                            }
                            return i4;
                        } else {
                            size2 = 5;
                            if (i >= i3) {
                                size2 = 3;
                            } else if (size != -1) {
                                if (i >= size) {
                                    size2 = 8;
                                }
                            }
                            return size2;
                        }
                    }
                }
                switch (this.f21031c) {
                    case 0:
                    case 1:
                        break;
                    case 2:
                        i5 = 6;
                        break;
                    default:
                        break;
                }
                return i5;
            }
        }
        size = 0;
        garageResult = this.f21041m;
        if (garageResult != null) {
            vehicleNumbers = garageResult.getVehicleNumbers();
            if (vehicleNumbers != null) {
                size2 = vehicleNumbers.size();
                garageResult2 = this.f21041m;
                if (garageResult2 != null) {
                    licenceSearches = garageResult2.getLicenceSearches();
                    if (licenceSearches != null) {
                        size3 = licenceSearches.size();
                        this.f21033e = size;
                        this.f21034f = size2;
                        this.f21035g = size3;
                        if (size <= 0) {
                        }
                        if (size2 <= 0) {
                            if (size <= 0) {
                            }
                        }
                        i4 = 3;
                        if (size3 <= 0) {
                            if (i2 != -1) {
                            }
                            if (i2 == -1) {
                            }
                            if (i2 == -1) {
                            }
                        }
                        if (i != 0) {
                            switch (this.f21031c) {
                                case 0:
                                case 1:
                                    break;
                                case 2:
                                    i5 = 6;
                                    break;
                                default:
                                    break;
                            }
                            return i5;
                        }
                        i5 = 1;
                        if (i != 1) {
                            switch (this.f21031c) {
                                case 0:
                                case 1:
                                    break;
                                case 2:
                                    i5 = 7;
                                    break;
                                default:
                                    break;
                            }
                            return i5;
                        } else if (i != i2) {
                            return 2;
                        } else {
                            if (i != i3) {
                                return 4;
                            }
                            if (i != size) {
                                return 9;
                            }
                            if (i <= i2) {
                                Log.d("Something went wrong", " Did you add add a new view holder?");
                                return -1;
                            } else if (i3 == -1) {
                                size2 = 5;
                                if (i >= i3) {
                                    size2 = 3;
                                } else if (size != -1) {
                                    if (i >= size) {
                                        size2 = 8;
                                    }
                                }
                                return size2;
                            } else {
                                if (size != -1) {
                                    if (i >= size) {
                                        i4 = 8;
                                    }
                                }
                                return i4;
                            }
                        }
                    }
                }
                size3 = 0;
                this.f21033e = size;
                this.f21034f = size2;
                this.f21035g = size3;
                if (size <= 0) {
                }
                if (size2 <= 0) {
                }
                i4 = 3;
                if (size3 <= 0) {
                }
                if (i != 0) {
                    i5 = 1;
                    if (i != 1) {
                        switch (this.f21031c) {
                            case 0:
                            case 1:
                                break;
                            case 2:
                                i5 = 7;
                                break;
                            default:
                                break;
                        }
                        return i5;
                    } else if (i != i2) {
                        return 2;
                    } else {
                        if (i != i3) {
                            return 4;
                        }
                        if (i != size) {
                            return 9;
                        }
                        if (i <= i2) {
                            Log.d("Something went wrong", " Did you add add a new view holder?");
                            return -1;
                        } else if (i3 == -1) {
                            if (size != -1) {
                                if (i >= size) {
                                    i4 = 8;
                                }
                            }
                            return i4;
                        } else {
                            size2 = 5;
                            if (i >= i3) {
                                size2 = 3;
                            } else if (size != -1) {
                                if (i >= size) {
                                    size2 = 8;
                                }
                            }
                            return size2;
                        }
                    }
                }
                switch (this.f21031c) {
                    case 0:
                    case 1:
                        break;
                    case 2:
                        i5 = 6;
                        break;
                    default:
                        break;
                }
                return i5;
            }
        }
        size2 = 0;
        garageResult2 = this.f21041m;
        if (garageResult2 != null) {
            licenceSearches = garageResult2.getLicenceSearches();
            if (licenceSearches != null) {
                size3 = licenceSearches.size();
                this.f21033e = size;
                this.f21034f = size2;
                this.f21035g = size3;
                if (size <= 0) {
                }
                if (size2 <= 0) {
                    if (size <= 0) {
                    }
                }
                i4 = 3;
                if (size3 <= 0) {
                    if (i2 != -1) {
                    }
                    if (i2 == -1) {
                    }
                    if (i2 == -1) {
                    }
                }
                if (i != 0) {
                    switch (this.f21031c) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                            i5 = 6;
                            break;
                        default:
                            break;
                    }
                    return i5;
                }
                i5 = 1;
                if (i != 1) {
                    switch (this.f21031c) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                            i5 = 7;
                            break;
                        default:
                            break;
                    }
                    return i5;
                } else if (i != i2) {
                    return 2;
                } else {
                    if (i != i3) {
                        return 4;
                    }
                    if (i != size) {
                        return 9;
                    }
                    if (i <= i2) {
                        Log.d("Something went wrong", " Did you add add a new view holder?");
                        return -1;
                    } else if (i3 == -1) {
                        size2 = 5;
                        if (i >= i3) {
                            size2 = 3;
                        } else if (size != -1) {
                            if (i >= size) {
                                size2 = 8;
                            }
                        }
                        return size2;
                    } else {
                        if (size != -1) {
                            if (i >= size) {
                                i4 = 8;
                            }
                        }
                        return i4;
                    }
                }
            }
        }
        size3 = 0;
        this.f21033e = size;
        this.f21034f = size2;
        this.f21035g = size3;
        if (size <= 0) {
        }
        if (size2 <= 0) {
        }
        i4 = 3;
        if (size3 <= 0) {
        }
        if (i != 0) {
            i5 = 1;
            if (i != 1) {
                switch (this.f21031c) {
                    case 0:
                    case 1:
                        break;
                    case 2:
                        i5 = 7;
                        break;
                    default:
                        break;
                }
                return i5;
            } else if (i != i2) {
                return 2;
            } else {
                if (i != i3) {
                    return 4;
                }
                if (i != size) {
                    return 9;
                }
                if (i <= i2) {
                    Log.d("Something went wrong", " Did you add add a new view holder?");
                    return -1;
                } else if (i3 == -1) {
                    if (size != -1) {
                        if (i >= size) {
                            i4 = 8;
                        }
                    }
                    return i4;
                } else {
                    size2 = 5;
                    if (i >= i3) {
                        size2 = 3;
                    } else if (size != -1) {
                        if (i >= size) {
                            size2 = 8;
                        }
                    }
                    return size2;
                }
            }
        }
        switch (this.f21031c) {
            case 0:
            case 1:
                break;
            case 2:
                i5 = 6;
                break;
            default:
                break;
        }
        return i5;
    }

    /* renamed from: h */
    public final String m27815h() {
        return this.f21036h;
    }

    /* renamed from: i */
    public final String m27816i() {
        return this.f21037i;
    }

    /* renamed from: j */
    public final String m27817j() {
        return this.f21038j;
    }

    /* renamed from: k */
    public final String m27818k() {
        return this.f21039k;
    }

    public void onResume() {
        super.onResume();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        if (defaultSharedPreferences.getBoolean("KEY_GARAGE_UPDATED", false)) {
            m27805q();
            defaultSharedPreferences.edit().putBoolean("KEY_GARAGE_UPDATED", false).apply();
        }
    }

    /* renamed from: d */
    public boolean mo4632d() {
        if (f21030s != null) {
            if (this.f21031c == 0) {
                Object f_;
                Object obj;
                Object c;
                C1482g c1482g = f21030s;
                if (c1482g == null) {
                    C2885g.m13906a();
                }
                if (c1482g.f_() != null) {
                    c1482g = f21030s;
                    if (c1482g == null) {
                        C2885g.m13906a();
                    }
                    f_ = c1482g.f_();
                    C2885g.m13907a(f_, "userInfoEventHandler!!.userName");
                    if (f_ != null) {
                        f_ = C4886o.m30224a((CharSequence) f_).toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                f_ = "";
                GarageResult garageResult = this.f21041m;
                Object obj2 = null;
                if ((garageResult != null ? garageResult.getName() : null) != null) {
                    garageResult = this.f21041m;
                    if (garageResult != null) {
                        String name = garageResult.getName();
                        if (name != null) {
                            if (name != null) {
                                obj = C4886o.m30224a(name).toString();
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                    }
                    obj = null;
                } else {
                    obj = "";
                }
                C1482g c1482g2 = f21030s;
                if (c1482g2 == null) {
                    C2885g.m13906a();
                }
                Object b;
                if (c1482g2.mo3924b() != null) {
                    c1482g2 = f21030s;
                    if (c1482g2 == null) {
                        C2885g.m13906a();
                    }
                    b = c1482g2.mo3924b();
                    C2885g.m13907a(b, "userInfoEventHandler!!.userEmail");
                    if (b != null) {
                        b = C4886o.m30224a((CharSequence) b).toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                b = "";
                GarageResult garageResult2 = this.f21041m;
                Object obj3;
                if ((garageResult2 != null ? garageResult2.getEmail() : null) != null) {
                    garageResult2 = this.f21041m;
                    if (garageResult2 != null) {
                        String email = garageResult2.getEmail();
                        if (email != null) {
                            if (email != null) {
                                obj3 = C4886o.m30224a(email).toString();
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                    }
                    obj3 = null;
                } else {
                    obj3 = "";
                }
                C1482g c1482g3 = f21030s;
                if (c1482g3 == null) {
                    C2885g.m13906a();
                }
                if (c1482g3.mo3925c() != null) {
                    c1482g3 = f21030s;
                    if (c1482g3 == null) {
                        C2885g.m13906a();
                    }
                    c = c1482g3.mo3925c();
                    C2885g.m13907a(c, "userInfoEventHandler!!.userMobile");
                    if (c != null) {
                        c = C4886o.m30224a((CharSequence) c).toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                c = "";
                GarageResult garageResult3 = this.f21041m;
                if ((garageResult3 != null ? garageResult3.getMobileNumber() : null) != null) {
                    garageResult3 = this.f21041m;
                    if (garageResult3 != null) {
                        String mobileNumber = garageResult3.getMobileNumber();
                        if (mobileNumber != null) {
                            if (mobileNumber != null) {
                                obj2 = C4886o.m30224a(mobileNumber).toString();
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                    }
                }
                obj2 = "";
                if ((C2885g.m13909a(f_, obj) ^ 1) == 0 && (C2885g.m13909a(r4, r5) ^ 1) == 0) {
                    if ((C2885g.m13909a(c, obj2) ^ 1) == 0) {
                        return false;
                    }
                }
                Context context = getContext();
                if (context == null) {
                    C2885g.m13906a();
                }
                C0661a c0661a = new C0661a(context);
                c0661a.m2643b((CharSequence) "Your information has not been saved. Do you want to update it?");
                c0661a.m2640a((CharSequence) "YES", (OnClickListener) new C1505e(this));
                c0661a.m2644b("NO", new C1506f(this));
                c0661a.m2646c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo4628c() {
        C1533a.m5787a((AdView) mo4626a(C1487a.adView), getContext());
    }
}
