package vn.dohoang.maya.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vn.dohoang.maya.R;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Button mButtonPlay;

    public MainActivity() {
        mContext = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonPlay = (Button) findViewById(R.id.btn_play);
        mButtonPlay.setOnClickListener(onClickPlayListener());
    }

    private View.OnClickListener onClickPlayListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RuleActivity.class);
                startActivity(intent);
            }
        };
    }
}
