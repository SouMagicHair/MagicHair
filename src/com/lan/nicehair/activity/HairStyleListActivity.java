package com.lan.nicehair.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.lan.nicehair.R;
import com.lan.nicehair.fragment.ZoneHotFragment;



public class HairStyleListActivity extends Activity {
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
				
				
				Intent intent = new Intent(HairStyleListActivity.this, StylistActivity.class);
				intent.putExtra("index", position);
				startActivity(intent);
				
			}
        	
		} );
        
        
        makeListViewChanged();
		
	}
	
	
	
	
	private void makeListViewChanged(){
		
		Map<String, Object> hashMap;
		
		
		hashMap = new HashMap<String, Object>();
    	hashMap.put("img", R.drawable.hair_style0);
    	hashMap.put("message", "发型1" );
    	list.add(hashMap);
    	
		hashMap = new HashMap<String, Object>();
    	hashMap.put("img", R.drawable.hair_style1);
    	hashMap.put("message", "发型2" );
    	list.add(hashMap);
    	
		hashMap = new HashMap<String, Object>();
    	hashMap.put("img", R.drawable.hair_style2);
    	hashMap.put("message", "发型3" );
    	list.add(hashMap);
    	
		hashMap = new HashMap<String, Object>();
    	hashMap.put("img", R.drawable.hair_style3);
    	hashMap.put("message", "发型4" );
    	
    	list.add(hashMap);
		
		adapter.notifyDataSetChanged();
		
	}
	

}
