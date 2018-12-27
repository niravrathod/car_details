package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

@KeepForSdk
public class SignInClientImpl extends GmsClient<zaf> implements zad {
    /* renamed from: a */
    private final boolean f21447a;
    /* renamed from: b */
    private final ClientSettings f21448b;
    /* renamed from: c */
    private final Bundle f21449c;
    /* renamed from: d */
    private Integer f21450d;

    private SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, Bundle bundle, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f21447a = true;
        this.f21448b = clientSettings;
        this.f21449c = bundle;
        this.f21450d = clientSettings.getClientSessionId();
    }

    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    protected String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, SignInOptions signInOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, clientSettings, m28675a(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }

    public boolean requiresSignIn() {
        return this.f21447a;
    }

    /* renamed from: a */
    public final void mo4849a(com.google.android.gms.common.internal.IAccountAccessor r3, boolean r4) {
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
        r2 = this;
        r0 = r2.getService();	 Catch:{ RemoteException -> 0x0010 }
        r0 = (com.google.android.gms.signin.internal.zaf) r0;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r2.f21450d;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r1.intValue();	 Catch:{ RemoteException -> 0x0010 }
        r0.mo3200a(r3, r1, r4);	 Catch:{ RemoteException -> 0x0010 }
        return;
    L_0x0010:
        r3 = "SignInClientImpl";
        r4 = "Remote service probably died when saveDefaultAccount is called";
        android.util.Log.w(r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.SignInClientImpl.a(com.google.android.gms.common.internal.IAccountAccessor, boolean):void");
    }

    /* renamed from: a */
    public final void mo4848a() {
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
        r2 = this;
        r0 = r2.getService();	 Catch:{ RemoteException -> 0x0010 }
        r0 = (com.google.android.gms.signin.internal.zaf) r0;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r2.f21450d;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r1.intValue();	 Catch:{ RemoteException -> 0x0010 }
        r0.mo3199a(r1);	 Catch:{ RemoteException -> 0x0010 }
        return;
    L_0x0010:
        r0 = "SignInClientImpl";
        r1 = "Remote service probably died when clearAccountFromSessionStore is called";
        android.util.Log.w(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.SignInClientImpl.a():void");
    }

    /* renamed from: a */
    public final void mo4850a(com.google.android.gms.signin.internal.zad r5) {
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
        r4 = this;
        r0 = "Expecting a valid ISignInCallbacks";
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0);
        r0 = r4.f21448b;	 Catch:{ RemoteException -> 0x003c }
        r0 = r0.getAccountOrDefault();	 Catch:{ RemoteException -> 0x003c }
        r1 = 0;	 Catch:{ RemoteException -> 0x003c }
        r2 = "<<default account>>";	 Catch:{ RemoteException -> 0x003c }
        r3 = r0.name;	 Catch:{ RemoteException -> 0x003c }
        r2 = r2.equals(r3);	 Catch:{ RemoteException -> 0x003c }
        if (r2 == 0) goto L_0x0022;	 Catch:{ RemoteException -> 0x003c }
    L_0x0016:
        r1 = r4.getContext();	 Catch:{ RemoteException -> 0x003c }
        r1 = com.google.android.gms.auth.api.signin.internal.Storage.m8832a(r1);	 Catch:{ RemoteException -> 0x003c }
        r1 = r1.m8836a();	 Catch:{ RemoteException -> 0x003c }
    L_0x0022:
        r2 = new com.google.android.gms.common.internal.ResolveAccountRequest;	 Catch:{ RemoteException -> 0x003c }
        r3 = r4.f21450d;	 Catch:{ RemoteException -> 0x003c }
        r3 = r3.intValue();	 Catch:{ RemoteException -> 0x003c }
        r2.<init>(r0, r3, r1);	 Catch:{ RemoteException -> 0x003c }
        r0 = r4.getService();	 Catch:{ RemoteException -> 0x003c }
        r0 = (com.google.android.gms.signin.internal.zaf) r0;	 Catch:{ RemoteException -> 0x003c }
        r1 = new com.google.android.gms.signin.internal.zah;	 Catch:{ RemoteException -> 0x003c }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x003c }
        r0.mo3201a(r1, r5);	 Catch:{ RemoteException -> 0x003c }
        return;
    L_0x003c:
        r0 = move-exception;
        r1 = "SignInClientImpl";
        r2 = "Remote service probably died when signIn is called";
        android.util.Log.w(r1, r2);
        r1 = new com.google.android.gms.signin.internal.zaj;	 Catch:{ RemoteException -> 0x004f }
        r2 = 8;	 Catch:{ RemoteException -> 0x004f }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x004f }
        r5.zab(r1);	 Catch:{ RemoteException -> 0x004f }
        return;
    L_0x004f:
        r5 = "SignInClientImpl";
        r1 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.";
        android.util.Log.wtf(r5, r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.SignInClientImpl.a(com.google.android.gms.signin.internal.zad):void");
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f21448b.getRealClientPackageName())) {
            this.f21449c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f21448b.getRealClientPackageName());
        }
        return this.f21449c;
    }

    /* renamed from: b */
    public final void mo4851b() {
        connect(new LegacyClientCallbackAdapter(this));
    }

    @KeepForSdk
    /* renamed from: a */
    public static Bundle m28675a(ClientSettings clientSettings) {
        SignInOptions signInOptions = clientSettings.getSignInOptions();
        Integer clientSessionId = clientSettings.getClientSessionId();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (clientSessionId != null) {
            bundle.putInt(ClientSettings.KEY_CLIENT_SESSION_ID, clientSessionId.intValue());
        }
        if (signInOptions != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", signInOptions.m28667a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", signInOptions.m28668b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", signInOptions.m28669c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", signInOptions.m28670d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", signInOptions.m28671e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", signInOptions.m28672f());
            if (signInOptions.m28673g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", signInOptions.m28673g().longValue());
            }
            if (signInOptions.m28674h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", signInOptions.m28674h().longValue());
            }
        }
        return bundle;
    }

    protected /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return (zaf) queryLocalInterface;
        }
        return new zag(iBinder);
    }
}
