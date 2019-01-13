package com.developers.developersbubbackend.model

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "companies")
class Company : BaseEntity() {

    val companyName = ""

    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    val recruiter: Recruiter? = null
}
