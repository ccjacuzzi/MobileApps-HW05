package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
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
                String formattedDecimal = String.format("%.2f", calculateTotal());
                mBinding.totalDisplayEditText.setHint(formattedDecimal);
            }
        });
    }


    private Double calculateTotal(){
       Double total;

       /* If invoice checkbox 1 is checked, then get text from invoice text input 1. Repeat for checkboxes 2-4. */
       /* Once all values are retrieved, add them together and store in variable called "total".*/

        Double item1 = addIfChecked(this.mBinding.invoiceItem1Checkbox, this.mBinding.invoiceItem1EditText);
        Double item2 = addIfChecked(this.mBinding.invoiceItem2Checkbox, this.mBinding.invoiceItem2EditText);
        Double item3 = addIfChecked(this.mBinding.invoiceItem3Checkbox, this.mBinding.invoiceItem3EditText);
        Double item4 = addIfChecked(this.mBinding.invoiceItem4Checkbox, this.mBinding.invoiceItem4EditText);

        total = item1 + item2 + item3 + item4;

       return total;
    }

    private Double addIfChecked(MaterialCheckBox itemCheckbox, TextInputEditText editText){
        String itemPrice = editText.getText().toString();
        if(itemCheckbox.isChecked()){
            return Double.parseDouble(itemPrice);
        } else{
            /*do nothing*/
            return 0.00;
        }
    }

}