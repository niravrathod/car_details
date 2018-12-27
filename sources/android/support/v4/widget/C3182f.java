package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.C0609g.C0608a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import com.j256.ormlite.field.FieldType;

/* renamed from: android.support.v4.widget.f */
public abstract class C3182f extends BaseAdapter implements C0608a, Filterable {
    /* renamed from: a */
    protected boolean f13378a;
    /* renamed from: b */
    protected boolean f13379b;
    /* renamed from: c */
    protected Cursor f13380c;
    /* renamed from: d */
    protected Context f13381d;
    /* renamed from: e */
    protected int f13382e;
    /* renamed from: f */
    protected C0606a f13383f;
    /* renamed from: g */
    protected DataSetObserver f13384g;
    /* renamed from: h */
    protected C0609g f13385h;
    /* renamed from: i */
    protected FilterQueryProvider f13386i;

    /* renamed from: android.support.v4.widget.f$a */
    private class C0606a extends ContentObserver {
        /* renamed from: a */
        final /* synthetic */ C3182f f1954a;

        public boolean deliverSelfNotifications() {
            return true;
        }

        C0606a(C3182f c3182f) {
            this.f1954a = c3182f;
            super(new Handler());
        }

        public void onChange(boolean z) {
            this.f1954a.m15856b();
        }
    }

    /* renamed from: android.support.v4.widget.f$b */
    private class C0607b extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ C3182f f1955a;

        C0607b(C3182f c3182f) {
            this.f1955a = c3182f;
        }

        public void onChanged() {
            this.f1955a.f13378a = true;
            this.f1955a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.f1955a.f13378a = false;
            this.f1955a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: a */
    public abstract View mo3792a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo4614a(View view, Context context, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public C3182f(Context context, Cursor cursor, boolean z) {
        m15851a(context, cursor, z ? true : true);
    }

    /* renamed from: a */
    void m15851a(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f13379b = true;
        } else {
            this.f13379b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f13380c = cursor;
        this.f13378a = z;
        this.f13381d = context;
        this.f13382e = z ? cursor.getColumnIndexOrThrow(FieldType.FOREIGN_ID_FIELD_SUFFIX) : -1;
        if ((i & 2) == 2) {
            this.f13383f = new C0606a(this);
            this.f13384g = new C0607b(this);
        } else {
            this.f13383f = null;
            this.f13384g = null;
        }
        if (z) {
            if (this.f13383f != null) {
                cursor.registerContentObserver(this.f13383f);
            }
            if (this.f13384g != null) {
                cursor.registerDataSetObserver(this.f13384g);
            }
        }
    }

    /* renamed from: a */
    public Cursor mo472a() {
        return this.f13380c;
    }

    public int getCount() {
        return (!this.f13378a || this.f13380c == null) ? 0 : this.f13380c.getCount();
    }

    public Object getItem(int i) {
        if (!this.f13378a || this.f13380c == null) {
            return 0;
        }
        this.f13380c.moveToPosition(i);
        return this.f13380c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getItemId(int r4) {
        /*
        r3 = this;
        r0 = r3.f13378a;
        r1 = 0;
        if (r0 == 0) goto L_0x001c;
    L_0x0006:
        r0 = r3.f13380c;
        if (r0 == 0) goto L_0x001c;
    L_0x000a:
        r0 = r3.f13380c;
        r4 = r0.moveToPosition(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x0012:
        r4 = r3.f13380c;
        r0 = r3.f13382e;
        r0 = r4.getLong(r0);
        return r0;
    L_0x001b:
        return r1;
    L_0x001c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.f.getItemId(int):long");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f13378a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f13380c.moveToPosition(i)) {
            if (view == null) {
                view = mo3792a(this.f13381d, this.f13380c, viewGroup);
            }
            mo4614a(view, this.f13381d, this.f13380c);
            return view;
        } else {
            viewGroup = new StringBuilder();
            viewGroup.append("couldn't move cursor to position ");
            viewGroup.append(i);
            throw new IllegalStateException(viewGroup.toString());
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f13378a) {
            return 0;
        }
        this.f13380c.moveToPosition(i);
        if (view == null) {
            view = mo3793b(this.f13381d, this.f13380c, viewGroup);
        }
        mo4614a(view, this.f13381d, this.f13380c);
        return view;
    }

    /* renamed from: b */
    public View mo3793b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo3792a(context, cursor, viewGroup);
    }

    /* renamed from: a */
    public void mo474a(Cursor cursor) {
        cursor = m15854b(cursor);
        if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: b */
    public Cursor m15854b(Cursor cursor) {
        if (cursor == this.f13380c) {
            return null;
        }
        Cursor cursor2 = this.f13380c;
        if (cursor2 != null) {
            if (this.f13383f != null) {
                cursor2.unregisterContentObserver(this.f13383f);
            }
            if (this.f13384g != null) {
                cursor2.unregisterDataSetObserver(this.f13384g);
            }
        }
        this.f13380c = cursor;
        if (cursor != null) {
            if (this.f13383f != null) {
                cursor.registerContentObserver(this.f13383f);
            }
            if (this.f13384g != null) {
                cursor.registerDataSetObserver(this.f13384g);
            }
            this.f13382e = cursor.getColumnIndexOrThrow(FieldType.FOREIGN_ID_FIELD_SUFFIX);
            this.f13378a = true;
            notifyDataSetChanged();
        } else {
            this.f13382e = -1;
            this.f13378a = null;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: c */
    public CharSequence mo475c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: a */
    public Cursor mo473a(CharSequence charSequence) {
        if (this.f13386i != null) {
            return this.f13386i.runQuery(charSequence);
        }
        return this.f13380c;
    }

    public Filter getFilter() {
        if (this.f13385h == null) {
            this.f13385h = new C0609g(this);
        }
        return this.f13385h;
    }

    /* renamed from: b */
    protected void m15856b() {
        if (this.f13379b && this.f13380c != null && !this.f13380c.isClosed()) {
            this.f13378a = this.f13380c.requery();
        }
    }
}
