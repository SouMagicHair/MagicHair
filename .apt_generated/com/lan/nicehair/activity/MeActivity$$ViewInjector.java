// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MeActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.MeActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165262);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165262' for field 'layout_root' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.layout_root = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165264);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165264' for field 'mHeadIv' and method 'onUserHeadClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mHeadIv = (com.lan.nicehair.common.CircleImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onUserHeadClicked(p0);
        }
      });
    view = finder.findById(source, 2131165277);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165277' for method 'onUserInfoClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onUserInfoClicked(p0);
        }
      });
    view = finder.findById(source, 2131165273);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165273' for method 'onHairHistoryClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onHairHistoryClicked(p0);
        }
      });
    view = finder.findById(source, 2131165263);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165263' for method 'onSettingClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onSettingClicked(p0);
        }
      });
    view = finder.findById(source, 2131165267);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165267' for method 'onMessageClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onMessageClicked(p0);
        }
      });
    view = finder.findById(source, 2131165269);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165269' for method 'onTopicClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onTopicClicked(p0);
        }
      });
    view = finder.findById(source, 2131165271);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165271' for method 'onCollectionClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCollectionClicked(p0);
        }
      });
    view = finder.findById(source, 2131165275);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165275' for method 'onAlbumClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAlbumClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.MeActivity target) {
    target.layout_root = null;
    target.mHeadIv = null;
  }
}
