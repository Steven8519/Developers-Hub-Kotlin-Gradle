package com.developers.developersbubbackend.model

import javax.persistence.MappedSuperclass

@MappedSuperclass
open class Person : BaseEntity() {

    var firstName = ""
    var lastName = ""
    var age = ""
    var email = ""
    var phoneNumber = ""
    var jobTitle = ""
}
