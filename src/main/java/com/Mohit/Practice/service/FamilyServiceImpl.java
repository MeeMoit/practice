package com.Mohit.Practice.service;

import com.Mohit.Practice.entity.FamilyEntity;
import com.Mohit.Practice.payload.FamilyDto;
import com.Mohit.Practice.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyServiceImpl implements FamilyService{
    private FamilyRepository familyRepository;
    @Autowired
    public FamilyServiceImpl(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }


    @Override
    public FamilyEntity addMember(FamilyEntity familyEntity) {
        FamilyEntity memberAdded = familyRepository.save(familyEntity);
        return memberAdded;
    }

    @Override
    public List<FamilyEntity> findAllMember() {
        List<FamilyEntity> all = familyRepository.findAll();
        return all;
    }

    @Override
    public FamilyEntity findById(int id) {
        Optional<FamilyEntity> byId = familyRepository.findById(id);
        return byId.get();
    }

    @Override
    public FamilyEntity updateMemberById(FamilyEntity familyEntity) {
        FamilyEntity updateUpdate = familyRepository.save(familyEntity);
        return updateUpdate;
    }

    @Override
    public void deleteById(int id) {
        familyRepository.deleteById(id);
    }

    public FamilyDto mapToDto(FamilyEntity family){
        FamilyDto familyDto = new FamilyDto();
        familyDto.setFirstName(family.getFirstName());
        familyDto.setLastName(family.getLastName());
        familyDto.setRelationship(family.getRelationship());
        familyDto.setEmail(family.getEmail());
        familyDto.setContact(familyDto.getContact());
        return familyDto;
    }
    public FamilyEntity mapToEntity(FamilyDto familyDto){
        FamilyEntity familyEntity = new FamilyEntity();
        familyEntity.setFirstName(familyDto.getFirstName());
        familyEntity.setLastName(familyEntity.getLastName());
        familyEntity.setRelationship(familyEntity.getRelationship());
        familyEntity.setEmail(familyEntity.getEmail());
        familyEntity.setContact(familyEntity.getContact());
        return familyEntity;
    }
}
