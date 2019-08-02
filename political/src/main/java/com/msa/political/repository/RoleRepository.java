package com.msa.political.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.msa.political.model.Role;
import com.msa.political.model.RoleName;

@Repository
public interface RoleRepository {
	
	Optional<Role> findName(RoleName roleName);

}
