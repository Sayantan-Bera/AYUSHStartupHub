package adapters;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ayushstartuphub.Activity.AyushDepartmentActivity;
import com.example.ayushstartuphub.databinding.HomepageEachItemBinding;

import java.util.List;

import Models.DataModel;

public class Topic_list_adapter extends RecyclerView.Adapter<Topic_list_adapter.viewHolder> {
    
    List<DataModel> list;
    Context context;

    public Topic_list_adapter(List<DataModel> list, Context mainActivity) {
        this.list = list;
        context=mainActivity;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       HomepageEachItemBinding binding=HomepageEachItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
       return  new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.itemView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(context, AyushDepartmentActivity.class);
                        i.putExtra("name",list.get(holder.getAdapterPosition()).getTOPIC_NAME());
                        i.putExtra("image",list.get(holder.getAdapterPosition()).getPROFILE_IMAGE());
                        context.startActivity(i);
                    }
                }
        );
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        HomepageEachItemBinding binding;
        public viewHolder( HomepageEachItemBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;


        }

        public void setData(DataModel dataModel) {
//            Picasso.get().load(dataModel.getIMAGE_SRC()).into(binding.itemImage);

            binding.itemImage.setImageResource(dataModel.getPROFILE_IMAGE());
            binding.mainContent.setText(dataModel.getTOPIC_DESCRIPTION());
            binding.topicTitle.setText(dataModel.getTOPIC_NAME());
        }
    }
}
