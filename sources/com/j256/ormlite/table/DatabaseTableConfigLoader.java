package com.j256.ormlite.table;

import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.field.DatabaseFieldConfigLoader;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTableConfigLoader {
    private static final String CONFIG_FILE_END_MARKER = "# --table-end--";
    private static final String CONFIG_FILE_FIELDS_END = "# --table-fields-end--";
    private static final String CONFIG_FILE_FIELDS_START = "# --table-fields-start--";
    private static final String CONFIG_FILE_START_MARKER = "# --table-start--";
    private static final String FIELD_NAME_DATA_CLASS = "dataClass";
    private static final String FIELD_NAME_TABLE_NAME = "tableName";

    public static List<DatabaseTableConfig<?>> loadDatabaseConfigFromReader(BufferedReader bufferedReader) {
        List<DatabaseTableConfig<?>> arrayList = new ArrayList();
        while (true) {
            DatabaseTableConfig fromReader = fromReader(bufferedReader);
            if (fromReader == null) {
                return arrayList;
            }
            arrayList.add(fromReader);
        }
    }

    public static <T> DatabaseTableConfig<T> fromReader(BufferedReader bufferedReader) {
        DatabaseTableConfig<T> databaseTableConfig = new DatabaseTableConfig();
        Object obj = null;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.equals(CONFIG_FILE_END_MARKER)) {
                    break;
                } else if (readLine.equals(CONFIG_FILE_FIELDS_START)) {
                    readFields(bufferedReader, databaseTableConfig);
                } else if (!(readLine.length() == 0 || readLine.startsWith("#"))) {
                    if (!readLine.equals(CONFIG_FILE_START_MARKER)) {
                        String[] split = readLine.split(SimpleComparison.EQUAL_TO_OPERATION, -2);
                        if (split.length == 2) {
                            readTableField(databaseTableConfig, split[0], split[1]);
                            obj = 1;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("DatabaseTableConfig reading from stream cannot parse line: ");
                            stringBuilder.append(readLine);
                            throw new SQLException(stringBuilder.toString());
                        }
                    }
                }
            } catch (BufferedReader bufferedReader2) {
                throw SqlExceptionUtil.create("Could not read DatabaseTableConfig from stream", bufferedReader2);
            }
        }
        return obj != null ? databaseTableConfig : null;
    }

    public static <T> void write(BufferedWriter bufferedWriter, DatabaseTableConfig<T> databaseTableConfig) {
        try {
            writeConfig(bufferedWriter, databaseTableConfig);
        } catch (BufferedWriter bufferedWriter2) {
            throw SqlExceptionUtil.create("Could not write config to writer", bufferedWriter2);
        }
    }

    private static <T> void writeConfig(BufferedWriter bufferedWriter, DatabaseTableConfig<T> databaseTableConfig) {
        bufferedWriter.append(CONFIG_FILE_START_MARKER);
        bufferedWriter.newLine();
        if (databaseTableConfig.getDataClass() != null) {
            bufferedWriter.append(FIELD_NAME_DATA_CLASS).append('=').append(databaseTableConfig.getDataClass().getName());
            bufferedWriter.newLine();
        }
        if (databaseTableConfig.getTableName() != null) {
            bufferedWriter.append(FIELD_NAME_TABLE_NAME).append('=').append(databaseTableConfig.getTableName());
            bufferedWriter.newLine();
        }
        bufferedWriter.append(CONFIG_FILE_FIELDS_START);
        bufferedWriter.newLine();
        if (databaseTableConfig.getFieldConfigs() != null) {
            for (DatabaseFieldConfig write : databaseTableConfig.getFieldConfigs()) {
                DatabaseFieldConfigLoader.write(bufferedWriter, write, databaseTableConfig.getTableName());
            }
        }
        bufferedWriter.append(CONFIG_FILE_FIELDS_END);
        bufferedWriter.newLine();
        bufferedWriter.append(CONFIG_FILE_END_MARKER);
        bufferedWriter.newLine();
    }

    private static <T> void readTableField(com.j256.ormlite.table.DatabaseTableConfig<T> r1, java.lang.String r2, java.lang.String r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = "dataClass";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0008:
        r2 = java.lang.Class.forName(r3);	 Catch:{ ClassNotFoundException -> 0x0010 }
        r1.setDataClass(r2);	 Catch:{ ClassNotFoundException -> 0x0010 }
        goto L_0x0032;
    L_0x0010:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = "Unknown class specified for dataClass: ";
        r2.append(r0);
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0027:
        r0 = "tableName";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x0032;
    L_0x002f:
        r1.setTableName(r3);
    L_0x0032:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.table.DatabaseTableConfigLoader.readTableField(com.j256.ormlite.table.DatabaseTableConfig, java.lang.String, java.lang.String):void");
    }

    private static <T> void readFields(BufferedReader bufferedReader, DatabaseTableConfig<T> databaseTableConfig) {
        List arrayList = new ArrayList();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.equals(CONFIG_FILE_FIELDS_END)) {
                    break;
                } else {
                    DatabaseFieldConfig fromReader = DatabaseFieldConfigLoader.fromReader(bufferedReader);
                    if (fromReader == null) {
                        break;
                    }
                    arrayList.add(fromReader);
                }
            } catch (BufferedReader bufferedReader2) {
                throw SqlExceptionUtil.create("Could not read next field from config file", bufferedReader2);
            }
        }
        databaseTableConfig.setFieldConfigs(arrayList);
    }
}
