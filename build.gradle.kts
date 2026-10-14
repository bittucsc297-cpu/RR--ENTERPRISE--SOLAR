plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.rrenterprise.solar"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.rrenterprise.solar"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
