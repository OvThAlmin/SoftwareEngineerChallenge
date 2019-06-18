# Design A Google Analytic like Backend System

## Architecture

[Client] --> [Apache Kafka] --> [Application Server] --> [Database]

### Client

- Client(for example by javascript, and more) send huge write events.

### Apache Kafka

- Client send messages to Apache Kafka.
- Kafka send to Application

### Application Server

- Application Server consume event data from Kafka
- analyze and save result to Database

### Database

- For latest metrics
  - Amazon Aurora
- For historical data
  - Cassandra or MongoDB
