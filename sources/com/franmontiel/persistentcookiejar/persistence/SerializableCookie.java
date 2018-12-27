package com.franmontiel.persistentcookiejar.persistence;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.C2971l;
import okhttp3.C2971l.C2970a;

public class SerializableCookie implements Serializable {
    /* renamed from: a */
    private static final String f6468a = "SerializableCookie";
    /* renamed from: c */
    private static long f6469c = -1;
    private static final long serialVersionUID = -8594045714036645534L;
    /* renamed from: b */
    private transient C2971l f6470b;

    /* renamed from: a */
    public String m7723a(C2971l c2971l) {
        this.f6470b = c2971l;
        c2971l = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(c2971l);
            try {
                objectOutputStream.writeObject(this);
                try {
                    objectOutputStream.close();
                } catch (Throwable e) {
                    Log.d(f6468a, "Stream not closed in encodeCookie", e);
                }
                return m7721a(c2971l.toByteArray());
            } catch (IOException e2) {
                c2971l = e2;
                try {
                    Log.d(f6468a, "IOException in encodeCookie", c2971l);
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (C2971l c2971l2) {
                            Log.d(f6468a, "Stream not closed in encodeCookie", c2971l2);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    c2971l2 = th;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable e3) {
                            Log.d(f6468a, "Stream not closed in encodeCookie", e3);
                        }
                    }
                    throw c2971l2;
                }
            }
        } catch (IOException e4) {
            c2971l2 = e4;
            objectOutputStream = null;
            Log.d(f6468a, "IOException in encodeCookie", c2971l2);
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            return null;
        } catch (Throwable th2) {
            c2971l2 = th2;
            objectOutputStream = null;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            throw c2971l2;
        }
    }

    /* renamed from: a */
    private static String m7721a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public C2971l m7724a(String str) {
        ObjectInputStream objectInputStream;
        Throwable e;
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(m7722b(str)));
            try {
                C2971l c2971l = ((SerializableCookie) objectInputStream.readObject()).f6470b;
                try {
                    objectInputStream.close();
                } catch (String str2) {
                    Log.d(f6468a, "Stream not closed in decodeCookie", str2);
                }
                return c2971l;
            } catch (IOException e2) {
                e = e2;
                Log.d(f6468a, "IOException in decodeCookie", e);
                if (objectInputStream != null) {
                    return null;
                }
                objectInputStream.close();
                return null;
            } catch (ClassNotFoundException e3) {
                e = e3;
                try {
                    Log.d(f6468a, "ClassNotFoundException in decodeCookie", e);
                    if (objectInputStream != null) {
                        return null;
                    }
                    try {
                        objectInputStream.close();
                        return null;
                    } catch (Throwable e4) {
                        Log.d(f6468a, "Stream not closed in decodeCookie", e4);
                        return null;
                    }
                } catch (Throwable th) {
                    str2 = th;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (Throwable e42) {
                            Log.d(f6468a, "Stream not closed in decodeCookie", e42);
                        }
                    }
                    throw str2;
                }
            }
        } catch (IOException e5) {
            e42 = e5;
            objectInputStream = null;
            Log.d(f6468a, "IOException in decodeCookie", e42);
            if (objectInputStream != null) {
                return null;
            }
            objectInputStream.close();
            return null;
        } catch (ClassNotFoundException e6) {
            e42 = e6;
            objectInputStream = null;
            Log.d(f6468a, "ClassNotFoundException in decodeCookie", e42);
            if (objectInputStream != null) {
                return null;
            }
            objectInputStream.close();
            return null;
        } catch (Throwable e422) {
            objectInputStream = null;
            str2 = e422;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            throw str2;
        }
    }

    /* renamed from: b */
    private static byte[] m7722b(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.f6470b.m14482a());
        objectOutputStream.writeObject(this.f6470b.m14485b());
        objectOutputStream.writeLong(this.f6470b.m14486c() ? this.f6470b.m14487d() : f6469c);
        objectOutputStream.writeObject(this.f6470b.m14489f());
        objectOutputStream.writeObject(this.f6470b.m14490g());
        objectOutputStream.writeBoolean(this.f6470b.m14492i());
        objectOutputStream.writeBoolean(this.f6470b.m14491h());
        objectOutputStream.writeBoolean(this.f6470b.m14488e());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        C2970a c2970a = new C2970a();
        c2970a.m14466a((String) objectInputStream.readObject());
        c2970a.m14468b((String) objectInputStream.readObject());
        long readLong = objectInputStream.readLong();
        if (readLong != f6469c) {
            c2970a.m14465a(readLong);
        }
        String str = (String) objectInputStream.readObject();
        c2970a.m14469c(str);
        c2970a.m14472e((String) objectInputStream.readObject());
        if (objectInputStream.readBoolean()) {
            c2970a.m14464a();
        }
        if (objectInputStream.readBoolean()) {
            c2970a.m14467b();
        }
        if (objectInputStream.readBoolean() != null) {
            c2970a.m14471d(str);
        }
        this.f6470b = c2970a.m14470c();
    }
}
