package wsclientlibtest.model;

/**
 * fwef
 * @author ejoseph
 */
public class MessageRequest {
    
    private int code;
    private String message;

    public MessageRequest() {
    }
    
    public MessageRequest(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageResponse{" + "code=" + code + ", message=" + message + '}';
    }
    
}
