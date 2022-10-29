package com.example.lifecycleawareness

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.example.lifecycleawareness.ui.main.MainViewModel
import java.time.LocalDateTime

class DemoObserver: LifecycleObserver {
    val currentDate: LocalDateTime = LocalDateTime.now()

        private val LOG_TAG = "DemoObserver"
        var mv = MainViewModel


        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        fun onCreate() {
            Log.i(LOG_TAG, "onCreatething")
            mv.setNames("create " + LocalDateTime.now() + "\n")

        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        fun onStart() {
            Log.i(LOG_TAG, "onStart")
            mv.setNames("start " + LocalDateTime.now() + "\n")
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        fun onResume() {
            mv.setNames("resume " + LocalDateTime.now() + "\n")
            mv.setNames("**** \n")
            Log.i(LOG_TAG, "onResume")

        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        fun onPause() {
            Log.i(LOG_TAG, "onPause")
            mv.setNames("pause " + LocalDateTime.now() + "\n")
            mv.setNames("**** \n")

        }


        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        fun onStop() {
            Log.i(LOG_TAG, "onStop")
            mv.setNames("stop " + LocalDateTime.now() + "\n")

        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        fun onDestroy() {
            Log.i(LOG_TAG, "onDestroy")
            mv.setNames("destroy " + LocalDateTime.now() + "\n")
            mv.setNames("**** \n")

        }
    }

