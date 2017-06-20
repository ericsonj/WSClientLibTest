package wsclientlibtest.wscliwnt;

import net.ericsonj.wsclient.WSClientJSON;
import wsclientlibtest.model.MessageRequest;
import wsclientlibtest.model.MessageResponse;

/**
 *
 * @author ejoseph
 */
public class CustomRegister extends WSClientJSON<MessageResponse, MessageRequest>{

    @Override
    public Class<MessageResponse> getResponseElementClass() {
        return MessageResponse.class;
    }

    @Override
    public Class<MessageRequest> getRequestElementClass() {
        return MessageRequest.class;
    }
    
}
