package com.oyra.svti.svtitest.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.oyra.svti.svtitest.R;
import com.oyra.svti.svtitest.data.Program;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();
    }

    private void init() {
        Program p = (Program) getIntent().getSerializableExtra("program");
        if (p == null) {
            return;
        }
        TextView desc = (TextView) findViewById(R.id.desc);
        TextView editor = (TextView) findViewById(R.id.editor);
        TextView email = (TextView) findViewById(R.id.email);
        ImageView img = (ImageView) findViewById(R.id.img);
        setTitle(p.getName());
        desc.setText(p.getDescription());
        editor.setText(p.getResponsibleeditor());
        email.setText(p.getEmail());
        Picasso.with(img.getContext()).load(p.getProgramimage())
                .placeholder(R.drawable.noimage)
                .error(R.drawable.noimage)
                .into(img);

    }

}
