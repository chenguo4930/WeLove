package com.example.cheng.welove.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cheng.welove.R;
import com.example.cheng.welove.service.entity.Book;
import com.example.cheng.welove.service.presenter.BookPresenter;
import com.example.cheng.welove.service.view.BookView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Button button;
    private BookPresenter mBookPresenter = new BookPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBookPresenter.getSearchBooks("金瓶梅", null, 0, 1);
            }
        });
        mBookPresenter.onCreate();
        mBookPresenter.attachView(mBookView);
    }

    private BookView mBookView = new BookView() {
        @Override
        public void onSuccess(Book mBook) {
            text.setText(mBook.getBooks().get(0).getSubtitle());
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBookPresenter.onStop();
    }
}