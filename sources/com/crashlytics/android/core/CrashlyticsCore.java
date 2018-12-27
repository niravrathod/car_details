package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import com.crashlytics.android.answers.EventLogger;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2796g;
import io.fabric.sdk.android.services.common.C2802l;
import io.fabric.sdk.android.services.common.C2803m;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.C2823b;
import io.fabric.sdk.android.services.concurrency.C2828i;
import io.fabric.sdk.android.services.concurrency.C4735d;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.C2836e;
import io.fabric.sdk.android.services.network.C4317b;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.p148c.C2786a;
import io.fabric.sdk.android.services.p148c.C4297b;
import io.fabric.sdk.android.services.p148c.C4298d;
import io.fabric.sdk.android.services.settings.C2851q;
import io.fabric.sdk.android.services.settings.C2853s;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

@C2823b(a = {CrashlyticsNdkDataProvider.class})
public class CrashlyticsCore extends C2771h<Void> {
    static final float CLS_DEFAULT_PROCESS_DELAY = 1.0f;
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
    private static final String PREFERENCE_STORE_NAME = "com.crashlytics.android.core.CrashlyticsCore";
    public static final String TAG = "CrashlyticsCore";
    private final ConcurrentHashMap<String, String> attributes;
    private C1370i backgroundWorker;
    private C1386j controller;
    private C1387k crashMarker;
    private CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
    private float delay;
    private boolean disabled;
    private C2834c httpRequestFactory;
    private C1387k initializationMarker;
    private CrashlyticsListener listener;
    private final PinningInfoProvider pinningInfo;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$2 */
    class C13442 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ CrashlyticsCore f4224a;

        C13442(CrashlyticsCore crashlyticsCore) {
            this.f4224a = crashlyticsCore;
        }

        public /* synthetic */ Object call() {
            return m5439a();
        }

        /* renamed from: a */
        public Void m5439a() {
            this.f4224a.initializationMarker.m5660a();
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Initialization marker file created.");
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$3 */
    class C13453 implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ CrashlyticsCore f4225a;

        C13453(CrashlyticsCore crashlyticsCore) {
            this.f4225a = crashlyticsCore;
        }

        public /* synthetic */ Object call() {
            return m5440a();
        }

        /* renamed from: a */
        public Boolean m5440a() {
            try {
                boolean c = this.f4225a.initializationMarker.m5662c();
                C2774k h = C2766c.m13524h();
                String str = CrashlyticsCore.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Initialization marker file removed: ");
                stringBuilder.append(c);
                h.mo3554a(str, stringBuilder.toString());
                return Boolean.valueOf(c);
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.valueOf(false);
            }
        }
    }

    public static class Builder {
        private float delay = -1.0f;
        private boolean disabled = false;
        private CrashlyticsListener listener;
        private PinningInfoProvider pinningInfoProvider;

        public Builder delay(float f) {
            if (f <= 0.0f) {
                throw new IllegalArgumentException("delay must be greater than 0");
            } else if (this.delay <= 0.0f) {
                this.delay = f;
                return this;
            } else {
                throw new IllegalStateException("delay already set.");
            }
        }

        public Builder listener(CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.listener == null) {
                this.listener = crashlyticsListener;
                return this;
            } else {
                throw new IllegalStateException("listener already set.");
            }
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            if (pinningInfoProvider == null) {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            } else if (this.pinningInfoProvider == null) {
                this.pinningInfoProvider = pinningInfoProvider;
                return this;
            } else {
                throw new IllegalStateException("pinningInfoProvider already set.");
            }
        }

        public Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public CrashlyticsCore build() {
            if (this.delay < 0.0f) {
                this.delay = CrashlyticsCore.CLS_DEFAULT_PROCESS_DELAY;
            }
            return new CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$a */
    private static final class C1346a implements Callable<Boolean> {
        /* renamed from: a */
        private final C1387k f4226a;

        public /* synthetic */ Object call() {
            return m5441a();
        }

        public C1346a(C1387k c1387k) {
            this.f4226a = c1387k;
        }

        /* renamed from: a */
        public Boolean m5441a() {
            if (!this.f4226a.m5661b()) {
                return Boolean.FALSE;
            }
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Found previous crash marker.");
            this.f4226a.m5662c();
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$b */
    private static final class C3567b implements CrashlyticsListener {
        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }

        private C3567b() {
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$1 */
    class C47871 extends C4735d<Void> {
        /* renamed from: a */
        final /* synthetic */ CrashlyticsCore f20916a;

        C47871(CrashlyticsCore crashlyticsCore) {
            this.f20916a = crashlyticsCore;
        }

        public /* synthetic */ Object call() {
            return m27755a();
        }

        /* renamed from: a */
        public Void m27755a() {
            return this.f20916a.doInBackground();
        }

        /* renamed from: b */
        public Priority mo3582b() {
            return Priority.IMMEDIATE;
        }
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public String getVersion() {
        return "2.6.3.25";
    }

    public CrashlyticsCore() {
        this(CLS_DEFAULT_PROCESS_DELAY, null, null, false);
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z) {
        this(f, crashlyticsListener, pinningInfoProvider, z, C2802l.m13688a("Crashlytics Exception Handler"));
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.userId = null;
        this.userEmail = null;
        this.userName = null;
        this.delay = f;
        if (crashlyticsListener == null) {
            crashlyticsListener = new C3567b();
        }
        this.listener = crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.backgroundWorker = new C1370i(executorService);
        this.attributes = new ConcurrentHashMap();
        this.startTime = System.currentTimeMillis();
    }

    protected boolean onPreExecute() {
        return onPreExecute(super.getContext());
    }

    boolean onPreExecute(Context context) {
        Context context2 = context;
        if (this.disabled) {
            return false;
        }
        String a = new C2796g().m13679a(context2);
        if (a == null) {
            return false;
        }
        String m = CommonUtils.m13637m(context);
        if (isBuildIdValid(m, CommonUtils.m13616a(context2, CRASHLYTICS_REQUIRE_BUILD_ID, true))) {
            try {
                C2774k h = C2766c.m13524h();
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Initializing Crashlytics ");
                stringBuilder.append(getVersion());
                h.mo3558c(str, stringBuilder.toString());
                C2786a c4297b = new C4297b(r12);
                r12.crashMarker = new C1387k(CRASH_MARKER_FILE_NAME, c4297b);
                r12.initializationMarker = new C1387k(INITIALIZATION_MARKER_FILE_NAME, c4297b);
                ad a2 = ad.m5469a(new C4298d(getContext(), PREFERENCE_STORE_NAME), r12);
                C2836e c3581l = r12.pinningInfo != null ? new C3581l(r12.pinningInfo) : null;
                r12.httpRequestFactory = new C4317b(C2766c.m13524h());
                r12.httpRequestFactory.mo3593a(c3581l);
                IdManager idManager = getIdManager();
                C1349a a3 = C1349a.m5458a(context2, idManager, a, m);
                an c3585w = new C3585w(context2, a3.f4234d);
                C1354b a4 = C3582p.m18145a(this);
                EventLogger eventLogger = AppMeasurementEventLogger.getEventLogger(context);
                C2774k h2 = C2766c.m13524h();
                m = TAG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Installer package name is: ");
                stringBuilder2.append(a3.f4233c);
                h2.mo3554a(m, stringBuilder2.toString());
                C1386j c1386j = r1;
                C1386j c1386j2 = new C1386j(this, r12.backgroundWorker, r12.httpRequestFactory, idManager, a2, c4297b, a3, c3585w, a4, eventLogger);
                r12.controller = c1386j;
                boolean didPreviousInitializationFail = didPreviousInitializationFail();
                checkForPreviousCrash();
                r12.controller.m5642a(Thread.getDefaultUncaughtExceptionHandler(), new C2803m().m13695b(context2));
                if (didPreviousInitializationFail && CommonUtils.m13638n(context)) {
                    C2766c.m13524h().mo3554a(TAG, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    finishInitSynchronously();
                    return false;
                }
                C2766c.m13524h().mo3554a(TAG, "Exception handling initialization successful");
                return true;
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(TAG, "Crashlytics was not started due to an exception during initialization", e);
                r12.controller = null;
                return false;
            }
        }
        throw new UnmetDependencyException(MISSING_BUILD_ID_MSG);
    }

    protected Void doInBackground() {
        markInitializationStarted();
        this.controller.m5652e();
        try {
            this.controller.m5658k();
            C2853s b = C2851q.m13855a().m13858b();
            if (b == null) {
                C2766c.m13524h().mo3559d(TAG, "Received null settings, skipping report submission!");
                markInitializationComplete();
                return null;
            }
            this.controller.m5640a(b);
            if (b.f12058d.f12029c) {
                CrashlyticsNdkData nativeCrashData = getNativeCrashData();
                if (!(nativeCrashData == null || this.controller.m5646a(nativeCrashData))) {
                    C2766c.m13524h().mo3554a(TAG, "Could not finalize previous NDK sessions.");
                }
                if (!this.controller.m5647a(b.f12056b)) {
                    C2766c.m13524h().mo3554a(TAG, "Could not finalize previous sessions.");
                }
                this.controller.m5636a(this.delay, b);
                markInitializationComplete();
                return null;
            }
            C2766c.m13524h().mo3554a(TAG, "Collection of crash reports disabled in Crashlytics settings.");
            markInitializationComplete();
            return null;
        } catch (Throwable e) {
            C2766c.m13524h().mo3562e(TAG, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            markInitializationComplete();
        }
    }

    public static CrashlyticsCore getInstance() {
        return (CrashlyticsCore) C2766c.m13515a(CrashlyticsCore.class);
    }

    public PinningInfoProvider getPinningInfoProvider() {
        return !this.disabled ? this.pinningInfo : null;
    }

    public void logException(Throwable th) {
        if (this.disabled || !ensureFabricWithCalled("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            C2766c.m13524h().mo3552a(5, TAG, "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.controller.m5643a(Thread.currentThread(), th);
        }
    }

    public void log(String str) {
        doLog(3, TAG, str);
    }

    private void doLog(int i, String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging messages.")) {
            this.controller.m5638a(System.currentTimeMillis() - this.startTime, formatLogMessage(i, str, str2));
        }
    }

    public void log(int i, String str, String str2) {
        doLog(i, str, str2);
        C2774k h = C2766c.m13524h();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str2);
        h.mo3553a(i, str, stringBuilder.toString(), true);
    }

    public void setUserIdentifier(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userId = sanitizeAttribute(str);
            this.controller.m5641a(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserName(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userName = sanitizeAttribute(str);
            this.controller.m5641a(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserEmail(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userEmail = sanitizeAttribute(str);
            this.controller.m5641a(this.userId, this.userName, this.userEmail);
        }
    }

    public void setString(String str, String str2) {
        if (this.disabled || !ensureFabricWithCalled("prior to setting keys.")) {
            return;
        }
        if (str == null) {
            str = getContext();
            if (str != null) {
                if (CommonUtils.m13633i(str) != null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            C2766c.m13524h().mo3562e(TAG, "Attempting to set custom attribute with null key, ignoring.", null);
            return;
        }
        str = sanitizeAttribute(str);
        if (this.attributes.size() < 64 || this.attributes.containsKey(str)) {
            if (str2 == null) {
                str2 = "";
            } else {
                str2 = sanitizeAttribute(str2);
            }
            this.attributes.put(str, str2);
            this.controller.m5644a(this.attributes);
            return;
        }
        C2766c.m13524h().mo3554a(TAG, "Exceeded maximum number of custom attributes (64)");
    }

    public void setBool(String str, boolean z) {
        setString(str, Boolean.toString(z));
    }

    public void setDouble(String str, double d) {
        setString(str, Double.toString(d));
    }

    public void setFloat(String str, float f) {
        setString(str, Float.toString(f));
    }

    public void setInt(String str, int i) {
        setString(str, Integer.toString(i));
    }

    public void setLong(String str, long j) {
        setString(str, Long.toString(j));
    }

    public void crash() {
        new CrashTest().indexOutOfBounds();
    }

    public boolean verifyPinning(URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (URL url2) {
            C2766c.m13524h().mo3562e(TAG, "Could not verify SSL pinning", url2);
            return null;
        }
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        C2766c.m13524h().mo3559d(TAG, "Use of setListener is deprecated.");
        if (crashlyticsListener != null) {
            this.listener = crashlyticsListener;
        } else {
            throw new IllegalArgumentException("listener must not be null.");
        }
    }

    Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    C1386j getController() {
        return this.controller;
    }

    String getUserIdentifier() {
        return getIdManager().m13648a() ? this.userId : null;
    }

    String getUserEmail() {
        return getIdManager().m13648a() ? this.userEmail : null;
    }

    String getUserName() {
        return getIdManager().m13648a() ? this.userName : null;
    }

    private void finishInitSynchronously() {
        Callable c47871 = new C47871(this);
        for (C2828i a : getDependencies()) {
            c47871.m23651a(a);
        }
        Future submit = getFabric().m13536f().submit(c47871);
        C2766c.m13524h().mo3554a(TAG, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (Throwable e) {
            C2766c.m13524h().mo3562e(TAG, "Crashlytics was interrupted during initialization.", e);
        } catch (Throwable e2) {
            C2766c.m13524h().mo3562e(TAG, "Problem encountered during Crashlytics initialization.", e2);
        } catch (Throwable e22) {
            C2766c.m13524h().mo3562e(TAG, "Crashlytics timed out during initialization.", e22);
        }
    }

    void markInitializationStarted() {
        this.backgroundWorker.m5554a(new C13442(this));
    }

    void markInitializationComplete() {
        this.backgroundWorker.m5556b(new C13453(this));
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.m5661b();
    }

    void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsNdkDataProvider) {
        this.crashlyticsNdkDataProvider = crashlyticsNdkDataProvider;
    }

    CrashlyticsNdkData getNativeCrashData() {
        return this.crashlyticsNdkDataProvider != null ? this.crashlyticsNdkDataProvider.getCrashlyticsNdkData() : null;
    }

    boolean internalVerifyPinning(URL url) {
        if (getPinningInfoProvider() == null) {
            return false;
        }
        url = this.httpRequestFactory.mo3591a(HttpMethod.GET, url.toString());
        ((HttpsURLConnection) url.m13806a()).setInstanceFollowRedirects(false);
        url.m13807b();
        return true;
    }

    private void checkForPreviousCrash() {
        if (Boolean.TRUE.equals((Boolean) this.backgroundWorker.m5554a(new C1346a(this.crashMarker)))) {
            try {
                this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(TAG, "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    void createCrashMarker() {
        this.crashMarker.m5660a();
    }

    private static String formatLogMessage(int i, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CommonUtils.m13619b(i));
        stringBuilder.append("/");
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private static boolean ensureFabricWithCalled(String str) {
        CrashlyticsCore instance = getInstance();
        if (instance != null) {
            if (instance.controller != null) {
                return true;
            }
        }
        C2774k h = C2766c.m13524h();
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
        stringBuilder.append(str);
        h.mo3562e(str2, stringBuilder.toString(), null);
        return null;
    }

    private static String sanitizeAttribute(String str) {
        if (str == null) {
            return str;
        }
        str = str.trim();
        return str.length() > MAX_ATTRIBUTE_SIZE ? str.substring(0, MAX_ATTRIBUTE_SIZE) : str;
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            C2766c.m13524h().mo3554a(TAG, "Configured not to require a build ID.");
            return true;
        } else if (CommonUtils.m13628d(str) == null) {
            return true;
        } else {
            Log.e(TAG, ".");
            Log.e(TAG, ".     |  | ");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".   \\ |  | /");
            Log.e(TAG, ".    \\    /");
            Log.e(TAG, ".     \\  /");
            Log.e(TAG, ".      \\/");
            Log.e(TAG, ".");
            Log.e(TAG, MISSING_BUILD_ID_MSG);
            Log.e(TAG, ".");
            Log.e(TAG, ".      /\\");
            Log.e(TAG, ".     /  \\");
            Log.e(TAG, ".    /    \\");
            Log.e(TAG, ".   / |  | \\");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".");
            return null;
        }
    }
}
