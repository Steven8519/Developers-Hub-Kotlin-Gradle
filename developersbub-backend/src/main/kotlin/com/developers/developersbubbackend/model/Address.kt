package com.developers.developersbubbackend.model

import javax.persistence.Entity

@Entity
class Address : BaseEntity() {
        val address1: String = ""
        val address2: String = ""
        val city: String = ""
        val state: String = ""
        val  zipCode: String = ""
}
