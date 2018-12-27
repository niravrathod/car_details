package android.arch.lifecycle;

public abstract class Lifecycle {

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m22a(State state) {
            return compareTo(state) >= null ? true : null;
        }
    }

    /* renamed from: a */
    public abstract State mo15a();

    /* renamed from: a */
    public abstract void mo16a(C0022e c0022e);

    /* renamed from: b */
    public abstract void mo17b(C0022e c0022e);
}
