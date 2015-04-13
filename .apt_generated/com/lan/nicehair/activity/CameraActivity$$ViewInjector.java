// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class CameraActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.CameraActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165458);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165458' for field 'mCameraPreview' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mCameraPreview = (com.lan.nicehair.widget.CameraPreview) view;
    view = finder.findById(source, 2131165461);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165461' for method 'onBackClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onBackClicked(p0);
        }
      });
    view = finder.findById(source, 2131165462);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165462' for method 'onChangeCameraClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onChangeCameraClicked(p0);
        }
      });
    view = finder.findById(source, 2131165460);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165460' for method 'onTakePhotoClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onTakePhotoClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.CameraActivity target) {
    target.mCameraPreview = null;
  }
}
