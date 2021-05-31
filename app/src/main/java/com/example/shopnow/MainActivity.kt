package com.example.shopnow

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var topAnim: Animation
    lateinit var bottomAnim: Animation
    lateinit var image: ImageView
    lateinit var logo: TextView
    lateinit var slogan: TextView


    private val SPLASH_TIME_OUT:Long = 5000
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
//        actionBar?.hide()
        // Take instance of Action Bar
        // using getSupportActionBar and
        // if it is not Null
        // then call hide function
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        //Animations
        topAnim =AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim =AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks
        image = findViewById(R.id.image);
        logo = findViewById(R.id.textView);
        slogan = findViewById(R.id.textView2);

        image.startAnimation(topAnim)
        logo.startAnimation(bottomAnim)
        slogan.startAnimation(bottomAnim)

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,Welcome::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)

    }


}