package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2798i.C4302a;
import io.fabric.sdk.android.services.common.C2798i.C4303b;
import io.fabric.sdk.android.services.common.C2803m;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.C2851q;
import io.fabric.sdk.android.services.settings.C2853s;
import java.io.File;

public class Answers extends C2771h<Boolean> {
    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    public static final String TAG = "Answers";
    C3559s analyticsManager;
    boolean firebaseEnabled = false;

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:answers";
    }

    public String getVersion() {
        return "1.4.2.25";
    }

    public static Answers getInstance() {
        return (Answers) C2766c.m13515a(Answers.class);
    }

    public void logCustom(CustomEvent customEvent) {
        if (customEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logCustom");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18053a(customEvent);
            }
        }
    }

    public void logPurchase(PurchaseEvent purchaseEvent) {
        if (purchaseEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logPurchase");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) purchaseEvent);
            }
        }
    }

    public void logLogin(LoginEvent loginEvent) {
        if (loginEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLogin");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) loginEvent);
            }
        }
    }

    public void logShare(ShareEvent shareEvent) {
        if (shareEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logShare");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) shareEvent);
            }
        }
    }

    public void logInvite(InviteEvent inviteEvent) {
        if (inviteEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logInvite");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) inviteEvent);
            }
        }
    }

    public void logSignUp(SignUpEvent signUpEvent) {
        if (signUpEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSignUp");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) signUpEvent);
            }
        }
    }

    public void logLevelStart(LevelStartEvent levelStartEvent) {
        if (levelStartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelStart");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) levelStartEvent);
            }
        }
    }

    public void logLevelEnd(LevelEndEvent levelEndEvent) {
        if (levelEndEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelEnd");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) levelEndEvent);
            }
        }
    }

    public void logAddToCart(AddToCartEvent addToCartEvent) {
        if (addToCartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logAddToCart");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) addToCartEvent);
            }
        }
    }

    public void logStartCheckout(StartCheckoutEvent startCheckoutEvent) {
        if (startCheckoutEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logStartCheckout");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) startCheckoutEvent);
            }
        }
    }

    public void logRating(RatingEvent ratingEvent) {
        if (ratingEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logRating");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) ratingEvent);
            }
        }
    }

    public void logContentView(ContentViewEvent contentViewEvent) {
        if (contentViewEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logContentView");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) contentViewEvent);
            }
        }
    }

    public void logSearch(SearchEvent searchEvent) {
        if (searchEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSearch");
        } else {
            if (this.analyticsManager != null) {
                this.analyticsManager.m18054a((PredefinedEvent) searchEvent);
            }
        }
    }

    public void onException(C4303b c4303b) {
        if (this.analyticsManager != null) {
            this.analyticsManager.m18056a(c4303b.m13685a());
        }
    }

    public void onException(C4302a c4302a) {
        if (this.analyticsManager != null) {
            this.analyticsManager.m18057a(c4302a.m13685a(), c4302a.m13686b());
        }
    }

    @SuppressLint({"NewApi"})
    protected boolean onPreExecute() {
        try {
            long j;
            Context context = getContext();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (VERSION.SDK_INT >= 9) {
                j = packageInfo.firstInstallTime;
            } else {
                j = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.analyticsManager = C3559s.m18049a(this, context, getIdManager(), num, str, j);
            this.analyticsManager.m18050a();
            this.firebaseEnabled = new C2803m().m13695b(context);
            return true;
        } catch (Throwable e) {
            C2766c.m13524h().mo3562e(TAG, "Error retrieving app properties", e);
            return false;
        }
    }

    protected Boolean doInBackground() {
        try {
            C2853s b = C2851q.m13855a().m13858b();
            if (b == null) {
                C2766c.m13524h().mo3561e(TAG, "Failed to retrieve settings");
                return Boolean.valueOf(false);
            } else if (b.f12058d.f12030d) {
                C2766c.m13524h().mo3554a(TAG, "Analytics collection enabled");
                this.analyticsManager.m18055a(b.f12059e, getOverridenSpiEndpoint());
                return Boolean.valueOf(true);
            } else {
                C2766c.m13524h().mo3554a(TAG, "Analytics collection disabled");
                this.analyticsManager.m18058b();
                return Boolean.valueOf(false);
            }
        } catch (Throwable e) {
            C2766c.m13524h().mo3562e(TAG, "Error dealing with settings", e);
            return Boolean.valueOf(false);
        }
    }

    String getOverridenSpiEndpoint() {
        return CommonUtils.m13620b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }

    private void logFirebaseModeEnabledWarning(String str) {
        C2774k h = C2766c.m13524h();
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Method ");
        stringBuilder.append(str);
        stringBuilder.append(" is not supported when using Crashlytics through Firebase.");
        h.mo3559d(str2, stringBuilder.toString());
    }
}
