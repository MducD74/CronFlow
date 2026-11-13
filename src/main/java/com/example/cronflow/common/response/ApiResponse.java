package com.example.cronflow.common.response;

import org.springframework.http.ResponseEntity;

public record ApiResponse<T>(int code, String message, T data) {
  public static <T> ApiResponse<T> success(T data) {
    return new ApiResponse<>(1000, "Success", data);
  }

  public static <T> ApiResponse<T> error(String message) {
    return new ApiResponse<>(999, message, null);
  }

  public static <T> ApiResponse<T> errorListMessage(int code, String message, T data) {
    return new ApiResponse<>(code, message, data);
  }
}
