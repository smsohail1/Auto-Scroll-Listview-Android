package example.com.autoscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get reference of widgets from XML layout
        final ListView lv = (ListView) findViewById(R.id.lv);
        Button btn = (Button) findViewById(R.id.btn);

        // Initializing a new String Array
        String[] fruits = new String[] {
                "Abiu",
                "Batuan",
                "Black Mulberry",
                "Cape Gooseberry",
                "Desert banana",
                "Eastern May Hawthorn",
                "Fibrous Satinash",
                "Gooseberry",
                "Hairless rambutan",
                "Illawarra Plum",
                "Jelly Palm",
                "Kepel fruit",
                "Little gooseberry tree",
                "Mammee Apple",
                "Nagami Kumquat",
                "Oil Palm",
                "Peanut butter fruit",
                "Queensland Ebony",
                "Red Mulberry",
                "Sageretia",
                "Tahitian apple",
                "Ugni",
                "Vanilla",
                "Watermelon",
                "Yellow Granadilla",
                "Zig Zag Vine"
        };

        // Create a List from String Array elements
        final List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, fruits_list);

        // DataBind ListView with items from ArrayAdapter
        lv.setAdapter(arrayAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                    public void smoothScrollToPosition (int position)
                        Smoothly scroll to the specified adapter position. The view
                        will scroll such that the indicated position is displayed.

                        position : Scroll to this adapter position.

                    Adapter getCount()
                        How many items are in the data set represented by this Adapter.

                 */
                lv.smoothScrollToPosition(arrayAdapter.getCount());
            }
        });
    }

}
