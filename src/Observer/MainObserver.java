package Observer;

public class MainObserver {

    public static void main(String[] args) {
        ConcrectObserver obs1 = new ConcrectObserver("obs1");
        ConcrectObserver obs2 = new ConcrectObserver("obs2");
        ConcrectObserver obs3 = new ConcrectObserver("obs3");
        
        ConcrectSubject topic = new ConcrectSubject();
        
        topic.register(obs1);
        topic.register(obs2);
        topic.register(obs3);
        
        obs1.setSubject(topic);
        obs2.setSubject(topic);
        obs3.setSubject(topic);
        
        topic.postMessage(" Alo mundo!");
    }
    
}
