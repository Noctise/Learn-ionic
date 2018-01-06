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
        //����webView���
        WebView wv = new WebView(getApplicationContext());
        //����ָ����ҳ��
        wv.loadUrl("file:///android_asset/demo.html");
        //webviewĬ���ǲ�����ִ��js��
        wv.getSettings().setJavaScriptEnabled(true);
        //��wv����Ϊ������ͼ
        setContentView(wv);
        
        //���ÿ��Բ鿴��ҳ���������־��Ϣ
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
