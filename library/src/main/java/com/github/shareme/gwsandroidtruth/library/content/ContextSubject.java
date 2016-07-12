package com.github.shareme.gwsandroidtruth.library.content;

import android.content.Context;
import android.support.annotation.Nullable;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;

/**
 * ContextSubject
 * Created by fgrott on 5/22/2016.
 */
@SuppressWarnings("unused")
public class ContextSubject extends Subject<ContextSubject, Context> {

  private static final SubjectFactory<ContextSubject, Context> FACTORY = new SubjectFactory<ContextSubject, Context>() {
    @Override
    public ContextSubject getSubject(FailureStrategy fs, Context target) {
      return new ContextSubject(fs, target);
    }
  };

  public static SubjectFactory<ContextSubject, Context> context(){
    return FACTORY;
  }


  public ContextSubject(FailureStrategy failureStrategy, Context subject) {
    super(failureStrategy, subject);
  }

  public void isEqualTo(@Nullable Object expected){
    super.isEqualTo(expected);
  }



}
