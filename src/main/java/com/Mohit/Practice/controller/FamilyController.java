package com.Mohit.Practice.controller;

import com.Mohit.Practice.entity.FamilyEntity;
import com.Mohit.Practice.payload.FamilyDto;
import com.Mohit.Practice.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FamilyController {
    private FamilyService familyService;
    @Autowired
    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }
    @PostMapping("/family")
    public ResponseEntity<FamilyEntity> addMember(@RequestBody FamilyEntity familyEntity){
        FamilyEntity memberAdded = familyService.addMember(familyEntity);
        return new ResponseEntity<>(memberAdded, HttpStatus.CREATED);
    }
    @GetMapping("/family")
    public ResponseEntity<List<FamilyEntity>> findAllMember(){
        List<FamilyEntity> allMember = familyService.findAllMember();
        return new ResponseEntity<>(allMember, HttpStatus.OK);
    }
    @GetMapping("/family/{id}")
    public FamilyEntity findMemberById(@PathVariable int id){
        FamilyEntity byId = familyService.findById(id);
        return byId;
    }
    @PutMapping("/family")
    public FamilyEntity updateMemberById(@RequestBody FamilyEntity familyEntity){
        FamilyEntity updateMember = familyService.updateMemberById(familyEntity);
        return updateMember;
    }
    @DeleteMapping("/family/{id}")
    public String deleteById(@PathVariable int id){
        familyService.deleteById(id);
        return "Member deleted successfully: "+ id;
    }

}
