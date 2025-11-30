package com.firstProject.studentService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "InternalStudentService",
        url = "${externalApi.studentService.url}"
)
public interface InternalStudentService {
    @GetMapping("/student/{id}")
    InternalStudent getInternalStudentById(@PathVariable Long id);
}
