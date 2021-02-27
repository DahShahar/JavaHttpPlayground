/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JavaHttpPlayground;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class App {

    private final HttpClient client;
    private final ObjectMapper mapper;

    public App() {
        client = HttpClientBuilder.create().build();
        mapper = new ObjectMapper();
    }

    public String getGreeting() throws Exception {
        var getRequest = new HttpGet("https://jsonplaceholder.typicode.com/posts");

        HttpResponse response = client.execute(getRequest);
        Post[] posts = mapper.readValue(mapper.createParser(response.getEntity().getContent()), Post[].class);

        for (int i = 0; i < posts.length; i++) {
            System.out.println(posts[i]);
        }

        return "done";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());
    }
}
