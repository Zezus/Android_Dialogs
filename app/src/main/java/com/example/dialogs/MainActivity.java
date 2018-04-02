package com.example.dialogs;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button showDialogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showDialogBtn = findViewById(R.id.ma_show_dialog_btn);

//        showDialogBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        showDialogBtn.setOnClickListener(view -> {
            AlertDialog alertDialog = new AlertDialog.Builder(this)

                    //Так создается обычное всплывающее окно

                    //Заголовок
//                    .setTitle("Zezus Team")
                    //Текст
//                    .setMessage("Hello world this is message")
                    //Кнопка ок
//                    .setPositiveButton("OK", (dialogView, i) ->
//                        Toast.makeText(getApplicationContext(), "Нажата кнопка ОК", Toast.LENGTH_SHORT).show())
                    //Кнопка выход
//                    .setNegativeButton("Cancel", (dialogView, i) ->
//                        Toast.makeText(getApplicationContext(), "Нажата кнопка Cancel", Toast.LENGTH_SHORT).show())

                    .setView(R.layout.dialog_test)
                    .create();

            alertDialog.show();

        });

    }
}
