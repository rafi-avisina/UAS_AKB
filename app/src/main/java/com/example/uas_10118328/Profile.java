package com.example.uas_10118328;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
/*      TANGGAL PENGERJAAN : JUMAT, 6 AGUSTUS 2021
        NIM : 10118328
        NAMA : MUHAMMAD RAFI AVISINA
        KELAS : IF-8*/

public class Profile extends Fragment {
    public Profile() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_profile, container, false);
    }
}