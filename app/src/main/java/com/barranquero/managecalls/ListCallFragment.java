package com.barranquero.managecalls;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.barranquero.managecalls.adapter.CallAdapter;

/**
 * Created by usuario on 10/02/17
 * ManageCalls
 */
public class ListCallFragment extends Fragment {
    CallAdapter mAdapter;
    ListView lstCalls;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new CallAdapter(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_list_call, container, false);

        lstCalls = (ListView)rootView.findViewById(R.id.lstCalls);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lstCalls.setAdapter(mAdapter);
    }
}