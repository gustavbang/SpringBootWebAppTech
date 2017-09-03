package com.faisaljarkass.demo.repositories;

import com.faisaljarkass.demo.domains.MyUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<MyUser, Long> {

}
