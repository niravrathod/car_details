package com.cuvora.carinfo.helpers;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.content.FileProvider;
import android.support.v7.app.C4455c;
import android.support.v7.app.C4455c.C0661a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.VehicleSearchResult;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.Branch.C2701b;
import io.branch.referral.C2734d;
import io.branch.referral.util.LinkProperties;
import java.io.File;

/* renamed from: com.cuvora.carinfo.helpers.p */
public class C1561p {
    /* renamed from: a */
    public static String f4704a = "com.whatsapp";
    /* renamed from: b */
    private static String f4705b;

    /* renamed from: a */
    public static void m5940a(final Context context, VehicleSearchResult vehicleSearchResult, final boolean z) {
        String str = "carinfo://searchNumber/";
        String imageUrl = vehicleSearchResult != null ? vehicleSearchResult.getImageUrl() : "";
        String vehicleNum = vehicleSearchResult != null ? vehicleSearchResult.getVehicleNum() : "";
        f4705b = vehicleSearchResult != null ? vehicleSearchResult.getShareText() : "";
        if (C1562q.m5947b(f4705b)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Checkout details of vehicle number ");
            stringBuilder.append(vehicleNum);
            stringBuilder.append("(owned by ");
            stringBuilder.append(vehicleSearchResult.getDisplayName());
            stringBuilder.append(") using India's #1 RTO information app - Car Info by Cuvora");
            f4705b = stringBuilder.toString();
        }
        if (C1547j.m5914d(context) == null) {
            vehicleSearchResult = new StringBuilder();
            vehicleSearchResult.append(f4705b);
            vehicleSearchResult.append("\nhttps://carinfo.app.link/LQAj39XkiK");
            C1561p.m5944b(context, vehicleSearchResult.toString());
            return;
        }
        vehicleSearchResult = new BranchUniversalObject();
        if (imageUrl == null) {
            imageUrl = "";
        }
        vehicleSearchResult = vehicleSearchResult.m13030d(imageUrl).m13026b("CarInfo").m13028c("India's #1 RTO Detail App");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(vehicleNum);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(vehicleNum);
        vehicleSearchResult.m13022a(context, new LinkProperties().m13442a("sharing").m13445b("android").m13443a("$deeplink_path", stringBuilder2.toString()).m13443a("deeplink", stringBuilder2.toString()), new C2701b() {
            /* renamed from: a */
            public void mo1226a(String str, C2734d c2734d) {
                if (c2734d == null) {
                    StringBuilder stringBuilder;
                    if (z != null) {
                        c2734d = context;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(C1561p.f4705b);
                        stringBuilder.append("\n");
                        stringBuilder.append(str);
                        C1561p.m5945b(c2734d, stringBuilder.toString(), false);
                    } else {
                        c2734d = context;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(C1561p.f4705b);
                        stringBuilder.append("\n");
                        stringBuilder.append(str);
                        C1561p.m5944b(c2734d, stringBuilder.toString());
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m5941a(final Context context, final String str, final boolean z) {
        if (C1547j.m5914d(context)) {
            new BranchUniversalObject().m13026b("CarInfo").m13028c("India's #1 RTO Detail App").m13022a(context, new LinkProperties().m13442a("sharing").m13445b("android"), new C2701b() {
                /* renamed from: a */
                public void mo1226a(String str, C2734d c2734d) {
                    if (c2734d == null) {
                        StringBuilder stringBuilder;
                        if (z != null) {
                            c2734d = context;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append("\n");
                            stringBuilder.append(str);
                            C1561p.m5945b(c2734d, stringBuilder.toString(), false);
                        } else {
                            c2734d = context;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append("\n");
                            stringBuilder.append(str);
                            C1561p.m5944b(c2734d, stringBuilder.toString());
                        }
                    }
                }
            });
            return;
        }
        z = new StringBuilder();
        z.append(str);
        z.append("\nhttps://carinfo.app.link/LQAj39XkiK");
        C1561p.m5944b(context, z.toString());
    }

    /* renamed from: a */
    public static void m5939a(final Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_share_chooser, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.whatsapp_share_ll);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.bluetooth_share_ll);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.other_share_ll);
        C0661a c0661a = new C0661a(context);
        c0661a.m2642b(inflate);
        final C4455c b = c0661a.m2645b();
        linearLayout.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1561p.m5945b(context, C1541e.m5852a("shareText"), true);
                b.dismiss();
            }
        });
        linearLayout2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1561p.m5943b(context);
                b.dismiss();
            }
        });
        linearLayout3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1561p.m5944b(context, C1541e.m5852a("shareText"));
                b.dismiss();
            }
        });
        b.show();
    }

    /* renamed from: b */
    public static void m5945b(Context context, String str, boolean z) {
        C1540d.m5823d();
        String str2 = "com.whatsapp";
        PackageManager packageManager = context.getPackageManager();
        if (C1561p.m5942a(context, str2)) {
            z = new Intent("android.intent.action.SEND");
            z.setType("text/plain");
            z.setPackage(str2);
            z.putExtra("android.intent.extra.TEXT", str);
            z.addFlags(268435456);
            if (z.resolveActivity(packageManager) != null) {
                context.startActivity(z);
                return;
            }
            return;
        }
        if (z) {
            C1570t.m5985a(context, "WhatsApp not installed");
        }
        C1561p.m5944b(context, str);
    }

    /* renamed from: a */
    public static boolean m5942a(android.content.Context r1, java.lang.String r2) {
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
        r1 = r1.getPackageManager();
        r0 = 1;
        r1.getPackageInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x0009 }
        goto L_0x000a;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.p.a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static void m5943b(Context context) {
        C1540d.m5821c();
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            C1570t.m5985a(context, "Device doesn't support bluetooth");
            return;
        }
        String str = context.getApplicationInfo().sourceDir;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(268435456);
        intent.setPackage("com.android.bluetooth");
        intent.setType("*/*");
        if (VERSION.SDK_INT >= 24) {
            intent.putExtra("android.intent.extra.STREAM", FileProvider.m1379a(context, "com.cuvora.carinfo.fileprovider", new File(str)));
        } else {
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str)));
        }
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    /* renamed from: b */
    public static void m5944b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", C1541e.m5852a("shareTextSubject"));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Context context2) {
            context2.printStackTrace();
        }
    }
}
