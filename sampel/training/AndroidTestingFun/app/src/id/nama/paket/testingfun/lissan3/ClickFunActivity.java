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
package id.nama.paket.testingfun.lissan3;

import id.nama.paket.testingfun.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Activity which shows a "click me" button. When the button is clicked, a TextView is shown below
 * the button.
 */
public class ClickFunActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivity_klick_fun);

        final TextView infoTeksView = findViewById(R.id.info_text_view);
        final Button klickMiButang = findViewById(R.id.launch_next_activity_button);
        klickMiButang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoTeksView.setVisibility(View.VISIBLE);
                infoTeksView.setText(getString(R.string.info_teks));
            }
        });
    }
}
