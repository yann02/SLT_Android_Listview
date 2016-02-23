package com.niit.bll;

import java.util.ArrayList;
import java.util.List;

import com.example.slt_android_listview.R;
import com.niit.model.UserModel;


public class UserBll {

	public List<UserModel> GetUserList() {
		List<UserModel> lists = new ArrayList<UserModel>();
		
		UserModel userModel = new UserModel();
		userModel.setUserid(12);
		userModel.setUsername("james");
		userModel.setImg(R.drawable.avatar);
		
		lists.add(userModel);
		
		userModel = new UserModel();
		userModel.setUserid(13);
		userModel.setUsername("spb");
		userModel.setImg(R.drawable.avatar2);
		
		lists.add(userModel);
		
		userModel = new UserModel();
		userModel.setUserid(13);
		userModel.setUsername("lc");
		userModel.setImg(R.drawable.avatar3);
		
		lists.add(userModel);
		
		userModel = new UserModel();
		userModel.setUserid(15);
		userModel.setUsername("lj");
		userModel.setImg(R.drawable.avatar04);
		
		lists.add(userModel);
		
		userModel = new UserModel();
		userModel.setUserid(17);
		userModel.setUsername("xhg");
		userModel.setImg(R.drawable.avatar5);
		
		lists.add(userModel);
		
		return lists;
	}
}
