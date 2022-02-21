package com.galeeva.project.dto;

import com.galeeva.project.entity.MachineEntity;
import com.galeeva.project.entity.ServiceEntity;
import com.galeeva.project.entity.UserEntity;
import jakarta.servlet.http.Part;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
public class CreateOrderDto {

    Long id;
    UserEntity userId;
    ServiceEntity serviceId;
    Part file;
    String paperType;
    Integer quantity;
    MachineEntity machineId;
    String status;
    BigDecimal totalPrice;
    LocalDateTime createdAt;
    LocalDateTime deliveryAt;
    String delivery;
}
