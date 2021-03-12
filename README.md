# SOLID

## SRP Single Responsibility Priciple

Classes should have a single responsibility and thus only a single reason to change.
The single responsibility principle (SRP) states that every class or module in a program should have responsibility for just a single piece of that program’s functionality. Further, the elements of that responsibility should be encapsulated by the responsible class rather than spread out in unrelated classes.

## OCP Open Closed Principle

Classes and other entities should be open for extension but closed for modification.
You should be able to add new functionality without changing your existing code. OCP uses interfaces to allow different implementations of your code that you can substitute without changing the code that uses them.

## LSP Liskov Substitution Principle
The LSP principal objective is to be able to use any derived class in place of its parent class and have it behave in the same manner without modification.

## ISP Interface-Segregation Principle

The ISP is all about splitting the methods of a contract into groups of responsibility and assigning interfaces to these groups to prevent a client from needing to implement one large interface and a host of methods that they do not use.

## DIP Dependency Inversion Principle
The DIP is all about isolating your classes from concrete implementations, and having them depend on abstract classes or interfaces, so that high level modules does not depend on low level ones. 
It promotes the mantra of coding to an interface rather than an implementation, which increases flexibility within a system by ensuring you are not tightly coupled to one implementation
