package com.dept.java.demo.application.polls;

import com.dept.java.demo.application.UseCase;
import com.dept.java.demo.domain.Poll;

import java.util.List;

public class GetAll implements UseCase<List<Poll>, Void> {

    @Override
    public List<Poll> execute(Void requestModel) {
        return null;
    }

    @Override
    public void validate(Void requestModel) {
        // No validation needed;
    }
}
