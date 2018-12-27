package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zaj;
import java.lang.ref.WeakReference;

public final class zac extends zaa {
    private WeakReference<ImageView> zanb;

    public zac(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zanb = new WeakReference(imageView);
    }

    public final int hashCode() {
        return 0;
    }

    public zac(ImageView imageView, int i) {
        super(null, i);
        Asserts.checkNotNull(imageView);
        this.zanb = new WeakReference(imageView);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zac)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ImageView imageView = (ImageView) this.zanb.get();
        ImageView imageView2 = (ImageView) ((zac) obj).zanb.get();
        return (imageView2 == null || imageView == null || Objects.equal(imageView2, imageView) == null) ? false : true;
    }

    protected final void zaa(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) this.zanb.get();
        if (imageView != null) {
            int i = 0;
            Object obj = (z2 || z3) ? null : 1;
            if (obj != null && (imageView instanceof zaj)) {
                int a = zaj.m11320a();
                if (this.zamw != 0 && a == this.zamw) {
                    return;
                }
            }
            z = zaa(z, z2);
            Uri uri = false;
            if (z) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zae) {
                    drawable2 = ((zae) drawable2).m11318a();
                }
                drawable = new zae(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zaj) {
                if (z3) {
                    uri = this.zamu.uri;
                }
                zaj.m11322a(uri);
                if (obj != null) {
                    i = this.zamw;
                }
                zaj.m11321a(i);
            }
            if (z) {
                ((zae) drawable).m11319a(true);
            }
        }
    }
}
