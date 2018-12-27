package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

class m$4 extends C4392a {
    /* renamed from: a */
    final /* synthetic */ Socket f20814a;

    m$4(Socket socket) {
        this.f20814a = socket;
    }

    /* renamed from: a */
    protected IOException mo4542a(@Nullable IOException iOException) {
        IOException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* renamed from: a */
    protected void mo4543a() {
        Logger logger;
        Level level;
        StringBuilder stringBuilder;
        try {
            this.f20814a.close();
        } catch (Throwable e) {
            logger = C4905m.f21954a;
            level = Level.WARNING;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to close timed out socket ");
            stringBuilder.append(this.f20814a);
            logger.log(level, stringBuilder.toString(), e);
        } catch (Throwable e2) {
            if (C4905m.a(e2)) {
                logger = C4905m.f21954a;
                level = Level.WARNING;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to close timed out socket ");
                stringBuilder.append(this.f20814a);
                logger.log(level, stringBuilder.toString(), e2);
                return;
            }
            throw e2;
        }
    }
}
