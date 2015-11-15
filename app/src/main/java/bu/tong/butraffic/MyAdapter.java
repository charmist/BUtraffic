package bu.tong.butraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by student on 11/14/2015.
 */
public class MyAdapter extends BaseAdapter{

    // ประกาศตัวแปร
    private Context obContext;
    private String[] titleStrings;
    private int[] iconInts;

    public MyAdapter(Context obContext, String[] titleStrings, int[] iconInts) {
        this.obContext = obContext;
        this.titleStrings = titleStrings;
        this.iconInts = iconInts;
    }   //Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater objLayoutInflater = (LayoutInflater) obContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //Setup Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);
        //Setup Icon
        ImageView icImageView = (ImageView) objView1.findViewById(R.id.imageView);
        icImageView.setImageResource(iconInts[position]);   //เซ็ตตำแหน่งของ icon

        return objView1;

    }
}   //Main Class
