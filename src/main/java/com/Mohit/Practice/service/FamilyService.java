package com.Mohit.Practice.service;


import com.Mohit.Practice.entity.FamilyEntity;
import com.Mohit.Practice.payload.FamilyDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface FamilyService {
    public FamilyEntity addMember(FamilyEntity familyEntity);
    public List<FamilyEntity> findAllMember();
    public FamilyEntity findById(int id);

    public FamilyEntity updateMemberById(FamilyEntity familyEntity);

    public void deleteById(int id);
}
