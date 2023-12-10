# Employee Machine Management with EJB and JSF

This project is a comprehensive Employee Machine Management system developed using Enterprise JavaBeans (EJB) and JavaServer Faces (JSF). It provides a robust solution for managing employees and their associated machines with a rich web-based user interface.

### Prerequisites

Before you begin, ensure you have the following installed:

* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - JDK for running the application.
* [Apache Maven](https://maven.apache.org/guides/index.html) - Maven for building and managing the project.
* [Java EE SDK](https://www.oracle.com/java/technologies/javaee8sdk-downloads.html) - Java EE SDK for EJB support.
* [WildFly Application Server](https://wildfly.org/downloads/) - WildFly for deploying and running the application.

### Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/employee-machine-management.git
   ```

2. Navigate to the project directory:

   ```bash
   cd employee-machine-management
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Deploy the application to WildFly:

   Copy the generated WAR file (e.g., `employee-machine-management.war`) to the WildFly `standalone/deployments` directory.

5. Start WildFly:

   ```bash
   ./standalone.sh
   ```

   The application will be accessible at [http://localhost:8080/employee-machine-management](http://localhost:8080/employee-machine-management).

### Additional Documentation

For further details and customization, refer to the following documentation:

* [JavaServer Faces (JSF)](https://javaee.github.io/javaserverfaces-spec/) - Official documentation for JSF.
* [Enterprise JavaBeans (EJB)](https://docs.oracle.com/javaee/7/tutorial/ejb-intro.htm) - Java EE tutorial on Enterprise JavaBeans.
* [WildFly Documentation](https://docs.wildfly.org/) - Documentation for the WildFly Application Server.
* [Maven Plugin for WildFly](https://docs.jboss.org/wildfly/plugins/maven/latest/) - Maven plugin for deploying applications to WildFly.

### Contributing

Feel free to contribute to the project by opening issues or submitting pull requests.
