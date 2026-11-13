package com.example.cronflow.common.controller;

import com.example.cronflow.common.response.ApiResponse;

public abstract class BaseController {
  protected <T> ApiResponse<T> successResponse(T data) {
    return ApiResponse.success(data);
  }

  protected <T> ApiResponse<T> errorResponse(String message) {
    return ApiResponse.error(message);
  }
}
