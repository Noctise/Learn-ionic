package com.tarena.demo03_hybrid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //alt+/
        
        //����webView���͵Ķ���webView��һ��AndroidSDK�ṩ��ԭ�����,��Ҫ����������������ͼ��
        WebView wv = new WebView(getApplicationContext());
        //����ָ����ҳ��
        wv.loadUrl("file:///android_asset/test.html");
        //��wv����Ϊ������ͼ
        setContentView(wv);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
