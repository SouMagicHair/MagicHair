// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FindHairAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.adapter.FindHairAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findById(source, 2131165520);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165520' for field 'poster_commentNumTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.poster_commentNumTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165513);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165513' for field 'imageView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.imageView = (android.widget.ImageView) view;
    view = finder.findById(source, 2131165518);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165518' for field 'poster_praiseNumTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.poster_praiseNumTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165521);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165521' for field 'poster_nameTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.poster_nameTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165516);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165516' for field 'poster_scanNumTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.poster_scanNumTv = (android.widget.TextView) view;
  }

  public static void reset(com.lan.nicehair.adapter.FindHairAdapter.ViewHolder target) {
    target.poster_commentNumTv = null;
    target.imageView = null;
    target.poster_praiseNumTv = null;
    target.poster_nameTv = null;
    target.poster_scanNumTv = null;
  }
}
