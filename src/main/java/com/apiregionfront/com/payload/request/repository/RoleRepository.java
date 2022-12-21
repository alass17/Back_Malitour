package com.apiregionfront.com.payload.request.repository;

import java.util.Optional;

import com.apiregionfront.com.models.ERole;
import com.apiregionfront.com.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
