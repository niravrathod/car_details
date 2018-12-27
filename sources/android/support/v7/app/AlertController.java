package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.C0560r;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0579b;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

class AlertController {
    /* renamed from: A */
    private int f2065A;
    /* renamed from: B */
    private boolean f2066B = false;
    /* renamed from: C */
    private CharSequence f2067C;
    /* renamed from: D */
    private Drawable f2068D;
    /* renamed from: E */
    private CharSequence f2069E;
    /* renamed from: F */
    private Drawable f2070F;
    /* renamed from: G */
    private CharSequence f2071G;
    /* renamed from: H */
    private Drawable f2072H;
    /* renamed from: I */
    private int f2073I = 0;
    /* renamed from: J */
    private Drawable f2074J;
    /* renamed from: K */
    private ImageView f2075K;
    /* renamed from: L */
    private TextView f2076L;
    /* renamed from: M */
    private TextView f2077M;
    /* renamed from: N */
    private View f2078N;
    /* renamed from: O */
    private int f2079O;
    /* renamed from: P */
    private int f2080P;
    /* renamed from: Q */
    private boolean f2081Q;
    /* renamed from: R */
    private int f2082R = 0;
    /* renamed from: S */
    private final OnClickListener f2083S = new C06401(this);
    /* renamed from: a */
    final C3203j f2084a;
    /* renamed from: b */
    ListView f2085b;
    /* renamed from: c */
    Button f2086c;
    /* renamed from: d */
    Message f2087d;
    /* renamed from: e */
    Button f2088e;
    /* renamed from: f */
    Message f2089f;
    /* renamed from: g */
    Button f2090g;
    /* renamed from: h */
    Message f2091h;
    /* renamed from: i */
    NestedScrollView f2092i;
    /* renamed from: j */
    ListAdapter f2093j;
    /* renamed from: k */
    int f2094k = -1;
    /* renamed from: l */
    int f2095l;
    /* renamed from: m */
    int f2096m;
    /* renamed from: n */
    int f2097n;
    /* renamed from: o */
    int f2098o;
    /* renamed from: p */
    Handler f2099p;
    /* renamed from: q */
    private final Context f2100q;
    /* renamed from: r */
    private final Window f2101r;
    /* renamed from: s */
    private final int f2102s;
    /* renamed from: t */
    private CharSequence f2103t;
    /* renamed from: u */
    private CharSequence f2104u;
    /* renamed from: v */
    private View f2105v;
    /* renamed from: w */
    private int f2106w;
    /* renamed from: x */
    private int f2107x;
    /* renamed from: y */
    private int f2108y;
    /* renamed from: z */
    private int f2109z;

    /* renamed from: android.support.v7.app.AlertController$1 */
    class C06401 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AlertController f1998a;

        C06401(AlertController alertController) {
            this.f1998a = alertController;
        }

        public void onClick(View view) {
            view = (view != this.f1998a.f2086c || this.f1998a.f2087d == null) ? (view != this.f1998a.f2088e || this.f1998a.f2089f == null) ? (view != this.f1998a.f2090g || this.f1998a.f2091h == null) ? null : Message.obtain(this.f1998a.f2091h) : Message.obtain(this.f1998a.f2089f) : Message.obtain(this.f1998a.f2087d);
            if (view != null) {
                view.sendToTarget();
            }
            this.f1998a.f2099p.obtainMessage(1, this.f1998a.f2084a).sendToTarget();
        }
    }

    public static class RecycleListView extends ListView {
        /* renamed from: a */
        private final int f2008a;
        /* renamed from: b */
        private final int f2009b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0636j.RecycleListView);
            this.f2009b = context.getDimensionPixelOffset(C0636j.RecycleListView_paddingBottomNoButtons, -1);
            this.f2008a = context.getDimensionPixelOffset(C0636j.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f2008a, getPaddingRight(), z2 ? getPaddingBottom() : this.f2009b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0649a {
        /* renamed from: A */
        public int f2022A;
        /* renamed from: B */
        public int f2023B;
        /* renamed from: C */
        public int f2024C;
        /* renamed from: D */
        public int f2025D;
        /* renamed from: E */
        public boolean f2026E = false;
        /* renamed from: F */
        public boolean[] f2027F;
        /* renamed from: G */
        public boolean f2028G;
        /* renamed from: H */
        public boolean f2029H;
        /* renamed from: I */
        public int f2030I = -1;
        /* renamed from: J */
        public OnMultiChoiceClickListener f2031J;
        /* renamed from: K */
        public Cursor f2032K;
        /* renamed from: L */
        public String f2033L;
        /* renamed from: M */
        public String f2034M;
        /* renamed from: N */
        public OnItemSelectedListener f2035N;
        /* renamed from: O */
        public C0648a f2036O;
        /* renamed from: P */
        public boolean f2037P = true;
        /* renamed from: a */
        public final Context f2038a;
        /* renamed from: b */
        public final LayoutInflater f2039b;
        /* renamed from: c */
        public int f2040c = 0;
        /* renamed from: d */
        public Drawable f2041d;
        /* renamed from: e */
        public int f2042e = 0;
        /* renamed from: f */
        public CharSequence f2043f;
        /* renamed from: g */
        public View f2044g;
        /* renamed from: h */
        public CharSequence f2045h;
        /* renamed from: i */
        public CharSequence f2046i;
        /* renamed from: j */
        public Drawable f2047j;
        /* renamed from: k */
        public DialogInterface.OnClickListener f2048k;
        /* renamed from: l */
        public CharSequence f2049l;
        /* renamed from: m */
        public Drawable f2050m;
        /* renamed from: n */
        public DialogInterface.OnClickListener f2051n;
        /* renamed from: o */
        public CharSequence f2052o;
        /* renamed from: p */
        public Drawable f2053p;
        /* renamed from: q */
        public DialogInterface.OnClickListener f2054q;
        /* renamed from: r */
        public boolean f2055r;
        /* renamed from: s */
        public OnCancelListener f2056s;
        /* renamed from: t */
        public OnDismissListener f2057t;
        /* renamed from: u */
        public OnKeyListener f2058u;
        /* renamed from: v */
        public CharSequence[] f2059v;
        /* renamed from: w */
        public ListAdapter f2060w;
        /* renamed from: x */
        public DialogInterface.OnClickListener f2061x;
        /* renamed from: y */
        public int f2062y;
        /* renamed from: z */
        public View f2063z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0648a {
            /* renamed from: a */
            void m2567a(ListView listView);
        }

        public C0649a(Context context) {
            this.f2038a = context;
            this.f2055r = true;
            this.f2039b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void m2569a(AlertController alertController) {
            if (this.f2044g != null) {
                alertController.m2590b(this.f2044g);
            } else {
                if (this.f2043f != null) {
                    alertController.m2587a(this.f2043f);
                }
                if (this.f2041d != null) {
                    alertController.m2585a(this.f2041d);
                }
                if (this.f2040c != 0) {
                    alertController.m2589b(this.f2040c);
                }
                if (this.f2042e != 0) {
                    alertController.m2589b(alertController.m2593c(this.f2042e));
                }
            }
            if (this.f2045h != null) {
                alertController.m2591b(this.f2045h);
            }
            if (!(this.f2046i == null && this.f2047j == null)) {
                alertController.m2584a(-1, this.f2046i, this.f2048k, null, this.f2047j);
            }
            if (!(this.f2049l == null && this.f2050m == null)) {
                alertController.m2584a(-2, this.f2049l, this.f2051n, null, this.f2050m);
            }
            if (!(this.f2052o == null && this.f2053p == null)) {
                alertController.m2584a(-3, this.f2052o, this.f2054q, null, this.f2053p);
            }
            if (!(this.f2059v == null && this.f2032K == null && this.f2060w == null)) {
                m2568b(alertController);
            }
            if (this.f2063z != null) {
                if (this.f2026E) {
                    alertController.m2586a(this.f2063z, this.f2022A, this.f2023B, this.f2024C, this.f2025D);
                    return;
                }
                alertController.m2594c(this.f2063z);
            } else if (this.f2062y != 0) {
                alertController.m2583a(this.f2062y);
            }
        }

        /* renamed from: b */
        private void m2568b(final AlertController alertController) {
            ListAdapter simpleCursorAdapter;
            final RecycleListView recycleListView = (RecycleListView) this.f2039b.inflate(alertController.f2095l, null);
            if (!this.f2028G) {
                int i;
                if (this.f2029H) {
                    i = alertController.f2097n;
                } else {
                    i = alertController.f2098o;
                }
                int i2 = i;
                if (this.f2032K != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(this.f2038a, i2, this.f2032K, new String[]{this.f2033L}, new int[]{16908308});
                } else if (this.f2060w != null) {
                    simpleCursorAdapter = this.f2060w;
                } else {
                    simpleCursorAdapter = new C0651c(this.f2038a, i2, 16908308, this.f2059v);
                }
            } else if (this.f2032K == null) {
                final RecycleListView recycleListView2 = recycleListView;
                r1 = new ArrayAdapter<CharSequence>(this, this.f2038a, alertController.f2096m, 16908308, this.f2059v) {
                    /* renamed from: b */
                    final /* synthetic */ C0649a f2011b;

                    public View getView(int i, View view, ViewGroup viewGroup) {
                        view = super.getView(i, view, viewGroup);
                        if (!(this.f2011b.f2027F == null || this.f2011b.f2027F[i] == null)) {
                            recycleListView2.setItemChecked(i, true);
                        }
                        return view;
                    }
                };
            } else {
                final RecycleListView recycleListView3 = recycleListView;
                final AlertController alertController2 = alertController;
                r1 = new CursorAdapter(this, this.f2038a, this.f2032K, false) {
                    /* renamed from: c */
                    final /* synthetic */ C0649a f2014c;
                    /* renamed from: d */
                    private final int f2015d;
                    /* renamed from: e */
                    private final int f2016e;

                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f2015d));
                        view = recycleListView3;
                        context = cursor.getPosition();
                        boolean z = true;
                        if (cursor.getInt(this.f2016e) != 1) {
                            z = false;
                        }
                        view.setItemChecked(context, z);
                    }

                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return this.f2014c.f2039b.inflate(alertController2.f2096m, viewGroup, false);
                    }
                };
            }
            if (this.f2036O != null) {
                this.f2036O.m2567a(recycleListView);
            }
            alertController.f2093j = simpleCursorAdapter;
            alertController.f2094k = this.f2030I;
            if (this.f2061x != null) {
                recycleListView.setOnItemClickListener(new OnItemClickListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0649a f2018b;

                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        this.f2018b.f2061x.onClick(alertController.f2084a, i);
                        if (this.f2018b.f2029H == null) {
                            alertController.f2084a.dismiss();
                        }
                    }
                });
            } else if (this.f2031J != null) {
                recycleListView.setOnItemClickListener(new OnItemClickListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0649a f2021c;

                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        if (this.f2021c.f2027F != null) {
                            this.f2021c.f2027F[i] = recycleListView.isItemChecked(i);
                        }
                        this.f2021c.f2031J.onClick(alertController.f2084a, i, recycleListView.isItemChecked(i));
                    }
                });
            }
            if (this.f2035N != null) {
                recycleListView.setOnItemSelectedListener(this.f2035N);
            }
            if (this.f2029H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f2028G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f2085b = recycleListView;
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0650b extends Handler {
        /* renamed from: a */
        private WeakReference<DialogInterface> f2064a;

        public C0650b(DialogInterface dialogInterface) {
            this.f2064a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2064a.get(), message.what);
                        return;
                    default:
                        return;
                }
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0651c extends ArrayAdapter<CharSequence> {
        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }

        public C0651c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }

    /* renamed from: a */
    private static boolean m2575a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0627a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != null) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, C3203j c3203j, Window window) {
        this.f2100q = context;
        this.f2084a = c3203j;
        this.f2101r = window;
        this.f2099p = new C0650b(c3203j);
        context = context.obtainStyledAttributes(null, C0636j.AlertDialog, C0627a.alertDialogStyle, 0);
        this.f2079O = context.getResourceId(C0636j.AlertDialog_android_layout, 0);
        this.f2080P = context.getResourceId(C0636j.AlertDialog_buttonPanelSideLayout, 0);
        this.f2095l = context.getResourceId(C0636j.AlertDialog_listLayout, 0);
        this.f2096m = context.getResourceId(C0636j.AlertDialog_multiChoiceItemLayout, 0);
        this.f2097n = context.getResourceId(C0636j.AlertDialog_singleChoiceItemLayout, 0);
        this.f2098o = context.getResourceId(C0636j.AlertDialog_listItemLayout, 0);
        this.f2081Q = context.getBoolean(C0636j.AlertDialog_showTitle, true);
        this.f2102s = context.getDimensionPixelSize(C0636j.AlertDialog_buttonIconDimen, 0);
        context.recycle();
        c3203j.m15940a(1);
    }

    /* renamed from: a */
    static boolean m2576a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2576a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m2582a() {
        this.f2084a.setContentView(m2577b());
        m2579c();
    }

    /* renamed from: b */
    private int m2577b() {
        if (this.f2080P == 0) {
            return this.f2079O;
        }
        if (this.f2082R == 1) {
            return this.f2080P;
        }
        return this.f2079O;
    }

    /* renamed from: a */
    public void m2587a(CharSequence charSequence) {
        this.f2103t = charSequence;
        if (this.f2076L != null) {
            this.f2076L.setText(charSequence);
        }
    }

    /* renamed from: b */
    public void m2590b(View view) {
        this.f2078N = view;
    }

    /* renamed from: b */
    public void m2591b(CharSequence charSequence) {
        this.f2104u = charSequence;
        if (this.f2077M != null) {
            this.f2077M.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void m2583a(int i) {
        this.f2105v = null;
        this.f2106w = i;
        this.f2066B = false;
    }

    /* renamed from: c */
    public void m2594c(View view) {
        this.f2105v = view;
        this.f2106w = 0;
        this.f2066B = false;
    }

    /* renamed from: a */
    public void m2586a(View view, int i, int i2, int i3, int i4) {
        this.f2105v = view;
        this.f2106w = null;
        this.f2066B = true;
        this.f2107x = i;
        this.f2108y = i2;
        this.f2109z = i3;
        this.f2065A = i4;
    }

    /* renamed from: a */
    public void m2584a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f2099p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f2071G = charSequence;
                this.f2091h = message;
                this.f2072H = drawable;
                return;
            case -2:
                this.f2069E = charSequence;
                this.f2089f = message;
                this.f2070F = drawable;
                return;
            case -1:
                this.f2067C = charSequence;
                this.f2087d = message;
                this.f2068D = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b */
    public void m2589b(int i) {
        this.f2074J = null;
        this.f2073I = i;
        if (this.f2075K == null) {
            return;
        }
        if (i != 0) {
            this.f2075K.setVisibility(0);
            this.f2075K.setImageResource(this.f2073I);
            return;
        }
        this.f2075K.setVisibility(8);
    }

    /* renamed from: a */
    public void m2585a(Drawable drawable) {
        this.f2074J = drawable;
        this.f2073I = 0;
        if (this.f2075K == null) {
            return;
        }
        if (drawable != null) {
            this.f2075K.setVisibility(0);
            this.f2075K.setImageDrawable(drawable);
            return;
        }
        this.f2075K.setVisibility(8);
    }

    /* renamed from: c */
    public int m2593c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f2100q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public boolean m2588a(int i, KeyEvent keyEvent) {
        return (this.f2092i == 0 || this.f2092i.m24330a(keyEvent) == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m2592b(int i, KeyEvent keyEvent) {
        return (this.f2092i == 0 || this.f2092i.m24330a(keyEvent) == 0) ? false : true;
    }

    /* renamed from: a */
    private ViewGroup m2570a(View view, View view2) {
        if (view == null) {
            if ((view2 instanceof ViewStub) != null) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if ((view instanceof ViewStub) != null) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: c */
    private void m2579c() {
        View findViewById = this.f2101r.findViewById(C0632f.parentPanel);
        View findViewById2 = findViewById.findViewById(C0632f.topPanel);
        View findViewById3 = findViewById.findViewById(C0632f.contentPanel);
        View findViewById4 = findViewById.findViewById(C0632f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0632f.customPanel);
        m2572a(viewGroup);
        View findViewById5 = viewGroup.findViewById(C0632f.topPanel);
        View findViewById6 = viewGroup.findViewById(C0632f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C0632f.buttonPanel);
        ViewGroup a = m2570a(findViewById5, findViewById2);
        ViewGroup a2 = m2570a(findViewById6, findViewById3);
        ViewGroup a3 = m2570a(findViewById7, findViewById4);
        m2580c(a2);
        m2581d(a3);
        m2578b(a);
        int i = 0;
        Object obj = (viewGroup == null || viewGroup.getVisibility() == 8) ? null : 1;
        boolean z = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z2 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z2 || a2 == null)) {
            findViewById5 = a2.findViewById(C0632f.textSpacerNoButtons);
            if (findViewById5 != null) {
                findViewById5.setVisibility(0);
            }
        }
        if (z) {
            if (this.f2092i != null) {
                this.f2092i.setClipToPadding(true);
            }
            findViewById5 = null;
            if (!(this.f2104u == null && this.f2085b == null)) {
                findViewById5 = a.findViewById(C0632f.titleDividerNoCustom);
            }
            if (findViewById5 != null) {
                findViewById5.setVisibility(0);
            }
        } else if (a2 != null) {
            findViewById2 = a2.findViewById(C0632f.textSpacerNoTitle);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        }
        if (this.f2085b instanceof RecycleListView) {
            ((RecycleListView) this.f2085b).setHasDecor(z, z2);
        }
        if (obj == null) {
            findViewById = this.f2085b != null ? this.f2085b : this.f2092i;
            if (findViewById != null) {
                if (z2) {
                    i = 2;
                }
                m2573a(a2, findViewById, z | i, 3);
            }
        }
        ListView listView = this.f2085b;
        if (listView != null && this.f2093j != null) {
            listView.setAdapter(this.f2093j);
            int i2 = this.f2094k;
            if (i2 > -1) {
                listView.setItemChecked(i2, true);
                listView.setSelection(i2);
            }
        }
    }

    /* renamed from: a */
    private void m2573a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f2101r.findViewById(C0632f.scrollIndicatorUp);
        View findViewById2 = this.f2101r.findViewById(C0632f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            C0560r.m2168a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        view = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view != null) {
            if (this.f2104u != 0) {
                this.f2092i.setOnScrollChangeListener(new C0579b(this) {
                    /* renamed from: c */
                    final /* synthetic */ AlertController f13390c;

                    /* renamed from: a */
                    public void mo486a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m2571a(nestedScrollView, findViewById, view);
                    }
                });
                this.f2092i.post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ AlertController f2001c;

                    public void run() {
                        AlertController.m2571a(this.f2001c.f2092i, findViewById, view);
                    }
                });
            } else if (this.f2085b != 0) {
                this.f2085b.setOnScrollListener(new OnScrollListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ AlertController f2004c;

                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }

                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m2571a(absListView, findViewById, view);
                    }
                });
                this.f2085b.post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ AlertController f2007c;

                    public void run() {
                        AlertController.m2571a(this.f2007c.f2085b, findViewById, view);
                    }
                });
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (view != null) {
                    viewGroup.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2572a(ViewGroup viewGroup) {
        boolean z = false;
        View inflate = this.f2105v != null ? this.f2105v : this.f2106w != 0 ? LayoutInflater.from(this.f2100q).inflate(this.f2106w, viewGroup, false) : null;
        if (inflate != null) {
            z = true;
        }
        if (!(z && m2576a(inflate))) {
            this.f2101r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f2101r.findViewById(C0632f.custom);
            frameLayout.addView(inflate, new LayoutParams(-1, -1));
            if (this.f2066B) {
                frameLayout.setPadding(this.f2107x, this.f2108y, this.f2109z, this.f2065A);
            }
            if (this.f2085b != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f2418g = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: b */
    private void m2578b(ViewGroup viewGroup) {
        if (this.f2078N != null) {
            viewGroup.addView(this.f2078N, 0, new LayoutParams(-1, -2));
            this.f2101r.findViewById(C0632f.title_template).setVisibility(8);
            return;
        }
        this.f2075K = (ImageView) this.f2101r.findViewById(16908294);
        if ((TextUtils.isEmpty(this.f2103t) ^ 1) == 0 || !this.f2081Q) {
            this.f2101r.findViewById(C0632f.title_template).setVisibility(8);
            this.f2075K.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f2076L = (TextView) this.f2101r.findViewById(C0632f.alertTitle);
        this.f2076L.setText(this.f2103t);
        if (this.f2073I != null) {
            this.f2075K.setImageResource(this.f2073I);
        } else if (this.f2074J != null) {
            this.f2075K.setImageDrawable(this.f2074J);
        } else {
            this.f2076L.setPadding(this.f2075K.getPaddingLeft(), this.f2075K.getPaddingTop(), this.f2075K.getPaddingRight(), this.f2075K.getPaddingBottom());
            this.f2075K.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m2580c(ViewGroup viewGroup) {
        this.f2092i = (NestedScrollView) this.f2101r.findViewById(C0632f.scrollView);
        this.f2092i.setFocusable(false);
        this.f2092i.setNestedScrollingEnabled(false);
        this.f2077M = (TextView) viewGroup.findViewById(16908299);
        if (this.f2077M != null) {
            if (this.f2104u != null) {
                this.f2077M.setText(this.f2104u);
            } else {
                this.f2077M.setVisibility(8);
                this.f2092i.removeView(this.f2077M);
                if (this.f2085b != null) {
                    viewGroup = (ViewGroup) this.f2092i.getParent();
                    int indexOfChild = viewGroup.indexOfChild(this.f2092i);
                    viewGroup.removeViewAt(indexOfChild);
                    viewGroup.addView(this.f2085b, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    static void m2571a(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1) != null) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: d */
    private void m2581d(ViewGroup viewGroup) {
        int i;
        this.f2086c = (Button) viewGroup.findViewById(16908313);
        this.f2086c.setOnClickListener(this.f2083S);
        Object obj = 1;
        if (TextUtils.isEmpty(this.f2067C) && this.f2068D == null) {
            this.f2086c.setVisibility(8);
            i = 0;
        } else {
            this.f2086c.setText(this.f2067C);
            if (this.f2068D != null) {
                this.f2068D.setBounds(0, 0, this.f2102s, this.f2102s);
                this.f2086c.setCompoundDrawables(this.f2068D, null, null, null);
            }
            this.f2086c.setVisibility(0);
            i = 1;
        }
        this.f2088e = (Button) viewGroup.findViewById(16908314);
        this.f2088e.setOnClickListener(this.f2083S);
        if (TextUtils.isEmpty(this.f2069E) && this.f2070F == null) {
            this.f2088e.setVisibility(8);
        } else {
            this.f2088e.setText(this.f2069E);
            if (this.f2070F != null) {
                this.f2070F.setBounds(0, 0, this.f2102s, this.f2102s);
                this.f2088e.setCompoundDrawables(this.f2070F, null, null, null);
            }
            this.f2088e.setVisibility(0);
            i |= 2;
        }
        this.f2090g = (Button) viewGroup.findViewById(16908315);
        this.f2090g.setOnClickListener(this.f2083S);
        if (TextUtils.isEmpty(this.f2071G) && this.f2072H == null) {
            this.f2090g.setVisibility(8);
        } else {
            this.f2090g.setText(this.f2071G);
            if (this.f2068D != null) {
                this.f2068D.setBounds(0, 0, this.f2102s, this.f2102s);
                this.f2086c.setCompoundDrawables(this.f2068D, null, null, null);
            }
            this.f2090g.setVisibility(0);
            i |= 4;
        }
        if (m2575a(this.f2100q)) {
            if (i == 1) {
                m2574a(this.f2086c);
            } else if (i == 2) {
                m2574a(this.f2088e);
            } else if (i == 4) {
                m2574a(this.f2090g);
            }
        }
        if (i == 0) {
            obj = null;
        }
        if (obj == null) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m2574a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
