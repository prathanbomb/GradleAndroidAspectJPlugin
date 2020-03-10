package me.leolin.sample.normal

import android.app.Activity
import android.widget.TextView
import com.blankj.utilcode.util.LogUtils
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect

/**
 * @author leolin
 */
@Aspect
class ActivityAdvice {
    @After("execution(* me.leolin.sample.normal.MainActivity.onCreate(..))")
    fun afterOnCreate(joinPoint: JoinPoint) {
        val activity = joinPoint.target as Activity
        val textView = activity.findViewById<TextView>(R.id.textView)
        textView.text = "Hello AspectJ!"
    }

    @After("execution(* androidx.appcompat.app.AppCompatActivity.*(..))")
    fun afterCall(joinPoint: JoinPoint?) {
        LogUtils.i(joinPoint)
    }
}