package com.vishal.mad_practical2_21012011043

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("on create method is called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("On start method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("On resume method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("On pause method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("On restart message is called")
    }
    fun showMessage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}