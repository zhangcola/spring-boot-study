package com.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by cola on 2017/1/23.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
}
