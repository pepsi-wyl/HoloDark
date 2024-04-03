package site.ylan.holodark;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HelloMoonFragment extends Fragment {

    private AudioPlayer audioPlayer = new AudioPlayer();

    private Button playButton;
    private Button stopButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hello_moon, container, false);

        playButton = view.findViewById(R.id.hellomoon_play_button);
        stopButton = view.findViewById(R.id.hellomoon_stop_button);

        playButton.setOnClickListener(v -> audioPlayer.play(getActivity()));
        stopButton.setOnClickListener(v -> audioPlayer.stop());

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        audioPlayer.stop();
    }
}