package com.mongcent.tnaot.repository;

import com.mongcent.tnaot.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

    List<Permission> getPermissionByRoleId(Long id);
}
