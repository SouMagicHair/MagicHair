package com.lan.nicehair.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;

import com.lan.nicehair.R;



public class StylistMessageActivity extends Activity {
	

	private ImageView img_stylist;
	private ImageView img_show;
	private TextView store_message;
	private TextView introduction;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stylist_message);
		
		initWidget();
		
		Intent intent = getIntent();
		
		int index = intent.getIntExtra("index", -1);
		
		store_message.setText("店名：理发店" + index + "\n地址：北京市昌平区北京邮电大学宏福校区"  );
		
		switch(index){
		case 0:img_stylist.setImageResource(R.drawable.stylist0);break;
		case 1:img_stylist.setImageResource(R.drawable.stylist1);break;
		case 2:img_stylist.setImageResource(R.drawable.stylist2);break;
		}
		
		img_show.setImageResource(R.drawable.show);
		introduction.setText(example);
		
	}
	
	
	private String example =  "简介：" + 
			"东东美容美发有限公司，1989年11月，东东以先进的管理方式、精湛的技术、一流的服务、优雅的专业环境而著称，" +
			"历经了十几年的发展，他靠自身实力公平竞争，在激烈的服务业角逐中，赢得广大客户的好口碑。";
	
	private void initWidget() {
		
		img_stylist = (ImageView)findViewById(R.id.img_stylist_view);
		img_show = (ImageView)findViewById(R.id.img_show);
		store_message = (TextView)findViewById(R.id.store_message);
		introduction = (TextView)findViewById(R.id.introduction);
		
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event)  {
	      if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	    	  Intent intent=new Intent();   
	          intent.setClass(StylistMessageActivity.this, StylistActivity.class);   
	          startActivity(intent);   
	          StylistMessageActivity.this.finish();
		      return true;
		  }
		  return super.onKeyDown(keyCode, event);
    }
}