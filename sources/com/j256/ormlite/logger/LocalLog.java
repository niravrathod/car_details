package com.j256.ormlite.logger;

import com.j256.ormlite.logger.Log.Level;
import java.io.File;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class LocalLog implements Log {
    private static final Level DEFAULT_LEVEL = Level.DEBUG;
    public static final String LOCAL_LOG_FILE_PROPERTY = "com.j256.ormlite.logger.file";
    public static final String LOCAL_LOG_LEVEL_PROPERTY = "com.j256.ormlite.logger.level";
    public static final String LOCAL_LOG_PROPERTIES_FILE = "/ormliteLocalLog.properties";
    private static final List<PatternLevel> classLevels = readLevelResourceFile(LocalLog.class.getResourceAsStream(LOCAL_LOG_PROPERTIES_FILE));
    private static final ThreadLocal<DateFormat> dateFormatThreadLocal = new C26721();
    private static PrintStream printStream;
    private final String className;
    private final Level level;

    /* renamed from: com.j256.ormlite.logger.LocalLog$1 */
    static class C26721 extends ThreadLocal<DateFormat> {
        C26721() {
        }

        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        }
    }

    private static class PatternLevel {
        Level level;
        Pattern pattern;

        public PatternLevel(Pattern pattern, Level level) {
            this.pattern = pattern;
            this.level = level;
        }
    }

    static {
        openLogFile(System.getProperty(LOCAL_LOG_FILE_PROPERTY));
    }

    public LocalLog(String str) {
        this.className = LoggerFactory.getSimpleClassName(str);
        Level level = null;
        if (classLevels != null) {
            for (PatternLevel patternLevel : classLevels) {
                if (patternLevel.pattern.matcher(str).matches() && (r1 == null || patternLevel.level.ordinal() < r1.ordinal())) {
                    level = patternLevel.level;
                }
            }
        }
        if (level == null) {
            str = System.getProperty(LOCAL_LOG_LEVEL_PROPERTY);
            if (str == null) {
                level = DEFAULT_LEVEL;
            } else {
                try {
                    level = Level.valueOf(str.toUpperCase());
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Level '");
                    stringBuilder.append(str);
                    stringBuilder.append("' was not found");
                    throw new IllegalArgumentException(stringBuilder.toString(), e);
                }
            }
        }
        this.level = level;
    }

    public static void openLogFile(String str) {
        if (str == null) {
            printStream = System.out;
            return;
        }
        try {
            printStream = new PrintStream(new File(str));
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Log file ");
            stringBuilder.append(str);
            stringBuilder.append(" was not found");
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    public boolean isLevelEnabled(Level level) {
        return this.level.isEnabled(level);
    }

    public void log(Level level, String str) {
        printMessage(level, str, null);
    }

    public void log(Level level, String str, Throwable th) {
        printMessage(level, str, th);
    }

    void flush() {
        printStream.flush();
    }

    static java.util.List<com.j256.ormlite.logger.LocalLog.PatternLevel> readLevelResourceFile(java.io.InputStream r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r4 == 0) goto L_0x002b;
    L_0x0002:
        r0 = configureClassLevels(r4);	 Catch:{ IOException -> 0x000c }
        r4.close();	 Catch:{ IOException -> 0x002c }
        goto L_0x002c;
    L_0x000a:
        r0 = move-exception;
        goto L_0x0027;
    L_0x000c:
        r0 = move-exception;
        r1 = java.lang.System.err;	 Catch:{ all -> 0x000a }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x000a }
        r2.<init>();	 Catch:{ all -> 0x000a }
        r3 = "IO exception reading the log properties file '/ormliteLocalLog.properties': ";	 Catch:{ all -> 0x000a }
        r2.append(r3);	 Catch:{ all -> 0x000a }
        r2.append(r0);	 Catch:{ all -> 0x000a }
        r0 = r2.toString();	 Catch:{ all -> 0x000a }
        r1.println(r0);	 Catch:{ all -> 0x000a }
        r4.close();	 Catch:{ IOException -> 0x002b }
        goto L_0x002b;
    L_0x0027:
        r4.close();	 Catch:{ IOException -> 0x002a }
    L_0x002a:
        throw r0;
    L_0x002b:
        r0 = 0;
    L_0x002c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.logger.LocalLog.readLevelResourceFile(java.io.InputStream):java.util.List<com.j256.ormlite.logger.LocalLog$PatternLevel>");
    }

    private static java.util.List<com.j256.ormlite.logger.LocalLog.PatternLevel> configureClassLevels(java.io.InputStream r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.io.BufferedReader;
        r1 = new java.io.InputStreamReader;
        r1.<init>(r6);
        r0.<init>(r1);
        r6 = new java.util.ArrayList;
        r6.<init>();
    L_0x000f:
        r1 = r0.readLine();
        if (r1 != 0) goto L_0x0016;
    L_0x0015:
        return r6;
    L_0x0016:
        r2 = r1.length();
        if (r2 == 0) goto L_0x000f;
    L_0x001c:
        r2 = 0;
        r3 = r1.charAt(r2);
        r4 = 35;
        if (r3 != r4) goto L_0x0026;
    L_0x0025:
        goto L_0x000f;
    L_0x0026:
        r3 = "=";
        r3 = r1.split(r3);
        r4 = r3.length;
        r5 = 2;
        if (r4 == r5) goto L_0x0047;
    L_0x0030:
        r2 = java.lang.System.err;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Line is not in the format of 'pattern = level': ";
        r3.append(r4);
        r3.append(r1);
        r1 = r3.toString();
        r2.println(r1);
        goto L_0x000f;
    L_0x0047:
        r1 = r3[r2];
        r1 = r1.trim();
        r1 = java.util.regex.Pattern.compile(r1);
        r2 = 1;
        r4 = r3[r2];	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = r4.trim();	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = com.j256.ormlite.logger.Log.Level.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = new com.j256.ormlite.logger.LocalLog$PatternLevel;
        r2.<init>(r1, r4);
        r6.add(r2);
        goto L_0x000f;
    L_0x0065:
        r1 = java.lang.System.err;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Level '";
        r4.append(r5);
        r2 = r3[r2];
        r4.append(r2);
        r2 = "' was not found";
        r4.append(r2);
        r2 = r4.toString();
        r1.println(r2);
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.logger.LocalLog.configureClassLevels(java.io.InputStream):java.util.List<com.j256.ormlite.logger.LocalLog$PatternLevel>");
    }

    private void printMessage(Level level, String str, Throwable th) {
        if (isLevelEnabled(level)) {
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append(((DateFormat) dateFormatThreadLocal.get()).format(new Date()));
            stringBuilder.append(" [");
            stringBuilder.append(level.name());
            stringBuilder.append("] ");
            stringBuilder.append(this.className);
            stringBuilder.append(' ');
            stringBuilder.append(str);
            printStream.println(stringBuilder.toString());
            if (th != null) {
                th.printStackTrace(printStream);
            }
        }
    }
}
