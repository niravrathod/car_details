package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.C0093b.C0092b;
import android.support.constraint.solver.widgets.C3024h;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {
    /* renamed from: a */
    protected int[] f149a;
    /* renamed from: b */
    protected int f150b;
    /* renamed from: c */
    protected Context f151c;
    /* renamed from: d */
    protected C3024h f152d;
    /* renamed from: e */
    protected boolean f153e;
    /* renamed from: f */
    private String f154f;

    /* renamed from: b */
    public void mo30b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void m199c(ConstraintLayout constraintLayout) {
    }

    public void onDraw(Canvas canvas) {
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.f149a = new int[32];
        this.f153e = false;
        this.f151c = context;
        mo28a((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149a = new int[32];
        this.f153e = false;
        this.f151c = context;
        mo28a(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f149a = new int[32];
        this.f153e = false;
        this.f151c = context;
        mo28a(attributeSet);
    }

    /* renamed from: a */
    protected void mo28a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            attributeSet = getContext().obtainStyledAttributes(attributeSet, C0092b.ConstraintLayout_Layout);
            int indexCount = attributeSet.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = attributeSet.getIndex(i);
                if (index == C0092b.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f154f = attributeSet.getString(index);
                    setIds(this.f154f);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f149a, this.f150b);
    }

    public void setReferencedIds(int[] iArr) {
        int i = 0;
        this.f150b = 0;
        while (i < iArr.length) {
            setTag(iArr[i], null);
            i++;
        }
    }

    public void setTag(int i, Object obj) {
        if (this.f150b + 1 > this.f149a.length) {
            this.f149a = Arrays.copyOf(this.f149a, this.f149a.length * 2);
        }
        this.f149a[this.f150b] = i;
        this.f150b++;
    }

    protected void onMeasure(int i, int i2) {
        if (this.f153e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: a */
    public void m195a() {
        if (this.f152d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).al = this.f152d;
            }
        }
    }

    /* renamed from: a */
    private void m194a(java.lang.String r6) {
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
        r5 = this;
        if (r6 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r5.f151c;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r6 = r6.trim();
        r0 = 0;
        r1 = 0;
        r2 = android.support.constraint.C0093b.C0091a.class;	 Catch:{ Exception -> 0x0019 }
        r2 = r2.getField(r6);	 Catch:{ Exception -> 0x0019 }
        r2 = r2.getInt(r0);	 Catch:{ Exception -> 0x0019 }
        goto L_0x001a;
    L_0x0019:
        r2 = 0;
    L_0x001a:
        if (r2 != 0) goto L_0x002e;
    L_0x001c:
        r2 = r5.f151c;
        r2 = r2.getResources();
        r3 = "id";
        r4 = r5.f151c;
        r4 = r4.getPackageName();
        r2 = r2.getIdentifier(r6, r3, r4);
    L_0x002e:
        if (r2 != 0) goto L_0x0054;
    L_0x0030:
        r3 = r5.isInEditMode();
        if (r3 == 0) goto L_0x0054;
    L_0x0036:
        r3 = r5.getParent();
        r3 = r3 instanceof android.support.constraint.ConstraintLayout;
        if (r3 == 0) goto L_0x0054;
    L_0x003e:
        r3 = r5.getParent();
        r3 = (android.support.constraint.ConstraintLayout) r3;
        r1 = r3.m213a(r1, r6);
        if (r1 == 0) goto L_0x0054;
    L_0x004a:
        r3 = r1 instanceof java.lang.Integer;
        if (r3 == 0) goto L_0x0054;
    L_0x004e:
        r1 = (java.lang.Integer) r1;
        r2 = r1.intValue();
    L_0x0054:
        if (r2 == 0) goto L_0x005a;
    L_0x0056:
        r5.setTag(r2, r0);
        goto L_0x0075;
    L_0x005a:
        r0 = "ConstraintHelper";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Could not find id of \"";
        r1.append(r2);
        r1.append(r6);
        r6 = "\"";
        r1.append(r6);
        r6 = r1.toString();
        android.util.Log.w(r0, r6);
    L_0x0075:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintHelper.a(java.lang.String):void");
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m194a(str.substring(i));
                    return;
                } else {
                    m194a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f154f);
        }
        if (this.f152d != null) {
            this.f152d.mo40J();
            for (int i = 0; i < this.f150b; i++) {
                View a = constraintLayout.m212a(this.f149a[i]);
                if (a != null) {
                    this.f152d.m14800b(constraintLayout.m211a(a));
                }
            }
        }
    }
}
