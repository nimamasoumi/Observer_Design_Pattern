import java.util.List;
import java.util.ArrayList;

class Subject
{
    private List<IObserver> observers = new ArrayList<>();
    private String state;
    public void notifyO()
    {
        var it = observers.listIterator();
        while(it.hasNext())
        {            
            it.next().update(this.getState());
        }
    }
    public synchronized void attachO(IObserver _o)
    {
        this.observers.add(_o);
    }
    public synchronized void detachO(IObserver _o)
    {
        this.observers.remove(_o);
    }  
    public String getState()
    {
        return this.state;
    }
    public synchronized void setState(String _state)
    {
        this.state=_state;
    } 
    public List<IObserver> getObservers()
    {
        return this.observers;
    }
    public synchronized void disposeAll()
    {
        var it = observers.listIterator();
        while (it.hasNext())
        {
            this.observers.remove(it.next());
        }        
    }
}