// BuilderPatternDemo.java
class HttpRequest {
    private final String method;
    private final String url;
    private final String body;
    private final int timeoutMs;

    private HttpRequest(Builder b) {
        this.method = b.method;
        this.url = b.url;
        this.body = b.body;
        this.timeoutMs = b.timeoutMs;
    }
    public static class Builder {
        private String method = "GET";
        private String url;
        private String body = "";
        private int timeoutMs = 3000;

        public Builder url(String url){ this.url = url; return this; }
        public Builder method(String method){ this.method = method; return this; }
        public Builder body(String body){ this.body = body; return this; }
        public Builder timeoutMs(int t){ this.timeoutMs = t; return this; }
        public HttpRequest build(){ return new HttpRequest(this); }
    }
    @Override public String toString() {
        return String.format("HttpRequest{method=%s, url=%s, timeout=%d, body=%s}",
                method, url, timeoutMs, body);
    }
}
public class BuilderPatternDemo {
    public static void main(String[] args) {
        HttpRequest req = new HttpRequest.Builder()
                .method("POST")
                .url("https://api.example.com/users")
                .timeoutMs(5000)
                .body("{\"name\":\"Heeya\"}")
                .build();
        System.out.println(req);
    }
}
