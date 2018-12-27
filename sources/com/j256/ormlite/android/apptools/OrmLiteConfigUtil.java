package com.j256.ormlite.android.apptools;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.db.SqliteAndroidDatabaseType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.j256.ormlite.table.DatabaseTableConfigLoader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrmLiteConfigUtil {
    protected static final String RAW_DIR_NAME = "raw";
    protected static final String RESOURCE_DIR_NAME = "res";
    private static final DatabaseType databaseType = new SqliteAndroidDatabaseType();
    protected static int maxFindSourceLevel = 20;

    /* renamed from: com.j256.ormlite.android.apptools.OrmLiteConfigUtil$1 */
    static class C26651 implements FileFilter {
        C26651() {
        }

        public boolean accept(File file) {
            return (!file.getName().equals(OrmLiteConfigUtil.RAW_DIR_NAME) || file.isDirectory() == null) ? null : true;
        }
    }

    public static void main(String[] strArr) {
        if (strArr.length == 1) {
            writeConfigFile(strArr[0]);
            return;
        }
        throw new IllegalArgumentException("Main can take a single file-name argument.");
    }

    public static void writeConfigFile(String str) {
        List arrayList = new ArrayList();
        findAnnotatedClasses(arrayList, new File("."), 0);
        writeConfigFile(str, (Class[]) arrayList.toArray(new Class[arrayList.size()]));
    }

    public static void writeConfigFile(String str, Class<?>[] clsArr) {
        File findRawDir = findRawDir(new File("."));
        if (findRawDir == null) {
            System.err.println("Could not find raw directory which is typically in the res directory");
        } else {
            writeConfigFile(new File(findRawDir, str), (Class[]) clsArr);
        }
    }

    public static void writeConfigFile(File file) {
        writeConfigFile(file, new File("."));
    }

    public static void writeConfigFile(File file, File file2) {
        List arrayList = new ArrayList();
        findAnnotatedClasses(arrayList, file2, 0);
        writeConfigFile(file, (Class[]) arrayList.toArray(new Class[arrayList.size()]));
    }

    public static void writeConfigFile(File file, Class<?>[] clsArr) {
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Writing configurations to ");
        stringBuilder.append(file.getAbsolutePath());
        printStream.println(stringBuilder.toString());
        writeConfigFile(new FileOutputStream(file), (Class[]) clsArr);
    }

    public static void writeConfigFile(OutputStream outputStream, File file) {
        List arrayList = new ArrayList();
        findAnnotatedClasses(arrayList, file, 0);
        writeConfigFile(outputStream, (Class[]) arrayList.toArray(new Class[arrayList.size()]));
    }

    public static void writeConfigFile(OutputStream outputStream, Class<?>[] clsArr) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream), 4096);
        try {
            writeHeader(bufferedWriter);
            for (Class writeConfigForTable : clsArr) {
                writeConfigForTable(bufferedWriter, writeConfigForTable);
            }
            System.out.println("Done.");
        } finally {
            bufferedWriter.close();
        }
    }

    protected static File findRawDir(File file) {
        int i = 0;
        while (file != null && i < 20) {
            File findResRawDir = findResRawDir(file);
            if (findResRawDir != null) {
                return findResRawDir;
            }
            file = file.getParentFile();
            i++;
        }
        return null;
    }

    private static void writeHeader(BufferedWriter bufferedWriter) {
        bufferedWriter.append('#');
        bufferedWriter.newLine();
        bufferedWriter.append("# generated on ").append(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date()));
        bufferedWriter.newLine();
        bufferedWriter.append('#');
        bufferedWriter.newLine();
    }

    private static void findAnnotatedClasses(List<Class<?>> list, File file, int i) {
        PrintStream printStream;
        StringBuilder stringBuilder;
        PrintStream printStream2;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                if (i < maxFindSourceLevel) {
                    findAnnotatedClasses(list, file2, i + 1);
                }
            } else if (file2.getName().endsWith(".java")) {
                String packageOfClass = getPackageOfClass(file2);
                if (packageOfClass == null) {
                    printStream = System.err;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not find package name for: ");
                    stringBuilder.append(file2);
                    printStream.println(stringBuilder.toString());
                } else {
                    String name = file2.getName();
                    name = name.substring(0, name.length() - ".java".length());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(packageOfClass);
                    stringBuilder2.append(".");
                    stringBuilder2.append(name);
                    try {
                        Class cls = Class.forName(stringBuilder2.toString());
                        if (classHasAnnotations(cls)) {
                            list.add(cls);
                        }
                        try {
                            for (Class cls2 : cls.getDeclaredClasses()) {
                                if (classHasAnnotations(cls2)) {
                                    list.add(cls2);
                                }
                            }
                        } catch (Throwable th) {
                            printStream2 = System.err;
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Could not load inner classes for: ");
                            stringBuilder2.append(cls);
                            printStream2.println(stringBuilder2.toString());
                            printStream = System.err;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("     ");
                            stringBuilder.append(th);
                            printStream.println(stringBuilder.toString());
                        }
                    } catch (Throwable th2) {
                        printStream2 = System.err;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Could not load class file for: ");
                        stringBuilder2.append(file2);
                        printStream2.println(stringBuilder2.toString());
                        PrintStream printStream3 = System.err;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("     ");
                        stringBuilder.append(th2);
                        printStream3.println(stringBuilder.toString());
                    }
                }
            }
        }
    }

    private static void writeConfigForTable(BufferedWriter bufferedWriter, Class<?> cls) {
        String extractTableName = DatabaseTableConfig.extractTableName(cls);
        List arrayList = new ArrayList();
        Class cls2 = cls;
        while (cls2 != null) {
            try {
                for (Field fromField : cls2.getDeclaredFields()) {
                    DatabaseFieldConfig fromField2 = DatabaseFieldConfig.fromField(databaseType, extractTableName, fromField);
                    if (fromField2 != null) {
                        arrayList.add(fromField2);
                    }
                }
                cls2 = cls2.getSuperclass();
            } catch (BufferedWriter bufferedWriter2) {
                PrintStream printStream = System.err;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Skipping ");
                stringBuilder.append(cls);
                stringBuilder.append(" because we got an error finding its definition: ");
                stringBuilder.append(bufferedWriter2.getMessage());
                printStream.println(stringBuilder.toString());
                return;
            }
        }
        if (arrayList.isEmpty()) {
            bufferedWriter2 = System.out;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Skipping ");
            stringBuilder2.append(cls);
            stringBuilder2.append(" because no annotated fields found");
            bufferedWriter2.println(stringBuilder2.toString());
            return;
        }
        DatabaseTableConfigLoader.write(bufferedWriter2, new DatabaseTableConfig((Class) cls, extractTableName, arrayList));
        bufferedWriter2.append("#################################");
        bufferedWriter2.newLine();
        bufferedWriter2 = System.out;
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Wrote config for ");
        stringBuilder2.append(cls);
        bufferedWriter2.println(stringBuilder2.toString());
    }

    private static boolean classHasAnnotations(Class<?> cls) {
        PrintStream printStream;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        while (cls != null) {
            if (cls.getAnnotation(DatabaseTable.class) != null) {
                return true;
            }
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (i < length) {
                    Field field = declaredFields[i];
                    if (field.getAnnotation(DatabaseField.class) == null) {
                        if (field.getAnnotation(ForeignCollectionField.class) == null) {
                            i++;
                        }
                    }
                    return true;
                }
                try {
                    cls = cls.getSuperclass();
                } catch (Throwable th) {
                    printStream = System.err;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not get super class for: ");
                    stringBuilder.append(cls);
                    printStream.println(stringBuilder.toString());
                    cls = System.err;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("     ");
                    stringBuilder2.append(th);
                    cls.println(stringBuilder2.toString());
                    return false;
                }
            } catch (Throwable th2) {
                printStream = System.err;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Could not load get delcared fields from: ");
                stringBuilder.append(cls);
                printStream.println(stringBuilder.toString());
                cls = System.err;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("     ");
                stringBuilder2.append(th2);
                cls.println(stringBuilder2.toString());
                return false;
            }
        }
        return false;
    }

    private static String getPackageOfClass(File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            file = bufferedReader.readLine();
            if (file == null) {
                bufferedReader.close();
                return null;
            }
            try {
                if (file.contains("package")) {
                    file = file.split("[ \t;]");
                    if (file.length > 1 && file[0].equals("package")) {
                        break;
                    }
                }
            } finally {
                bufferedReader.close();
            }
        }
        file = file[1];
        return file;
    }

    private static File findResRawDir(File file) {
        for (File file2 : file.listFiles()) {
            if (file2.getName().equals(RESOURCE_DIR_NAME) && file2.isDirectory()) {
                File[] listFiles = file2.listFiles(new C26651());
                if (listFiles.length == 1) {
                    return listFiles[0];
                }
            }
        }
        return null;
    }
}
