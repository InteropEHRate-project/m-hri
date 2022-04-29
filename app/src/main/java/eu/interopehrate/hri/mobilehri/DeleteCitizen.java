package eu.interopehrate.hri.mobilehri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import eu.interopehrate.hri.mhri.api.HealthRecordIndexI;

public class DeleteCitizen extends AppCompatActivity {

//    TextView textView;
//
//    HealthRecordIndexFactory controller;
//    HealthRecordIndexI HRInterface;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_delete_citizen);
//
//        textView = findViewById(R.id.textView);
//        controller = new HealthRecordIndexFactory();
//        HRInterface = RetrofitClient.getClient().create(HealthRecordIndexI.class);
//        removeData();
//    }
//
//    private void removeData() {
//        controller.removeData("60ae1e5a42e42e3b91e3a4f0", new HealthRecordIndexFactory.mhriInterface() {
//            @Override
//            public void onResponse(String citizen) throws Exception {
//
////                JSONObject json = new JSONObject(citizen);
//
////                textView.append(json.toString(4));
//
//                textView.setText(citizen);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//                textView.setText("Code: " +t.getMessage());
//            }
//        });
//    }
}