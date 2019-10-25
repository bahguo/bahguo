/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package id.nama.paket.testingfun.lissan5;

import id.nama.paket.testingfun.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Sends a user generated message to the ReceiverActivity
 */
public class SenderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivity_zender);
        final Button kirimPesanButang = findViewById(R.id.send_message_button);
        final EditText pesanInputEditTeks = findViewById(R.id.message_input_edit_text);
        kirimPesanButang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pesanInputEditTeks != null) {
                    final CharSequence pesan = pesanInputEditTeks.getText();
                    startActivity(ReceiverActivity.buatIntent(SenderActivity.this, pesan));
                }
            }
        });
    }
}
