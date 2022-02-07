# flyway tutorial quarkus

## Erster Schritt - Pom.xml

```xml
<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-flyway</artifactId>
</dependency>
```

```xml
<plugin>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-maven-plugin</artifactId>
    <version>8.4.4</version>
    <configuration>
        <url>jdbc:postgresql://localhost:5432/db</url>
        <user>app</user>
        <password>app</password>
        <locations>
            <location>filesystem:src/main/resources/db/migration</location>
        </locations>
    </configuration>
</plugin>
```

Downloaden von IntelliJ Plugin JPA-Buddy für erstellen von Migrations

## Zweiter Schritt - Erstellen einer Entity Klasse

```java
package entities;

import javax.persistence.*;

@Entity
@Table(name = "FW_BOOKS")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FW_ID")
    private Long id;

    @Column(name = "FW_NAME")
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

## Dritter Schritt - Erstellen der Migration mit JPA-Buddy

![](./img/JPAStructure.png)

### Plus -> Diff Versioned Migration

![](./img/Migration.png)

![](./img/MigrationName.png)

```shell
mvn flyway:info
```

```shell
mvn flyway:migrate
```
