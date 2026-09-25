# Library Management System - Member 2

## Responsibility
Member Management and File Persistence.

## Packages
- `model` - Member entity
- `manager` - Member CRUD and validation
- `persistence` - file save/load operations

## Files
- `src/model/Member.java`
- `src/manager/MemberManager.java`
- `src/persistence/FileManager.java`

## Notes
The validation currently uses `IllegalArgumentException`. During final team integration, replace the relevant exceptions with the team's custom exception classes from Member 4.
