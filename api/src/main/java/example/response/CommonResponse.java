package example.response;

import org.springframework.http.HttpStatus;

public class CommonResponse<T> {
    private int code;
    private String message;
    private T data;

    public static <T> CommonResponse<T> of(int code, String message, T data) {
        return new CommonResponse<>(code, message, data);
    }

    public static <T> CommonResponse<T> of(int code, T data) {
        return new CommonResponse<>(code, "success", data);
    }

    public static <T> CommonResponse<T> of(T data) {
        return new CommonResponse<>(HttpStatus.OK.value() ,null, data);
    }

    public CommonResponse() {
    }

    public CommonResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
