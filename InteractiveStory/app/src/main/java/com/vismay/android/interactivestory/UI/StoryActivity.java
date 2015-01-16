package com.vismay.android.interactivestory.UI;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vismay.android.interactivestory.R;
import com.vismay.android.interactivestory.model.Page;
import com.vismay.android.interactivestory.model.Story;


public class StoryActivity extends ActionBarActivity {
    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton1;
    private Button mButton2;
    private Story mStory=new Story();
    private String mName;
    private Page mCurrentPage;
    public static final String TAG = StoryActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        mName = getIntent().getStringExtra("name");
        mImageView=(ImageView)findViewById(R.id.imageView);
        mTextView=(TextView)findViewById(R.id.editText);
        mButton1=(Button)findViewById(R.id.button);
        mButton2=(Button)findViewById(R.id.button2);

        loadPage(0);
    }

        private void loadPage(int choice) {
            mCurrentPage = mStory.getPages(choice);

            Drawable drawable = getResources().getDrawable(R.drawable.page0);
            mImageView.setImageDrawable(drawable);
            String pageText = mCurrentPage.getText();
            pageText=String.format(pageText, mName);
            mTextView.setText(pageText);
            if (mCurrentPage.isFinal()) {
                mButton2.setText("PLAYY AGAIN");
                mButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
            } else {
                mButton1.setText(mCurrentPage.getChoice1().getText());
                mButton2.setText(mCurrentPage.getChoice2().getText());
                mButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mButton1.setVisibility(View.INVISIBLE);
                        int nextPage = mCurrentPage.getChoice1().getNextPage();
                        loadPage(nextPage);

                    }
                });
                mButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int nextPage = mCurrentPage.getChoice1().getNextPage();
                        loadPage(nextPage);
                    }
                });
            }
        }


}
