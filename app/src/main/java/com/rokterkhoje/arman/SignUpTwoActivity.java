package com.rokterkhoje.arman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SignUpTwoActivity extends AppCompatActivity {
    //global variables declaration
    String selectedDivision, selectedDistrict, selectedUpazila;
    EditText registerNumber, registerVillage;
    Spinner divisionspinner, districtspinner, upazilaspinner;
    Button buttonNext;
    private ArrayAdapter<CharSequence> divisionAdapter, districtAdapter, upazilaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_two);
        //hiding action bar
        getSupportActionBar().hide();


//initialization all variables
        initialization();

//initializing division spinner
        divisionspinner = findViewById(R.id.divisionspinner);
        divisionAdapter = ArrayAdapter.createFromResource(this,
                R.array.array_division, R.layout.spinner_layout);

        // Specify the layout to use when the list of choices appear
        divisionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        divisionspinner.setAdapter(divisionAdapter);

//When any item of the divisionspinner uis selected
        divisionspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Define City Spinner but we will populate the options through the selected division
                districtspinner = findViewById(R.id.districtspinner);
                //getting seleted value and convert to string
                selectedDivision = divisionspinner.getSelectedItem().toString();

                int parentID = adapterView.getId();

                if (parentID == R.id.divisionspinner) {
                    switch (selectedDivision) {

                        case "Select Your Division":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_default_districts, R.layout.spinner_layout);
                            break;
                        case "Barisal":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_district_barisal, R.layout.spinner_layout);
                            break;
                        case "Chittagong":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_district_chittagong, R.layout.spinner_layout);
                            break;
                        case "Dhaka":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_district_dhaka, R.layout.spinner_layout);
                            break;
                        case "Mymensingh":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_district_mymensingh, R.layout.spinner_layout);
                            break;
                        case "Khulna":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_district_khulna, R.layout.spinner_layout);
                            break;

                        case "Rajshahi":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_district_rajshahi, R.layout.spinner_layout);
                            break;

                        case "Rangpur":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_district_rangpur, R.layout.spinner_layout);
                            break;
                        case "Sylhet":
                            districtAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                    R.array.array_district_sylhet, R.layout.spinner_layout);
                            break;
                        default:
                            break;
                    }
                    districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    districtspinner.setAdapter(districtAdapter);

                    //To obtain the selected District from the spinner

                    districtspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                            upazilaspinner = findViewById(R.id.upazilaspinner);
                            //get the value and convert it to string
                            selectedDistrict = districtspinner.getSelectedItem().toString();

                            int parentID = adapterView.getId();
                            if (parentID == R.id.districtspinner) {
                                switch (selectedDistrict) {
                                    case "Select Your District":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_default_upazilas, R.layout.spinner_layout);
                                        break;
                                    case "Barguna":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_barguna, R.layout.spinner_layout);
                                        break;
                                    case "Barisal":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_barisal, R.layout.spinner_layout);
                                        break;
                                    case "Bhola":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_bhola, R.layout.spinner_layout);
                                        break;
                                    case "Jhalokati":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_jhalokhati, R.layout.spinner_layout);
                                        break;
                                    case "Patuakhali":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_patuakhali, R.layout.spinner_layout);
                                        break;
                                    case "Pirojpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_pirojpur, R.layout.spinner_layout);
                                        break;
                                    case "Bandarban":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_bandarban, R.layout.spinner_layout);
                                        break;
                                    case "Brahmanbaria":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_brahmanbaria, R.layout.spinner_layout);
                                        break;
                                    case "Chandpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_chandpur, R.layout.spinner_layout);
                                        break;
                                    case "Chittagong":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_chittagong, R.layout.spinner_layout);
                                        break;
                                    case "Comilla":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_comilla, R.layout.spinner_layout);
                                        break;
                                    case "Cox Bazar":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_coxsbazar, R.layout.spinner_layout);
                                        break;
                                    case "Feni":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_feni, R.layout.spinner_layout);
                                        break;
                                    case "Khagrachhari":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_feni, R.layout.spinner_layout);
                                        break;
                                    case "Lakshmipur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_lakshmipur, R.layout.spinner_layout);
                                        break;
                                    case "Noakhali":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_noakhali, R.layout.spinner_layout);
                                        break;
                                    case "Rangamati":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_rangamati, R.layout.spinner_layout);
                                        break;
                                    case "Dhaka":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_rangamati, R.layout.spinner_layout);
                                        break;
                                    case "Faridpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_faridpur, R.layout.spinner_layout);
                                        break;
                                    case "Gazipur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_gazipur, R.layout.spinner_layout);
                                        break;
                                    case "Gopalganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_gopalganj, R.layout.spinner_layout);
                                        break;
                                    case "Kishoreganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_kishoreganj, R.layout.spinner_layout);
                                        break;
                                    case "Madaripur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_madaripur, R.layout.spinner_layout);
                                        break;
                                    case "Manikganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_manikganj, R.layout.spinner_layout);
                                        break;
                                    case "Munshiganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_munshiganj, R.layout.spinner_layout);
                                        break;
                                    case "Narayanganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_narayanganj, R.layout.spinner_layout);
                                        break;
                                    case "Narsingdi":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_narsingdi, R.layout.spinner_layout);
                                        break;
                                    case "Rajbari":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_rajbari, R.layout.spinner_layout);
                                        break;
                                    case "Shariatpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_shariatpur, R.layout.spinner_layout);
                                        break;
                                    case "Tangail":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_tangail, R.layout.spinner_layout);
                                        break;
                                    case "Bagerhat":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_bagherhat, R.layout.spinner_layout);
                                        break;
                                    case "Chuadanga":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_chuadanga, R.layout.spinner_layout);
                                        break;
                                    case "Jessore":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_jessore, R.layout.spinner_layout);
                                        break;
                                    case "Jhenaidah":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_jhenaidah, R.layout.spinner_layout);
                                        break;
                                    case "Khulna":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_khulna, R.layout.spinner_layout);
                                        break;
                                    case "Kushtia":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_kustia, R.layout.spinner_layout);
                                        break;
                                    case "Magura":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_magura, R.layout.spinner_layout);
                                        break;
                                    case "Meherpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_meherpur, R.layout.spinner_layout);
                                        break;
                                    case "Narail":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_narail, R.layout.spinner_layout);
                                        break;
                                    case "Satkhira":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_satkhira, R.layout.spinner_layout);
                                        break;
                                    case "Jamalpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_jamalpur, R.layout.spinner_layout);
                                        break;
                                    case "Mymensingh":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_mymensingh, R.layout.spinner_layout);
                                        break;
                                    case "Netrakona":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_netrakona, R.layout.spinner_layout);
                                        break;
                                    case "Sherpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_sherpur, R.layout.spinner_layout);
                                        break;
                                    case "Bogra":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_bogra, R.layout.spinner_layout);
                                        break;
                                    case "Chapainawabganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_chapainawabganj, R.layout.spinner_layout);
                                        break;
                                    case "Joypurhat":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_joypurhat, R.layout.spinner_layout);
                                        break;
                                    case "Naogaon":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_naogaon, R.layout.spinner_layout);
                                        break;
                                    case "Natore":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_natore, R.layout.spinner_layout);
                                        break;
                                    case "Pabna":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_pabna, R.layout.spinner_layout);
                                        break;
                                    case "Rajshahi":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_rajshahi, R.layout.spinner_layout);
                                        break;
                                    case "Sirajganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_sirajganj, R.layout.spinner_layout);
                                        break;
                                    case "Dinajpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_dinajpur, R.layout.spinner_layout);
                                        break;
                                    case "Gaibandha":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_gaibandha, R.layout.spinner_layout);
                                        break;
                                    case "Kurigram":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_kurigram, R.layout.spinner_layout);
                                        break;
                                    case "Lalmonirhat":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_lalmonirhat, R.layout.spinner_layout);
                                        break;
                                    case "Nilphamari":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_nilphamari, R.layout.spinner_layout);
                                        break;
                                    case "Panchagarh":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_panchagarh, R.layout.spinner_layout);
                                        break;
                                    case "Rangpur":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_rangpur, R.layout.spinner_layout);
                                        break;
                                    case "Thakurgaon":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_thakurgaon, R.layout.spinner_layout);
                                        break;
                                    case "Habiganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_habiganj, R.layout.spinner_layout);
                                        break;
                                    case "Moulvibazar":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_moulvibazar, R.layout.spinner_layout);
                                        break;
                                    case "Sunamganj":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_sunamganj, R.layout.spinner_layout);
                                        break;
                                    case "Sylhet":
                                        upazilaAdapter = ArrayAdapter.createFromResource(adapterView.getContext(),
                                                R.array.array_upazila_sylhet, R.layout.spinner_layout);
                                        break;

                                    default:
                                        break;
                                }
                                upazilaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);     // Specify the layout to use when the list of choices appears
                                upazilaspinner.setAdapter(upazilaAdapter);

                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



   buttonNext.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent=new Intent(SignUpTwoActivity.this,SignUpThreeActivity.class);
           startActivity(intent);
       }
   });
    }

    private void initialization() {

        registerNumber = findViewById(R.id.regnumber);
        registerVillage = findViewById(R.id.regvillage);
        buttonNext = findViewById(R.id.btn_next_name);
    }
}