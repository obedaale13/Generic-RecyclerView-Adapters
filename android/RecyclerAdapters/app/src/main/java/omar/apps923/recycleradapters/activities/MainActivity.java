package omar.apps923.recycleradapters.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import omar.apps923.recycleradapters.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
    }

    public void showNormalAdapter(View view) {
        Intent intent=new Intent(this,NormalAdapterActivity.class);
        startActivity(intent);
    }

    public void showDataBindingAdapter(View view) {
        Intent intent=new Intent(this,DatabindingAdapterActivity.class);
        startActivity(intent);
    }
}
