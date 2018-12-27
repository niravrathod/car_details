package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0560r;
import android.support.v4.widget.C3182f;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0630d;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.p020a.C0637a.C0634h;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.C0707c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements C0707c {
    /* renamed from: i */
    static final C0815a f13811i = new C0815a();
    /* renamed from: A */
    private C0817c f13812A;
    /* renamed from: B */
    private C0816b f13813B;
    /* renamed from: C */
    private C0818d f13814C;
    /* renamed from: D */
    private OnClickListener f13815D;
    /* renamed from: E */
    private boolean f13816E;
    /* renamed from: F */
    private boolean f13817F;
    /* renamed from: G */
    private boolean f13818G;
    /* renamed from: H */
    private CharSequence f13819H;
    /* renamed from: I */
    private boolean f13820I;
    /* renamed from: J */
    private boolean f13821J;
    /* renamed from: K */
    private int f13822K;
    /* renamed from: L */
    private boolean f13823L;
    /* renamed from: M */
    private CharSequence f13824M;
    /* renamed from: N */
    private CharSequence f13825N;
    /* renamed from: O */
    private boolean f13826O;
    /* renamed from: P */
    private int f13827P;
    /* renamed from: Q */
    private Bundle f13828Q;
    /* renamed from: R */
    private final Runnable f13829R;
    /* renamed from: S */
    private Runnable f13830S;
    /* renamed from: T */
    private final WeakHashMap<String, ConstantState> f13831T;
    /* renamed from: U */
    private final OnClickListener f13832U;
    /* renamed from: V */
    private final OnEditorActionListener f13833V;
    /* renamed from: W */
    private final OnItemClickListener f13834W;
    /* renamed from: a */
    final SearchAutoComplete f13835a;
    private final OnItemSelectedListener aa;
    private TextWatcher ab;
    /* renamed from: b */
    final ImageView f13836b;
    /* renamed from: c */
    final ImageView f13837c;
    /* renamed from: d */
    final ImageView f13838d;
    /* renamed from: e */
    final ImageView f13839e;
    /* renamed from: f */
    OnFocusChangeListener f13840f;
    /* renamed from: g */
    C3182f f13841g;
    /* renamed from: h */
    SearchableInfo f13842h;
    /* renamed from: j */
    OnKeyListener f13843j;
    /* renamed from: k */
    private final View f13844k;
    /* renamed from: l */
    private final View f13845l;
    /* renamed from: m */
    private final View f13846m;
    /* renamed from: n */
    private final View f13847n;
    /* renamed from: o */
    private C0819e f13848o;
    /* renamed from: p */
    private Rect f13849p;
    /* renamed from: q */
    private Rect f13850q;
    /* renamed from: r */
    private int[] f13851r;
    /* renamed from: s */
    private int[] f13852s;
    /* renamed from: t */
    private final ImageView f13853t;
    /* renamed from: u */
    private final Drawable f13854u;
    /* renamed from: v */
    private final int f13855v;
    /* renamed from: w */
    private final int f13856w;
    /* renamed from: x */
    private final Intent f13857x;
    /* renamed from: y */
    private final Intent f13858y;
    /* renamed from: z */
    private final CharSequence f13859z;

    /* renamed from: android.support.v7.widget.SearchView$1 */
    class C08041 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ SearchView f2604a;

        C08041(SearchView searchView) {
            this.f2604a = searchView;
        }

        public void run() {
            this.f2604a.m16518d();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$2 */
    class C08052 implements TextWatcher {
        /* renamed from: a */
        final /* synthetic */ SearchView f2605a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C08052(SearchView searchView) {
            this.f2605a = searchView;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f2605a.m16516b(charSequence);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$3 */
    class C08063 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ SearchView f2606a;

        C08063(SearchView searchView) {
            this.f2606a = searchView;
        }

        public void run() {
            if (this.f2606a.f13841g != null && (this.f2606a.f13841g instanceof as)) {
                this.f2606a.f13841g.mo474a(null);
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$4 */
    class C08074 implements OnFocusChangeListener {
        /* renamed from: a */
        final /* synthetic */ SearchView f2607a;

        C08074(SearchView searchView) {
            this.f2607a = searchView;
        }

        public void onFocusChange(View view, boolean z) {
            if (this.f2607a.f13840f != null) {
                this.f2607a.f13840f.onFocusChange(this.f2607a, z);
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$5 */
    class C08085 implements OnLayoutChangeListener {
        /* renamed from: a */
        final /* synthetic */ SearchView f2608a;

        C08085(SearchView searchView) {
            this.f2608a = searchView;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f2608a.m16524k();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$6 */
    class C08096 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SearchView f2609a;

        C08096(SearchView searchView) {
            this.f2609a = searchView;
        }

        public void onClick(View view) {
            if (view == this.f2609a.f13836b) {
                this.f2609a.m16521g();
            } else if (view == this.f2609a.f13838d) {
                this.f2609a.m16520f();
            } else if (view == this.f2609a.f13837c) {
                this.f2609a.m16519e();
            } else if (view == this.f2609a.f13839e) {
                this.f2609a.m16522h();
            } else if (view == this.f2609a.f13835a) {
                this.f2609a.m16525l();
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$7 */
    class C08107 implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ SearchView f2610a;

        C08107(SearchView searchView) {
            this.f2610a = searchView;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (this.f2610a.f13842h == null) {
                return false;
            }
            if (this.f2610a.f13835a.isPopupShowing() && this.f2610a.f13835a.getListSelection() != -1) {
                return this.f2610a.m16514a(view, i, keyEvent);
            }
            if (this.f2610a.f13835a.m24711a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            this.f2610a.m16510a(0, null, this.f2610a.f13835a.getText().toString());
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$8 */
    class C08118 implements OnEditorActionListener {
        /* renamed from: a */
        final /* synthetic */ SearchView f2611a;

        C08118(SearchView searchView) {
            this.f2611a = searchView;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            this.f2611a.m16519e();
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$9 */
    class C08129 implements OnItemClickListener {
        /* renamed from: a */
        final /* synthetic */ SearchView f2612a;

        C08129(SearchView searchView) {
            this.f2612a = searchView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f2612a.m16513a(i, (int) null, null);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0815a {
        /* renamed from: a */
        private Method f2614a;
        /* renamed from: b */
        private Method f2615b;
        /* renamed from: c */
        private Method f2616c;

        C0815a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r6 = this;
            r6.<init>();
            r0 = 0;
            r1 = 1;
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r3 = "doBeforeTextChanged";	 Catch:{ NoSuchMethodException -> 0x0016 }
            r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0016 }
            r6.f2614a = r2;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2 = r6.f2614a;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0016 }
        L_0x0016:
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r3 = "doAfterTextChanged";	 Catch:{ NoSuchMethodException -> 0x0027 }
            r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0027 }
            r6.f2615b = r2;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2 = r6.f2615b;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0027 }
        L_0x0027:
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x003c }
            r3 = "ensureImeVisible";	 Catch:{ NoSuchMethodException -> 0x003c }
            r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x003c }
            r5 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x003c }
            r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0 = r2.getMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x003c }
            r6.f2616c = r0;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0 = r6.f2616c;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x003c }
        L_0x003c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a.<init>():void");
        }

        /* renamed from: a */
        void m3319a(android.widget.AutoCompleteTextView r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f2614a;
            if (r0 == 0) goto L_0x000c;
        L_0x0004:
            r0 = r2.f2614a;	 Catch:{ Exception -> 0x000c }
            r1 = 0;	 Catch:{ Exception -> 0x000c }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x000c }
            r0.invoke(r3, r1);	 Catch:{ Exception -> 0x000c }
        L_0x000c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a.a(android.widget.AutoCompleteTextView):void");
        }

        /* renamed from: b */
        void m3321b(android.widget.AutoCompleteTextView r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f2615b;
            if (r0 == 0) goto L_0x000c;
        L_0x0004:
            r0 = r2.f2615b;	 Catch:{ Exception -> 0x000c }
            r1 = 0;	 Catch:{ Exception -> 0x000c }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x000c }
            r0.invoke(r3, r1);	 Catch:{ Exception -> 0x000c }
        L_0x000c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a.b(android.widget.AutoCompleteTextView):void");
        }

        /* renamed from: a */
        void m3320a(android.widget.AutoCompleteTextView r4, boolean r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = r3.f2616c;
            if (r0 == 0) goto L_0x0013;
        L_0x0004:
            r0 = r3.f2616c;	 Catch:{ Exception -> 0x0013 }
            r1 = 1;	 Catch:{ Exception -> 0x0013 }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0013 }
            r2 = 0;	 Catch:{ Exception -> 0x0013 }
            r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x0013 }
            r1[r2] = r5;	 Catch:{ Exception -> 0x0013 }
            r0.invoke(r4, r1);	 Catch:{ Exception -> 0x0013 }
        L_0x0013:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a.a(android.widget.AutoCompleteTextView, boolean):void");
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0816b {
        /* renamed from: a */
        boolean m3322a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0817c {
        /* renamed from: a */
        boolean m3323a(String str);

        /* renamed from: b */
        boolean m3324b(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0818d {
        /* renamed from: a */
        boolean m3325a(int i);

        /* renamed from: b */
        boolean m3326b(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    private static class C0819e extends TouchDelegate {
        /* renamed from: a */
        private final View f2617a;
        /* renamed from: b */
        private final Rect f2618b = new Rect();
        /* renamed from: c */
        private final Rect f2619c = new Rect();
        /* renamed from: d */
        private final Rect f2620d = new Rect();
        /* renamed from: e */
        private final int f2621e;
        /* renamed from: f */
        private boolean f2622f;

        public C0819e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2621e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            m3327a(rect, rect2);
            this.f2617a = view;
        }

        /* renamed from: a */
        public void m3327a(Rect rect, Rect rect2) {
            this.f2618b.set(rect);
            this.f2620d.set(rect);
            this.f2620d.inset(-this.f2621e, -this.f2621e);
            this.f2619c.set(rect2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
            r6 = this;
            r0 = r7.getX();
            r0 = (int) r0;
            r1 = r7.getY();
            r1 = (int) r1;
            r2 = r7.getAction();
            r3 = 1;
            r4 = 0;
            switch(r2) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0019;
                case 2: goto L_0x0019;
                case 3: goto L_0x0014;
                default: goto L_0x0013;
            };
        L_0x0013:
            goto L_0x0033;
        L_0x0014:
            r2 = r6.f2622f;
            r6.f2622f = r4;
            goto L_0x0034;
        L_0x0019:
            r2 = r6.f2622f;
            if (r2 == 0) goto L_0x0034;
        L_0x001d:
            r5 = r6.f2620d;
            r5 = r5.contains(r0, r1);
            if (r5 != 0) goto L_0x0034;
        L_0x0025:
            r3 = 0;
            goto L_0x0034;
        L_0x0027:
            r2 = r6.f2618b;
            r2 = r2.contains(r0, r1);
            if (r2 == 0) goto L_0x0033;
        L_0x002f:
            r6.f2622f = r3;
            r2 = 1;
            goto L_0x0034;
        L_0x0033:
            r2 = 0;
        L_0x0034:
            if (r2 == 0) goto L_0x006b;
        L_0x0036:
            if (r3 == 0) goto L_0x0056;
        L_0x0038:
            r2 = r6.f2619c;
            r2 = r2.contains(r0, r1);
            if (r2 != 0) goto L_0x0056;
        L_0x0040:
            r0 = r6.f2617a;
            r0 = r0.getWidth();
            r0 = r0 / 2;
            r0 = (float) r0;
            r1 = r6.f2617a;
            r1 = r1.getHeight();
            r1 = r1 / 2;
            r1 = (float) r1;
            r7.setLocation(r0, r1);
            goto L_0x0065;
        L_0x0056:
            r2 = r6.f2619c;
            r2 = r2.left;
            r0 = r0 - r2;
            r0 = (float) r0;
            r2 = r6.f2619c;
            r2 = r2.top;
            r1 = r1 - r2;
            r1 = (float) r1;
            r7.setLocation(r0, r1);
        L_0x0065:
            r0 = r6.f2617a;
            r4 = r0.dispatchTouchEvent(r7);
        L_0x006b:
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.e.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C08131();
        /* renamed from: a */
        boolean f13810a;

        /* renamed from: android.support.v7.widget.SearchView$SavedState$1 */
        static class C08131 implements ClassLoaderCreator<SavedState> {
            C08131() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3316a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m3317a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m3318a(i);
            }

            /* renamed from: a */
            public SavedState m3317a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m3316a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m3318a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13810a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f13810a));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SearchView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" isIconified=");
            stringBuilder.append(this.f13810a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        /* renamed from: a */
        final Runnable f18640a;
        /* renamed from: b */
        private int f18641b;
        /* renamed from: c */
        private SearchView f18642c;
        /* renamed from: d */
        private boolean f18643d;

        /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete$1 */
        class C08141 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ SearchAutoComplete f2613a;

            C08141(SearchAutoComplete searchAutoComplete) {
                this.f2613a = searchAutoComplete;
            }

            public void run() {
                this.f2613a.m24713b();
            }
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0627a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f18640a = new C08141(this);
            this.f18641b = getThreshold();
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        void setSearchView(SearchView searchView) {
            this.f18642c = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f18641b = i;
        }

        /* renamed from: a */
        private boolean m24711a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f18642c.hasFocus() && !getVisibility()) {
                this.f18643d = true;
                if (SearchView.m16494a(getContext())) {
                    SearchView.f13811i.m3320a(this, true);
                }
            }
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f18642c.m16523i();
        }

        public boolean enoughToFilter() {
            if (this.f18641b > 0) {
                if (!super.enoughToFilter()) {
                    return false;
                }
            }
            return true;
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    i = getKeyDispatcherState();
                    if (i != 0) {
                        i.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f18642c.clearFocus();
                        setImeVisibility(0);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
            }
            return 192;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            editorInfo = super.onCreateInputConnection(editorInfo);
            if (this.f18643d) {
                removeCallbacks(this.f18640a);
                post(this.f18640a);
            }
            return editorInfo;
        }

        /* renamed from: b */
        private void m24713b() {
            if (this.f18643d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f18643d = false;
            }
        }

        private void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f18643d = false;
                removeCallbacks(this.f18640a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f18643d = false;
                removeCallbacks(this.f18640a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f18643d = true;
            }
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13849p = new Rect();
        this.f13850q = new Rect();
        this.f13851r = new int[2];
        this.f13852s = new int[2];
        this.f13829R = new C08041(this);
        this.f13830S = new C08063(this);
        this.f13831T = new WeakHashMap();
        this.f13832U = new C08096(this);
        this.f13843j = new C08107(this);
        this.f13833V = new C08118(this);
        this.f13834W = new C08129(this);
        this.aa = new OnItemSelectedListener(this) {
            /* renamed from: a */
            final /* synthetic */ SearchView f2603a;

            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            {
                this.f2603a = r1;
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                this.f2603a.m16512a(i);
            }
        };
        this.ab = new C08052(this);
        attributeSet = ay.m3543a(context, attributeSet, C0636j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(attributeSet.m3560g(C0636j.SearchView_layout, C0633g.abc_search_view), this, true);
        this.f13835a = (SearchAutoComplete) findViewById(C0632f.search_src_text);
        this.f13835a.setSearchView(this);
        this.f13844k = findViewById(C0632f.search_edit_frame);
        this.f13845l = findViewById(C0632f.search_plate);
        this.f13846m = findViewById(C0632f.submit_area);
        this.f13836b = (ImageView) findViewById(C0632f.search_button);
        this.f13837c = (ImageView) findViewById(C0632f.search_go_btn);
        this.f13838d = (ImageView) findViewById(C0632f.search_close_btn);
        this.f13839e = (ImageView) findViewById(C0632f.search_voice_btn);
        this.f13853t = (ImageView) findViewById(C0632f.search_mag_icon);
        C0560r.m2174a(this.f13845l, attributeSet.m3547a(C0636j.SearchView_queryBackground));
        C0560r.m2174a(this.f13846m, attributeSet.m3547a(C0636j.SearchView_submitBackground));
        this.f13836b.setImageDrawable(attributeSet.m3547a(C0636j.SearchView_searchIcon));
        this.f13837c.setImageDrawable(attributeSet.m3547a(C0636j.SearchView_goIcon));
        this.f13838d.setImageDrawable(attributeSet.m3547a(C0636j.SearchView_closeIcon));
        this.f13839e.setImageDrawable(attributeSet.m3547a(C0636j.SearchView_voiceIcon));
        this.f13853t.setImageDrawable(attributeSet.m3547a(C0636j.SearchView_searchIcon));
        this.f13854u = attributeSet.m3547a(C0636j.SearchView_searchHintIcon);
        ba.m3562a(this.f13836b, getResources().getString(C0634h.abc_searchview_description_search));
        this.f13855v = attributeSet.m3560g(C0636j.SearchView_suggestionRowLayout, C0633g.abc_search_dropdown_item_icons_2line);
        this.f13856w = attributeSet.m3560g(C0636j.SearchView_commitIcon, 0);
        this.f13836b.setOnClickListener(this.f13832U);
        this.f13838d.setOnClickListener(this.f13832U);
        this.f13837c.setOnClickListener(this.f13832U);
        this.f13839e.setOnClickListener(this.f13832U);
        this.f13835a.setOnClickListener(this.f13832U);
        this.f13835a.addTextChangedListener(this.ab);
        this.f13835a.setOnEditorActionListener(this.f13833V);
        this.f13835a.setOnItemClickListener(this.f13834W);
        this.f13835a.setOnItemSelectedListener(this.aa);
        this.f13835a.setOnKeyListener(this.f13843j);
        this.f13835a.setOnFocusChangeListener(new C08074(this));
        setIconifiedByDefault(attributeSet.m3549a(C0636j.SearchView_iconifiedByDefault, true));
        context = attributeSet.m3556e(C0636j.SearchView_android_maxWidth, -1);
        if (context != -1) {
            setMaxWidth(context);
        }
        this.f13859z = attributeSet.m3553c(C0636j.SearchView_defaultQueryHint);
        this.f13819H = attributeSet.m3553c(C0636j.SearchView_queryHint);
        context = attributeSet.m3545a(C0636j.SearchView_android_imeOptions, -1);
        if (context != -1) {
            setImeOptions(context);
        }
        context = attributeSet.m3545a(C0636j.SearchView_android_inputType, -1);
        if (context != -1) {
            setInputType(context);
        }
        setFocusable(attributeSet.m3549a(C0636j.SearchView_android_focusable, true));
        attributeSet.m3548a();
        this.f13857x = new Intent("android.speech.action.WEB_SEARCH");
        this.f13857x.addFlags(268435456);
        this.f13857x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f13858y = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f13858y.addFlags(268435456);
        this.f13847n = findViewById(this.f13835a.getDropDownAnchor());
        if (this.f13847n != null) {
            this.f13847n.addOnLayoutChangeListener(new C08085(this));
        }
        m16493a(this.f13816E);
        m16506r();
    }

    int getSuggestionRowLayout() {
        return this.f13855v;
    }

    int getSuggestionCommitIconResId() {
        return this.f13856w;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f13842h = searchableInfo;
        if (this.f13842h != null) {
            m16507s();
            m16506r();
        }
        this.f13823L = m16501m();
        if (this.f13823L != null) {
            this.f13835a.setPrivateImeOptions("nm");
        }
        m16493a(m16517c());
    }

    public void setAppSearchData(Bundle bundle) {
        this.f13828Q = bundle;
    }

    public void setImeOptions(int i) {
        this.f13835a.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.f13835a.getImeOptions();
    }

    public void setInputType(int i) {
        this.f13835a.setInputType(i);
    }

    public int getInputType() {
        return this.f13835a.getInputType();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f13821J || !isFocusable()) {
            return false;
        }
        if (m16517c()) {
            return super.requestFocus(i, rect);
        }
        i = this.f13835a.requestFocus(i, rect);
        if (i != 0) {
            m16493a(false);
        }
        return i;
    }

    public void clearFocus() {
        this.f13821J = true;
        super.clearFocus();
        this.f13835a.clearFocus();
        this.f13835a.setImeVisibility(false);
        this.f13821J = false;
    }

    public void setOnQueryTextListener(C0817c c0817c) {
        this.f13812A = c0817c;
    }

    public void setOnCloseListener(C0816b c0816b) {
        this.f13813B = c0816b;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f13840f = onFocusChangeListener;
    }

    public void setOnSuggestionListener(C0818d c0818d) {
        this.f13814C = c0818d;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f13815D = onClickListener;
    }

    public CharSequence getQuery() {
        return this.f13835a.getText();
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.f13835a.setText(charSequence);
        if (charSequence != null) {
            this.f13835a.setSelection(this.f13835a.length());
            this.f13825N = charSequence;
        }
        if (z && TextUtils.isEmpty(charSequence) == null) {
            m16519e();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f13819H = charSequence;
        m16506r();
    }

    public CharSequence getQueryHint() {
        if (this.f13819H != null) {
            return this.f13819H;
        }
        if (this.f13842h == null || this.f13842h.getHintId() == 0) {
            return this.f13859z;
        }
        return getContext().getText(this.f13842h.getHintId());
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f13816E != z) {
            this.f13816E = z;
            m16493a(z);
            m16506r();
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            m16520f();
        } else {
            m16521g();
        }
    }

    /* renamed from: c */
    public boolean m16517c() {
        return this.f13817F;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f13818G = z;
        m16493a(m16517c());
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f13820I = z;
        if (this.f13841g instanceof as) {
            ((as) this.f13841g).m27681a(z ? true : true);
        }
    }

    public void setSuggestionsAdapter(C3182f c3182f) {
        this.f13841g = c3182f;
        this.f13835a.setAdapter(this.f13841g);
    }

    public C3182f getSuggestionsAdapter() {
        return this.f13841g;
    }

    public void setMaxWidth(int i) {
        this.f13822K = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f13822K;
    }

    protected void onMeasure(int i, int i2) {
        if (m16517c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            i = this.f13822K > 0 ? Math.min(this.f13822K, i) : Math.min(getPreferredWidth(), i);
        } else if (mode == 0) {
            i = this.f13822K > 0 ? this.f13822K : getPreferredWidth();
        } else if (mode == 1073741824) {
            if (this.f13822K > 0) {
                i = Math.min(this.f13822K, i);
            }
        }
        mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = Math.min(getPreferredHeight(), i2);
        } else if (mode == 0) {
            i2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m16492a(this.f13835a, this.f13849p);
            this.f13850q.set(this.f13849p.left, 0, this.f13849p.right, i4 - i2);
            if (this.f13848o) {
                this.f13848o.m3327a(this.f13850q, this.f13849p);
                return;
            }
            this.f13848o = new C0819e(this.f13850q, this.f13849p, this.f13835a);
            setTouchDelegate(this.f13848o);
        }
    }

    /* renamed from: a */
    private void m16492a(View view, Rect rect) {
        view.getLocationInWindow(this.f13851r);
        getLocationInWindow(this.f13852s);
        int i = this.f13851r[1] - this.f13852s[1];
        int i2 = this.f13851r[0] - this.f13852s[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0630d.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0630d.abc_search_view_preferred_height);
    }

    /* renamed from: a */
    private void m16493a(boolean z) {
        this.f13817F = z;
        int i = 8;
        boolean z2 = false;
        boolean isEmpty = TextUtils.isEmpty(this.f13835a.getText()) ^ true;
        this.f13836b.setVisibility(z ? 0 : 8);
        m16496b(isEmpty);
        this.f13844k.setVisibility(z ? true : false);
        if (this.f13853t.getDrawable()) {
            if (!this.f13816E) {
                i = 0;
            }
        }
        this.f13853t.setVisibility(i);
        m16504p();
        if (!isEmpty) {
            z2 = true;
        }
        m16499c(z2);
        m16503o();
    }

    /* renamed from: m */
    private boolean m16501m() {
        boolean z = false;
        if (this.f13842h != null && this.f13842h.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.f13842h.getVoiceSearchLaunchWebSearch()) {
                intent = this.f13857x;
            } else if (this.f13842h.getVoiceSearchLaunchRecognizer()) {
                intent = this.f13858y;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m16502n() {
        return (this.f13818G || this.f13823L) && !m16517c();
    }

    /* renamed from: b */
    private void m16496b(boolean z) {
        z = (this.f13818G && m16502n() && hasFocus() && (z || !this.f13823L)) ? false : true;
        this.f13837c.setVisibility(z);
    }

    /* renamed from: o */
    private void m16503o() {
        int i = (m16502n() && (this.f13837c.getVisibility() == 0 || this.f13839e.getVisibility() == 0)) ? 0 : 8;
        this.f13846m.setVisibility(i);
    }

    /* renamed from: p */
    private void m16504p() {
        int i = 1;
        int isEmpty = TextUtils.isEmpty(this.f13835a.getText()) ^ 1;
        int i2 = 0;
        if (isEmpty == 0) {
            if (!this.f13816E || this.f13826O) {
                i = 0;
            }
        }
        ImageView imageView = this.f13838d;
        if (i == 0) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.f13838d.getDrawable();
        if (drawable != null) {
            drawable.setState(isEmpty != 0 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: q */
    private void m16505q() {
        post(this.f13829R);
    }

    /* renamed from: d */
    void m16518d() {
        int[] iArr = this.f13835a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f13845l.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        background = this.f13846m.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        invalidate();
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.f13829R);
        post(this.f13830S);
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    void m16511a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    boolean m16514a(View view, int i, KeyEvent keyEvent) {
        if (!(this.f13842h == null || this.f13841g == null || keyEvent.getAction() != null || keyEvent.hasNoModifiers() == null)) {
            if (!(i == 66 || i == 84)) {
                if (i != 61) {
                    if (i != 21) {
                        if (i != 22) {
                            if (i != 19 || this.f13835a.getListSelection() == null) {
                                return false;
                            }
                        }
                    }
                    if (i == 21) {
                        view = null;
                    } else {
                        view = this.f13835a.length();
                    }
                    this.f13835a.setSelection(view);
                    this.f13835a.setListSelection(0);
                    this.f13835a.clearListSelection();
                    f13811i.m3320a(this.f13835a, true);
                    return true;
                }
            }
            return m16513a(this.f13835a.getListSelection(), 0, null);
        }
        return false;
    }

    /* renamed from: c */
    private CharSequence m16498c(CharSequence charSequence) {
        if (this.f13816E) {
            if (this.f13854u != null) {
                double textSize = (double) this.f13835a.getTextSize();
                Double.isNaN(textSize);
                int i = (int) (textSize * 1.25d);
                this.f13854u.setBounds(0, 0, i, i);
                CharSequence spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(this.f13854u), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    /* renamed from: r */
    private void m16506r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f13835a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m16498c(queryHint));
    }

    /* renamed from: s */
    private void m16507s() {
        this.f13835a.setThreshold(this.f13842h.getSuggestThreshold());
        this.f13835a.setImeOptions(this.f13842h.getImeOptions());
        int inputType = this.f13842h.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f13842h.getSuggestAuthority() != null) {
                inputType = (inputType | 65536) | 524288;
            }
        }
        this.f13835a.setInputType(inputType);
        if (this.f13841g != null) {
            this.f13841g.mo474a(null);
        }
        if (this.f13842h.getSuggestAuthority() != null) {
            this.f13841g = new as(getContext(), this, this.f13842h, this.f13831T);
            this.f13835a.setAdapter(this.f13841g);
            as asVar = (as) this.f13841g;
            if (this.f13820I) {
                i = 2;
            }
            asVar.m27681a(i);
        }
    }

    /* renamed from: c */
    private void m16499c(boolean z) {
        if (this.f13823L && !m16517c() && z) {
            z = false;
            this.f13837c.setVisibility(8);
        } else {
            z = true;
        }
        this.f13839e.setVisibility(z);
    }

    /* renamed from: b */
    void m16516b(CharSequence charSequence) {
        CharSequence text = this.f13835a.getText();
        this.f13825N = text;
        boolean z = true;
        boolean isEmpty = TextUtils.isEmpty(text) ^ true;
        m16496b(isEmpty);
        if (isEmpty) {
            z = false;
        }
        m16499c(z);
        m16504p();
        m16503o();
        if (!(this.f13812A == null || TextUtils.equals(charSequence, this.f13824M))) {
            this.f13812A.m3324b(charSequence.toString());
        }
        this.f13824M = charSequence.toString();
    }

    /* renamed from: e */
    void m16519e() {
        CharSequence text = this.f13835a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f13812A == null || !this.f13812A.m3323a(text.toString())) {
                if (this.f13842h != null) {
                    m16510a(0, null, text.toString());
                }
                this.f13835a.setImeVisibility(false);
                m16508t();
            }
        }
    }

    /* renamed from: t */
    private void m16508t() {
        this.f13835a.dismissDropDown();
    }

    /* renamed from: f */
    void m16520f() {
        if (!TextUtils.isEmpty(this.f13835a.getText())) {
            this.f13835a.setText("");
            this.f13835a.requestFocus();
            this.f13835a.setImeVisibility(true);
        } else if (!this.f13816E) {
        } else {
            if (this.f13813B == null || !this.f13813B.m3322a()) {
                clearFocus();
                m16493a(true);
            }
        }
    }

    /* renamed from: g */
    void m16521g() {
        m16493a(false);
        this.f13835a.requestFocus();
        this.f13835a.setImeVisibility(true);
        if (this.f13815D != null) {
            this.f13815D.onClick(this);
        }
    }

    /* renamed from: h */
    void m16522h() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f13842h;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r2.f13842h;
        r1 = r0.getVoiceSearchLaunchWebSearch();	 Catch:{ ActivityNotFoundException -> 0x002f }
        if (r1 == 0) goto L_0x001b;	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x000d:
        r1 = r2.f13857x;	 Catch:{ ActivityNotFoundException -> 0x002f }
        r0 = r2.m16488a(r1, r0);	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1 = r2.getContext();	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x002f }
        goto L_0x0036;	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x001b:
        r1 = r0.getVoiceSearchLaunchRecognizer();	 Catch:{ ActivityNotFoundException -> 0x002f }
        if (r1 == 0) goto L_0x0036;	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x0021:
        r1 = r2.f13858y;	 Catch:{ ActivityNotFoundException -> 0x002f }
        r0 = r2.m16495b(r1, r0);	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1 = r2.getContext();	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x002f }
        goto L_0x0036;
    L_0x002f:
        r0 = "SearchView";
        r1 = "Could not find voice search activity";
        android.util.Log.w(r0, r1);
    L_0x0036:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.h():void");
    }

    /* renamed from: i */
    void m16523i() {
        m16493a(m16517c());
        m16505q();
        if (this.f13835a.hasFocus()) {
            m16525l();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m16505q();
    }

    /* renamed from: b */
    public void mo615b() {
        setQuery("", false);
        clearFocus();
        m16493a(true);
        this.f13835a.setImeOptions(this.f13827P);
        this.f13826O = false;
    }

    /* renamed from: a */
    public void mo614a() {
        if (!this.f13826O) {
            this.f13826O = true;
            this.f13827P = this.f13835a.getImeOptions();
            this.f13835a.setImeOptions(this.f13827P | 33554432);
            this.f13835a.setText("");
            setIconified(false);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13810a = m16517c();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            m16493a(savedState.f13810a);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* renamed from: k */
    void m16524k() {
        if (this.f13847n.getWidth() > 1) {
            int i;
            Resources resources = getContext().getResources();
            int paddingLeft = this.f13845l.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = bg.m3615a(this);
            int dimensionPixelSize = this.f13816E ? resources.getDimensionPixelSize(C0630d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0630d.abc_dropdownitem_text_padding_left) : 0;
            this.f13835a.getDropDownBackground().getPadding(rect);
            if (a) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f13835a.setDropDownHorizontalOffset(i);
            this.f13835a.setDropDownWidth((((this.f13847n.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: a */
    boolean m16513a(int i, int i2, String str) {
        if (this.f13814C != 0) {
            if (this.f13814C.m3326b(i) != 0) {
                return false;
            }
        }
        m16497b(i, 0, 0);
        this.f13835a.setImeVisibility(false);
        m16508t();
        return true;
    }

    /* renamed from: a */
    boolean m16512a(int i) {
        if (this.f13814C != null) {
            if (this.f13814C.m3325a(i)) {
                return false;
            }
        }
        m16500e(i);
        return true;
    }

    /* renamed from: e */
    private void m16500e(int i) {
        CharSequence text = this.f13835a.getText();
        Cursor a = this.f13841g.mo472a();
        if (a != null) {
            if (a.moveToPosition(i) != 0) {
                i = this.f13841g.mo475c(a);
                if (i != 0) {
                    setQuery(i);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: b */
    private boolean m16497b(int i, int i2, String str) {
        Cursor a = this.f13841g.mo472a();
        if (a == null || a.moveToPosition(i) == 0) {
            return false;
        }
        m16491a(m16489a(a, i2, str));
        return true;
    }

    /* renamed from: a */
    private void m16491a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed launch activity: ");
                stringBuilder.append(intent);
                Log.e("SearchView", stringBuilder.toString(), e);
            }
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f13835a.setText(charSequence);
        this.f13835a.setSelection(TextUtils.isEmpty(charSequence) ? null : charSequence.length());
    }

    /* renamed from: a */
    void m16510a(int i, String str, String str2) {
        getContext().startActivity(m16490a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: a */
    private Intent m16490a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f13825N);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f13828Q != null) {
            intent.putExtra("app_data", this.f13828Q);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f13842h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private Intent m16488a(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        intent = searchableInfo.getSearchActivity();
        searchableInfo = "calling_package";
        if (intent == null) {
            intent = null;
        } else {
            intent = intent.flattenToShortString();
        }
        intent2.putExtra(searchableInfo, intent);
        return intent2;
    }

    /* renamed from: b */
    private Intent m16495b(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        Parcelable activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.f13828Q != null) {
            bundle.putParcelable("app_data", this.f13828Q);
        }
        Intent intent3 = new Intent(intent);
        intent = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            intent = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String str = null;
        String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", intent);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        intent = "calling_package";
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra(intent, str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private android.content.Intent m16489a(android.database.Cursor r9, int r10, java.lang.String r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r8 = this;
        r0 = 0;
        r1 = "suggest_intent_action";	 Catch:{ RuntimeException -> 0x0061 }
        r1 = android.support.v7.widget.as.m27665a(r9, r1);	 Catch:{ RuntimeException -> 0x0061 }
        if (r1 != 0) goto L_0x000f;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0009:
        r1 = r8.f13842h;	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r1.getSuggestIntentAction();	 Catch:{ RuntimeException -> 0x0061 }
    L_0x000f:
        if (r1 != 0) goto L_0x0013;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0011:
        r1 = "android.intent.action.SEARCH";	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0013:
        r2 = r1;	 Catch:{ RuntimeException -> 0x0061 }
        r1 = "suggest_intent_data";	 Catch:{ RuntimeException -> 0x0061 }
        r1 = android.support.v7.widget.as.m27665a(r9, r1);	 Catch:{ RuntimeException -> 0x0061 }
        if (r1 != 0) goto L_0x0022;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x001c:
        r1 = r8.f13842h;	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r1.getSuggestIntentData();	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0022:
        if (r1 == 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0024:
        r3 = "suggest_intent_data_id";	 Catch:{ RuntimeException -> 0x0061 }
        r3 = android.support.v7.widget.as.m27665a(r9, r3);	 Catch:{ RuntimeException -> 0x0061 }
        if (r3 == 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x002c:
        r4 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0061 }
        r4.<init>();	 Catch:{ RuntimeException -> 0x0061 }
        r4.append(r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = "/";	 Catch:{ RuntimeException -> 0x0061 }
        r4.append(r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = android.net.Uri.encode(r3);	 Catch:{ RuntimeException -> 0x0061 }
        r4.append(r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r4.toString();	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0044:
        if (r1 != 0) goto L_0x0048;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0046:
        r3 = r0;	 Catch:{ RuntimeException -> 0x0061 }
        goto L_0x004d;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0048:
        r1 = android.net.Uri.parse(r1);	 Catch:{ RuntimeException -> 0x0061 }
        r3 = r1;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x004d:
        r1 = "suggest_intent_query";	 Catch:{ RuntimeException -> 0x0061 }
        r5 = android.support.v7.widget.as.m27665a(r9, r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = "suggest_intent_extra_data";	 Catch:{ RuntimeException -> 0x0061 }
        r4 = android.support.v7.widget.as.m27665a(r9, r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r8;	 Catch:{ RuntimeException -> 0x0061 }
        r6 = r10;	 Catch:{ RuntimeException -> 0x0061 }
        r7 = r11;	 Catch:{ RuntimeException -> 0x0061 }
        r10 = r1.m16490a(r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0061 }
        return r10;
    L_0x0061:
        r10 = move-exception;
        r9 = r9.getPosition();	 Catch:{ RuntimeException -> 0x0067 }
        goto L_0x0068;
    L_0x0067:
        r9 = -1;
    L_0x0068:
        r11 = "SearchView";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Search suggestions cursor at row ";
        r1.append(r2);
        r1.append(r9);
        r9 = " returned exception.";
        r1.append(r9);
        r9 = r1.toString();
        android.util.Log.w(r11, r9, r10);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    /* renamed from: l */
    void m16525l() {
        f13811i.m3319a(this.f13835a);
        f13811i.m3321b(this.f13835a);
    }

    /* renamed from: a */
    static boolean m16494a(Context context) {
        return context.getResources().getConfiguration().orientation == 2 ? true : null;
    }
}
