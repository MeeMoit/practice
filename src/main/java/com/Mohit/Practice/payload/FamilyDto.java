package com.Mohit.Practice.payload;

import lombok.*;

    @Data
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class FamilyDto {

        private int memberId;

        private String firstName;

        private String lastName;

        private String relationship;

        private String email;

        private long contact;
    }

