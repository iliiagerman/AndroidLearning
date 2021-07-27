package com.german.androidlearning.Lesons20_40.UserInterface.recyclerview.RecyclerExample1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import com.german.androidlearning.R;

//ТУТ СОЗДАЕМ НАШ СОБСТВЕННЫЙ АДАПТЕР

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.NumberViewHolder> {

    private static int viewHolderCount;
    private int numderItems;
    private Context parent;

    public NumbersAdapter(int numderOfItems, Context parent) {
        numderItems = numderOfItems;
        viewHolderCount = 0;

        this.parent = parent;
    }

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.activity_recyclerview_number_list_item;

        LayoutInflater inflater = LayoutInflater.from(context);

        // первый id xml файла,второй аргумент узнает с какого родителя,
        // последний аргумент спрашевает надо ли нам помещять то что мы создали в родителський класс
        View view = inflater.inflate(layoutIdForListItem, parent, false);

        NumberViewHolder viewHolder = new NumberViewHolder(view);
        viewHolder.viewHolderIndex.setText("ViewHolder index" + viewHolderCount);

        viewHolderCount++;

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return numderItems;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        TextView listItemNumberView;
        TextView viewHolderIndex;

        public NumberViewHolder(View itemView) {
            super(itemView);
            listItemNumberView = itemView.findViewById(R.id.tv_number_item);
            viewHolderIndex = itemView.findViewById(R.id.tv_view_holder_number);
            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                      int positionIndex = getAdapterPosition();
                 // первый аргумент это котекст, второй это что мы хотим вывести
                 // третий это на какую продолжительность
                     Toast toast = Toast.makeText(parent ,"Element " + positionIndex + " was clicked!",Toast.LENGTH_SHORT);

                     toast.show();
                }
            });
        }

        void bind(int listIndex)  {
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
