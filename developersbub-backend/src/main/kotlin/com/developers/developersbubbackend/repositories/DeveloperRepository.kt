package com.developers.developersbubbackend.repositories

import com.developers.developersbubbackend.model.Developer
import org.springframework.data.repository.CrudRepository

@org.springframework.stereotype.Repository
interface DeveloperRepository : CrudRepository<Developer, Long> {

}
