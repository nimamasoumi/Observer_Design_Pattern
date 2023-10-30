import java.util.List;
import java.util.ArrayList;

class Subject
{
    List<IObserver> observers = new ArrayList<>();
    private String state;
    public void notifyO()
    {

    }
    public void attachO()
    {

    }
    public void detachO()
    {

    }
    public String getState()
    {
        return this.state;
    }
    public void setState(String _state)
    {
        this.state=_state;
    } 
}