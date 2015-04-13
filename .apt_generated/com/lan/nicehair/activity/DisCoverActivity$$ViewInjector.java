// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DisCoverActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.DisCoverActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165238);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165238' for field 'mTopBar' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTopBar = (com.lan.nicehair.widget.TopBarView) view;
    view = finder.findById(source, 2131165313);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165313' for method 'onChangeHairClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onChangeHairClicked(p0);
        }
      });
    view = finder.findById(source, 2131165315);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165315' for method 'onDiagnoseClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDiagnoseClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.DisCoverActivity target) {
    target.mTopBar = null;
  }
}
