package application1.oran.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int comp = 0;
    TextView textR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        textR = (TextView) findViewById (R.id.textView);
        Button btn1 = (Button) findViewById (R.id.button);
        Button btn2 = (Button) findViewById (R.id.button2);
        Button btn3 = (Button) findViewById (R.id.button3);

        btn1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                String val = textR.getText ().toString ();
                comp = Integer.parseInt (val) + 1;
                textR.setText ("" + comp);


                Toast.makeText (getApplicationContext (), "", Toast.LENGTH_LONG).show ();
            }
        });

        btn2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                String val = textR.getText ().toString ();
                comp = Integer.parseInt (val) + 10;
                textR.setText ("" + comp);


                Toast.makeText (getApplicationContext (), "", Toast.LENGTH_LONG).show ();
            }
        });

        btn3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                String val = textR.getText ().toString ();
                comp = Integer.parseInt (val) + 100;
                textR.setText ("" + comp);


                Toast.makeText (getApplicationContext (), "", Toast.LENGTH_LONG).show ();
            }
        });
        btn1.setOnLongClickListener (new View.OnLongClickListener () {
            @Override
            public boolean onLongClick(View view) {
                view.showContextMenu ();
                return false;
            }
        });

        btn2.setOnLongClickListener (new View.OnLongClickListener () {
            @Override
            public boolean onLongClick(View view) {
                view.showContextMenu ();
                return false;
            }
        });

        btn3.setOnLongClickListener (new View.OnLongClickListener () {
            @Override
            public boolean onLongClick(View view) {
                view.showContextMenu ();
                return false;
            }
        });

        btn1.setOnCreateContextMenuListener (this);
        btn2.setOnCreateContextMenuListener (this);
        btn3.setOnCreateContextMenuListener (this);}

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu (menu, v, menuInfo);
        menu.add (0, 1, 0, "Reset");
        menu.add (0, 2, 0, "Quitter");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId ()) {
            case 1:
                textR.setText (0);
                textR.setTextColor (Color.BLUE);
                break;
            case 2:
                finish ();


        }
        return super.onContextItemSelected (item);

    }


}

