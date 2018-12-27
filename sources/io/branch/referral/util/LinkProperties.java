package io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class LinkProperties implements Parcelable {
    public static final Creator CREATOR = new C27571();
    /* renamed from: a */
    private final ArrayList<String> f11736a;
    /* renamed from: b */
    private String f11737b;
    /* renamed from: c */
    private String f11738c;
    /* renamed from: d */
    private String f11739d;
    /* renamed from: e */
    private int f11740e;
    /* renamed from: f */
    private final HashMap<String, String> f11741f;
    /* renamed from: g */
    private String f11742g;
    /* renamed from: h */
    private String f11743h;

    /* renamed from: io.branch.referral.util.LinkProperties$1 */
    static class C27571 implements Creator {
        C27571() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m13440a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m13441a(i);
        }

        /* renamed from: a */
        public LinkProperties m13440a(Parcel parcel) {
            return new LinkProperties(parcel);
        }

        /* renamed from: a */
        public LinkProperties[] m13441a(int i) {
            return new LinkProperties[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public LinkProperties() {
        this.f11736a = new ArrayList();
        this.f11737b = "Share";
        this.f11741f = new HashMap();
        this.f11738c = "";
        this.f11739d = "";
        this.f11740e = 0;
        this.f11742g = "";
        this.f11743h = "";
    }

    /* renamed from: a */
    public LinkProperties m13443a(String str, String str2) {
        this.f11741f.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public LinkProperties m13442a(String str) {
        this.f11737b = str;
        return this;
    }

    /* renamed from: b */
    public LinkProperties m13445b(String str) {
        this.f11742g = str;
        return this;
    }

    /* renamed from: a */
    public ArrayList<String> m13444a() {
        return this.f11736a;
    }

    /* renamed from: b */
    public HashMap<String, String> m13446b() {
        return this.f11741f;
    }

    /* renamed from: c */
    public int m13447c() {
        return this.f11740e;
    }

    /* renamed from: d */
    public String m13448d() {
        return this.f11738c;
    }

    /* renamed from: e */
    public String m13449e() {
        return this.f11737b;
    }

    /* renamed from: f */
    public String m13450f() {
        return this.f11739d;
    }

    /* renamed from: g */
    public String m13451g() {
        return this.f11742g;
    }

    /* renamed from: h */
    public String m13452h() {
        return this.f11743h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11737b);
        parcel.writeString(this.f11738c);
        parcel.writeString(this.f11739d);
        parcel.writeString(this.f11742g);
        parcel.writeString(this.f11743h);
        parcel.writeInt(this.f11740e);
        parcel.writeSerializable(this.f11736a);
        parcel.writeInt(this.f11741f.size());
        for (Entry entry : this.f11741f.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    private LinkProperties(Parcel parcel) {
        this();
        this.f11737b = parcel.readString();
        this.f11738c = parcel.readString();
        this.f11739d = parcel.readString();
        this.f11742g = parcel.readString();
        this.f11743h = parcel.readString();
        this.f11740e = parcel.readInt();
        this.f11736a.addAll((ArrayList) parcel.readSerializable());
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f11741f.put(parcel.readString(), parcel.readString());
        }
    }
}
