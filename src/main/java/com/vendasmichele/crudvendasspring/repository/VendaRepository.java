package com.vendasmichele.crudvendasspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vendasmichele.crudvendasspring.entity.VendasEntity;

@Repository
public interface VendaRepository extends JpaRepository<VendasEntity,Integer>{
    
}
