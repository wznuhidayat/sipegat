package dacas.official.sipegat.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import dacas.official.sipegat.R;
import dacas.official.sipegat.model.Product;


import java.util.ArrayList;
import java.util.List;
public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<Product> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<Product>();
        Product nama = new Product();
        nama.setProductName("Product 1");
        nama.setImageProduct(R.drawable.noimage);
        nama.setPrice(20000);
        mItems.add(nama);

        nama = new Product();
        nama.setProductName("Product 1");
        nama.setImageProduct(R.drawable.noimage);
        nama.setPrice(20000);
        mItems.add(nama);

        nama = new Product();
        nama.setProductName("Product 1");
        nama.setImageProduct(R.drawable.noimage);
        nama.setPrice(20000);
        mItems.add(nama);

        nama = new Product();
        nama.setProductName("Product 1");
        nama.setImageProduct(R.drawable.noimage);
        nama.setPrice(20000);
        mItems.add(nama);

        nama = new Product();
        nama.setProductName("Product 1");
        nama.setImageProduct(R.drawable.noimage);
        nama.setPrice(20000);
        mItems.add(nama);



    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Product nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getProductName());
        viewHolder.imgThumbnail.setImageResource(nature.getImageProduct());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.images);
            tvspecies = (TextView)itemView.findViewById(R.id.nameProduct);

        }
    }
}
