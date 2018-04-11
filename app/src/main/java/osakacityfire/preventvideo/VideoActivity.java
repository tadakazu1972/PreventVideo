package osakacityfire.preventvideo;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.media.MediaPlayer;

/**
 * Created by ryuseitabata on 2018/04/11.
 */

public class VideoActivity extends AppCompatActivity {

    protected VideoActivity mActivity;
    protected View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();

        setContentView(R.layout.activity_video);

        //MainActivityのボタンから押されたビデオのindexを受け取る
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Integer index = bundle.getInt("index");
        Uri videoPath = null;

        //indexに応じてビデオ指定
        switch(index){
            case 1:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.outlet);
                break;
            case 2:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.stove);
                break;
            case 3:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.tobacco);
                break;
            case 4:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.tempura);
                break;
            case 5:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.cloth);
                break;
            case 6:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.room);
                break;
            case 7:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.oxy_tobacco);
                break;
            case 8:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.hotiki);
                break;
            default:
                videoPath = Uri.parse("android.resource://" + mActivity.getPackageName() + "/" + R.raw.outlet);
                break;
        }
        final VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setMediaController(new MediaController(mActivity));
        videoView.setVideoURI(videoPath);

        //準備が完了したら再生
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
            @Override
            public void onPrepared(MediaPlayer mp){
                videoView.start();
            }
        });

        videoView.start();

        //再生完了通知リスナー
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp){
                videoView.seekTo(0);
                videoView.start();
            }
        });
    }
}
