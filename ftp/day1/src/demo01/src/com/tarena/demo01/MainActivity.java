package com.tarena.demo01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // alt+/ ����������ʾ�������Զ���������
        
        //����ťָ��һ��������
        findViewById(R.id.button1)
        .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//��ʾһ��toast
				Toast.makeText(
						getApplicationContext(), 
						"�����������дAndroidApp",
						Toast.LENGTH_LONG).show();
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
