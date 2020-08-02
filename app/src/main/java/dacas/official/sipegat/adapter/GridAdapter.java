package dacas.official.sipegat.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dacas.official.sipegat.R;
import dacas.official.sipegat.model.Product;


import java.util.ArrayList;
import java.util.List;
public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    Context mCtx;
    List<Product> mItems;

    public GridAdapter(Context mCtx, List<Product> mItems) {
//        super();
        this.mCtx = mCtx;
        this.mItems = mItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.grid_view, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = mItems.get(position);
//        holder.imgThumbnail.setImageDrawable(mCtx.getResources().getDrawable(product.getImageProduct()));
        holder.tvspecies.setText(product.getProductName());
        holder.tvprice.setText(String.valueOf(product.getPrice()));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies,tvprice;

        public ViewHolder(View itemView) {
            super(itemView);
//            imgThumbnail = (ImageView)itemView.findViewById(R.id.images);
            tvspecies = (TextView)itemView.findViewById(R.id.nameProduct);
            tvprice = (TextView)itemView.findViewById(R.id.price);

        }
    }
}
