package com.tarena.kfl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //����һ��webView���  alt+/ 
        WebView wv = new WebView(getApplicationContext());
        //��������ִ��js
        wv.getSettings().setJavaScriptEnabled(true);
        //����ָ����ҳ��
        wv.loadUrl("http://172.163.100.156/chaptor4/angularJS/kfl/kfl.html");
        //����wvΪapp��������ͼ
        setContentView(wv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
