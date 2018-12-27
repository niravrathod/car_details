package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzcm {
    /* renamed from: b */
    private static Cipher f9345b;
    /* renamed from: c */
    private static final Object f9346c = new Object();
    /* renamed from: d */
    private static final Object f9347d = new Object();
    /* renamed from: a */
    private final SecureRandom f9348a = null;

    public zzcm(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    public final byte[] m10485a(String str) {
        int i = 0;
        try {
            str = zzbk.m10468a(str, false);
            if (str.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(str, 4, 16).get(bArr);
                while (i < 16) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                    i++;
                }
                return bArr;
            }
            throw new zzcn(this);
        } catch (String str2) {
            throw new zzcn(this, str2);
        }
    }

    /* renamed from: a */
    public final String m10484a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 16) {
            try {
                byte[] iv;
                Key secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f9346c) {
                    m10483a().init(1, secretKeySpec, null);
                    bArr2 = m10483a().doFinal(bArr2);
                    iv = m10483a().getIV();
                }
                bArr = bArr2.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(bArr);
                allocate.put(iv).put(bArr2);
                allocate.flip();
                bArr = new byte[bArr];
                allocate.get(bArr);
                return zzbk.m10467a(bArr, (boolean) null);
            } catch (byte[] bArr3) {
                throw new zzcn(this, bArr3);
            } catch (byte[] bArr32) {
                throw new zzcn(this, bArr32);
            } catch (byte[] bArr322) {
                throw new zzcn(this, bArr322);
            } catch (byte[] bArr3222) {
                throw new zzcn(this, bArr3222);
            } catch (byte[] bArr32222) {
                throw new zzcn(this, bArr32222);
            }
        }
        throw new zzcn(this);
    }

    /* renamed from: a */
    public final byte[] m10486a(byte[] bArr, String str) {
        if (bArr.length == 16) {
            try {
                str = zzbk.m10468a(str, false);
                if (str.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(str.length);
                    allocate.put(str);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    str = new byte[(str.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(str);
                    Key secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f9346c) {
                        m10483a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        str = m10483a().doFinal(str);
                    }
                    return str;
                }
                throw new zzcn(this);
            } catch (byte[] bArr3) {
                throw new zzcn(this, bArr3);
            } catch (byte[] bArr32) {
                throw new zzcn(this, bArr32);
            } catch (byte[] bArr322) {
                throw new zzcn(this, bArr322);
            } catch (byte[] bArr3222) {
                throw new zzcn(this, bArr3222);
            } catch (byte[] bArr32222) {
                throw new zzcn(this, bArr32222);
            } catch (byte[] bArr322222) {
                throw new zzcn(this, bArr322222);
            } catch (byte[] bArr3222222) {
                throw new zzcn(this, bArr3222222);
            }
        }
        throw new zzcn(this);
    }

    /* renamed from: a */
    private static Cipher m10483a() {
        Cipher cipher;
        synchronized (f9347d) {
            if (f9345b == null) {
                f9345b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f9345b;
        }
        return cipher;
    }
}
