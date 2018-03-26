package limasrikandi.editha.example.com.limasrikandi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;

public class LokasiHomeTreatment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi_home_treatment);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        PopupMenu popup = new PopupMenu(view.getContext(),view );
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.mylistmenu, popup.getMenu());

        //Handle Menu Click
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            
        }
}
