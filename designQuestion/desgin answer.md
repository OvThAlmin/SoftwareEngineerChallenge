# Design A Google Analytic like Backend System

## Architecture

[Client] --> [Apache Kafka] --> [Application Server] --> [Database]

### Client

- Client(for example by javascript, and more) send huge write events.

### Apache Kafka

- Client send messages to Apache Kafka.
- Kafka send message to Application.

### Application Server

- Application Server consume event data from Kafka.
- This AP server analyze and save result to Database.

### Database

- For latest metrics
  - Amazon Aurora save latest data: this DB handle large read/query volume.
- For historical data
  - Cassandra or MongoDB have histrical records: this DB is read less frequently than latest metrics, so quick response is important.
