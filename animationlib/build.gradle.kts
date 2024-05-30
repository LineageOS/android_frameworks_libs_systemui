plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin)
}

android {
    namespace = "com.android.app.animation"
    compileSdk = 36

    defaultConfig {
        minSdk = 36
        vectorDrawables.useSupportLibrary = true
    }

    lint {
        abortOnError = true
        checkReleaseBuilds = false
    }

    sourceSets {
        named("main") {
            java.srcDirs("src")
            res.srcDirs("res")
            manifest.srcFile("AndroidManifest.xml")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    implementation(libs.androidx.core.animation)
    implementation(libs.androidx.core)
}
