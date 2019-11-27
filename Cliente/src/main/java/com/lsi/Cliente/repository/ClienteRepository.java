package com.lsi.Cliente.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lsi.Cliente.entity.Cliente;

@RepositoryRestResource(collectionResourceRel = "Cliente", path = "cliente")
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long>{

}
