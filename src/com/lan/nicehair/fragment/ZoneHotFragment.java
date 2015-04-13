package com.lan.nicehair.fragment;

import butterknife.ButterKnife;
import butterknife.InjectView;

import com.lan.nicehair.R;
import com.lan.nicehair.activity.FashionSchoolActivity;
import com.lan.nicehair.activity.HairStyleListActivity;
import com.lan.nicehair.activity.MainActivity;
import com.lan.nicehair.activity.StylistActivity;
import com.lan.nicehair.adapter.ZoneHotAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class ZoneHotFragment extends Fragment {

	@InjectView(R.id.grid_zone_hot_tag) GridView mGridView;
	private ZoneHotAdapter mAdapter;
	public static ZoneHotFragment newInstance() {
		ZoneHotFragment fragment = new ZoneHotFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View contentView = inflater.inflate(R.layout.view_zone_hot_tag, container, false);
		ButterKnife.inject(this, contentView);
		mAdapter=new ZoneHotAdapter(getActivity());
		mGridView.setAdapter(mAdapter);
		mGridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long id) {
				// TODO Auto-generated method stub
				switch (position) {
				case 0:
					Intent intent = new Intent( getActivity(), MainActivity.class );
					startActivity(intent);
					break;
				case 1:
					intent = new Intent( getActivity(), HairStyleListActivity.class );
					startActivity(intent);
					break;
				case 2:
					intent = new Intent( getActivity(), StylistActivity.class );
					startActivity(intent);
					break;
				case 3:
					intent = new Intent( getActivity(), MainActivity.class );
					startActivity(intent);
					break;
				case 4:
					intent = new Intent( getActivity(), FashionSchoolActivity.class );
					startActivity(intent);
					break;
				case 5:
					intent = new Intent( getActivity(), MainActivity.class );
					startActivity(intent);
					break;
				case 6:
					intent = new Intent( getActivity(), MainActivity.class );
					startActivity(intent);
					break;
				case 7:
					intent = new Intent( getActivity(), MainActivity.class );
					startActivity(intent);
					break;

				default:
					break;
				}
			}
		});
		return contentView;
	}
	@Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
