package com.vendasmichele.crudvendasspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vendasmichele.crudvendasspring.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity,Integer>{
    
}
