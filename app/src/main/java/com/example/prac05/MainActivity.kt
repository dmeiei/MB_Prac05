package com.example.prac05

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.WindowMetrics
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.Dimension
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main2)


        /* findViewById<Button>(R.id.myButton).setOnClickListener {
             findViewById<TextView>(R.id.textView).text = getString(R.string.text_data2)
             findViewById<TextView>(R.id.textView).setTextColor(ResourcesCompat.getColor(resources,R.color.text_color, null))
 //            findViewById<TextView>(R.id.textView).textSize = resources.getDimension(R.dimen.text_size)
             findViewById<TextView>(R.id.textView).setTextSize(Dimension.DP, resources.getDimension(R.dimen.text_size))

             findViewById<ImageView>(R.id.myImage).setImageDrawable(ResourcesCompat.getDrawable(resources,android.R.drawable.alert_light_frame,null))
             findViewById<TextView>(R.id.myText).text= getString(android.R.string.httpErrorBadUrl)
         }*/

//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
//            val windowMetrics: WindowMetrics = windowManager.currentWindowMetrics
//            findViewById<TextView>(R.id.myText).text = "width: ${windowMetrics.bounds.width()}," +
//                    "height: ${windowMetrics.bounds.height()}"
//        }else{
//            val display = windowManager.defaultDisplay
//            val displayMetrics = DisplayMetrics()
//            display?.getRealMetrics(displayMetrics)
//            findViewById<TextView>(R.id.myText).text = "idth: ${displayMetrics.widthPixels}," +
//                    "height: ${displayMetrics.heightPixels}"
//        }

    }
}