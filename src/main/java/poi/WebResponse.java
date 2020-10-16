package poi;


/**
 * Created by sunmeihui on 2016/9/27.
 */
public class WebResponse<T> {

    private boolean success = true;

    private int err_code = 0;

    private String err_msg = "OK";

    private T data;

    /**
     * 默认成功
     */
    public WebResponse() {
    }

    /**
     * 成功
     */
    public WebResponse(T data) {
        this.data = data;
    }

    /**
     * 自定义
     */
    public WebResponse(int err_code, String err_msg, boolean success) {
        this.err_code = err_code;
        this.err_msg = err_msg;
        this.success = success;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getErr_code() {
        return err_code;
    }

    public void setErr_code(int err_code) {
        this.err_code = err_code;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WebResponse{" +
                "success=" + success +
                ", err_code=" + err_code +
                ", err_msg='" + err_msg + '\'' +
                ", data=" + data +
                '}';
    }
}