package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

final class se implements Callable<Boolean> {
    se() {
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
