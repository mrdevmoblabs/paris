package com.airbnb.paris.test;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Px;
import android.util.AttributeSet;
import android.view.View;

import com.airbnb.paris.annotations.Attr;
import com.airbnb.paris.annotations.Fraction;
import com.airbnb.paris.annotations.Styleable;

// TODO  Test default values
@Styleable("Formats")
public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Attr(R2.styleable.Formats_formatBoolean)
    public void formatBoolean(boolean value) {}

    @Attr(R2.styleable.Formats_formatColor)
    public void formatColor(@ColorInt int value) {}

    @Attr(R2.styleable.Formats_formatDimension)
    public void formatDimension(@Px int value) {}

    @Attr(R2.styleable.Formats_formatEnum)
    public void formatEnum(int value) {}

    @Attr(R2.styleable.Formats_formatFlag)
    public void formatFlag(int value) {}

    @Attr(R2.styleable.Formats_formatFloat)
    public void formatFloat(float value) {}

    @Attr(R2.styleable.Formats_formatFraction)
    public void formatFraction(@Fraction(base = 2, pbase = 3) float value) {}

    @Attr(R2.styleable.Formats_formatInteger)
    public void formatInteger(int value) {}

    @Attr(R2.styleable.Formats_formatReference)
    public void formatReference_CharSequenceArray(CharSequence[] value) {}

    @Attr(R2.styleable.Formats_formatReference)
    public void formatReference_ColorStateList(ColorStateList value) {}

    @Attr(R2.styleable.Formats_formatReference)
    public void formatReference_Drawable(Drawable value) {}

    @Attr(R2.styleable.Formats_formatReference)
    public void formatReference_int(int value) {}

    @Attr(R2.styleable.Formats_formatString)
    public void formatString_CharSequence(CharSequence value) {}

    @Attr(R2.styleable.Formats_formatString)
    public void formatString_String(String value) {}
}