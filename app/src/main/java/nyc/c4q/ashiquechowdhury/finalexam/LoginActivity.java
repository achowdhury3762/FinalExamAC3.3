package nyc.c4q.ashiquechowdhury.finalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = (EditText) findViewById(R.id.username_edit_text);
        passwordEditText = (EditText) findViewById(R.id.password_edit_text);
    }

    public void onClickSubmit(View view){
        if (usernameEditText.getText().toString().equals("")) {
            Toast.makeText(this, "Enter a Username", Toast.LENGTH_LONG).show();
        }
        else if(passwordEditText.getText().toString().equals("")){
            Toast.makeText(this, "Enter a Password", Toast.LENGTH_LONG).show();
        }
        else{
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
