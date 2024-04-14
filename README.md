# School Management System

## Overview
The School Management System is a Java application designed to manage various aspects of a school, including administrative tasks, student information, teacher management, financial transactions, and course offerings. It provides functionalities tailored for different roles within the school, such as the principal, teachers, students, and finance officer.

## Entities and Functionalities

### Principal
- The principal is responsible for overseeing the school's operations and making key decisions.
- Key functionalities:
    - Receive salary
    - Expel a student from the school
    - Admit applicants based on age

### Teachers
- Teachers are responsible for delivering educational content and managing classes.
- Key functionalities:
    - Receive salary
    - Teach a course

### Students
- Students are individuals enrolled in courses at the school.
- Key functionalities:
    - Enroll in courses and classes
    - Pay fees

### Finance Officer
- The finance officer manages financial transactions and records within the school.
- Key functionalities:
    - Manage payments for expenses such as supplies, utilities, and salaries
    - Make payments to staff members

### Courses
- Courses represent educational programs offered at the school.
- Each course may have multiple cohorts.

### Cohorts
- Cohorts represent classes within a course (e.g., 10th grade, 11th grade, etc.).
- Each cohort may have multiple students enrolled.

## Class Structure

### `School`
- Manages the overall school operations, including principal, teachers, students, finance officer, courses, and cohorts.
- Tracks total money earned and spent by the school.

### `Principal`
- Represents the principal of the school.
- Functionalities include expelling students, approving payments, and receiving salary.

### `Teacher`
- Represents a teacher at the school.
- Functionalities include teaching a course and receiving salary.

### `Student`
- Represents a student enrolled in courses at the school.
- Attributes include courses enrolled, classes attended, and fees paid.

### `FinanceOfficer`
- Represents the finance officer responsible for managing financial transactions.
- Manages payments for expenses and receives salary.

### `Course`
- Represents a course offered at the school.
- Each course has a unique identifier and a name.

### `Cohort`
- Represents a class within a course, such as 10th grade or 11th grade.
- Each cohort has a unique identifier and a name.

### `Person`
- Represents a person with common attributes like id and name.
- Serves as a superclass for other entities in the system.

## Class Diagram
![Class Diagram](link-to-your-class-diagram-image)

## Usage
- Instructions on how to run or use the School Management System.
  Still under deveopment. Instructions will be out soon.

## Contributors
- Mark Mwangi
- Kaleb Baraka
