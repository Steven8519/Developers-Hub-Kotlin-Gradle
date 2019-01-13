package com.developers.developersbubbackend.model

import java.io.Serializable
import javax.persistence.*

@MappedSuperclass
open class BaseEntity : Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null

}
