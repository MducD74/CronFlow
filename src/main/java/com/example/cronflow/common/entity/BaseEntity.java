package com.example.cronflow.common.entity;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public abstract class BaseEntity {
  @Column(name = "created_by")
  protected String createBy;
  @Column(name = "created_at")
  protected LocalDateTime createdAt;
  @Column(name = "updated_by")
  protected String updatedBy;
  @Column(name = "updated_at")
  protected LocalDateTime updatedAt;
}
