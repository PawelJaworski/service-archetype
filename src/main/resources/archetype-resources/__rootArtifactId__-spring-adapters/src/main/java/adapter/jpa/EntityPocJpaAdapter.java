package ${groupId}.adapter.jpa;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ${groupId}.domain.EntityPoc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "entity_poc")
@NoArgsConstructor
@AllArgsConstructor
public class EntityPocJpaAdapter implements Serializable {

    @Id
    @Column
    private String value;

    public static EntityPocJpaAdapter fromEntity(EntityPoc entityPoc) {
        return new EntityPocJpaAdapter(entityPoc.getValue());
    }

    EntityPoc toEntity() {
        return new EntityPoc(value);
    }
}
