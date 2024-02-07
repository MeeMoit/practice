package com.Mohit.Practice.repository;

import com.Mohit.Practice.entity.FamilyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<FamilyEntity,Integer> {

}
