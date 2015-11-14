package bu.tong.butraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.LiveFolders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //การประกาศตัวแปล
    private ListView trafficListView;
    private Button aboutMeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind Widget
        bindWidget();
        //Button Controller
        buttonController();


    }   //Main Method

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sound Effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.cat);
                buttonPlayer.start();
                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://www.facebook.com/charmist"));
                startActivity(objIntent);
            }   //event
        });

    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }
}   //Main Class คลาสหลัก
