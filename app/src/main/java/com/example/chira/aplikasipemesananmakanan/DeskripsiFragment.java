package com.example.chira.aplikasipemesananmakanan;

/**
 * Created by chira on 23/10/16.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;


public class DeskripsiFragment extends Fragment {


    public DeskripsiFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        return inflater.inflate(R.layout.fragment_deskripsi_toko, container, false);

    }
}



