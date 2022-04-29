package eu.interopehrate.hri.mobilehri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.JsonObject;

import eu.interopehrate.hri.mhri.controller.HealthRecordIndexController;
import eu.interopehrate.hri.mhri.model.Citizen;


public class CreateCitizen extends AppCompatActivity {

    TextView textView;
    HealthRecordIndexController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_citizen);

        textView = findViewById(R.id.textView);
        controller = new HealthRecordIndexController();

//        createCitizen();
//        findId();
      findCitizen();
//        deleteCitizen();
//        updateCItizen();
    }

    private void updateCItizen() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try  {
                    // Your code goes here
                    JsonObject response = controller.updateCitizen("eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE2NTAwMzE3MjYsInRva2VuTmFtZSI6ImhyaUFjY2Vzc1Rva2VuIiwiY2l0aXplblVzZXJuYW1lIjoiZmluYWxNb2JpbGVBdXRoIiwiY2xvdWRVcmkiOiJmaW5hbE1vYmlsZUF1dGgifQ.vsQ6V8V5L4wwrLDe6qQSTXYC9sMWxSM4u0kS5no40wLHckaky_E4EryPa2qRdvq1SFB8qfYuvHH1TeH-GiJwsg", "62597c6e16a052727f53c234", "finalMobileAuth", "finalMobileAuth", "finalMobileAuth");
                    System.out.println(response.get("data"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    private void deleteCitizen() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try  {
                    // Your code goes here
                    JsonObject response = controller.deleteCitizen("eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE2NTAwMzE3MjYsInRva2VuTmFtZSI6ImhyaUFjY2Vzc1Rva2VuIiwiY2l0aXplblVzZXJuYW1lIjoiZmluYWxNb2JpbGVBdXRoIiwiY2xvdWRVcmkiOiJmaW5hbE1vYmlsZUF1dGgifQ.vsQ6V8V5L4wwrLDe6qQSTXYC9sMWxSM4u0kS5no40wLHckaky_E4EryPa2qRdvq1SFB8qfYuvHH1TeH-GiJwsg","62597c6e16a052727f53c234");
                    System.out.println(response.get("data"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    private void findCitizen() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try  {
                    // Your code goes here
                    JsonObject response = controller.findCitizen("eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE2NTEwNTQzMDAsInRva2VuTmFtZSI6ImhyaUFjY2Vzc1Rva2VuIiwiY2l0aXplblVzZXJuYW1lIjoibmV3VGVzdCIsImNsb3VkVXJpIjoibmV3VGVzdCJ9.T1JcxBNVRRBE4JfBvhCxo_Vcqt_hat6qADPO3a2ciy6abx6t5Ee50JlqPgzyd9zQz1XmpbcyNj9hSgmCX8-sdQ","newTest", "newTest");
                    System.out.println(response.get("data"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    private void findId() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try  {
                    // Your code goes here
                JsonObject response = controller.findById("eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE2NTAwMzE3MjYsInRva2VuTmFtZSI6ImhyaUFjY2Vzc1Rva2VuIiwiY2l0aXplblVzZXJuYW1lIjoiZmluYWxNb2JpbGVBdXRoIiwiY2xvdWRVcmkiOiJmaW5hbE1vYmlsZUF1dGgifQ.vsQ6V8V5L4wwrLDe6qQSTXYC9sMWxSM4u0kS5no40wLHckaky_E4EryPa2qRdvq1SFB8qfYuvHH1TeH-GiJwsg","62597c6e16a052727f53c234");
                System.out.println(response.get("data"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

    }

    private void createCitizen(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try  {
                    // Your code goes here
                   JsonObject response = controller.createCitizen("finalMobileAuth","finalMobileAuth", "finalMobileAuth");
                    System.out.println(response.get("data"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}