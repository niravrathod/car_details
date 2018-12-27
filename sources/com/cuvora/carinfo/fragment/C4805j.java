package com.cuvora.carinfo.fragment;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.transition.Slide;
import android.support.transition.Transition;
import android.support.transition.ae;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0787m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.CarDetailActivity;
import com.cuvora.carinfo.CarInfoApplication;
import com.cuvora.carinfo.CarsBrandsActivity;
import com.cuvora.carinfo.GenericWebViewActivity;
import com.cuvora.carinfo.InstantArticleActivity;
import com.cuvora.carinfo.MyGarageActivity;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.ReverseSearchActivity;
import com.cuvora.carinfo.SearchActivity;
import com.cuvora.carinfo.TrendingSearchActivity;
import com.cuvora.carinfo.VehicleInfoActivity;
import com.cuvora.carinfo.VideoActivity;
import com.cuvora.carinfo.activity.LicenseSearchActivity;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1548k;
import com.cuvora.carinfo.helpers.C1561p;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.homepage.Action;
import com.cuvora.carinfo.models.homepage.ActionTypeEnum;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.HomePageData;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.models.homepage.SectionTypeEnum;
import com.cuvora.carinfo.models.homepage.TabContent;
import com.cuvora.carinfo.p071d.C1474d;
import com.cuvora.carinfo.p075g.C1524f;
import com.cuvora.carinfo.p075g.C4560h;
import com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity;
import com.cuvora.carinfo.views.AdFreeOptionsView;
import com.cuvora.carinfo.views.AdFreeOptionsView.C1628a;
import com.google.android.gms.ads.AdView;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.collections.C4329j;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.fragment.j */
public final class C4805j extends C4549b implements C1474d<Section> {
    /* renamed from: b */
    private Transition f21048b = new Slide();
    /* renamed from: c */
    private C4560h f21049c;
    /* renamed from: d */
    private C1524f f21050d = new C3675a(this);
    /* renamed from: e */
    private HashMap f21051e;

    /* renamed from: com.cuvora.carinfo.fragment.j$c */
    static final class C1511c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4805j f4499a;

        C1511c(C4805j c4805j) {
            this.f4499a = c4805j;
        }

        public final void onClick(View view) {
            view = this.f4499a.getActivity();
            view = view != null ? view.getApplication() : null;
            if (view != null) {
                ((CarInfoApplication) view).m5694a();
                this.f4499a.m27823h();
                Object obj = (RelativeLayout) this.f4499a.mo4626a(C1487a.view_root);
                C2885g.m13907a(obj, "view_root");
                obj.setVisibility(8);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.CarInfoApplication");
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.j$d */
    static final class C1512d implements OnClickListener {
        /* renamed from: a */
        public static final C1512d f4500a = new C1512d();

        C1512d() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.j$a */
    public static final class C3675a implements C1524f {
        /* renamed from: a */
        final /* synthetic */ C4805j f14893a;

        C3675a(C4805j c4805j) {
            this.f14893a = c4805j;
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: a */
        public void mo1199a(Element element) {
            ActionTypeEnum type;
            Context context;
            Intent intent;
            Object action;
            Object action2;
            Bundle bundle;
            AdFreeOptionsView adFreeOptionsView;
            Action action3 = null;
            if (element != null) {
                Action action4 = element.getAction();
                if (action4 != null) {
                    type = action4.getType();
                    C1533a.m5785a(this.f14893a.getContext(), C1533a.m5796d(this.f14893a.getContext()) + 1);
                    if (element != null) {
                        action3 = element.getAction();
                    }
                    C1540d.m5807a(action3);
                    if (type == null) {
                        switch (C1513k.f4501a[type.ordinal()]) {
                            case 1:
                                element = new Intent(this.f14893a.getContext(), LicenseSearchActivity.class);
                                context = this.f14893a.getContext();
                                if (context != null) {
                                    context.startActivity(element);
                                    break;
                                }
                                break;
                            case 2:
                                element = new Intent(this.f14893a.getContext(), VideoHomeActivity.class);
                                context = this.f14893a.getContext();
                                if (context != null) {
                                    context.startActivity(element);
                                    break;
                                }
                                break;
                            case 3:
                                element = new Intent(this.f14893a.getContext(), SearchActivity.class);
                                context = this.f14893a.getContext();
                                if (context != null) {
                                    context.startActivity(element);
                                    break;
                                }
                                break;
                            case 4:
                                element = new Intent(this.f14893a.getContext(), MyGarageActivity.class);
                                context = this.f14893a.getContext();
                                if (context != null) {
                                    context.startActivity(element);
                                    break;
                                }
                                break;
                            case 5:
                                element = new Intent(this.f14893a.getContext(), ReverseSearchActivity.class);
                                context = this.f14893a.getContext();
                                if (context != null) {
                                    context.startActivity(element);
                                    break;
                                }
                                break;
                            case 6:
                                C1561p.m5939a(this.f14893a.getContext());
                                return;
                            case 7:
                                element = new Intent(this.f14893a.getContext(), CarsBrandsActivity.class);
                                if (C1547j.m5914d(this.f14893a.getContext())) {
                                    element.putExtra("STATE", "ERROR");
                                } else {
                                    element.putExtra("STATE", "LOADING");
                                }
                                context = this.f14893a.getContext();
                                if (context != null) {
                                    context.startActivity(element);
                                    break;
                                }
                                break;
                            case 8:
                                intent = new Intent(this.f14893a.getContext(), InstantArticleActivity.class);
                                action = element.getAction();
                                C2885g.m13907a(action, "element.action");
                                intent.putExtra("KEY_DATA", action.getInstantArticleData());
                                element = this.f14893a.getContext();
                                if (element != null) {
                                    element.startActivity(intent);
                                    break;
                                }
                                break;
                            case 9:
                                intent = new Intent(this.f14893a.getContext(), VehicleInfoActivity.class);
                                action = element.getAction();
                                C2885g.m13907a(action, "element.action");
                                intent.putExtra("KEY_VEHICLE_INFO", action.getVehicleSearchResult());
                                element = this.f14893a.getContext();
                                if (element != null) {
                                    element.startActivity(intent);
                                    break;
                                }
                                break;
                            case 10:
                                intent = new Intent(this.f14893a.getContext(), VideoActivity.class);
                                action = element.getAction();
                                C2885g.m13907a(action, "element.action");
                                intent.putExtra("KEY_VIDEO_DATA", action.getVideoData());
                                element = this.f14893a.getContext();
                                if (element != null) {
                                    element.startActivity(intent);
                                    break;
                                }
                                break;
                            case 11:
                                intent = new Intent(this.f14893a.getContext(), GenericWebViewActivity.class);
                                Object content = element.getContent();
                                C2885g.m13907a(content, "element.content");
                                intent.putExtra("KEY_WEB_VIEW_TITLE", content.getTitle());
                                action = element.getAction();
                                C2885g.m13907a(action, "element.action");
                                action = action.getDeeplink();
                                C2885g.m13907a(action, "element.action.deeplink");
                                intent.putExtra("KEY_WEB_VIEW_URL", action.getUrl());
                                element = this.f14893a.getContext();
                                if (element != null) {
                                    element.startActivity(intent);
                                    break;
                                }
                                break;
                            case 12:
                                action2 = element.getAction();
                                C2885g.m13907a(action2, "element.action");
                                action2 = action2.getDeeplink();
                                C2885g.m13907a(action2, "element.action.deeplink");
                                action2 = action2.getMeta();
                                bundle = new Bundle();
                                action = element.getAction();
                                C2885g.m13907a(action, "element.action");
                                action = action.getDeeplink();
                                C2885g.m13907a(action, "element.action.deeplink");
                                bundle.putSerializable("deepLink", action.getUrl());
                                C2885g.m13907a(action2, "meta");
                                for (Entry entry : action2.entrySet()) {
                                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                }
                                C1548k.m5918a(this.f14893a.getActivity(), bundle);
                                return;
                            case 13:
                                context = this.f14893a.getContext();
                                action = element.getAction();
                                C2885g.m13907a(action, "element.action");
                                action = action.getDeeplink();
                                C2885g.m13907a(action, "element.action.deeplink");
                                C1570t.m6006c(context, action.getUrl());
                                break;
                            case 14:
                                ((AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView)).setType(ActionTypeEnum.INAPP);
                                this.f14893a.m27823h();
                                action = (RelativeLayout) this.f14893a.mo4626a(C1487a.view_root);
                                C2885g.m13907a(action, "view_root");
                                action.setVisibility(0);
                                break;
                            case 15:
                                adFreeOptionsView = (AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView);
                                action2 = (AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView);
                                C2885g.m13907a(action2, "adFreeOptionsView");
                                adFreeOptionsView.setType(action2.m6216b() ? ActionTypeEnum.REWARDED : ActionTypeEnum.INAPP);
                                this.f14893a.m27823h();
                                action = (RelativeLayout) this.f14893a.mo4626a(C1487a.view_root);
                                C2885g.m13907a(action, "view_root");
                                action.setVisibility(0);
                                break;
                            case 16:
                                adFreeOptionsView = (AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView);
                                action2 = (AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView);
                                C2885g.m13907a(action2, "adFreeOptionsView");
                                adFreeOptionsView.setType(action2.m6216b() ? ActionTypeEnum.REWARDED_INAPP : ActionTypeEnum.INAPP);
                                this.f14893a.m27823h();
                                action = (RelativeLayout) this.f14893a.mo4626a(C1487a.view_root);
                                C2885g.m13907a(action, "view_root");
                                action.setVisibility(0);
                                break;
                            case 17:
                                intent = new Intent(this.f14893a.getContext(), CarDetailActivity.class);
                                action = element.getAction();
                                C2885g.m13907a(action, "element.action");
                                intent.putExtra("KEY_MODEL_ID", action.getModelId());
                                if (C1547j.m5914d(this.f14893a.getContext()) != null) {
                                    intent.putExtra("STATE", "ERROR");
                                } else {
                                    intent.putExtra("STATE", "LOADING");
                                }
                                this.f14893a.startActivity(intent);
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
            type = null;
            C1533a.m5785a(this.f14893a.getContext(), C1533a.m5796d(this.f14893a.getContext()) + 1);
            if (element != null) {
                action3 = element.getAction();
            }
            C1540d.m5807a(action3);
            if (type == null) {
                switch (C1513k.f4501a[type.ordinal()]) {
                    case 1:
                        element = new Intent(this.f14893a.getContext(), LicenseSearchActivity.class);
                        context = this.f14893a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 2:
                        element = new Intent(this.f14893a.getContext(), VideoHomeActivity.class);
                        context = this.f14893a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 3:
                        element = new Intent(this.f14893a.getContext(), SearchActivity.class);
                        context = this.f14893a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 4:
                        element = new Intent(this.f14893a.getContext(), MyGarageActivity.class);
                        context = this.f14893a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 5:
                        element = new Intent(this.f14893a.getContext(), ReverseSearchActivity.class);
                        context = this.f14893a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 6:
                        C1561p.m5939a(this.f14893a.getContext());
                        return;
                    case 7:
                        element = new Intent(this.f14893a.getContext(), CarsBrandsActivity.class);
                        if (C1547j.m5914d(this.f14893a.getContext())) {
                            element.putExtra("STATE", "LOADING");
                        } else {
                            element.putExtra("STATE", "ERROR");
                        }
                        context = this.f14893a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 8:
                        intent = new Intent(this.f14893a.getContext(), InstantArticleActivity.class);
                        action = element.getAction();
                        C2885g.m13907a(action, "element.action");
                        intent.putExtra("KEY_DATA", action.getInstantArticleData());
                        element = this.f14893a.getContext();
                        if (element != null) {
                            element.startActivity(intent);
                            break;
                        }
                        break;
                    case 9:
                        intent = new Intent(this.f14893a.getContext(), VehicleInfoActivity.class);
                        action = element.getAction();
                        C2885g.m13907a(action, "element.action");
                        intent.putExtra("KEY_VEHICLE_INFO", action.getVehicleSearchResult());
                        element = this.f14893a.getContext();
                        if (element != null) {
                            element.startActivity(intent);
                            break;
                        }
                        break;
                    case 10:
                        intent = new Intent(this.f14893a.getContext(), VideoActivity.class);
                        action = element.getAction();
                        C2885g.m13907a(action, "element.action");
                        intent.putExtra("KEY_VIDEO_DATA", action.getVideoData());
                        element = this.f14893a.getContext();
                        if (element != null) {
                            element.startActivity(intent);
                            break;
                        }
                        break;
                    case 11:
                        intent = new Intent(this.f14893a.getContext(), GenericWebViewActivity.class);
                        Object content2 = element.getContent();
                        C2885g.m13907a(content2, "element.content");
                        intent.putExtra("KEY_WEB_VIEW_TITLE", content2.getTitle());
                        action = element.getAction();
                        C2885g.m13907a(action, "element.action");
                        action = action.getDeeplink();
                        C2885g.m13907a(action, "element.action.deeplink");
                        intent.putExtra("KEY_WEB_VIEW_URL", action.getUrl());
                        element = this.f14893a.getContext();
                        if (element != null) {
                            element.startActivity(intent);
                            break;
                        }
                        break;
                    case 12:
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        action2 = action2.getDeeplink();
                        C2885g.m13907a(action2, "element.action.deeplink");
                        action2 = action2.getMeta();
                        bundle = new Bundle();
                        action = element.getAction();
                        C2885g.m13907a(action, "element.action");
                        action = action.getDeeplink();
                        C2885g.m13907a(action, "element.action.deeplink");
                        bundle.putSerializable("deepLink", action.getUrl());
                        C2885g.m13907a(action2, "meta");
                        for (Entry entry2 : action2.entrySet()) {
                            bundle.putString((String) entry2.getKey(), (String) entry2.getValue());
                        }
                        C1548k.m5918a(this.f14893a.getActivity(), bundle);
                        return;
                    case 13:
                        context = this.f14893a.getContext();
                        action = element.getAction();
                        C2885g.m13907a(action, "element.action");
                        action = action.getDeeplink();
                        C2885g.m13907a(action, "element.action.deeplink");
                        C1570t.m6006c(context, action.getUrl());
                        break;
                    case 14:
                        ((AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView)).setType(ActionTypeEnum.INAPP);
                        this.f14893a.m27823h();
                        action = (RelativeLayout) this.f14893a.mo4626a(C1487a.view_root);
                        C2885g.m13907a(action, "view_root");
                        action.setVisibility(0);
                        break;
                    case 15:
                        adFreeOptionsView = (AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView);
                        action2 = (AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView);
                        C2885g.m13907a(action2, "adFreeOptionsView");
                        if (action2.m6216b()) {
                        }
                        adFreeOptionsView.setType(action2.m6216b() ? ActionTypeEnum.REWARDED : ActionTypeEnum.INAPP);
                        this.f14893a.m27823h();
                        action = (RelativeLayout) this.f14893a.mo4626a(C1487a.view_root);
                        C2885g.m13907a(action, "view_root");
                        action.setVisibility(0);
                        break;
                    case 16:
                        adFreeOptionsView = (AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView);
                        action2 = (AdFreeOptionsView) this.f14893a.mo4626a(C1487a.adFreeOptionsView);
                        C2885g.m13907a(action2, "adFreeOptionsView");
                        if (action2.m6216b()) {
                        }
                        adFreeOptionsView.setType(action2.m6216b() ? ActionTypeEnum.REWARDED_INAPP : ActionTypeEnum.INAPP);
                        this.f14893a.m27823h();
                        action = (RelativeLayout) this.f14893a.mo4626a(C1487a.view_root);
                        C2885g.m13907a(action, "view_root");
                        action.setVisibility(0);
                        break;
                    case 17:
                        intent = new Intent(this.f14893a.getContext(), CarDetailActivity.class);
                        action = element.getAction();
                        C2885g.m13907a(action, "element.action");
                        intent.putExtra("KEY_MODEL_ID", action.getModelId());
                        if (C1547j.m5914d(this.f14893a.getContext()) != null) {
                            intent.putExtra("STATE", "LOADING");
                        } else {
                            intent.putExtra("STATE", "ERROR");
                        }
                        this.f14893a.startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        }

        /* renamed from: a */
        public void mo1200a(Section section) {
            SectionTypeEnum sectionTypeEnum = null;
            C1540d.m5808a(section != null ? section.getType() : null);
            C1533a.m5785a(this.f14893a.getContext(), C1533a.m5796d(this.f14893a.getContext()) + 1);
            if (section != null) {
                sectionTypeEnum = section.getType();
            }
            if (sectionTypeEnum != null) {
                if (C1513k.f4502b[sectionTypeEnum.ordinal()] == 1) {
                    section = this.f14893a.getContext();
                    if (section != null) {
                        section.startActivity(new Intent(this.f14893a.getContext(), TrendingSearchActivity.class));
                    }
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.j$b */
    public static final class C3676b implements C1628a {
        /* renamed from: a */
        final /* synthetic */ C4805j f14894a;

        C3676b(C4805j c4805j) {
            this.f14894a = c4805j;
        }

        /* renamed from: a */
        public void mo1163a() {
            ((RelativeLayout) this.f14894a.mo4626a(C1487a.view_root)).performClick();
            C1570t.m6036u(this.f14894a.getContext());
            FragmentActivity activity = this.f14894a.getActivity();
            Intent intent = null;
            Application application = activity != null ? activity.getApplication() : null;
            if (application != null) {
                ((CarInfoApplication) application).m5694a();
                C1570t.m5987a(this.f14894a.getContext(), false);
                if (this.f14894a.getActivity() != null) {
                    activity = this.f14894a.getActivity();
                    if (activity != null) {
                        Context baseContext = activity.getBaseContext();
                        if (baseContext != null) {
                            PackageManager packageManager = baseContext.getPackageManager();
                            if (packageManager != null) {
                                String packageName;
                                FragmentActivity activity2 = this.f14894a.getActivity();
                                if (activity2 != null) {
                                    Context baseContext2 = activity2.getBaseContext();
                                    if (baseContext2 != null) {
                                        packageName = baseContext2.getPackageName();
                                    }
                                }
                                intent = packageManager.getLaunchIntentForPackage(packageName);
                            }
                        }
                    }
                    if (intent != null) {
                        intent.addFlags(268468224);
                    }
                    this.f14894a.startActivity(intent);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.CarInfoApplication");
        }

        /* renamed from: b */
        public void mo1164b() {
            ((RelativeLayout) this.f14894a.mo4626a(C1487a.view_root)).performClick();
            FragmentActivity activity = this.f14894a.getActivity();
            Intent intent = null;
            Application application = activity != null ? activity.getApplication() : null;
            if (application != null) {
                ((CarInfoApplication) application).m5694a();
                C1570t.m6036u(this.f14894a.getContext());
                C1570t.m5987a(this.f14894a.getContext(), false);
                if (this.f14894a.getActivity() != null) {
                    activity = this.f14894a.getActivity();
                    if (activity != null) {
                        Context baseContext = activity.getBaseContext();
                        if (baseContext != null) {
                            PackageManager packageManager = baseContext.getPackageManager();
                            if (packageManager != null) {
                                String packageName;
                                FragmentActivity activity2 = this.f14894a.getActivity();
                                if (activity2 != null) {
                                    Context baseContext2 = activity2.getBaseContext();
                                    if (baseContext2 != null) {
                                        packageName = baseContext2.getPackageName();
                                    }
                                }
                                intent = packageManager.getLaunchIntentForPackage(packageName);
                            }
                        }
                    }
                    if (intent != null) {
                        intent.addFlags(268468224);
                    }
                    this.f14894a.startActivity(intent);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.CarInfoApplication");
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.j$e */
    public static final class C3677e extends C0787m {
        C3677e() {
        }

        /* renamed from: a */
        public void mo786a(RecyclerView recyclerView, int i) {
            super.mo786a(recyclerView, i);
            if (i == 2 && recyclerView != null) {
                recyclerView.m24675f();
            }
        }
    }

    /* renamed from: a */
    public View mo4626a(int i) {
        if (this.f21051e == null) {
            this.f21051e = new HashMap();
        }
        View view = (View) this.f21051e.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21051e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo4629e() {
        if (this.f21051e != null) {
            this.f21051e.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4629e();
    }

    /* renamed from: e */
    public /* synthetic */ Object mo4633e(int i) {
        return m27825b(i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.view_home_page, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        ((AdFreeOptionsView) mo4626a(C1487a.adFreeOptionsView)).m6215a();
        m27822g();
        m27821f();
    }

    /* renamed from: f */
    private final void m27821f() {
        View view = getView();
        LinearLayout linearLayout = null;
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.recyclerView) : null;
        this.f21049c = new C4560h(this, this.f21050d);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f21049c);
        }
        if (recyclerView == null) {
            C2885g.m13906a();
        }
        recyclerView.m24639a((C0787m) new C3677e());
        view = getView();
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(R.id.ll_content);
        }
        if (C1570t.m6032q(getActivity())) {
            view = LayoutInflater.from(getActivity()).inflate(R.layout.view_premium_user, linearLayout, false);
            if (linearLayout != null) {
                linearLayout.addView(view);
            }
        }
    }

    /* renamed from: g */
    private final void m27822g() {
        ((AdFreeOptionsView) mo4626a(C1487a.adFreeOptionsView)).setListener(new C3676b(this));
        ((RelativeLayout) mo4626a(C1487a.view_root)).setOnClickListener(new C1511c(this));
        ((AdFreeOptionsView) mo4626a(C1487a.adFreeOptionsView)).setOnClickListener(C1512d.f4500a);
    }

    public void onResume() {
        super.onResume();
        if (C1541e.m5856c("unomer")) {
            C4560h c4560h = this.f21049c;
            if (c4560h != null) {
                c4560h.m2967e();
            }
        }
    }

    /* renamed from: h */
    private final void m27823h() {
        ae.m973a((RelativeLayout) mo4626a(C1487a.view_root), this.f21048b);
    }

    /* renamed from: b */
    public Section m27825b(int i) {
        List sections;
        Object obj;
        TabContent a = m25062a();
        if (a != null) {
            HomePageData homePageData = a.getHomePageData();
            if (homePageData != null) {
                sections = homePageData.getSections();
                if (sections != null) {
                    obj = sections.get(i);
                    C2885g.m13907a(obj, "sections[position]");
                    return (Section) obj;
                }
            }
        }
        sections = C4329j.m23705a();
        obj = sections.get(i);
        C2885g.m13907a(obj, "sections[position]");
        return (Section) obj;
    }

    /* renamed from: l */
    public int mo4635l() {
        List sections;
        TabContent a = m25062a();
        if (a != null) {
            HomePageData homePageData = a.getHomePageData();
            if (homePageData != null) {
                sections = homePageData.getSections();
                if (sections != null) {
                    return sections.size();
                }
            }
        }
        sections = C4329j.m23705a();
        return sections.size();
    }

    /* renamed from: d */
    public int mo4631d(int i) {
        List sections;
        Object obj;
        TabContent a = m25062a();
        if (a != null) {
            HomePageData homePageData = a.getHomePageData();
            if (homePageData != null) {
                sections = homePageData.getSections();
                if (sections != null) {
                    obj = sections.get(i);
                    C2885g.m13907a(obj, "sections[position]");
                    obj = ((Section) obj).getType();
                    C2885g.m13907a(obj, "sections[position].type");
                    return obj.getItemType();
                }
            }
        }
        sections = C4329j.m23705a();
        obj = sections.get(i);
        C2885g.m13907a(obj, "sections[position]");
        obj = ((Section) obj).getType();
        C2885g.m13907a(obj, "sections[position].type");
        return obj.getItemType();
    }

    /* renamed from: d */
    public boolean mo4632d() {
        Object obj = (RelativeLayout) mo4626a(C1487a.view_root);
        C2885g.m13907a(obj, "view_root");
        if (obj.getVisibility() != 0) {
            return false;
        }
        ((RelativeLayout) mo4626a(C1487a.view_root)).performClick();
        return true;
    }

    /* renamed from: c */
    public void mo4628c() {
        View view = getView();
        C1533a.m5787a(view != null ? (AdView) view.findViewById(R.id.adView) : null, getContext());
    }
}
