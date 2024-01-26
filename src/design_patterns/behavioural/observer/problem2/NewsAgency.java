package design_patterns.behavioural.observer.problem2;


import java.util.ArrayList;
import java.util.List;



// ▬ "Observable" ▬
public class NewsAgency {

    //
    private String news;

    // ▼ "Array List" ▼
    private List<Channel> channels = new ArrayList<>();



    // ▬ The "addObserver()" Method ▬
    public void addObserver(Channel channel) {
        // ▼ "Add" the "Channel" to the "Array List" ▼
        this.channels.add(channel);
    }



    // ▬ The "removeObserver()" Method ▬
    public void removeObserver(Channel channel) {
        // ▼ "Remove" the "Channel" from the "Array List" ▼
        this.channels.remove(channel);
    }



    // ▬ The "setNews()" Method
    //      → for "Updating" the "News" ▬
    public void setNews(String news) {
        // ▼ "Set" the "News" ▼
        this.news = news;


        // ▼ "Notify All" the "Channels"
        //      → for the "Breaking News" ("New/Update News") ▼
        for(Channel channel : channels) {

            // ▼ "Update" → "Each Channel" ▼
            channel.update(this.news);
        }
    }
}
