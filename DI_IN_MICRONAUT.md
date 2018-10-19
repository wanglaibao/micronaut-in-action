#               INVERSION OF CONTROL IN MICRONAUT FRAMEWORK

### 1: IOC IN MICRONAUT
* Micronaut takes heavy inspiration from Spring.

* Spring relies exclusively on runtime reflection and proxies, while Micronaut uses compile time data to implement dependency injection.

* The goals of the Micronaut IoC container are summarized as below:

        1: Use reflection as a last resort
        
        2: Avoid proxies
        
        3: Optimize start-up time
        
        4: Reduce memory footprint
        
        5: Provide clear, understandable error handling
    
* IoC part of Micronaut can be used completely independently of Micronaut itself for whatever application type you may wish to build.


### 2:  BEAN DEFINITION

* Micronaut implements the JSR-330 (javax.inject) - Dependency Injection for Java specification.

* Micronaut uses the annotations provided by javax.inject.

* Micronaut supports the following types of dependency injection:
        
        1: Constructor injection (must be one public constructor or a single contructor annotated with @Inject)
        
        2: Field injection
        
        3: JavaBean property injection
        
        4: Method parameter injection
