package com.developers.developersbubbackend.model

import java.util.*
import javax.persistence.*


@Entity
@Table(name = "recruiters")
class Recruiter : Person() {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    var companyWorkFor: Company? = null

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "recruiter", fetch = FetchType.EAGER)
    var companiesRecruitingFor: MutableSet<Company> = TreeSet()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id")
    var developersContacted: Developer? = null

}
