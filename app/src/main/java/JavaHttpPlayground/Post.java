package JavaHttpPlayground;

public class Post {
    private String userId;
    private String id;
    private String title;
    private String body;

    public Post() {}

    public String getUserId() {
        return userId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Post withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Post withId(String id) {
        this.id = id;
        return this;
    }

    public Post withTitle(String title) {
        this.title = title;
        return this;
    }

    public Post withBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
                "UserId = %s, id = %s, Title = %s\nBody = %s",
                userId,
                id,
                title,
                body
        );
    }
}
