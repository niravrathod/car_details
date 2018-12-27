package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting
    /* renamed from: a */
    private static Clock f19609a = DefaultClock.getInstance();
    @VersionField(id = 1)
    /* renamed from: b */
    private final int f19610b;
    @Field(getter = "getId", id = 2)
    /* renamed from: c */
    private String f19611c;
    @Field(getter = "getIdToken", id = 3)
    /* renamed from: d */
    private String f19612d;
    @Field(getter = "getEmail", id = 4)
    /* renamed from: e */
    private String f19613e;
    @Field(getter = "getDisplayName", id = 5)
    /* renamed from: f */
    private String f19614f;
    @Field(getter = "getPhotoUrl", id = 6)
    /* renamed from: g */
    private Uri f19615g;
    @Field(getter = "getServerAuthCode", id = 7)
    /* renamed from: h */
    private String f19616h;
    @Field(getter = "getExpirationTimeSecs", id = 8)
    /* renamed from: i */
    private long f19617i;
    @Field(getter = "getObfuscatedIdentifier", id = 9)
    /* renamed from: j */
    private String f19618j;
    @Field(id = 10)
    /* renamed from: k */
    private List<Scope> f19619k;
    @Field(getter = "getGivenName", id = 11)
    /* renamed from: l */
    private String f19620l;
    @Field(getter = "getFamilyName", id = 12)
    /* renamed from: m */
    private String f19621m;
    /* renamed from: n */
    private Set<Scope> f19622n = new HashSet();

    /* renamed from: a */
    public static GoogleSignInAccount m25979a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        str = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(str) ? Uri.parse(str) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Set hashSet = new HashSet();
        str = jSONObject.getJSONArray("grantedScopes");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(str.getString(i)));
        }
        str = m25980a(jSONObject.optString(FacebookAdapter.KEY_ID), jSONObject.optString("tokenId", null), jSONObject.optString(Scopes.EMAIL, null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        str.f19616h = jSONObject.optString("serverAuthCode", null);
        return str;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m25980a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(f19609a.currentTimeMillis() / 1000) : l).longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    @Constructor
    GoogleSignInAccount(@Param(id = 1) int i, @Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) String str3, @Param(id = 5) String str4, @Param(id = 6) Uri uri, @Param(id = 7) String str5, @Param(id = 8) long j, @Param(id = 9) String str6, @Param(id = 10) List<Scope> list, @Param(id = 11) String str7, @Param(id = 12) String str8) {
        this.f19610b = i;
        this.f19611c = str;
        this.f19612d = str2;
        this.f19613e = str3;
        this.f19614f = str4;
        this.f19615g = uri;
        this.f19616h = str5;
        this.f19617i = j;
        this.f19618j = str6;
        this.f19619k = list;
        this.f19620l = str7;
        this.f19621m = str8;
    }

    /* renamed from: a */
    public String m25981a() {
        return this.f19611c;
    }

    /* renamed from: b */
    public String m25982b() {
        return this.f19612d;
    }

    /* renamed from: c */
    public String m25983c() {
        return this.f19613e;
    }

    /* renamed from: d */
    public Account m25984d() {
        return this.f19613e == null ? null : new Account(this.f19613e, AccountType.GOOGLE);
    }

    /* renamed from: e */
    public String m25985e() {
        return this.f19614f;
    }

    /* renamed from: f */
    public String m25986f() {
        return this.f19620l;
    }

    /* renamed from: g */
    public String m25987g() {
        return this.f19621m;
    }

    /* renamed from: h */
    public Uri m25988h() {
        return this.f19615g;
    }

    /* renamed from: i */
    public String m25989i() {
        return this.f19616h;
    }

    @KeepForSdk
    /* renamed from: j */
    public Set<Scope> m25990j() {
        Set<Scope> hashSet = new HashSet(this.f19619k);
        hashSet.addAll(this.f19622n);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f19610b);
        SafeParcelWriter.writeString(parcel, 2, m25981a(), false);
        SafeParcelWriter.writeString(parcel, 3, m25982b(), false);
        SafeParcelWriter.writeString(parcel, 4, m25983c(), false);
        SafeParcelWriter.writeString(parcel, 5, m25985e(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, m25988h(), i, false);
        SafeParcelWriter.writeString(parcel, 7, m25989i(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.f19617i);
        SafeParcelWriter.writeString(parcel, 9, this.f19618j, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f19619k, false);
        SafeParcelWriter.writeString(parcel, 11, m25986f(), false);
        SafeParcelWriter.writeString(parcel, 12, m25987g(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int hashCode() {
        return ((this.f19618j.hashCode() + 527) * 31) + m25990j().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f19618j.equals(this.f19618j) && googleSignInAccount.m25990j().equals(m25990j()) != null;
    }
}
