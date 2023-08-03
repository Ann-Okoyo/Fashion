package com.example.recyclerviewspractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewspractice.databinding.ActivityMainBinding

//////////

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayStudents()
    }

    override fun onResume() {
        super.onResume()
        displayStudents()
    }

    private fun displayStudents() {
        val student1 = StudentData("Ann Muyale", 21, 5.89, "Commercial")
        val student2 = StudentData("Sera Mburu", 19, 5.50, "Runway Modelling")
        val student3 = StudentData("Mercy Mwazi", 21, 5.80, "Pageant")
        val student4 = StudentData("Ashley Mwangi", 21, 5.80, "Pageant")
        val student5 = StudentData("Sylvia", 21, 5.80, "Commercial")
        val student6 = StudentData("Ann Muyale", 21, 5.89, "Commercial")
        val student7 = StudentData("Sera Mburu", 19, 5.50, "Runway Modelling")
        val student8 = StudentData("Mercy Mwazi", 21, 5.80, "Pageant")
        val student9 = StudentData("Ashley Mwangi", 21, 5.80, "Pageant")
        val student10 = StudentData("Sylvia", 21, 5.80, "Commercial")
        val student11 = StudentData("Ann Muyale", 21, 5.89, "Commercial")
        val student12 = StudentData("Sera Mburu", 19, 5.50, "Runway Modelling")
        val student13 = StudentData("Mercy Mwazi", 21, 5.80, "Pageant")
        val student14 = StudentData("Ashley Mwangi", 21, 5.80, "Pageant")
        val student15 = StudentData("Sylvia", 21, 5.80, "Commercial")
        val student16 = StudentData("Ann Muyale", 21, 5.89, "Commercial")
        val student17 = StudentData("Sera Mburu", 19, 5.50, "Runway Modelling")
        val student18 = StudentData("Mercy Mwazi", 21, 5.80, "Pageant")
        val student19 = StudentData("Ashley Mwangi", 21, 5.80, "Pageant")
        val student20 = StudentData("Sylvia", 21, 5.80, "Commercial")

        val studentList = listOf(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10,
            student11, student12, student13, student14, student15, student16, student17, student18, student19, student20,)

        binding.rvList.layoutManager =LinearLayoutManager(this,)
        binding.rvList.adapter = StudentrvAdapter(studentList)
    }
}