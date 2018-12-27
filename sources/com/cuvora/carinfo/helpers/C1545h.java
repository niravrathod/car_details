package com.cuvora.carinfo.helpers;

import android.content.Context;
import com.crashlytics.android.Crashlytics;
import com.cuvora.carinfo.genericScraper.ResponseType;
import com.cuvora.carinfo.genericScraper.ScrapeResponse;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.models.Mayday;
import com.cuvora.carinfo.models.MaydayAndResponse;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.ResultAction;
import com.cuvora.carinfo.models.TrendingSearchResult;
import com.cuvora.carinfo.models.VehicleInfo;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.models.cars.CarListParticularBrandResponse;
import com.cuvora.carinfo.models.cars.CarPropertiesResponse;
import com.cuvora.carinfo.models.cars.CarVariantsData;
import com.cuvora.carinfo.models.cars.CarsBrandsResponse;
import com.cuvora.carinfo.models.homepage.Action;
import com.cuvora.carinfo.models.homepage.ActionTypeEnum;
import com.cuvora.carinfo.models.homepage.CityFuelPrice;
import com.cuvora.carinfo.models.homepage.Content;
import com.cuvora.carinfo.models.homepage.Deeplink;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.HomePageData;
import com.cuvora.carinfo.models.homepage.HomeTabData;
import com.cuvora.carinfo.models.homepage.InstantArticleData;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.models.homepage.SectionTypeEnum;
import com.cuvora.carinfo.models.homepage.StateCityData;
import com.cuvora.carinfo.models.homepage.TabContent;
import com.cuvora.carinfo.models.homepage.TabTypeEnum;
import com.cuvora.carinfo.models.homepage.VideoData;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.Scopes;
import com.google.gson.C2629e;
import com.google.gson.C2630f;
import com.google.gson.p141b.C2624a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.helpers.h */
public class C1545h {
    /* renamed from: a */
    public static String f4685a = "MMM d, yyyy hh:mm:ss";

    /* renamed from: com.cuvora.carinfo.helpers.h$1 */
    static class C36931 extends C2624a<List<LicenseDetailsModel>> {
        C36931() {
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.h$2 */
    static class C36942 extends C2624a<Map<String, Object>> {
        C36942() {
        }
    }

    /* renamed from: a */
    public static C2629e m5875a() {
        return new C2630f().m12891a(f4685a).m12890a();
    }

    /* renamed from: a */
    public static VehicleSearchResult m5871a(String str) {
        try {
            if (C1562q.m5946a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (C1546i.m5909h(jSONObject, "data")) {
                    return C1545h.m5872a(C1546i.m5907f(jSONObject, "data"));
                }
                return C1545h.m5872a(new JSONObject(str));
            }
        } catch (String str2) {
            str2.printStackTrace();
        }
        return null;
    }

    /* renamed from: b */
    public static MaydayAndResponse m5878b(String str) {
        try {
            if (C1562q.m5946a(str)) {
                MaydayAndResponse maydayAndResponse = new MaydayAndResponse();
                JSONObject jSONObject = new JSONObject(str);
                if (C1546i.m5909h(jSONObject, "data")) {
                    jSONObject = C1546i.m5907f(jSONObject, "data");
                    if (C1546i.m5909h(jSONObject, "maydayRequest")) {
                        JSONObject f = C1546i.m5907f(jSONObject, "maydayRequest");
                        Mayday mayday = new Mayday();
                        if (C1546i.m5909h(f, "number")) {
                            mayday.setNumber(C1546i.m5899a(f, "number"));
                        }
                        if (C1546i.m5909h(f, "scrapeRequest")) {
                            mayday.setScrapeResponse(C1545h.m5877b(C1546i.m5907f(f, "scrapeRequest")));
                        }
                        maydayAndResponse.setMayday(mayday);
                    }
                    switch (ResponseType.m5744a(C1546i.m5899a(jSONObject, "response_type"))) {
                        case VEHICLE_DETAIL:
                            Response a = C1545h.m5872a(jSONObject);
                            if (a != null) {
                                maydayAndResponse.setResponse(a);
                                break;
                            }
                            maydayAndResponse.setResponse(C1545h.m5886e(str));
                            break;
                        case SCRAPE:
                            if (C1546i.m5909h(jSONObject, "scrape_request") != null) {
                                maydayAndResponse.setResponse(C1545h.m5877b(C1546i.m5907f(jSONObject, "scrape_request")));
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                maydayAndResponse.setResponse(C1545h.m5886e(str));
                return maydayAndResponse;
            }
        } catch (String str2) {
            str2.printStackTrace();
        }
        return null;
    }

    /* renamed from: c */
    public static TrendingSearchResult m5881c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (C1546i.m5909h(jSONObject, "data") != null) {
                str = new TrendingSearchResult();
                jSONObject = C1546i.m5907f(jSONObject, "data");
                if (C1546i.m5909h(jSONObject, "lastUpdated")) {
                    str.setEpoch(Long.parseLong(C1546i.m5899a(jSONObject, "lastUpdated")));
                }
                if (C1546i.m5909h(jSONObject, "list")) {
                    JSONArray g = C1546i.m5908g(jSONObject, "list");
                    List arrayList = new ArrayList();
                    for (int i = 0; i < g.length(); i++) {
                        arrayList.add(C1545h.m5872a(g.getJSONObject(i)));
                    }
                    str.setVehicleSearchResultList(arrayList);
                }
                return str;
            }
        } catch (String str2) {
            str2.printStackTrace();
        }
        return null;
    }

    /* renamed from: d */
    public static GarageResult m5884d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (C1546i.m5909h(jSONObject, "data") != null) {
                str = new GarageResult();
                jSONObject = C1546i.m5907f(jSONObject, "data");
                if (C1546i.m5909h(jSONObject, "myVehicles")) {
                    str.setVehicleNumbers(C1545h.m5880b(C1546i.m5908g(jSONObject, "myVehicles")));
                }
                if (C1546i.m5909h(jSONObject, "licenceSearches")) {
                    str.setLicenceSearches(C1545h.m5883c(C1546i.m5908g(jSONObject, "licenceSearches")));
                }
                if (C1546i.m5909h(jSONObject, "myGarageVehicles")) {
                    str.setMyGarageVehicles(C1545h.m5880b(C1546i.m5908g(jSONObject, "myGarageVehicles")));
                }
                if (C1546i.m5909h(jSONObject, FacebookAdapter.KEY_ID)) {
                    str.setUserId(C1546i.m5899a(jSONObject, FacebookAdapter.KEY_ID));
                }
                if (C1546i.m5909h(jSONObject, "contactInfo")) {
                    JSONObject f = C1546i.m5907f(jSONObject, "contactInfo");
                    if (C1546i.m5909h(f, Scopes.EMAIL)) {
                        str.setEmail(C1546i.m5899a(f, Scopes.EMAIL));
                    }
                    if (C1546i.m5909h(f, "mobile")) {
                        str.setMobileNumber(C1546i.m5899a(f, "mobile"));
                    }
                    if (C1546i.m5909h(f, "name")) {
                        str.setName(C1546i.m5899a(f, "name"));
                    }
                }
                if (C1546i.m5909h(jSONObject, "lastModTime")) {
                    str.setLastModifiedTime(C1546i.m5903b(jSONObject, "lastModTime").longValue());
                }
                if (C1546i.m5909h(jSONObject, "myVehicleDetails")) {
                    str.setVehicleSearchResultList(C1545h.m5876a(C1546i.m5908g(jSONObject, "myVehicleDetails")));
                }
                if (C1546i.m5909h(jSONObject, "licenceDetails")) {
                    JSONArray g = C1546i.m5908g(jSONObject, "licenceDetails");
                    str.setLicenceDetails((List) new C2629e().m12881a(g.toString(), new C36931().getType()));
                }
                if (C1546i.m5909h(jSONObject, "properties")) {
                    str.setProperties((Map) new C2629e().m12881a(String.valueOf(jSONObject.getJSONObject("properties")), new C36942().getType()));
                }
                return str;
            }
        } catch (String str2) {
            str2.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public static List<VehicleSearchResult> m5876a(JSONArray jSONArray) {
        try {
            List<VehicleSearchResult> arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(C1545h.m5872a(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        } catch (JSONArray jSONArray2) {
            jSONArray2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static List<String> m5880b(JSONArray jSONArray) {
        try {
            List<String> arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONArray jSONArray2) {
            jSONArray2.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static List<String> m5883c(JSONArray jSONArray) {
        try {
            List<String> arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONArray jSONArray2) {
            jSONArray2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static VehicleSearchResult m5872a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        VehicleSearchResult vehicleSearchResult = new VehicleSearchResult();
        try {
            boolean booleanValue = C1546i.m5909h(jSONObject2, "refreshAllowed") ? C1546i.m5906e(jSONObject2, "refreshAllowed").booleanValue() : false;
            boolean booleanValue2 = C1546i.m5909h(jSONObject2, "disableGarage") ? C1546i.m5906e(jSONObject2, "disableGarage").booleanValue() : false;
            String a = C1546i.m5909h(jSONObject2, "shareText") ? C1546i.m5899a(jSONObject2, "shareText") : null;
            String a2 = C1546i.m5909h(jSONObject2, "registrationNumber") ? C1546i.m5899a(jSONObject2, "registrationNumber") : null;
            String a3 = C1546i.m5909h(jSONObject2, "imageURL") ? C1546i.m5899a(jSONObject2, "imageURL") : null;
            boolean booleanValue3 = C1546i.m5909h(jSONObject2, "dbReferred") ? C1546i.m5906e(jSONObject2, "dbReferred").booleanValue() : false;
            boolean booleanValue4 = C1546i.m5909h(jSONObject2, "helpMe") ? C1546i.m5906e(jSONObject2, "helpMe").booleanValue() : false;
            if (C1546i.m5909h(jSONObject2, "carDetails")) {
                vehicleSearchResult.setCarVariantsData(C1545h.m5888f(C1546i.m5907f(jSONObject2, "carDetails")));
            }
            if (C1546i.m5909h(jSONObject2, "vehicleDetails")) {
                JSONArray g = C1546i.m5908g(jSONObject2, "vehicleDetails");
                if (g != null) {
                    boolean z;
                    List arrayList = new ArrayList();
                    int i = 0;
                    String str = null;
                    while (i < g.length()) {
                        JSONArray jSONArray;
                        JSONObject jSONObject3 = (JSONObject) g.get(i);
                        VehicleInfo vehicleInfo = new VehicleInfo();
                        if (C1546i.m5909h(jSONObject3, "info")) {
                            String str2;
                            Map linkedHashMap = new LinkedHashMap();
                            JSONArray g2 = C1546i.m5908g(jSONObject3, "info");
                            jSONArray = g;
                            JSONObject f = C1546i.m5907f(jSONObject3, "info");
                            if (g2 != null) {
                                if (C1546i.m5909h(jSONObject3, "displayName")) {
                                    str = C1546i.m5899a(jSONObject3, "displayName");
                                } else {
                                    str = C1546i.m5899a(g2.getJSONObject(0), "value");
                                }
                                int i2 = 0;
                                while (i2 < g2.length()) {
                                    f = g2.getJSONObject(i2);
                                    JSONArray jSONArray2 = g2;
                                    if (C1546i.m5909h(f, "key") && C1546i.m5909h(f, "value")) {
                                        str2 = str;
                                        linkedHashMap.put(C1546i.m5899a(f, "key"), C1546i.m5899a(f, "value"));
                                    } else {
                                        str2 = str;
                                    }
                                    if (C1546i.m5909h(f, "resultAction")) {
                                        C1545h.m5892i(C1546i.m5907f(f, "resultAction"));
                                    }
                                    i2++;
                                    g2 = jSONArray2;
                                    str = str2;
                                }
                                str2 = str;
                                z = booleanValue4;
                            } else if (f == null) {
                                return null;
                            } else {
                                Iterator keys = f.keys();
                                while (keys.hasNext()) {
                                    String str3 = (String) keys.next();
                                    if (C1546i.m5909h(f, str3)) {
                                        z = booleanValue4;
                                        linkedHashMap.put(str3, C1546i.m5899a(f, str3));
                                    } else {
                                        z = booleanValue4;
                                    }
                                    booleanValue4 = z;
                                }
                                z = booleanValue4;
                                if (C1546i.m5909h(jSONObject3, "displayName")) {
                                    str = C1546i.m5899a(jSONObject3, "displayName");
                                } else if (linkedHashMap.get("Owner Name") != null) {
                                    str = (String) linkedHashMap.get("Owner Name");
                                }
                                str2 = str;
                            }
                            vehicleInfo.setVehicleInfoMap(linkedHashMap);
                            str = str2;
                        } else {
                            z = booleanValue4;
                            jSONArray = g;
                        }
                        arrayList.add(vehicleInfo);
                        i++;
                        g = jSONArray;
                        booleanValue4 = z;
                        jSONObject2 = jSONObject;
                    }
                    z = booleanValue4;
                    vehicleSearchResult.setVehicleInfoList(arrayList);
                    vehicleSearchResult.setVehicleNum(a2);
                    vehicleSearchResult.setImageUrl(a3);
                    vehicleSearchResult.setDisplayName(str);
                    vehicleSearchResult.setJsonString(jSONObject.toString());
                    vehicleSearchResult.setDbReferred(booleanValue3);
                    vehicleSearchResult.setRefreshAllowed(booleanValue);
                    vehicleSearchResult.setDisableGarage(booleanValue2);
                    vehicleSearchResult.setShareText(a);
                    vehicleSearchResult.setHelpMe(z);
                    return vehicleSearchResult;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: b */
    public static ScrapeResponse m5877b(JSONObject jSONObject) {
        return (ScrapeResponse) new C2629e().m12880a(String.valueOf(jSONObject), ScrapeResponse.class);
    }

    /* renamed from: e */
    public static ErrorResponse m5886e(String str) {
        if (C1562q.m5946a(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (C1546i.m5909h(jSONObject, "errors") != null) {
                    str = C1546i.m5907f(jSONObject, "errors");
                    ErrorResponse errorResponse = new ErrorResponse();
                    if (C1546i.m5909h(str, "code")) {
                        errorResponse.setCode(C1546i.m5904c(str, "code").intValue());
                    }
                    if (C1546i.m5909h(str, "message")) {
                        errorResponse.setMessage(C1546i.m5899a(str, "message"));
                    }
                    if (C1546i.m5909h(str, "title")) {
                        errorResponse.setTitle(C1546i.m5899a(str, "title"));
                    }
                    return errorResponse;
                }
            } catch (String str2) {
                str2.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static HomeTabData m5874a(Context context, JSONObject jSONObject) {
        HomeTabData homeTabData = new HomeTabData();
        List arrayList = new ArrayList();
        try {
            if (C1546i.m5909h(jSONObject, "data")) {
                jSONObject = C1546i.m5907f(jSONObject, "data");
                if (C1546i.m5909h(jSONObject, "tabs")) {
                    jSONObject = C1546i.m5908g(jSONObject, "tabs");
                    for (int i = 0; i < jSONObject.length(); i++) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(i);
                        TabContent tabContent = new TabContent();
                        Integer c = C1546i.m5904c(jSONObject2, "minVersion");
                        Integer c2 = C1546i.m5904c(jSONObject2, "maxVersion");
                        if (c == null || c.intValue() <= C1570t.m5994b(context).intValue()) {
                            if (c2 == null || c2.intValue() >= C1570t.m5994b(context).intValue()) {
                                if (C1546i.m5909h(jSONObject2, "type")) {
                                    TabTypeEnum tabType = TabTypeEnum.getTabType(C1546i.m5899a(jSONObject2, "type"));
                                    if (tabType != null) {
                                        tabContent.setType(tabType);
                                    }
                                }
                                if (C1546i.m5909h(jSONObject2, "icon")) {
                                    tabContent.setIcon(C1546i.m5899a(jSONObject2, "icon"));
                                }
                                if (C1546i.m5909h(jSONObject2, "selectedIcon")) {
                                    tabContent.setSelectedIcon(C1546i.m5899a(jSONObject2, "selectedIcon"));
                                }
                                if (C1546i.m5909h(jSONObject2, "selected")) {
                                    tabContent.setSelected(C1546i.m5906e(jSONObject2, "selected").booleanValue());
                                }
                                if (C1546i.m5909h(jSONObject2, "title")) {
                                    tabContent.setTitle(C1546i.m5899a(jSONObject2, "title"));
                                }
                                if (C1546i.m5909h(jSONObject2, "showBanner")) {
                                    tabContent.setShowBanner(C1546i.m5906e(jSONObject2, "showBanner").booleanValue());
                                }
                                if (C1546i.m5909h(jSONObject2, "tabName")) {
                                    tabContent.setTabName(C1546i.m5899a(jSONObject2, "tabName"));
                                }
                                if (C1546i.m5909h(jSONObject2, "sections")) {
                                    tabContent.setHomePageData(C1545h.m5873a(context, C1546i.m5908g(jSONObject2, "sections")));
                                }
                                arrayList.add(tabContent);
                            }
                        }
                    }
                    homeTabData.setTabContents(arrayList);
                    return homeTabData;
                }
            }
        } catch (Context context2) {
            context2.printStackTrace();
        }
        return null;
    }

    /* renamed from: b */
    public static HomePageData m5879b(Context context, JSONObject jSONObject) {
        return C1546i.m5909h(jSONObject, "sections") ? C1545h.m5873a(context, C1546i.m5908g(jSONObject, "sections")) : null;
    }

    /* renamed from: a */
    public static HomePageData m5873a(Context context, JSONArray jSONArray) {
        try {
            HomePageData homePageData = new HomePageData();
            List arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Section section = new Section();
                Integer c = C1546i.m5904c(jSONObject, "minVersionAndroid");
                Integer c2 = C1546i.m5904c(jSONObject, "maxVersionAndroid");
                if (c == null || c.intValue() <= C1570t.m5994b(context).intValue()) {
                    if (c2 == null || c2.intValue() >= C1570t.m5994b(context).intValue()) {
                        section.setTitle(C1546i.m5899a(jSONObject, "title"));
                        section.setHeader(C1546i.m5906e(jSONObject, "header").booleanValue());
                        section.setViewAllEnabled(C1546i.m5906e(jSONObject, "viewAllEnabled").booleanValue());
                        SectionTypeEnum sectionType = SectionTypeEnum.getSectionType(C1546i.m5899a(jSONObject, "type"));
                        if (sectionType != null) {
                            section.setType(sectionType);
                            section.setAspectRatio(C1546i.m5905d(jSONObject, "aspectRatio"));
                            if (C1546i.m5909h(jSONObject, "elements")) {
                                JSONArray g = C1546i.m5908g(jSONObject, "elements");
                                List arrayList2 = new ArrayList();
                                for (int i2 = 0; i2 < g.length(); i2++) {
                                    JSONObject jSONObject2 = g.getJSONObject(i2);
                                    Element element = new Element();
                                    Integer c3 = C1546i.m5904c(jSONObject2, "minVersionAndroid");
                                    Integer c4 = C1546i.m5904c(jSONObject2, "maxVersionAndroid");
                                    if (c3 == null || c3.intValue() <= C1570t.m5994b(context).intValue()) {
                                        if (c4 == null || c4.intValue() >= C1570t.m5994b(context).intValue()) {
                                            if (C1546i.m5909h(jSONObject2, "action")) {
                                                JSONObject f = C1546i.m5907f(jSONObject2, "action");
                                                Action action = new Action();
                                                ActionTypeEnum actionType = ActionTypeEnum.getActionType(C1546i.m5899a(f, "type"));
                                                if (actionType != null) {
                                                    action.setType(actionType);
                                                    if (C1546i.m5909h(f, "vehicleTypeData")) {
                                                        action.setVehicleSearchResult(C1545h.m5872a(C1546i.m5907f(C1546i.m5907f(f, "vehicleTypeData"), "vehicleDetails")));
                                                    }
                                                    if (C1546i.m5909h(f, "videoTypeData")) {
                                                        action.setVideoData(C1545h.m5894k(C1546i.m5907f(f, "videoTypeData")));
                                                    }
                                                    if (C1546i.m5909h(f, "instantArticlesData")) {
                                                        action.setInstantArticleData(C1545h.m5893j(C1546i.m5907f(f, "instantArticlesData")));
                                                    }
                                                    if (C1546i.m5909h(f, "deepLink")) {
                                                        action.setDeeplink(C1545h.m5891h(C1546i.m5907f(f, "deepLink")));
                                                    }
                                                    if (C1546i.m5909h(f, "modelId")) {
                                                        action.setModelId(C1546i.m5899a(f, "modelId"));
                                                    }
                                                    element.setAction(action);
                                                }
                                            }
                                            if (C1546i.m5909h(jSONObject2, "content")) {
                                                jSONObject2 = C1546i.m5907f(jSONObject2, "content");
                                                Content content = new Content();
                                                content.setTitle(C1546i.m5899a(jSONObject2, "title"));
                                                content.setImageUrl(C1546i.m5899a(jSONObject2, "imageUrl"));
                                                content.setSubTitle(C1546i.m5899a(jSONObject2, "subtitile"));
                                                element.setContent(content);
                                            }
                                            arrayList2.add(element);
                                        }
                                    }
                                }
                                if (section.getType() == SectionTypeEnum.GRID && arrayList2.size() % 2 != 0) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                }
                                section.setElements(arrayList2);
                            }
                            arrayList.add(section);
                        }
                    }
                }
            }
            homePageData.setSections(arrayList);
            return homePageData;
        } catch (Throwable e) {
            e.printStackTrace();
            Crashlytics.logException(e);
            return null;
        }
    }

    /* renamed from: f */
    public static StateCityData m5889f(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (StateCityData) new C2629e().m12880a(String.valueOf(new JSONObject(str)), StateCityData.class);
        } catch (String str2) {
            str2.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    private static InstantArticleData m5893j(JSONObject jSONObject) {
        return (InstantArticleData) new C2629e().m12880a(String.valueOf(jSONObject), InstantArticleData.class);
    }

    /* renamed from: k */
    private static VideoData m5894k(JSONObject jSONObject) {
        return (VideoData) new C2629e().m12880a(String.valueOf(jSONObject), VideoData.class);
    }

    /* renamed from: c */
    public static CityFuelPrice m5882c(JSONObject jSONObject) {
        return (CityFuelPrice) new C2629e().m12880a(String.valueOf(jSONObject), CityFuelPrice.class);
    }

    /* renamed from: d */
    public static CarsBrandsResponse m5885d(JSONObject jSONObject) {
        return (CarsBrandsResponse) new C2629e().m12880a(String.valueOf(jSONObject), CarsBrandsResponse.class);
    }

    /* renamed from: e */
    public static CarListParticularBrandResponse m5887e(JSONObject jSONObject) {
        return (CarListParticularBrandResponse) new C2629e().m12880a(String.valueOf(jSONObject), CarListParticularBrandResponse.class);
    }

    /* renamed from: f */
    public static CarVariantsData m5888f(JSONObject jSONObject) {
        return (CarVariantsData) new C2629e().m12880a(String.valueOf(jSONObject), CarVariantsData.class);
    }

    /* renamed from: g */
    public static CarPropertiesResponse m5890g(JSONObject jSONObject) {
        return (CarPropertiesResponse) new C2629e().m12880a(String.valueOf(jSONObject), CarPropertiesResponse.class);
    }

    /* renamed from: h */
    public static Deeplink m5891h(JSONObject jSONObject) {
        return (Deeplink) new C2629e().m12880a(String.valueOf(jSONObject), Deeplink.class);
    }

    /* renamed from: i */
    public static ResultAction m5892i(JSONObject jSONObject) {
        return (ResultAction) new C2629e().m12880a(String.valueOf(jSONObject), ResultAction.class);
    }
}
