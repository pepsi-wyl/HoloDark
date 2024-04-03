package site.ylan.holodark;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {

    private MediaPlayer mediaPlayer;

    public void play(Context context){
        stop();
        mediaPlayer = MediaPlayer.create(context,R.raw.one_small_step);
        mediaPlayer.setOnCompletionListener(mp -> stop());
        mediaPlayer.start();
    }

    public void stop(){
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
