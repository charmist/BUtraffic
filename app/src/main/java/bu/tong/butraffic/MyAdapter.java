package bu.tong.butraffic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return 0;
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
        return null;
    }
}   //Main Class
