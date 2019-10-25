package id.nama.paket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener
{
	public final static String EXTRA_PESAN = "PESAN";
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Button baton = findViewById(R.id.button_send);
		baton.setOnClickListener(this);
    }
	
	/** Called when the user clicks the Send button */
	public void kirimPesan(View view) {
		// Do something in response to button
		Intent intent = new Intent(this, PesanAktivity.class);
		EditText editText = findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_PESAN, message);
		startActivity(intent);
	}

	@Override
	public void onClick(View p1)
	{
		// TODO: Implement this method
		kirimPesan(p1);
		
	}
}
