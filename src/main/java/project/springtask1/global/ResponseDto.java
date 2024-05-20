package project.springtask1.global;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ResponseDto<T> {

    private String msg;
    private T data;

    public static <T> ResponseEntity<ResponseDto<T>> ok(String msg, T data) {
        return ResponseEntity.ok(new ResponseDto<>(msg, data));
    }

    public static <T> ResponseEntity<ResponseDto<T>> of(
        HttpStatus status, String msg, T data
    ) {
        return ResponseEntity.status(status).body(new ResponseDto<>(msg, data));
    }
}
