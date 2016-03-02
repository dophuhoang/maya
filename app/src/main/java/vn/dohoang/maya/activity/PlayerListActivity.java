package vn.dohoang.maya.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import vn.dohoang.maya.R;

public class PlayerListActivity extends AppCompatActivity {
    private Context mContext;
    private ImageButton mButtonRule;
    private ImageButton mButtonGuide;
    private ImageButton mButtonPlayerList;
    private ImageButton mButtonMenu;
    private Button mButtonOk;

    public PlayerListActivity() {
        mContext = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);

        mButtonRule = (ImageButton) findViewById(R.id.btn_rule);
        mButtonGuide = (ImageButton) findViewById(R.id.btn_guide);
        mButtonPlayerList = (ImageButton) findViewById(R.id.btn_player_list);
        mButtonMenu = (ImageButton) findViewById(R.id.btn_menu);

        mButtonOk = (Button) findViewById(R.id.btn_ok);

        mButtonMenu.setOnClickListener(onClickMenuListener());
        mButtonOk.setOnClickListener(onClickOkListener());

        mButtonRule.setEnabled(false);
        mButtonGuide.setEnabled(false);
        mButtonPlayerList.setEnabled(false);
        mButtonMenu.setActivated(true);
    }

    private View.OnClickListener onClickMenuListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        };
    }

    private View.OnClickListener onClickOkListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(mContext, PlayerListActivity.class);
//                startActivity(intent);
            }
        };
    }
}
