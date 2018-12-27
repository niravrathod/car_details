package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.C0439b;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: android.support.v4.media.session.MediaButtonReceiver$a */
    private static class C3147a extends C0439b {
        /* renamed from: c */
        private final Context f13280c;
        /* renamed from: d */
        private final Intent f13281d;
        /* renamed from: e */
        private final PendingResult f13282e;
        /* renamed from: f */
        private MediaBrowserCompat f13283f;

        C3147a(Context context, Intent intent, PendingResult pendingResult) {
            this.f13280c = context;
            this.f13281d = intent;
            this.f13282e = pendingResult;
        }

        /* renamed from: a */
        void m15671a(MediaBrowserCompat mediaBrowserCompat) {
            this.f13283f = mediaBrowserCompat;
        }

        /* renamed from: a */
        public void mo361a() {
            try {
                new MediaControllerCompat(this.f13280c, this.f13283f.m1651c()).m1759a((KeyEvent) this.f13281d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (Throwable e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            m15669d();
        }

        /* renamed from: b */
        public void mo362b() {
            m15669d();
        }

        /* renamed from: c */
        public void mo363c() {
            m15669d();
        }

        /* renamed from: d */
        private void m15669d() {
            this.f13283f.m1650b();
            this.f13282e.finish();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            if (intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                ComponentName a = m1743a(context, "android.intent.action.MEDIA_BUTTON");
                if (a != null) {
                    intent.setComponent(a);
                    m1744a(context, intent);
                    return;
                }
                a = m1743a(context, "android.media.browse.MediaBrowserService");
                if (a != null) {
                    PendingResult goAsync = goAsync();
                    context = context.getApplicationContext();
                    C0439b c3147a = new C3147a(context, intent, goAsync);
                    intent = new MediaBrowserCompat(context, a, c3147a, null);
                    c3147a.m15671a(intent);
                    intent.m1649a();
                    return;
                }
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignore unsupported intent: ");
        stringBuilder.append(intent);
        Log.d("MediaButtonReceiver", stringBuilder.toString());
    }

    /* renamed from: a */
    private static void m1744a(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: a */
    private static ComponentName m1743a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty() != null) {
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected 1 service that handles ");
            stringBuilder.append(str);
            stringBuilder.append(", found ");
            stringBuilder.append(queryIntentServices.size());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
