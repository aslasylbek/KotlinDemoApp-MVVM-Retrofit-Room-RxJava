package kz.uib.uiconstraintlayout

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout

class CustomViewBaseline: FrameLayout {

    val TAG = "CustomViewBaseline"

    constructor(context: Context) : super(context){
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs){
        init(context)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ){
        init(context)
    }

    override fun onFinishInflate() {
        Log.d(TAG, "onFinishInflate")
        super.onFinishInflate()
    }

    private fun init(context: Context){
        LayoutInflater.from(context).inflate(R.layout.custom_view_baseline, this, true)
        Log.d(TAG, "init")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d(TAG, "onAttachedToWindow")

    }

    override fun getBaseline(): Int {
        return findViewById<View>(R.id.button10).measuredHeight
    }
}