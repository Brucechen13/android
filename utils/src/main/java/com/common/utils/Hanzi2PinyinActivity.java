package com.common.utils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.common.utils.util.HanZiToPinYin;

/**
 * Created by chenchi_94 on 2015/9/5.
 */
public class Hanzi2PinyinActivity extends Activity {

    private EditText et;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanzi2pinyin);
        init();
    }

    private void init(){
        et = (EditText) findViewById(R.id.editText);
        tv = (TextView)findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Common.isEmptyEditText(et)) {
                    tv.setText(HanZiToPinYin.toPinYin(et.getText().toString()));
                }else{
                    tv.setText("请输入文字");
                }

            }
        });

    }


}
