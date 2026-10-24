plugins {
    id("com.android.application")
}

android {
    namespace = "dev.soughtxp.wamodx"
    compileSdk = 33

    defaultConfig {
        applicationId = "dev.soughtxp.wamodx"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        buildConfig = false
    }

    lint {
        abortOnError = false
        checkReleaseBuilds = false
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    packagingOptions {
        resources {
            excludes.add("**")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    compileOnly(project(":stubs"))
    // BaseActivity (a stub) extends AppCompatActivity, so the app needs
    // appcompat on its compile classpath to resolve the inherited members.
    // compileOnly: it is provided by the host WhatsApp APK at runtime.
    compileOnly("androidx.appcompat:appcompat:1.6.1")
}

base {
    archivesName.set("WaModX")
}
