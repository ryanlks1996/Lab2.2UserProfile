package my.edu.tarc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    public static final String ID = "my.edu.tarc.lab22userprofile.ID" ;
    public static final String EMAIL = "my.edu.tarc.lab22userprofile.EMAIL" ;
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
        intent.putExtra(ID,id);
        intent.putExtra(EMAIL,email);

        setResult(MainActivity.REQUEST_PROFILE_UPDATE,intent);
        finish();
    }
}
