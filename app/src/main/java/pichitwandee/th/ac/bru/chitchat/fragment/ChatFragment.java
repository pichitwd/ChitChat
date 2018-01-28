package pichitwandee.th.ac.bru.chitchat.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pichitwandee.th.ac.bru.chitchat.R;

/**
 * Created by CS-BRU on 28/1/2561.
 */

public class ChatFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        return view;


    }
}
