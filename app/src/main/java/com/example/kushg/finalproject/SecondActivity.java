package com.example.kushg.finalproject;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class SecondActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    DatabaseReference timeRef = database.getReference();
    String[] foodItem = new String[10];
    String text;
    String t;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        Button button2 = (Button) findViewById(R.id.button2);
        final EditText item = (EditText) findViewById(R.id.editText);
        final EditText time = (EditText) findViewById(R.id.editText2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(SecondActivity.this, FridgeView.class);
                startActivity(startIntent);
            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write a message to the database
                text = item.getText().toString();
                t = time.getText().toString();

                if (foodItem[0].equals("No Item")) {
                    myRef.child("food1").setValue(text);
                } else if (foodItem[2].equals("No Item")) {
                    myRef.child("food2").setValue(text);
                } else if (foodItem[4].equals("No Item")) {
                    myRef.child("food3").setValue(text);
                } else if (foodItem[6].equals("No Item")) {
                    myRef.child("food4").setValue(text);
                } else if (foodItem[8].equals("No Item")) {
                    myRef.child("food5").setValue(text);
                }
                if (foodItem[1].equals("No Date")) {
                    myRef.child("time1").setValue(t);
                } else if (foodItem[3].equals("No Date")) {
                    myRef.child("time1").setValue(t);
                } else if (foodItem[5].equals("No Date")) {
                    myRef.child("time3").setValue(t);
                } else if (foodItem[7].equals("No Date")) {
                    myRef.child("time4").setValue(t);
                } else if (foodItem[9].equals("No Date")) {
                    myRef.child("time5").setValue(t);
                }

            }
        });
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {
                    // TODO: handle the post
                    foodItem[i] = postSnapshot.getValue().toString();
                    i++;
                }
                i = 0;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });

    }


}
