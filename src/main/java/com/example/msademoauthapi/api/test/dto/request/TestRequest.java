package com.example.msademoauthapi.api.test.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestRequest {
    @NotBlank(message = "A2001:aaa")
    private String aaa;

    @NotBlank(message = "A2002:bbb,3")
    @Size(min = 3, message = "A2002:bbb,3")
    private String bbb;
}
