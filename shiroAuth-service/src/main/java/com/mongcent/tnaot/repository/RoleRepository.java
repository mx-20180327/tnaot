package com.mongcent.tnaot.repository;

import com.mongcent.tnaot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> getRoleByUserId(Long id);
}
