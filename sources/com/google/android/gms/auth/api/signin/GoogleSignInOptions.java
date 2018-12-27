package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements Optional, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new zad();
    @VisibleForTesting
    /* renamed from: a */
    public static final Scope f21251a = new Scope(Scopes.PROFILE);
    @VisibleForTesting
    /* renamed from: b */
    public static final Scope f21252b = new Scope(Scopes.EMAIL);
    @VisibleForTesting
    /* renamed from: c */
    public static final Scope f21253c = new Scope(Scopes.OPEN_ID);
    @VisibleForTesting
    /* renamed from: d */
    public static final Scope f21254d = new Scope(Scopes.GAMES_LITE);
    @VisibleForTesting
    /* renamed from: e */
    public static final Scope f21255e = new Scope(Scopes.GAMES);
    /* renamed from: f */
    public static final GoogleSignInOptions f21256f = new Builder().m8824a().m8826b().m8827c();
    /* renamed from: g */
    public static final GoogleSignInOptions f21257g = new Builder().m8825a(f21254d, new Scope[0]).m8827c();
    /* renamed from: r */
    private static Comparator<Scope> f21258r = new C2427a();
    @VersionField(id = 1)
    /* renamed from: h */
    private final int f21259h;
    @Field(getter = "getScopes", id = 2)
    /* renamed from: i */
    private final ArrayList<Scope> f21260i;
    @Field(getter = "getAccount", id = 3)
    /* renamed from: j */
    private Account f21261j;
    @Field(getter = "isIdTokenRequested", id = 4)
    /* renamed from: k */
    private boolean f21262k;
    @Field(getter = "isServerAuthCodeRequested", id = 5)
    /* renamed from: l */
    private final boolean f21263l;
    @Field(getter = "isForceCodeForRefreshToken", id = 6)
    /* renamed from: m */
    private final boolean f21264m;
    @Field(getter = "getServerClientId", id = 7)
    /* renamed from: n */
    private String f21265n;
    @Field(getter = "getHostedDomain", id = 8)
    /* renamed from: o */
    private String f21266o;
    @Field(getter = "getExtensions", id = 9)
    /* renamed from: p */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f21267p;
    /* renamed from: q */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f21268q;

    public static final class Builder {
        /* renamed from: a */
        private Set<Scope> f7861a = new HashSet();
        /* renamed from: b */
        private boolean f7862b;
        /* renamed from: c */
        private boolean f7863c;
        /* renamed from: d */
        private boolean f7864d;
        /* renamed from: e */
        private String f7865e;
        /* renamed from: f */
        private Account f7866f;
        /* renamed from: g */
        private String f7867g;
        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f7868h = new HashMap();

        /* renamed from: a */
        public final Builder m8824a() {
            this.f7861a.add(GoogleSignInOptions.f21253c);
            return this;
        }

        /* renamed from: b */
        public final Builder m8826b() {
            this.f7861a.add(GoogleSignInOptions.f21251a);
            return this;
        }

        /* renamed from: a */
        public final Builder m8825a(Scope scope, Scope... scopeArr) {
            this.f7861a.add(scope);
            this.f7861a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: c */
        public final GoogleSignInOptions m8827c() {
            if (this.f7861a.contains(GoogleSignInOptions.f21255e) && this.f7861a.contains(GoogleSignInOptions.f21254d)) {
                this.f7861a.remove(GoogleSignInOptions.f21254d);
            }
            if (this.f7864d && (this.f7866f == null || !this.f7861a.isEmpty())) {
                m8824a();
            }
            return new GoogleSignInOptions(new ArrayList(this.f7861a), this.f7866f, this.f7864d, this.f7862b, this.f7863c, this.f7865e, this.f7867g, this.f7868h);
        }
    }

    @Constructor
    GoogleSignInOptions(@Param(id = 1) int i, @Param(id = 2) ArrayList<Scope> arrayList, @Param(id = 3) Account account, @Param(id = 4) boolean z, @Param(id = 5) boolean z2, @Param(id = 6) boolean z3, @Param(id = 7) String str, @Param(id = 8) String str2, @Param(id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, (ArrayList) arrayList, account, z, z2, z3, str, str2, m28084a(arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f21259h = i;
        this.f21260i = arrayList;
        this.f21261j = account;
        this.f21262k = z;
        this.f21263l = z2;
        this.f21264m = z3;
        this.f21265n = str;
        this.f21266o = str2;
        this.f21267p = new ArrayList(map.values());
        this.f21268q = map;
    }

    @KeepForSdk
    /* renamed from: a */
    public ArrayList<Scope> m28085a() {
        return new ArrayList(this.f21260i);
    }

    @KeepForSdk
    /* renamed from: b */
    public Account m28086b() {
        return this.f21261j;
    }

    @KeepForSdk
    /* renamed from: c */
    public boolean m28087c() {
        return this.f21262k;
    }

    @KeepForSdk
    /* renamed from: d */
    public boolean m28088d() {
        return this.f21263l;
    }

    @KeepForSdk
    /* renamed from: e */
    public boolean m28089e() {
        return this.f21264m;
    }

    @KeepForSdk
    /* renamed from: f */
    public String m28090f() {
        return this.f21265n;
    }

    @KeepForSdk
    /* renamed from: g */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> m28091g() {
        return this.f21267p;
    }

    /* renamed from: a */
    private static Map<Integer, GoogleSignInOptionsExtensionParcelable> m28084a(List<GoogleSignInOptionsExtensionParcelable> list) {
        Map<Integer, GoogleSignInOptionsExtensionParcelable> hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.m25991a()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f21259h);
        SafeParcelWriter.writeTypedList(parcel, 2, m28085a(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, m28086b(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, m28087c());
        SafeParcelWriter.writeBoolean(parcel, 5, m28088d());
        SafeParcelWriter.writeBoolean(parcel, 6, m28089e());
        SafeParcelWriter.writeString(parcel, 7, m28090f(), false);
        SafeParcelWriter.writeString(parcel, 8, this.f21266o, false);
        SafeParcelWriter.writeTypedList(parcel, 9, m28091g(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public boolean equals(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4;	 Catch:{ ClassCastException -> 0x0088 }
        r1 = r3.f21267p;	 Catch:{ ClassCastException -> 0x0088 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 > 0) goto L_0x0087;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x000e:
        r1 = r4.f21267p;	 Catch:{ ClassCastException -> 0x0088 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 <= 0) goto L_0x0018;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0016:
        goto L_0x0087;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0018:
        r1 = r3.f21260i;	 Catch:{ ClassCastException -> 0x0088 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0088 }
        r2 = r4.m28085a();	 Catch:{ ClassCastException -> 0x0088 }
        r2 = r2.size();	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 != r2) goto L_0x0086;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0028:
        r1 = r3.f21260i;	 Catch:{ ClassCastException -> 0x0088 }
        r2 = r4.m28085a();	 Catch:{ ClassCastException -> 0x0088 }
        r1 = r1.containsAll(r2);	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 != 0) goto L_0x0035;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0034:
        goto L_0x0086;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0035:
        r1 = r3.f21261j;	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 != 0) goto L_0x0040;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0039:
        r1 = r4.m28086b();	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 != 0) goto L_0x0085;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x003f:
        goto L_0x004c;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0040:
        r1 = r3.f21261j;	 Catch:{ ClassCastException -> 0x0088 }
        r2 = r4.m28086b();	 Catch:{ ClassCastException -> 0x0088 }
        r1 = r1.equals(r2);	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 == 0) goto L_0x0085;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x004c:
        r1 = r3.f21265n;	 Catch:{ ClassCastException -> 0x0088 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 == 0) goto L_0x005f;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0054:
        r1 = r4.m28090f();	 Catch:{ ClassCastException -> 0x0088 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 == 0) goto L_0x0085;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x005e:
        goto L_0x006b;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x005f:
        r1 = r3.f21265n;	 Catch:{ ClassCastException -> 0x0088 }
        r2 = r4.m28090f();	 Catch:{ ClassCastException -> 0x0088 }
        r1 = r1.equals(r2);	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 == 0) goto L_0x0085;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x006b:
        r1 = r3.f21264m;	 Catch:{ ClassCastException -> 0x0088 }
        r2 = r4.m28089e();	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 != r2) goto L_0x0085;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x0073:
        r1 = r3.f21262k;	 Catch:{ ClassCastException -> 0x0088 }
        r2 = r4.m28087c();	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 != r2) goto L_0x0085;	 Catch:{ ClassCastException -> 0x0088 }
    L_0x007b:
        r1 = r3.f21263l;	 Catch:{ ClassCastException -> 0x0088 }
        r4 = r4.m28088d();	 Catch:{ ClassCastException -> 0x0088 }
        if (r1 != r4) goto L_0x0085;
    L_0x0083:
        r4 = 1;
        return r4;
    L_0x0085:
        return r0;
    L_0x0086:
        return r0;
    L_0x0087:
        return r0;
    L_0x0088:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        ArrayList arrayList2 = this.f21260i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).getScopeUri());
        }
        Collections.sort(arrayList);
        return new HashAccumulator().m8829a(arrayList).m8829a(this.f21261j).m8829a(this.f21265n).m8830a(this.f21264m).m8830a(this.f21262k).m8830a(this.f21263l).m8828a();
    }
}
