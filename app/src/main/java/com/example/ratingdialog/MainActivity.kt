package com.example.ratingdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.ratingdialog.RatingDialog;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        var newFRag = RatingDialog(RatingModel("Kindly rate your experience with our Sales ",
//            "Kindly rate your experience with our Sales ",
//            "Kindly rate your experience with our Sales ",
//            "Kindly rate your experience with our Sales ",
//            false,
//            3)
//        )

        Rating
        var fm: FragmentManager = supportFragmentManager
        newFRag.show(fm, "")


    }
}