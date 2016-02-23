package com.example.slt_android_listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.niit.bll.UserBll;
import com.niit.model.UserModel;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class GridViewActivity extends Activity implements OnItemClickListener {

	private GridView gv;
	List<UserModel> lists = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_view);
		gv = (GridView) findViewById(R.id.gridView1);
		UserBll bll = new UserBll();
		lists = bll.GetUserList();

		List<HashMap<String, Object>> users = new ArrayList<HashMap<String, Object>>();
		for (UserModel user : lists) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("icon", user.getImg());
			map.put("name", user.getUsername());
			users.add(map);
		}

		SimpleAdapter sa = new SimpleAdapter(this, users,
				R.layout.activity_gridview_item,
				new String[] { "icon", "name" }, new int[] { R.id.imageView1,
						R.id.textView1 }); 

		gv.setAdapter(sa);
		gv.setOnItemClickListener(this);

	}

	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		Toast.makeText(this, lists.get(position).getUsername(),
				Toast.LENGTH_SHORT).show();
	}
	
	//1-完成5个画面的布局
	//2-完成登录、注册、忘记密码的代码
	//3-listview和显示画面
	//素材来自跑跑兼职 apk-》反编译
}
