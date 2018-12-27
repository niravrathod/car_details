package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;

final class bw extends zzai {
    /* renamed from: a */
    private final zzar f19629a;

    bw(zzar zzar) {
        this.f19629a = zzar;
    }

    /* renamed from: a */
    public final zzaq mo4152a(zzr<?> zzr, Map<String, String> map) {
        try {
            zzr = this.f19629a.mo2242b(zzr, map);
            map = zzr.getStatusLine().getStatusCode();
            Header[] allHeaders = zzr.getAllHeaders();
            List arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new zzl(header.getName(), header.getValue()));
            }
            if (zzr.getEntity() == null) {
                return new zzaq(map, arrayList);
            }
            long contentLength = zzr.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new zzaq(map, arrayList, (int) zzr.getEntity().getContentLength(), zzr.getEntity().getContent());
            }
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Response too large: ");
            stringBuilder.append(contentLength);
            throw new IOException(stringBuilder.toString());
        } catch (zzr<?> zzr2) {
            throw new SocketTimeoutException(zzr2.getMessage());
        }
    }
}
