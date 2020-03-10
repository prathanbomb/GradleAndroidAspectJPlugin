package th.co.digio.sampleapp_00_aspectwithkotlin.aspect

import android.app.Activity
import android.util.Log
import android.widget.TextView
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import th.co.digio.sampleapp_00_aspectwithkotlin.R

/**
 * Created by supitsara on 9/3/2020 AD.
 */
@Aspect
class LoggerAspect {

    @After("execution(* th.co.digio.sampleapp_00_aspectwithkotlin.*.onCreate(..))")
    fun afterCreate(joinPoint: JoinPoint) {
        val activity = joinPoint.target as Activity
        val textView = activity.findViewById<TextView>(R.id.tv_main)
        textView.text = "Hello From AspectJ!"
    }

    @After("execution(* *.on*(..))")
    fun afterCall(joinPoint: JoinPoint) {
        Log.i("call", "from $joinPoint")
    }
}