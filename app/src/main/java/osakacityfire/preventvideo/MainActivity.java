package osakacityfire.preventvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    protected MainActivity mActivity;
    protected View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();

        setContentView(R.layout.activity_main);

        //ボタン初期化
        initButtons();
    }

    //ボタン初期化
    private void initButtons(){
        //ボタン1
        mView.findViewById(R.id.btnVideo1).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 1);
                startActivity(intent);
            }
        });

        //ボタン2
        mView.findViewById(R.id.btnVideo2).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 2);
                startActivity(intent);
            }
        });

        //ボタン3
        mView.findViewById(R.id.btnVideo3).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 3);
                startActivity(intent);
            }
        });

        //ボタン4
        mView.findViewById(R.id.btnVideo4).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 4);
                startActivity(intent);
            }
        });

        //ボタン5
        mView.findViewById(R.id.btnVideo5).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 5);
                startActivity(intent);
            }
        });

        //ボタン6
        mView.findViewById(R.id.btnVideo6).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 6);
                startActivity(intent);
            }
        });

        //ボタン7
        mView.findViewById(R.id.btnVideo7).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 7);
                startActivity(intent);
            }
        });

        //ボタン8
        mView.findViewById(R.id.btnVideo8).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, VideoActivity.class);
                intent.putExtra("index", 8);
                startActivity(intent);
            }
        });
    }
}
