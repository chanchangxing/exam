package me.chanchangxing.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class GsonActivity extends AppCompatActivity {

    private static final String JSON = "{\"name\": \"chen\", \"gender\": \"male\", \"habits\": [\"eat\", \"jump\"], \"ill\": {\"name\": \"cancel\", \"result\": \"dead\"}}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        findViewById(R.id.btn_to_json).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("chen", "male", new ArrayList<String>(), new Ill());

                Gson gson = new Gson();
                String string = gson.toJson(user);

                Toast.makeText(GsonActivity.this, string, Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_from_json).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gson gson = new Gson();
                User user = gson.fromJson(JSON, User.class);
                Toast.makeText(GsonActivity.this, user.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
