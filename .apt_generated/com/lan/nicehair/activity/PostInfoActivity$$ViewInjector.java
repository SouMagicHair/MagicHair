// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class PostInfoActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.PostInfoActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165283);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165283' for field 'mEditInput' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mEditInput = (android.widget.EditText) view;
    view = finder.findById(source, 2131165494);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165494' for field 'mListView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mListView = (com.lan.nicehair.common.refresh_list.RefreshListView) view;
    view = finder.findById(source, 2131165492);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165492' for field 'mPostTagTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostTagTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165238);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165238' for field 'mTopBar' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTopBar = (com.lan.nicehair.widget.TopBarView) view;
    view = finder.findById(source, 2131165491);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165491' for method 'onFromClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onFromClicked(p0);
        }
      });
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
  }

  public static void reset(com.lan.nicehair.activity.PostInfoActivity target) {
    target.mEditInput = null;
    target.mListView = null;
    target.mPostTagTv = null;
    target.mTopBar = null;
  }
}
