package com.jdriven.ng2boot.repository;

import com.jdriven.ng2boot.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

    Page<User> findAll(Pageable pageable);
}
