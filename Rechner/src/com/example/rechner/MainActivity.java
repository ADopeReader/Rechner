package com.example.rechner;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void addieren(View Buttonclick) {
		
		
		
		EditText test = (EditText)findViewById(R.id.EditText_Feld1);

		EditText test2 = (EditText) findViewById(R.id.EditText_Feld2);

		TextView Ausgabe = (TextView)findViewById(R.id.Ergebnisanzeige);
		
		
		if ((test.length() == 0) | (test2.length() == 0)) {
			String Fehler = "Bitte gib zwei Zahlen ein!";
			Ausgabe.setText(Fehler);
		}

		else {
		
		Editable zu1=test.getText();
		Editable zu2=test2.getText();
		
		String fi = zu1.toString();
		Integer la = Integer.parseInt(fi);
		
		String fi2 = zu2.toString();
		Integer la2 = Integer.parseInt(fi2);
		
		Integer erg = la+la2;
		
		
		
		String finale = erg.toString();
		Ausgabe.setText(finale );
		}
	}
	
	
	public void subtrahieren(View Buttonclick) {
		
		
		
		EditText test = (EditText)findViewById(R.id.EditText_Feld1);

		EditText test2 = (EditText) findViewById(R.id.EditText_Feld2);

		TextView Ausgabe = (TextView)findViewById(R.id.Ergebnisanzeige);
		
		
		if ((test.length() == 0) | (test2.length() == 0)) {
			String Fehler = "Bitte gib zwei Zahlen ein!";
			Ausgabe.setText(Fehler);
		}

		else {
		
		Editable zu1=test.getText();
		Editable zu2=test2.getText();
		
		String fi = zu1.toString();
		Integer la = Integer.parseInt(fi);
		
		String fi2 = zu2.toString();
		Integer la2 = Integer.parseInt(fi2);
		
		Integer erg = la-la2;
		
		
		
		String finale = erg.toString();
		Ausgabe.setText(finale );
		}
	}
	
	public void multiplizieren (View Buttonclick) {
		
		
		EditText test = (EditText)findViewById(R.id.EditText_Feld1);

		EditText test2 = (EditText) findViewById(R.id.EditText_Feld2);

		TextView Ausgabe = (TextView)findViewById(R.id.Ergebnisanzeige);
		
		
		if ((test.length() == 0) | (test2.length() == 0)) {
			String Fehler = "Bitte gib zwei Zahlen ein!";
			Ausgabe.setText(Fehler);
		}

		else {
		
		Editable zu1=test.getText();
		Editable zu2=test2.getText();
		
		String fi = zu1.toString();
		Integer la = Integer.parseInt(fi);
		
		String fi2 = zu2.toString();
		Integer la2 = Integer.parseInt(fi2);
		
		Integer erg = la*la2;
		
		
		
		String finale = erg.toString();
		Ausgabe.setText(finale );
		}
	}
	
	public void dividieren (View Buttonclick) {
		
		
		
		EditText test = (EditText)findViewById(R.id.EditText_Feld1);

		EditText test2 = (EditText) findViewById(R.id.EditText_Feld2);

		TextView Ausgabe = (TextView)findViewById(R.id.Ergebnisanzeige);
		
		
		if ((test.length() == 0) | (test2.length() == 0)) {
			String Fehler = "Bitte gib zwei Zahlen ein!";
			Ausgabe.setText(Fehler);
		}

		else {
		
		Editable zu1=test.getText();
		Editable zu2=test2.getText();
		
		String fi = zu1.toString();
		Integer la = Integer.parseInt(fi);
		
		String fi2 = zu2.toString();
		Integer la2 = Integer.parseInt(fi2);
		
		Integer erg = la/la2;
		
		
		
		String finale = erg.toString();
		Ausgabe.setText(finale );
		}
	}

}
