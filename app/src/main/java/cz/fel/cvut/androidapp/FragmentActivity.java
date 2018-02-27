package cz.fel.cvut.androidapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cz.fel.cvut.androidapp.R;

public class FragmentActivity extends AppCompatActivity implements TopFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    @Override
    public void createPicture(String top, String bottom) {

        BottomFragment bottomFragment = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.bottomFragmentAF);

        System.out.println("----- create picture");

        bottomFragment.setPictureText(top, bottom);
    }
}
