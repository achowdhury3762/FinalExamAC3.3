package nyc.c4q.ashiquechowdhury.finalexam.navdrawerrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.ashiquechowdhury.finalexam.ClickListener;
import nyc.c4q.ashiquechowdhury.finalexam.R;
import nyc.c4q.ashiquechowdhury.finalexam.util.NavRow;

/**
 * Created by ashiquechowdhury on 2/12/17.
 */
public class NothingViewHolder extends RecyclerView.ViewHolder{
    private ImageView iconImageView;
    private TextView iconTextView;

    public NothingViewHolder(View itemView) {
        super(itemView);
        iconImageView = (ImageView) itemView.findViewById(R.id.icon);
        iconTextView = (TextView) itemView.findViewById(R.id.icon_text);
    }

    public void bind(final NavRow navRow, final ClickListener mListener) {
        iconImageView.setImageResource(navRow.getDrawableInt());
        iconTextView.setText(navRow.getName());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(navRow.getName()){
                    case "Heart":
                        mListener.onClickHeart(navRow.getName());
                        break;
                    case "Settings":
                        mListener.onClickSettings(navRow.getName());
                        break;
                    case "Message":
                        mListener.onClickMessage(navRow.getName());
                        break;
                    case "Logout":
                        mListener.onClickLogout(navRow.getName());
                        break;
                }
            }
        });
    }
}
