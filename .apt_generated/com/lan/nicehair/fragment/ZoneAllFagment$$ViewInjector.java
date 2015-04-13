// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ZoneAllFagment$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.fragment.ZoneAllFagment target, Object source) {
    View view;
    view = finder.findById(source, 2131165280);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165280' for field 'mListView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mListView = (com.lan.nicehair.common.refresh_list.RefreshListView) view;
  }

  public static void reset(com.lan.nicehair.fragment.ZoneAllFagment target) {
    target.mListView = null;
  }
}
