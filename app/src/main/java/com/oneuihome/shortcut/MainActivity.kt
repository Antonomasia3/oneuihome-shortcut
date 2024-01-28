package com.oneuihome.shortcut

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        openApp("com.sec.android.app.launcher")
    }

    private fun openApp(packageName: String) {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.component = ComponentName(packageName, "$packageName.Launcher")
        startActivity(intent)
    }
}
