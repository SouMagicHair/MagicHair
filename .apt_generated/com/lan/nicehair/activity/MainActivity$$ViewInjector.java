// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.MainActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165451);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165451' for field 'mTabHost' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTabHost = (android.widget.TabHost) view;
    view = finder.findById(source, 2131165453);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165453' for field 'mRadioGroup' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mRadioGroup = (android.widget.RadioGroup) view;
    view = finder.findById(source, 2131165283);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165283' for field 'mEditInput' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mEditInput = (android.widget.EditText) view;
    view = finder.findById(source, 2131165345);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165345' for field 'mLayoutComment' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutComment = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165284);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165284' for method 'onPostSendClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onPostSendClicked(p0);
        }
      });
    view = finder.findById(source, 2131165282);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165282' for method 'onPostCameraClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onPostCameraClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.MainActivity target) {
    target.mTabHost = null;
    target.mRadioGroup = null;
    target.mEditInput = null;
    target.mLayoutComment = null;
  }
}
