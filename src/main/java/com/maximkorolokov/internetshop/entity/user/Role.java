package com.maximkorolokov.internetshop.entity.user;

import com.maximkorolokov.internetshop.entity.AuditEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role" , schema = "shop")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "role_id")),
        @AttributeOverride(name = "createdBy", column = @Column(name = "role_created_by")),
        @AttributeOverride(name = "createWhen", column = @Column(name = "role_created_when")),
        @AttributeOverride(name = "updatedBy", column = @Column(name = "role_updated_by")),
        @AttributeOverride(name = "updateWhen", column = @Column(name = "role_updated_when")),
        @AttributeOverride(name = "deletedBy", column = @Column(name = "role_deleted_by")),
        @AttributeOverride(name = "deletedWhen", column = @Column(name = "role_deleted_at"))
})
@SequenceGenerator(name = "SEQ_ID", sequenceName = "role_role_id_seq")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Role extends AuditEntity {
    @Column(name = "role_name" , nullable = false)
    String roleName;

}
