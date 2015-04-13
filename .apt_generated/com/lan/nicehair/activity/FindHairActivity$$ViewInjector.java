// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FindHairActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.FindHairActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165251);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165251' for field 'mRadioGroup' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mRadioGroup = (android.widget.RadioGroup) view;
    view = finder.findById(source, 2131165255);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165255' for field 'mViewPager' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mViewPager = (android.support.v4.view.ViewPager) view;
  }

  public static void reset(com.lan.nicehair.activity.FindHairActivity target) {
    target.mRadioGroup = null;
    target.mViewPager = null;
  }
}
