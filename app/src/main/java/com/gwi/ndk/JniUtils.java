package com.gwi.ndk;

/**
 * Created by Administrator on 2016-12-6.
 */
public class JniUtils {
    static {
        System.loadLibrary("JniTest");
    }
    public static native String getStringFormC();
}
