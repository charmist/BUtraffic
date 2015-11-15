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
        //Create ListView
        createListview();
    }   //Main Method

    private void createListview() {
        //Setup Array
        String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลี้ยงซ้าย";
        strTitle[1] = "ห้ามเลี้ยงขวา";
        strTitle[2] = "ตรงไป";
        strTitle[3] = "เลี้ยงขวา";
        strTitle[4] = "เลี้ยงซ้าย";
        strTitle[5] = "ทางเข้า";
        strTitle[6] = "ทางออก";
        strTitle[7] = "หยุด";
        strTitle[8] = "จำกัดความสูง";
        strTitle[9] = "แยก";
        strTitle[10] = "ทางแยก";
        strTitle[11] = "ห้ามกลับรถ";
        strTitle[12] = "รถจอด";
        strTitle[13] = "รถสวน";
        strTitle[14] = "ห้ามแซง";
        strTitle[15] = "ทางเข้า";
        strTitle[16] = "หยุดตรวจ";
        strTitle[17] = "จำกัดความเร็ว";
        strTitle[18] = "จำกัดความกว้าง";
        strTitle[19] = "จำกัดความสูง";

        int[] intIcon = {
                    R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
                    R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                    R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09,
                    R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                    R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15,
                    R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
                    R.drawable.traffic_19, R.drawable.traffic_20};

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, strTitle, intIcon);
        trafficListView.setAdapter(objMyAdapter);

    }   //createListview

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
