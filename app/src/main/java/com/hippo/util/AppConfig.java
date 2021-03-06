/*
 * Copyright (C) 2015 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.util;

import android.os.Environment;
import android.support.annotation.Nullable;

import java.io.File;

/**
 * Something about this app
 */
public final class AppConfig {

    private static final String APP_FOLDER_NAME = "EhViewer";

    public static @Nullable File getAppFolder() {
        if (Environment.getExternalStorageState()
                .equals(android.os.Environment.MEDIA_MOUNTED)) {
            return new File(Environment.getExternalStorageDirectory(), APP_FOLDER_NAME);
        } else {
            return null;
        }
    }

    public static @Nullable File getFileInAppFolder(String filename) {
        File appFolder = getAppFolder();
        if (appFolder != null) {
            return new File(appFolder, filename);
        } else {
            return null;
        }
    }
}
