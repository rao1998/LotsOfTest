package domain;

/**
 *  * @description: ApiResult
 *  * @package: com.jd.y.auth.serve.web.model
 *  * @author: raoxing5
 *  * @date: 2020/10/28
 *  
 **/
public class ApiResult<T> {
    private Boolean success;
    private String code;
    private String errorMsg;
    private T resultData;

    public Boolean isSuccess() {
        return this.success;
    }

    public static <T> ApiResult<T> SUCCESS() {
        return new ApiResult(true, "200", "SUCCESS");
    }

    public static <T> ApiResult<T> SUCCESS(T data) {
        return new ApiResult(true, "200", "SUCCESS", data);
    }

    public static <T> ApiResult<T> FAIL(String errorMsg) {
        return new ApiResult(false, "E10000", errorMsg);
    }

    public ApiResult(Boolean success, String code, String errorMsg) {
        this(success, code, errorMsg, null);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getResultData() {
        return resultData;
    }

    public void setResultData(T resultData) {
        this.resultData = resultData;
    }

    public ApiResult() {
    }

    public ApiResult(Boolean success, String code, String errorMsg, T resultData) {
        this.success = success;
        this.code = code;
        this.errorMsg = errorMsg;
        this.resultData = resultData;
    }
}
