package com.developers.developersbubbackend.model

import javax.persistence.*
import kotlin.collections.HashSet

@Entity
@Table(name = "companies")
class Company : BaseEntity() {

    var companyName = ""
    var companyFunction = ""
    var yearFounded = ""
    var NumberOfEmployees = ""

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_owner_id")
    var companyOwners: CompanyOwner? = null

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var address: MutableSet<Address> = HashSet()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruiter_id")
    var recruiter: Recruiter? = null

    @OneToOne
    var recruitingCompany: Recruiter? = null

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    var developers: MutableSet<Developer> = HashSet()
}
