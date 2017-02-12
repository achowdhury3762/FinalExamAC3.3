package nyc.c4q.ashiquechowdhury.finalexam.navdrawerrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.ashiquechowdhury.finalexam.ClickListener;
import nyc.c4q.ashiquechowdhury.finalexam.R;
import nyc.c4q.ashiquechowdhury.finalexam.util.NavRow;

/**
 * Created by ashiquechowdhury on 2/12/17.
 */
public class NothingAdapter extends RecyclerView.Adapter<NothingViewHolder> {
    private List<NavRow> rowList;
    private ClickListener mListener;

    public NothingAdapter(List<NavRow> rowList, ClickListener listener) {
        this.rowList = rowList;
        mListener = listener;
    }

    @Override
    public NothingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.navdrawer_row, parent, false);
        return new NothingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NothingViewHolder holder, int position) {
        holder.bind(rowList.get(position), mListener);
    }

    @Override
    public int getItemCount() {
        return rowList.size();
    }
}
