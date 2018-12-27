package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class zzbae {
    /* renamed from: a */
    private ECPublicKey f9062a;

    public zzbae(ECPublicKey eCPublicKey) {
        this.f9062a = eCPublicKey;
    }

    /* renamed from: a */
    public final zzbaf m10231a(String str, byte[] bArr, byte[] bArr2, int i, zzbaj zzbaj) {
        KeyPair a = zzbag.m10235a(this.f9062a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPublicKey eCPublicKey2 = this.f9062a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                byte[] bArr3;
                byte[] a2 = zzbag.m10240a(eCPrivateKey, eCPublicKey2.getW());
                EllipticCurve curve = eCPublicKey.getParams().getCurve();
                ECPoint w = eCPublicKey.getW();
                zzbag.m10239a(w, curve);
                int a3 = zzbag.m10234a(curve);
                int i2 = 1;
                Object toByteArray;
                Object toByteArray2;
                switch (ju.f8197a[zzbaj.ordinal()]) {
                    case 1:
                        zzbaj = (a3 * 2) + 1;
                        bArr3 = new byte[zzbaj];
                        toByteArray = w.getAffineX().toByteArray();
                        toByteArray2 = w.getAffineY().toByteArray();
                        System.arraycopy(toByteArray2, 0, bArr3, zzbaj - toByteArray2.length, toByteArray2.length);
                        System.arraycopy(toByteArray, 0, bArr3, (a3 + 1) - toByteArray.length, toByteArray.length);
                        bArr3[0] = (byte) 4;
                        break;
                    case 2:
                        zzbaj = a3 * 2;
                        bArr3 = new byte[zzbaj];
                        toByteArray = w.getAffineX().toByteArray();
                        if (toByteArray.length > a3) {
                            toByteArray = Arrays.copyOfRange(toByteArray, toByteArray.length - a3, toByteArray.length);
                        }
                        toByteArray2 = w.getAffineY().toByteArray();
                        if (toByteArray2.length > a3) {
                            toByteArray2 = Arrays.copyOfRange(toByteArray2, toByteArray2.length - a3, toByteArray2.length);
                        }
                        System.arraycopy(toByteArray2, 0, bArr3, zzbaj - toByteArray2.length, toByteArray2.length);
                        System.arraycopy(toByteArray, 0, bArr3, a3 - toByteArray.length, toByteArray.length);
                        break;
                    case 3:
                        a3++;
                        zzbaj = new byte[a3];
                        Object toByteArray3 = w.getAffineX().toByteArray();
                        System.arraycopy(toByteArray3, 0, zzbaj, a3 - toByteArray3.length, toByteArray3.length);
                        zzbaj[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                        bArr3 = zzbaj;
                        break;
                    default:
                        bArr = String.valueOf(zzbaj);
                        i = new StringBuilder(String.valueOf(bArr).length() + 15);
                        i.append("invalid format:");
                        i.append(bArr);
                        throw new GeneralSecurityException(i.toString());
                }
                zzbaj = zzazx.m10222a(new byte[][]{bArr3, a2});
                Mac mac = (Mac) zzbal.f9074b.m10243a(str);
                if (i <= mac.getMacLength() * 255) {
                    if (bArr != null) {
                        if (bArr.length != 0) {
                            mac.init(new SecretKeySpec(bArr, str));
                            bArr = mac.doFinal(zzbaj);
                            zzbaj = new byte[i];
                            mac.init(new SecretKeySpec(bArr, str));
                            str = new byte[0];
                            bArr = null;
                            while (true) {
                                mac.update(str);
                                mac.update(bArr2);
                                mac.update((byte) i2);
                                str = mac.doFinal();
                                if (str.length + bArr >= i) {
                                    System.arraycopy(str, 0, zzbaj, bArr, str.length);
                                    bArr += str.length;
                                    i2++;
                                } else {
                                    System.arraycopy(str, 0, zzbaj, bArr, i - bArr);
                                    return new zzbaf(bArr3, zzbaj);
                                }
                            }
                        }
                    }
                    mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                    bArr = mac.doFinal(zzbaj);
                    zzbaj = new byte[i];
                    mac.init(new SecretKeySpec(bArr, str));
                    str = new byte[0];
                    bArr = null;
                    while (true) {
                        mac.update(str);
                        mac.update(bArr2);
                        mac.update((byte) i2);
                        str = mac.doFinal();
                        if (str.length + bArr >= i) {
                            System.arraycopy(str, 0, zzbaj, bArr, i - bArr);
                            return new zzbaf(bArr3, zzbaj);
                        }
                        System.arraycopy(str, 0, zzbaj, bArr, str.length);
                        bArr += str.length;
                        i2++;
                    }
                } else {
                    throw new GeneralSecurityException("size too large");
                }
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (String str2) {
            throw new GeneralSecurityException(str2.toString());
        }
    }
}
