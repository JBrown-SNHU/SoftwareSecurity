# SoftwareSecurity
CS-305 Software Security class at SNHU

Question: Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial, a consulting company that makes individualized financial plans, wanted to securely protect their clients' data on their web applications. Specifically, they wanted to add a file verification step, a data verification step in the form of a checksum, and add secure communication mechanisms to their current software application. 

Question: What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

When looking for vulnerabilities I first access what the application would be doing that I might determine what vulnerabilities might be present, after doing that I ran a static tester (Maven) to determine other vulnerabilities. What I did particularly well on was, identifying problems areas such as the Spring Boot being out of date, and refactoring the code to an updated version of Spring Boot. It is important to code securely to decrease instances of vulnerabilities in your web applications. Doing so will make your applications more secure and less likely to be breached through cyber-attacks.

Questions: What part of the vulnerability assessment was challenging or helpful to you?

After creating a self-signed certificate, I had some issues properly incorporating it into the application. I ended up using a different certificate to test out the application and make sure it worked; however, I couldn’t manage to get it to work with my certificate. 

Question:How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

Along with the file verification and the checksum, I also update the application to include the newest version of Spring Boot along with Java 17. Doing so eliminated all vulnerabilities due to unsupported framework. I found the Maven static testing tool to be a great tool for helping to identify vulnerabilities that I wasn’t able to detect, and will certainly be using it in the future to help make my web application more secure.

Question: How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

Firstly, I ran the application to make sure everything worked properly. Secondly, I visually inspected the application to make sure I used secure coding practices and patterns when refactoring the code. Third, I used the static testing tool to make sure that there weren’t any new vulnerabilities that were introduced as a result of my refactored code.

Question: What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Before this course, I had no experience working with maven, or using RESTful web services. Maven took a while to get the hang of and was more trial and error than anything, but once I got it, it ended up being a tremendous help in the course material. For the RESTful web services, I found the online resources and tutorials at https://spring.io to be extremely helpful. I will definitely be exploring RESTful web services using Spring in more detail in the future.

Question: Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I would mainly show employers the ability to identify and address software vulnerabilities. Being able to write excellent code is good; however, being able to write excellent and secure code is magnificent; not only will it accomplish its goal but it won’t serve as a position of weakness in a company's applications.
