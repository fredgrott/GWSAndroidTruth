package com.github.shareme.gwsandroidtruth.library.widget;

import android.widget.AbsListView;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;

/**
 * AbsListViewSubject
 * Created by fgrott on 5/15/2016.
 */
@SuppressWarnings("unused")
public class AbsListViewSubject extends Subject<AbsListViewSubject, AbsListView> {

  private static final SubjectFactory<AbsListViewSubject, AbsListView> FACTORY = new SubjectFactory<AbsListViewSubject, AbsListView>() {
    @Override
    public AbsListViewSubject getSubject(FailureStrategy fs, AbsListView target) {
      return new AbsListViewSubject(fs, target);
    }
  };

  public static SubjectFactory<AbsListViewSubject, AbsListView> absListView(){
    return FACTORY;
  }


  public AbsListViewSubject(FailureStrategy failureStrategy, AbsListView subject) {
    super(failureStrategy, subject);
  }

  public AbsListViewSubject hasAlpha(float alpha){
    if (getSubject().getAlpha() != alpha){
      fail("hasAlpha", alpha);
    }
    return this;
  }

  public AbsListViewSubject hasPaddingTop(int paddingTop){
    if (getSubject().getPaddingTop() != paddingTop){
      fail("hasPaddingTop", paddingTop);
    }
    return this;
  }

  public AbsListViewSubject hasPaddingBottom(int paddingBottom){
    if (getSubject().getPaddingBottom() != paddingBottom){
      fail("hasPaddingBottom", paddingBottom);
    }
    return this;
  }

  public AbsListViewSubject hasPaddingLeft(int paddingLeft){
    if (getSubject().getPaddingLeft() != paddingLeft){
      fail("hasPaddingLeft", paddingLeft);
    }
    return this;
  }

  public AbsListViewSubject hasPaddingRight(int paddingRight){
    if (getSubject().getPaddingRight() != paddingRight){
      fail("hasPaddingRight", paddingRight);
    }
    return this;
  }

  public AbsListViewSubject hasListPaddingBottom(int listPaddingBottom){
    if (getSubject().getListPaddingBottom() != listPaddingBottom){
      fail("hasListPaddingBottom", listPaddingBottom);
    }
    return this;
  }

  public AbsListViewSubject hasListPaddingTop(int listPaddingTop){
    if (getSubject().getListPaddingTop() != listPaddingTop){
      fail("hasListPaddingTop", listPaddingTop);
    }

    return this;
  }

  public AbsListViewSubject hasListPaddingLeft(int listPaddingLeft){
    if (getSubject().getListPaddingLeft() != listPaddingLeft){
      fail("hasListPaddingLeft", listPaddingLeft);
    }
    return this;
  }

  public AbsListViewSubject hasListPaddingRight(int listPaddingRight){
    if (getSubject().getListPaddingRight() != listPaddingRight){
      fail("hasListPaddingRight", listPaddingRight);
    }
    return this;
  }

}
