package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;
    ArrayList<viewInfo>employeeInfo = new ArrayList<>();
    CustomerAdapter infoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.listViewInfo);

        employeeInfo.add(new viewInfo("John","Software Technical Leader",3400.0));
        employeeInfo.add(new viewInfo("May","Programmer",2200.0));

        infoAdapter = new CustomerAdapter(this,R.layout.row,employeeInfo);
        lvInfo.setAdapter(infoAdapter);

    }
}
