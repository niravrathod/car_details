package io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import io.branch.referral.Defines.Jsonkey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ContentMetadata implements Parcelable {
    public static final Creator CREATOR = new C27561();
    /* renamed from: a */
    BranchContentSchema f11661a;
    /* renamed from: b */
    public Double f11662b;
    /* renamed from: c */
    public Double f11663c;
    /* renamed from: d */
    public CurrencyType f11664d;
    /* renamed from: e */
    public String f11665e;
    /* renamed from: f */
    public String f11666f;
    /* renamed from: g */
    public String f11667g;
    /* renamed from: h */
    public ProductCategory f11668h;
    /* renamed from: i */
    public CONDITION f11669i;
    /* renamed from: j */
    public String f11670j;
    /* renamed from: k */
    public Double f11671k;
    /* renamed from: l */
    public Double f11672l;
    /* renamed from: m */
    public Integer f11673m;
    /* renamed from: n */
    public Double f11674n;
    /* renamed from: o */
    public String f11675o;
    /* renamed from: p */
    public String f11676p;
    /* renamed from: q */
    public String f11677q;
    /* renamed from: r */
    public String f11678r;
    /* renamed from: s */
    public String f11679s;
    /* renamed from: t */
    public Double f11680t;
    /* renamed from: u */
    public Double f11681u;
    /* renamed from: v */
    private final ArrayList<String> f11682v;
    /* renamed from: w */
    private final HashMap<String, String> f11683w;

    /* renamed from: io.branch.referral.util.ContentMetadata$1 */
    static class C27561 implements Creator {
        C27561() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m13434a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m13435a(i);
        }

        /* renamed from: a */
        public ContentMetadata m13434a(Parcel parcel) {
            return new ContentMetadata(parcel);
        }

        /* renamed from: a */
        public ContentMetadata[] m13435a(int i) {
            return new ContentMetadata[i];
        }
    }

    public enum CONDITION {
        OTHER,
        NEW,
        GOOD,
        FAIR,
        POOR,
        USED,
        REFURBISHED,
        EXCELLENT;

        /* renamed from: a */
        public static CONDITION m13436a(String str) {
            if (!TextUtils.isEmpty(str)) {
                for (CONDITION condition : values()) {
                    if (condition.name().equalsIgnoreCase(str)) {
                        return condition;
                    }
                }
            }
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public ContentMetadata() {
        this.f11682v = new ArrayList();
        this.f11683w = new HashMap();
    }

    /* renamed from: a */
    public ContentMetadata m13437a(String str, String str2) {
        this.f11683w.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public JSONObject m13438a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11661a != null) {
                jSONObject.put(Jsonkey.ContentSchema.m13131a(), this.f11661a.name());
            }
            if (this.f11662b != null) {
                jSONObject.put(Jsonkey.Quantity.m13131a(), this.f11662b);
            }
            if (this.f11663c != null) {
                jSONObject.put(Jsonkey.Price.m13131a(), this.f11663c);
            }
            if (this.f11664d != null) {
                jSONObject.put(Jsonkey.PriceCurrency.m13131a(), this.f11664d.toString());
            }
            if (!TextUtils.isEmpty(this.f11665e)) {
                jSONObject.put(Jsonkey.SKU.m13131a(), this.f11665e);
            }
            if (!TextUtils.isEmpty(this.f11666f)) {
                jSONObject.put(Jsonkey.ProductName.m13131a(), this.f11666f);
            }
            if (!TextUtils.isEmpty(this.f11667g)) {
                jSONObject.put(Jsonkey.ProductBrand.m13131a(), this.f11667g);
            }
            if (this.f11668h != null) {
                jSONObject.put(Jsonkey.ProductCategory.m13131a(), this.f11668h.m13454a());
            }
            if (this.f11669i != null) {
                jSONObject.put(Jsonkey.Condition.m13131a(), this.f11669i.name());
            }
            if (!TextUtils.isEmpty(this.f11670j)) {
                jSONObject.put(Jsonkey.ProductVariant.m13131a(), this.f11670j);
            }
            if (this.f11671k != null) {
                jSONObject.put(Jsonkey.Rating.m13131a(), this.f11671k);
            }
            if (this.f11672l != null) {
                jSONObject.put(Jsonkey.RatingAverage.m13131a(), this.f11672l);
            }
            if (this.f11673m != null) {
                jSONObject.put(Jsonkey.RatingCount.m13131a(), this.f11673m);
            }
            if (this.f11674n != null) {
                jSONObject.put(Jsonkey.RatingMax.m13131a(), this.f11674n);
            }
            if (!TextUtils.isEmpty(this.f11675o)) {
                jSONObject.put(Jsonkey.AddressStreet.m13131a(), this.f11675o);
            }
            if (!TextUtils.isEmpty(this.f11676p)) {
                jSONObject.put(Jsonkey.AddressCity.m13131a(), this.f11676p);
            }
            if (!TextUtils.isEmpty(this.f11677q)) {
                jSONObject.put(Jsonkey.AddressRegion.m13131a(), this.f11677q);
            }
            if (!TextUtils.isEmpty(this.f11678r)) {
                jSONObject.put(Jsonkey.AddressCountry.m13131a(), this.f11678r);
            }
            if (!TextUtils.isEmpty(this.f11679s)) {
                jSONObject.put(Jsonkey.AddressPostalCode.m13131a(), this.f11679s);
            }
            if (this.f11680t != null) {
                jSONObject.put(Jsonkey.Latitude.m13131a(), this.f11680t);
            }
            if (this.f11681u != null) {
                jSONObject.put(Jsonkey.Longitude.m13131a(), this.f11681u);
            }
            if (this.f11682v.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put(Jsonkey.ImageCaptions.m13131a(), jSONArray);
                Iterator it = this.f11682v.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            if (this.f11683w.size() > 0) {
                for (String str : this.f11683w.keySet()) {
                    jSONObject.put(str, this.f11683w.get(str));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11661a != 0 ? this.f11661a.name() : "");
        parcel.writeSerializable(this.f11662b);
        parcel.writeSerializable(this.f11663c);
        parcel.writeString(this.f11664d != 0 ? this.f11664d.name() : "");
        parcel.writeString(this.f11665e);
        parcel.writeString(this.f11666f);
        parcel.writeString(this.f11667g);
        parcel.writeString(this.f11668h != 0 ? this.f11668h.m13454a() : "");
        parcel.writeString(this.f11669i != 0 ? this.f11669i.name() : "");
        parcel.writeString(this.f11670j);
        parcel.writeSerializable(this.f11671k);
        parcel.writeSerializable(this.f11672l);
        parcel.writeSerializable(this.f11673m);
        parcel.writeSerializable(this.f11674n);
        parcel.writeString(this.f11675o);
        parcel.writeString(this.f11676p);
        parcel.writeString(this.f11677q);
        parcel.writeString(this.f11678r);
        parcel.writeString(this.f11679s);
        parcel.writeSerializable(this.f11680t);
        parcel.writeSerializable(this.f11681u);
        parcel.writeSerializable(this.f11682v);
        parcel.writeSerializable(this.f11683w);
    }

    private ContentMetadata(Parcel parcel) {
        this();
        this.f11661a = BranchContentSchema.m13433a(parcel.readString());
        this.f11662b = (Double) parcel.readSerializable();
        this.f11663c = (Double) parcel.readSerializable();
        this.f11664d = CurrencyType.m13439a(parcel.readString());
        this.f11665e = parcel.readString();
        this.f11666f = parcel.readString();
        this.f11667g = parcel.readString();
        this.f11668h = ProductCategory.m13453a(parcel.readString());
        this.f11669i = CONDITION.m13436a(parcel.readString());
        this.f11670j = parcel.readString();
        this.f11671k = (Double) parcel.readSerializable();
        this.f11672l = (Double) parcel.readSerializable();
        this.f11673m = (Integer) parcel.readSerializable();
        this.f11674n = (Double) parcel.readSerializable();
        this.f11675o = parcel.readString();
        this.f11676p = parcel.readString();
        this.f11677q = parcel.readString();
        this.f11678r = parcel.readString();
        this.f11679s = parcel.readString();
        this.f11680t = (Double) parcel.readSerializable();
        this.f11681u = (Double) parcel.readSerializable();
        this.f11682v.addAll((ArrayList) parcel.readSerializable());
        this.f11683w.putAll((HashMap) parcel.readSerializable());
    }
}
