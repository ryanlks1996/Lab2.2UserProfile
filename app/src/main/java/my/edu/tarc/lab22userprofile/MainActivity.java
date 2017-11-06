package my.edu.tarc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_PROFILE_UPDATE = 1;
    public static final String USER_ID = "my.edu.tarc.lab22userprofile.ID";
    public static final String USER_EMAIL = "my.edu.tarc.lab22userprofile.EMAIL";
    private TextView textViewID, textViewEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewID = (TextView) findViewById(R.id.textViewId);
        textViewEmail = (TextView) findViewById(R.id.textViewEmail);


    }



    public void editProfile(View view){
        Intent intent = new Intent(this, Profile.class);
        startActivityForResult(intent, REQUEST_PROFILE_UPDATE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // requestCode = the unique code that your activity sent with an intent
        // resultCode = Store either OK or cancel
        // data = the data returned from an intent
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_PROFILE_UPDATE ){
            String id, email;
            id = data.getStringExtra(USER_ID);
            email = data.getStringExtra(USER_EMAIL);

            //Display data on UI
            textViewID.setText(getString(R.string.id)+id);
            textViewEmail.setText(getString(R.string.email) + email);


        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main Activity","onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main Activity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main Activity","onResume");
    }



}
