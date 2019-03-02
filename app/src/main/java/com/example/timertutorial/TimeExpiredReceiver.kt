package com.example.timertutorial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.timertutorial.utils.PrefUtil

class TimeExpiredReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }

}
