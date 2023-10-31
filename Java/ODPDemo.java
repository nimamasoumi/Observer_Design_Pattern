class ODPDemo
{
    public static void main(String[] args)
    {
        var subject1 = new Subject();
        var observer1 = new ConcreteObserver("observer1");
        var observer2 = new ConcreteObserver("observer2");

        subject1.attachO(observer1);
        subject1.attachO(observer2);

        subject1.setState("initialization");
        subject1.notifyO();

        subject1.setState("running");
        subject1.notifyO();

        subject1.setState("disposing");
        subject1.notifyO();
        subject1.detachO(observer1);

        subject1.notifyO();
        subject1.detachO(observer2);
    }
}