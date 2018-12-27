package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public final class zzbag {
    /* renamed from: a */
    static void m10239a(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger b = m10241b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        eCPoint = eCPoint.getAffineY();
        if (affineX == null || eCPoint == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(b) != -1) {
            throw new GeneralSecurityException("x is out of range");
        } else if (eCPoint.signum() == -1 || eCPoint.compareTo(b) != -1) {
            throw new GeneralSecurityException("y is out of range");
        } else if (eCPoint.multiply(eCPoint).mod(b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(b)) == null) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: b */
    private static BigInteger m10241b(EllipticCurve ellipticCurve) {
        ellipticCurve = ellipticCurve.getField();
        if (ellipticCurve instanceof ECFieldFp) {
            return ((ECFieldFp) ellipticCurve).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: a */
    public static int m10234a(EllipticCurve ellipticCurve) {
        return (m10241b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: a */
    private static ECParameterSpec m10238a(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: a */
    public static ECParameterSpec m10237a(zzbai zzbai) {
        switch (ju.f8198b[zzbai.ordinal()]) {
            case 1:
                return m10238a("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
            case 2:
                return m10238a("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
            case 3:
                return m10238a("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
            default:
                zzbai = String.valueOf(zzbai);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzbai).length() + 22);
                stringBuilder.append("curve not implemented:");
                stringBuilder.append(zzbai);
                throw new NoSuchAlgorithmException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static ECPublicKey m10236a(zzbai zzbai, byte[] bArr, byte[] bArr2) {
        zzbai = m10237a(zzbai);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m10239a(eCPoint, zzbai.getCurve());
        return (ECPublicKey) ((KeyFactory) zzbal.f9077e.m10243a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, zzbai));
    }

    /* renamed from: a */
    public static KeyPair m10235a(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzbal.f9076d.m10243a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static byte[] m10240a(java.security.interfaces.ECPrivateKey r11, java.security.spec.ECPoint r12) {
        /*
        r0 = r11.getParams();
        r0 = r0.getCurve();
        m10239a(r12, r0);
        r0 = r11.getParams();
        r0.getCurve();
        r1 = new java.security.spec.ECPublicKeySpec;
        r1.<init>(r12, r0);
        r12 = "EC";
        r12 = java.security.KeyFactory.getInstance(r12);
        r12 = r12.generatePublic(r1);
        r0 = com.google.android.gms.internal.ads.zzbal.f9075c;
        r1 = "ECDH";
        r0 = r0.m10243a(r1);
        r0 = (javax.crypto.KeyAgreement) r0;
        r0.init(r11);
        r1 = 1;
        r0.doPhase(r12, r1);	 Catch:{ IllegalStateException -> 0x01ac }
        r12 = r0.generateSecret();	 Catch:{ IllegalStateException -> 0x01ac }
        r11 = r11.getParams();	 Catch:{ IllegalStateException -> 0x01ac }
        r11 = r11.getCurve();	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = new java.math.BigInteger;	 Catch:{ IllegalStateException -> 0x01ac }
        r0.<init>(r1, r12);	 Catch:{ IllegalStateException -> 0x01ac }
        r2 = r0.signum();	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = -1;
        if (r2 == r3) goto L_0x01a4;
    L_0x004a:
        r2 = m10241b(r11);	 Catch:{ IllegalStateException -> 0x01ac }
        r2 = r0.compareTo(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r2 != r3) goto L_0x01a4;
    L_0x0054:
        r2 = m10241b(r11);	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = r11.getA();	 Catch:{ IllegalStateException -> 0x01ac }
        r11 = r11.getB();	 Catch:{ IllegalStateException -> 0x01ac }
        r4 = r0.multiply(r0);	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = r4.add(r3);	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = r3.multiply(r0);	 Catch:{ IllegalStateException -> 0x01ac }
        r11 = r0.add(r11);	 Catch:{ IllegalStateException -> 0x01ac }
        r11 = r11.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = r2.signum();	 Catch:{ IllegalStateException -> 0x01ac }
        if (r0 != r1) goto L_0x019c;
    L_0x007a:
        r11 = r11.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = 0;
        r3 = java.math.BigInteger.ZERO;	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = r11.equals(r3);	 Catch:{ IllegalStateException -> 0x01ac }
        r4 = 0;
        if (r3 == 0) goto L_0x008d;
    L_0x0088:
        r11 = java.math.BigInteger.ZERO;	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = r11;
        goto L_0x018e;
    L_0x008d:
        r3 = r2.testBit(r4);	 Catch:{ IllegalStateException -> 0x01ac }
        r5 = 2;
        if (r3 == 0) goto L_0x00aa;
    L_0x0094:
        r3 = r2.testBit(r1);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r3 == 0) goto L_0x00aa;
    L_0x009a:
        r0 = java.math.BigInteger.ONE;	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = r2.add(r0);	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = r0.shiftRight(r5);	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = r11.modPow(r0, r2);	 Catch:{ IllegalStateException -> 0x01ac }
        goto L_0x0175;
    L_0x00aa:
        r3 = r2.testBit(r4);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r3 == 0) goto L_0x0175;
    L_0x00b0:
        r3 = r2.testBit(r1);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r3 != 0) goto L_0x0175;
    L_0x00b6:
        r0 = java.math.BigInteger.ONE;	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = java.math.BigInteger.ONE;	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = r2.subtract(r3);	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = r3.shiftRight(r1);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = 0;
    L_0x00c3:
        r7 = r0.multiply(r0);	 Catch:{ IllegalStateException -> 0x01ac }
        r7 = r7.subtract(r11);	 Catch:{ IllegalStateException -> 0x01ac }
        r7 = r7.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r8 = java.math.BigInteger.ZERO;	 Catch:{ IllegalStateException -> 0x01ac }
        r8 = r7.equals(r8);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r8 == 0) goto L_0x00d9;
    L_0x00d7:
        goto L_0x018e;
    L_0x00d9:
        r8 = r7.modPow(r3, r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r9 = java.math.BigInteger.ONE;	 Catch:{ IllegalStateException -> 0x01ac }
        r9 = r8.add(r9);	 Catch:{ IllegalStateException -> 0x01ac }
        r9 = r9.equals(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r9 != 0) goto L_0x0115;
    L_0x00e9:
        r7 = java.math.BigInteger.ONE;	 Catch:{ IllegalStateException -> 0x01ac }
        r7 = r8.equals(r7);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r7 == 0) goto L_0x010d;
    L_0x00f1:
        r7 = java.math.BigInteger.ONE;	 Catch:{ IllegalStateException -> 0x01ac }
        r0 = r0.add(r7);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = r6 + r1;
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r6 != r7) goto L_0x00c3;
    L_0x00fc:
        r7 = 80;
        r7 = r2.isProbablePrime(r7);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r7 == 0) goto L_0x0105;
    L_0x0104:
        goto L_0x00c3;
    L_0x0105:
        r11 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ IllegalStateException -> 0x01ac }
        r12 = "p is not prime";
        r11.<init>(r12);	 Catch:{ IllegalStateException -> 0x01ac }
        throw r11;	 Catch:{ IllegalStateException -> 0x01ac }
    L_0x010d:
        r11 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ IllegalStateException -> 0x01ac }
        r12 = "p is not prime";
        r11.<init>(r12);	 Catch:{ IllegalStateException -> 0x01ac }
        throw r11;	 Catch:{ IllegalStateException -> 0x01ac }
    L_0x0115:
        r3 = java.math.BigInteger.ONE;	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = r2.add(r3);	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = r3.shiftRight(r1);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = java.math.BigInteger.ONE;	 Catch:{ IllegalStateException -> 0x01ac }
        r8 = r3.bitLength();	 Catch:{ IllegalStateException -> 0x01ac }
        r8 = r8 - r5;
        r5 = r0;
    L_0x0127:
        if (r8 < 0) goto L_0x0174;
    L_0x0129:
        r9 = r5.multiply(r6);	 Catch:{ IllegalStateException -> 0x01ac }
        r5 = r5.multiply(r5);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = r6.multiply(r6);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = r6.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = r6.multiply(r7);	 Catch:{ IllegalStateException -> 0x01ac }
        r5 = r5.add(r6);	 Catch:{ IllegalStateException -> 0x01ac }
        r5 = r5.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = r9.add(r9);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = r6.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r9 = r3.testBit(r8);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r9 == 0) goto L_0x0171;
    L_0x0153:
        r9 = r5.multiply(r0);	 Catch:{ IllegalStateException -> 0x01ac }
        r10 = r6.multiply(r7);	 Catch:{ IllegalStateException -> 0x01ac }
        r9 = r9.add(r10);	 Catch:{ IllegalStateException -> 0x01ac }
        r9 = r9.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = r0.multiply(r6);	 Catch:{ IllegalStateException -> 0x01ac }
        r5 = r6.add(r5);	 Catch:{ IllegalStateException -> 0x01ac }
        r5 = r5.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r6 = r5;
        r5 = r9;
    L_0x0171:
        r8 = r8 + -1;
        goto L_0x0127;
    L_0x0174:
        r0 = r5;
    L_0x0175:
        if (r0 == 0) goto L_0x018e;
    L_0x0177:
        r3 = r0.multiply(r0);	 Catch:{ IllegalStateException -> 0x01ac }
        r3 = r3.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
        r11 = r3.compareTo(r11);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r11 != 0) goto L_0x0186;
    L_0x0185:
        goto L_0x018e;
    L_0x0186:
        r11 = new java.security.GeneralSecurityException;	 Catch:{ IllegalStateException -> 0x01ac }
        r12 = "Could not find a modular square root";
        r11.<init>(r12);	 Catch:{ IllegalStateException -> 0x01ac }
        throw r11;	 Catch:{ IllegalStateException -> 0x01ac }
    L_0x018e:
        r11 = r0.testBit(r4);	 Catch:{ IllegalStateException -> 0x01ac }
        if (r1 == r11) goto L_0x019b;
    L_0x0194:
        r11 = r2.subtract(r0);	 Catch:{ IllegalStateException -> 0x01ac }
        r11.mod(r2);	 Catch:{ IllegalStateException -> 0x01ac }
    L_0x019b:
        return r12;
    L_0x019c:
        r11 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ IllegalStateException -> 0x01ac }
        r12 = "p must be positive";
        r11.<init>(r12);	 Catch:{ IllegalStateException -> 0x01ac }
        throw r11;	 Catch:{ IllegalStateException -> 0x01ac }
    L_0x01a4:
        r11 = new java.security.GeneralSecurityException;	 Catch:{ IllegalStateException -> 0x01ac }
        r12 = "shared secret is out of range";
        r11.<init>(r12);	 Catch:{ IllegalStateException -> 0x01ac }
        throw r11;	 Catch:{ IllegalStateException -> 0x01ac }
    L_0x01ac:
        r11 = move-exception;
        r12 = new java.security.GeneralSecurityException;
        r11 = r11.toString();
        r12.<init>(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbag.a(java.security.interfaces.ECPrivateKey, java.security.spec.ECPoint):byte[]");
    }
}
