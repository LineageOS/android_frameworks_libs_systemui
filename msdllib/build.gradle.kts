plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin)
}

android {
    namespace = "com.google.android.msdl"
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
            manifest.srcFile("AndroidManifest.xml")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    implementation(libs.androidx.core)
}
