package com.phz.tsnackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.phz.topsnackbar.TopSnackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_snack_bar.setOnClickListener {
            Snackbar.make(
                it,
                "我是源版SnackBar", Snackbar.LENGTH_SHORT
            ).show()
        }
    }
}