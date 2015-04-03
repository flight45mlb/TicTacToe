package com.matthewburtondesign.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onClickT1(View v){
        Button t1;
        t1 = (Button) findViewById(R.id.t1);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= t1.getText().toString();

        /// Start of Strings to Check for Win///
        Button t2;
        t2 = (Button) findViewById(R.id.t2);
        String BT2Text= t2.getText().toString();

        Button t3;
        t3 = (Button) findViewById(R.id.t3);
        String BT3Text= t2.getText().toString();

        Button m1;
        m1 = (Button) findViewById(R.id.m1);
        String BM1Text= m1.getText().toString();

        Button m2;
        m2 = (Button) findViewById(R.id.m2);
        String BM2Text= m2.getText().toString();

        Button m3;
        m3 = (Button) findViewById(R.id.m3);
        String BM3Text= m3.getText().toString();

        Button b1;
        b1 = (Button) findViewById(R.id.b1);
        String BB1Text= b1.getText().toString();

        Button b2;
        b2 = (Button) findViewById(R.id.b2);
        String BB2Text= b2.getText().toString();

        Button b3;
        b3 = (Button) findViewById(R.id.b3);
        String BB3Text= b3.getText().toString();

        /// End of Strings to Check for Win///

        if (buttonText.equals("X"));

        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            {t1.setText("X");
        if (BT2Text.equals("X")&& BT3Text.equals("X"))
            Toast.makeText(getApplicationContext(), "X Wins!.",
                    Toast.LENGTH_LONG).show();
            }
        }
        else {Move.setText("x");
            t1.setText("O");
      }


        //MoveCount2.setText(+1);
    }

    public void onClickT2(View v){
        Button t2;
        t2 = (Button) findViewById(R.id.t2);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= t2.getText().toString();

        if (buttonText.equals("X"));

        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            t2.setText("X");}
        else {Move.setText("x");
            t2.setText("O");}


        //MoveCount2.setText(+1);
    }


    public void onClickT3(View v){
        Button t3;
        t3 = (Button) findViewById(R.id.t3);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= t3.getText().toString();

        if (buttonText.equals("X"));

        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            t3.setText("X");}
        else {Move.setText("x");
            t3.setText("O");}


        //MoveCount2.setText(+1);
    }
    public void onClickM1(View v){
        Button m1;
        m1 = (Button) findViewById(R.id.m1);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= m1.getText().toString();

        if (buttonText.equals("X"));

        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            m1.setText("X");}
        else {Move.setText("x");
            m1.setText("O");}


        //MoveCount2.setText(+1);
    }


    public void onClickM2(View v){
        Button m2;
        m2 = (Button) findViewById(R.id.m2);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= m2.getText().toString();

        if (buttonText.equals("X"));

        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            m2.setText("X");}
        else {Move.setText("x");
            m2.setText("O");}


        //MoveCount2.setText(+1);
    }

    public void onClickM3(View v){
        Button m3;
        m3 = (Button) findViewById(R.id.m3);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= m3.getText().toString();

        if (buttonText.equals("X"));
        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            m3.setText("X");}
        else {Move.setText("x");
            m3.setText("O");}


        //MoveCount2.setText(+1);
    }
    public void onClickB1(View v){
        Button b1;
        b1 = (Button) findViewById(R.id.b1);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= b1.getText().toString();

        if (buttonText.equals("X"));

        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            b1.setText("X");}
        else {Move.setText("x");
            b1.setText("O");}


        //MoveCount2.setText(+1);
    }


    public void onClickB2(View v){
        Button b2;
        b2 = (Button) findViewById(R.id.b2);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= b2.getText().toString();

        if (buttonText.equals("X"));

        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            b2.setText("X");}
        else {Move.setText("x");
            b2.setText("O");}


        //MoveCount2.setText(+1);
    }

    public void onClickB3(View v){
        Button b3;
        b3 = (Button) findViewById(R.id.b3);
        final TextView Move = (TextView) findViewById(R.id.Move);
        String moveWas= Move.getText().toString();
        String buttonText= b3.getText().toString();

        if (buttonText.equals("X"));

        else if (buttonText.equals("O"));
        else if (moveWas.equals("x")){Move.setText("o");
            b3.setText("X");}
        else {Move.setText("x");
            b3.setText("O");}


        //MoveCount2.setText(+1);
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
