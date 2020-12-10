package ${groupId}.app.note;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Immutable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppNote {
  @Id
  @GeneratedValue
  private Long id;

  private String note;
}
