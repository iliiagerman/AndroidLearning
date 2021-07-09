package com.german.androidlearning.Lesons20_40.UserInterface.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.german.androidlearning.R;

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.NumberViewHolder>{

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( NumbersAdapter.NumberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder{

        TextView listItemNumberView;
        TextView viewHolderIndex;
        public NumberViewHolder(View itemView){
            super(itemView);

            listItemNumberView = itemView.findViewById(R.id.tv_number_item);
            viewHolderIndex = itemView.findViewById(R.id.tv_view_holder_number);
        }

        void vind(int listIndex){
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
