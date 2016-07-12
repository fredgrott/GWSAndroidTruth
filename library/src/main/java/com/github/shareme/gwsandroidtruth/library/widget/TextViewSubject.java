package com.github.shareme.gwsandroidtruth.library.widget;

import android.widget.TextView;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;

/**
 * A TextViewSubject class so we have a little api that handles all the
 * error messages for a TextWidget
 * Created by fgrott on 5/15/2016.
 */
@SuppressWarnings("unused")
public class TextViewSubject extends Subject<TextViewSubject, TextView> {

  private static final SubjectFactory<TextViewSubject, TextView> FACTORY = new SubjectFactory<TextViewSubject, TextView>() {
    @Override
    public TextViewSubject getSubject(FailureStrategy fs, TextView target) {
      return new TextViewSubject(fs, target);
    }
  };

  public static SubjectFactory<TextViewSubject, TextView> textView(){
    return FACTORY;
  }


  public TextViewSubject(FailureStrategy failureStrategy, TextView subject) {
    super(failureStrategy, subject);
  }

  public TextViewSubject hasAlpha(float alpha){
    if (getSubject().getAlpha() != alpha){
      fail("hasAlpha", alpha);
    }
    return this;
  }

  public TextViewSubject hasText(String expected){
    if (!getSubject().getText().equals(expected)){
      fail("hasText", expected);
    }
    return this;
  }

  public TextViewSubject hasTextSize(float textSize){
    if (getSubject().getTextSize() != textSize){
      fail("hasTextSize", textSize);
    }
    return this;
  }

  public TextViewSubject hasPaddingTop(int paddingTop){
    if (getSubject().getPaddingTop() != paddingTop){
      fail("hasPaddingTop", paddingTop);
    }
    return this;
  }

  public TextViewSubject hasPaddingBottom(int paddingBottom){
    if (getSubject().getPaddingBottom() != paddingBottom){
      fail("hasPaddingBottom", paddingBottom);
    }
    return this;
  }

  public TextViewSubject hasPaddingLeft(int paddingLeft){
    if (getSubject().getPaddingLeft() != paddingLeft){
      fail("hasPaddingLeft", paddingLeft);
    }
    return this;
  }

  public TextViewSubject hasPaddingRight(int paddingRight){
    if (getSubject().getPaddingRight() != paddingRight){
      fail("hasPaddingRight", paddingRight);
    }
    return this;
  }

}
