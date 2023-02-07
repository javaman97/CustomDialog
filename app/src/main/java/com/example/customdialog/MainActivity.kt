package com.example.customdialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDelete:Button= findViewById(R.id.btn_delete)
        btnDelete.setOnClickListener {
            val message:String?="Are you sure want to delete the content"
            showCustomDialogBox(message)
        }
    }

    private fun showCustomDialogBox(message: String?) {
        val dialog= Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog)
        val buttonConfirm:Button=dialog.findViewById(R.id.btn_confirm)
        buttonConfirm.setOnClickListener {
            Toast.makeText(this,"Content is deleted",Toast.LENGTH_LONG).show()
        }
        val buttonCancel:Button=dialog.findViewById(R.id.btn_cancel)
        buttonCancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}