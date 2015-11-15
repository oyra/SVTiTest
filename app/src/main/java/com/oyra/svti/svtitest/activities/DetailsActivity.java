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

    private TextView mDesc;
    private TextView mEmail;
    private TextView mEditor;
    private ImageView mImg;

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
        mDesc = (TextView) findViewById(R.id.desc);
        mEditor = (TextView) findViewById(R.id.editor);
        mEmail = (TextView) findViewById(R.id.email);
        mImg = (ImageView) findViewById(R.id.img);
        setTitle(p.getName());
        mDesc.setText(p.getDescription());
        mEditor.setText(p.getResponsibleeditor());
        mEmail.setText(p.getEmail());
        Picasso.with(mImg.getContext()).load(p.getProgramimage())
                .placeholder(R.drawable.noimage)
                .error(R.drawable.noimage)
                .into(mImg);

    }

}
