package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class zaa {
    /* renamed from: a */
    public static final AbstractClientBuilder<SignInClientImpl, SignInOptions> f10810a = new C4713a();
    /* renamed from: b */
    public static final Api<SignInOptions> f10811b = new Api("SignIn.API", f10810a, f10812c);
    /* renamed from: c */
    private static final ClientKey<SignInClientImpl> f10812c = new ClientKey();
    @ShowFirstParty
    /* renamed from: d */
    private static final ClientKey<SignInClientImpl> f10813d = new ClientKey();
    /* renamed from: e */
    private static final AbstractClientBuilder<SignInClientImpl, Object> f10814e = new C4714b();
    /* renamed from: f */
    private static final Scope f10815f = new Scope(Scopes.PROFILE);
    /* renamed from: g */
    private static final Scope f10816g = new Scope(Scopes.EMAIL);
    /* renamed from: h */
    private static final Api<Object> f10817h = new Api("SignIn.INTERNAL_API", f10814e, f10813d);
}
