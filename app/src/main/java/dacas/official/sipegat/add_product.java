package dacas.official.sipegat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import dacas.official.sipegat.model.Product;

public class add_product extends AppCompatActivity {
    private static final String TAG = "add Product";
    private DatabaseReference database;
    private EditText etNameProduct,etPriceProduct,etDescProduct;
    private Button btnSave;
    private ProgressDialog loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        database = FirebaseDatabase.getInstance().getReference();

        etNameProduct = findViewById(R.id.inputNameProduct);
        etPriceProduct = findViewById(R.id.inputPriceProduct);
        etDescProduct = findViewById(R.id.inputDescProduct);
        btnSave = findViewById(R.id.saveProduct);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etNameProduct.getText().toString();
                int price = Integer.parseInt(etPriceProduct.getText().toString().trim());
                String desc = etDescProduct.getText().toString();
                if(name.equals("")){
                    etNameProduct.setError("input name");
                    etNameProduct.requestFocus();
                }else if(desc.equals("")){
                    etDescProduct.setError("Input Description");
                    etDescProduct.requestFocus();
                }else{
                    loading = ProgressDialog.show(add_product.this,null,"Please Waitt!..",true,false);
                    submitProduct(new Product(name.toLowerCase(),price,desc.toLowerCase()));
                }
            }

            private void submitProduct(Product product) {
                database.child("Product").push().setValue(product)
                        .addOnSuccessListener(add_product.this, new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                loading.dismiss();
                                etNameProduct.setText("");
                                etPriceProduct.setText("");
                                etDescProduct.setText("");
                                Toast.makeText(add_product.this,"add Success",Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

    }
}
