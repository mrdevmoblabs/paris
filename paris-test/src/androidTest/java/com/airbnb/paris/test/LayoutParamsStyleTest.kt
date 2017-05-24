package com.airbnb.paris.test

import android.content.Context
import android.content.res.Resources
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.view.View
import android.view.ViewGroup
import com.airbnb.paris.LayoutParamsStyleApplier
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LayoutParamsStyleTest {

    lateinit var context: Context
    lateinit var res: Resources
    lateinit var view: View

    var params: ViewGroup.LayoutParams? = null
    var marginParams: ViewGroup.MarginLayoutParams? = null

    @Before
    fun setup() {
        context = InstrumentationRegistry.getTargetContext()
        res = context.resources
        view = View(context)
    }

    @Test
    fun layoutParamsWidthHeight() {
        params = view.layoutParams
        assertNull(params)

        LayoutParamsStyleApplier(view).apply(R.style.Test_LayoutParams_width_height)

        params = view.layoutParams
        assertNotNull(params)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_width), params!!.width)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_height), params!!.height)
    }

    @Test
    fun layoutParamsIgnoreWidthHeight() {
        params = view.layoutParams
        assertNull(params)

        LayoutParamsStyleApplier(view)
                .addOption(LayoutParamsStyleApplier.Option.IgnoreLayoutWidthAndHeight)
                .apply(R.style.Test_LayoutParams_width_height)

        params = view.layoutParams
        assertNull(params)
    }

    @Test
    fun layoutParamsMargin() {
        params = view.layoutParams
        assertNull(params)

        LayoutParamsStyleApplier(view).apply(R.style.Test_LayoutParams_margin)

        marginParams = view.layoutParams as ViewGroup.MarginLayoutParams
        assertNotNull(marginParams)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_margin), marginParams!!.bottomMargin)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_margin), marginParams!!.leftMargin)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_margin), marginParams!!.rightMargin)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_margin), marginParams!!.topMargin)
    }

    @Test
    fun layoutParamsMargins() {
        params = view.layoutParams
        assertNull(params)

        LayoutParamsStyleApplier(view).apply(R.style.Test_LayoutParams_margins)

        marginParams = view.layoutParams as ViewGroup.MarginLayoutParams
        assertNotNull(marginParams)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_marginBottom), marginParams!!.bottomMargin)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_marginLeft), marginParams!!.leftMargin)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_marginRight), marginParams!!.rightMargin)
        assertEquals(res.getDimensionPixelSize(R.dimen.test_layout_params_marginTop), marginParams!!.topMargin)
    }
}
