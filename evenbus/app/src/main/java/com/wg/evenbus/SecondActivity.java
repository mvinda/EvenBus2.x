package com.wg.evenbus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.greenrobot.event.EventBus;

public class SecondActivity extends Activity {
	private Button btn_FirstEvent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		btn_FirstEvent = (Button) findViewById(R.id.btn_first_event);

		btn_FirstEvent.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EventBus.getDefault().post(
						new FirstEvent("往第一个Activity发消息"));
			}
		});


	}
	public class FirstEvent {

	private String mMsg;
	public FirstEvent(String msg) {
		// TODO Auto-generated constructor stub
		mMsg = msg;
	}
	public String getMsg(){
		return mMsg;
	}
}


}
