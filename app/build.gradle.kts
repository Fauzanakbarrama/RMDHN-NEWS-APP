plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.rmdhnnews"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.rmdhnnews"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.swiperefreshlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Design
    implementation ("com.google.android.material:material:1.0.0")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.4.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.2.0")

    //Date/Time
    implementation ("org.ocpsoft.prettytime:prettytime:4.0.1.Final")

    //Picaso for image url
    implementation ("com.squareup.picasso:picasso:2.5.0")

    implementation ("androidx.core:core-splashscreen:1.0.1")
}