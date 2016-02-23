package com.example.slt_android_listview;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ListView2Activity extends Activity {

	private ListView listview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		listview = new ListView(this);

		Cursor cursor = getContentResolver().query(People.CONTENT_URI, null,
				null, null, null);
		startManagingCursor(cursor);

		//SimpleCursorAdapter
		//1-上下文
		//2-每一项的布局
		//3-数据源（游标）
		//4-需要显示项的数据
		//5-显示项对应的布局
		ListAdapter listAdapter = new SimpleCursorAdapter(this,
				android.R.layout.simple_expandable_list_item_1, cursor,
				new String[] { People.NAME }, new int[] { android.R.id.text1 });

		listview.setAdapter(listAdapter);

		setContentView(listview);// 页面布局设为listView
	}
}
