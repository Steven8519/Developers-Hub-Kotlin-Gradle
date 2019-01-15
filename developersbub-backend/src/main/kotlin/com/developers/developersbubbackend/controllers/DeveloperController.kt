package com.developers.developersbubbackend.controllers

import com.developers.developersbubbackend.model.Developer
import com.developers.developersbubbackend.repositories.DeveloperRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/developers")
@CrossOrigin(origins = ["http://localhost:4200"])
class DeveloperController(val devloperRepository: DeveloperRepository) {

    @Autowired
    lateinit var developerRepository: DeveloperRepository

    @GetMapping
    fun findAll() = developerRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = developerRepository.findById(id)

    @PostMapping("/new")
    fun saveDeveloper(@RequestBody developer: Developer): Developer {
        return developerRepository.save(developer)
    }

    @PutMapping("/{id}")
    fun getDeveloperById(@PathVariable("id") id: Long,
                         @RequestBody developer: Developer) : ResponseEntity<Developer> {

        val developerData = developerRepository.findById(id)

        if (developerData.isPresent) {
            var _developer = developerData.get()
            _developer.firstName = developer.firstName
            _developer.lastName = developer.lastName
            _developer.email = developer.email
            _developer.phoneNumber = developer.phoneNumber
            _developer.address = developer.address
            _developer.jobTitle = developer.jobTitle
            _developer.programmingLanguages = developer.programmingLanguages
            _developer.companyEmployedTo = developer.companyEmployedTo
            _developer.recruiters = developer.recruiters
            _developer.isEmployed = developer.isEmployed
            return ResponseEntity(developerRepository.save(_developer), HttpStatus.OK)
        } else {
            return ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @DeleteMapping("/{id}")
    fun deleteDeveloperId(@PathVariable("id") id: Long): ResponseEntity<String> {
        developerRepository.deleteById(id)
        return ResponseEntity(HttpStatus.OK)
    }
}
