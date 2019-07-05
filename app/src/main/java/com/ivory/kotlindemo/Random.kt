package com.ivory.kotlindemo

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.concurrent.ThreadLocalRandom

class Random : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNum()
    }

    private fun showRandomNum() {
        val count = intent.getIntExtra(TOTAL_COUNT,0)
        var random:ThreadLocalRandom = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ThreadLocalRandom.current()
        } else {
            TODO("VERSION.SDK_INT < LOLLIPOP")
        };
        var randomInt = 0
        if(count>0){
            //randomInt = random.nextInt(count+1)
            randomInt = (0 until count).random()
        }

        var num = findViewById<TextView>(R.id.txtRandom)
        num.text = randomInt.toString()
    }
}
