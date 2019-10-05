package com.example.eva1_4_frag_din;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fmManager;
    FragmentTransaction fmTrans;
    RedFragment rfRojp;
    BlueFragment bfAzul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fmManager = getSupportFragmentManager();


    }
    public void azul(View v){

        fmTrans = fmManager.beginTransaction();
        bfAzul = new BlueFragment();
        //fmTrans.replace(R.id.frmFrag,bfAzul);
        //fmTrans.commit();
        fmTrans.setCustomAnimations(R.anim.exit_to_right, R.anim.enter_from_right,R.anim.exit_to_right, R.anim.enter_from_right);
        fmTrans.addToBackStack(null);
        fmTrans.add(R.id.frmFrag,bfAzul,"BLANK_FRAGMMENT");
        fmTrans.commit();
    }
    public void rojo(View v){

        fmTrans = fmManager.beginTransaction();
        rfRojp = new RedFragment();
        //fmTrans.replace(R.id.frmFrag,rfRojp);
        //fmTrans.commit();
        fmTrans.setCustomAnimations(R.anim.exit_to_right, R.anim.enter_from_right,R.anim.exit_to_right, R.anim.enter_from_right);
        fmTrans.addToBackStack(null);
        fmTrans.add(R.id.frmFrag,rfRojp,"BLANK_FRAGMMENT");
        fmTrans.commit();
    }
}
