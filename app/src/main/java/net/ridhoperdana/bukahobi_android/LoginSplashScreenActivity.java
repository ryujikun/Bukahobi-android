package net.ridhoperdana.bukahobi_android;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class LoginSplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_splash_screen);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        Button masuk_aplikasi = (Button)findViewById(R.id.tombolMasuk);
        masuk_aplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogLogin();
            }
        });
    }

    public void showDialogLogin()
    {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.login_dialog, null);
        dialogBuilder.setView(dialogView);

        ConstraintLayout layout_bl = (ConstraintLayout) dialogView.findViewById(R.id.tombolLoginBukalapak);
        ConstraintLayout layout_google = (ConstraintLayout) dialogView.findViewById(R.id.tombolLoginGoogle);
        ConstraintLayout layout_fb = (ConstraintLayout) dialogView.findViewById(R.id.tombolLoginFacebook);

//        dialogBuilder.setCancelable(true);
        AlertDialog show_dialog = dialogBuilder.create();
        show_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        show_dialog.show();
    }
}
