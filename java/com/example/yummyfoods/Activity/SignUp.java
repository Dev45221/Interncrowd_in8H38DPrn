package com.example.yummyfoods.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.yummyfoods.Holder;
import com.example.yummyfoods.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    ActivitySignUpBinding binding;
    Holder holder;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Sign Up");

        binding.txtalready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this,SignIn.class));
                finish();
            }
        });

        reference = FirebaseDatabase.getInstance().getReference().child("Yummy Foods");
        binding.btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.txtname.getText().toString();
                String phone = binding.txtphone.getText().toString();
                String email = binding.txtemail.getText().toString();
                String password = binding.txtpassword.getText().toString();

                holder = new Holder(name, phone, email, password);

                if (name=="" || phone=="" || email=="" || password=="") {
                    Toast.makeText(SignUp.this, "Fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    reference.child(phone).setValue(holder).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(SignUp.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SignUp.this, Dashboard.class));
                            finish();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(SignUp.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }
}