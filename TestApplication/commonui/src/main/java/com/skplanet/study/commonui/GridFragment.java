package com.skplanet.study.commonui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.felipecsl.asymmetricgridview.library.Utils;
import com.felipecsl.asymmetricgridview.library.widget.AsymmetricGridView;
import com.felipecsl.asymmetricgridview.library.widget.AsymmetricGridViewAdapter;
import com.skplanet.study.commonui.AsymmetricGridView.DefaultListAdapter;
import com.skplanet.study.commonui.AsymmetricGridView.DemoAdapter;
import com.skplanet.study.commonui.AsymmetricGridView.DemoItem;
import com.skplanet.study.commonui.AsymmetricGridView.DemoUtils;
import com.skplanet.study.commonui.common.IName;

import java.util.List;

/**
 * Created by 1002216 on 2017. 8. 14..
 */

public class GridFragment extends Fragment implements AdapterView.OnItemClickListener {


    private AsymmetricGridView listView;
    private DemoAdapter adapter;
    private List<DemoItem> items;

    public GridFragment() {
        this(null);
    }

    public GridFragment(List<DemoItem> items) {
        this.items = items;
    }

    public void setItems(List<DemoItem> items) {
        this.items = items;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grid_fragment, container, false);

        listView = (AsymmetricGridView) rootView.findViewById(R.id.listView);


        listView.setRequestedColumnCount(3);
        listView.setRequestedHorizontalSpacing(Utils.dpToPx(getContext(), 3));
        listView.setAdapter(getNewAdapter(items));
        listView.setDebugging(true);
        listView.setOnItemClickListener(this);

        return rootView;
    }

    private AsymmetricGridViewAdapter getNewAdapter(List<DemoItem> items) {

//        adapter = new DefaultListAdapter(getContext());
        final DemoUtils demoUtils = new DemoUtils();

        if (items == null) {
            adapter = new DefaultListAdapter(getContext(), demoUtils.moarItems(50));
        }
        else {
            adapter = new DefaultListAdapter(getContext(), items);
        }

        return new AsymmetricGridViewAdapter(getContext(), listView, adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }


    public static String getName() {
        return "";
    }
}