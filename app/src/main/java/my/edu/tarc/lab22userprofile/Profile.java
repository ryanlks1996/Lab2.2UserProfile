package my.edu.tarc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private EditText editTextID, editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Link UI to program
        editTextID = (EditText) findViewById(R.id.editTextId);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
    }

    public void save(View view){
        Intent intent = new Intent();
        String id,email;
        id = editTextID.getText().toString();
        email = editTextEmail.getText().toString();

        //Passing data to an Inte
        // Format: putExtra(Tag,value)
        intent.putExtra(MainActivity.USER_ID,id);
        intent.putExtra(MainActivity.USER_EMAIL,email);

        setResult(MainActivity.REQUEST_PROFILE_UPDATE,intent);
        finish();
    }

}
