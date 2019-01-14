package com.developers.developersbubbackend.model

import java.util.*
import javax.persistence.*


@Entity
@Table(name = "recruiters")
class Recruiter : Person() {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    val companyWorkFor: Company? = null

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "recruiter", fetch = FetchType.EAGER)
    val companiesRecruitingFor: MutableSet<Company> = TreeSet()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id")
    val developersContacted: Developer? = null

}
