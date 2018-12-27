package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaze.zzb;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzawb {
    /* renamed from: a */
    private static final Logger f9047a = Logger.getLogger(zzawb.class.getName());
    /* renamed from: b */
    private static final ConcurrentMap<String, zzavt> f9048b = new ConcurrentHashMap();
    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f9049c = new ConcurrentHashMap();
    /* renamed from: d */
    private static final ConcurrentMap<String, zzavn> f9050d = new ConcurrentHashMap();

    /* renamed from: a */
    public static synchronized <P> void m10214a(String str, zzavn<P> zzavn) {
        synchronized (zzawb.class) {
            if (f9050d.containsKey(str.toLowerCase())) {
                if (!zzavn.getClass().equals(((zzavn) f9050d.get(str.toLowerCase())).getClass())) {
                    zzavn = f9047a;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "addCatalogue";
                    String str4 = "Attempted overwrite of a catalogueName catalogue for name ";
                    String valueOf = String.valueOf(str);
                    zzavn.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 47);
                    stringBuilder.append("catalogue for name ");
                    stringBuilder.append(str);
                    stringBuilder.append(" has been already registered");
                    throw new GeneralSecurityException(stringBuilder.toString());
                }
            }
            f9050d.put(str.toLowerCase(), zzavn);
        }
    }

    /* renamed from: a */
    public static <P> zzavn<P> m10206a(String str) {
        if (str != null) {
            zzavn<P> zzavn = (zzavn) f9050d.get(str.toLowerCase());
            if (zzavn != null) {
                return zzavn;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink") != null) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: a */
    public static synchronized <P> void m10212a(zzavt<P> zzavt) {
        synchronized (zzawb.class) {
            m10213a((zzavt) zzavt, true);
        }
    }

    /* renamed from: a */
    public static synchronized <P> void m10213a(zzavt<P> zzavt, boolean z) {
        synchronized (zzawb.class) {
            if (zzavt != null) {
                String a = zzavt.mo1957a();
                if (f9048b.containsKey(a)) {
                    zzavt b = m10215b(a);
                    boolean booleanValue = ((Boolean) f9049c.get(a)).booleanValue();
                    if (!zzavt.getClass().equals(b.getClass()) || (!booleanValue && z)) {
                        z = f9047a;
                        Level level = Level.WARNING;
                        String str = "com.google.crypto.tink.Registry";
                        String str2 = "registerKeyManager";
                        String str3 = "Attempted overwrite of a registered key manager for key type ";
                        String valueOf = String.valueOf(a);
                        z.logp(level, str, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{a, b.getClass().getName(), zzavt.getClass().getName()}));
                    }
                }
                f9048b.put(a, zzavt);
                f9049c.put(a, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: b */
    private static <P> zzavt<P> m10215b(String str) {
        zzavt<P> zzavt = (zzavt) f9048b.get(str);
        if (zzavt != null) {
            return zzavt;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 78);
        stringBuilder.append("No key manager found for key type: ");
        stringBuilder.append(str);
        stringBuilder.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static synchronized <P> zzayv m10208a(zzaza zzaza) {
        synchronized (zzawb.class) {
            zzavt b = m10215b(zzaza.m29171a());
            if (((Boolean) f9049c.get(zzaza.m29171a())).booleanValue()) {
                zzaza = b.mo1961c(zzaza.m29172b());
            } else {
                String str = "newKey-operation not permitted for key type ";
                zzaza = String.valueOf(zzaza.m29171a());
                throw new GeneralSecurityException(zzaza.length() != 0 ? str.concat(zzaza) : new String(str));
            }
        }
        return zzaza;
    }

    /* renamed from: b */
    public static synchronized <P> zzbel m10216b(zzaza zzaza) {
        synchronized (zzawb.class) {
            zzavt b = m10215b(zzaza.m29171a());
            if (((Boolean) f9049c.get(zzaza.m29171a())).booleanValue()) {
                zzaza = b.mo1959b(zzaza.m29172b());
            } else {
                String str = "newKey-operation not permitted for key type ";
                zzaza = String.valueOf(zzaza.m29171a());
                throw new GeneralSecurityException(zzaza.length() != 0 ? str.concat(zzaza) : new String(str));
            }
        }
        return zzaza;
    }

    /* renamed from: a */
    public static synchronized <P> zzbel m10209a(String str, zzbel zzbel) {
        synchronized (zzawb.class) {
            zzavt b = m10215b(str);
            if (((Boolean) f9049c.get(str)).booleanValue()) {
                str = b.mo1960b(zzbel);
            } else {
                String str2 = "newKey-operation not permitted for key type ";
                str = String.valueOf(str);
                throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
            }
        }
        return str;
    }

    /* renamed from: b */
    public static <P> P m10217b(String str, zzbel zzbel) {
        return m10215b(str).mo1956a(zzbel);
    }

    /* renamed from: a */
    private static <P> P m10210a(String str, zzbbu zzbbu) {
        return m10215b(str).mo1955a(zzbbu);
    }

    /* renamed from: a */
    public static <P> P m10211a(String str, byte[] bArr) {
        return m10210a(str, zzbbu.m10260a(bArr));
    }

    /* renamed from: a */
    public static <P> zzavz<P> m10207a(zzavu zzavu, zzavt<P> zzavt) {
        hp.m8944b(zzavu.m10194a());
        zzavt = new zzavz();
        for (zzb zzb : zzavu.m10194a().m29207b()) {
            if (zzb.m29200c() == zzayy.ENABLED) {
                zzawa a = zzavt.m10201a(m10210a(zzb.m29199b().m29165a(), zzb.m29199b().m29166b()), zzb);
                if (zzb.m29201d() == zzavu.m10194a().m29205a()) {
                    zzavt.m10202a(a);
                }
            }
        }
        return zzavt;
    }
}
