package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.n */
public abstract class C4450n extends C3182f {
    /* renamed from: j */
    private int f18453j;
    /* renamed from: k */
    private int f18454k;
    /* renamed from: l */
    private LayoutInflater f18455l;

    @Deprecated
    public C4450n(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f18454k = i;
        this.f18453j = i;
        this.f18455l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo3792a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f18455l.inflate(this.f18453j, viewGroup, false);
    }

    /* renamed from: b */
    public View mo3793b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f18455l.inflate(this.f18454k, viewGroup, false);
    }
}
