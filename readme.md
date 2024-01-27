# EZE-Medi Project

EZE-Medi is a full-featured health monitoring kit designed to provide comprehensive health data for users. The kit includes sensors for temperature, ECG, and heart rate. Utilizing a user-friendly website, secure data transmission to a cloud server enables easy tracking and analysis of health metrics. This solution is ideal for remote patient monitoring and managing chronic illnesses.

## Features

- Temperature monitoring
- ECG (Electrocardiogram) data collection
- Heart rate tracking
- Secure data transmission to a cloud server
- User-friendly website for easy tracking and analysis

## Technologies Used

- HTML, CSS, JS for the website frontend
- Spring Boot for the backend
- MySQL for database storage

## Getting Started

To get started with the EZE-Medi project, follow these steps:

1. Clone the repository.
2. Set up the required dependencies.
3. Run the Spring Boot application.
4. Access the website for monitoring and analysis.

## Usage

Provide instructions on how to use the EZE-Medi application or any relevant information here.

## Contributing

If you'd like to contribute to the EZE-Medi project, please follow the guidelines in the CONTRIBUTING.md file.

## License

This project is licensed under the [MIT License](LICENSE).
# Spring Boot Project Setup Guide

This guide provides step-by-step instructions for setting up and running a Spring Boot project using Eclipse, Tomcat, and other necessary tools.

## Step 1: Install Prerequisites

1. **Java Development Kit (JDK):**
   - Install the latest version of JDK. You can download it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK.

2. **Eclipse IDE:**
   - Download and install Eclipse IDE for Java EE Developers. You can download it from the [Eclipse website](https://www.eclipse.org/downloads/).

3. **Apache Tomcat:**
   - Download and install Apache Tomcat. You can download it from the [Apache Tomcat website](http://tomcat.apache.org/).

## Step 2: Set up Eclipse for Spring Boot

1. **Install Spring Tools for Eclipse:**
   - Open Eclipse and go to `Help` -> `Eclipse Marketplace`.
   - Search for "Spring Tools" and install the "Spring Tools (aka Spring IDE and Spring Tool Suite)" plugin.

2. **Import Spring Boot Project:**
   - If you have an existing Spring Boot project, you can import it into Eclipse.
     - Go to `File` -> `Import` -> `Existing Maven Projects`.
     - Select your project's root directory and click `Finish`.

3. **Create a New Spring Boot Project:**
   - If you don't have an existing Spring Boot project, you can create a new one using Spring Initializr.
     - Go to `File` -> `New` -> `Other...` -> `Spring` -> `Spring Starter Project`.
     - Follow the wizard to configure your project.

4. **Run the Spring Boot Application:**
   - Right-click on your Spring Boot project in the `Project Explorer` or `Package Explorer`.
   - Choose `Run As` -> `Spring Boot App`.

## Step 3: Configure Tomcat in Eclipse

1. **Add Tomcat Server to Eclipse:**
   - Open Eclipse and go to `Window` -> `Preferences`.
   - In the Preferences window, navigate to `Server` -> `Runtime Environments`.
   - Click `Add...` to add a new server runtime environment.
   - Choose `Apache` -> `Tomcat` and click `Next`.
   - Browse and select the directory where you installed Tomcat, then click `Finish`.

2. **Configure Spring Boot Application to Use Tomcat:**
   - Open your Spring Boot project's `pom.xml` file.
   - Ensure that the `spring-boot-starter-web` dependency is included (it includes Tomcat by default).

   ```xml
   <dependencies>
       <!-- Other dependencies -->
       <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-web</artifactId>
       </dependency>
   </dependencies>
