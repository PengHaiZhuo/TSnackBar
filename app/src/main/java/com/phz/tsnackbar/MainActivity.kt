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
        bt_tsnackbar_one.setOnClickListener {
            val ts=TopSnackbar.make(it,getString(R.string.my_name_is_top), TopSnackbar.LENGTH_SHORT,TopSnackbar.STYLE_ERROR)
            ts.show()
        }

        bt_tsnackbar_two.setOnClickListener {
            val ts=TopSnackbar.make(it,getString(R.string.my_name_is_top), TopSnackbar.LENGTH_SHORT,TopSnackbar.STYLE_WARNING)
            ts.show()
        }

        bt_tsnackbar_three.setOnClickListener {
            val ts=TopSnackbar.make(it,getString(R.string.my_name_is_top), TopSnackbar.LENGTH_SHORT,TopSnackbar.STYLE_COMPLETE)
            ts.show()
        }


        show_snack_bar.setOnClickListener {
            Snackbar.make(
                it,
                "我是源版SnackBar", Snackbar.LENGTH_SHORT
            ).show()
        }
    }
}