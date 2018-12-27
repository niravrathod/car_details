package com.google.ads.mediation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
public class MediationServerParameters {

    public static final class MappingException extends Exception {
        public MappingException(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameter {
        String name();

        boolean required() default true;
    }

    public void load(java.util.Map<java.lang.String, java.lang.String> r7) {
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
        r6 = this;
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = r6.getClass();
        r1 = r1.getFields();
        r2 = r1.length;
        r3 = 0;
    L_0x000f:
        if (r3 >= r2) goto L_0x0027;
    L_0x0011:
        r4 = r1[r3];
        r5 = com.google.ads.mediation.MediationServerParameters.Parameter.class;
        r5 = r4.getAnnotation(r5);
        r5 = (com.google.ads.mediation.MediationServerParameters.Parameter) r5;
        if (r5 == 0) goto L_0x0024;
    L_0x001d:
        r5 = r5.name();
        r0.put(r5, r4);
    L_0x0024:
        r3 = r3 + 1;
        goto L_0x000f;
    L_0x0027:
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x0032;
    L_0x002d:
        r1 = "No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
    L_0x0032:
        r7 = r7.entrySet();
        r7 = r7.iterator();
    L_0x003a:
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x00f0;
    L_0x0040:
        r1 = r7.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getKey();
        r2 = r0.remove(r2);
        r2 = (java.lang.reflect.Field) r2;
        if (r2 == 0) goto L_0x00ae;
    L_0x0052:
        r3 = r1.getValue();	 Catch:{ IllegalAccessException -> 0x0084, IllegalArgumentException -> 0x005a }
        r2.set(r6, r3);	 Catch:{ IllegalAccessException -> 0x0084, IllegalArgumentException -> 0x005a }
        goto L_0x003a;
    L_0x005a:
        r1 = r1.getKey();
        r1 = (java.lang.String) r1;
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 43;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Server option \"";
        r3.append(r2);
        r3.append(r1);
        r1 = "\" could not be set: Bad Type";
        r3.append(r1);
        r1 = r3.toString();
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
        goto L_0x003a;
    L_0x0084:
        r1 = r1.getKey();
        r1 = (java.lang.String) r1;
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 49;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Server option \"";
        r3.append(r2);
        r3.append(r1);
        r1 = "\" could not be set: Illegal Access";
        r3.append(r1);
        r1 = r3.toString();
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
        goto L_0x003a;
    L_0x00ae:
        r2 = r1.getKey();
        r2 = (java.lang.String) r2;
        r1 = r1.getValue();
        r1 = (java.lang.String) r1;
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 31;
        r4 = java.lang.String.valueOf(r1);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "Unexpected server option: ";
        r4.append(r3);
        r4.append(r2);
        r2 = " = \"";
        r4.append(r2);
        r4.append(r1);
        r1 = "\"";
        r4.append(r1);
        r1 = r4.toString();
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);
        goto L_0x003a;
    L_0x00f0:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r0 = r0.values();
        r0 = r0.iterator();
    L_0x00fd:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0158;
    L_0x0103:
        r1 = r0.next();
        r1 = (java.lang.reflect.Field) r1;
        r2 = com.google.ads.mediation.MediationServerParameters.Parameter.class;
        r2 = r1.getAnnotation(r2);
        r2 = (com.google.ads.mediation.MediationServerParameters.Parameter) r2;
        r2 = r2.required();
        if (r2 == 0) goto L_0x00fd;
    L_0x0117:
        r2 = "Required server option missing: ";
        r3 = com.google.ads.mediation.MediationServerParameters.Parameter.class;
        r3 = r1.getAnnotation(r3);
        r3 = (com.google.ads.mediation.MediationServerParameters.Parameter) r3;
        r3 = r3.name();
        r3 = java.lang.String.valueOf(r3);
        r4 = r3.length();
        if (r4 == 0) goto L_0x0134;
    L_0x012f:
        r2 = r2.concat(r3);
        goto L_0x013a;
    L_0x0134:
        r3 = new java.lang.String;
        r3.<init>(r2);
        r2 = r3;
    L_0x013a:
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);
        r2 = r7.length();
        if (r2 <= 0) goto L_0x0148;
    L_0x0143:
        r2 = ", ";
        r7.append(r2);
    L_0x0148:
        r2 = com.google.ads.mediation.MediationServerParameters.Parameter.class;
        r1 = r1.getAnnotation(r2);
        r1 = (com.google.ads.mediation.MediationServerParameters.Parameter) r1;
        r1 = r1.name();
        r7.append(r1);
        goto L_0x00fd;
    L_0x0158:
        r0 = r7.length();
        if (r0 <= 0) goto L_0x017e;
    L_0x015e:
        r0 = new com.google.ads.mediation.MediationServerParameters$MappingException;
        r1 = "Required server option(s) missing: ";
        r7 = r7.toString();
        r7 = java.lang.String.valueOf(r7);
        r2 = r7.length();
        if (r2 == 0) goto L_0x0175;
    L_0x0170:
        r7 = r1.concat(r7);
        goto L_0x017a;
    L_0x0175:
        r7 = new java.lang.String;
        r7.<init>(r1);
    L_0x017a:
        r0.<init>(r7);
        throw r0;
    L_0x017e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.MediationServerParameters.load(java.util.Map):void");
    }
}
