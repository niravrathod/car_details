package com.j256.ormlite.logger;

import com.j256.ormlite.logger.Log.Level;

public class LoggerFactory {
    public static final String LOG_TYPE_SYSTEM_PROPERTY = "com.j256.ormlite.logger.type";
    private static LogType logType;

    public enum LogType {
        ANDROID("android.util.Log", "com.j256.ormlite.android.AndroidLog"),
        SLF4J("org.slf4j.LoggerFactory", "com.j256.ormlite.logger.Slf4jLoggingLog"),
        COMMONS_LOGGING("org.apache.commons.logging.LogFactory", "com.j256.ormlite.logger.CommonsLoggingLog"),
        LOG4J2("org.apache.logging.log4j.LogManager", "com.j256.ormlite.logger.Log4j2Log"),
        LOG4J("org.apache.log4j.Logger", "com.j256.ormlite.logger.Log4jLog"),
        LOCAL(LocalLog.class.getName(), LocalLog.class.getName()) {
            public boolean isAvailable() {
                return true;
            }

            public Log createLog(String str) {
                return new LocalLog(str);
            }
        };
        
        private final String detectClassName;
        private final String logClassName;

        private LogType(String str, String str2) {
            this.detectClassName = str;
            this.logClassName = str2;
        }

        public Log createLog(String str) {
            try {
                return createLogFromClassName(str);
            } catch (Exception e) {
                Log localLog = new LocalLog(str);
                str = Level.WARNING;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to call constructor with single String argument for class ");
                stringBuilder.append(this.logClassName);
                stringBuilder.append(", so had to use local log: ");
                stringBuilder.append(e.getMessage());
                localLog.log(str, stringBuilder.toString());
                return localLog;
            }
        }

        public boolean isAvailable() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = r3.isAvailableTestClass();
            r1 = 0;
            if (r0 != 0) goto L_0x0008;
        L_0x0007:
            return r1;
        L_0x0008:
            r0 = r3.getClass();	 Catch:{ Exception -> 0x001b }
            r0 = r0.getName();	 Catch:{ Exception -> 0x001b }
            r0 = r3.createLogFromClassName(r0);	 Catch:{ Exception -> 0x001b }
            r2 = com.j256.ormlite.logger.Log.Level.INFO;	 Catch:{ Exception -> 0x001b }
            r0.isLevelEnabled(r2);	 Catch:{ Exception -> 0x001b }
            r0 = 1;
            return r0;
        L_0x001b:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.logger.LoggerFactory.LogType.isAvailable():boolean");
        }

        Log createLogFromClassName(String str) {
            return (Log) Class.forName(this.logClassName).getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
        }

        boolean isAvailableTestClass() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.detectClassName;	 Catch:{ Exception -> 0x0007 }
            java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0007 }
            r0 = 1;
            return r0;
        L_0x0007:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.logger.LoggerFactory.LogType.isAvailableTestClass():boolean");
        }
    }

    private LoggerFactory() {
    }

    public static Logger getLogger(Class<?> cls) {
        return getLogger(cls.getName());
    }

    public static Logger getLogger(String str) {
        if (logType == null) {
            logType = findLogType();
        }
        return new Logger(logType.createLog(str));
    }

    public static String getSimpleClassName(String str) {
        String[] split = str.split("\\.");
        if (split.length <= 1) {
            return str;
        }
        return split[split.length - 1];
    }

    private static com.j256.ormlite.logger.LoggerFactory.LogType findLogType() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = "com.j256.ormlite.logger.type";
        r0 = java.lang.System.getProperty(r0);
        if (r0 == 0) goto L_0x0033;
    L_0x0008:
        r1 = com.j256.ormlite.logger.LoggerFactory.LogType.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x000d }
        return r1;
    L_0x000d:
        r1 = new com.j256.ormlite.logger.LocalLog;
        r2 = com.j256.ormlite.logger.LoggerFactory.class;
        r2 = r2.getName();
        r1.<init>(r2);
        r2 = com.j256.ormlite.logger.Log.Level.WARNING;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Could not find valid log-type from system property 'com.j256.ormlite.logger.type', value '";
        r3.append(r4);
        r3.append(r0);
        r0 = "'";
        r3.append(r0);
        r0 = r3.toString();
        r1.log(r2, r0);
    L_0x0033:
        r0 = com.j256.ormlite.logger.LoggerFactory.LogType.values();
        r1 = r0.length;
        r2 = 0;
    L_0x0039:
        if (r2 >= r1) goto L_0x0047;
    L_0x003b:
        r3 = r0[r2];
        r4 = r3.isAvailable();
        if (r4 == 0) goto L_0x0044;
    L_0x0043:
        return r3;
    L_0x0044:
        r2 = r2 + 1;
        goto L_0x0039;
    L_0x0047:
        r0 = com.j256.ormlite.logger.LoggerFactory.LogType.LOCAL;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.logger.LoggerFactory.findLogType():com.j256.ormlite.logger.LoggerFactory$LogType");
    }
}
