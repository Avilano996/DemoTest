package com.example.demo.repository

import com.example.demo.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
@Transactional(Transactional.TxType.MANDATORY)
interface UserRepository : JpaRepository<User, Long>