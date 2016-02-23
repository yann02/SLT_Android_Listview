package com.example.slt_android_listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.R.integer;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListView4Activity extends ListActivity {

	private List<Map<String, Object>> mData;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mData = listData();// 获取到数据源
		MyAdapter adapter = new MyAdapter(this);
		setListAdapter(adapter);

	}

	@Override
	protected void onListItemClick(ListView l, View v, 
			int position, long id) {
		super.onListItemClick(l, v, position, id);
		Toast.makeText(this, (String) mData.get(position).get("info"),
				Toast.LENGTH_SHORT).show();
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

	// 实现自己的适配器。把数据（String、数组、集合）显示到ListView的项控件上
	public class MyAdapter extends BaseAdapter {

		private LayoutInflater mInflater;

		public MyAdapter(Context context) {// 使用构造函数实例化布局解析器
			this.mInflater = LayoutInflater.from(context);

		}

		@Override
		public int getCount() {// 项的个数（ListView的行数）
			return mData.size();
		}

		@Override
		public Object getItem(int position) {// 根据行号得到项目
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {// 根据行号得到该项的主键
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder = null;
			// 1-先找到项的布局控件
			if (convertView == null) {
				holder = new ViewHolder();
				// inflate：相当于findViewById();解析ListView项的布局
				convertView = mInflater.inflate(R.layout.activity_list_view4,
						null);
				holder.img = (ImageView) convertView
						.findViewById(R.id.imageView1);
				holder.tv_num = (TextView) convertView
						.findViewById(R.id.textView1);
				holder.tv_content = (TextView) convertView
						.findViewById(R.id.textView2);
				holder.btn_view = (Button) convertView
						.findViewById(R.id.button1);

				convertView.setTag(holder);// 设置标签，类似setContentView

			} else {
				holder = (ViewHolder) convertView.getTag();
			}

			final int showPosition = position;

			// 2-绑定数据和控件
			holder.img.setBackgroundResource((Integer) mData.get(position).get(
					"img"));
			holder.tv_num.setText((String) mData.get(position).get("num"));
			holder.tv_content.setText((String) mData.get(position).get("info"));
			holder.btn_view.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					showContent(showPosition);

				}
			});
			return convertView;
		}

	}

	private void showContent(int position) {
		Toast.makeText(this, "你的短信内容是：" + mData.get(position).get("info"),
				Toast.LENGTH_SHORT).show();
	}

	public final class ViewHolder {
		public ImageView img;
		public TextView tv_num;
		public TextView tv_content;
		public Button btn_view;
	}
}
