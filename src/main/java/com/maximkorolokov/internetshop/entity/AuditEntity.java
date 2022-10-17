package com.maximkorolokov.internetshop.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
@Getter
@Setter
public class AuditEntity extends BaseModel {
    @Column(name = "createdBy")
    String createdBy;
    @Column(name = "updatedBy")
    String updatedBy;
    @Column(name = "deletedBy")
    String deletedBy;
    @Column(name = "createdWhen")
    LocalDateTime createWhen;
    @Column(name = "updatedWhen")
    LocalDateTime updateWhen;
    @Column(name = "deletedWhen")
    LocalDateTime deletedWhen;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public LocalDateTime getCreateWhen() {
        return createWhen;
    }

    public void setCreateWhen(LocalDateTime createWhen) {
        this.createWhen = createWhen;
    }

    public LocalDateTime getUpdateWhen() {
        return updateWhen;
    }

    public void setUpdateWhen(LocalDateTime updateWhen) {
        this.updateWhen = updateWhen;
    }

    public LocalDateTime getDeletedWhen() {
        return deletedWhen;
    }

    public void setDeletedWhen(LocalDateTime deletedWhen) {
        this.deletedWhen = deletedWhen;
    }


}
