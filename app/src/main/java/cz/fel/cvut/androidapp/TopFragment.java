package cz.fel.cvut.androidapp;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Datart on 26. 2. 2018.
 */

public class TopFragment extends Fragment{

    private EditText topText;

    private EditText bottomText;

    private Button button;

    private TopSectionListener topSectionListener;

    public interface TopSectionListener{

        public void createPicture(String top, String bottom);
    };

    //is called when the fragment is added somewhere
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            topSectionListener = (TopSectionListener) activity;
        }
        catch (ClassCastException ex) {

            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.top_fragment, container, false);

        topText = (EditText) view.findViewById(R.id.fragmentEditText);

        bottomText = (EditText) view.findViewById(R.id.fragmentEditText2);

        button = (Button) view.findViewById(R.id.fragmentButton);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

    public void buttonClicked(View v) {

        topSectionListener.createPicture(topText.getText().toString(), bottomText.getText().toString());
    }
}
