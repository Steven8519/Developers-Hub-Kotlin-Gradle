package com.developers.developersbubbackend.model

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table


@Entity
@Table(name = "recruiters")
class Recruiter : Person() {

    val companyWorkFor = ""
    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "recruiter")
    val companies: MutableSet<Company> = HashSet()
}
