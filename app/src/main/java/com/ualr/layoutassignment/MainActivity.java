package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.ualr.layoutassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money

    // TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mBinding.getRoot();
        setContentView(view);

        this.mBinding.CalculateTotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*call "calculateTotal"*/
                calculateTotal();
            }
        });
    }

    private String calculateTotal(){
       float subTotal = 0;
       String total = "The 'calculateTotal' method is under construction.";

       /* If invoice checkbox 1 is checked, then get text from invoice textinput 1. Convert it to float. Store value in subTotal. Repeat for checkboxes 2-4. */
       /* Once all values are added to subTotal, convert subTotal from float to a string and store in variable called "total".*/

       return total;
    }
}