// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TopicSearchActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.TopicSearchActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165287);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165287' for field 'mIvClear' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mIvClear = (android.widget.ImageView) view;
    view = finder.findById(source, 2131165285);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165285' for method 'onCancelClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCancelClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.TopicSearchActivity target) {
    target.mIvClear = null;
  }
}
