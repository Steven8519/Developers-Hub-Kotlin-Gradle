package com.developers.developersbubbackend.model

import javax.persistence.*
import kotlin.collections.HashSet

@Entity
@Table(name = "companies")
class Company : BaseEntity() {

    val companyName = ""
    val companyFunction = ""
    val yearFounded = ""
    val NumberOfEmployees = ""

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_owner_id")
    val companyOwners: CompanyOwner? = null

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val address: MutableSet<Address> = HashSet()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruiter_id")
    val recruiter: Recruiter? = null

    @OneToOne
    val recruitingCompany: Recruiter? = null

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    private val developers: MutableSet<Developer> = HashSet()
}
