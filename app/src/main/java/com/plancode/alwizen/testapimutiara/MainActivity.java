package com.plancode.alwizen.testapimutiara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

public class MainActivity extends AppCompatActivity implements AsyncResponse {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PostResponseAsyncTask task = new PostResponseAsyncTask(this);
        task.execute("https://mutiara.nyimak.id/api/users");

    }

    @Override
    public void processFinish(String result) {
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}
