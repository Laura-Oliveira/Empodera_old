package com.empodera;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterServiceActivity extends AppCompatActivity
{
    View view;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference storage_reference;

    private TextView name, surname, type_service, price_service, price_ticket;
    private CheckBox checkbox_lunch, checkbox_cake, checkbox_hair_style, checkbox_chef, checkbox_pizza;
    private CheckBox checkbox_nails, checkbox_color_hair;

    private Button register_service;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_service);

        view = findViewById(R.id.screen_register_service);
        view.setBackgroundColor(getResources().getColor(R.color.color_background));

        name = findViewById(R.id.txt_name);
        surname = findViewById(R.id.txt_surname);
        type_service = findViewById(R.id.txt_type_service);
        checkbox_lunch = findViewById(R.id.checkbox_lunch);
        checkbox_cake = findViewById(R.id.checkbox_cake);
        checkbox_hair_style = findViewById(R.id.checkbox_hair_style);
        checkbox_chef = findViewById(R.id.checkbox_chef);
        checkbox_pizza = findViewById(R.id.check_box_pizza);
        checkbox_nails = findViewById(R.id.checkbox_nails);
        checkbox_color_hair = findViewById(R.id.checkbox_color_hair);
       price_service = findViewById(R.id.txt_price_service);
        price_ticket = findViewById(R.id.txt_price_ticket);

        register_service = findViewById(R.id.btn_register_service);

        storage_reference = FirebaseDatabase.getInstance().getReference();
    }

    public void registerService(View view)
    {

    }
}
