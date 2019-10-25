package id.nama.paket;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PesanAktivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		// Get the message from the intent
		Intent inten = getIntent();
		String pesan = inten.getStringExtra(MainActivity.EXTRA_PESAN);

		// Create the text view
		TextView teksView = new TextView(this);
		teksView.setTextSize(40);
		teksView.setText(pesan);

		// Set the text view as the activity layout
        //setContentView(R.layout.activity_display_message);
		setContentView(teksView);

        if (savedInstanceState == null) {
            /*getFragmentManager().beginTransaction()
                .add(R.id.kontainer, new PlaceholderFragment()).commit();*/
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.aksi_keluar) {
			finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() { }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup kontainer,
                  Bundle savedInstanceState) {
              View akarView = inflater.inflate(R.layout.fragmen_pesan,
                      kontainer, false);
              return akarView;
        }
    }
}
