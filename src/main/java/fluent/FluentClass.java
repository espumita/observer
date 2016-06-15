package fluent;

import java.util.HashMap;
import java.util.Map;

public class FluentClass {
    private String host;
    private String path;
    private String port;
    private Map<String,String> headers = new HashMap<>();
    private Map<String,String> params = new HashMap<>();

    public FluentClass preparePostToHost(String host) {
        this.host = host;
        return this;
    }

    public FluentClass andPath(String path) {
        this.path = path;
        return this;
    }

    public FluentClass toPort(Integer port) {
        this.port = port.toString();
        return this;

    }

    public FluentClass withHeader(String header, String value) {
        headers.put(header,value);
        return this;
    }

    public FluentClass withParam(String key, Object value) {
        params.put(key,value.toString());
        return this;
    }

    public PostRequest getRequest() {
        return new PostRequest(host,path,port,toArray(params),toArray(headers));
    }

    private String[][] toArray(Map<String, String> map) {
        String[][] array = new String[map.size()][2];
        int row = 0;
        for(Map.Entry<String,String> entry : map.entrySet()){
            array[row][0] = entry.getKey();
            array[row][1] = entry.getValue();
            row++;
        }
        return array;
    }
}
