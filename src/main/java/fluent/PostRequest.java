package fluent;

import java.util.Arrays;
import java.util.Objects;

public record PostRequest(String host, String path, String port,
                          String[][] params, String[][] headers) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostRequest that = (PostRequest) o;

        if (!Objects.equals(host, that.host)) return false;
        if (!Objects.equals(path, that.path)) return false;
        if (!Objects.equals(port, that.port)) return false;
        if (!Arrays.deepEquals(params, that.params)) return false;
        return Arrays.deepEquals(headers, that.headers);

    }
}

