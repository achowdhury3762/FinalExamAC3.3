package nyc.c4q.ashiquechowdhury.finalexam.numberrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.ashiquechowdhury.finalexam.R;

/**
 * Created by ashiquechowdhury on 2/12/17.
 */
public class NumberAdapter extends RecyclerView.Adapter<NumberViewHolder> {


    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.number_row, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        TextView numberText = (TextView) holder.itemView;
        numberText.setText("Setting - " + String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
