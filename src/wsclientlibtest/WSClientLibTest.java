package wsclientlibtest;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.ericsonj.wsclient.exception.WSClientJSONException;
import wsclientlibtest.model.MessageRequest;
import wsclientlibtest.model.MessageResponse;
import wsclientlibtest.wscliwnt.CustomWSClient;

/**
 *
 * @author ejoseph
 */
public class WSClientLibTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CustomWSClient client = new CustomWSClient();

        MessageResponse obj;
        
        try {
            obj = client.getObjectByGET("http://localhost:8084/WebServiceTest/webresources/myservice/getObjectByGet");
            System.out.println(obj);

            obj = client.getObjectByPOST("http://localhost:8084/WebServiceTest/webresources/myservice/getObjectByPost");
            System.out.println(obj);

            List<MessageResponse> list = client.getListByGET("http://localhost:8084/WebServiceTest/webresources/myservice/getListByGet");
            for (MessageResponse messageResponse : list) {
                System.out.println(messageResponse);
            }

            list = client.getListByPOST("http://localhost:8084/WebServiceTest/webresources/myservice/getListByPost");
            for (MessageResponse messageResponse : list) {
                System.out.println(messageResponse);
            }

            obj = client.getObjectByQuery("http://localhost:8084/WebServiceTest/webresources/myservice/getObjectByQuery", new MessageRequest(200, "HOLA"));
            System.out.println(obj);

            LinkedList<MessageRequest> slist = new LinkedList<>();
            slist.add(new MessageRequest(200, "Hola1"));
            slist.add(new MessageRequest(200, "Hola2"));
            slist.add(new MessageRequest(200, "Hola3"));
            slist.add(new MessageRequest(200, "Hola4"));

            obj = client.sendList("http://localhost:8084/WebServiceTest/webresources/myservice/sendList", slist);
            System.out.println(obj);

        } catch (WSClientJSONException ex) {
            Logger.getLogger(WSClientLibTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
