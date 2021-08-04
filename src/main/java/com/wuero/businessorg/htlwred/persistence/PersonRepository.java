package com.wuero.businessorg.htlwred.persistence;

import com.wuero.businessorg.htlwred.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
