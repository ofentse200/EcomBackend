# E-commerce Backend Application

## Group Assignment - ADP372S (Applications Development Practice 3)

**Due Date:** Friday, 27th March 2026 at 23:59

### Project Overview

This is a Maven-based Java project implementing an E-commerce Backend system using Domain Driven Design (DDD) principles. The project demonstrates TDD (Test Driven Development) and collaborative development practices using Git and GitHub.

---

## UML Class Diagram

[Insert your UML Class Diagram here using StarUML or similar tool]

---

## Project Structure

```
EcomBackEnd/
├── src/
│   ├── main/java/com/ecommerce/
│   │   ├── domain/              # Domain entities
│   │   ├── factory/             # Factory classes
│   │   ├── repository/          # Repository interfaces and implementations
│   │   └── service/             # Service classes
│   └── test/java/com/ecommerce/
│       ├── domain/              # Domain tests
│       ├── factory/             # Factory tests
│       └── repository/          # Repository tests
├── pom.xml                      # Maven configuration
├── .gitignore                   # Git ignore rules
└── README.md                    # This file
```

---

## Technology Stack

- **Language:** Java 11+
- **Build Tool:** Maven 3.6+
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub
- **Testing:** JUnit 4

---

## Team Members

| Name | Student Number | GitHub Profile |
|------|----------------|----------------|
| [Team Lead Name] | [Number] | [GitHub Link] |
| [Member 2 Name] | [Number] | [GitHub Link] |
| [Member 3 Name] | [Number] | [GitHub Link] |
| [Member 4 Name] | [Number] | [GitHub Link] |
| [Member 5 Name] | [Number] | [GitHub Link] |

---

## Assignment Milestones

### Milestone 1: Entity Milestone (Due: Friday, 13th March 2026)
- Create domain entities using Builder Pattern
- Each team member implements at least one entity

### Milestone 2: Factory Milestone (Due: Monday, 16th March 2026)
- Implement factory classes using TDD
- Create corresponding factory test classes

### Milestone 3: Repository Milestone (Due: Sunday, 22nd March 2026)
- Implement repository interfaces and implementations
- Create repository test classes

---

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6+
- IntelliJ IDEA (Community or Ultimate Edition)
- Git

### Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/[team-lead]/EcomBackEnd.git
   cd EcomBackEnd
   ```

2. **Open in IntelliJ:**
   - Open IntelliJ IDEA
   - Click `File > Open` and select the EcomBackEnd folder
   - IntelliJ will recognize the Maven project automatically

3. **Build the project:**
   ```bash
   mvn clean install
   ```

4. **Run tests:**
   ```bash
   mvn test
   ```

---

## Code Comments Template

Each Java source file should include the following header comments:

```java
/**
 * [Class/Interface Name]
 * [Brief Description]
 * 
 * Author: [Name] ([Student Number])
 * Date: [Date Created]
 */
```

---

## Contribution Guidelines

1. **Branch Naming:** Use your student number as the branch name
2. **Commit Messages:** Use clear and descriptive messages
3. **Pull Requests:** Send pull requests to the team lead for review
4. **Code Review:** Team lead will review and merge error-free contributions
5. **Sync:** Ensure your fork is in sync with the main repository

---

## Design Principles

- **Code to abstraction, not to concretion**
- **DDD - Domain Driven Design**
- **TDD - Test Driven Development**
- **SOLID Principles**
- **Clean Code Practices**

---

## Submission

- **Format:** GitHub Repository Link
- **Due Date:** Friday, 27th March 2026 at 23:59
- **Submission Method:** One group member (preferably Team Lead) uploads to Blackboard with all team members' details and GitHub links

---

## Lecturers

- Sabre Didi
- Temuso Makhurane
- Kruben Naidoo
- Israel Tchouya'A Ngoko

---

**© Copyright reserved 2026. Prepared by Kruben Naidoo.**
