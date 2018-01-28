package pichitwandee.th.ac.bru.chitchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pichitwandee.th.ac.bru.chitchat.fragment.ChatFragment;
import pichitwandee.th.ac.bru.chitchat.fragment.RegisterFragment;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentServiceFragment, new ChatFragment())
                    .commit();
        }

    } //Main Method

} //Main Class
