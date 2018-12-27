package com.cuvora.carinfo.models;

import com.google.gson.p141b.C2624a;

public class RateUsModel {
    private String affirmativeButtonTitle;
    private String message;
    private String negativeButtonTitle;
    private boolean showLotte;
    private String title;

    /* renamed from: com.cuvora.carinfo.models.RateUsModel$1 */
    static class C37111 extends C2624a<RateUsModel> {
        C37111() {
        }
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public boolean isShowLotte() {
        return this.showLotte;
    }

    public void setShowLotte(boolean z) {
        this.showLotte = z;
    }

    public String getAffirmativeButtonTitle() {
        return this.affirmativeButtonTitle;
    }

    public void setAffirmativeButtonTitle(String str) {
        this.affirmativeButtonTitle = str;
    }

    public String getNegativeButtonTitle() {
        return this.negativeButtonTitle;
    }

    public void setNegativeButtonTitle(String str) {
        this.negativeButtonTitle = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClassPojo [message = ");
        stringBuilder.append(this.message);
        stringBuilder.append(", title = ");
        stringBuilder.append(this.title);
        stringBuilder.append(", showLotte = ");
        stringBuilder.append(this.showLotte);
        stringBuilder.append(", affirmativeButtonTitle = ");
        stringBuilder.append(this.affirmativeButtonTitle);
        stringBuilder.append(", negativeButtonTitle = ");
        stringBuilder.append(this.negativeButtonTitle);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static com.cuvora.carinfo.models.RateUsModel fromFirebase(java.lang.String r1) {
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
        r1 = new com.cuvora.carinfo.models.RateUsModel$1;	 Catch:{ Exception -> 0x0012 }
        r1.<init>();	 Catch:{ Exception -> 0x0012 }
        r1 = r1.getType();	 Catch:{ Exception -> 0x0012 }
        r0 = "rateUsOption";	 Catch:{ Exception -> 0x0012 }
        r1 = com.cuvora.carinfo.helpers.C1541e.m5851a(r1, r0);	 Catch:{ Exception -> 0x0012 }
        r1 = (com.cuvora.carinfo.models.RateUsModel) r1;	 Catch:{ Exception -> 0x0012 }
        return r1;
    L_0x0012:
        r1 = new com.cuvora.carinfo.models.RateUsModel;
        r1.<init>();
        r0 = 1;
        r1.setShowLotte(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.models.RateUsModel.fromFirebase(java.lang.String):com.cuvora.carinfo.models.RateUsModel");
    }
}
