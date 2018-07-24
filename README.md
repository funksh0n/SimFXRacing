# SimFXRacing
1. API
2. Clients
3. Hosting
4. Security
5. Cost

## 1. API
### Data - MongoDB
Traditional relational databases such as MySQL (MariaDB) offer excellent support and documentation, as well as well defined standards.  However, these structured databases are often rigid and difficult to change if the project requirements change, and do not scale well.  Modern NoSQL databases offer loose consitancy models and provide excellent horizontal scaling and higher availability.

MongoDB is an open source document-oriented NoSQL database.  Instead of storing data in tables, MongoDB stores structured data as JSON-like documents with dynamic schemas.  The lower cost, easier scalability, and open source features make this an excellent option for the API backend.

### Language - GoLang
As the C language of the 21st century, Go has good support for NoSQL databases, including the popular redis, mongoDB, Cassandra and Membase NoSQL databases.  

Go provides many powerful packages, importantly the `http` package, and is ideal for creating RESTful interfaces that client apps can talk to.

Go requires no separate web service such as NGINX or Apache, as Go is itself capable of listening to TCP.

## 2. Clients - Qt
As SimFXRacing will be on multiple devices there are many options to chose from.
### Mobile
Android, iOS, and Windows (x) Phone each have a dedicated SDK, language and paradigm for creating Apps.  This leads to natively developed apps requiring a separate code base, and whilst each will be talking to our own API, they would have to be developed separately leading to increased complexity and cost.
### Desktop
Similarly to Mobile, Windows, MacOS, and Linux each require different builds of the software.  Whilst there are more convenient multi-platform solutions such as C++, there are still limitations such as single-platform libraries and targeted builds that need to be addressed.

Web Apps can bridge this gap as all major OSes have common web browsers, however not all browsers are equal and require different branches of code to run depeding on which browser is detected.

Electron takes the pervasiveness of Web Apps and the native experience of a desktop application
