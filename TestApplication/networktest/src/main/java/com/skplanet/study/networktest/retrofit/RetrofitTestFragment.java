package com.skplanet.study.networktest.retrofit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.skplanet.study.commonui.GridFragment;
import com.skplanet.study.commonui.common.IName;
import com.skplanet.study.networktest.R;

/**
 * Created by 1002216 on 2017. 8. 14..
 */

public class RetrofitTestFragment extends Fragment implements View.OnClickListener {

    private Button startBtn;
    private Button stopBtn;
    private Button clearBtn;
    private TextView logText;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static RetrofitTestFragment newInstance() {
        RetrofitTestFragment fragment = new RetrofitTestFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.network_test_layout, container, false);
        startBtn = rootView.findViewById(R.id.start_btn);
        startBtn.setOnClickListener(this);

        stopBtn = rootView.findViewById(R.id.stop_btn);
        stopBtn.setOnClickListener(this);

        clearBtn = rootView.findViewById(R.id.clear_btn);
        clearBtn.setOnClickListener(this);

        logText = rootView.findViewById(R.id.log_text);


        return rootView;
    }

    public static String getName() {
        return "Retrofit Test";
    }

    @Override
    public void onClick(View view) {

        if (view == startBtn) {
        }
        else if (view == stopBtn) {


        }
        else if (view == clearBtn) {

        }
    }
}
