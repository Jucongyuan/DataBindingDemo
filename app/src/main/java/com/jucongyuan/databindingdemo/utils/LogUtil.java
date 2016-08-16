package com.jucongyuan.databindingdemo.utils;

import android.util.Log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class LogUtil {

    private static final String TAG_LOG = "YIWEN";
    private static final String TAG_EXCEPTION = TAG_LOG + " Exception";

    public static void Ld(String content) {
        Log.d(TAG_LOG, content);
    }

    public static void Li(String content) {
        Log.i(TAG_LOG, content);
    }

    public static void Le(String content) {
        Le(content, null);
    }

    public static void Le(String content, Throwable e) {
        String error_str = "";
        if (null != e) {
            Writer writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            e.printStackTrace(printWriter);
            Throwable cause = e.getCause();
            while (cause != null) {
                cause.printStackTrace(printWriter);
                cause = cause.getCause();
            }
            printWriter.close();
            error_str = "\n" + writer.toString();
        }
        Log.e(TAG_EXCEPTION, content + error_str);
    }
}
