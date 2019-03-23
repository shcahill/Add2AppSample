package com.shcahill.add2app.existing

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import io.flutter.facade.Flutter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            startActivity(Intent(this,ShowFlutterActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                showFlutterView()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showFlutterView() {
        val flutterView = Flutter.createView(
            this,
            lifecycle,
            "route1"
        )
        val layout = FrameLayout.LayoutParams(600, 800)
        layout.leftMargin = 100
        layout.topMargin = 200
        addContentView(flutterView, layout)
    }
}
