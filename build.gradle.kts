buildscript {
    repositories {
        google()  // Google's Maven repository
        mavenCentral()  // Maven Central repository
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.15")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
        classpath("com.android.tools.build:gradle:8.0.0")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.5")
    }
}
tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}