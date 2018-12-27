package com.bumptech.glide.load.resource.p064b;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.engine.C1274o;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.resource.p065d.C3536c;
import com.bumptech.glide.p055g.C1178i;

/* renamed from: com.bumptech.glide.load.resource.b.b */
public abstract class C3505b<T extends Drawable> implements C1274o, C1277s<T> {
    /* renamed from: a */
    protected final T f14543a;

    /* renamed from: d */
    public /* synthetic */ Object mo1046d() {
        return m17776b();
    }

    public C3505b(T t) {
        this.f14543a = (Drawable) C1178i.m4880a((Object) t);
    }

    /* renamed from: b */
    public final T m17776b() {
        ConstantState constantState = this.f14543a.getConstantState();
        if (constantState == null) {
            return this.f14543a;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    public void mo1049a() {
        if (this.f14543a instanceof BitmapDrawable) {
            ((BitmapDrawable) this.f14543a).getBitmap().prepareToDraw();
        } else if (this.f14543a instanceof C3536c) {
            ((C3536c) this.f14543a).m17904b().prepareToDraw();
        }
    }
}
