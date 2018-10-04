package digitalhouse.com.ar.miprimerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        String urlToShare = "https://techcrunch.com/";

        EditText editText = findViewById(R.id.editTextUrl);
        String url = editText.getText().toString();

        if (url.length() > 0) {
            urlToShare = url;
        }

        Intent mIntentFacebook = new Intent();
        mIntentFacebook.setAction("android.intent.action.SEND");
        mIntentFacebook.setType("text/plain");
        mIntentFacebook.putExtra("android.intent.extra.TEXT", urlToShare);
        startActivity(mIntentFacebook);
    }

}
