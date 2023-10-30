# Observer_Design_Pattern

![alt-text](https://github.com/nimamasoumi/Observer_Design_Pattern/blob/main/uml.png?raw=true)
## Implementation of the observer design pattern in Java.
An object, named the _Subject_ maintains a list of its dependents, called observers. When a subject changes state, all registered observers are notified an updated automatically.

The subject notifies the observers by calling their `update()`.

The responsibility of observers is to register and unregister themselves with a subject.

Subject and observers are loosely coupled. However, observers can be added and removed independently at run time.

This notification-registration interaction is also known as publish-subscribe.

The observer pattern can cause memory leaks, known as the lapsed listener problem. This can be prevented if the subject holds weak references to the observers.

