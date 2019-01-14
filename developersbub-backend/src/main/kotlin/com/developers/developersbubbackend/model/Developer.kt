package com.developers.developersbubbackend.model

import java.util.*
import javax.persistence.*
import kotlin.collections.HashSet


@Entity
@Table(name = "developers")
class Developer : Person() {

    val typeOfDeveloper = ""
    val programmingLanguages = ""
    val isEmployed: Boolean = false

    @OneToOne(fetch = FetchType.LAZY)
    val address: Address? = null

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    val companyEmployedTo: Company? = null

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val recruiters: MutableSet<Recruiter> = HashSet()
}
