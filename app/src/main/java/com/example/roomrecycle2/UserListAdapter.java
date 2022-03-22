package com.example.roomrecycle2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomrecycle2.db.User;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.MyViewHolder> {
    TextView t1;

    private Context context;
    private List<User> userList;

    public UserListAdapter(Context context){
        this.context=context;
    }

    public void setUserList(List<User> userList){
        this.userList=userList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public UserListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycyler_row,parent,false);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull UserListAdapter.MyViewHolder holder, int position) {
        holder.tvboid.setText(this.userList.get(position).boId);
        holder.tvstck.setText(this.userList.get(position).stockName);
        holder.tvquantity.setText(this.userList.get(position).quantity);
        holder.tvbuyingprc.setText(this.userList.get(position).buyingPrice);
        holder.tvsellinpri.setText(this.userList.get(position).sellingPrice);
        holder.tvprofitlos.setText(this.userList.get(position).profitLoss);


    }

    @Override
    public int getItemCount() {
        return this.userList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvboid,tvstck,tvquantity,tvbuyingprc,tvsellinpri,tvprofitlos;
        public MyViewHolder(View view){
            super(view);
            tvboid = view.findViewById(R.id.tvbiod);
            tvstck = view.findViewById(R.id.tvstockname);
            tvquantity = view.findViewById(R.id.tvquantity);
            tvbuyingprc = view.findViewById(R.id.tvbuyinpr);
            tvsellinpri = view.findViewById(R.id.tvsellpric);
            tvprofitlos = view.findViewById(R.id.tvprofitloss);
        }
    }
}
