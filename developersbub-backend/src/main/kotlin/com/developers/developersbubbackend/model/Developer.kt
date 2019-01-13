package com.developers.developersbubbackend.model

import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "developers")
class Developer : Person() {

    val address: ArrayList<Address> = arrayListOf()
    val typeOfDeveloper = ""
    val programmingLanguages = ""
    val isEmployed: Boolean = false
}
