package Observer;

public class ConcrectObserver implements Observer{
    private String name;
    private Subject topic;

    public ConcrectObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg != null) {
            System.out.println(name + " fui avisado:" + msg);
            
        }
    }

    @Override
    public void setSubject(Subject subj) {
        this.topic = subj;
    }
}
