// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class HairCommentActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.HairCommentActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165283);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165283' for field 'mEditInput' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mEditInput = (android.widget.EditText) view;
    view = finder.findById(source, 2131165344);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165344' for field 'mListView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mListView = (com.lan.nicehair.common.refresh_list.RefreshListView) view;
    view = finder.findById(source, 2131165345);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165345' for field 'mLayoutComment' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutComment = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165343);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165343' for field 'mLayoutLoading' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutLoading = (android.widget.RelativeLayout) view;
    view = finder.findById(source, 2131165342);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165342' for method 'onZanClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onZanClicked(p0);
        }
      });
    view = finder.findById(source, 2131165341);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165341' for method 'onCollectClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCollectClicked(p0);
        }
      });
    view = finder.findById(source, 2131165338);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165338' for method 'onBackClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onBackClicked(p0);
        }
      });
    view = finder.findById(source, 2131165339);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165339' for method 'onShareClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onShareClicked(p0);
        }
      });
    view = finder.findById(source, 2131165340);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165340' for method 'onCommentClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCommentClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.HairCommentActivity target) {
    target.mEditInput = null;
    target.mListView = null;
    target.mLayoutComment = null;
    target.mLayoutLoading = null;
  }
}
