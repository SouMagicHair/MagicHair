// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class PostInfoActivity$ViewHeadHolder$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.activity.PostInfoActivity.ViewHeadHolder target, Object source) {
    View view;
    view = finder.findById(source, 2131165496);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165496' for field 'mPostNameTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostNameTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165404);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165404' for field 'mCollectTag' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mCollectTag = (android.widget.ImageView) view;
    view = finder.findById(source, 2131165509);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165509' for field 'mLayoutComment' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutComment = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165500);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165500' for field 'mUserLevelTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mUserLevelTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165495);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165495' for field 'mPostHeadIv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostHeadIv = (com.lan.nicehair.common.CircleImageView) view;
    view = finder.findById(source, 2131165508);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165508' for field 'mLayoutLike' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutLike = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165503);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165503' for field 'mPostContent' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostContent = (android.widget.TextView) view;
    view = finder.findById(source, 2131165504);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165504' for field 'mPostList' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostList = (com.lan.nicehair.widget.NoScrollListView) view;
    view = finder.findById(source, 2131165406);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165406' for field 'mLikeTag' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLikeTag = (android.widget.ImageView) view;
    view = finder.findById(source, 2131165505);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165505' for field 'mPostBottomLayout' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostBottomLayout = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165497);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165497' for field 'mPostTimeTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mPostTimeTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165506);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165506' for field 'mLayoutShare' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutShare = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165507);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165507' for field 'mLayoutCollect' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutCollect = (android.widget.LinearLayout) view;
  }

  public static void reset(com.lan.nicehair.activity.PostInfoActivity.ViewHeadHolder target) {
    target.mPostNameTv = null;
    target.mCollectTag = null;
    target.mLayoutComment = null;
    target.mUserLevelTv = null;
    target.mPostHeadIv = null;
    target.mLayoutLike = null;
    target.mPostContent = null;
    target.mPostList = null;
    target.mLikeTag = null;
    target.mPostBottomLayout = null;
    target.mPostTimeTv = null;
    target.mLayoutShare = null;
    target.mLayoutCollect = null;
  }
}
