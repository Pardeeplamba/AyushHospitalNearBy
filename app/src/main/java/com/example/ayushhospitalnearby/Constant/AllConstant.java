package com.example.ayushhospitalnearby.Constant;

import com.example.ayushhospitalnearby.PlaceModel;
import com.example.ayushhospitalnearby.R;

import java.util.ArrayList;
import java.util.Arrays;

public interface AllConstant {

    int STORAGE_REQUEST_CODE = 1000;
    int LOCATION_REQUEST_CODE = 2000;
    String IMAGE_PATH = "/Profile/image_profile.jpg";


    ArrayList<PlaceModel> placesName = new ArrayList<>(
            Arrays.asList(
                    new PlaceModel(1, R.drawable.ic_hospital, "Ayush Hospitals", "ayush_hospital"),

                    new PlaceModel(2, R.drawable.ic_pharmacy, "Pharmacies", "pharmacy"),
                    new PlaceModel(3, R.drawable.ic_hospital, "Hospitals & Clinics", "hospital")


            )
    );
}
