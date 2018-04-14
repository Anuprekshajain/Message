package anupreksha.com.message.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import anupreksha.com.message.Helper.SharedPrefManager;
import anupreksha.com.message.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ChatBox");

        //if user is already logged in openeing the profile activity
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, HomeActivity.class));
        }

    }
    public void onLogin(View view){
      startActivity(new Intent(this, LoginActivity.class));
    }

    public void onSignUp(View view){
      startActivity(new Intent(this,SignUpActivity.class));
    }
}
