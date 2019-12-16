package com.soutwind.feign.impl;

import com.soutwind.entity.Student;
import com.soutwind.feign.FeignProviderClient;
import org.springframework.stereotype.Component;
import java.util.Collection;


@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }
}
