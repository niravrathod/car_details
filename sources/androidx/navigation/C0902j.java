package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.C0904k.C0903a;
import androidx.navigation.C0913o.C0912b;
import com.j256.ormlite.stmt.query.SimpleComparison;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.navigation.j */
public class C0902j {
    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3065a = new ThreadLocal();
    /* renamed from: b */
    private Context f3066b;
    /* renamed from: c */
    private C0910n f3067c;

    public C0902j(Context context, C0910n c0910n) {
        this.f3066b = context;
        this.f3067c = c0910n;
    }

    /* renamed from: a */
    public C3281h m3934a() {
        Bundle bundle = this.f3066b.getApplicationInfo().metaData;
        if (bundle != null) {
            int i = bundle.getInt("android.nav.graph");
            if (i != 0) {
                return m3935a(i);
            }
        }
        return null;
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: a */
    public C3281h m3935a(int i) {
        C0900g a;
        Resources resources = this.f3066b.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            int next;
            String name;
            try {
                next = xml.next();
                if (next == 2 || next == 1) {
                    if (next != 2) {
                        name = xml.getName();
                        a = m3929a(resources, xml, asAttributeSet);
                        if (a instanceof C3281h) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Root element <");
                            stringBuilder.append(name);
                            stringBuilder.append(SimpleComparison.GREATER_THAN_OPERATION);
                            stringBuilder.append(" did not inflate into a NavGraph");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        C3281h c3281h = (C3281h) a;
                        xml.close();
                        return c3281h;
                    }
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Exception inflating ");
                stringBuilder.append(resources.getResourceName(i));
                stringBuilder.append(" line ");
                stringBuilder.append(xml.getLineNumber());
                throw new RuntimeException(stringBuilder.toString(), e);
            } catch (Throwable th) {
                xml.close();
            }
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        name = xml.getName();
        a = m3929a(resources, xml, asAttributeSet);
        if (a instanceof C3281h) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Root element <");
            stringBuilder2.append(name);
            stringBuilder2.append(SimpleComparison.GREATER_THAN_OPERATION);
            stringBuilder2.append(" did not inflate into a NavGraph");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        C3281h c3281h2 = (C3281h) a;
        xml.close();
        return c3281h2;
    }

    /* renamed from: a */
    private C0900g m3929a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet) {
        C0900g c = this.f3067c.mo864a(xmlResourceParser.getName()).mo855c();
        c.mo852a(this.f3066b, attributeSet);
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2) {
                if (depth2 <= depth) {
                    String name = xmlResourceParser.getName();
                    if ("argument".equals(name)) {
                        m3931a(resources, c, attributeSet);
                    } else if ("deepLink".equals(name)) {
                        m3932b(resources, c, attributeSet);
                    } else if ("action".equals(name)) {
                        m3933c(resources, c, attributeSet);
                    } else if ("include".equals(name) && (c instanceof C3281h)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0912b.NavInclude);
                        ((C3281h) c).m16921a(m3935a(obtainAttributes.getResourceId(C0912b.NavInclude_graph, 0)));
                        obtainAttributes.recycle();
                    } else if (c instanceof C3281h) {
                        ((C3281h) c).m16921a(m3929a(resources, xmlResourceParser, attributeSet));
                    }
                }
            }
        }
        return c;
    }

    /* renamed from: a */
    private void m3931a(Resources resources, C0900g c0900g, AttributeSet attributeSet) {
        attributeSet = resources.obtainAttributes(attributeSet, C0912b.NavArgument);
        String string = attributeSet.getString(C0912b.NavArgument_android_name);
        TypedValue typedValue = (TypedValue) f3065a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f3065a.set(typedValue);
        }
        String string2 = attributeSet.getString(C0912b.NavArgument_argType);
        if (attributeSet.getValue(C0912b.NavArgument_android_defaultValue, typedValue)) {
            if ("string".equals(string2)) {
                c0900g.m3926g().putString(string, attributeSet.getString(C0912b.NavArgument_android_defaultValue));
            } else {
                int i = typedValue.type;
                boolean z = true;
                if (i != 1) {
                    switch (i) {
                        case 3:
                            String charSequence = typedValue.string.toString();
                            if (string2 == null) {
                                Long a = m3930a(charSequence);
                                if (a != null) {
                                    c0900g.m3926g().putLong(string, a.longValue());
                                    break;
                                }
                            } else if ("long".equals(string2)) {
                                resources = m3930a(charSequence);
                                if (resources != null) {
                                    c0900g.m3926g().putLong(string, resources.longValue());
                                    break;
                                }
                                c0900g = new StringBuilder();
                                c0900g.append("unsupported long value ");
                                c0900g.append(typedValue.string);
                                throw new XmlPullParserException(c0900g.toString());
                            }
                            c0900g.m3926g().putString(string, charSequence);
                            break;
                        case 4:
                            c0900g.m3926g().putFloat(string, typedValue.getFloat());
                            break;
                        case 5:
                            c0900g.m3926g().putInt(string, (int) typedValue.getDimension(resources.getDisplayMetrics()));
                            break;
                        default:
                            if (typedValue.type >= 16 && typedValue.type <= 31) {
                                if (typedValue.type != 18) {
                                    c0900g.m3926g().putInt(string, typedValue.data);
                                    break;
                                }
                                resources = c0900g.m3926g();
                                if (typedValue.data == null) {
                                    z = false;
                                }
                                resources.putBoolean(string, z);
                                break;
                            }
                            c0900g = new StringBuilder();
                            c0900g.append("unsupported argument type ");
                            c0900g.append(typedValue.type);
                            throw new XmlPullParserException(c0900g.toString());
                            break;
                    }
                }
                c0900g.m3926g().putInt(string, typedValue.data);
            }
        }
        attributeSet.recycle();
    }

    /* renamed from: a */
    private java.lang.Long m3930a(java.lang.String r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = "L";
        r0 = r5.endsWith(r0);
        r1 = 0;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r0 = 0;
        r2 = r5.length();	 Catch:{ NumberFormatException -> 0x0036 }
        r2 = r2 + -1;	 Catch:{ NumberFormatException -> 0x0036 }
        r5 = r5.substring(r0, r2);	 Catch:{ NumberFormatException -> 0x0036 }
        r0 = "0x";	 Catch:{ NumberFormatException -> 0x0036 }
        r0 = r5.startsWith(r0);	 Catch:{ NumberFormatException -> 0x0036 }
        if (r0 == 0) goto L_0x002d;	 Catch:{ NumberFormatException -> 0x0036 }
    L_0x001d:
        r0 = 2;	 Catch:{ NumberFormatException -> 0x0036 }
        r5 = r5.substring(r0);	 Catch:{ NumberFormatException -> 0x0036 }
        r0 = 16;	 Catch:{ NumberFormatException -> 0x0036 }
        r2 = java.lang.Long.parseLong(r5, r0);	 Catch:{ NumberFormatException -> 0x0036 }
        r5 = java.lang.Long.valueOf(r2);	 Catch:{ NumberFormatException -> 0x0036 }
        return r5;	 Catch:{ NumberFormatException -> 0x0036 }
    L_0x002d:
        r2 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x0036 }
        r5 = java.lang.Long.valueOf(r2);	 Catch:{ NumberFormatException -> 0x0036 }
        return r5;
    L_0x0036:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.j.a(java.lang.String):java.lang.Long");
    }

    /* renamed from: b */
    private void m3932b(Resources resources, C0900g c0900g, AttributeSet attributeSet) {
        resources = resources.obtainAttributes(attributeSet, C0912b.NavDeepLink);
        attributeSet = resources.getString(C0912b.NavDeepLink_uri);
        if (TextUtils.isEmpty(attributeSet)) {
            throw new IllegalArgumentException("Every <deepLink> must include an app:uri");
        }
        c0900g.m3922c(attributeSet.replace("${applicationId}", this.f3066b.getPackageName()));
        resources.recycle();
    }

    /* renamed from: c */
    private void m3933c(Resources resources, C0900g c0900g, AttributeSet attributeSet) {
        resources = resources.obtainAttributes(attributeSet, C0912b.NavAction);
        int resourceId = resources.getResourceId(C0912b.NavAction_android_id, 0);
        C0892c c0892c = new C0892c(resources.getResourceId(C0912b.NavAction_destination, 0));
        C0903a c0903a = new C0903a();
        c0903a.m3938a(resources.getBoolean(C0912b.NavAction_launchSingleTop, false));
        c0903a.m3941b(resources.getBoolean(C0912b.NavAction_launchDocument, false));
        c0903a.m3943c(resources.getBoolean(C0912b.NavAction_clearTask, false));
        c0903a.m3937a(resources.getResourceId(C0912b.NavAction_popUpTo, 0), resources.getBoolean(C0912b.NavAction_popUpToInclusive, false));
        c0903a.m3936a(resources.getResourceId(C0912b.NavAction_enterAnim, -1));
        c0903a.m3940b(resources.getResourceId(C0912b.NavAction_exitAnim, -1));
        c0903a.m3942c(resources.getResourceId(C0912b.NavAction_popEnterAnim, -1));
        c0903a.m3944d(resources.getResourceId(C0912b.NavAction_popExitAnim, -1));
        c0892c.m3882a(c0903a.m3939a());
        c0900g.m3914a(resourceId, c0892c);
        resources.recycle();
    }
}
