package com.genius_quiz.gourav.geniusquiz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SUMIT_THAKUR on 06/05/17.
 */

public class RecyclerViewAdapter extends android.support.v7.widget.RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<DataModel> dataModels;

    public RecyclerViewAdapter(Context context, ArrayList<DataModel> dataModels) {
        this.dataModels = dataModels;
        this.context = context;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View convertView;
        convertView = LayoutInflater.from(context).inflate(R.layout.activity_quiz, parent, false);
        ViewHolder viewHolder = new ViewHolder(convertView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        DataModel obj = dataModels.get(position);
        holder.tvQuestions.setText(obj.getmQuestion());
        holder.rbOptionA.setText(obj.getmOptionA());
        holder.rbOptionB.setText(obj.getmOptionB());
        holder.rbOptionC.setText(obj.getmOptionC());
        holder.rbOptiond.setText(obj.getmOptiond());
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvQuestions;
        private RadioButton rbOptionA, rbOptionB, rbOptionC, rbOptiond;
        public ViewHolder(View itemView) {
            super(itemView);
            tvQuestions = (TextView) itemView.findViewById(R.id.tvQuestion);
            rbOptionA = (RadioButton) itemView.findViewById(R.id.radio_option_a);
            rbOptionB = (RadioButton) itemView.findViewById(R.id.radio_option_b);
            rbOptionC = (RadioButton) itemView.findViewById(R.id.radio_option_c);
            rbOptiond = (RadioButton) itemView.findViewById(R.id.radio_option_d);

        }
    }
}
