package com.inventoryservice.Models;

import com.inventoryservice.Enums.STATUS;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="inventories")
@Data
public class Inventory {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column( nullable = false,length = 20)
    private String name;

    @Column(name = "serial_num",length = 50)
    private String serialNum;

    @Column(length = 100)
    private String manufacturer;

    @Column(length = 50)
    private String model;

    @Column(length = 50)
    private String processor;

    @Column(name = "memory_type",length = 20)
    private String memoryType;

    @Column(name = "memory_size",length = 20)
    private String memorySize;

    @Column(name = "storage_type",length = 20)
    private String storageType;

    @Column(name = "storage_size",length = 20)
    private String storageSize;

    @Column(name = "operating_sys",length = 50)
    private String operatingSystem;

    @Column
    private STATUS status;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "purchase_cost")
    private Float purchaseCost;

    @Column(name = "warranty_expiry")
    private LocalDate warrantyExpiry;

    @Column(name = "short_note",length = 100)
    private String shortNote;

    @Column(name = "last_maintenance_date")
    private LocalDate lastMaintenanceDate;

    @Column(name = "next_maintenance_date")
    private LocalDate nextMaintenanceDate;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "installed_softwares")
    private List<Integer> installedSoftwares;



}