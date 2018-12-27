package com.facebook.ads.internal.p087f;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.facebook.ads.internal.p101q.p102a.C1932s;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.f.e */
public class C1795e {
    /* renamed from: a */
    private static final String f5420a = "com.facebook.ads.internal.f.e";
    /* renamed from: b */
    private static final Object f5421b = new Object();
    /* renamed from: c */
    private static final Set<String> f5422c = Collections.synchronizedSet(new HashSet());
    /* renamed from: d */
    private static final Map<String, Integer> f5423d = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static com.facebook.ads.internal.p087f.C1794d m6748a(java.lang.Exception r4, android.content.Context r5, java.util.Map<java.lang.String, java.lang.String> r6) {
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
        r0 = 0;
        r1 = new com.facebook.ads.internal.f.b;	 Catch:{ Exception -> 0x0020 }
        r4 = com.facebook.ads.internal.p101q.p102a.C1927q.m7305a(r4);	 Catch:{ Exception -> 0x0020 }
        r2 = 1;	 Catch:{ Exception -> 0x0020 }
        r1.<init>(r4, r6, r2);	 Catch:{ Exception -> 0x0020 }
        r4 = new com.facebook.ads.internal.f.d;	 Catch:{ Exception -> 0x0020 }
        r2 = com.facebook.ads.internal.p101q.p102a.C1924n.m7300b();	 Catch:{ Exception -> 0x0020 }
        r6 = com.facebook.ads.internal.p101q.p102a.C1924n.m7301c();	 Catch:{ Exception -> 0x0020 }
        r1 = r1.m6741a();	 Catch:{ Exception -> 0x0020 }
        r4.<init>(r2, r6, r1);	 Catch:{ Exception -> 0x0020 }
        com.facebook.ads.internal.p087f.C1795e.m6752a(r4, r5);	 Catch:{ Exception -> 0x0021 }
        goto L_0x0021;
    L_0x0020:
        r4 = r0;
    L_0x0021:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.f.e.a(java.lang.Exception, android.content.Context, java.util.Map):com.facebook.ads.internal.f.d");
    }

    /* renamed from: a */
    public static JSONArray m6749a(Context context) {
        return C1795e.m6750a(context, -1);
    }

    /* renamed from: a */
    public static JSONArray m6750a(Context context, int i) {
        FileInputStream openFileInput;
        InputStreamReader inputStreamReader;
        String readLine;
        Throwable e;
        Throwable e2;
        JSONArray jSONArray = new JSONArray();
        synchronized (f5421b) {
            BufferedReader bufferedReader = null;
            BufferedReader bufferedReader2;
            try {
                if (new File(context.getFilesDir(), "debuglogs").exists()) {
                    openFileInput = context.openFileInput("debuglogs");
                    try {
                        inputStreamReader = new InputStreamReader(openFileInput);
                        try {
                            bufferedReader2 = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    readLine = bufferedReader2.readLine();
                                    if (readLine == null || i == 0) {
                                        bufferedReader = bufferedReader2;
                                    } else {
                                        JSONObject jSONObject = new JSONObject(readLine);
                                        if (!jSONObject.has("attempt")) {
                                            jSONObject.put("attempt", 0);
                                        }
                                        readLine = jSONObject.getString(FacebookAdapter.KEY_ID);
                                        if (!f5422c.contains(readLine)) {
                                            int i2 = jSONObject.getInt("attempt");
                                            if (f5423d.containsKey(readLine)) {
                                                jSONObject.put("attempt", f5423d.get(readLine));
                                            } else {
                                                C1795e.m6754a(readLine, i2);
                                            }
                                            jSONArray.put(jSONObject);
                                            if (i > 0) {
                                                i--;
                                            }
                                        }
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    bufferedReader = bufferedReader2;
                                } catch (Throwable th) {
                                    i = th;
                                }
                            }
                            bufferedReader = bufferedReader2;
                        } catch (IOException e4) {
                            e = e4;
                            try {
                                Log.e(f5420a, "Failed to read crashes", e);
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e5) {
                                        e2 = e5;
                                        String str = f5420a;
                                        readLine = "Failed to close buffers";
                                        Log.e(str, readLine, e2);
                                        return jSONArray;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                                return jSONArray;
                            } catch (Throwable th2) {
                                i = th2;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (Throwable e22) {
                                        Log.e(f5420a, "Failed to close buffers", e22);
                                        throw i;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                                throw i;
                            }
                        }
                    } catch (IOException e6) {
                        e = e6;
                        inputStreamReader = null;
                        Log.e(f5420a, "Failed to read crashes", e);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        return jSONArray;
                    } catch (Throwable th3) {
                        i = th3;
                        inputStreamReader = null;
                        bufferedReader2 = inputStreamReader;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        throw i;
                    }
                }
                openFileInput = null;
                inputStreamReader = openFileInput;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e7) {
                        e22 = e7;
                        str = f5420a;
                        readLine = "Failed to close buffers";
                        Log.e(str, readLine, e22);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (openFileInput != null) {
                    openFileInput.close();
                }
            } catch (IOException e8) {
                e = e8;
                openFileInput = null;
                inputStreamReader = openFileInput;
                Log.e(f5420a, "Failed to read crashes", e);
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (openFileInput != null) {
                    openFileInput.close();
                }
                return jSONArray;
            } catch (Throwable th4) {
                i = th4;
                openFileInput = null;
                inputStreamReader = openFileInput;
                bufferedReader2 = inputStreamReader;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (openFileInput != null) {
                    openFileInput.close();
                }
                throw i;
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static JSONObject m6751a(C1794d c1794d) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookAdapter.KEY_ID, UUID.randomUUID().toString());
        jSONObject.put("type", c1794d.mo1351a());
        jSONObject.put("time", C1932s.m7313a(c1794d.m6744b()));
        jSONObject.put("session_time", C1932s.m7313a(c1794d.m6745c()));
        jSONObject.put("session_id", c1794d.m6746d());
        jSONObject.put("data", c1794d.m6747e() != null ? new JSONObject(c1794d.m6747e()) : new JSONObject());
        jSONObject.put("attempt", 0);
        return jSONObject;
    }

    /* renamed from: a */
    public static void m6752a(C1794d c1794d, Context context) {
        if (c1794d != null && context != null) {
            synchronized (f5421b) {
                try {
                    JSONObject a = C1795e.m6751a(c1794d);
                    FileOutputStream openFileOutput = context.openFileOutput("debuglogs", 32768);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a.toString());
                    stringBuilder.append("\n");
                    openFileOutput.write(stringBuilder.toString().getBytes());
                    openFileOutput.close();
                    C1795e.m6760d(context);
                } catch (Throwable e) {
                    Log.e(f5420a, "Failed to store crash", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m6753a(String str) {
        Integer num = (Integer) f5423d.get(str);
        if (num == null) {
            num = Integer.valueOf(0);
        } else {
            f5423d.remove(str);
        }
        f5423d.put(str, Integer.valueOf(num.intValue() + 1));
    }

    /* renamed from: a */
    private static void m6754a(String str, int i) {
        if (f5422c.contains(str)) {
            throw new RuntimeException("finished event should not be updated to OngoingEvent.");
        }
        if (f5423d.containsKey(str)) {
            f5423d.remove(str);
        }
        f5423d.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public static int m6755b(Context context) {
        return context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).getInt("EventCount", 0) - f5422c.size();
    }

    /* renamed from: b */
    private static void m6756b(Context context, int i) {
        Editor edit = context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).edit();
        String str = "EventCount";
        if (i < 0) {
            i = 0;
        }
        edit.putInt(str, i).apply();
    }

    /* renamed from: b */
    public static void m6757b(String str) {
        if (f5423d.containsKey(str)) {
            f5423d.remove(str);
        }
        f5422c.add(str);
    }

    /* renamed from: c */
    public static boolean m6758c(Context context) {
        FileInputStream openFileInput;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable e;
        FileOutputStream fileOutputStream;
        BufferedReader bufferedReader2;
        JSONArray jSONArray = new JSONArray();
        synchronized (f5421b) {
            FileOutputStream fileOutputStream2 = null;
            try {
                if (new File(context.getFilesDir(), "debuglogs").exists()) {
                    StringBuilder stringBuilder;
                    openFileInput = context.openFileInput("debuglogs");
                    try {
                        inputStreamReader = new InputStreamReader(openFileInput);
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    JSONObject jSONObject = new JSONObject(readLine);
                                    readLine = jSONObject.getString(FacebookAdapter.KEY_ID);
                                    if (!f5422c.contains(readLine)) {
                                        if (f5423d.containsKey(readLine)) {
                                            jSONObject.put("attempt", f5423d.get(readLine));
                                        }
                                        jSONArray.put(jSONObject);
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    fileOutputStream = null;
                                } catch (Throwable th) {
                                    e = th;
                                }
                            }
                            stringBuilder = new StringBuilder();
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                stringBuilder.append(jSONArray.getJSONObject(i).toString());
                                stringBuilder.append('\n');
                            }
                            fileOutputStream = context.openFileOutput("debuglogs", 0);
                        } catch (IOException e3) {
                            e = e3;
                            fileOutputStream = null;
                            try {
                                Log.e(f5420a, "Failed to rewrite File.", e);
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (Throwable e4) {
                                        Log.e(f5420a, "Failed to close buffers", e4);
                                        f5422c.clear();
                                        f5423d.clear();
                                        return false;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                f5422c.clear();
                                f5423d.clear();
                                return false;
                            } catch (Throwable th2) {
                                e4 = th2;
                                bufferedReader = bufferedReader2;
                                fileOutputStream2 = fileOutputStream;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable e5) {
                                        Log.e(f5420a, "Failed to close buffers", e5);
                                        f5422c.clear();
                                        f5423d.clear();
                                        throw e4;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                f5422c.clear();
                                f5423d.clear();
                                throw e4;
                            }
                        } catch (Throwable th3) {
                            e4 = th3;
                            bufferedReader = null;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (openFileInput != null) {
                                openFileInput.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            f5422c.clear();
                            f5423d.clear();
                            throw e4;
                        }
                    } catch (IOException e6) {
                        e4 = e6;
                        fileOutputStream = null;
                        inputStreamReader = fileOutputStream;
                        Log.e(f5420a, "Failed to rewrite File.", e4);
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        f5422c.clear();
                        f5423d.clear();
                        return false;
                    } catch (Throwable th4) {
                        e4 = th4;
                        inputStreamReader = null;
                        bufferedReader = inputStreamReader;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        f5422c.clear();
                        f5423d.clear();
                        throw e4;
                    }
                    try {
                        fileOutputStream.write(stringBuilder.toString().getBytes());
                        bufferedReader2 = bufferedReader;
                    } catch (IOException e7) {
                        e4 = e7;
                        bufferedReader2 = bufferedReader;
                        Log.e(f5420a, "Failed to rewrite File.", e4);
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        f5422c.clear();
                        f5423d.clear();
                        return false;
                    } catch (Throwable th5) {
                        e4 = th5;
                        fileOutputStream2 = fileOutputStream;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        f5422c.clear();
                        f5423d.clear();
                        throw e4;
                    }
                }
                fileOutputStream = null;
                openFileInput = fileOutputStream;
                inputStreamReader = openFileInput;
                try {
                    C1795e.m6756b(context, C1795e.m6755b(context));
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e8) {
                            e4 = e8;
                            Log.e(f5420a, "Failed to close buffers", e4);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    f5422c.clear();
                    f5423d.clear();
                    return true;
                } catch (IOException e9) {
                    e4 = e9;
                    Log.e(f5420a, "Failed to rewrite File.", e4);
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    f5422c.clear();
                    f5423d.clear();
                    return false;
                }
            } catch (IOException e10) {
                e4 = e10;
                fileOutputStream = null;
                openFileInput = fileOutputStream;
                inputStreamReader = openFileInput;
                Log.e(f5420a, "Failed to rewrite File.", e4);
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (openFileInput != null) {
                    openFileInput.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                f5422c.clear();
                f5423d.clear();
                return false;
            } catch (Throwable th6) {
                e4 = th6;
                openFileInput = null;
                inputStreamReader = openFileInput;
                bufferedReader = inputStreamReader;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (openFileInput != null) {
                    openFileInput.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                f5422c.clear();
                f5423d.clear();
                throw e4;
            }
        }
    }

    /* renamed from: c */
    public static boolean m6759c(String str) {
        if (!f5422c.contains(str)) {
            if (!f5423d.containsKey(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static void m6760d(Context context) {
        C1795e.m6756b(context, context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).getInt("EventCount", 0) + 1);
    }
}
