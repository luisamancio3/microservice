package com.lsi.Agua.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lsi.Agua.entity.Botijao;

@RepositoryRestResource(collectionResourceRel = "Botijao", path = "botijao")
public interface BotijaoRepository extends PagingAndSortingRepository<Botijao, Long>{

}
