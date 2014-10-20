package fei.gridview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class MainActivity extends ActionBarActivity implements OnItemClickListener{

	private GridView mGridView;
	private List<Map<String, Object>> mDataList;
	private int[] mIcons = { R.drawable.address_book, R.drawable.calendar,
			R.drawable.camera, R.drawable.clock, R.drawable.games_control,
			R.drawable.messenger, R.drawable.ringtone, R.drawable.settings,
			R.drawable.speech_balloon, R.drawable.weather, R.drawable.world,
			R.drawable.youtube };
	private String[] mIconNames = {"联系人", "日历", "照相机", "时钟", "游戏", "短信", "铃声", "设置",
			"语音", "天气", "浏览器", "Youtube" };
	private SimpleAdapter mAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mGridView = (GridView) findViewById(R.id.gridView);
		mDataList = new ArrayList<Map<String, Object>>();
		
		mAdapter = new SimpleAdapter(this, getData(), R.layout.item, new String[]{"image","text"}, new int[]{R.id.image,R.id.text});
		mGridView.setAdapter(mAdapter);

	}

	private List<Map<String, Object>> getData() {
		
		for (int i = 0; i < mIcons.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("image", mIcons[i]);
			map.put("text", mIconNames[i]);
			mDataList.add(map);
		}
		
		return mDataList;

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		 
		
	}

}
