package com.example.uranai_01;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //レイアウトファイルをセット
        setContentView(R.layout.activity_main);
        //アクションバーを取得
        ActionBar actionBar = getActionBar();
        //アクションバーを隠す
        actionBar.hide();

        //レイアウトファイルのボタンを取得
        Button button = (Button)findViewById(R.id.button);
        //取得したボタンにクリックイベントをセット
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ブラウザで開きたいサイトをuriにセット
                Uri uri = Uri.parse("http://yahoo.co.jp");
                //uriを開くインテントを作成
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //uriを開くアクティビティをスタートします
                startActivity(intent);
            }
        });
    }
}