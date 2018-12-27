package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
public class DependencyCycleException extends DependencyException {
    private final List<C2577a<?>> zza;

    @KeepForSdk
    public DependencyCycleException(List<C2577a<?>> list) {
        StringBuilder stringBuilder = new StringBuilder("Dependency cycle detected: ");
        stringBuilder.append(Arrays.toString(list.toArray()));
        super(stringBuilder.toString());
        this.zza = list;
    }
}
