package com.example.listviewtest;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by apple1 on 2017/3/30.
 */

//public class FruitAdapter extends ArrayAdapter<Fruit> {
//    private int resourceId;
//
//    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
//        super(context,textViewResourceId,objects);
//        resourceId = textViewResourceId;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        Fruit fruit = getItem(position); // 获得当前项的Fruit
//        View view;
//        ViewHolder viewHolder;
//        if (convertView == null){
//            view =  LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
//            viewHolder = new ViewHolder();
//            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
//            viewHolder.fruitName = (TextView)view.findViewById(R.id.fruit_name);
//            view.setTag(viewHolder); // 将ViewHolder 存储在View中
//        } else {
//            view = convertView;
//            viewHolder = (ViewHolder)view.getTag(); // 重新获取 ViewHolder
//        }
//        viewHolder.fruitImage.setImageResource(fruit.getImageId());
//        viewHolder.fruitName.setText(fruit.getName());
//        return  view;
//    }
//
//    private class ViewHolder{
//        ImageView fruitImage;
//        TextView fruitName;
//    }
//
//}

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private List<Fruit> mFruitList;
    private static final String TAG = "ACJTAG FruitAdapter";

    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView fruitImage;
        TextView fruitName;
        public ViewHolder(View view){
            super(view);
            Log.d(TAG, "ViewHolder: " + view);
            fruitView = view;
            fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            fruitName = (TextView) view.findViewById(R.id.fruit_name);
        }
    }

    public FruitAdapter(List<Fruit> fruitList){
        mFruitList = fruitList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fruit_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(v.getContext(),"you click view" + fruit.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        holder.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(v.getContext(),"you clicked image"+fruit.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return  holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}