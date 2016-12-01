package emergency.emergency108;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        GPSTracker mGPS = new GPSTracker(this);

        Bundle bundle = getIntent().getExtras();

        String type = bundle.getString("type");
        String injured = bundle.getString("injured");
        String critical = bundle.getString("critical");
        String death = bundle.getString("death");

        TextView message = (TextView) findViewById(R.id.message);
        if(mGPS.canGetLocation ){
            mGPS.getLocation();
            message.setText(type + " accident at \n" + "Lat"+mGPS.getLatitude()+"Lon"+mGPS.getLongitude() + "\n" + injured + " injured \n" + critical + " critical \n" + death + " deaths");
        }else{
            message.setText(type + " accident \n" + injured + " injured \n" + critical + " critical \n" + death + " deaths");
        }



    }
}
