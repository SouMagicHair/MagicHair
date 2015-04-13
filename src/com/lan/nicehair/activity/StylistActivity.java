package com.lan.nicehair.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.lan.nicehair.R;



public class StylistActivity extends Activity {
	private ListView stylist_listview;
	private SimpleAdapter adapter;
	private List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
	
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stylist);
		
		
		stylist_listview = (ListView)findViewById(R.id.styleList_listview);
		
        adapter = new SimpleAdapter(this, list, R.layout.stylist_item, new String[]{"img", "message"} , 
				new int[]{R.id.img_stylist, R.id.message_stylist});
        stylist_listview.setAdapter(adapter);
        
        stylist_listview.setOnItemClickListener( new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int position,
					long id) {
				
				Intent intent = new Intent(StylistActivity.this, StylistMessageActivity.class);
				intent.putExtra("index", position);
				startActivity(intent);
				
			}
        	
		} );
        
        
        makeListViewChanged();
		
	}
	
	
	
	
	private void makeListViewChanged(){
		
		Map<String, Object> hashMap;
		
		
			
		hashMap = new HashMap<String, Object>();
    	hashMap.put("img", R.drawable.stylist0);
    	hashMap.put("message", "发型师1" );
    	list.add(hashMap);
    	
    	hashMap = new HashMap<String, Object>();
    	hashMap.put("img", R.drawable.stylist1);
    	hashMap.put("message", "发型师2" );
    	list.add(hashMap);
    	
    	hashMap = new HashMap<String, Object>();
    	hashMap.put("img", R.drawable.stylist2);
    	hashMap.put("message", "发型师3" );
    	list.add(hashMap);

		adapter.notifyDataSetChanged();
		
	}

	
}
