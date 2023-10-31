import java.util.Scanner;
class ODPDemo
{
    public static void main(String[] args)
    {
        var userC = new Scanner(System.in);

        var subject1 = new Subject();
        subject1.setState("initialization");
        subject1.notifyO();

        String _command, _name;
        boolean exitApp = false;
        while(!exitApp)
        {
            System.out.println("\nEnter a command: add/state/remove/dispose");
            _command = userC.nextLine();
            if(_command.equals("dispose"))
            {
                subject1.setState("disposing");            
                subject1.notifyO();
                subject1.disposeAll();                
                exitApp = true;
            }
            else if(_command.equals("add"))
            {
                System.out.println("Adding an observer, enter its name: ");
                subject1.attachO((new ConcreteObserver(userC.nextLine())));

                subject1.setState("running");
                subject1.notifyO();
            }
            else if(_command.equals("remove"))
            {
                System.out.println("Removing an observer, enter its name: ");
                _name = userC.nextLine();
                var it = subject1.getObservers().listIterator();
                while (it.hasNext())
                {
                    var obs = (ConcreteObserver) it.next();
                    if(_name.equals(obs.getName()))
                    {
                        subject1.detachO(obs);
                        break;
                    }
                }                
                subject1.setState("running");
                subject1.notifyO();
            }
            else if(_command.equals("state"))
            {
                System.out.println("Setting the state, enter the state: ");
                subject1.setState(userC.nextLine());
                subject1.notifyO();
            }
            else
            {
                System.out.println(_command+" is not a valid command!\n");                
            }
        }                                        
    }        
}