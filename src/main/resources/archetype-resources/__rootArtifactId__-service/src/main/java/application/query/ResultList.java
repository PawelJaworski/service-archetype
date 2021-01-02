package ${groupId}.application.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@AllArgsConstructor
@Getter
public class ResultList<T> {
    private final List<T> value;

    public List<T> toList() {
        return value;
    }
}
