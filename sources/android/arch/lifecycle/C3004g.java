package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.p001a.p003b.C2999a;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.g */
public class C3004g extends Lifecycle {
    /* renamed from: a */
    private C2999a<C0022e, C0025a> f12713a = new C2999a();
    /* renamed from: b */
    private State f12714b;
    /* renamed from: c */
    private final WeakReference<C0023f> f12715c;
    /* renamed from: d */
    private int f12716d = 0;
    /* renamed from: e */
    private boolean f12717e = false;
    /* renamed from: f */
    private boolean f12718f = false;
    /* renamed from: g */
    private ArrayList<State> f12719g = new ArrayList();

    /* renamed from: android.arch.lifecycle.g$a */
    static class C0025a {
        /* renamed from: a */
        State f51a;
        /* renamed from: b */
        GenericLifecycleObserver f52b;

        C0025a(C0022e c0022e, State state) {
            this.f52b = C0026i.m65a((Object) c0022e);
            this.f51a = state;
        }

        /* renamed from: a */
        void m64a(C0023f c0023f, Event event) {
            State b = C3004g.m14707b(event);
            this.f51a = C3004g.m14705a(this.f51a, b);
            this.f52b.mo3693a(c0023f, event);
            this.f51a = b;
        }
    }

    public C3004g(C0023f c0023f) {
        this.f12715c = new WeakReference(c0023f);
        this.f12714b = State.INITIALIZED;
    }

    /* renamed from: a */
    public void m14719a(State state) {
        m14708b(state);
    }

    /* renamed from: a */
    public void m14718a(Event event) {
        m14708b(C3004g.m14707b(event));
    }

    /* renamed from: b */
    private void m14708b(State state) {
        if (this.f12714b != state) {
            this.f12714b = state;
            if (this.f12717e == null) {
                if (this.f12716d == null) {
                    this.f12717e = true;
                    m14715d();
                    this.f12717e = null;
                    return;
                }
            }
            this.f12718f = true;
        }
    }

    /* renamed from: b */
    private boolean m14710b() {
        boolean z = true;
        if (this.f12713a.m13a() == 0) {
            return true;
        }
        State state = ((C0025a) this.f12713a.m20d().getValue()).f51a;
        State state2 = ((C0025a) this.f12713a.m21e().getValue()).f51a;
        if (state != state2 || this.f12714b != state2) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private State m14711c(C0022e c0022e) {
        c0022e = this.f12713a.m14689d(c0022e);
        State state = null;
        c0022e = c0022e != null ? ((C0025a) c0022e.getValue()).f51a : null;
        if (!this.f12719g.isEmpty()) {
            state = (State) this.f12719g.get(this.f12719g.size() - 1);
        }
        return C3004g.m14705a(C3004g.m14705a(this.f12714b, c0022e), state);
    }

    /* renamed from: a */
    public void mo16a(C0022e c0022e) {
        C0025a c0025a = new C0025a(c0022e, this.f12714b == State.DESTROYED ? State.DESTROYED : State.INITIALIZED);
        if (((C0025a) this.f12713a.mo5a(c0022e, c0025a)) == null) {
            C0023f c0023f = (C0023f) this.f12715c.get();
            if (c0023f != null) {
                Object obj;
                Enum c;
                if (this.f12716d == 0) {
                    if (!this.f12717e) {
                        obj = null;
                        c = m14711c(c0022e);
                        this.f12716d++;
                        while (c0025a.f51a.compareTo(c) < 0 && this.f12713a.m14688c(c0022e)) {
                            m14713c(c0025a.f51a);
                            c0025a.m64a(c0023f, C3004g.m14716e(c0025a.f51a));
                            m14712c();
                            c = m14711c(c0022e);
                        }
                        if (obj == null) {
                            m14715d();
                        }
                        this.f12716d -= 1;
                    }
                }
                obj = 1;
                c = m14711c(c0022e);
                this.f12716d++;
                while (c0025a.f51a.compareTo(c) < 0) {
                    m14713c(c0025a.f51a);
                    c0025a.m64a(c0023f, C3004g.m14716e(c0025a.f51a));
                    m14712c();
                    c = m14711c(c0022e);
                }
                if (obj == null) {
                    m14715d();
                }
                this.f12716d -= 1;
            }
        }
    }

    /* renamed from: c */
    private void m14712c() {
        this.f12719g.remove(this.f12719g.size() - 1);
    }

    /* renamed from: c */
    private void m14713c(State state) {
        this.f12719g.add(state);
    }

    /* renamed from: b */
    public void mo17b(C0022e c0022e) {
        this.f12713a.mo6b(c0022e);
    }

    /* renamed from: a */
    public State mo15a() {
        return this.f12714b;
    }

    /* renamed from: b */
    static State m14707b(Event event) {
        switch (event) {
            case ON_CREATE:
            case ON_STOP:
                return State.CREATED;
            case ON_START:
            case ON_PAUSE:
                return State.STARTED;
            case ON_RESUME:
                return State.RESUMED;
            case ON_DESTROY:
                return State.DESTROYED;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected event value ");
                stringBuilder.append(event);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    private static Event m14714d(State state) {
        switch (state) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return Event.ON_DESTROY;
            case STARTED:
                return Event.ON_STOP;
            case RESUMED:
                return Event.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(state);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: e */
    private static Event m14716e(State state) {
        switch (state) {
            case INITIALIZED:
            case DESTROYED:
                return Event.ON_CREATE;
            case CREATED:
                return Event.ON_START;
            case STARTED:
                return Event.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(state);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private void m14706a(C0023f c0023f) {
        Iterator c = this.f12713a.m19c();
        while (c.hasNext() && !this.f12718f) {
            Entry entry = (Entry) c.next();
            C0025a c0025a = (C0025a) entry.getValue();
            while (c0025a.f51a.compareTo(this.f12714b) < 0 && !this.f12718f && this.f12713a.m14688c(entry.getKey())) {
                m14713c(c0025a.f51a);
                c0025a.m64a(c0023f, C3004g.m14716e(c0025a.f51a));
                m14712c();
            }
        }
    }

    /* renamed from: b */
    private void m14709b(C0023f c0023f) {
        Iterator b = this.f12713a.m18b();
        while (b.hasNext() && !this.f12718f) {
            Entry entry = (Entry) b.next();
            C0025a c0025a = (C0025a) entry.getValue();
            while (c0025a.f51a.compareTo(this.f12714b) > 0 && !this.f12718f && this.f12713a.m14688c(entry.getKey())) {
                Event d = C3004g.m14714d(c0025a.f51a);
                m14713c(C3004g.m14707b(d));
                c0025a.m64a(c0023f, d);
                m14712c();
            }
        }
    }

    /* renamed from: d */
    private void m14715d() {
        C0023f c0023f = (C0023f) this.f12715c.get();
        if (c0023f == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m14710b()) {
            this.f12718f = false;
            if (this.f12714b.compareTo(((C0025a) this.f12713a.m20d().getValue()).f51a) < 0) {
                m14709b(c0023f);
            }
            Entry e = this.f12713a.m21e();
            if (!(this.f12718f || e == null || this.f12714b.compareTo(((C0025a) e.getValue()).f51a) <= 0)) {
                m14706a(c0023f);
            }
        }
        this.f12718f = false;
    }

    /* renamed from: a */
    static State m14705a(State state, State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }
}
