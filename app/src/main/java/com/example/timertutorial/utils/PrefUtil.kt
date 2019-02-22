package com.example.timertutorial.utils

import android.content.Context
import android.preference.PreferenceManager
import com.example.timertutorial.MainActivity

class PrefUtil {
    companion object {

        private const val PREVIOUS_TIMER_LENGTH_SECOND_ID = "mart.timer.previous_time_length"
        private const val TIMER_STATE_ID = "mart.timer.timer_state"
        private const val SECONDS_REMAINING_ID = "mart.timer.seconds_remaining"

        fun getTimerLength(context: Context): Int {
            return 1
        }

        fun getPreviousTimerLengthSeconds(context: Context): Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(PREVIOUS_TIMER_LENGTH_SECOND_ID, 0)
        }

        fun setPreviousTimerLengthSeconds(seconds: Long, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(TIMER_STATE_ID, seconds)
            editor.apply()
        }

        fun getTimerState(context: Context): MainActivity.TimerState {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val ordinal = preferences.getInt(TIMER_STATE_ID, 0)
            return MainActivity.TimerState.values()[ordinal]
        }

        fun setTimerState(state: MainActivity.TimerState, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            val ordinal = state.ordinal
            editor.putInt(TIMER_STATE_ID, ordinal)
            editor.apply()
        }

        fun getSecondRemaining(context: Context): Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SECONDS_REMAINING_ID, 0)
        }

        fun setSecondRemaining(seconds: Long, context: Context){
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit()
            editor.putLong(SECONDS_REMAINING_ID, seconds)
            editor.apply()
        }
    }
}