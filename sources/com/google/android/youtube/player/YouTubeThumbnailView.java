package com.google.android.youtube.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.player.internal.C4155a;

public final class YouTubeThumbnailView extends ImageView {
    /* renamed from: a */
    private C4155a f10877a;

    public YouTubeThumbnailView(Context context) {
        this(context, null);
    }

    public YouTubeThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YouTubeThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected final void finalize() {
        if (this.f10877a != null) {
            this.f10877a.m22894c();
            this.f10877a = null;
        }
        super.finalize();
    }
}
