package com.example.superfit;

import android.app.Dialog;
import android.app.DialogFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentManager;

public class cusDialog extends DialogFragment {
    @NonNull
    public android.app.Dialog onCreatedialog(AlertDialog.Builder savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder.setTitle("Диалоговое окно").setMessage("Для закрытия окна нажмите ОК").create();
    }

}
