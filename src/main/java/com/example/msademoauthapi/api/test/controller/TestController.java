package com.example.msademoauthapi.api.test.controller;

import com.example.msademoauthapi.api.test.dto.request.TestRequest;
import com.example.msademoauthapi.api.test.dto.response.TestResponse;
import com.example.msademoauthapi.base.dto.ApiResult;
import com.example.msademoauthapi.base.enums.ErrorCode;
import com.example.msademoauthapi.core.exception.ApiException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated // Get Method 의 RequestParam 검증 시 사용 ->> @NotBlank(message = "A2001:aaa")@RequestParam(value = "aaa", required = false)String aaa,
@RequiredArgsConstructor
@RestController
public class TestController {

    @GetMapping("/api/v1/test/data")
    public ResponseEntity<ApiResult<TestResponse>> testData(
            @NotBlank(message = "A2001:aaa")
            @RequestParam(value = "aaa", required = false)
            String aaa,
            @NotBlank(message = "A2002:bbb,3")
            @Size(min = 3, message = "A2002:bbb,3")
            @RequestParam(value = "bbb", required = false)
            String bbb
    ) {
        log.info("aaaaaaa");
        System.out.println("aaaaaaa");
        // 에러 응답
        if (StringUtils.hasText(aaa)) {
            throw new ApiException(ErrorCode.NOT_ENOUGH_CHARACTERS_SIZE.getCode(), new String[]{"aaa", "10"});
        }
        return ResponseEntity.ok(new ApiResult<>());
    }
    @GetMapping("/api/v1/test/data2")
    public ResponseEntity<ApiResult<TestResponse>> testData2(@Valid TestRequest req) {
        return ResponseEntity.ok(new ApiResult<>());
    }
}
