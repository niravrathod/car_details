package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.p017f.C0429j;
import android.util.Log;
import androidx.navigation.C0904k.C0903a;
import androidx.navigation.C0909m.C0906a;
import androidx.navigation.C0909m.C0908c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.navigation.d */
public class C0894d {
    /* renamed from: a */
    final Context f3036a;
    /* renamed from: b */
    final Deque<C0900g> f3037b = new ArrayDeque();
    /* renamed from: c */
    final C0908c f3038c = new C32762(this);
    /* renamed from: d */
    private Activity f3039d;
    /* renamed from: e */
    private C0902j f3040e;
    /* renamed from: f */
    private C3281h f3041f;
    /* renamed from: g */
    private int f3042g;
    /* renamed from: h */
    private Bundle f3043h;
    /* renamed from: i */
    private int[] f3044i;
    /* renamed from: j */
    private final C3283p f3045j = new C44731(this);
    /* renamed from: k */
    private final CopyOnWriteArrayList<C0893a> f3046k = new CopyOnWriteArrayList();

    /* renamed from: androidx.navigation.d$a */
    public interface C0893a {
        /* renamed from: a */
        void mo1231a(C0894d c0894d, C0900g c0900g);
    }

    /* renamed from: androidx.navigation.d$2 */
    class C32762 implements C0908c {
        /* renamed from: a */
        final /* synthetic */ C0894d f13992a;

        C32762(C0894d c0894d) {
            this.f13992a = c0894d;
        }

        /* renamed from: a */
        public void mo856a(C0909m c0909m, int i, int i2) {
            switch (i2) {
                case 1:
                    C0900g b = this.f13992a.m3897b(i);
                    if (b != 0) {
                        this.f13992a.f3037b.add(b);
                        this.f13992a.m3893a(b);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Navigator ");
                    stringBuilder.append(c0909m);
                    stringBuilder.append(" reported navigation to unknown destination id ");
                    stringBuilder.append(C0900g.m3912a(this.f13992a.f3036a, i));
                    throw new IllegalArgumentException(stringBuilder.toString());
                case 2:
                    i = 0;
                    i2 = this.f13992a.f3037b.descendingIterator();
                    while (i2.hasNext()) {
                        C0900g c0900g = (C0900g) i2.next();
                        if (c0900g.m3925f() == c0909m) {
                            i = c0900g;
                            if (i == 0) {
                                this.f13992a.m3895a(i.m3923d(), (boolean) 0);
                                if (this.f13992a.f3037b.isEmpty() == null) {
                                    this.f13992a.f3037b.removeLast();
                                }
                                while (this.f13992a.f3037b.isEmpty() == null && (this.f13992a.f3037b.peekLast() instanceof C3281h) != null) {
                                    this.f13992a.m3899c();
                                }
                                if (this.f13992a.f3037b.isEmpty() == null) {
                                    this.f13992a.m3893a((C0900g) this.f13992a.f3037b.peekLast());
                                    return;
                                }
                                return;
                            }
                            i2 = new StringBuilder();
                            i2.append("Navigator ");
                            i2.append(c0909m);
                            i2.append(" reported pop but did not have any destinations");
                            i2.append(" on the NavController back stack");
                            throw new IllegalArgumentException(i2.toString());
                        }
                    }
                    if (i == 0) {
                        i2 = new StringBuilder();
                        i2.append("Navigator ");
                        i2.append(c0909m);
                        i2.append(" reported pop but did not have any destinations");
                        i2.append(" on the NavController back stack");
                        throw new IllegalArgumentException(i2.toString());
                    }
                    this.f13992a.m3895a(i.m3923d(), (boolean) 0);
                    if (this.f13992a.f3037b.isEmpty() == null) {
                        this.f13992a.f3037b.removeLast();
                    }
                    while (this.f13992a.f3037b.isEmpty() == null) {
                        this.f13992a.m3899c();
                        break;
                    }
                    if (this.f13992a.f3037b.isEmpty() == null) {
                        this.f13992a.m3893a((C0900g) this.f13992a.f3037b.peekLast());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: androidx.navigation.d$1 */
    class C44731 extends C3283p {
        /* renamed from: a */
        final /* synthetic */ C0894d f18663a;

        C44731(C0894d c0894d) {
            this.f18663a = c0894d;
        }

        /* renamed from: a */
        public C0909m<? extends C0900g> mo3876a(String str, C0909m<? extends C0900g> c0909m) {
            C0909m<? extends C0900g> a = super.mo3876a(str, c0909m);
            if (a != c0909m) {
                if (a != null) {
                    a.m3967b(this.f18663a.f3038c);
                }
                c0909m.m3966a(this.f18663a.f3038c);
            }
            return a;
        }
    }

    public C0894d(Context context) {
        this.f3036a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f3039d = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        this.f3045j.mo863a(new C3282i(this.f3036a));
        this.f3045j.mo863a(new C3275b(this.f3036a));
    }

    /* renamed from: a */
    Context m3886a() {
        return this.f3036a;
    }

    /* renamed from: b */
    public C0910n m3898b() {
        return this.f3045j;
    }

    /* renamed from: a */
    public void m3892a(C0893a c0893a) {
        if (!this.f3037b.isEmpty()) {
            c0893a.mo1231a(this, (C0900g) this.f3037b.peekLast());
        }
        this.f3046k.add(c0893a);
    }

    /* renamed from: c */
    public boolean m3899c() {
        if (this.f3037b.isEmpty()) {
            return false;
        }
        return m3895a(m3904h().m3923d(), true);
    }

    /* renamed from: a */
    public boolean m3895a(int i, boolean z) {
        if (this.f3037b.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator descendingIterator = this.f3037b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0900g c0900g = (C0900g) descendingIterator.next();
            if (z || c0900g.m3923d() != i) {
                arrayList.add(c0900g);
            }
            if (c0900g.m3923d() == i) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            i = arrayList.iterator();
            while (true) {
                z = false;
                while (i.hasNext()) {
                    C0900g c0900g2 = (C0900g) i.next();
                    while (!this.f3037b.isEmpty() && ((C0900g) this.f3037b.peekLast()).m3923d() != r0.m3923d()) {
                        if (!i.hasNext()) {
                            c0900g2 = null;
                            break;
                        }
                        c0900g2 = (C0900g) i.next();
                    }
                    if (c0900g2 != null) {
                        if (c0900g2.m3925f().mo854b() || z) {
                            z = true;
                        }
                    }
                }
                return z;
            }
        }
        i = C0900g.m3912a(this.f3036a, i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring popBackStack to destination ");
        stringBuilder.append(i);
        stringBuilder.append(" as it was not found on the current back stack");
        Log.i("NavController", stringBuilder.toString());
        return false;
    }

    /* renamed from: d */
    public boolean m3900d() {
        if (this.f3037b.size() != 1) {
            return m3899c();
        }
        C0900g h = m3904h();
        int d = h.m3923d();
        for (C3281h c = h.m3921c(); c != null; c = c.m3921c()) {
            if (c.m16918a() != d) {
                new C0896f(this).m3909a(c.m3923d()).m3908a().m1164b();
                if (this.f3039d != null) {
                    this.f3039d.finish();
                }
                return true;
            }
            d = c.m3923d();
        }
        return false;
    }

    /* renamed from: a */
    void m3893a(C0900g c0900g) {
        Iterator it = this.f3046k.iterator();
        while (it.hasNext()) {
            ((C0893a) it.next()).mo1231a(this, c0900g);
        }
    }

    /* renamed from: e */
    public void m3901e() {
        C3281h a = m3902f().m3934a();
        if (a != null) {
            m3894a(a);
        }
    }

    /* renamed from: f */
    public C0902j m3902f() {
        if (this.f3040e == null) {
            this.f3040e = new C0902j(this.f3036a, this.f3045j);
        }
        return this.f3040e;
    }

    /* renamed from: a */
    public void m3887a(int i) {
        this.f3041f = m3902f().m3935a(i);
        this.f3042g = i;
        m3885j();
    }

    /* renamed from: a */
    public void m3894a(C3281h c3281h) {
        this.f3041f = c3281h;
        this.f3042g = null;
        m3885j();
    }

    /* renamed from: j */
    private void m3885j() {
        if (this.f3043h != null) {
            ArrayList stringArrayList = this.f3043h.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if (stringArrayList != null) {
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C0909m a = this.f3045j.mo864a(str);
                    Bundle bundle = this.f3043h.getBundle(str);
                    if (bundle != null) {
                        a.mo858a(bundle);
                    }
                }
            }
        }
        Object obj = null;
        if (this.f3044i != null) {
            int[] iArr = this.f3044i;
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                C0900g b = m3897b(i2);
                if (b != null) {
                    this.f3037b.add(b);
                    i++;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unknown destination during restore: ");
                    stringBuilder.append(this.f3036a.getResources().getResourceName(i2));
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            this.f3044i = null;
        }
        if (this.f3041f != null && this.f3037b.isEmpty()) {
            if (this.f3039d != null && m3896a(this.f3039d.getIntent())) {
                obj = 1;
            }
            if (obj == null) {
                this.f3041f.m3916a(null, null, null);
            }
        }
    }

    /* renamed from: a */
    public boolean m3896a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        extras = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (extras != null) {
            bundle.putAll(extras);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null) {
            C0429j b = this.f3041f.mo862b(intent.getData());
            if (b != null) {
                intArray = ((C0900g) b.f1442a).m3927h();
                bundle.putAll((Bundle) b.f1443b);
            }
        }
        if (intArray != null) {
            if (intArray.length != 0) {
                bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                int flags = intent.getFlags();
                int i = 268435456 & flags;
                if (i != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    ad.m1156a(this.f3036a).m1163b(intent).m1164b();
                    if (this.f3039d != null) {
                        this.f3039d.finish();
                    }
                    return true;
                } else if (i != 0) {
                    if (this.f3037b.isEmpty() == null) {
                        m3889a(this.f3041f.m16918a(), bundle, new C0903a().m3937a(this.f3041f.m3923d(), true).m3936a(0).m3940b(0).m3939a());
                    }
                    intent = null;
                    while (intent < intArray.length) {
                        flags = intent + 1;
                        int i2 = intArray[intent];
                        C0900g b2 = m3897b(i2);
                        if (b2 != null) {
                            b2.m3916a(bundle, new C0903a().m3936a(0).m3940b(0).m3939a(), null);
                            intent = flags;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("unknown destination during deep link: ");
                            stringBuilder.append(C0900g.m3912a(this.f3036a, i2));
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                    return true;
                } else {
                    C3281h c3281h = this.f3041f;
                    intent = null;
                    while (intent < intArray.length) {
                        i = intArray[intent];
                        C0900g c = intent == null ? this.f3041f : c3281h.m16923c(i);
                        if (c != null) {
                            if (intent != intArray.length - 1) {
                                c3281h = (C3281h) c;
                            } else {
                                c.m3916a(bundle, new C0903a().m3937a(this.f3041f.m3923d(), true).m3936a(0).m3940b(0).m3939a(), null);
                            }
                            intent++;
                        } else {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("unknown destination during deep link: ");
                            stringBuilder2.append(C0900g.m3912a(this.f3036a, i));
                            throw new IllegalStateException(stringBuilder2.toString());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public C3281h m3903g() {
        if (this.f3041f != null) {
            return this.f3041f;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    /* renamed from: h */
    public C0900g m3904h() {
        return (C0900g) this.f3037b.peekLast();
    }

    /* renamed from: b */
    C0900g m3897b(int i) {
        if (this.f3041f == null) {
            return 0;
        }
        if (this.f3041f.m3923d() == i) {
            return this.f3041f;
        }
        C3281h c3281h;
        C0900g c0900g = this.f3037b.isEmpty() ? this.f3041f : (C0900g) this.f3037b.peekLast();
        if (c0900g instanceof C3281h) {
            c3281h = (C3281h) c0900g;
        } else {
            c3281h = c0900g.m3921c();
        }
        return c3281h.m16923c(i);
    }

    /* renamed from: a */
    public final void m3888a(int i, Bundle bundle) {
        m3889a(i, bundle, null);
    }

    /* renamed from: a */
    public void m3889a(int i, Bundle bundle, C0904k c0904k) {
        m3890a(i, bundle, c0904k, null);
    }

    /* renamed from: a */
    public void m3890a(int i, Bundle bundle, C0904k c0904k, C0906a c0906a) {
        C0900g c0900g = this.f3037b.isEmpty() ? this.f3041f : (C0900g) this.f3037b.peekLast();
        if (c0900g != null) {
            int a;
            C0892c b = c0900g.m3920b(i);
            if (b != null) {
                if (c0904k == null) {
                    c0904k = b.m3883b();
                }
                a = b.m3881a();
            } else {
                a = i;
            }
            if (a == 0 && c0904k != null && c0904k.m3950d() != 0) {
                m3895a(c0904k.m3950d(), c0904k.m3951e());
                return;
            } else if (a != 0) {
                C0900g b2 = m3897b(a);
                if (b2 == null) {
                    bundle = C0900g.m3912a(this.f3036a, a);
                    c0906a = new StringBuilder();
                    c0906a.append("navigation destination ");
                    c0906a.append(bundle);
                    if (b != null) {
                        bundle = new StringBuilder();
                        bundle.append(" referenced from action ");
                        bundle.append(C0900g.m3912a(this.f3036a, i));
                        i = bundle.toString();
                    } else {
                        i = "";
                    }
                    c0906a.append(i);
                    c0906a.append(" is unknown to this NavController");
                    throw new IllegalArgumentException(c0906a.toString());
                }
                if (c0904k != null) {
                    if (c0904k.m3949c() != 0) {
                        m3895a(this.f3041f.m3923d(), true);
                    } else if (c0904k.m3950d() != 0) {
                        m3895a(c0904k.m3950d(), c0904k.m3951e());
                    }
                }
                b2.m3916a(bundle, c0904k, c0906a);
                return;
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with navOptions.popUpTo != 0");
            }
        }
        throw new IllegalStateException("no current navigation node");
    }

    /* renamed from: i */
    public Bundle m3905i() {
        Bundle bundle;
        if (this.f3042g != 0) {
            bundle = new Bundle();
            bundle.putInt("android-support-nav:controller:graphId", this.f3042g);
        } else {
            bundle = null;
        }
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Entry entry : this.f3045j.m16938a().entrySet()) {
            String str = (String) entry.getKey();
            Bundle d = ((C0909m) entry.getValue()).mo859d();
            if (d != null) {
                arrayList.add(str);
                bundle2.putBundle(str, d);
            }
        }
        if (!arrayList.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.f3037b.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f3037b.size()];
            int i = 0;
            for (C0900g d2 : this.f3037b) {
                int i2 = i + 1;
                iArr[i] = d2.m3923d();
                i = i2;
            }
            bundle.putIntArray("android-support-nav:controller:backStackIds", iArr);
        }
        return bundle;
    }

    /* renamed from: a */
    public void m3891a(Bundle bundle) {
        if (bundle != null) {
            this.f3042g = bundle.getInt("android-support-nav:controller:graphId");
            this.f3043h = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f3044i = bundle.getIntArray("android-support-nav:controller:backStackIds");
            if (this.f3042g != null) {
                m3887a(this.f3042g);
            }
        }
    }
}
