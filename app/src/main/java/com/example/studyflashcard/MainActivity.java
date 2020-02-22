package com.example.studyflashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setBackgroundColor(getResources().getColor(R.color.colorBlue));
            }
        });
        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.colorPink));
            }
        });
        findViewById(R.id.answer_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_1).setBackgroundColor(getResources().getColor(R.color.colorGreen));
            }
        });
        findViewById(R.id.answer_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_2).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
        });
        findViewById(R.id.answer_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_3).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
        });
        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_1).setVisibility(View.INVISIBLE);
                findViewById(R.id.answer_2).setVisibility(View.INVISIBLE);
                findViewById(R.id.answer_3).setVisibility(View.INVISIBLE);
                findViewById(R.id.toggle_choices_visibility).setVisibility(View.INVISIBLE);
                findViewById(R.id.isShowing).setVisibility(View.VISIBLE);

            }
        });
        findViewById(R.id.isShowing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_1).setVisibility(View.VISIBLE);
                findViewById(R.id.answer_2).setVisibility(View.VISIBLE);
                findViewById(R.id.answer_3).setVisibility(View.VISIBLE);
                findViewById(R.id.toggle_choices_visibility).setVisibility(View.VISIBLE);
                findViewById(R.id.isShowing).setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.mainView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color back to original
                ((TextView) findViewById(R.id.flashcard_question)).setBackground(getDrawable(R.drawable.card_background));
                ((TextView) findViewById(R.id.answer_3)).setBackground(getDrawable(R.drawable.answer2_color));
                ((TextView) findViewById(R.id.answer_2)).setBackground(getDrawable(R.drawable.answer2_color));
                ((TextView) findViewById(R.id.answer_1)).setBackground(getDrawable(R.drawable.answer2_color));

            }
        });
    }
}