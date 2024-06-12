package com.nocountry.obsequiworld.Domain.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
@NoRepositoryBean
public interface CrudRepository<Entity, IdEntity> extends JpaRepository<Entity, IdEntity> {
}