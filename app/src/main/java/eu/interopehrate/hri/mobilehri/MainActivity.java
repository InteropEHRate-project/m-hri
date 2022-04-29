package eu.interopehrate.hri.mobilehri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button createdButton;
    private Button deleteButton;
    private Button updateCloudButton;
    private Button updateUsernameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createdButton = (Button) findViewById(R.id.createButton);

        createdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateCitizenActivity();
            }
        });

        deleteButton = (Button) findViewById(R.id.deleteButton);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeleteCitizenActivity();
            }
        });

        updateCloudButton = (Button) findViewById(R.id.updateCloudButton);

        updateCloudButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUpdateCloudActivity();
            }
        });

        updateUsernameButton = (Button) findViewById(R.id.updateUsernameButton);

        updateUsernameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUpdateUsernameActivity();
            }
        });
    }

    private void openUpdateUsernameActivity() {
        Intent intent = new Intent(this, UpdateUsername.class);
        startActivity(intent);
    }

    private void openUpdateCloudActivity() {
        Intent intent = new Intent(this, UpdateCloud.class);
        startActivity(intent);
    }

    private void openDeleteCitizenActivity() {
        Intent intent = new Intent(this, DeleteCitizen.class);
        startActivity(intent);
    }


    private void openCreateCitizenActivity() {
        Intent intent = new Intent(this, CreateCitizen.class);
        startActivity(intent);
    }
}