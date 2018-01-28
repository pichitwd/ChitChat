package pichitwandee.th.ac.bru.chitchat.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import pichitwandee.th.ac.bru.chitchat.R;
import pichitwandee.th.ac.bru.chitchat.utility.MyAlert;

/**
 * Created by CS-BRU on 28/1/2561.
 */

public class ChatFragment extends Fragment{

//    Explicit
    private String displayNammeString, timeChString, chatString;
    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        Chat Contrller

        chatContrller();

    }// Main Method

    private void chatContrller() {
        ImageView imageView = getView().findViewById(R.id.imvChat);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText = getView().findViewById(R.id.editChat);
                chatString = editText.getText().toString().trim();

                if (chatString.isEmpty()) {
                    MyAlert myAlert = new MyAlert(getActivity());
                    myAlert.normalDialog("Have spece",
                            "Please Fill Text on the Blank");
                } else {

//                    No Space
//                    Find DisplayUser
                    firebaseAuth = FirebaseAuth.getInstance();
                    firebaseUser = firebaseAuth.getCurrentUser();
                    displayNammeString = firebaseUser.getDisplayName();

//                    Find Date and Time
                    Calendar calendar = Calendar.getInstance();
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                    timeChString = dateFormat.format(calendar.getTime());

//                    Show log
                    String tag = "28JanV1";
                    Log.d(tag, "DisplayName ==> " + displayNammeString);
                    Log.d(tag, "timeChat ==> " + timeChString);
                    Log.d(tag, "chatString ==> " + chatString);

//                    Clear Text
                    editText.setText("");


                }  // if

            }// onClick
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        return view;


    }
}
