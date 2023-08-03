package com.example.recyclerviewspractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewspractice.databinding.StudentdisplayBinding


//class StudentrvAdapter(var studentList:List<StudentData>): RecyclerView.Adapter<StudentrvAdapter.StudentHolder>(){
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder{
//        var binding = StudentdisplayBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//        return  StudentViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
//        holder.bind(studentList[position])
//    }
//
//    override fun getItemCount(): Int {
//        return studentList.size
//    }
//
//}
//  inner class StudentViewHolder(var student: StudentdisplayBinding): RecyclerView.ViewHolder(student.root){
//    fun bind(currentStudentData: StudentData){
//        student.apply {
//            tvname.text =currentStudentData.name
//            tvage.text=currentStudentData.age.toString()
//            tvheight.text=currentStudentData.height.toString()
//            tvmodellingclass.text=currentStudentData.modellingClass
//
//        }
//    }
//
//
//}
//
class StudentrvAdapter(private var studentList: List<StudentData>): RecyclerView.Adapter<StudentrvAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = StudentdisplayBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        the code inflates the "studentdisplay.xml" layout file and creates
//        a binding object that holds references to all the views defined in the layout file.
//        This binding object can be used to manipulate
//        the views programmatically.



        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(studentList[position])
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    inner class StudentViewHolder(private val student: StudentdisplayBinding) : RecyclerView.ViewHolder(student.root) {
        fun bind(currentStudentData: StudentData) {
            student.apply {
                tvname.text = currentStudentData.name
                tvage.text = currentStudentData.age.toString()
                tvheight.text = currentStudentData.height.toString()
                tvmodellingclass.text = currentStudentData.modellingClass
            }
        }
    }
}