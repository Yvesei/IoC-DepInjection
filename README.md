# Dependency Injection Example

This project demonstrates various methods of dependency injection in Java, including static instantiation, dynamic instantiation, and Spring framework (XML and annotations).

## Interfaces

1. **IDao:** Interface with a method `getData`.

2. **IMetier:** Interface with a method `calcul`.

## Implementations

1. **dao.DaoImpl:** Implementation of `IDao` version DB.
1. **ext.DaoImpl2:** Implementation of `IDao` version capteurs.
3. **MetierImpl:** Implementation of `IMetier` using low coupling.

## Overview

The project consists of two main classes:

1. **Presentation:** This class demonstrates dependency injection using manual instantiation and setter injection. It creates an instance of `MetierImpl` and injects a `DaoImpl` or `DaoImpl2` instance into it.

2. **Presentation2:** This class demonstrates dependency injection using reflection. It reads class names from a `config.txt` file and dynamically instantiates the `IDao` and `IMetier` implementations specified in the file. It then uses reflection to call the `setDao` method on the `IMetier` instance to inject the `IDao` instance.
3. **presSpringXML:** This class demonstrates dependency injection using the Spring framework with XML configuration. It uses the `ApplicationContext.xml` file to configure the Spring beans and their dependencies.
4. **presSpringAnnotations:** This class demonstrates dependency injection using the Spring framework with annotations. It uses annotations such as `@Autowired` to inject dependencies.

 
## Dependency Injection

### Static Instantiation

In the `Presentation` class, an instance of `MetierImpl` is created and a `DaoImpl` or `DaoImpl2` instance is injected using setter injection.

### Dynamic Instantiation

The `Presentation2` class reads class names from a `config.txt` file and dynamically instantiates the `IDao` and `IMetier` implementations specified in the file using reflection. It then uses reflection to call the `setDao` method on the `IMetier` instance to inject the `IDao` instance.

### Spring Framework

1. **XML Configuration:** The `spring-config.xml` file configures the Spring beans `daoImpl` and `metierImpl` and their dependencies.

2. **Annotations:** The `MetierImpl` class uses `@Autowired` annotation to inject the `IDao` instance.

## Usage

1. Compile the Java files:


## Usage

To run the examples:

1. Compile the Java files.


2. modify the `config.txt` file in the `src` directory with the Implemetation you want to use:


3. Run the `Presentation` or `Presentation2` class.

