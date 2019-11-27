package com.lsi.Agua.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lsi.Agua.entity.Agua;

@RepositoryRestResource(collectionResourceRel = "Agua", path = "agua")
public interface AguaRepository extends PagingAndSortingRepository<Agua, Long>{

}
