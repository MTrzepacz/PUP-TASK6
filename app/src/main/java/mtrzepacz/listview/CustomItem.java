package mtrzepacz.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomItem extends AppCompatActivity {
    private ListView listView;
    List<String> mainItemList = new ArrayList<String>();
    List<String> subItemList = new ArrayList<String>();
    ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_item);
        listView = (ListView) findViewById(R.id.ListView4);

       /* HashMap<String,String> testMap = new HashMap<String,String>();
        for(int i = 0 ; i < 20 ; i++)
        {
            testMap = new HashMap<String,String>();
            testMap.put("Line1",i+" Main Value");
            testMap.put("Line2",i+" Sub Value");
            list.add(testMap);
        }
        String[] from =  {"Line1", "Line2"};
        int[] to = {android.R.id.text1, android.R.id.text2}; */

        for(int i = 0 ; i < 20 ; i++)
            mainItemList.add(i,"Main Item nr "  + i);

        for(int i = 0 ; i < 20 ; i++)
            subItemList.add(i,"Sub Item nr "  + i);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Object o =  listView.getItemAtPosition(position);
                String string =  mainItemList.get(position) + "\n" + subItemList.get(position);
                Toast.makeText(getApplicationContext(),string,Toast.LENGTH_SHORT).show();
            }
        });
        listView.setAdapter(customAdapter);




    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mainItemList.size();
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
            convertView = getLayoutInflater().inflate(R.layout.list_view_item_custom_item,null);
            TextView textView1 = (TextView) convertView.findViewById(R.id.MainItem);
            TextView textView2 = (TextView) convertView.findViewById(R.id.SubItem);

            textView1.setText(mainItemList.get(position).toString());
            textView2.setText(subItemList.get(position).toString());
            return convertView;
        }
    }

}
