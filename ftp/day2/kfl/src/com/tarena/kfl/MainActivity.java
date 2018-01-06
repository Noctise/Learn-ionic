package com.tarena.kfl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //创建一个webView组件  alt+/ 
        WebView wv = new WebView(getApplicationContext());
        //设置允许执行js
        wv.getSettings().setJavaScriptEnabled(true);
        //载入指定的页面
        wv.loadUrl("http://172.163.100.156/chaptor4/angularJS/kfl/kfl.html");
        //设置wv为app的内容视图
        setContentView(wv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
