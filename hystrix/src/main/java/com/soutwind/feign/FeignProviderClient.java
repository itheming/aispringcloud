package com.soutwind.feign;

import com.soutwind.entity.Student;
import com.soutwind.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)  //fallback 是降级处理 如果访问该接口出问题就访问FeignError的内容
public interface FeignProviderClient {
    @GetMapping("student/findAll")
     Collection<Student> findAll();
}
