package com.developers.developersbubbackend.model

import javax.persistence.MappedSuperclass

@MappedSuperclass
open class Person : BaseEntity() {

    val firstName = ""
    val lastName = ""
    val age = 0
    val email = ""
    val phoneNumber = ""
    val jobTitle = ""
}
