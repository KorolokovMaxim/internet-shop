package com.maximkorolokov.internetshop.DTO;

import com.maximkorolokov.internetshop.entity.user.User;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;


@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDTO {
    private Long id;
    String createdBy;
    String updatedBy;
    String deletedBy;
    LocalDateTime createWhen;
    LocalDateTime updateWhen;
    LocalDateTime deletedWhen;
    String username;
    String email;

    public UserDTO(User entity) {
        if (entity != null) {
            this.id = entity.getId();
            this.createdBy = entity.getCreatedBy();
            this.createWhen = entity.getCreateWhen();
            this.updatedBy = entity.getUpdatedBy();
            this.updateWhen = entity.getUpdateWhen();
            this.deletedBy = entity.getDeletedBy();
            this.deletedWhen = entity.getDeletedWhen();
            this.username = entity.getUsername();
            this.email = entity.getEmail();
        }
    }

    public Long getId() {
        return id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public LocalDateTime getCreateWhen() {
        return createWhen;
    }

    public LocalDateTime getUpdateWhen() {
        return updateWhen;
    }

    public LocalDateTime getDeletedWhen() {
        return deletedWhen;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
