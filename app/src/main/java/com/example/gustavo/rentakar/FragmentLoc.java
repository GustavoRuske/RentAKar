package com.example.gustavo.rentakar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gustavo on 14/09/2016.
 */
public class FragmentLoc extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        if(container == null){
            return  null;
        }
        return inflater.inflate(R.layout.fragmentgeraloc, container, false);
    }

}
