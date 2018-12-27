package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.C0129i.C3034a;

public class PostMessageService extends Service {
    /* renamed from: a */
    private C3034a f503a = new C44051(this);

    /* renamed from: android.support.customtabs.PostMessageService$1 */
    class C44051 extends C3034a {
        /* renamed from: a */
        final /* synthetic */ PostMessageService f18320a;

        C44051(PostMessageService postMessageService) {
            this.f18320a = postMessageService;
        }

        /* renamed from: a */
        public void mo3721a(C0127g c0127g, Bundle bundle) {
            c0127g.mo60a(bundle);
        }

        /* renamed from: a */
        public void mo3722a(C0127g c0127g, String str, Bundle bundle) {
            c0127g.mo62b(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f503a;
    }
}
