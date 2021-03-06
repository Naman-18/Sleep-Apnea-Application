package com.example.project.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.project.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private EditText name,age,gender,pulse,oximeter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView1 = root.findViewById(R.id.textView1);
        dashboardViewModel.getText1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView1.setText(s);
            }
        });
        name=root.findViewById(R.id.Name);
        age=root.findViewById(R.id.Age);
        gender=root.findViewById(R.id.Gender);
        pulse=root.findViewById(R.id.Pulse);
        oximeter=root.findViewById(R.id.Oximeter);




        return root;
    }
}