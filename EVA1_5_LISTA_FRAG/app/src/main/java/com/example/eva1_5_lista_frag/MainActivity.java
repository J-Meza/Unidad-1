package com.example.eva1_5_lista_frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ClipData;
import android.os.Bundle;

import com.example.eva1_5_lista_frag.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {

    ItemFragment ifFragmentoLista;
    FragmentManager fmmanager;
    FragmentTransaction fmTrans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fmmanager = getSupportFragmentManager();
        ifFragmentoLista = new ItemFragment();
        fmTrans = fmmanager.beginTransaction();
        fmTrans.setCustomAnimations(R.anim.exit_to_right, R.anim.enter_from_right,R.anim.exit_to_right, R.anim.enter_from_right);
        fmTrans.addToBackStack(null);
        fmTrans.replace(R.id.frmLt , ifFragmentoLista);
        fmTrans.commit();

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {


    }
}
