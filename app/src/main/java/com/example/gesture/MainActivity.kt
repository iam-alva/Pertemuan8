package com.example.gesture

import android.os.Bundle
import android.view.GestureDetector
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.MotionEventCompat as MotionEventCompat1

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    override fun onDoubleTapEvent(event: MotionEvent): Boolean {
       gesture_status.text="onDoubleTap"
        return true
    }

    //variabel untuk mendeteksi Gesture yang diberi nilai awal yaitu null
    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //membuat class turunan GestureDetectorCompat
        this.gDetector= GestureDetectorCompat(this, this)

        //mendeteksi ketukan ganda
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)

        //memastikan untuk memanggil implementasi superclass
        return super.onTouchEvent(event)
    }

    override fun onDown(event: MotionEvent): Boolean {
       gesture_status.text="onDown"
        return true
    }

    //implementasi untuk ketukan melepar atau onFling
    override fun onFling(event1: MotionEvent, event2: MotionEvent,
                         velocityX: Float, velocityY: Float): Boolean {
        gesture_status.text="onFling"
        return true
    }

    //implementasi untuk ketukan lama atau onLongPress
    override fun onLongPress(event: MotionEvent) {
        gesture_status.text="onLongPress"
    }

    //implementasi untuk melakukan scroll atau onScroll
    override fun onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Float, distanceY: Float): Boolean {
       gesture_status.text="onScroll"
        return true
    }

    //implementasi untuk menekan atau onShowPress
    override fun onShowPress(event: MotionEvent) {
        gesture_status.text="onShowPress"
    }

    //implementasi untuk sekali ketuk atau onSingleTapUp
    override fun onSingleTapUp(event: MotionEvent): Boolean {
       gesture_status.text="onSingleTapUp"
        return true
    }

    //implementasi untuk ketukan berulang kali atau onDOubleTap
    override fun onDoubleTap(event: MotionEvent): Boolean {
       gesture_status.text="onDoubleTap"
        return true
    }

    //implmentasi untuk satu kali ketukan dikonfirmasi atau onSingleTapConfirmed
    override fun onSingleTapConfirmed(event: MotionEvent): Boolean {
        gesture_status.text="onSingleTapConfirmated"
        return true
    }
}
