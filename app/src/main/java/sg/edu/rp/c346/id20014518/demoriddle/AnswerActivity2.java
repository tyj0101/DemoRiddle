package sg.edu.rp.c346.id20014518.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAnswer2 = findViewById(R.id.textView2);
        Intent i = getIntent();
        String answer = i.getStringExtra("Question");
        tvAnswer2.setText(answer + " answer is: Gone");
    }
}