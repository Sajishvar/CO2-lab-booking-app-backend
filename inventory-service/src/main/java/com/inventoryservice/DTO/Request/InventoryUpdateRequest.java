package com.inventoryservice.DTO.Request;

import com.inventoryservice.Enums.STATUS;
import com.inventoryservice.Validations.ValidStatus;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/*
*  DTO is used when an existing inventory user is being updated.
*/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryUpdateRequest {
    @NotEmpty(message = "Invalid Name: Name cannot be empty")
    private String name;
    @NotEmpty(message = "Invalid Serial Number: Serial Number cannot be empty")
    @Size(max = 50, message = "Serial Number can be at most 50 characters")
    private String serialNum;
    @Size(max = 100, message = "Manufacturer can be at most 100 characters")
    private String manufacturer;
    @Size(max = 50, message = "Model can be at most 50 characters")
    private String model;
    @Size(max = 50, message = "Processor can be at most 50 characters")
    private String processor;
    @Size(max = 20, message = "Memory Type can be at most 20 characters")
    private String memoryType;
    @Size(max = 20, message = "Memory Size can be at most 20 characters")
    private String memorySize;
    @Size(max = 20, message = "Storage Type can be at most 20 characters")
    private String storageType;
    @Size(max = 20, message = "Storage Size can be at most 20 characters")
    private String storageSize;
    @Size(max = 50, message = "Operating System can be at most 50 characters")
    private String operatingSystem;
    @NotNull(message = "Invalid status: Status cannot be null")
    @ValidStatus(message = "Invalid status: Status must be one of ACTIVE, INACTIVE, or ARCHIVED")
    private String status;
    @PastOrPresent(message = "Invalid Purchase Date: Purchase Date cannot be in the future")
    private LocalDate purchaseDate;
    @DecimalMin(value = "0.0", inclusive = false, message = "Invalid Purchase Cost: Purchase Cost must be greater than 0")
    private Float purchaseCost;
    @FutureOrPresent(message = "Invalid Warranty Expiry Date: Warranty Expiry Date cannot be in the past")
    private LocalDate warrantyExpiry;
    @Size(max = 100, message = "Short Note can be at most 100 characters")
    private String shortNote;
    @PastOrPresent(message = "Invalid Last Maintenance Date: Last Maintenance Date cannot be in the future")
    private LocalDate lastMaintenanceDate;
    @Future(message = "Invalid Next Maintenance Date: Next Maintenance Date must be in the future")
    private LocalDate nextMaintenanceDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @NotNull(message = "Invalid CreatedBy: CreatedBy cannot be null")
    private Long createdBy;
    private List<Integer> installedSoftwares;
}
