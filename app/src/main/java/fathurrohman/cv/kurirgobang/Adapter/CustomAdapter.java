package fathurrohman.cv.kurirgobang.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import fathurrohman.cv.kurirgobang.CustomPesan;
import fathurrohman.cv.kurirgobang.DetailPemesan;
import fathurrohman.cv.kurirgobang.R;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    //Creating an arraylist of POJO objects
    private ArrayList<CustomPesan> list_members = new ArrayList<>();
    private final LayoutInflater inflater;
    View view;
    MyViewHolder holder;
    private Context context;


    public CustomAdapter(Context context, ArrayList<CustomPesan> list_members) {
        this.context = context;
        this.list_members = list_members;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = inflater.inflate(R.layout.custom_recycler, parent, false);
        holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        CustomPesan list_items = list_members.get(position);
        holder.user_name.setText(list_items.getName());
        holder.alamat.setText(list_items.getAlamat());
        holder.status.setText(list_items.getStatus());

        holder.pemesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pesan = new Intent(context, DetailPemesan.class);
                context.startActivity(pesan);
            }
        });
    }

    //Setting the arraylist
    public void setListContent(ArrayList<CustomPesan> list_members) {
        this.list_members = list_members;
        notifyItemRangeChanged(0, list_members.size());

    }


    @Override
    public int getItemCount() {
        return list_members.size();
    }


    //View holder class, where all view components are defined
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView user_name, alamat, status;
        RelativeLayout pemesan;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            user_name = (TextView) itemView.findViewById(R.id.user_name);
            alamat = (TextView) itemView.findViewById(R.id.content);
            status = (TextView) itemView.findViewById(R.id.status);
            pemesan = itemView.findViewById(R.id.pemesan);

        }

        @Override
        public void onClick(View v) {

        }
    }

    public void removeAt(int position) {
        list_members.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(0, list_members.size());
    }

}

