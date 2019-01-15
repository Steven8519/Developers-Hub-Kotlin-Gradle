package com.developers.developersbubbackend.model

import javax.persistence.*
import kotlin.collections.HashSet


@Entity
@Table(name = "developers")
class Developer : Person() {

    var typeOfDeveloper = ""
    var programmingLanguages = ""
    var isEmployed: Boolean = false

    @OneToOne(fetch = FetchType.LAZY)
    var address: Address? = null

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    var companyEmployedTo: Company? = null

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var recruiters: MutableSet<Recruiter> = HashSet()
}
