package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.C2590d;
import com.google.firebase.iid.C2603w;
import com.google.firebase.iid.zzb;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class FirebaseMessagingService extends zzb {
    /* renamed from: b */
    private static final Queue<String> f17748b = new ArrayDeque(10);

    /* renamed from: a */
    public void m23075a() {
    }

    /* renamed from: a */
    public void m23076a(RemoteMessage remoteMessage) {
    }

    /* renamed from: a */
    public void m23077a(String str) {
    }

    /* renamed from: a */
    public void m23078a(String str, Exception exception) {
    }

    /* renamed from: b */
    public void m23080b(String str) {
    }

    /* renamed from: a */
    protected final Intent mo3317a(Intent intent) {
        return C2603w.m12774a().m12780b();
    }

    /* renamed from: c */
    public final boolean mo3330c(android.content.Intent r3) {
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
        r0 = "com.google.firebase.messaging.NOTIFICATION_OPEN";
        r1 = r3.getAction();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x002c;
    L_0x000c:
        r0 = "pending_intent";
        r0 = r3.getParcelableExtra(r0);
        r0 = (android.app.PendingIntent) r0;
        if (r0 == 0) goto L_0x0021;
    L_0x0016:
        r0.send();	 Catch:{ CanceledException -> 0x001a }
        goto L_0x0021;
    L_0x001a:
        r0 = "FirebaseMessaging";
        r1 = "Notification pending intent canceled";
        android.util.Log.e(r0, r1);
    L_0x0021:
        r0 = com.google.firebase.messaging.C2609b.m12812e(r3);
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        com.google.firebase.messaging.C2609b.m12809b(r3);
    L_0x002a:
        r3 = 1;
        return r3;
    L_0x002c:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):boolean");
    }

    /* renamed from: b */
    public final void mo3318b(Intent intent) {
        Task a;
        Object obj;
        int hashCode;
        Bundle extras;
        String str;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action)) {
            if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
                if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
                    if (C2609b.m12812e(intent)) {
                        C2609b.m12810c(intent);
                        return;
                    }
                } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                    m23080b(intent.getStringExtra("token"));
                    return;
                } else {
                    action = "FirebaseMessaging";
                    String str2 = "Unknown intent action: ";
                    intent = String.valueOf(intent.getAction());
                    Log.d(action, intent.length() != 0 ? str2.concat(intent) : new String(str2));
                }
                return;
            }
        }
        CharSequence stringExtra = intent.getStringExtra("google.message_id");
        int i = 2;
        if (TextUtils.isEmpty(stringExtra)) {
            a = Tasks.m12422a(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            a = C2590d.m12738a((Context) this).m12740a(2, bundle);
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            if (f17748b.contains(stringExtra)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String str3 = "FirebaseMessaging";
                    String str4 = "Received duplicate message: ";
                    action = String.valueOf(stringExtra);
                    Log.d(str3, action.length() != 0 ? str4.concat(action) : new String(str4));
                }
                obj = 1;
                if (obj == null) {
                    action = intent.getStringExtra("message_type");
                    if (action == null) {
                        action = "gcm";
                    }
                    hashCode = action.hashCode();
                    if (hashCode != -2062414158) {
                        if (action.equals("deleted_messages")) {
                            i = 1;
                            switch (i) {
                                case 0:
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12807a(intent);
                                    }
                                    extras = intent.getExtras();
                                    if (extras == null) {
                                        extras = new Bundle();
                                    }
                                    extras.remove("android.support.content.wakelockid");
                                    if (C2612d.m12818a(extras)) {
                                        if (!new C2612d(this).m12824c(extras)) {
                                            if (C2609b.m12812e(intent)) {
                                                C2609b.m12811d(intent);
                                            }
                                        }
                                    }
                                    m23076a(new RemoteMessage(extras));
                                    break;
                                case 1:
                                    m23075a();
                                    break;
                                case 2:
                                    m23077a(intent.getStringExtra("google.message_id"));
                                    break;
                                case 3:
                                    action = intent.getStringExtra("google.message_id");
                                    if (action == null) {
                                        action = intent.getStringExtra("message_id");
                                    }
                                    m23078a(action, new SendException(intent.getStringExtra("error")));
                                    break;
                                default:
                                    intent = "FirebaseMessaging";
                                    str = "Received message with unknown type: ";
                                    action = String.valueOf(action);
                                    if (action.length() == 0) {
                                        action = new String(str);
                                    } else {
                                        action = str.concat(action);
                                    }
                                    Log.w(intent, action);
                                    break;
                            }
                        }
                    } else if (hashCode != 102161) {
                        if (action.equals("gcm")) {
                            i = 0;
                            switch (i) {
                                case 0:
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12807a(intent);
                                    }
                                    extras = intent.getExtras();
                                    if (extras == null) {
                                        extras = new Bundle();
                                    }
                                    extras.remove("android.support.content.wakelockid");
                                    if (C2612d.m12818a(extras)) {
                                        if (new C2612d(this).m12824c(extras)) {
                                            if (C2609b.m12812e(intent)) {
                                                C2609b.m12811d(intent);
                                            }
                                        }
                                    }
                                    m23076a(new RemoteMessage(extras));
                                    break;
                                case 1:
                                    m23075a();
                                    break;
                                case 2:
                                    m23077a(intent.getStringExtra("google.message_id"));
                                    break;
                                case 3:
                                    action = intent.getStringExtra("google.message_id");
                                    if (action == null) {
                                        action = intent.getStringExtra("message_id");
                                    }
                                    m23078a(action, new SendException(intent.getStringExtra("error")));
                                    break;
                                default:
                                    intent = "FirebaseMessaging";
                                    str = "Received message with unknown type: ";
                                    action = String.valueOf(action);
                                    if (action.length() == 0) {
                                        action = str.concat(action);
                                    } else {
                                        action = new String(str);
                                    }
                                    Log.w(intent, action);
                                    break;
                            }
                        }
                    } else if (hashCode != 814694033) {
                        if (action.equals("send_error")) {
                            i = 3;
                            switch (i) {
                                case 0:
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12807a(intent);
                                    }
                                    extras = intent.getExtras();
                                    if (extras == null) {
                                        extras = new Bundle();
                                    }
                                    extras.remove("android.support.content.wakelockid");
                                    if (C2612d.m12818a(extras)) {
                                        if (new C2612d(this).m12824c(extras)) {
                                            if (C2609b.m12812e(intent)) {
                                                C2609b.m12811d(intent);
                                            }
                                        }
                                    }
                                    m23076a(new RemoteMessage(extras));
                                    break;
                                case 1:
                                    m23075a();
                                    break;
                                case 2:
                                    m23077a(intent.getStringExtra("google.message_id"));
                                    break;
                                case 3:
                                    action = intent.getStringExtra("google.message_id");
                                    if (action == null) {
                                        action = intent.getStringExtra("message_id");
                                    }
                                    m23078a(action, new SendException(intent.getStringExtra("error")));
                                    break;
                                default:
                                    intent = "FirebaseMessaging";
                                    str = "Received message with unknown type: ";
                                    action = String.valueOf(action);
                                    if (action.length() == 0) {
                                        action = new String(str);
                                    } else {
                                        action = str.concat(action);
                                    }
                                    Log.w(intent, action);
                                    break;
                            }
                        }
                    } else if (hashCode != 814800675) {
                        if (action.equals("send_event")) {
                            switch (i) {
                                case 0:
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12807a(intent);
                                    }
                                    extras = intent.getExtras();
                                    if (extras == null) {
                                        extras = new Bundle();
                                    }
                                    extras.remove("android.support.content.wakelockid");
                                    if (C2612d.m12818a(extras)) {
                                        if (new C2612d(this).m12824c(extras)) {
                                            if (C2609b.m12812e(intent)) {
                                                C2609b.m12811d(intent);
                                            }
                                        }
                                    }
                                    m23076a(new RemoteMessage(extras));
                                    break;
                                case 1:
                                    m23075a();
                                    break;
                                case 2:
                                    m23077a(intent.getStringExtra("google.message_id"));
                                    break;
                                case 3:
                                    action = intent.getStringExtra("google.message_id");
                                    if (action == null) {
                                        action = intent.getStringExtra("message_id");
                                    }
                                    m23078a(action, new SendException(intent.getStringExtra("error")));
                                    break;
                                default:
                                    intent = "FirebaseMessaging";
                                    str = "Received message with unknown type: ";
                                    action = String.valueOf(action);
                                    if (action.length() == 0) {
                                        action = str.concat(action);
                                    } else {
                                        action = new String(str);
                                    }
                                    Log.w(intent, action);
                                    break;
                            }
                        }
                    }
                    i = -1;
                    switch (i) {
                        case 0:
                            if (C2609b.m12812e(intent)) {
                                C2609b.m12807a(intent);
                            }
                            extras = intent.getExtras();
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            extras.remove("android.support.content.wakelockid");
                            if (C2612d.m12818a(extras)) {
                                if (new C2612d(this).m12824c(extras)) {
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12811d(intent);
                                    }
                                }
                            }
                            m23076a(new RemoteMessage(extras));
                            break;
                        case 1:
                            m23075a();
                            break;
                        case 2:
                            m23077a(intent.getStringExtra("google.message_id"));
                            break;
                        case 3:
                            action = intent.getStringExtra("google.message_id");
                            if (action == null) {
                                action = intent.getStringExtra("message_id");
                            }
                            m23078a(action, new SendException(intent.getStringExtra("error")));
                            break;
                        default:
                            intent = "FirebaseMessaging";
                            str = "Received message with unknown type: ";
                            action = String.valueOf(action);
                            if (action.length() == 0) {
                                action = str.concat(action);
                            } else {
                                action = new String(str);
                            }
                            Log.w(intent, action);
                            break;
                    }
                }
                Tasks.m12424a(a, 1, TimeUnit.SECONDS);
            }
            if (f17748b.size() >= 10) {
                f17748b.remove();
            }
            f17748b.add(stringExtra);
        }
        obj = null;
        if (obj == null) {
            action = intent.getStringExtra("message_type");
            if (action == null) {
                action = "gcm";
            }
            hashCode = action.hashCode();
            if (hashCode != -2062414158) {
                if (action.equals("deleted_messages")) {
                    i = 1;
                    switch (i) {
                        case 0:
                            if (C2609b.m12812e(intent)) {
                                C2609b.m12807a(intent);
                            }
                            extras = intent.getExtras();
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            extras.remove("android.support.content.wakelockid");
                            if (C2612d.m12818a(extras)) {
                                if (new C2612d(this).m12824c(extras)) {
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12811d(intent);
                                    }
                                }
                            }
                            m23076a(new RemoteMessage(extras));
                            break;
                        case 1:
                            m23075a();
                            break;
                        case 2:
                            m23077a(intent.getStringExtra("google.message_id"));
                            break;
                        case 3:
                            action = intent.getStringExtra("google.message_id");
                            if (action == null) {
                                action = intent.getStringExtra("message_id");
                            }
                            m23078a(action, new SendException(intent.getStringExtra("error")));
                            break;
                        default:
                            intent = "FirebaseMessaging";
                            str = "Received message with unknown type: ";
                            action = String.valueOf(action);
                            if (action.length() == 0) {
                                action = new String(str);
                            } else {
                                action = str.concat(action);
                            }
                            Log.w(intent, action);
                            break;
                    }
                }
            } else if (hashCode != 102161) {
                if (action.equals("gcm")) {
                    i = 0;
                    switch (i) {
                        case 0:
                            if (C2609b.m12812e(intent)) {
                                C2609b.m12807a(intent);
                            }
                            extras = intent.getExtras();
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            extras.remove("android.support.content.wakelockid");
                            if (C2612d.m12818a(extras)) {
                                if (new C2612d(this).m12824c(extras)) {
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12811d(intent);
                                    }
                                }
                            }
                            m23076a(new RemoteMessage(extras));
                            break;
                        case 1:
                            m23075a();
                            break;
                        case 2:
                            m23077a(intent.getStringExtra("google.message_id"));
                            break;
                        case 3:
                            action = intent.getStringExtra("google.message_id");
                            if (action == null) {
                                action = intent.getStringExtra("message_id");
                            }
                            m23078a(action, new SendException(intent.getStringExtra("error")));
                            break;
                        default:
                            intent = "FirebaseMessaging";
                            str = "Received message with unknown type: ";
                            action = String.valueOf(action);
                            if (action.length() == 0) {
                                action = str.concat(action);
                            } else {
                                action = new String(str);
                            }
                            Log.w(intent, action);
                            break;
                    }
                }
            } else if (hashCode != 814694033) {
                if (action.equals("send_error")) {
                    i = 3;
                    switch (i) {
                        case 0:
                            if (C2609b.m12812e(intent)) {
                                C2609b.m12807a(intent);
                            }
                            extras = intent.getExtras();
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            extras.remove("android.support.content.wakelockid");
                            if (C2612d.m12818a(extras)) {
                                if (new C2612d(this).m12824c(extras)) {
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12811d(intent);
                                    }
                                }
                            }
                            m23076a(new RemoteMessage(extras));
                            break;
                        case 1:
                            m23075a();
                            break;
                        case 2:
                            m23077a(intent.getStringExtra("google.message_id"));
                            break;
                        case 3:
                            action = intent.getStringExtra("google.message_id");
                            if (action == null) {
                                action = intent.getStringExtra("message_id");
                            }
                            m23078a(action, new SendException(intent.getStringExtra("error")));
                            break;
                        default:
                            intent = "FirebaseMessaging";
                            str = "Received message with unknown type: ";
                            action = String.valueOf(action);
                            if (action.length() == 0) {
                                action = new String(str);
                            } else {
                                action = str.concat(action);
                            }
                            Log.w(intent, action);
                            break;
                    }
                }
            } else if (hashCode != 814800675) {
                if (action.equals("send_event")) {
                    switch (i) {
                        case 0:
                            if (C2609b.m12812e(intent)) {
                                C2609b.m12807a(intent);
                            }
                            extras = intent.getExtras();
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            extras.remove("android.support.content.wakelockid");
                            if (C2612d.m12818a(extras)) {
                                if (new C2612d(this).m12824c(extras)) {
                                    if (C2609b.m12812e(intent)) {
                                        C2609b.m12811d(intent);
                                    }
                                }
                            }
                            m23076a(new RemoteMessage(extras));
                            break;
                        case 1:
                            m23075a();
                            break;
                        case 2:
                            m23077a(intent.getStringExtra("google.message_id"));
                            break;
                        case 3:
                            action = intent.getStringExtra("google.message_id");
                            if (action == null) {
                                action = intent.getStringExtra("message_id");
                            }
                            m23078a(action, new SendException(intent.getStringExtra("error")));
                            break;
                        default:
                            intent = "FirebaseMessaging";
                            str = "Received message with unknown type: ";
                            action = String.valueOf(action);
                            if (action.length() == 0) {
                                action = str.concat(action);
                            } else {
                                action = new String(str);
                            }
                            Log.w(intent, action);
                            break;
                    }
                }
            }
            i = -1;
            switch (i) {
                case 0:
                    if (C2609b.m12812e(intent)) {
                        C2609b.m12807a(intent);
                    }
                    extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    extras.remove("android.support.content.wakelockid");
                    if (C2612d.m12818a(extras)) {
                        if (new C2612d(this).m12824c(extras)) {
                            if (C2609b.m12812e(intent)) {
                                C2609b.m12811d(intent);
                            }
                        }
                    }
                    m23076a(new RemoteMessage(extras));
                    break;
                case 1:
                    m23075a();
                    break;
                case 2:
                    m23077a(intent.getStringExtra("google.message_id"));
                    break;
                case 3:
                    action = intent.getStringExtra("google.message_id");
                    if (action == null) {
                        action = intent.getStringExtra("message_id");
                    }
                    m23078a(action, new SendException(intent.getStringExtra("error")));
                    break;
                default:
                    intent = "FirebaseMessaging";
                    str = "Received message with unknown type: ";
                    action = String.valueOf(action);
                    if (action.length() == 0) {
                        action = new String(str);
                    } else {
                        action = str.concat(action);
                    }
                    Log.w(intent, action);
                    break;
            }
        }
        try {
            Tasks.m12424a(a, 1, TimeUnit.SECONDS);
        } catch (Intent intent2) {
            intent2 = String.valueOf(intent2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(intent2).length() + 20);
            stringBuilder.append("Message ack failed: ");
            stringBuilder.append(intent2);
            Log.w("FirebaseMessaging", stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static void m23073a(Bundle bundle) {
        bundle = bundle.keySet().iterator();
        while (bundle.hasNext()) {
            String str = (String) bundle.next();
            if (str != null && str.startsWith("google.c.")) {
                bundle.remove();
            }
        }
    }
}
