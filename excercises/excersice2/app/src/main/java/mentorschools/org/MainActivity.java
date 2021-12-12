package mentorschools.org;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("org.mentorschools.quicklaucher.SOMETHING","Hello Wolrd!");
                startActivity(startIntent);
            }
            });

        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.google.com";
                Uri webAddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webAddress);

                if(gotoGoogle.resolveActivity(getPackageManager()) != null){

                    startActivity(gotoGoogle);
                }

            }
        });

    }
}