package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class fd implements Executor {
    fd() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
