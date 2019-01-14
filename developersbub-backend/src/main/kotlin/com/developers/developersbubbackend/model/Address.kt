package com.developers.developersbubbackend.model

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class Address : BaseEntity() {
        val address1: String = ""
        val address2: String = ""
        val city: String = ""
        val state: String = ""
        val zipCode: String = ""

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "developer_id")
        val developerAddress: Developer? = null

        @OneToOne
        val companyAdress: Company? = null


}
