package com.example.msademoauthapi.api.test.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestResponse {
    private String aaa;
    private String bbb;
}
