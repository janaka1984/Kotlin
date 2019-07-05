package com.ivory.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    fun toastMe(view:View) {
        Toast.makeText(this,"Toast ME!",Toast.LENGTH_SHORT).show();
    }

    fun countMe(view:View){
        val showCount = findViewById<TextView>(R.id.textView);
        var count = showCount.text.toString()
        var i:Int = Integer.parseInt(count);
        i++;
        showCount.text = i.toString();
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this,Random::class.java)
        val count:Int = Integer.parseInt(textView.text.toString())
        randomIntent.putExtra(Random.TOTAL_COUNT,count);
        startActivity(randomIntent);
    }

}
