# IMAD5112_Assignment1
# IMAD5112_Assignment1
This part of the code is called the main activity.x. this is where we type all the codes that are needed to make the application function and run just before you have to debut it. this is what i used to generate all the celebrities how have passed away.Th is is called the history app. this part includes the age number, the generate button, the cancel button and the edit number line used to type in numbers.
package com.example.myassignment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaration The Values

            val ageNumber = findViewById<TextView>(R.id.AgeNumber)
            val btnGenerate = findViewById<Button>(R.id.btnGenerate)
            val btnCancel = findViewById<Button>(R.id.btnCancel)
            val txtResult = findViewById<TextView>(R.id.txtResult)

            btnGenerate.setOnClickListener {


 

                val age = ageNumber.text.toString().toIntOrNull()
                if (age != null){
                    val result = when (age) {
                        in 20..28 -> "Tupac shakur"
                        in 29..36-> "Ricky Rick"
                        in 37..44 -> "Kobe Bryant"
                        in 45.. 52 -> "Michael Jackson"
                        in 53..60 -> "Andre Keith Braugher"
                        in 61..69 ->"xxxTentacion"
                        in 70..78 -> "Aretha Franklin"
                        in 79..86 -> "David Soul"
                        in 87..94 -> "Sir Thomas Sean Connery"
                        in 95..102 -> "Norman Corwin"
                        else -> "other"
                    }
                    txtResult.text = "age: Sage\n${
                        when (txtResult.text) {
                            "Tupac Shakur" -> "Tupac Shakur also known as 2pac and Makaveli was an american rapper. He died in 13 September 1996"
                            "Ricky Rick" -> "Ricky Rick known as Rikhado Makhado, was a South African rapper,singer,song writer. He died 23 February 2022"
                            "Kobe Bryant" -> "Kobe Bryant is an American Professional basketball player. He spent his entire 20 year career with the Los Angeles Lakers in the National Basketball Association. He died 26 January 2020"
                            "Michael Jackson" -> "Michael Jackson was an American singer, nicknamed the king if pop. He is famous for making pop music in the early 2000s. He died 25 June 2009"
                            "Andre Keith Braugher" -> "Andre Keith Braugher was an American actor most commonly known for is role as Detective Frank Pembleton in the drama series Homicide. He died 11 December 2023"
                            "xxxTentacion" -> "xxxTentacion was an american singer, also known as Triple X .he was famous for making musical genre called Trap. he died 29 September 2019."
                            "Aretha Franklin" -> "Aretha Franklin was an American Singer-Song Writer. She died 16 August 2018."
                            "David Soul" -> "David Soul is a British Actor. He died 04 January 2024"
                            "Sir Thomas Sean Connery" -> "Sir Thomas Sean Connery is a Scottish Actor. He died 31 October 2020."
                            "Norman Corwin" -> "Norman Corwin was an american actor who died 20 october 2024"
                            else -> "Other celebrities are not most commonly known"
                        }
                    }"
                }else {
                    txtResult.text = "please enter a valid age."
                }
            }
            btnCancel.setOnClickListener {
                btnCancel()
                txtResult.text = ""
            }

    }

this is the xml version of the android studio where you can edit what components needed on your application when you run it just before you debug it
    ?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/AgeNumber"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="104dp"
        android:text="@string/agenumber"
        android:textSize="24sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/EditTextNumber"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="104dp"
        android:layout_marginEnd="40dp"
        android:autofillHints=""
        android:ems="10"
        android:hint="@string/agenumber"
        android:inputType="number"
        android:minHeight="48dp"
        android:textSize="16sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toEndOf="@+id/AgeNumber"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="LabelFor,DuplicateSpeakableTextCheck" />

    <Button
        android:id="@+id/btnGenerate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="156dp"
        android:text="@string/generate"
        android:textSize="24sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/AgeNumber" />

    <Button
        android:id="@+id/btnCancel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="140dp"
        android:layout_marginEnd="68dp"
        android:text="@string/cancel"
        android:textSize="24sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/EditTextNumber" />

    <TextView
        android:id="@+id/txtResult"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="112dp"
        android:layout_marginTop="116dp"
        android:text="@string/show_result"
        android:textSize="34sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btnGenerate" />
</androidx.constraintlayout.widget.ConstraintLayout>

}

Explanation of how i have done my code
Design User Interface (UI): Use XML layout files to design your historical application's user interface. Think about the elements you wish to incorporate—buttons, lists, picture views, text views, etc. Consider the interface and user experience you desire for youInstall the official integrated development environment (IDE) for creating Android apps, called Android Studio, to get it set up. Follow the installation instructions after downloading it from the official Android Developer page.

Initiate a Novel Project: To begin a new project, launch Android Studio. Pick the minimum SDK version you wish to target, as well as the project and package names.r app.

Develop Functionality: Develop your history application's functionality. This might involve a number of elements:

These are the steps used to Run my Application
what i mostly did in the code was add in all the celebrities who have passed on. To do that I used a function that when you type it will show a specific celebrity who has passed away , and what year they passed away in.
the numbers used was thier ages , so if you type 21 a specific celebrity's name will show up along with their detail tht are given in the code.
The arrays defined in this code will hold the names, ages, and whether or not the ten individuals are students. Then, iterating over each person one at a time using for loops, it prints their details and checks specific conditions (such whether they are students and under 30 or whether their name begins with a vowel) by using if statements.To determine if the person's index is even or odd, I used a switch-case statement and printed the appropriate message. Based on the person's index, each case depicts a distinct condition. You cannot use a variable as a case directly because switch-case statements rely on constant expressions to function. I'm using the index (i) right within the switch statement because of this.
Testing: You may test your app with a variety of tools provided by Android Studio. Using emulators (Android Virtual Device Manager) or by physically connecting Android devices to their development PC, developers can test the functioning of their apps. Testing makes that the programme operates as intended and assists in finding and resolving problems.
Debugging: Strong debugging capabilities in Android Studio assist developers in finding and resolving coding issues. To comprehend the behaviour of their application and identify problems, developers can step through code execution, analyse variables, and set breakpoints.
Construction and Packaging: The application must be constructed and packed for distribution after it has been designed and tested. An APK (Android Package) file that has all the files and resources needed to execute is created by Android Studio.
