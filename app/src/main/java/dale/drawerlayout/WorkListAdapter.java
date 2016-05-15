package dale.drawerlayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KimDaeIl on 16. 5. 16..
 */
public class WorkListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.main_list_item, parent, false);
        }

//        ImageView profileImage = (ImageView) convertView.findViewById(R.id.profileImage);
//        TextView title = (TextView) convertView.findViewById(R.id.title);
//        TextView location = (TextView) convertView.findViewById(R.id.location);
//        TextView workDate = (TextView) convertView.findViewById(R.id.workDate);
//        TextView price = (TextView) convertView.findViewById(R.id.price);
//        TextView regDate = (TextView) convertView.findViewById(R.id.regDate);
//
//        profileImage.setImageResource(R.drawable.ic_menu_camera);
//        title.setText("제목");
//        location.setText("지역");
//        workDate.setText("날짜");
//        price.setText("");
//        regDate.setText("regDate");

        return convertView;
    }
}
