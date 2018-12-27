package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.C2823b;
import io.fabric.sdk.android.services.concurrency.C2828i;
import java.io.File;
import java.util.Collection;

/* renamed from: io.fabric.sdk.android.h */
public abstract class C2771h<Result> implements Comparable<C2771h> {
    Context context;
    final C2823b dependsOnAnnotation = ((C2823b) getClass().getAnnotation(C2823b.class));
    C2766c fabric;
    IdManager idManager;
    C2770f<Result> initializationCallback;
    C4731g<Result> initializationTask = new C4731g(this);

    protected abstract Result doInBackground();

    public abstract String getIdentifier();

    public abstract String getVersion();

    protected void onCancelled(Result result) {
    }

    protected void onPostExecute(Result result) {
    }

    protected boolean onPreExecute() {
        return true;
    }

    void injectParameters(Context context, C2766c c2766c, C2770f<Result> c2770f, IdManager idManager) {
        this.fabric = c2766c;
        this.context = new C2767d(context, getIdentifier(), getPath());
        this.initializationCallback = c2770f;
        this.idManager = idManager;
    }

    final void initialize() {
        this.initializationTask.m23632a(this.fabric.m13536f(), (Void) null);
    }

    protected IdManager getIdManager() {
        return this.idManager;
    }

    public Context getContext() {
        return this.context;
    }

    public C2766c getFabric() {
        return this.fabric;
    }

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".Fabric");
        stringBuilder.append(File.separator);
        stringBuilder.append(getIdentifier());
        return stringBuilder.toString();
    }

    public int compareTo(C2771h c2771h) {
        if (containsAnnotatedDependency(c2771h)) {
            return 1;
        }
        if (c2771h.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (hasAnnotatedDependency() && !c2771h.hasAnnotatedDependency()) {
            return 1;
        }
        if (hasAnnotatedDependency() || c2771h.hasAnnotatedDependency() == null) {
            return null;
        }
        return -1;
    }

    boolean containsAnnotatedDependency(C2771h c2771h) {
        if (hasAnnotatedDependency()) {
            for (Class isAssignableFrom : this.dependsOnAnnotation.m13763a()) {
                if (isAssignableFrom.isAssignableFrom(c2771h.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    protected Collection<C2828i> getDependencies() {
        return this.initializationTask.mo3584c();
    }
}
