package com.example.kushg.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class FridgeView extends Activity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    DatabaseReference food1 = myRef.child("food1");
    DatabaseReference food2 = myRef.child("food2");
    DatabaseReference food3 = myRef.child("food3");
    DatabaseReference food4 = myRef.child("food4");
    DatabaseReference food5 = myRef.child("food5");
    DatabaseReference time1 = myRef.child("time1");
    DatabaseReference time2 = myRef.child("time2");
    DatabaseReference time3 = myRef.child("time3");
    DatabaseReference time4 = myRef.child("time4");
    DatabaseReference time5 = myRef.child("time5");
    String[] foodItem = new String[10];
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridgeview);
        final TextView text1 = (TextView) findViewById(R.id.textView3);
        final TextView text2 = (TextView) findViewById(R.id.textView4);
        final TextView text3 = (TextView) findViewById(R.id.textView5);
        final TextView text4 = (TextView) findViewById(R.id.textView6);
        final TextView text5 = (TextView) findViewById(R.id.textView7);
        final TextView text6 = (TextView) findViewById(R.id.textView11);
        final TextView text7 = (TextView) findViewById(R.id.textView12);
        final TextView text8 = (TextView) findViewById(R.id.textView13);
        final TextView text9 = (TextView) findViewById(R.id.textView14);
        final TextView text10 = (TextView) findViewById(R.id.textView15);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(FridgeView.this, SecondActivity.class);
                startActivity(startIntent);
            }
        });
        food1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text1.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        food2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text2.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        food3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text3.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        food4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text4.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        food5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text5.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        time1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text6.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        time2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text7.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        time3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text8.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        time4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text9.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        time5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                text10  .setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("error", "loadPost:onCancelled", databaseError.toException());
            }
        });
        Button remove1 = (Button) findViewById(R.id.button3);
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.child("food1").setValue("No Item");
                myRef.child("time1").setValue("No Date");
            }
        });
        Button remove2 = (Button) findViewById(R.id.button6);
        remove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.child("food2").setValue("No Item");
                myRef.child("time2").setValue("No Date");
            }
        });
        Button remove3 = (Button) findViewById(R.id.button4);
        remove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.child("food3").setValue("No Item");
                myRef.child("time3").setValue("No Date");
            }
        });
        Button remove4 = (Button) findViewById(R.id.button7);
        remove4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.child("food4").setValue("No Item");
                myRef.child("time4").setValue("No Date");
            }
        });
        Button remove5 = (Button) findViewById(R.id.button8);
        remove5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.child("food5").setValue("No Item");
                myRef.child("time5").setValue("No Date");
            }
        });
    }

}
