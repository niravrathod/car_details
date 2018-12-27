package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public abstract class zzai implements zzar {
    /* renamed from: a */
    public abstract zzaq mo4152a(zzr<?> zzr, Map<String, String> map);

    @Deprecated
    /* renamed from: b */
    public final HttpResponse mo2242b(zzr<?> zzr, Map<String, String> map) {
        zzr = mo4152a(zzr, map);
        map = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), zzr.m10043a(), ""));
        List arrayList = new ArrayList();
        for (zzl zzl : zzr.m10044b()) {
            arrayList.add(new BasicHeader(zzl.m10728a(), zzl.m10729b()));
        }
        map.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream d = zzr.m10046d();
        if (d != null) {
            HttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(d);
            basicHttpEntity.setContentLength((long) zzr.m10045c());
            map.setEntity(basicHttpEntity);
        }
        return map;
    }
}
