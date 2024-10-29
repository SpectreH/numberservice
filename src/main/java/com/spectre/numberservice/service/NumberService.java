package com.spectre.numberservice.service;

import com.spectre.numberservice.entity.NumberEntity;
import com.spectre.numberservice.repository.NumberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NumberService {
    private final NumberRepository numberRepository;

    public void saveNumbers(List<Integer> numbers) {
        List<NumberEntity> entities = numbers.stream()
                .map(num -> {
                    NumberEntity entity = new NumberEntity();
                    entity.setValue(num);
                    return entity;
                }).collect(Collectors.toList());
        numberRepository.saveAll(entities);
    }
}