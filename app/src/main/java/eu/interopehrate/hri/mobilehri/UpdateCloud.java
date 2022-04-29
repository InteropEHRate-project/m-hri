package eu.interopehrate.hri.mobilehri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;

import eu.interopehrate.hri.mhri.api.HealthRecordIndexI;

public class UpdateCloud extends AppCompatActivity {

//    TextView textView;
//    HealthRecordIndexFactory controller;
//    HealthRecordIndexI HRInterface;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_update_cloud);
//
//        textView = findViewById(R.id.textView);
//        controller = new HealthRecordIndexFactory();
//        HRInterface = RetrofitClient.getClient().create(HealthRecordIndexI.class);
//        updateCloud();
//    }
//
//    private void updateCloud() {
//        controller.updateCloud("60ae1325c21011325f6bff73", "CloudUP", new HealthRecordIndexFactory.mhriInterface() {
//            @Override
//            public void onResponse(String citizen) throws Exception {
//                JSONObject json = new JSONObject(citizen);
//
//                textView.append(json.toString(4));
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//                textView.setText("Code: " +t.getMessage());
//            }
//        });
//    }
}