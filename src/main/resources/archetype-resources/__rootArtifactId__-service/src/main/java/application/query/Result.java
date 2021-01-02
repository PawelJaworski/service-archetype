package ${groupId}.application.query;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Result<T> {
    private final T value;

    public T getValue() {
        return value;
    }
}
