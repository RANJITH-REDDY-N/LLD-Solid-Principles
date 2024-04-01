# LLD-Solid-Principles
**SOLID** 
     S  - Single Responsibility Principle

     O - Open Closed Principle

     L  - Liskov’s Substitution Principle

     I   - Interface Segregation Principle

     D  - Dependency Inversion Principle

    

- It is a set of principles/guidelines that help us to design a better software system
    - Extensible
    - Maintainable
    - Reusable
    - Easy to test
    - Modular
    - Understandable

> Problems due to too many if-else:
1. Understandability
2. Difficult to test
3. Difficult to work parallelly for multiple developers
4. Less reusability ⇒ DRY : Don’t Repeat Yourself
5. It violates S in SOLID Principles
> 

### The "S" in SOLID stands for Single Responsibility Principle (SRP).

**Every code unit (Class/Method/Package) in the code base should have exactly 1 responsibility.**
*Here ’Responsibility’ means ⇒ There should be exactly 1 reason to change code of the unit.*

Always remember : **Don’t over engineer** 

<aside>
❌ Methods with only 3 lines of code (It’ll become hectic and chaos) → It is a classic example of over engineering.

</aside>

<aside>
❌ Starting with micro services architecture instead of Monolithic.

</aside>

<aside>
❌ YAGNI - You aren’t gonna need it

</aside>

> How to identify SRP violations:
1. Method with multiple if/else:
       :Any how multiple if/else might be a SRP violations, but this is NOT always true → We might need if/else blocks for implementing business logic
2.Monster methods:
       : Methods which has a lot of code inside it, that does a lot more than the method name suggests.
3. Commons/Util Packages:
       : This is discouraged in almost all of the top companies(MAANG and more)
       : Common/Util → end up becoming the garbage place for all the code that an engineer doesn’t want to think about where exactly to put. Instead, create a separate utils package for every specific feature.
       : CONSTANT.java class → Not Recommended → If a string constant is used in a single class, keep it there, else constant class for each package.
> 

The Single Responsibility Principle states that every class or module in a program should have responsibility for just a single piece of that program's functionality. More specifically, it states that every class or module should have only one reason to change.

This principle gives us the following benefits:

- **Testing** - A class with one responsibility will have far fewer test cases
- **Lower coupling** - Less functionality in a single class will have fewer dependencies
- **Organization** - It's easier to understand and find classes of a system when each class has only one responsibility

In essence, the Single Responsibility Principle helps developers avoid creating monolithic classes that are difficult to maintain, understand and are potentially fragile. This principle promotes a more robust, maintainable structure with less tightly-coupled classes.

### The "O" in SOLID stands for Open-Closed Principle (OCP).

- **Open for extension**
- **Closed for modification**

New changes/features should be added by adding more code instead of updating the current code.

**Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.** In other words, you should be able to add new functionality to a system without having to modify its existing code.

The principle suggests that we should design our modules, classes and functions in such a way that when new functionalities need to be added, we can add them by adding new code, not by changing old code which is already been tested and is working fine.

The advantage of this is that existing code is less likely to break. When you change existing, working code, there's a risk you'll introduce errors. This principle is intended to help developers avoid that.

In practice, this principle can be followed by using interfaces and abstract classes in object-oriented programming. For example, we can create an abstract class (or interface), and have other classes implement or extend it. If we need to add a new function, we can add it to a new class that also implements or extends the same abstract class (or interface).

In doing so, the Open-Closed Principle promotes a more robust, flexible, and maintainable codebase.

### The "L" in SOLID stands for Liskov Substitution Principle (LSP).

**Object of any child class should be “as-is” substitutable in a variable of parent type without requiring any code change.** *What I mean when “any code change” is that ‘a child object should not get any special treatment to accommodate in a parent type.’ 

LSP ALSO SAYS THAT, Don’t override things that don’t go together logically!*

*Detailed Explanation:*

LSP states that in a computer program, if S is a subtype of T, then objects of type T may be replaced with objects of type S without affecting the correctness of the program.

In other words, objects of a superclass shall be able to be replaced with objects of a subclass without breaking the application. This requires all subclasses to behave in the same way as the superclass.

Continuing on, the Liskov Substitution Principle (LSP) fundamentally promotes the concept of polymorphism in object-oriented programming. It provides a layer of abstraction, enabling the same interface to be used for the general class and its subclasses. This leads to a reduction in complexity and increases the flexibility of the code.

In essence, LSP emphasizes the need for proper hierarchy and behavior within classes, ensuring that a derived class never modifies the behavior, but only extends the base class. Violating LSP can lead to unwanted side effects and errors in the program. Therefore, when designing subclasses, it's essential to ensure they can be substituted for their base class without causing issues.

### The "I" in SOLID stands for Interface Segregation Principle (ISP).

- **Interfaces should be as light as possible**
- **As less methods as possible**
- **Ideally should have only 1 method**

Methods in an interface logically go together

The Interface Segregation Principle advocates for multiple specific interfaces rather than one general-purpose interface. Clients should not be forced to depend on interfaces they do not use. The principle states that a class should not have to implement an interface if it doesn't use all of the interface's methods.

*In a nutshell, the ISP encourages you to break down your interfaces into the smallest possible groups of responsibilities. This way, you’ll avoid “fat” interfaces that describe too many behaviors and are used by classes that only need a small subset of them.*

This approach helps to prevent classes from being affected by changes that they don't care about. It also makes the system easier to understand, change, and expand. Following the ISP leads to a system that is more decoupled, flexible, and maintainable.

### The "D" in SOLID stands for Dependency Inversion Principle (DIP).

**DIP Says that, no 2 concrete classes should directly depend on each other, they should depend on each other via interfaces.**

The Dependency Inversion Principle is a way to decouple software modules. This principle states two essential things:

- High-level modules should not depend on low-level modules. Both should depend on abstractions(or Interfaces).
- Abstractions should not depend on details. Details should depend on abstractions.

In a simpler context, this means that we should decouple our code by having both high-level and low-level objects depend on the same abstract interaction. This decoupling promotes a more flexible system, less concerned with specific details and more focused on collaborating with abstract interfaces.

By adhering to the Dependency Inversion Principle, we can create code that is more reusable and easier to refactor. It helps in controlling the code’s future changes and allows our system to be more adaptable to varying requirements. Violations of DIP, like depending on concrete classes rather than interfaces, can often lead to issues in maintainability and flexibility.
