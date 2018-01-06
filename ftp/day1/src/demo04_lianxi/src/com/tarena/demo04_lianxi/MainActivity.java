package com.tarena.demo04_lianxi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建webView组件
        WebView wv = new WebView(getApplicationContext());
        //载入指定的页面
        wv.loadUrl("file:///android_asset/demo.html");
        //webview默认是不允许执行js的
        wv.getSettings().setJavaScriptEnabled(true);
        //将wv设置为内容视图
        setContentView(wv);
        
        //设置可以查看网页中输出的日志信息
       wv.setWebChromeClient(new WebChromeClient(){
    	   @Override
    	public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
    		// TODO Auto-generated method stub
    		return super.onConsoleMessage(consoleMessage);
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
