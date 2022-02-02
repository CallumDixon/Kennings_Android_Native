package com.example.kennings_android_native

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.amplifyframework.AmplifyException
import com.amplifyframework.api.aws.AWSApiPlugin
import com.amplifyframework.core.Amplify
import com.example.kennings_android_native.ui.theme.Kennings_Android_NativeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            // Add these lines to add the AWSApiPlugin plugins
            Amplify.addPlugin(AWSApiPlugin())
            Amplify.configure(applicationContext)
            println("init")
        } catch (error: AmplifyException) {}

        setContent {
            Kennings_Android_NativeTheme {
                MainView()
            }
        }
    }
}