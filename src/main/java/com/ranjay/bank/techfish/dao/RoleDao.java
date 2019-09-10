package com.ranjay.bank.techfish.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ranjay.bank.techfish.domain.security.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
