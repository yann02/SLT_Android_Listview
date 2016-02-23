package com.example.slt_android_listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SimpleAdapter;


// 作业：使用该方式完成通讯录联系人的展示

public class ListView3Activity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//SimpleAdapter
		//1-上下文
		//2-数据源
		//3-每一项的布局
		//4-每一项需要显示的数据数组
		//5-每一项显示数据对应的布局控件
		SimpleAdapter adapter = new SimpleAdapter(this, listData(),
				R.layout.activity_list_view3, new String[] { "num", "info",
						"img" }, new int[] { R.id.textView1, R.id.textView2,
						R.id.imageView1 });
		setListAdapter(adapter);
	
	}

	private List<Map<String, Object>> listData() {
		List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("num", "5554");
		map.put("info", "我想约你今天下午喝咖啡，好吗");
		map.put("img", R.drawable.avatar);
		lists.add(map);

		map = new HashMap<String, Object>();
		map.put("num", "5556");
		map.put("info", "我也想约你今天下午喝红茶，好吗");
		map.put("img", R.drawable.avatar2);
		lists.add(map);

		map = new HashMap<String, Object>();
		map.put("num", "5558");
		map.put("info", "作业写好了吗？借我抄一下。");
		map.put("img", R.drawable.avatar3);
		lists.add(map);

		return lists;
	}
}
