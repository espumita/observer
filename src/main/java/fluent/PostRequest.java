package fluent;

import java.util.Arrays;

public class PostRequest {
    private final String host;
    private final String path;
    private final String port;
    private final String[][] params;
    private final String[][] headers;

    public PostRequest(String host, String path, String port, String[][] params, String[][] headers) {
        this.host = host;
        this.path = path;
        this.port = port;
        this.params = params;
        this.headers = headers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostRequest that = (PostRequest) o;

        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (!Arrays.deepEquals(params, that.params)) return false;
        return Arrays.deepEquals(headers, that.headers);

    }

    @Override
    public int hashCode() {
        int result = host != null ? host.hashCode() : 0;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + Arrays.deepHashCode(params);
        result = 31 * result + Arrays.deepHashCode(headers);
        return result;
    }
}
