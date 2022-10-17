package com.maximkorolokov.internetshop.entity.user;

import com.maximkorolokov.internetshop.entity.AuditEntity;
import lombok.AccessLevel;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@Entity
@Table(name = "shop_user", schema = "shop")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "user_id")),
        @AttributeOverride(name = "createdBy", column = @Column(name = "user_created_by")),
        @AttributeOverride(name = "createWhen", column = @Column(name = "user_created_when")),
        @AttributeOverride(name = "updatedBy", column = @Column(name = "user_updated_by")),
        @AttributeOverride(name = "updateWhen", column = @Column(name = "user_updated_when")),
        @AttributeOverride(name = "deletedBy", column = @Column(name = "user_deleted_by")),
        @AttributeOverride(name = "deletedWhen", column = @Column(name = "user_deleted_at"))
})
@SequenceGenerator(name = "SEQ_ID", sequenceName = "shop_user_user_id_seq")
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class User extends AuditEntity {

    @Column(name = "username")
    String username;
    @Column(name = "user_email")
    String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
