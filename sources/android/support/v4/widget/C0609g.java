package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.g */
class C0609g extends Filter {
    /* renamed from: a */
    C0608a f1956a;

    /* renamed from: android.support.v4.widget.g$a */
    interface C0608a {
        /* renamed from: a */
        Cursor mo472a();

        /* renamed from: a */
        Cursor mo473a(CharSequence charSequence);

        /* renamed from: a */
        void mo474a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo475c(Cursor cursor);
    }

    C0609g(C0608a c0608a) {
        this.f1956a = c0608a;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1956a.mo475c((Cursor) obj);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        charSequence = this.f1956a.mo473a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (charSequence != null) {
            filterResults.count = charSequence.getCount();
            filterResults.values = charSequence;
        } else {
            filterResults.count = null;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        charSequence = this.f1956a.mo472a();
        if (filterResults.values != null && filterResults.values != charSequence) {
            this.f1956a.mo474a((Cursor) filterResults.values);
        }
    }
}
