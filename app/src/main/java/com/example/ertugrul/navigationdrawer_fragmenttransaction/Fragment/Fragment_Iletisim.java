package com.example.ertugrul.navigationdrawer_fragmenttransaction.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ertugrul.navigationdrawer_fragmenttransaction.R;

public class Fragment_Iletisim extends Fragment {
    TextView tviletisim;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /*
        onCreateView,activity sınıfındaki onCreate metodu ile ayni işlevi gormektedir.

        Fragment'in Layout'a bağlanma olayı,nesne tanımlamaları ve olayları bu metot içerisinde gerckelesir.
         */


        View v=inflater.inflate( R.layout.fragment_iletisim,null );
        tviletisim=v.findViewById( R.id.tviletisim );
        /*
        fragment_layout attıgımız nesneleri burada tanımlarız.
         */

        return  v;
    }
}
