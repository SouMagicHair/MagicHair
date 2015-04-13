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



public class FashionSchoolActivity extends Activity {
	private ListView stylist_listview;
	private SimpleAdapter adapter;
	private List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
	
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stylist);
		
		
		stylist_listview = (ListView)findViewById(R.id.styleList_listview);
		
        adapter = new SimpleAdapter(this, list, R.layout.stylist_item, new String[]{/*"title",*/"img", "message"} , 
				new int[]{/* R.id.title_stylist,*/R.id.img_stylist, R.id.message_stylist});
        stylist_listview.setAdapter(adapter);
        
        stylist_listview.setOnItemClickListener( new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int position,
					long id) {
				
				
				Intent intent = new Intent(FashionSchoolActivity.this, StylistMessageActivity.class);
				intent.putExtra("index", position);
				startActivity(intent);
				
			}
        	
		} );
        
        
        makeListViewChanged();
		
	}
	
	
	
	
	private void makeListViewChanged(){
		
		Map<String, Object> hashMap;
		
		hashMap = new HashMap<String, Object>();
		hashMap.put("title", "女神款麻花辫打造只要三步哦");
    	hashMap.put("img", R.drawable.fashion_school);
    	hashMap.put("message", "女神款麻花辫打造只要三步哦\n1)就像编普通的麻花辫一样，诀窍在于右手的第三股头发压住另外两股以后就垂下来不用去管它了。 2)把剩下的两股头发继续编，然后攥在左手，右手挑出一缕新的头发作为第三股继续重复上一步骤。 3)重复直到最后，用透明细发圈系住发尾，用卡子固定。 "
    			+"tips：要实现这款麻花辫只有重要的两部：编麻花辫+加入新头发。想象一下你只在用最开始的两股头发在编，每次编的时候加一股新的在中间，然后让新头发穿过这两股头发垂下去。"
    			+"一旦你上手了就会很快，编辑在办公室抓了位同事来试，非常快就上手了而且效果很不错。你可以找个朋友试试看效果，然后再用在自己身上。");
    	
    	list.add(hashMap);

		
		adapter.notifyDataSetChanged();
		
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event)  {
	      if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	    	  Intent intent=new Intent();   
	          intent.setClass(FashionSchoolActivity.this, ZoneActivity.class);   
	          startActivity(intent);   
	          FashionSchoolActivity.this.finish();
		      return true;
		  }
		  return super.onKeyDown(keyCode, event);
   }
}
