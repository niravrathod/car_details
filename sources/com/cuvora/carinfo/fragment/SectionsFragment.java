package com.cuvora.carinfo.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.C0392c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.C3663b;
import com.cuvora.carinfo.CarDetailActivity;
import com.cuvora.carinfo.CarsBrandsActivity;
import com.cuvora.carinfo.GenericWebViewActivity;
import com.cuvora.carinfo.InstantArticleActivity;
import com.cuvora.carinfo.MyGarageActivity;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.ReverseSearchActivity;
import com.cuvora.carinfo.SearchActivity;
import com.cuvora.carinfo.VehicleInfoActivity;
import com.cuvora.carinfo.VideoActivity;
import com.cuvora.carinfo.activity.LicenseInfoActivity;
import com.cuvora.carinfo.activity.LicenseSearchActivity;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1548k;
import com.cuvora.carinfo.helpers.C1561p;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.C3688b;
import com.cuvora.carinfo.loaders.C4809j;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.KeyValueModel;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.models.ServerApiResponse;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.models.homepage.Action;
import com.cuvora.carinfo.models.homepage.ActionTypeEnum;
import com.cuvora.carinfo.models.homepage.Content;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.ElementType;
import com.cuvora.carinfo.models.homepage.HomePageData;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.models.homepage.SectionTypeEnum;
import com.cuvora.carinfo.p070c.C1471a;
import com.cuvora.carinfo.p076h.C1530a;
import com.cuvora.carinfo.views.HorizontalScrollCustomView;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.jvm.internal.C2885g;

public final class SectionsFragment extends C4548a {
    /* renamed from: b */
    public static final C1495b f21008b = new C1495b();
    /* renamed from: a */
    public C1494a f21009a;
    /* renamed from: c */
    private final C1530a<Section, Element> f21010c = new C3669c(this);
    /* renamed from: d */
    private List<VehicleSearchResult> f21011d = new ArrayList();
    /* renamed from: e */
    private final C4547d f21012e = new C4547d(this);
    /* renamed from: f */
    private HashMap f21013f;

    /* renamed from: com.cuvora.carinfo.fragment.SectionsFragment$a */
    public interface C1494a {
    }

    /* renamed from: com.cuvora.carinfo.fragment.SectionsFragment$b */
    public static final class C1495b {
        private C1495b() {
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.SectionsFragment$c */
    public static final class C3669c implements C1530a<Section, Element> {
        /* renamed from: a */
        final /* synthetic */ SectionsFragment f14886a;

        /* renamed from: a */
        public void m18459a(Section section) {
        }

        C3669c(SectionsFragment sectionsFragment) {
            this.f14886a = sectionsFragment;
        }

        /* renamed from: b */
        public /* synthetic */ void mo1190b(Object obj) {
            m18459a((Section) obj);
        }

        /* renamed from: a */
        public void m18458a(Element element) {
            C2885g.m13910b(element, "element");
            Object action = element.getAction();
            C2885g.m13907a(action, "element.action");
            ActionTypeEnum type = action.getType();
            C1533a.m5785a(this.f14886a.getContext(), C1533a.m5796d(this.f14886a.getContext()) + 1);
            C1540d.m5807a(element.getAction());
            if (type != null) {
                Context context;
                Intent intent;
                Object action2;
                switch (C1514l.f4503a[type.ordinal()]) {
                    case 1:
                        element = new Intent(this.f14886a.getContext(), LicenseSearchActivity.class);
                        context = this.f14886a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 2:
                        element = new Intent(this.f14886a.getContext(), SearchActivity.class);
                        context = this.f14886a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 3:
                        element = new Intent(this.f14886a.getContext(), MyGarageActivity.class);
                        context = this.f14886a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 4:
                        intent = new Intent(this.f14886a.getContext(), LicenseInfoActivity.class);
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        intent.putExtra("license_data", action2.getLicenseDetailsModel());
                        this.f14886a.startActivity(intent);
                        break;
                    case 5:
                        element = new Intent(this.f14886a.getContext(), ReverseSearchActivity.class);
                        context = this.f14886a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 6:
                        C1561p.m5939a(this.f14886a.getContext());
                        return;
                    case 7:
                        element = new Intent(this.f14886a.getContext(), CarsBrandsActivity.class);
                        if (C1547j.m5914d(this.f14886a.getContext())) {
                            element.putExtra("STATE", "LOADING");
                        } else {
                            element.putExtra("STATE", "ERROR");
                        }
                        context = this.f14886a.getContext();
                        if (context != null) {
                            context.startActivity(element);
                            break;
                        }
                        break;
                    case 8:
                        intent = new Intent(this.f14886a.getContext(), InstantArticleActivity.class);
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        intent.putExtra("KEY_DATA", action2.getInstantArticleData());
                        element = this.f14886a.getContext();
                        if (element != null) {
                            element.startActivity(intent);
                            break;
                        }
                        break;
                    case 9:
                        intent = new Intent(this.f14886a.getContext(), VehicleInfoActivity.class);
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        intent.putExtra("KEY_VEHICLE_INFO", action2.getVehicleSearchResult());
                        element = this.f14886a.getContext();
                        if (element != null) {
                            element.startActivity(intent);
                            break;
                        }
                        break;
                    case 10:
                        intent = new Intent(this.f14886a.getContext(), VideoActivity.class);
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        intent.putExtra("KEY_VIDEO_DATA", action2.getVideoData());
                        element = this.f14886a.getContext();
                        if (element != null) {
                            element.startActivity(intent);
                            break;
                        }
                        break;
                    case 11:
                        intent = new Intent(this.f14886a.getContext(), GenericWebViewActivity.class);
                        Object content = element.getContent();
                        C2885g.m13907a(content, "element.content");
                        intent.putExtra("KEY_WEB_VIEW_TITLE", content.getTitle());
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        action2 = action2.getDeeplink();
                        C2885g.m13907a(action2, "element.action.deeplink");
                        intent.putExtra("KEY_WEB_VIEW_URL", action2.getUrl());
                        element = this.f14886a.getContext();
                        if (element != null) {
                            element.startActivity(intent);
                            break;
                        }
                        break;
                    case 12:
                        action = element.getAction();
                        C2885g.m13907a(action, "element.action");
                        action = action.getDeeplink();
                        C2885g.m13907a(action, "element.action.deeplink");
                        action = action.getMeta();
                        Bundle bundle = new Bundle();
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        action2 = action2.getDeeplink();
                        C2885g.m13907a(action2, "element.action.deeplink");
                        bundle.putSerializable("deepLink", action2.getUrl());
                        C2885g.m13907a(action, "meta");
                        for (Entry entry : action.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        C1548k.m5918a(this.f14886a.getActivity(), bundle);
                        return;
                    case 13:
                        context = this.f14886a.getContext();
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        action2 = action2.getDeeplink();
                        C2885g.m13907a(action2, "element.action.deeplink");
                        C1570t.m6006c(context, action2.getUrl());
                        break;
                    case 14:
                        intent = new Intent(this.f14886a.getContext(), CarDetailActivity.class);
                        action2 = element.getAction();
                        C2885g.m13907a(action2, "element.action");
                        intent.putExtra("KEY_MODEL_ID", action2.getModelId());
                        if (C1547j.m5914d(this.f14886a.getContext()) == null) {
                            intent.putExtra("STATE", "ERROR");
                        } else {
                            intent.putExtra("STATE", "LOADING");
                        }
                        this.f14886a.startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.SectionsFragment$d */
    public static final class C4547d extends C3663b<HomePageData> {
        /* renamed from: a */
        final /* synthetic */ SectionsFragment f18868a;

        /* renamed from: a */
        public void mo3921a(ErrorResponse errorResponse) {
            C2885g.m13910b(errorResponse, "errorResponse");
        }

        C4547d(SectionsFragment sectionsFragment) {
            this.f18868a = sectionsFragment;
        }

        /* renamed from: a */
        public void mo3920a() {
            Object context = this.f18868a.getContext();
            if (context != null) {
                C2885g.m13907a(context, "it");
                m18447a((Context) context);
            }
        }

        /* renamed from: a */
        public void m25056a(HomePageData homePageData) {
            C2885g.m13910b(homePageData, "t");
            if (homePageData.getSections() != null && homePageData.getSections().size() > 0) {
                LinearLayout linearLayout = (LinearLayout) this.f18868a.mo4624a(C1487a.sectionCon);
                if (linearLayout != null) {
                    C1471a.m5714a(linearLayout, new HorizontalScrollCustomView(this.f18868a.getContext(), (Section) homePageData.getSections().get(0), this.f18868a.m27772b()), R.id.useful_links);
                }
            }
        }

        /* renamed from: a */
        public C0392c<ServerApiResponse<HomePageData>> mo1158a(int i, Bundle bundle) {
            Object context = this.f18868a.getContext();
            if (context == null) {
                C2885g.m13906a();
            }
            C2885g.m13907a(context, "context!!");
            if (bundle != null) {
                bundle = bundle.getString("screen_name");
                if (bundle != null) {
                    return (C0392c) new C4809j(context, bundle, true);
                }
            }
            bundle = "";
            return (C0392c) new C4809j(context, bundle, true);
        }
    }

    /* renamed from: a */
    public View mo4624a(int i) {
        if (this.f21013f == null) {
            this.f21013f = new HashMap();
        }
        View view = (View) this.f21013f.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21013f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo4625a() {
        if (this.f21013f != null) {
            this.f21013f.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4625a();
    }

    /* renamed from: b */
    public final C1530a<Section, Element> m27772b() {
        return this.f21010c;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_sections, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        view = new Bundle();
        if ((getActivity() instanceof SearchActivity) != null) {
            m27769d();
            view.putString("screen_name", "rcSearch");
        } else {
            m27768c();
            view.putString("screen_name", "dlSearch");
        }
        getLoaderManager().mo264a(1, view, this.f21012e).m1455m();
    }

    /* renamed from: c */
    private final void m27768c() {
        GarageResult k = C1570t.m6026k(getContext());
        if (k != null) {
            List licenceDetails = k.getLicenceDetails();
            if (licenceDetails != null && (licenceDetails.isEmpty() ^ 1) == 1) {
                List<LicenseDetailsModel> licenceDetails2 = k.getLicenceDetails();
                Section section = new Section();
                section.setTitle("Recent Searched Licences");
                section.setHeader(true);
                section.setViewAllEnabled(false);
                section.setType(SectionTypeEnum.RECENT_SEARCH);
                ArrayList arrayList = new ArrayList();
                if (licenceDetails2 != null) {
                    for (LicenseDetailsModel licenseDetailsModel : licenceDetails2) {
                        if (arrayList.size() <= 2) {
                            Object obj;
                            String value;
                            KeyValueModel keyValueModel;
                            Action action;
                            Element element = new Element();
                            Content content = new Content();
                            List keys = licenseDetailsModel.getKeys();
                            Object obj2 = null;
                            if (keys != null) {
                                for (Object obj3 : keys) {
                                    if (C2885g.m13909a(((KeyValueModel) obj3).getKey(), KeyValueModel.Companion.getKEY_HOLDERS_NAME())) {
                                        break;
                                    }
                                }
                                obj3 = null;
                                KeyValueModel keyValueModel2 = (KeyValueModel) obj3;
                                if (keyValueModel2 != null) {
                                    value = keyValueModel2.getValue();
                                    if (value != null) {
                                        content.setTitle(value);
                                        keys = licenseDetailsModel.getKeys();
                                        if (keys != null) {
                                            for (Object obj32 : keys) {
                                                if (C2885g.m13909a(((KeyValueModel) obj32).getKey(), KeyValueModel.Companion.getKEY_LICENCE_NO())) {
                                                    obj2 = obj32;
                                                    break;
                                                }
                                            }
                                            keyValueModel = (KeyValueModel) obj2;
                                            if (keyValueModel != null) {
                                                value = keyValueModel.getValue();
                                                if (value != null) {
                                                    content.setSubTitle(value);
                                                    action = new Action();
                                                    action.setType(ActionTypeEnum.LICENCE_DETAILS);
                                                    action.setLicenseDetailsModel(licenseDetailsModel);
                                                    element.setAction(action);
                                                    element.setContent(content);
                                                    arrayList.add(element);
                                                }
                                            }
                                        }
                                        value = "";
                                        content.setSubTitle(value);
                                        action = new Action();
                                        action.setType(ActionTypeEnum.LICENCE_DETAILS);
                                        action.setLicenseDetailsModel(licenseDetailsModel);
                                        element.setAction(action);
                                        element.setContent(content);
                                        arrayList.add(element);
                                    }
                                }
                            }
                            value = "";
                            content.setTitle(value);
                            keys = licenseDetailsModel.getKeys();
                            if (keys != null) {
                                for (Object obj322 : keys) {
                                    if (C2885g.m13909a(((KeyValueModel) obj322).getKey(), KeyValueModel.Companion.getKEY_LICENCE_NO())) {
                                        obj2 = obj322;
                                        break;
                                    }
                                }
                                keyValueModel = (KeyValueModel) obj2;
                                if (keyValueModel != null) {
                                    value = keyValueModel.getValue();
                                    if (value != null) {
                                        content.setSubTitle(value);
                                        action = new Action();
                                        action.setType(ActionTypeEnum.LICENCE_DETAILS);
                                        action.setLicenseDetailsModel(licenseDetailsModel);
                                        element.setAction(action);
                                        element.setContent(content);
                                        arrayList.add(element);
                                    }
                                }
                            }
                            value = "";
                            content.setSubTitle(value);
                            action = new Action();
                            action.setType(ActionTypeEnum.LICENCE_DETAILS);
                            action.setLicenseDetailsModel(licenseDetailsModel);
                            element.setAction(action);
                            element.setContent(content);
                            arrayList.add(element);
                        }
                    }
                }
                section.setElements(arrayList);
                Element element2 = new Element();
                element2.setElementType(ElementType.SHOW_ALL);
                Action action2 = new Action();
                action2.setType(ActionTypeEnum.MYGARAGE);
                element2.setAction(action2);
                section.getElements().add(element2);
                LinearLayout linearLayout = (LinearLayout) mo4624a(C1487a.sectionCon);
                if (linearLayout != null) {
                    C1471a.m5715a(linearLayout, new HorizontalScrollCustomView(getContext(), section, this.f21010c), R.id.recent_vehicles, 0);
                }
            }
        }
    }

    /* renamed from: d */
    private final void m27769d() {
        try {
            this.f21011d.clear();
            Object k = C1570t.m6026k(getContext());
            Object a = C3688b.m18507a(getContext());
            C2885g.m13907a(a, "DatabaseHelper.getInstance(context)");
            List<Object> query = a.m18508a().queryBuilder().orderBy("search_date", false).query();
            if (query != null) {
                for (Object obj : query) {
                    C2885g.m13907a(k, "garageResult");
                    List vehicleNumbers = k.getVehicleNumbers();
                    C2885g.m13907a(obj, "vehicleSearchResult");
                    if (vehicleNumbers.contains(obj.getVehicleNum())) {
                        VehicleSearchResult a2 = C1545h.m5871a(obj.getJsonString());
                        if (a2 != null) {
                            this.f21011d.add(a2);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if ((this.f21011d.isEmpty() ^ 1) != 0) {
            Section section = new Section();
            section.setTitle("Recent Searches");
            section.setHeader(true);
            section.setViewAllEnabled(false);
            section.setType(SectionTypeEnum.RECENT_SEARCH);
            ArrayList arrayList = new ArrayList();
            for (VehicleSearchResult vehicleSearchResult : this.f21011d) {
                if (arrayList.size() <= 2) {
                    Element element = new Element();
                    Content content = new Content();
                    content.setTitle(vehicleSearchResult.getDisplayName());
                    content.setSubTitle(vehicleSearchResult.getVehicleNum());
                    Action action = new Action();
                    action.setType(ActionTypeEnum.VEHICLE_DETAILS);
                    action.setVehicleSearchResult(vehicleSearchResult);
                    element.setAction(action);
                    element.setContent(content);
                    arrayList.add(element);
                }
            }
            section.setElements(arrayList);
            Element element2 = new Element();
            element2.setElementType(ElementType.SHOW_ALL);
            Action action2 = new Action();
            action2.setType(ActionTypeEnum.MYGARAGE);
            element2.setAction(action2);
            section.getElements().add(element2);
            LinearLayout linearLayout = (LinearLayout) mo4624a(C1487a.sectionCon);
            if (linearLayout != null) {
                C1471a.m5715a(linearLayout, new HorizontalScrollCustomView(getContext(), section, this.f21010c), R.id.recent_vehicles, 0);
            }
        }
    }

    public void onResume() {
        super.onResume();
    }
}
