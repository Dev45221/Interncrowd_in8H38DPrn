package com.example.yummyfoods.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.example.yummyfoods.databinding.ActivitySignInBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignIn extends AppCompatActivity {

    ActivitySignInBinding binding;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Sign In");

        binding.txtdont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, SignUp.class));
                finish();
            }
        });

        reference = FirebaseDatabase.getInstance().getReference().child("Yummy Foods");
        binding.btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, Dashboard.class));
                String phone = binding.textphone.getText().toString();
                String password = binding.textpassword.getText().toString();

                if (phone.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignIn.this, "Fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    reference.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(phone)) {
                                String dataPass = snapshot.child(phone).child("password").getValue(String.class);

                                if (dataPass.equals(password)) {
                                    Toast.makeText(SignIn.this, "Logged In", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(SignIn.this, Dashboard.class));
                                    finish();
                                } else {
                                    Toast.makeText(SignIn.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                                }
                            }else {
                                Toast.makeText(SignIn.this, "You are not registered.\nFirst register yourself", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignIn.this, SignUp.class));
                                finish();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }
        });
    }
}