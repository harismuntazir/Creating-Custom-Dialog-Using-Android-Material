package com.badtools.cards

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {

    private lateinit var dialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog = Dialog(this)

        findViewById<Button>(R.id.btn).setOnClickListener {
            win()
        }
    }

    private fun win() {
        dialog.setContentView(R.layout.win_layout_dialog)
        val close = dialog.findViewById<ImageView>(R.id.imgClose)
        close.setOnClickListener {
            dialog.dismiss()
        }
        val ok = dialog.findViewById<Button>(R.id.ok)
        ok.setOnClickListener {
            Toast.makeText(applicationContext, "something to do on this button", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

}