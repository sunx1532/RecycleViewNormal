package com.leejz.recycleviewnormal;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lijizhou on 2016/2/3.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.NormalViewHolder> {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private String [] mTitle;
    private int [] mPic;

    public RecyclerViewAdapter(Context context,String[]title,int[] pic){
        mContext=context;
        mTitle=title;
        mPic=pic;
        mLayoutInflater=LayoutInflater.from(context);

    }


    public  static class NormalViewHolder extends RecyclerView.ViewHolder{
        TextView mTextView;
        CardView mCardView;
        ImageView mImageView;
        public NormalViewHolder(View itemView) {
            super(itemView);
            mTextView=(TextView)itemView.findViewById(R.id.tv_text);
            mCardView=(CardView)itemView.findViewById(R.id.cv_item);
            mImageView=(ImageView)itemView.findViewById(R.id.iv_pic);
        }



    }
    @Override
    public NormalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new NormalViewHolder(mLayoutInflater.inflate(R.layout.item_view,parent,false));
    }

    /**
     * onBindViewHolder(NormalViewHolder holder, int position)
     * 专门用来绑定ViewHolder里的控件和数据源中position位置的数据。
     */
    @Override
    public void onBindViewHolder(NormalViewHolder holder, final int position) {
        holder.mTextView.setText(mTitle[position]);
        holder.mImageView.setBackgroundResource(mPic[position]);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mTitle[position],3000).show();
            }
        });

    }


    /**
     *
     * getItemCount()就不必多说了，和ListView是一样的
     */
    @Override
    public int getItemCount() {
        return mTitle==null ? 0 : mTitle.length;
    }
}
