package com.developers.developersbubbackend.model

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class Address : BaseEntity() {
        var address1: String = ""
        var address2: String = ""
        var city: String = ""
        var state: String = ""
        var zipCode: String = ""

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "developer_id")
        val developerAddress: Developer? = null

        @OneToOne
        val companyAdress: Company? = null


}
