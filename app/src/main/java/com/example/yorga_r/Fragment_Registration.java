package com.example.yorga_r;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Fragment_Registration extends Fragment {
    private EditText serial_nmb, passport_nmb, dateOfIssue, dateOfExpiry, name, surname,
            dateOfBirth, durationOfTrip, nmb_of_entries, residencePermits,
            countryOfDestination, dateOfSubmission, dateOfTravel, placeOfWork, addressWork,
            previousTrips, invitation, phone, numberOfVoucher, visaApplication;

    private String st_serial_nmb, st_passport_nmb, st_dateOfIssue, st_dateOfExpiry, st_name, st_surname,
            st_dateOfBirth, st_gender, st_maritalStatus, st_durationOfTrip, st_nmb_of_entries, st_residencePermits,
            st_countryOfDestination, st_dateOfSubmission, st_dateOfTravel, st_placeOfWork, st_addressWork,
            st_previousTrips, st_invitation, st_phone, st_numberOfVoucher, st_visaApplication;

    private Spinner sp_gender, sp_maritalStatus;

    private ArrayList<String> genderArray, maritalArray;

    private DatabaseReference mDataBase;
    private String APPLICATIONS = "Applications";
    private Button send_data_button;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View registration_fragment = inflater.inflate(R.layout.fragment_registration, container, false);
        init(registration_fragment);

        genderArray.addAll(Arrays.asList(getResources().getStringArray(R.array.genderArray)));
        spinner_generate(genderArray, sp_gender);
        sp_gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_gender = (String) parent.getItemAtPosition(position);
                if (st_gender == genderArray.get(0)){
                    st_gender = null;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        maritalArray.addAll(Arrays.asList(getResources().getStringArray(R.array.maritalArray)));
        spinner_generate(maritalArray, sp_maritalStatus);
        sp_maritalStatus.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_maritalStatus = (String) parent.getItemAtPosition(position);
                if (st_maritalStatus == maritalArray.get(0)){
                    st_maritalStatus = null;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        dateOfIssue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month +1;
                        String date = day + "." + month + "." + year;
                        dateOfIssue.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        dateOfExpiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month +1;
                        String date = day + "." + month + "." + year;
                        dateOfExpiry.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        dateOfBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month +1;
                        String date = day + "." + month + "." + year;
                        dateOfBirth.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        durationOfTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month +1;
                        String date = day + "." + month + "." + year;
                        durationOfTrip.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        dateOfSubmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month +1;
                        String date = day + "." + month + "." + year;
                        dateOfSubmission.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        dateOfTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month +1;
                        String date = day + "." + month + "." + year;
                        dateOfTravel.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        send_data_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st_serial_nmb = serial_nmb.getText().toString();
                st_passport_nmb = passport_nmb.getText().toString();
                st_dateOfIssue = dateOfIssue.getText().toString();
                st_dateOfExpiry = dateOfExpiry.getText().toString();
                st_name = name.getText().toString();
                st_surname = surname.getText().toString();
                st_dateOfBirth = dateOfBirth.getText().toString();
                st_durationOfTrip = durationOfTrip.getText().toString();
                st_nmb_of_entries = nmb_of_entries.getText().toString();
                st_residencePermits = residencePermits.getText().toString();
                st_countryOfDestination = countryOfDestination.getText().toString();
                st_dateOfSubmission = dateOfSubmission.getText().toString();
                st_dateOfTravel = dateOfTravel.getText().toString();
                st_placeOfWork = placeOfWork.getText().toString();
                st_addressWork = addressWork.getText().toString();
                st_previousTrips = previousTrips.getText().toString();
                st_invitation = invitation.getText().toString();
                st_phone = phone.getText().toString();
                st_numberOfVoucher = numberOfVoucher.getText().toString();
                st_visaApplication = visaApplication.getText().toString();
                Registration registration = new Registration(st_serial_nmb, st_passport_nmb, st_dateOfIssue,
                        st_dateOfExpiry, st_name, st_surname, st_dateOfBirth, st_gender, st_maritalStatus,
                        st_durationOfTrip, st_nmb_of_entries, st_residencePermits, st_countryOfDestination,
                        st_dateOfSubmission, st_dateOfTravel, st_placeOfWork, st_addressWork, st_previousTrips,
                        st_invitation, st_phone, st_numberOfVoucher, st_visaApplication);
                checkEditText(registration, st_serial_nmb, st_passport_nmb, st_dateOfIssue, st_dateOfExpiry, st_name, st_surname,
                        st_dateOfBirth, st_gender, st_maritalStatus, st_durationOfTrip, st_nmb_of_entries, st_residencePermits,
                        st_countryOfDestination, st_dateOfSubmission, st_dateOfTravel, st_placeOfWork, st_addressWork,
                        st_previousTrips, st_invitation, st_phone, st_numberOfVoucher, st_visaApplication);
            }
        });

        return registration_fragment;
    }

    public void init (View v){
        serial_nmb = v.findViewById(R.id.serial_nmb);
        passport_nmb = v.findViewById(R.id.passport_nmb);
        dateOfIssue = v.findViewById(R.id.dateOfIssue);
        dateOfIssue.setFocusable(false);
        dateOfExpiry = v.findViewById(R.id.dateOfExpiry);
        dateOfExpiry.setFocusable(false);
        name = v.findViewById(R.id.name);
        surname = v.findViewById(R.id.surname);
        dateOfBirth = v.findViewById(R.id.dateOfBirth);
        dateOfBirth.setFocusable(false);
        durationOfTrip = v.findViewById(R.id.durationOfTrip);
        durationOfTrip.setFocusable(false);
        nmb_of_entries = v.findViewById(R.id.nmb_of_entries);
        residencePermits = v.findViewById(R.id.residencePermits);
        countryOfDestination = v.findViewById(R.id.countryOfDestination);
        dateOfSubmission = v.findViewById(R.id.dateOfSubmission);
        dateOfSubmission.setFocusable(false);
        dateOfTravel = v.findViewById(R.id.dateOfTravel);
        dateOfTravel.setFocusable(false);
        placeOfWork = v.findViewById(R.id.placeOfWork);
        addressWork = v.findViewById(R.id.addressWork);
        previousTrips = v.findViewById(R.id.previousTrips);
        invitation = v.findViewById(R.id.invitation);
        phone = v.findViewById(R.id.phone);
        numberOfVoucher = v.findViewById(R.id.numberOfVoucher);
        visaApplication = v.findViewById(R.id.visaApplication);
        send_data_button = v.findViewById(R.id.send_data);
        sp_gender = v.findViewById(R.id.gender_spinner);
        sp_maritalStatus = v.findViewById(R.id.maritalStatus);
        genderArray = new ArrayList<>();
        maritalArray = new ArrayList<>();
        mDataBase = FirebaseDatabase.getInstance().getReference(APPLICATIONS);
    }

    public void checkEditText(Registration registration, String str1, String str2, String str3, String str4,
                              String str5, String str6, String str7, String str8, String str9, String str10,
                              String str11, String str12, String str13, String str14, String str15, String str16,
                              String str17, String str18, String str19, String str20, String str21, String str22){
        if (TextUtils.isEmpty(str1) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)
                || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7) || TextUtils.isEmpty(str8)
                || TextUtils.isEmpty(str9) || TextUtils.isEmpty(str10) || TextUtils.isEmpty(str11) || TextUtils.isEmpty(str12)
                || TextUtils.isEmpty(str13) || TextUtils.isEmpty(str14) || TextUtils.isEmpty(str15) || TextUtils.isEmpty(str16)
                || TextUtils.isEmpty(str17) || TextUtils.isEmpty(str18) || TextUtils.isEmpty(str19) || TextUtils.isEmpty(str20)
                || TextUtils.isEmpty(str21) || TextUtils.isEmpty(str22)){
            Toast.makeText(getContext().getApplicationContext(), "Заполните все поля!", Toast.LENGTH_SHORT).show();
        }
        else {
            mDataBase.push().setValue(registration);
            Toast.makeText(getContext().getApplicationContext(), "User saved", Toast.LENGTH_SHORT).show();
            ((MainActivity) getActivity()).changeFragment(0);
        }
    }

    public void spinner_generate(ArrayList spinnerArray,  Spinner spinner){

        final List<String> sp_array = new ArrayList<>(spinnerArray);

        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this.getActivity(),R.layout.spinner_item,sp_array){
            @Override
            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_item);
        spinner.setAdapter(spinnerArrayAdapter);
    }
}