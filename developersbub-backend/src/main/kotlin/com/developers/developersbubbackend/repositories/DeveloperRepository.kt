package com.developers.developersbubbackend.repositories

import com.developers.developersbubbackend.model.Developer
import org.springframework.data.repository.Repository

@org.springframework.stereotype.Repository
interface DeveloperRepository : Repository<Developer, Long> {

}
