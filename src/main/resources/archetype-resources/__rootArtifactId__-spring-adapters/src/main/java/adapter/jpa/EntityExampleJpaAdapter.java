package ${groupId}.adapter.jpa;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ${groupId}.domain.EntityExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "entity_poc")
@NoArgsConstructor
@AllArgsConstructor
public class EntityExampleJpaAdapter implements Serializable {

    @Id
    @Column
    private String value;

    public static EntityExampleJpaAdapter fromEntity(EntityExample EntityExample) {
        return new EntityExampleJpaAdapter(EntityExample.getValue());
    }

    EntityExample toEntity() {
        return new EntityExample(value);
    }
}
