package com.github.cheesecat47.myBlog.user.model.response;

import com.github.cheesecat47.myBlog.user.model.AuthTokenDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class LoginResponseDto {
    @Schema(description = "응답 코드. API 명세서 참고")
    String code;

    @Schema(description = "응답 메시지")
    String message;

    @Schema(description = "토큰 정보 객체")
    AuthTokenDto data;
}
