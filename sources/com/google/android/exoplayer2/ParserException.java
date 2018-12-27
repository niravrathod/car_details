package com.google.android.exoplayer2;

import java.io.IOException;

public class ParserException extends IOException {
    public ParserException(String str) {
        super(str);
    }

    public ParserException(String str, Throwable th) {
        super(str, th);
    }
}
