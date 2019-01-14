package com.developers.developersbubbackend.model

import javax.persistence.*

@Entity
@Table(name = "list_of_company_owners")
class CompanyOwner: BaseEntity() {

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val companies: MutableSet<Company> = HashSet()
}
