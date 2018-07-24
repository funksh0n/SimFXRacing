# SimFXRacing
1. API
2. Clients
3. Hosting
4. Security
5. Cost

## API
### Data - MongoDB
Traditional relational databases such as MySQL (MariaDB) offer excellent support and documentation, as well as well defined standards.  However, these structured databases are often rigid and difficult to change if the project requirements change, and do not scale well.  Modern NoSQL databases offer loose consitancy models and provide excellent horizontal scaling and higher availability.
**MongoDB** is an open source document-oriented NoSQL database.  Instead of storing data in tables, MongoDB stores structured data as JSON-like documents with dynamic schemas.  The lower cost, easier scalability, and open source features make this an excellent option for the API backend.

### Language - GoLang
As the C language of the 21st century, Go has good support for NoSQL databases, including the popular redis, mongoDB, Cassandra and Membase NoSQL databases.  Go provides many powerful packages, importantly the `http` package, and is ideal for creating RESTful interfaces that client apps can talk to.
Go requires no separate web service such as NGINX or Apache, as Go is capable of listening to TCP itself.

## League Screen
* Add races
* Display table

## Race Screen
* Add drivers to races
* Add results to races

![Main Screen](https://i.imgur.com/h3QqFJt.png)
