package com.example.masoud.iscalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView txt_zero, txt_0ne, txt_two, txt_three, txt_four, txt_five, txt_six, txt_siven, txt_eight, txt_nine, txt_plus, txt_minus, txt_multiplier, txt_devide, txt_delete, txt_equal;

  TextView txt_result, txt_double_zero, txt_clear, txt_ceremony, txt_ce, txt_dot, txt_step, txt_power, txt_remainder;


  int nr1, nr2;

  boolean plus, minus, multi, div;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    txt_result = (TextView) findViewById(R.id.textView26);
    txt_step = (TextView) findViewById(R.id.textView25);


  }

  public void onClick(View view) {
    int getTagNum = Integer.parseInt(view.getTag().toString());

    appendNumerToTextView(getTagNum);
  }

  private void appendNumerToTextView(int getTagNum) {

    String oldValue = txt_result.getText().toString();

    txt_result.setText(oldValue + getTagNum);
  }
}
