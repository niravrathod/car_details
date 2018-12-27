package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* renamed from: okio.m */
public final class C4905m {
    /* renamed from: a */
    static final Logger f21954a = Logger.getLogger(C4905m.class.getName());

    /* renamed from: okio.m$1 */
    class C49161 implements C2994r {
        /* renamed from: a */
        final /* synthetic */ C2996t f21984a;
        /* renamed from: b */
        final /* synthetic */ OutputStream f21985b;

        C49161(C2996t c2996t, OutputStream outputStream) {
            this.f21984a = c2996t;
            this.f21985b = outputStream;
        }

        public void a_(C4755c c4755c, long j) {
            C4907u.m30281a(c4755c.f20813b, 0, j);
            while (j > 0) {
                this.f21984a.g();
                C2992p c2992p = c4755c.f20812a;
                int min = (int) Math.min(j, (long) (c2992p.f12686c - c2992p.f12685b));
                this.f21985b.write(c2992p.f12684a, c2992p.f12685b, min);
                c2992p.f12685b += min;
                long j2 = (long) min;
                j -= j2;
                c4755c.f20813b -= j2;
                if (c2992p.f12685b == c2992p.f12686c) {
                    c4755c.f20812a = c2992p.b();
                    C2993q.a(c2992p);
                }
            }
        }

        public void flush() {
            this.f21985b.flush();
        }

        public void close() {
            this.f21985b.close();
        }

        /* renamed from: a */
        public C2996t m30333a() {
            return this.f21984a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sink(");
            stringBuilder.append(this.f21985b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: okio.m$2 */
    class C49172 implements C2995s {
        /* renamed from: a */
        final /* synthetic */ C2996t f21986a;
        /* renamed from: b */
        final /* synthetic */ InputStream f21987b;

        C49172(C2996t c2996t, InputStream inputStream) {
            this.f21986a = c2996t;
            this.f21987b = inputStream;
        }

        /* renamed from: a */
        public long m30334a(C4755c c4755c, long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f21986a.g();
                    C2992p f = c4755c.f(1);
                    j = this.f21987b.read(f.f12684a, f.f12686c, (int) Math.min(j, (long) (8192 - f.f12686c)));
                    if (j == -1) {
                        return -1;
                    }
                    f.f12686c += j;
                    j = (long) j;
                    c4755c.f20813b += j;
                    return j;
                } catch (AssertionError e) {
                    if (C4905m.m30274a(e) != null) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        public void close() {
            this.f21987b.close();
        }

        /* renamed from: a */
        public C2996t m30335a() {
            return this.f21986a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("source(");
            stringBuilder.append(this.f21987b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: okio.m$3 */
    class C49183 implements C2994r {
        public void close() {
        }

        public void flush() {
        }

        C49183() {
        }

        public void a_(C4755c c4755c, long j) {
            c4755c.i(j);
        }

        /* renamed from: a */
        public C2996t m30336a() {
            return C2996t.f12693c;
        }
    }

    private C4905m() {
    }

    /* renamed from: a */
    public static C4394e m30266a(C2995s c2995s) {
        return new C4920o(c2995s);
    }

    /* renamed from: a */
    public static C4393d m30265a(C2994r c2994r) {
        return new C4919n(c2994r);
    }

    /* renamed from: a */
    public static C2994r m30268a(OutputStream outputStream) {
        return C4905m.m30269a(outputStream, new C2996t());
    }

    /* renamed from: a */
    private static C2994r m30269a(OutputStream outputStream, C2996t c2996t) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (c2996t != null) {
            return new C49161(c2996t, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static C2994r m30270a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C2996t c = C4905m.m30277c(socket);
            return c.a(C4905m.m30269a(socket.getOutputStream(), c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: a */
    public static C2995s m30272a(InputStream inputStream) {
        return C4905m.m30273a(inputStream, new C2996t());
    }

    /* renamed from: a */
    private static C2995s m30273a(InputStream inputStream, C2996t c2996t) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (c2996t != null) {
            return new C49172(c2996t, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static C2995s m30271a(File file) {
        if (file != null) {
            return C4905m.m30272a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static C2994r m30275b(File file) {
        if (file != null) {
            return C4905m.m30268a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    public static C2994r m30278c(File file) {
        if (file != null) {
            return C4905m.m30268a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static C2994r m30267a() {
        return new C49183();
    }

    /* renamed from: b */
    public static C2995s m30276b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C2996t c = C4905m.m30277c(socket);
            return c.a(C4905m.m30273a(socket.getInputStream(), c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: c */
    private static C4392a m30277c(Socket socket) {
        return new m$4(socket);
    }

    /* renamed from: a */
    static boolean m30274a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || assertionError.getMessage().contains("getsockname failed") == null) ? null : true;
    }
}
