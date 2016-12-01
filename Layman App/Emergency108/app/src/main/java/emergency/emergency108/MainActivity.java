package emergency.emergency108;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        Button ambulance = (Button) findViewById(R.id.AmbButton);
        Button police = (Button) findViewById(R.id.PolButton);
        Button fire = (Button) findViewById(R.id.FirButton);

        ambulance.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {

                Intent nextScreen = new Intent(getApplicationContext(),EnterDetailsActivity.class);
                nextScreen.putExtra("type","Ambulance");
                startActivity(nextScreen);

            }
        } );

        police.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {

                Intent nextScreen = new Intent(getApplicationContext(),EnterDetailsActivity.class);
                nextScreen.putExtra("type","Police");
                startActivity(nextScreen);

            }
        });

        fire.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), EnterDetailsActivity.class);
                nextScreen.putExtra("type","Fire");
                startActivity(nextScreen);

            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
