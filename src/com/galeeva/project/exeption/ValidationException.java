package com.galeeva.project.exeption;

import com.galeeva.project.validator.Error;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class ValidationException extends RuntimeException {

    @Getter
    private final List<Error> errors;
}
