package design_patterns.behavioural.observer.problem2;



// ▬ "Observer"
//      → that "Implement" the "Channel" Interface ▬
public class NewsChannel implements Channel {

    // ▼ "Property" ▼
    public String news;

    // ▼ Creating a "NewsAgency" Instance/Object
    //      → and Connecting It to the "News Channel" Class ▼
    NewsAgency newsAgency = new NewsAgency();


    // ▬ The "update()" Override Method ▬
    @Override
    public void update(Object object) {
        // ▼ "Set" the "News" ▼
        newsAgency.setNews((String) news);

        System.out.println("News Updated! ");
    }
}
