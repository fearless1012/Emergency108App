package emergency.emergency108;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        Button Send = (Button) findViewById(R.id.SendDetails);
        Bundle bundle = getIntent().getExtras();
        final String type = bundle.getString("type") ;

        final EditText injured = (EditText)findViewById(R.id.injuredText) ;
        final EditText critical = (EditText) findViewById(R.id.criticalText);
        final EditText death = (EditText) findViewById(R.id.DeathText);


        Send.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                Intent nextScreen = new Intent(getApplicationContext(),MessageActivity.class);
                nextScreen.putExtra("type",type);
                nextScreen.putExtra("injured",injured.getText().toString());
                nextScreen.putExtra("critical",critical.getText().toString());
                nextScreen.putExtra("death",death.getText().toString());
                startActivity(nextScreen);
                //finish();
            }
        } );


    }

}
