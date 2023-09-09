-> Spring cloud config provides us server and client set configuration in our distributed system, so that we have get one central place to manage our external properties of out application in all the environment.
-> we can declare our all the properties in global maner so in losaly coupled depenent architecture can access it.
-> what is Insurance provider's endpoint chages in future from /getAllPlans -> /getUpdatedPlans

-> so, how this will be handled, because every client will call old endpoints,
-> so, they all clients are tightly coupled with server. to make losely coupled we add Insurance config server as a middleware.

Create Config on github https://github.com/mishangoti/insurance-config-server
step 1 : create new repository and add application.property file 
step 2 : add property > insurance.provider.url=http://localhost:8080/insurance-server/getAllPlans

add this git project repo in to project now we don't have to change endpoints to add the clients project, instead of that we only have to manage updated endpoints in this git repo
