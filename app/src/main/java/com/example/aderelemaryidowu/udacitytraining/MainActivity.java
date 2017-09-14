package com.example.aderelemaryidowu.udacitytraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void login (View view)
    {
        EditText email = (EditText)findViewById(R.id.email_text);
        EditText password = (EditText)findViewById(R.id.password_text);
        String emailString = "lasisiolalekan@yahoo.com";
        String passwordString = "muslim1988";
        String emailText =  email.getText().toString();
        String passwordText = password.getText().toString();

       /* if(emailText.equalsIgnoreCase(emailString) && passwordText.equalsIgnoreCase(passwordString))
        {*/
            Intent intent = new Intent(this, Feed.class);
           /* intent.putExtra("email", emailText );
            intent.putExtra("password", passwordText);*/
            startActivity(intent);

        /*}

        else
        {
            Toast tos1 = Toast.makeText(this, "Please Enter Correct Email and Password", Toast.LENGTH_LONG);
            tos1.show();
        }*/


    }
}
