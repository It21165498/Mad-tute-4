package com.example.tute3.models

import com.example.tute3.models.validations.ValidationResult

class FormData(
    private val studentID:String,
    private val year:String,
    private val semester:String,
    private val agree:Boolean,
) {
    fun validateStudentId(): ValidationResult{
        return if(studentID.isEmpty()){
            ValidationResult.Empty("Student ID is empty")
        }else if(!studentID.startsWith("IT")){
            ValidationResult.Invalid("Should be starting with IT")
        }else if(studentID.length != 10){
            ValidationResult.Invalid("Student ID should have 10 characters")
        }else{
            ValidationResult.Valid
        }
    }



    fun validateYear(): ValidationResult {
        return if(year.isEmpty()){
            ValidationResult.Empty("Year is empty")
        }else{
            ValidationResult.Valid
        }
    }


    fun validateSemester(): ValidationResult {
        return if(semester.isEmpty()){
            ValidationResult.Empty("Semester is empty")
        }else{
            ValidationResult.Valid
        }
    }


    fun validateAgreement():ValidationResult{
        return if(!agree){
            ValidationResult.Invalid("You must agree for the terms and conditions")
        }else{
            ValidationResult.Valid
        }
    }
}

