package vn.dohoang.maya.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import vn.dohoang.maya.R;

public class RuleActivity extends AppCompatActivity {

    private Context mContext;
    private ImageButton mButtonRule;
    private ImageButton mButtonGuide;
    private ImageButton mButtonPlayerList;
    private ImageButton mButtonMenu;
    private TextView mTextViewSummary;
    private TextView mTextViewDescription;
    private Button mButtonPlay;

    public RuleActivity() {
        mContext = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);

        mButtonRule = (ImageButton) findViewById(R.id.btn_rule);
        mButtonGuide = (ImageButton) findViewById(R.id.btn_guide);
        mButtonPlayerList = (ImageButton) findViewById(R.id.btn_player_list);
        mButtonMenu = (ImageButton) findViewById(R.id.btn_menu);

        mTextViewSummary = (TextView) findViewById(R.id.tv_summary);
        mTextViewDescription = (TextView) findViewById(R.id.tv_description_02);

        mButtonPlay = (Button) findViewById(R.id.btn_play);

        mButtonMenu.setOnClickListener(onClickMenuListener());
        mButtonPlay.setOnClickListener(onClickPlayListener());

        mButtonRule.setEnabled(false);
        mButtonGuide.setEnabled(false);
        mButtonPlayerList.setEnabled(false);
        mButtonMenu.setActivated(true);

        mTextViewSummary.setMovementMethod(ScrollingMovementMethod.getInstance());
        mTextViewDescription.setMovementMethod(ScrollingMovementMethod.getInstance());
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

    private View.OnClickListener onClickPlayListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, PlayerListActivity.class);
                startActivity(intent);
            }
        };
    }
}
