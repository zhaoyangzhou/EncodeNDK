package com.common.encodendk;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.ndk_text);
        String ming = "{\"data\": [\"id\": \"123\", \"name\": \"z\"]}";
        String encrypmi = JniUtils.encode(ming);
        String decrypmi = JniUtils.decode(encrypmi);
        textView.setText("加密前：" + ming + "\n加密后：" + encrypmi + "\n解密后：" + decrypmi);
        Log.e("tag", "\n加密前：" + ming + "\n加密后：" + encrypmi + "\n解密后：" + decrypmi);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
