Project name: AutoCraftHub 🚗
Group: SE-2216
Team members: Nauryzbay Tasbulat, Dauren Rysbek
Project Overview:

The project is a car management system that incorporates various design patterns to achieve modularity, extensibility, and maintainability. The system involves creating and managing a car inventory within a car shop. Users can add new cars, add additional features to existing cars, delete cars from the inventory, apply chosen cars to the site, charge cars quickly, and observe changes in the car inventory.

Idea of the Project:
The main idea of the project is to create a flexible and extensible system for managing cars within a shop. The project allows users to dynamically add features to cars, apply changes to the site, and observe inventory modifications in real-time. The system also incorporates charging options for cars, including a quick charging feature.

Purpose of the Work:
The purpose of the project is to demonstrate the implementation of various design patterns in a real-world scenario. By developing a car management system, the project aims to showcase the practical application of patterns like Singleton, Observer, Decorator, Factory, Strategy, and Adapter. The project serves as an educational tool to understand how these patterns can enhance code structure and maintainability.

Objectives of the Work:
Implement a car management system using Java. Utilize design patterns to address different aspects of the system's functionality. Showcase the practical application of Singleton, Observer, Decorator, Factory, Strategy, and Adapter patterns. Provide a modular and extensible architecture for the car shop system. Demonstrate dynamic feature addition to cars and real-time observation of inventory changes.

image
UML Diagram of the Design Patterns used in this project

Main body:

♦ Singleton Pattern (CarShop): Ensures a single instance of the CarShop exists, allowing centralized control of the car inventory.

♦ Observer Pattern (Observer, ConsoleObserver): Enables the CarShop to notify observers (such as ConsoleObserver) about changes in the car inventory, providing a real-time update mechanism.

♦ Decorator Pattern (CarDecorator, LedHeadlightsDecorator, FastChargingDecorator, WinterWheelsDecorator): Allows the dynamic addition of features to cars without modifying their core implementation. Each decorator extends the functionality of the base Car class.

♦ Factory Pattern (CarFactory): Encapsulates the process of creating cars, providing a flexible way to instantiate different types of cars.

♦ Strategy Pattern (CarStrategy): Defines a strategy for adding features to a car. Concrete strategies like WinterWheelsStrategy and LedHeadlightsStrategy can be implemented.

♦ Adapter Pattern (QuickChargingAdapter): Adapts the interface to enable quick charging for cars. It bridges the gap between the existing Car interface and the specific quick charging implementation.

Conclusion:

Key Points of the Project:
The project successfully demonstrates the implementation of several design patterns to create a modular and extensible car management system. Design patterns such as Singleton, Observer, Decorator, Factory, Strategy, and Adapter contribute to the flexibility and maintainability of the code.

Project Outcomes:
The project achieved a modular structure, making it easy to add new features or modify existing ones without affecting the entire system. Real-time observation of inventory changes provides a dynamic and responsive user experience.

Challenges Faced:
The complexity of integrating multiple design patterns required careful consideration of interactions between components. Ensuring that the patterns were applied appropriately and effectively posed a challenge in balancing simplicity and flexibility.

Future Improvements:
Integration of a graphical user interface (GUI) to enhance user interaction and visualization. Implementation of additional features, such as user authentication and transaction logging. Further refinement of the charging mechanism to accommodate different charging stations and protocols.
References:
https://refactoring.guru/ru/design-patterns
https://refactoring.guru/ru/design-patterns/adapter
https://www.w3schools.com/java/
https://www.geeksforgeeks.org/design-patterns-set-4-observer-pattern/
