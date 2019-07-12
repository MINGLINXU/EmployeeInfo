package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<viewInfo>viewInfosList;

    public CustomerAdapter(Context context, int resource, ArrayList<viewInfo> objects){
        super(context,resource,objects);

        parent_context = context;
        layout_id = resource;
        viewInfosList = objects;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){

        LayoutInflater inflater=(LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        viewInfo currentInfo = viewInfosList.get(position);

        tvName.setText(currentInfo.getName());
        tvTitle.setText(currentInfo.getTitle());
        tvSalary.setText(currentInfo.getSalary().toString());

        return rowView;
    }

}
