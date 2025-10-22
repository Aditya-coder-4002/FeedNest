# FeedNest

A simple Java application to fetch, aggregate, and serve RSS/Atom/custom feeds. This project is for learning/demo purposes.

## Features
- Fetch & aggregate RSS/Atom feeds
- Normalize feed entries
- Simple filtering and deduplication
- Expose feeds via HTTP endpoints (JSON)

## Requirements
- Java 11+
- Apache Tomcat 10+ (or Tomcat 9 if using javax.* namespaces)
- Optional: MySQL or other storage if you enable DB persistence

## Clone
```bash
git clone https://github.com/Aditya-coder-4002/FeedNest.git
cd FeedNest
```

## Build (produce WAR)
- With Maven:
```bash
mvn clean package -DskipTests
# WAR will be in target/*.war (e.g. target/feednest.war)
```

