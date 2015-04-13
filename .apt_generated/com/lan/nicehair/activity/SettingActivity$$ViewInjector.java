// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SettingActivity$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.SettingActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131165238);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165238' for field 'mTopBar' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTopBar = (com.lan.nicehair.widget.TopBarView) view;
    view = finder.findById(source, 2131165485);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165485' for method 'onLoginOutClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onLoginOutClicked(p0);
        }
      });
    view = finder.findById(source, 2131165465);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165465' for method 'onChangeSecretClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onChangeSecretClicked(p0);
        }
      });
    view = finder.findById(source, 2131165469);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165469' for method 'onRecommandClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onRecommandClicked(p0);
        }
      });
    view = finder.findById(source, 2131165479);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165479' for method 'onHelpClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onHelpClicked(p0);
        }
      });
    view = finder.findById(source, 2131165481);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165481' for method 'onClearCacheClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClearCacheClicked(p0);
        }
      });
    view = finder.findById(source, 2131165467);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165467' for method 'onBindClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onBindClicked(p0);
        }
      });
    view = finder.findById(source, 2131165473);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165473' for method 'onFeedBackClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onFeedBackClicked(p0);
        }
      });
    view = finder.findById(source, 2131165471);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165471' for method 'onAttentionClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAttentionClicked(p0);
        }
      });
    view = finder.findById(source, 2131165475);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165475' for method 'onCheckVersionClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCheckVersionClicked(p0);
        }
      });
    view = finder.findById(source, 2131165477);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165477' for method 'onAboutClicked' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAboutClicked(p0);
        }
      });
  }

  public static void reset(com.lan.nicehair.activity.SettingActivity target) {
    target.mTopBar = null;
  }
}
