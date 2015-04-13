// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class PhotoPagerActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.PhotoPagerActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165378);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165378' for field 'mBtnRight' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mBtnRight = (android.widget.ImageButton) view;
    view = finder.findById(source, 2131165379);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165379' for field 'mViewPager' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mViewPager = (android.support.v4.view.ViewPager) view;
    view = finder.findById(source, 2131165377);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165377' for field 'mTvTitle' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findById(source, 2131165375);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165375' for field 'mLayoutBar' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutBar = (android.widget.RelativeLayout) view;
    view = finder.findById(source, 2131165376);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165376' for method 'onBackClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onBackClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.PhotoPagerActivity target) {
    target.mBtnRight = null;
    target.mViewPager = null;
    target.mTvTitle = null;
    target.mLayoutBar = null;
  }
}
