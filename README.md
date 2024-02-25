# IoC-DepInjection
# Dependency Injection Example

This project demonstrates the concepts of Inversion of Control (IoC) and Dependency Injection (DI) in Java.

## Overview

The project consists of two main classes:

1. **Presentation:** This class demonstrates dependency injection using manual instantiation and setter injection. It creates an instance of `MetierImpl` and injects a `DaoImpl` or `DaoImpl2` instance into it.

2. **Presentation2:** This class demonstrates dependency injection using reflection. It reads class names from a `config.txt` file and dynamically instantiates the `IDao` and `IMetier` implementations specified in the file. It then uses reflection to call the `setDao` method on the `IMetier` instance to inject the `IDao` instance.

## Usage

To run the examples:

1. Compile the Java files.


2. modify the `config.txt` file in the `src` directory with the Implemetation you want to use:


3. Run the `Presentation` or `Presentation2` class.

