package cz.fel.cvut.androidapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Datart on 26. 2. 2018.
 */

public class BottomFragment extends Fragment {

    private TextView topText;

    private TextView bottomText;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_fragment, container, false);

        topText = (TextView) view.findViewById(R.id.richTextView);

        bottomText = (TextView) view.findViewById(R.id.pianaTextView);

        return view;
    }

    public void setPictureText(String topString, String bottomString) {

        //set text to textViews

        topText.setText(topString);

        bottomText.setText(bottomString);

    }
}
