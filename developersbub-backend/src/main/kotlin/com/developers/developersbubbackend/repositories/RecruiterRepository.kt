package com.developers.developersbubbackend.repositories

import com.developers.developersbubbackend.model.Recruiter
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.Repository
import org.springframework.transaction.annotation.Transactional

@org.springframework.stereotype.Repository
interface RecruiterRepository : Repository<Recruiter, Long> {

    @Query("SELECT DISTINCT recruiter FROM Recruiter recruiter left join fetch recruiter.companies" +
            " WHERE recruiter.lastName LIKE :lastName%")
    @Transactional(readOnly = true)
    fun findByLastName(lastName: String): Collection<Recruiter>
}
