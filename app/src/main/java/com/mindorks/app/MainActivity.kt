package com.mindorks.app

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.TextView
import com.mindorks.RadialProgressBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD

         progress.setProgressValues(70, 90, 90)



=======
        progress.setProgressValues(70, 90, 90)
        val outerColor = ArrayList<Int>()
        outerColor.add(Color.parseColor("#fbab00"))
        outerColor.add(Color.parseColor("#f5004b"))
        progress.setOuterProgressColor(outerColor)
>>>>>>> 78f2352782ec2b66d9462077ab518b3f1e45b324


        val innerColor = ArrayList<Int>()
        innerColor.add(Color.parseColor("#5eb3fc"))
        innerColor.add(Color.parseColor("#28007d"))
        progress.setInnerProgressColor(innerColor)

        val centerColor = ArrayList<Int>()
        centerColor.add(Color.parseColor("#3affaa"))
        centerColor.add(Color.parseColor("#1b93ff"))
        progress.setCenterProgressColor(centerColor)

        progress.usePerCenter()
    }
}

