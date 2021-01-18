# Decorator

The Decorator is a structural pattern used to add new responsibilities to an object dynamically without extending functionality. That lets you dynamically change the behavior of an object at runtime by wrapping it in an object of a decorator class.

Decorators are used for adding some behavior that is not part of the core functionality to all interface methods. Decorator pattern perfectly suits for the following tasks:

* caching the work results;
* measuring the execution time of methods;
* user access control.

The decorator pattern has the following components:

* Component is the interface for the objects that will get new responsibilities from the decorators;
* Concrete Component defines objects which implement the Component interface and will get new responsibilities from the concrete decorators;
* Decorator has reference to the Component and overridden component methods;
* Concrete Decorator extends Decorator class and adds new functions, properties or state without creating new classes;

![image](https://user-images.githubusercontent.com/4706304/104871051-b3272280-590f-11eb-9e75-d8bd503814f3.png)

The decorator pattern in JDK:

    Streams: java.io package;
    Collections: java.util package.

The decorator pattern is applicable in the following cases:

* When you want to add new properties and functions to the object dynamically;
* When the extension of classes is superfluous.
