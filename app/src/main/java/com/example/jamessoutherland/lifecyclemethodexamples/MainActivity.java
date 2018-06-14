package com.example.jamessoutherland.lifecyclemethodexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //References Buttons located in XML associated with this activity.
    private Button newActivityButton;
    private Button finishProgramButton;

    private Intent newActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creates Small popup at the bottom of the screen
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        //Links the variable reference to a specific UI element by id (name)
        newActivityButton = findViewById(R.id.start_new_activity);
        finishProgramButton = findViewById(R.id.finish_activity_button);

        //Setting Intent to navigate from THIS activity to a different one
        newActivity = new Intent(this, SecondActivity.class);

        //Methods to initiate onClickListeners for the buttons in the UI
        setListeners();
    }

    private void setListeners() {
        //Sets listener for newActivityButton only
        newActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Takes our intent and tells it to use that to start a new Activity
                startActivity(newActivity);


            }
        });
        //Sets listener for finishProgramButton only
        finishProgramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Closes current activity (in this location this called will close our program)
                finish();
            }
        });
}
//Lifecycle methods listed below
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }


}


