package com.github.shareme.gwsandroidtruth.library.widget;

import android.widget.AutoCompleteTextView;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;

/**
 * AutoCompleteTextViewSubject
 * Created by fgrott on 5/15/2016.
 */
@SuppressWarnings("unused")
public class AutoCompleteTextViewSubject extends Subject<AutoCompleteTextViewSubject, AutoCompleteTextView> {

  private static final SubjectFactory<AutoCompleteTextViewSubject,AutoCompleteTextView> FACTORY = new SubjectFactory<AutoCompleteTextViewSubject, AutoCompleteTextView>() {
    @Override
    public AutoCompleteTextViewSubject getSubject(FailureStrategy fs, AutoCompleteTextView target) {
      return new AutoCompleteTextViewSubject(fs, target);
    }
  };

  public static SubjectFactory<AutoCompleteTextViewSubject, AutoCompleteTextView> autoCompleteTextView(){
    return FACTORY;
  }

  public AutoCompleteTextViewSubject(FailureStrategy failureStrategy, AutoCompleteTextView subject) {
    super(failureStrategy, subject);
  }


  public AutoCompleteTextViewSubject hasAlpha(float alpha){
    if (getSubject().getAlpha() != alpha){
      fail("hasAlpha", alpha);
    }
    return this;
  }


  public AutoCompleteTextViewSubject hasTextSize(int textSize){
    if (getSubject().getTextSize() != textSize){
      fail("hasTextSize", textSize);
    }
    return this;
  }

  public AutoCompleteTextViewSubject haPaddingTop(int paddingTop){
    if (getSubject().getPaddingTop() != paddingTop){
      fail("hasPaddingTop", paddingTop);
    }
    return this;
  }

  public AutoCompleteTextViewSubject hasPaddingBottom(int paddingBottom){
    if (getSubject().getPaddingBottom() != paddingBottom){
      fail("hasPaddingBottom", paddingBottom);
    }
    return this;
  }

  public AutoCompleteTextViewSubject hasPaddingLeft(int paddingLeft){
    if (getSubject().getPaddingLeft() != paddingLeft){
      fail("hasPaddingLeft", paddingLeft);
    }
    return this;
  }

  public  AutoCompleteTextViewSubject hasPaddingRight(int paddingRight){
    if (getSubject().getPaddingRight() != paddingRight){
      fail("hasPaddingRight", paddingRight);
    }
    return this;
  }

  public AutoCompleteTextViewSubject hasDropDownAnchor(int dropDownAnchor){
    if (getSubject().getDropDownAnchor() != dropDownAnchor){
      fail("hasDropDownAnchor", dropDownAnchor);
    }
    return this;
  }

  public AutoCompleteTextViewSubject hasDropDownHeight(int dropDownHeight){
    if (getSubject().getDropDownHeight() != dropDownHeight){
      fail("hasDropDownHeight", dropDownHeight);
    }
    return this;
  }

  public AutoCompleteTextViewSubject hasDropDownHorizontalOffset(int dropDownHorizontalOffset){
    if (getSubject().getDropDownHorizontalOffset() != dropDownHorizontalOffset){
      fail("hasDropDownHorizontalOffset", dropDownHorizontalOffset);
    }
    return this;
  }

  public AutoCompleteTextViewSubject hasDropDownVerticalOffest(int dropDownVerticalOffset){
    if (getSubject().getDropDownVerticalOffset() != dropDownVerticalOffset){
      fail("hasDropDownVerticalOffset", dropDownVerticalOffset);
    }
    return this;
  }

  public AutoCompleteTextViewSubject hasDropDownWidth(int dropDownWidth){
    if (getSubject().getDropDownWidth() != dropDownWidth){
      fail("hasDropDownWidth", dropDownWidth);
    }
    return this;
  }

  public AutoCompleteTextViewSubject hasThreshold(int threshold){
    if (getSubject().getThreshold() != threshold){
      fail("hasThreshold", threshold);
    }
    return this;
  }

}
