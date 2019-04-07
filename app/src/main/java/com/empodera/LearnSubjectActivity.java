package com.empodera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class LearnSubjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_subject);

        TextView txtLinkMarmitex = findViewById(R.id.link_marmitex);
        txtLinkMarmitex.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txtLinkSummer = findViewById(R.id.link_summer);
        txtLinkSummer.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txtLinkRevendaProdutos = findViewById(R.id.link_revenda_produtos);
        txtLinkRevendaProdutos.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
