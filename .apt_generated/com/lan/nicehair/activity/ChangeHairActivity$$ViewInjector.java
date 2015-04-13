// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ChangeHairActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.ChangeHairActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165318);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165318' for field 'mListView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mListView = (com.lan.nicehair.common.HorizontalListView) view;
    view = finder.findById(source, 2131165238);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165238' for field 'mTopBar' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTopBar = (com.lan.nicehair.widget.TopBarView) view;
    view = finder.findById(source, 2131165323);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165323' for field 'slideMenu' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.slideMenu = (android.support.v4.view.ViewPager) view;
    view = finder.findById(source, 2131165296);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165296' for field 'layout_root' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.layout_root = (android.widget.RelativeLayout) view;
    view = finder.findById(source, 2131165320);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165320' for field 'mRadioGroup' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mRadioGroup = (android.widget.RadioGroup) view;
    view = finder.findById(source, 2131165299);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165299' for field 'mHairIv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mHairIv = (com.lan.nicehair.common.MultiTouchImageView) view;
    view = finder.findById(source, 2131165298);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165298' for field 'mModeIv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mModeIv = (android.widget.ImageView) view;
    view = finder.findById(source, 2131165324);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165324' for method 'onOpenMoreClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onOpenMoreClicked(p0);
        }
      });
    view = finder.findById(source, 2131165301);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165301' for method 'onTakePhotoClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onTakePhotoClicked(p0);
        }
      });
    view = finder.findById(source, 2131165302);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165302' for method 'onShakeClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onShakeClicked(p0);
        }
      });
    view = finder.findById(source, 2131165303);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165303' for method 'onOneChangeClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onOneChangeClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.ChangeHairActivity target) {
    target.mListView = null;
    target.mTopBar = null;
    target.slideMenu = null;
    target.layout_root = null;
    target.mRadioGroup = null;
    target.mHairIv = null;
    target.mModeIv = null;
  }
}
