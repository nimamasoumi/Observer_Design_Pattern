class ConcreteObserver implements IObserver
{
    private String name;
    private String state;
    public ConcreteObserver(String _name)
    {
        this.name=_name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String _name)
    {
        this.name=_name;
    }
    
    @Override
    public void update(String _event)
    {
        System.out.println("This is the Observer "+this.name);
        System.out.println("Got a notification for the event "+_event);
        this.state=_event;
    }
}