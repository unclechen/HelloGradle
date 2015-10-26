package com.nought.hellolib;

import android.util.Log;

public class UncleNought {

    public static boolean ENABLE_DEBUG = true;

    public static void Output() {
        if (ENABLE_DEBUG) {
            Log.i(UncleNought.class.getSimpleName(), "I'm a library!");
        }
    }
}
