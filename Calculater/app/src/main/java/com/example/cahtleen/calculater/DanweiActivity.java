package com.example.cahtleen.calculater;

import android.app.Fragment;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.cahtleen.calculater.Kind.KindContent;

public class DanweiActivity extends AppCompatActivity
        implements ItemFragment.OnListFragmentInteractionListener, DetailFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danwei);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(KindContent.KindItem item) {
        Bundle arguments = new Bundle();
        arguments.putString("id",item.id);
        Fragment fragment = new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.details,fragment).commit();
    }
}
