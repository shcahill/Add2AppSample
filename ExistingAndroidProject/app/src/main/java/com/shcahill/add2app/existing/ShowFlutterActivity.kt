package com.shcahill.add2app.existing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.flutter.facade.Flutter

class ShowFlutterActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flutter)

        val tx = supportFragmentManager.beginTransaction()
        tx.replace(R.id.container, Flutter.createFragment("route_counter"))
        tx.commit()
    }
}