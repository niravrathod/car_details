package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zznz {
    @VisibleForTesting
    /* renamed from: a */
    private BlockingQueue<zzoj> f9733a = new ArrayBlockingQueue(100);
    @VisibleForTesting
    /* renamed from: b */
    private ExecutorService f9734b;
    @VisibleForTesting
    /* renamed from: c */
    private LinkedHashMap<String, String> f9735c = new LinkedHashMap();
    @VisibleForTesting
    /* renamed from: d */
    private Map<String, zzod> f9736d = new HashMap();
    @VisibleForTesting
    /* renamed from: e */
    private String f9737e;
    @VisibleForTesting
    /* renamed from: f */
    private Context f9738f;
    @VisibleForTesting
    /* renamed from: g */
    private String f9739g;
    /* renamed from: h */
    private AtomicBoolean f9740h;
    /* renamed from: i */
    private File f9741i;

    /* renamed from: a */
    public final void m10912a(Context context, String str, String str2, Map<String, String> map) {
        this.f9738f = context;
        this.f9739g = str;
        this.f9737e = str2;
        this.f9740h = new AtomicBoolean(null);
        this.f9740h.set(((Boolean) zzkd.m10713e().m10897a(zznw.f9687L)).booleanValue());
        if (this.f9740h.get() != null) {
            context = Environment.getExternalStorageDirectory();
            if (context != null) {
                this.f9741i = new File(context, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f9735c.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.f9734b = Executors.newSingleThreadExecutor();
        this.f9734b.execute(new sn(this));
        this.f9736d.put("action", zzod.f9743b);
        this.f9736d.put("ad_format", zzod.f9743b);
        this.f9736d.put("e", zzod.f9744c);
    }

    /* renamed from: a */
    public final void m10913a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f9735c.put("e", TextUtils.join(",", list));
        }
    }

    /* renamed from: a */
    public final boolean m10914a(zzoj zzoj) {
        return this.f9733a.offer(zzoj);
    }

    /* renamed from: a */
    private final void m10908a() {
        FileOutputStream fileOutputStream;
        Throwable e;
        while (true) {
            try {
                zzoj zzoj = (zzoj) this.f9733a.take();
                Object b = zzoj.m10932b();
                if (!TextUtils.isEmpty(b)) {
                    Map a = m10911a(this.f9735c, zzoj.m10933c());
                    Builder buildUpon = Uri.parse(this.f9737e).buildUpon();
                    for (Entry entry : a.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
                    stringBuilder.append("&it=");
                    stringBuilder.append(b);
                    String stringBuilder2 = stringBuilder.toString();
                    if (this.f9740h.get()) {
                        File file = this.f9741i;
                        if (file != null) {
                            fileOutputStream = null;
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                                try {
                                    fileOutputStream2.write(stringBuilder2.getBytes());
                                    fileOutputStream2.write(10);
                                    try {
                                        fileOutputStream2.close();
                                    } catch (Throwable e2) {
                                        zzaok.m10004c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                                    }
                                } catch (IOException e3) {
                                    e2 = e3;
                                    fileOutputStream = fileOutputStream2;
                                    try {
                                        zzaok.m10004c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e2);
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable e22) {
                                                zzaok.m10004c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e22);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        e22 = th;
                                    }
                                } catch (Throwable th2) {
                                    e22 = th2;
                                    fileOutputStream = fileOutputStream2;
                                }
                            } catch (IOException e4) {
                                e22 = e4;
                                zzaok.m10004c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e22);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        } else {
                            zzaok.m10007e("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        zzbv.zzek();
                        zzalo.m9791a(this.f9738f, this.f9739g, stringBuilder2);
                    }
                }
            } catch (Throwable e222) {
                zzaok.m10004c("CsiReporter:reporter interrupted", e222);
                return;
            }
        }
        throw e222;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable e5) {
                zzaok.m10004c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
            }
        }
        throw e222;
    }

    /* renamed from: a */
    final Map<String, String> m10911a(Map<String, String> map, Map<String, String> map2) {
        Map<String, String> linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        map = map2.entrySet().iterator();
        while (map.hasNext() != null) {
            Entry entry = (Entry) map.next();
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, m10910a(str).mo2172a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final zzod m10910a(String str) {
        zzod zzod = (zzod) this.f9736d.get(str);
        if (zzod != null) {
            return zzod;
        }
        return zzod.f9742a;
    }
}
