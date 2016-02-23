package com.example.slt_android_listview;

import java.util.ArrayList;
import java.util.List;

import android.R.anim;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView1Activity extends Activity {

	private ListView listview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		listview = new ListView(this);
		 
		//上下文Context：待会发生的动作发生在哪个页面（Activity）上
		//Adapter适配器：加入转接头，使得两端的数据接口一致
		 
		// 将数据绑定要ListView项,所以要借助
		//ArrayAdapter:
		//1-上下文
		//2-listview中每一项的布局
		//3-数据源
		//new ArrayAdapter<T>(context, resource, objects);
		listview.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, listData()));
		setContentView(listview);//设置当前布局为listview
	}

	private List<String> listData() {
		List<String> data = new ArrayList<String>();
		data.add("测试数据1");
		data.add("测试数据2");
		data.add("测试数据3");
		data.add("测试数据4");
		data.add("测试数据5");
		return data;
	}
}
