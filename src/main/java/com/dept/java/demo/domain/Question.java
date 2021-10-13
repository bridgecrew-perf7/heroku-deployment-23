package com.dept.java.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class Question {

    private UUID id;
    private String text;
    private List<Option> options = new ArrayList<>();
    @JsonIgnore
    private Poll poll;

}