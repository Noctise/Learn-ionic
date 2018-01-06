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
        
        //创建webView类型的对象，webView是一个AndroidSDK提供的原生组件,主要是用来加载网络试图的
        WebView wv = new WebView(getApplicationContext());
        //载入指定的页面
        wv.loadUrl("file:///android_asset/test.html");
        //将wv设置为内容视图
        setContentView(wv);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
